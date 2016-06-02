package Back;

import Front.SimpleBaseListener;
import Front.SimpleParser;

import java.util.HashMap;
import java.util.Stack;

enum VarType {INT, REAL}

class Value {
    public String value;
    public VarType type;

    public Value(String value, VarType type) {
        this.value = value;
        this.type = type;
    }
}

public class LLVMactions extends SimpleBaseListener {

    HashMap<String, VarType> variables = new HashMap<>();
    Stack<Value> stack = new Stack<>();

    @Override
    public void exitAssign(SimpleParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if (!variables.containsKey(ID)) {
            variables.put(ID, v.type);
            if (v.type == VarType.INT) {
                LLVMGenerator.declare_i32(ID);
            }
            if (v.type == VarType.REAL) {
                LLVMGenerator.declare_double(ID);
            }
        }
        if (v.type == VarType.INT) {
            LLVMGenerator.assign_i32(ID, v.value);
        }
        if (v.type == VarType.REAL) {
            LLVMGenerator.assign_double(ID, v.value);
        }
    }

    @Override
    public void exitProg(SimpleParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitExid(SimpleParser.ExidContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.load_i32(ID);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), type));
            } else if (type == VarType.REAL) {
                LLVMGenerator.load_double(ID);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), type));
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override
    public void exitInt(SimpleParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT));
    }

    @Override
    public void exitReal(SimpleParser.RealContext ctx) {
        stack.push(new Value(ctx.REAL().getText(), VarType.REAL));
    }

    @Override
    public void exitAdd(SimpleParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.add_i32(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.add_double(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSub(SimpleParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.substract_i32(v2.value, v1.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.substract_double(v2.value, v1.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "substract type mismatch");
        }
    }

    @Override
    public void exitMult(SimpleParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.mult_i32(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.mult_double(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitDiv(SimpleParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.div_i32(v2.value, v1.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.div_double(v2.value, v1.value);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "div type mismatch");
        }
    }

    @Override
    public void exitToint(SimpleParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi(v.value);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
    }

    @Override
    public void exitToreal(SimpleParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp(v.value);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
    }

    @Override
    public void exitPrint(SimpleParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.printf_i32(ID);
            }
            if (type == VarType.REAL) {
                LLVMGenerator.printf_double(ID);
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override
    public void exitRead(SimpleParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.readInt32(ID);
            }
            if (type == VarType.REAL) {
                LLVMGenerator.readDouble(ID);
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }
}