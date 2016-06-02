package Back;

import Front.SimpleBaseListener;
import Front.SimpleParser;

import java.util.HashSet;
import java.util.Stack;

public class LLVMactions extends SimpleBaseListener {

    HashSet<String> variables = new HashSet<String>();
    Stack<String> stack = new Stack<String>();

    @Override
    public void exitAssign(SimpleParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.contains(ID)) {
            variables.add(ID);
            LLVMGenerator.declare(ID);
        }
        LLVMGenerator.assign(ID, stack.pop());
    }

    @Override
    public void exitProg(SimpleParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitValue(SimpleParser.ValueContext ctx) {
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if (variables.contains(ID)) {
                LLVMGenerator.load(ID);
                stack.push("%" + (LLVMGenerator.reg - 1));
            } else {
                error(ctx.getStart().getLine(), "unknown variable " + ID);
            }
        }
        if (ctx.INT() != null) {
            stack.push(ctx.INT().getText());
        }
    }

    @Override
    public void exitAdd(SimpleParser.AddContext ctx) {
        LLVMGenerator.add(stack.pop(), stack.pop());
        stack.push("%" + (LLVMGenerator.reg - 1));
    }

    @Override
    public void exitSingle(SimpleParser.SingleContext ctx) {
    }

    @Override
    public void exitWrite(SimpleParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        if (variables.contains(ID)) {
            LLVMGenerator.printf(ID);
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override
    public void exitRead(SimpleParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.contains(ID)) {
            variables.add(ID);
            LLVMGenerator.declare(ID);
        }
        LLVMGenerator.scanf(ID);
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }
}
