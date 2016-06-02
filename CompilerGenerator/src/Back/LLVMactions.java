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
        variables.put(ID, v.type);
        if (v.type == VarType.INT) {
            LLVMGenerator.declare_i32(ID);
            LLVMGenerator.assign_i32(ID, v.value);
        }
        if (v.type == VarType.REAL) {
            LLVMGenerator.declare_double(ID);
            LLVMGenerator.assign_double(ID, v.value);
        }
    }

    @Override
    public void exitProg(SimpleParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitValue(SimpleParser.ValueContext ctx) {
        if (ctx.ID() != null) {
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
        if (ctx.INT() != null) {
            stack.push(new Value(ctx.INT().getText(), VarType.INT));
        }
        if (ctx.REAL() != null) {
            stack.push(new Value(ctx.REAL().getText(), VarType.REAL));
        }
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
    public void exitSingle(SimpleParser.SingleContext ctx) {
    }

    @Override
    public void exitWrite(SimpleParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.printInt32(ID);
            }
            if (type == VarType.REAL) {
                LLVMGenerator.printDouble(ID);
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
