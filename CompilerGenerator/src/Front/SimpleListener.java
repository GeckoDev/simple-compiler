// Generated from /home/aleksander/_Repositories/simple-compiler/Grammar/src/Simple.g4 by ANTLR 4.5.1
package Front;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SimpleParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(SimpleParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link SimpleParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(SimpleParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by the {@code write}
     * labeled alternative in {@link SimpleParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterWrite(SimpleParser.WriteContext ctx);

    /**
     * Exit a parse tree produced by the {@code write}
     * labeled alternative in {@link SimpleParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitWrite(SimpleParser.WriteContext ctx);

    /**
     * Enter a parse tree produced by the {@code assign}
     * labeled alternative in {@link SimpleParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(SimpleParser.AssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code assign}
     * labeled alternative in {@link SimpleParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(SimpleParser.AssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code read}
     * labeled alternative in {@link SimpleParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterRead(SimpleParser.ReadContext ctx);

    /**
     * Exit a parse tree produced by the {@code read}
     * labeled alternative in {@link SimpleParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitRead(SimpleParser.ReadContext ctx);

    /**
     * Enter a parse tree produced by the {@code add}
     * labeled alternative in {@link SimpleParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAdd(SimpleParser.AddContext ctx);

    /**
     * Exit a parse tree produced by the {@code add}
     * labeled alternative in {@link SimpleParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAdd(SimpleParser.AddContext ctx);

    /**
     * Enter a parse tree produced by the {@code single}
     * labeled alternative in {@link SimpleParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterSingle(SimpleParser.SingleContext ctx);

    /**
     * Exit a parse tree produced by the {@code single}
     * labeled alternative in {@link SimpleParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitSingle(SimpleParser.SingleContext ctx);

    /**
     * Enter a parse tree produced by {@link SimpleParser#value}.
     *
     * @param ctx the parse tree
     */
    void enterValue(SimpleParser.ValueContext ctx);

    /**
     * Exit a parse tree produced by {@link SimpleParser#value}.
     *
     * @param ctx the parse tree
     */
    void exitValue(SimpleParser.ValueContext ctx);
}