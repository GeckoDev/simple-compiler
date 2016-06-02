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
		T__0=1, WRITE=2, READ=3, ID=4, REAL=5, INT=6, ADD=7, NEWLINE=8, WS=9, 
		COMMENT=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WRITE", "READ", "ID", "REAL", "INT", "ADD", "NEWLINE", "WS", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'write'", "'read'", null, null, null, "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WRITE", "READ", "ID", "REAL", "INT", "ADD", "NEWLINE", "WS", 
		"COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fP\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\6\5&\n\5\r"+
		"\5\16\5\'\3\6\6\6+\n\6\r\6\16\6,\3\6\3\6\6\6\61\n\6\r\6\16\6\62\3\7\6"+
		"\7\66\n\7\r\7\16\7\67\3\b\3\b\3\t\5\t=\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\7\13G\n\13\f\13\16\13J\13\13\3\13\5\13M\n\13\3\13\3\13\2\2\f\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17V\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\37\3\2\2\2\t%\3\2\2\2\13*\3\2\2\2"+
		"\r\65\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23@\3\2\2\2\25D\3\2\2\2\27\30\7"+
		"?\2\2\30\4\3\2\2\2\31\32\7y\2\2\32\33\7t\2\2\33\34\7k\2\2\34\35\7v\2\2"+
		"\35\36\7g\2\2\36\6\3\2\2\2\37 \7t\2\2 !\7g\2\2!\"\7c\2\2\"#\7f\2\2#\b"+
		"\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\n\3\2\2"+
		"\2)+\4\62;\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\7\60"+
		"\2\2/\61\4\62;\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\f\3\2\2\2\64\66\4\62;\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28\16\3\2\2\29:\7-\2\2:\20\3\2\2\2;=\7\17\2\2<;\3\2\2\2<=\3"+
		"\2\2\2=>\3\2\2\2>?\7\f\2\2?\22\3\2\2\2@A\t\3\2\2AB\3\2\2\2BC\b\n\2\2C"+
		"\24\3\2\2\2DH\7%\2\2EG\n\4\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2KM\5\21\t\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\13\2"+
		"\2O\26\3\2\2\2\n\2\',\62\67<HL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}