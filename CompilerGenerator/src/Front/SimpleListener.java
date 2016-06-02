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
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SimpleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SimpleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(SimpleParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(SimpleParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link SimpleParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(SimpleParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link SimpleParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(SimpleParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SimpleParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SimpleParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link SimpleParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSub(SimpleParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link SimpleParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSub(SimpleParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link SimpleParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(SimpleParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link SimpleParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(SimpleParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link SimpleParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(SimpleParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link SimpleParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(SimpleParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SimpleParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SimpleParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exid}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExid(SimpleParser.ExidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exid}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExid(SimpleParser.ExidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(SimpleParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(SimpleParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(SimpleParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(SimpleParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(SimpleParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(SimpleParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(SimpleParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(SimpleParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(SimpleParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link SimpleParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(SimpleParser.ParContext ctx);
}