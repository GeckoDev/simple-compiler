package Back;

import Front.*;

import java.util.HashSet;

public class LLVMactions extends SimpleBaseListener {

    HashSet<String> variables = new HashSet<String>();

    @Override
    public void exitAssign(SimpleParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (!variables.contains(ID)) {
            variables.add(ID);
            LLVMGenerator.declare(ID);
        }
        LLVMGenerator.assign(ID, INT);
    }

    @Override
    public void exitProg(SimpleParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitWrite(SimpleParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        if (variables.contains(ID)) {
            LLVMGenerator.printf(ID);
        } else {
            ctx.getStart().getLine();
            System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
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


}
