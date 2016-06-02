// Generated from /home/aleksander/_Repositories/simple-compiler/Grammar/src/Simple.g4 by ANTLR 4.5.1
package Front;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PRINT=4, READ=5, TOINT=6, TOREAL=7, ID=8, REAL=9, 
		INT=10, ADD=11, MULT=12, SUB=13, DIV=14, NEWLINE=15, WS=16, COMMENT=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "PRINT", "READ", "TOINT", "TOREAL", "ID", "REAL", 
		"INT", "ADD", "MULT", "SUB", "DIV", "NEWLINE", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'print'", "'read'", "'(int)'", "'(real)'", 
		null, null, null, "'+'", "'*'", "'-'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "PRINT", "READ", "TOINT", "TOREAL", "ID", "REAL", 
		"INT", "ADD", "MULT", "SUB", "DIV", "NEWLINE", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\tE\n\t\r\t\16"+
		"\tF\3\n\6\nJ\n\n\r\n\16\nK\3\n\3\n\6\nP\n\n\r\n\16\nQ\3\13\6\13U\n\13"+
		"\r\13\16\13V\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\5\20b\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\7\22l\n\22\f\22\16\22o\13\22\3\22"+
		"\5\22r\n\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2"+
		"\2\13\61\3\2\2\2\r\66\3\2\2\2\17<\3\2\2\2\21D\3\2\2\2\23I\3\2\2\2\25T"+
		"\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37a\3\2\2\2"+
		"!e\3\2\2\2#i\3\2\2\2%&\7?\2\2&\4\3\2\2\2\'(\7*\2\2(\6\3\2\2\2)*\7+\2\2"+
		"*\b\3\2\2\2+,\7r\2\2,-\7t\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\n\3\2\2"+
		"\2\61\62\7t\2\2\62\63\7g\2\2\63\64\7c\2\2\64\65\7f\2\2\65\f\3\2\2\2\66"+
		"\67\7*\2\2\678\7k\2\289\7p\2\29:\7v\2\2:;\7+\2\2;\16\3\2\2\2<=\7*\2\2"+
		"=>\7t\2\2>?\7g\2\2?@\7c\2\2@A\7n\2\2AB\7+\2\2B\20\3\2\2\2CE\t\2\2\2DC"+
		"\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\22\3\2\2\2HJ\4\62;\2IH\3\2\2\2"+
		"JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\7\60\2\2NP\4\62;\2ON\3\2\2"+
		"\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\24\3\2\2\2SU\4\62;\2TS\3\2\2\2UV\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2W\26\3\2\2\2XY\7-\2\2Y\30\3\2\2\2Z[\7,\2\2[\32"+
		"\3\2\2\2\\]\7/\2\2]\34\3\2\2\2^_\7\61\2\2_\36\3\2\2\2`b\7\17\2\2a`\3\2"+
		"\2\2ab\3\2\2\2bc\3\2\2\2cd\7\f\2\2d \3\2\2\2ef\t\3\2\2fg\3\2\2\2gh\b\21"+
		"\2\2h\"\3\2\2\2im\7%\2\2jl\n\4\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2pr\5\37\20\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b"+
		"\22\2\2t$\3\2\2\2\n\2FKQVamq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}