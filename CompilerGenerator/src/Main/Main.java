package Main; /**
 * Created by aleksander on 19.05.16.
 */

import Front.*;
import Back.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        SimpleLexer lexer = new SimpleLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(tokens);

        ParseTree tree = parser.prog();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMactions(), tree);

    }
}