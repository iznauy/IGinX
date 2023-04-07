// Generated from /Users/iznauy/研究生/IginX/antlr/src/main/antlr4/cn/edu/tsinghua/iginx/sql/Sql.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INSERT=2, DELETE=3, SELECT=4, SHOW=5, REPLICA=6, NUMBER=7, CLUSTER=8, 
		INFO=9, WHERE=10, IN=11, INTO=12, FROM=13, TIMESTAMP=14, GROUP=15, ORDER=16, 
		HAVING=17, AGG=18, LEVEL=19, BY=20, VALUE=21, VALUES=22, IOTDB=23, INFLUXDB=24, 
		NOW=25, TIME=26, KEY=27, TRUE=28, FALSE=29, NULL=30, LAST=31, FIRST_VALUE=32, 
		LAST_VALUE=33, MIN=34, MAX=35, AVG=36, COUNT=37, SUM=38, LIMIT=39, OFFSET=40, 
		DATA=41, ADD=42, STORAGEENGINE=43, POINTS=44, CLEAR=45, SERIES=46, DESC=47, 
		ASC=48, DROP=49, REGISTER=50, PYTHON=51, TASK=52, COMMIT=53, TRANSFORM=54, 
		JOB=55, STATUS=56, AS=57, UDAF=58, UDTF=59, UDSF=60, WITH=61, WITHOUT=62, 
		TAG=63, WITH_PRECISE=64, TIME_OFFSET=65, CANCEL=66, UNKNOWN=67, FINISHED=68, 
		CREATED=69, RUNNING=70, FAILING=71, FAILED=72, CLOSING=73, CLOSED=74, 
		INNER=75, OUTER=76, CROSS=77, NATURAL=78, LEFT=79, RIGHT=80, FULL=81, 
		JOIN=82, ON=83, USING=84, OVER=85, RANGE=86, STEP=87, REMOVE=88, HISTORYDATARESOURCE=89, 
		COMPACT=90, EXPLAIN=91, LOGICAL=92, PHYSICAL=93, EXISTS=94, SOME=95, ANY=96, 
		ALL=97, COMMA=98, STAR=99, OPERATOR_EQ=100, OPERATOR_GT=101, OPERATOR_GTE=102, 
		OPERATOR_LT=103, OPERATOR_LTE=104, OPERATOR_NEQ=105, OPERATOR_IN=106, 
		OPERATOR_LIKE=107, OPERATOR_AND=108, OPERATOR_OR=109, OPERATOR_NOT=110, 
		OPERATOR_CONTAINS=111, MINUS=112, PLUS=113, DIV=114, MOD=115, DOT=116, 
		LR_BRACKET=117, RR_BRACKET=118, LS_BRACKET=119, RS_BRACKET=120, L_BRACKET=121, 
		R_BRACKET=122, UNDERLINE=123, NaN=124, INF=125, INT=126, EXPONENT=127, 
		TIME_WITH_UNIT=128, DATETIME=129, ID=130, DOUBLE_QUOTE_STRING_LITERAL=131, 
		SINGLE_QUOTE_STRING_LITERAL=132, WS=133;
	public static final int
		RULE_sqlStatement = 0, RULE_statement = 1, RULE_queryClause = 2, RULE_selectClause = 3, 
		RULE_expression = 4, RULE_functionName = 5, RULE_whereClause = 6, RULE_orExpression = 7, 
		RULE_andExpression = 8, RULE_predicate = 9, RULE_predicateWithSubquery = 10, 
		RULE_quantifier = 11, RULE_all = 12, RULE_some = 13, RULE_withClause = 14, 
		RULE_orTagExpression = 15, RULE_andTagExpression = 16, RULE_tagExpression = 17, 
		RULE_orPreciseExpression = 18, RULE_andPreciseExpression = 19, RULE_preciseTagExpression = 20, 
		RULE_tagList = 21, RULE_tagEquation = 22, RULE_tagKey = 23, RULE_tagValue = 24, 
		RULE_fromClause = 25, RULE_joinPart = 26, RULE_tableReference = 27, RULE_subquery = 28, 
		RULE_colList = 29, RULE_join = 30, RULE_specialClause = 31, RULE_groupByClause = 32, 
		RULE_havingClause = 33, RULE_orderByClause = 34, RULE_downsampleWithLevelClause = 35, 
		RULE_downsampleClause = 36, RULE_aggLen = 37, RULE_aggregateWithLevelClause = 38, 
		RULE_asClause = 39, RULE_timeInterval = 40, RULE_limitClause = 41, RULE_offsetClause = 42, 
		RULE_comparisonOperator = 43, RULE_insertColumnsSpec = 44, RULE_insertPath = 45, 
		RULE_insertValuesSpec = 46, RULE_insertMultiValue = 47, RULE_storageEngineSpec = 48, 
		RULE_storageEngine = 49, RULE_timeValue = 50, RULE_path = 51, RULE_udfType = 52, 
		RULE_jobStatus = 53, RULE_nodeName = 54, RULE_valueNode = 55, RULE_keyWords = 56, 
		RULE_dateFormat = 57, RULE_constant = 58, RULE_booleanClause = 59, RULE_dateExpression = 60, 
		RULE_realLiteral = 61, RULE_removedStorageEngine = 62, RULE_stringLiteral = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlStatement", "statement", "queryClause", "selectClause", "expression", 
			"functionName", "whereClause", "orExpression", "andExpression", "predicate", 
			"predicateWithSubquery", "quantifier", "all", "some", "withClause", "orTagExpression", 
			"andTagExpression", "tagExpression", "orPreciseExpression", "andPreciseExpression", 
			"preciseTagExpression", "tagList", "tagEquation", "tagKey", "tagValue", 
			"fromClause", "joinPart", "tableReference", "subquery", "colList", "join", 
			"specialClause", "groupByClause", "havingClause", "orderByClause", "downsampleWithLevelClause", 
			"downsampleClause", "aggLen", "aggregateWithLevelClause", "asClause", 
			"timeInterval", "limitClause", "offsetClause", "comparisonOperator", 
			"insertColumnsSpec", "insertPath", "insertValuesSpec", "insertMultiValue", 
			"storageEngineSpec", "storageEngine", "timeValue", "path", "udfType", 
			"jobStatus", "nodeName", "valueNode", "keyWords", "dateFormat", "constant", 
			"booleanClause", "dateExpression", "realLiteral", "removedStorageEngine", 
			"stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "','", "'*'", null, "'>'", "'>='", "'<'", "'<='", null, null, 
			null, null, null, null, null, "'-'", "'+'", "'/'", "'%'", "'.'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'_'", "'NaN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INSERT", "DELETE", "SELECT", "SHOW", "REPLICA", "NUMBER", 
			"CLUSTER", "INFO", "WHERE", "IN", "INTO", "FROM", "TIMESTAMP", "GROUP", 
			"ORDER", "HAVING", "AGG", "LEVEL", "BY", "VALUE", "VALUES", "IOTDB", 
			"INFLUXDB", "NOW", "TIME", "KEY", "TRUE", "FALSE", "NULL", "LAST", "FIRST_VALUE", 
			"LAST_VALUE", "MIN", "MAX", "AVG", "COUNT", "SUM", "LIMIT", "OFFSET", 
			"DATA", "ADD", "STORAGEENGINE", "POINTS", "CLEAR", "SERIES", "DESC", 
			"ASC", "DROP", "REGISTER", "PYTHON", "TASK", "COMMIT", "TRANSFORM", "JOB", 
			"STATUS", "AS", "UDAF", "UDTF", "UDSF", "WITH", "WITHOUT", "TAG", "WITH_PRECISE", 
			"TIME_OFFSET", "CANCEL", "UNKNOWN", "FINISHED", "CREATED", "RUNNING", 
			"FAILING", "FAILED", "CLOSING", "CLOSED", "INNER", "OUTER", "CROSS", 
			"NATURAL", "LEFT", "RIGHT", "FULL", "JOIN", "ON", "USING", "OVER", "RANGE", 
			"STEP", "REMOVE", "HISTORYDATARESOURCE", "COMPACT", "EXPLAIN", "LOGICAL", 
			"PHYSICAL", "EXISTS", "SOME", "ANY", "ALL", "COMMA", "STAR", "OPERATOR_EQ", 
			"OPERATOR_GT", "OPERATOR_GTE", "OPERATOR_LT", "OPERATOR_LTE", "OPERATOR_NEQ", 
			"OPERATOR_IN", "OPERATOR_LIKE", "OPERATOR_AND", "OPERATOR_OR", "OPERATOR_NOT", 
			"OPERATOR_CONTAINS", "MINUS", "PLUS", "DIV", "MOD", "DOT", "LR_BRACKET", 
			"RR_BRACKET", "LS_BRACKET", "RS_BRACKET", "L_BRACKET", "R_BRACKET", "UNDERLINE", 
			"NaN", "INF", "INT", "EXPONENT", "TIME_WITH_UNIT", "DATETIME", "ID", 
			"DOUBLE_QUOTE_STRING_LITERAL", "SINGLE_QUOTE_STRING_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			statement();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(129);
				match(T__0);
				}
			}

			setState(132);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommitTransformJobStatementContext extends StatementContext {
		public StringLiteralContext filePath;
		public TerminalNode COMMIT() { return getToken(SqlParser.COMMIT, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlParser.TRANSFORM, 0); }
		public TerminalNode JOB() { return getToken(SqlParser.JOB, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public CommitTransformJobStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommitTransformJobStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommitTransformJobStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommitTransformJobStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowClusterInfoStatementContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlParser.CLUSTER, 0); }
		public TerminalNode INFO() { return getToken(SqlParser.INFO, 0); }
		public ShowClusterInfoStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShowClusterInfoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShowClusterInfoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShowClusterInfoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddStorageEngineStatementContext extends StatementContext {
		public TerminalNode ADD() { return getToken(SqlParser.ADD, 0); }
		public TerminalNode STORAGEENGINE() { return getToken(SqlParser.STORAGEENGINE, 0); }
		public StorageEngineSpecContext storageEngineSpec() {
			return getRuleContext(StorageEngineSpecContext.class,0);
		}
		public AddStorageEngineStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAddStorageEngineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAddStorageEngineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAddStorageEngineStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemoveHistoryDataResourceStatementContext extends StatementContext {
		public TerminalNode REMOVE() { return getToken(SqlParser.REMOVE, 0); }
		public TerminalNode HISTORYDATARESOURCE() { return getToken(SqlParser.HISTORYDATARESOURCE, 0); }
		public List<RemovedStorageEngineContext> removedStorageEngine() {
			return getRuleContexts(RemovedStorageEngineContext.class);
		}
		public RemovedStorageEngineContext removedStorageEngine(int i) {
			return getRuleContext(RemovedStorageEngineContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public RemoveHistoryDataResourceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRemoveHistoryDataResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRemoveHistoryDataResourceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRemoveHistoryDataResourceStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteTimeSeriesStatementContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlParser.DELETE, 0); }
		public TerminalNode TIME() { return getToken(SqlParser.TIME, 0); }
		public TerminalNode SERIES() { return getToken(SqlParser.SERIES, 0); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public DeleteTimeSeriesStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDeleteTimeSeriesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDeleteTimeSeriesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDeleteTimeSeriesStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CancelJobStatementContext extends StatementContext {
		public Token jobId;
		public TerminalNode CANCEL() { return getToken(SqlParser.CANCEL, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlParser.TRANSFORM, 0); }
		public TerminalNode JOB() { return getToken(SqlParser.JOB, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public CancelJobStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCancelJobStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCancelJobStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCancelJobStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowJobStatusStatementContext extends StatementContext {
		public Token jobId;
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlParser.TRANSFORM, 0); }
		public TerminalNode JOB() { return getToken(SqlParser.JOB, 0); }
		public TerminalNode STATUS() { return getToken(SqlParser.STATUS, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public ShowJobStatusStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShowJobStatusStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShowJobStatusStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShowJobStatusStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTimeSeriesStatementContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode TIME() { return getToken(SqlParser.TIME, 0); }
		public TerminalNode SERIES() { return getToken(SqlParser.SERIES, 0); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ShowTimeSeriesStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShowTimeSeriesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShowTimeSeriesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShowTimeSeriesStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowReplicationStatementContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode REPLICA() { return getToken(SqlParser.REPLICA, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public ShowReplicationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShowReplicationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShowReplicationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShowReplicationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteStatementContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public DeleteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountPointsStatementContext extends StatementContext {
		public TerminalNode COUNT() { return getToken(SqlParser.COUNT, 0); }
		public TerminalNode POINTS() { return getToken(SqlParser.POINTS, 0); }
		public CountPointsStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCountPointsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCountPointsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCountPointsStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactStatementContext extends StatementContext {
		public TerminalNode COMPACT() { return getToken(SqlParser.COMPACT, 0); }
		public CompactStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompactStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompactStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompactStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertStatementContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlParser.INTO, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public InsertColumnsSpecContext insertColumnsSpec() {
			return getRuleContext(InsertColumnsSpecContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SqlParser.VALUES, 0); }
		public InsertValuesSpecContext insertValuesSpec() {
			return getRuleContext(InsertValuesSpecContext.class,0);
		}
		public TagListContext tagList() {
			return getRuleContext(TagListContext.class,0);
		}
		public InsertStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRegisterTaskStatementContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode REGISTER() { return getToken(SqlParser.REGISTER, 0); }
		public TerminalNode PYTHON() { return getToken(SqlParser.PYTHON, 0); }
		public TerminalNode TASK() { return getToken(SqlParser.TASK, 0); }
		public ShowRegisterTaskStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShowRegisterTaskStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShowRegisterTaskStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShowRegisterTaskStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowEligibleJobStatementContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public JobStatusContext jobStatus() {
			return getRuleContext(JobStatusContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlParser.TRANSFORM, 0); }
		public TerminalNode JOB() { return getToken(SqlParser.JOB, 0); }
		public ShowEligibleJobStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShowEligibleJobStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShowEligibleJobStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShowEligibleJobStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearDataStatementContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlParser.CLEAR, 0); }
		public TerminalNode DATA() { return getToken(SqlParser.DATA, 0); }
		public ClearDataStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterClearDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitClearDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitClearDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTaskStatementContext extends StatementContext {
		public StringLiteralContext name;
		public TerminalNode DROP() { return getToken(SqlParser.DROP, 0); }
		public TerminalNode PYTHON() { return getToken(SqlParser.PYTHON, 0); }
		public TerminalNode TASK() { return getToken(SqlParser.TASK, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DropTaskStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDropTaskStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDropTaskStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDropTaskStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectStatementContext extends StatementContext {
		public QueryClauseContext queryClause() {
			return getRuleContext(QueryClauseContext.class,0);
		}
		public TerminalNode EXPLAIN() { return getToken(SqlParser.EXPLAIN, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlParser.LOGICAL, 0); }
		public TerminalNode PHYSICAL() { return getToken(SqlParser.PHYSICAL, 0); }
		public SelectStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegisterTaskStatementContext extends StatementContext {
		public StringLiteralContext className;
		public StringLiteralContext filePath;
		public StringLiteralContext name;
		public TerminalNode REGISTER() { return getToken(SqlParser.REGISTER, 0); }
		public UdfTypeContext udfType() {
			return getRuleContext(UdfTypeContext.class,0);
		}
		public TerminalNode PYTHON() { return getToken(SqlParser.PYTHON, 0); }
		public TerminalNode TASK() { return getToken(SqlParser.TASK, 0); }
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public RegisterTaskStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRegisterTaskStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRegisterTaskStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRegisterTaskStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new InsertStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(INSERT);
				setState(135);
				match(INTO);
				setState(136);
				path();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LS_BRACKET) {
					{
					setState(137);
					tagList();
					}
				}

				setState(140);
				insertColumnsSpec();
				setState(141);
				match(VALUES);
				setState(142);
				insertValuesSpec();
				}
				break;
			case 2:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(DELETE);
				setState(145);
				match(FROM);
				setState(146);
				path();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					path();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(154);
					whereClause();
					}
				}

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (WITH - 61)) | (1L << (WITHOUT - 61)) | (1L << (WITH_PRECISE - 61)))) != 0)) {
					{
					setState(157);
					withClause();
					}
				}

				}
				break;
			case 3:
				_localctx = new SelectStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPLAIN) {
					{
					setState(160);
					match(EXPLAIN);
					}
				}

				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOGICAL || _la==PHYSICAL) {
					{
					setState(163);
					_la = _input.LA(1);
					if ( !(_la==LOGICAL || _la==PHYSICAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(166);
				queryClause();
				}
				break;
			case 4:
				_localctx = new CountPointsStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(COUNT);
				setState(168);
				match(POINTS);
				}
				break;
			case 5:
				_localctx = new DeleteTimeSeriesStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(DELETE);
				setState(170);
				match(TIME);
				setState(171);
				match(SERIES);
				setState(172);
				path();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					path();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (WITH - 61)) | (1L << (WITHOUT - 61)) | (1L << (WITH_PRECISE - 61)))) != 0)) {
					{
					setState(180);
					withClause();
					}
				}

				}
				break;
			case 6:
				_localctx = new ClearDataStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(CLEAR);
				setState(184);
				match(DATA);
				}
				break;
			case 7:
				_localctx = new ShowTimeSeriesStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(SHOW);
				setState(186);
				match(TIME);
				setState(187);
				match(SERIES);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(188);
					path();
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(189);
						match(COMMA);
						setState(190);
						path();
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (WITH - 61)) | (1L << (WITHOUT - 61)) | (1L << (WITH_PRECISE - 61)))) != 0)) {
					{
					setState(198);
					withClause();
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT || _la==OFFSET) {
					{
					setState(201);
					limitClause();
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowReplicationStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(SHOW);
				setState(205);
				match(REPLICA);
				setState(206);
				match(NUMBER);
				}
				break;
			case 9:
				_localctx = new AddStorageEngineStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(207);
				match(ADD);
				setState(208);
				match(STORAGEENGINE);
				setState(209);
				storageEngineSpec();
				}
				break;
			case 10:
				_localctx = new ShowClusterInfoStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(210);
				match(SHOW);
				setState(211);
				match(CLUSTER);
				setState(212);
				match(INFO);
				}
				break;
			case 11:
				_localctx = new ShowRegisterTaskStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(213);
				match(SHOW);
				setState(214);
				match(REGISTER);
				setState(215);
				match(PYTHON);
				setState(216);
				match(TASK);
				}
				break;
			case 12:
				_localctx = new RegisterTaskStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(217);
				match(REGISTER);
				setState(218);
				udfType();
				setState(219);
				match(PYTHON);
				setState(220);
				match(TASK);
				setState(221);
				((RegisterTaskStatementContext)_localctx).className = stringLiteral();
				setState(222);
				match(IN);
				setState(223);
				((RegisterTaskStatementContext)_localctx).filePath = stringLiteral();
				setState(224);
				match(AS);
				setState(225);
				((RegisterTaskStatementContext)_localctx).name = stringLiteral();
				}
				break;
			case 13:
				_localctx = new DropTaskStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(227);
				match(DROP);
				setState(228);
				match(PYTHON);
				setState(229);
				match(TASK);
				setState(230);
				((DropTaskStatementContext)_localctx).name = stringLiteral();
				}
				break;
			case 14:
				_localctx = new CommitTransformJobStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(231);
				match(COMMIT);
				setState(232);
				match(TRANSFORM);
				setState(233);
				match(JOB);
				setState(234);
				((CommitTransformJobStatementContext)_localctx).filePath = stringLiteral();
				}
				break;
			case 15:
				_localctx = new ShowJobStatusStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(235);
				match(SHOW);
				setState(236);
				match(TRANSFORM);
				setState(237);
				match(JOB);
				setState(238);
				match(STATUS);
				setState(239);
				((ShowJobStatusStatementContext)_localctx).jobId = match(INT);
				}
				break;
			case 16:
				_localctx = new CancelJobStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(240);
				match(CANCEL);
				setState(241);
				match(TRANSFORM);
				setState(242);
				match(JOB);
				setState(243);
				((CancelJobStatementContext)_localctx).jobId = match(INT);
				}
				break;
			case 17:
				_localctx = new ShowEligibleJobStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(244);
				match(SHOW);
				setState(245);
				jobStatus();
				setState(246);
				match(TRANSFORM);
				setState(247);
				match(JOB);
				}
				break;
			case 18:
				_localctx = new RemoveHistoryDataResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(249);
				match(REMOVE);
				setState(250);
				match(HISTORYDATARESOURCE);
				setState(251);
				removedStorageEngine();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					removedStorageEngine();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 19:
				_localctx = new CompactStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(259);
				match(COMPACT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryClauseContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SpecialClauseContext specialClause() {
			return getRuleContext(SpecialClauseContext.class,0);
		}
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public QueryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQueryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQueryClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQueryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryClauseContext queryClause() throws RecognitionException {
		QueryClauseContext _localctx = new QueryClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_queryClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			selectClause();
			setState(263);
			fromClause();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(264);
				whereClause();
				}
			}

			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (WITH - 61)) | (1L << (WITHOUT - 61)) | (1L << (WITH_PRECISE - 61)))) != 0)) {
				{
				setState(267);
				withClause();
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROUP) | (1L << ORDER) | (1L << AGG) | (1L << LIMIT) | (1L << OFFSET))) != 0) || _la==OVER) {
				{
				setState(270);
				specialClause();
				}
			}

			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(273);
				asClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(SELECT);
			setState(277);
			expression(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				expression(0);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext leftExpr;
		public ExpressionContext inBracketExpr;
		public ExpressionContext expr;
		public ExpressionContext rightExpr;
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(286);
				match(LR_BRACKET);
				setState(287);
				((ExpressionContext)_localctx).inBracketExpr = expression(0);
				setState(288);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(290);
				constant();
				}
				break;
			case 3:
				{
				setState(291);
				functionName();
				setState(292);
				match(LR_BRACKET);
				setState(293);
				path();
				setState(294);
				match(RR_BRACKET);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(295);
					asClause();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(298);
				path();
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(299);
					asClause();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				((ExpressionContext)_localctx).expr = expression(4);
				}
				break;
			case 6:
				{
				setState(304);
				subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(308);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (STAR - 99)) | (1L << (DIV - 99)) | (1L << (MOD - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						((ExpressionContext)_localctx).rightExpr = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						((ExpressionContext)_localctx).rightExpr = expression(3);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public TerminalNode LAST() { return getToken(SqlParser.LAST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlParser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlParser.LAST_VALUE, 0); }
		public TerminalNode MIN() { return getToken(SqlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SqlParser.MAX, 0); }
		public TerminalNode AVG() { return getToken(SqlParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(SqlParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(SqlParser.SUM, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LAST) | (1L << FIRST_VALUE) | (1L << LAST_VALUE) | (1L << MIN) | (1L << MAX) | (1L << AVG) | (1L << COUNT) | (1L << SUM))) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(WHERE);
			setState(321);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_OR() { return getTokens(SqlParser.OPERATOR_OR); }
		public TerminalNode OPERATOR_OR(int i) {
			return getToken(SqlParser.OPERATOR_OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			andExpression();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_OR) {
				{
				{
				setState(324);
				match(OPERATOR_OR);
				setState(325);
				andExpression();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> OPERATOR_AND() { return getTokens(SqlParser.OPERATOR_AND); }
		public TerminalNode OPERATOR_AND(int i) {
			return getToken(SqlParser.OPERATOR_AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			predicate();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_AND) {
				{
				{
				setState(332);
				match(OPERATOR_AND);
				setState(333);
				predicate();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public StringLiteralContext regex;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode OPERATOR_LIKE() { return getToken(SqlParser.OPERATOR_LIKE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode OPERATOR_NOT() { return getToken(SqlParser.OPERATOR_NOT, 0); }
		public PredicateWithSubqueryContext predicateWithSubquery() {
			return getRuleContext(PredicateWithSubqueryContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicate);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(339);
					match(KEY);
					}
					break;
				case 2:
					{
					setState(340);
					path();
					}
					break;
				case 3:
					{
					setState(341);
					functionName();
					setState(342);
					match(LR_BRACKET);
					setState(343);
					path();
					setState(344);
					match(RR_BRACKET);
					}
					break;
				}
				setState(348);
				comparisonOperator();
				setState(349);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				constant();
				setState(352);
				comparisonOperator();
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(353);
					match(KEY);
					}
					break;
				case 2:
					{
					setState(354);
					path();
					}
					break;
				case 3:
					{
					setState(355);
					functionName();
					setState(356);
					match(LR_BRACKET);
					setState(357);
					path();
					setState(358);
					match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				path();
				setState(363);
				comparisonOperator();
				setState(364);
				path();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				path();
				setState(367);
				match(OPERATOR_LIKE);
				setState(368);
				((PredicateContext)_localctx).regex = stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR_NOT) {
					{
					setState(370);
					match(OPERATOR_NOT);
					}
				}

				setState(373);
				match(LR_BRACKET);
				setState(374);
				orExpression();
				setState(375);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				predicateWithSubquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateWithSubqueryContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(SqlParser.EXISTS, 0); }
		public List<SubqueryContext> subquery() {
			return getRuleContexts(SubqueryContext.class);
		}
		public SubqueryContext subquery(int i) {
			return getRuleContext(SubqueryContext.class,i);
		}
		public TerminalNode OPERATOR_NOT() { return getToken(SqlParser.OPERATOR_NOT, 0); }
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public PredicateWithSubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateWithSubquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPredicateWithSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPredicateWithSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPredicateWithSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateWithSubqueryContext predicateWithSubquery() throws RecognitionException {
		PredicateWithSubqueryContext _localctx = new PredicateWithSubqueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_predicateWithSubquery);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR_NOT) {
					{
					setState(380);
					match(OPERATOR_NOT);
					}
				}

				setState(383);
				match(EXISTS);
				setState(384);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(385);
					path();
					}
					break;
				case 2:
					{
					setState(386);
					constant();
					}
					break;
				case 3:
					{
					setState(387);
					functionName();
					setState(388);
					match(LR_BRACKET);
					setState(389);
					path();
					setState(390);
					match(RR_BRACKET);
					}
					break;
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR_NOT) {
					{
					setState(394);
					match(OPERATOR_NOT);
					}
				}

				setState(397);
				match(IN);
				setState(398);
				subquery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(400);
					path();
					}
					break;
				case 2:
					{
					setState(401);
					constant();
					}
					break;
				case 3:
					{
					setState(402);
					functionName();
					setState(403);
					match(LR_BRACKET);
					setState(404);
					path();
					setState(405);
					match(RR_BRACKET);
					}
					break;
				}
				setState(409);
				comparisonOperator();
				setState(410);
				quantifier();
				setState(411);
				subquery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(413);
					path();
					}
					break;
				case 2:
					{
					setState(414);
					constant();
					}
					break;
				case 3:
					{
					setState(415);
					functionName();
					setState(416);
					match(LR_BRACKET);
					setState(417);
					path();
					setState(418);
					match(RR_BRACKET);
					}
					break;
				}
				setState(422);
				comparisonOperator();
				setState(423);
				subquery();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				subquery();
				setState(426);
				comparisonOperator();
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(427);
					path();
					}
					break;
				case 2:
					{
					setState(428);
					constant();
					}
					break;
				case 3:
					{
					setState(429);
					functionName();
					setState(430);
					match(LR_BRACKET);
					setState(431);
					path();
					setState(432);
					match(RR_BRACKET);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				subquery();
				setState(437);
				comparisonOperator();
				setState(438);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public SomeContext some() {
			return getRuleContext(SomeContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantifier);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				all();
				}
				break;
			case SOME:
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				some();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlParser.ALL, 0); }
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomeContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(SqlParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlParser.ANY, 0); }
		public SomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeContext some() throws RecognitionException {
		SomeContext _localctx = new SomeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_some);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==SOME || _la==ANY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlParser.WITH, 0); }
		public OrTagExpressionContext orTagExpression() {
			return getRuleContext(OrTagExpressionContext.class,0);
		}
		public TerminalNode WITH_PRECISE() { return getToken(SqlParser.WITH_PRECISE, 0); }
		public OrPreciseExpressionContext orPreciseExpression() {
			return getRuleContext(OrPreciseExpressionContext.class,0);
		}
		public TerminalNode WITHOUT() { return getToken(SqlParser.WITHOUT, 0); }
		public TerminalNode TAG() { return getToken(SqlParser.TAG, 0); }
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_withClause);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(WITH);
				setState(451);
				orTagExpression();
				}
				break;
			case WITH_PRECISE:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(WITH_PRECISE);
				setState(453);
				orPreciseExpression();
				}
				break;
			case WITHOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(WITHOUT);
				setState(455);
				match(TAG);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrTagExpressionContext extends ParserRuleContext {
		public List<AndTagExpressionContext> andTagExpression() {
			return getRuleContexts(AndTagExpressionContext.class);
		}
		public AndTagExpressionContext andTagExpression(int i) {
			return getRuleContext(AndTagExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_OR() { return getTokens(SqlParser.OPERATOR_OR); }
		public TerminalNode OPERATOR_OR(int i) {
			return getToken(SqlParser.OPERATOR_OR, i);
		}
		public OrTagExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orTagExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrTagExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrTagExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrTagExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrTagExpressionContext orTagExpression() throws RecognitionException {
		OrTagExpressionContext _localctx = new OrTagExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orTagExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			andTagExpression();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_OR) {
				{
				{
				setState(459);
				match(OPERATOR_OR);
				setState(460);
				andTagExpression();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndTagExpressionContext extends ParserRuleContext {
		public List<TagExpressionContext> tagExpression() {
			return getRuleContexts(TagExpressionContext.class);
		}
		public TagExpressionContext tagExpression(int i) {
			return getRuleContext(TagExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_AND() { return getTokens(SqlParser.OPERATOR_AND); }
		public TerminalNode OPERATOR_AND(int i) {
			return getToken(SqlParser.OPERATOR_AND, i);
		}
		public AndTagExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andTagExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAndTagExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAndTagExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAndTagExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndTagExpressionContext andTagExpression() throws RecognitionException {
		AndTagExpressionContext _localctx = new AndTagExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_andTagExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			tagExpression();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_AND) {
				{
				{
				setState(467);
				match(OPERATOR_AND);
				setState(468);
				tagExpression();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagExpressionContext extends ParserRuleContext {
		public TagKeyContext tagKey() {
			return getRuleContext(TagKeyContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(SqlParser.OPERATOR_EQ, 0); }
		public TagValueContext tagValue() {
			return getRuleContext(TagValueContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public OrTagExpressionContext orTagExpression() {
			return getRuleContext(OrTagExpressionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TagExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTagExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTagExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTagExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagExpressionContext tagExpression() throws RecognitionException {
		TagExpressionContext _localctx = new TagExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tagExpression);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				tagKey();
				setState(475);
				match(OPERATOR_EQ);
				setState(476);
				tagValue();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(LR_BRACKET);
				setState(479);
				orTagExpression();
				setState(480);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrPreciseExpressionContext extends ParserRuleContext {
		public List<AndPreciseExpressionContext> andPreciseExpression() {
			return getRuleContexts(AndPreciseExpressionContext.class);
		}
		public AndPreciseExpressionContext andPreciseExpression(int i) {
			return getRuleContext(AndPreciseExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_OR() { return getTokens(SqlParser.OPERATOR_OR); }
		public TerminalNode OPERATOR_OR(int i) {
			return getToken(SqlParser.OPERATOR_OR, i);
		}
		public OrPreciseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orPreciseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrPreciseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrPreciseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrPreciseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrPreciseExpressionContext orPreciseExpression() throws RecognitionException {
		OrPreciseExpressionContext _localctx = new OrPreciseExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_orPreciseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			andPreciseExpression();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_OR) {
				{
				{
				setState(485);
				match(OPERATOR_OR);
				setState(486);
				andPreciseExpression();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndPreciseExpressionContext extends ParserRuleContext {
		public List<PreciseTagExpressionContext> preciseTagExpression() {
			return getRuleContexts(PreciseTagExpressionContext.class);
		}
		public PreciseTagExpressionContext preciseTagExpression(int i) {
			return getRuleContext(PreciseTagExpressionContext.class,i);
		}
		public List<TerminalNode> OPERATOR_AND() { return getTokens(SqlParser.OPERATOR_AND); }
		public TerminalNode OPERATOR_AND(int i) {
			return getToken(SqlParser.OPERATOR_AND, i);
		}
		public AndPreciseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andPreciseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAndPreciseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAndPreciseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAndPreciseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndPreciseExpressionContext andPreciseExpression() throws RecognitionException {
		AndPreciseExpressionContext _localctx = new AndPreciseExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_andPreciseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			preciseTagExpression();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR_AND) {
				{
				{
				setState(493);
				match(OPERATOR_AND);
				setState(494);
				preciseTagExpression();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreciseTagExpressionContext extends ParserRuleContext {
		public TagKeyContext tagKey() {
			return getRuleContext(TagKeyContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(SqlParser.OPERATOR_EQ, 0); }
		public TagValueContext tagValue() {
			return getRuleContext(TagValueContext.class,0);
		}
		public PreciseTagExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preciseTagExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPreciseTagExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPreciseTagExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPreciseTagExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreciseTagExpressionContext preciseTagExpression() throws RecognitionException {
		PreciseTagExpressionContext _localctx = new PreciseTagExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_preciseTagExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			tagKey();
			setState(501);
			match(OPERATOR_EQ);
			setState(502);
			tagValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagListContext extends ParserRuleContext {
		public TerminalNode LS_BRACKET() { return getToken(SqlParser.LS_BRACKET, 0); }
		public List<TagEquationContext> tagEquation() {
			return getRuleContexts(TagEquationContext.class);
		}
		public TagEquationContext tagEquation(int i) {
			return getRuleContext(TagEquationContext.class,i);
		}
		public TerminalNode RS_BRACKET() { return getToken(SqlParser.RS_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TagListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTagList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTagList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTagList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagListContext tagList() throws RecognitionException {
		TagListContext _localctx = new TagListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tagList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(LS_BRACKET);
			setState(505);
			tagEquation();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(506);
				match(COMMA);
				setState(507);
				tagEquation();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(RS_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagEquationContext extends ParserRuleContext {
		public TagKeyContext tagKey() {
			return getRuleContext(TagKeyContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(SqlParser.OPERATOR_EQ, 0); }
		public TagValueContext tagValue() {
			return getRuleContext(TagValueContext.class,0);
		}
		public TagEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTagEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTagEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTagEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagEquationContext tagEquation() throws RecognitionException {
		TagEquationContext _localctx = new TagEquationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tagEquation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			tagKey();
			setState(516);
			match(OPERATOR_EQ);
			setState(517);
			tagValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagKeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public TagKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTagKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTagKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTagKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagKeyContext tagKey() throws RecognitionException {
		TagKeyContext _localctx = new TagKeyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tagKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TagValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTagValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTagValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTagValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagValueContext tagValue() throws RecognitionException {
		TagValueContext _localctx = new TagValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tagValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public List<JoinPartContext> joinPart() {
			return getRuleContexts(JoinPartContext.class);
		}
		public JoinPartContext joinPart(int i) {
			return getRuleContext(JoinPartContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(FROM);
			setState(524);
			tableReference();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (INNER - 75)) | (1L << (CROSS - 75)) | (1L << (NATURAL - 75)) | (1L << (LEFT - 75)) | (1L << (RIGHT - 75)) | (1L << (FULL - 75)) | (1L << (JOIN - 75)) | (1L << (COMMA - 75)))) != 0)) {
				{
				{
				setState(525);
				joinPart();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinPartContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(SqlParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlParser.USING, 0); }
		public ColListContext colList() {
			return getRuleContext(ColListContext.class,0);
		}
		public JoinPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoinPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoinPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoinPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinPartContext joinPart() throws RecognitionException {
		JoinPartContext _localctx = new JoinPartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_joinPart);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(COMMA);
				setState(532);
				tableReference();
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(CROSS);
				setState(534);
				match(JOIN);
				setState(535);
				tableReference();
				}
				break;
			case INNER:
			case NATURAL:
			case LEFT:
			case RIGHT:
			case FULL:
			case JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				join();
				setState(537);
				tableReference();
				setState(542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(538);
					match(ON);
					setState(539);
					orExpression();
					}
					break;
				case USING:
					{
					setState(540);
					match(USING);
					setState(541);
					colList();
					}
					break;
				case EOF:
				case T__0:
				case WHERE:
				case GROUP:
				case ORDER:
				case AGG:
				case LIMIT:
				case OFFSET:
				case AS:
				case WITH:
				case WITHOUT:
				case WITH_PRECISE:
				case INNER:
				case CROSS:
				case NATURAL:
				case LEFT:
				case RIGHT:
				case FULL:
				case JOIN:
				case OVER:
				case COMMA:
				case RR_BRACKET:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableReference);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
			case DELETE:
			case SELECT:
			case SHOW:
			case REPLICA:
			case WHERE:
			case INTO:
			case FROM:
			case TIMESTAMP:
			case GROUP:
			case ORDER:
			case HAVING:
			case AGG:
			case LEVEL:
			case BY:
			case VALUE:
			case VALUES:
			case IOTDB:
			case INFLUXDB:
			case NOW:
			case TIME:
			case KEY:
			case TRUE:
			case FALSE:
			case NULL:
			case LAST:
			case FIRST_VALUE:
			case LAST_VALUE:
			case MIN:
			case MAX:
			case AVG:
			case COUNT:
			case SUM:
			case LIMIT:
			case OFFSET:
			case DATA:
			case ADD:
			case STORAGEENGINE:
			case POINTS:
			case CLEAR:
			case SERIES:
			case DESC:
			case ASC:
			case DROP:
			case REGISTER:
			case PYTHON:
			case TASK:
			case COMMIT:
			case TRANSFORM:
			case JOB:
			case STATUS:
			case AS:
			case UDAF:
			case UDTF:
			case UDSF:
			case WITH:
			case WITHOUT:
			case TAG:
			case WITH_PRECISE:
			case TIME_OFFSET:
			case CANCEL:
			case UNKNOWN:
			case FINISHED:
			case CREATED:
			case RUNNING:
			case FAILING:
			case FAILED:
			case CLOSING:
			case CLOSED:
			case INNER:
			case OUTER:
			case CROSS:
			case NATURAL:
			case LEFT:
			case RIGHT:
			case FULL:
			case JOIN:
			case ON:
			case USING:
			case OVER:
			case RANGE:
			case STEP:
			case REMOVE:
			case HISTORYDATARESOURCE:
			case COMPACT:
			case EXPLAIN:
			case LOGICAL:
			case PHYSICAL:
			case STAR:
			case MINUS:
			case INT:
			case EXPONENT:
			case TIME_WITH_UNIT:
			case DATETIME:
			case ID:
			case DOUBLE_QUOTE_STRING_LITERAL:
			case SINGLE_QUOTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				path();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public QueryClauseContext queryClause() {
			return getRuleContext(QueryClauseContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LR_BRACKET);
			setState(551);
			queryClause();
			setState(552);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColListContext extends ParserRuleContext {
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ColListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColListContext colList() throws RecognitionException {
		ColListContext _localctx = new ColListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_colList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			path();
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(COMMA);
					setState(556);
					path();
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(SqlParser.NATURAL, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(562);
					match(INNER);
					}
				}

				setState(565);
				match(JOIN);
				}
				break;
			case LEFT:
			case RIGHT:
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT - 79)) | (1L << (RIGHT - 79)) | (1L << (FULL - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(567);
					match(OUTER);
					}
				}

				setState(570);
				match(JOIN);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				match(NATURAL);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(572);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(573);
						match(OUTER);
						}
					}

					}
				}

				setState(578);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialClauseContext extends ParserRuleContext {
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public AggregateWithLevelClauseContext aggregateWithLevelClause() {
			return getRuleContext(AggregateWithLevelClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public DownsampleWithLevelClauseContext downsampleWithLevelClause() {
			return getRuleContext(DownsampleWithLevelClauseContext.class,0);
		}
		public DownsampleClauseContext downsampleClause() {
			return getRuleContext(DownsampleClauseContext.class,0);
		}
		public SpecialClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSpecialClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSpecialClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSpecialClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialClauseContext specialClause() throws RecognitionException {
		SpecialClauseContext _localctx = new SpecialClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_specialClause);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				limitClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				aggregateWithLevelClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				groupByClause();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(584);
					havingClause();
					}
				}

				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(587);
					orderByClause();
					}
				}

				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT || _la==OFFSET) {
					{
					setState(590);
					limitClause();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				downsampleWithLevelClause();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT || _la==OFFSET) {
					{
					setState(594);
					limitClause();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(597);
				downsampleClause();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT || _la==OFFSET) {
					{
					setState(598);
					limitClause();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
				orderByClause();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT || _la==OFFSET) {
					{
					setState(602);
					limitClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(GROUP);
			setState(608);
			match(BY);
			setState(609);
			path();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(610);
				match(COMMA);
				setState(611);
				path();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlParser.HAVING, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(HAVING);
			setState(618);
			orExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode DESC() { return getToken(SqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SqlParser.ASC, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(ORDER);
			setState(621);
			match(BY);
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(622);
				match(KEY);
				}
				break;
			case 2:
				{
				setState(623);
				path();
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(626);
				match(COMMA);
				setState(627);
				path();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC || _la==ASC) {
				{
				setState(633);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==ASC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DownsampleWithLevelClauseContext extends ParserRuleContext {
		public DownsampleClauseContext downsampleClause() {
			return getRuleContext(DownsampleClauseContext.class,0);
		}
		public AggregateWithLevelClauseContext aggregateWithLevelClause() {
			return getRuleContext(AggregateWithLevelClauseContext.class,0);
		}
		public DownsampleWithLevelClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_downsampleWithLevelClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDownsampleWithLevelClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDownsampleWithLevelClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDownsampleWithLevelClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DownsampleWithLevelClauseContext downsampleWithLevelClause() throws RecognitionException {
		DownsampleWithLevelClauseContext _localctx = new DownsampleWithLevelClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_downsampleWithLevelClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			downsampleClause();
			setState(637);
			aggregateWithLevelClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DownsampleClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(SqlParser.OVER, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RANGE() { return getToken(SqlParser.RANGE, 0); }
		public List<AggLenContext> aggLen() {
			return getRuleContexts(AggLenContext.class);
		}
		public AggLenContext aggLen(int i) {
			return getRuleContext(AggLenContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TimeIntervalContext timeInterval() {
			return getRuleContext(TimeIntervalContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode STEP() { return getToken(SqlParser.STEP, 0); }
		public DownsampleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_downsampleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDownsampleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDownsampleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDownsampleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DownsampleClauseContext downsampleClause() throws RecognitionException {
		DownsampleClauseContext _localctx = new DownsampleClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_downsampleClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(OVER);
			setState(640);
			match(LR_BRACKET);
			setState(641);
			match(RANGE);
			setState(642);
			aggLen();
			setState(643);
			match(IN);
			setState(644);
			timeInterval();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(645);
				match(STEP);
				setState(646);
				aggLen();
				}
			}

			setState(649);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggLenContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_UNIT() { return getToken(SqlParser.TIME_WITH_UNIT, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public AggLenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggLen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAggLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAggLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAggLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggLenContext aggLen() throws RecognitionException {
		AggLenContext _localctx = new AggLenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aggLen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==TIME_WITH_UNIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateWithLevelClauseContext extends ParserRuleContext {
		public TerminalNode AGG() { return getToken(SqlParser.AGG, 0); }
		public TerminalNode LEVEL() { return getToken(SqlParser.LEVEL, 0); }
		public TerminalNode OPERATOR_EQ() { return getToken(SqlParser.OPERATOR_EQ, 0); }
		public List<TerminalNode> INT() { return getTokens(SqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SqlParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public AggregateWithLevelClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateWithLevelClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAggregateWithLevelClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAggregateWithLevelClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAggregateWithLevelClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateWithLevelClauseContext aggregateWithLevelClause() throws RecognitionException {
		AggregateWithLevelClauseContext _localctx = new AggregateWithLevelClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_aggregateWithLevelClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(AGG);
			setState(654);
			match(LEVEL);
			setState(655);
			match(OPERATOR_EQ);
			setState(656);
			match(INT);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(657);
				match(COMMA);
				setState(658);
				match(INT);
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public AsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsClauseContext asClause() throws RecognitionException {
		AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_asClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(AS);
			setState(665);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeIntervalContext extends ParserRuleContext {
		public TimeValueContext startTime;
		public TimeValueContext endTime;
		public TerminalNode LS_BRACKET() { return getToken(SqlParser.LS_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<TimeValueContext> timeValue() {
			return getRuleContexts(TimeValueContext.class);
		}
		public TimeValueContext timeValue(int i) {
			return getRuleContext(TimeValueContext.class,i);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RS_BRACKET() { return getToken(SqlParser.RS_BRACKET, 0); }
		public TimeIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTimeInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTimeInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTimeInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeIntervalContext timeInterval() throws RecognitionException {
		TimeIntervalContext _localctx = new TimeIntervalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_timeInterval);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(LS_BRACKET);
				setState(668);
				((TimeIntervalContext)_localctx).startTime = timeValue();
				setState(669);
				match(COMMA);
				setState(670);
				((TimeIntervalContext)_localctx).endTime = timeValue();
				setState(671);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(LR_BRACKET);
				setState(674);
				((TimeIntervalContext)_localctx).startTime = timeValue();
				setState(675);
				match(COMMA);
				setState(676);
				((TimeIntervalContext)_localctx).endTime = timeValue();
				setState(677);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				match(LS_BRACKET);
				setState(680);
				((TimeIntervalContext)_localctx).startTime = timeValue();
				setState(681);
				match(COMMA);
				setState(682);
				((TimeIntervalContext)_localctx).endTime = timeValue();
				setState(683);
				match(RS_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				match(LR_BRACKET);
				setState(686);
				((TimeIntervalContext)_localctx).startTime = timeValue();
				setState(687);
				match(COMMA);
				setState(688);
				((TimeIntervalContext)_localctx).endTime = timeValue();
				setState(689);
				match(RS_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SqlParser.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(SqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SqlParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_limitClause);
		int _la;
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(LIMIT);
				setState(694);
				match(INT);
				setState(695);
				match(COMMA);
				setState(696);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(LIMIT);
				setState(698);
				match(INT);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(699);
					offsetClause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(702);
					offsetClause();
					}
				}

				setState(705);
				match(LIMIT);
				setState(706);
				match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SqlParser.OFFSET, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(OFFSET);
			setState(710);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public Token type;
		public TerminalNode OPERATOR_GT() { return getToken(SqlParser.OPERATOR_GT, 0); }
		public TerminalNode OPERATOR_GTE() { return getToken(SqlParser.OPERATOR_GTE, 0); }
		public TerminalNode OPERATOR_LT() { return getToken(SqlParser.OPERATOR_LT, 0); }
		public TerminalNode OPERATOR_LTE() { return getToken(SqlParser.OPERATOR_LTE, 0); }
		public TerminalNode OPERATOR_EQ() { return getToken(SqlParser.OPERATOR_EQ, 0); }
		public TerminalNode OPERATOR_NEQ() { return getToken(SqlParser.OPERATOR_NEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comparisonOperator);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERATOR_GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				((ComparisonOperatorContext)_localctx).type = match(OPERATOR_GT);
				}
				break;
			case OPERATOR_GTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				((ComparisonOperatorContext)_localctx).type = match(OPERATOR_GTE);
				}
				break;
			case OPERATOR_LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				((ComparisonOperatorContext)_localctx).type = match(OPERATOR_LT);
				}
				break;
			case OPERATOR_LTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				((ComparisonOperatorContext)_localctx).type = match(OPERATOR_LTE);
				}
				break;
			case OPERATOR_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				((ComparisonOperatorContext)_localctx).type = match(OPERATOR_EQ);
				}
				break;
			case OPERATOR_NEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(717);
				((ComparisonOperatorContext)_localctx).type = match(OPERATOR_NEQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertColumnsSpecContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<InsertPathContext> insertPath() {
			return getRuleContexts(InsertPathContext.class);
		}
		public InsertPathContext insertPath(int i) {
			return getRuleContext(InsertPathContext.class,i);
		}
		public InsertColumnsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertColumnsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertColumnsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertColumnsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsertColumnsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertColumnsSpecContext insertColumnsSpec() throws RecognitionException {
		InsertColumnsSpecContext _localctx = new InsertColumnsSpecContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_insertColumnsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(LR_BRACKET);
			setState(721);
			match(KEY);
			setState(724); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(722);
				match(COMMA);
				setState(723);
				insertPath();
				}
				}
				setState(726); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(728);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertPathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TagListContext tagList() {
			return getRuleContext(TagListContext.class,0);
		}
		public InsertPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsertPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertPathContext insertPath() throws RecognitionException {
		InsertPathContext _localctx = new InsertPathContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_insertPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			path();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LS_BRACKET) {
				{
				setState(731);
				tagList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesSpecContext extends ParserRuleContext {
		public List<InsertMultiValueContext> insertMultiValue() {
			return getRuleContexts(InsertMultiValueContext.class);
		}
		public InsertMultiValueContext insertMultiValue(int i) {
			return getRuleContext(InsertMultiValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public QueryClauseContext queryClause() {
			return getRuleContext(QueryClauseContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode TIME_OFFSET() { return getToken(SqlParser.TIME_OFFSET, 0); }
		public TerminalNode OPERATOR_EQ() { return getToken(SqlParser.OPERATOR_EQ, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public InsertValuesSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertValuesSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertValuesSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsertValuesSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesSpecContext insertValuesSpec() throws RecognitionException {
		InsertValuesSpecContext _localctx = new InsertValuesSpecContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_insertValuesSpec);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==LR_BRACKET) {
					{
					{
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(734);
						match(COMMA);
						}
					}

					setState(737);
					insertMultiValue();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(LR_BRACKET);
				setState(744);
				queryClause();
				setState(745);
				match(RR_BRACKET);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIME_OFFSET) {
					{
					setState(746);
					match(TIME_OFFSET);
					setState(747);
					match(OPERATOR_EQ);
					setState(748);
					match(INT);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertMultiValueContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TimeValueContext timeValue() {
			return getRuleContext(TimeValueContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public InsertMultiValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertMultiValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsertMultiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsertMultiValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsertMultiValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertMultiValueContext insertMultiValue() throws RecognitionException {
		InsertMultiValueContext _localctx = new InsertMultiValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_insertMultiValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(LR_BRACKET);
			setState(754);
			timeValue();
			setState(757); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(755);
				match(COMMA);
				setState(756);
				constant();
				}
				}
				setState(759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(761);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageEngineSpecContext extends ParserRuleContext {
		public List<StorageEngineContext> storageEngine() {
			return getRuleContexts(StorageEngineContext.class);
		}
		public StorageEngineContext storageEngine(int i) {
			return getRuleContext(StorageEngineContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public StorageEngineSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageEngineSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStorageEngineSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStorageEngineSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStorageEngineSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageEngineSpecContext storageEngineSpec() throws RecognitionException {
		StorageEngineSpecContext _localctx = new StorageEngineSpecContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_storageEngineSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(763);
					match(COMMA);
					}
				}

				setState(766);
				storageEngine();
				}
				}
				setState(769); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==LR_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageEngineContext extends ParserRuleContext {
		public StringLiteralContext ip;
		public Token port;
		public StringLiteralContext engineType;
		public StringLiteralContext extra;
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public StorageEngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageEngine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStorageEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStorageEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStorageEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageEngineContext storageEngine() throws RecognitionException {
		StorageEngineContext _localctx = new StorageEngineContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_storageEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(LR_BRACKET);
			setState(772);
			((StorageEngineContext)_localctx).ip = stringLiteral();
			setState(773);
			match(COMMA);
			setState(774);
			((StorageEngineContext)_localctx).port = match(INT);
			setState(775);
			match(COMMA);
			setState(776);
			((StorageEngineContext)_localctx).engineType = stringLiteral();
			setState(777);
			match(COMMA);
			setState(778);
			((StorageEngineContext)_localctx).extra = stringLiteral();
			setState(779);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeValueContext extends ParserRuleContext {
		public DateFormatContext dateFormat() {
			return getRuleContext(DateFormatContext.class,0);
		}
		public DateExpressionContext dateExpression() {
			return getRuleContext(DateExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public TerminalNode INF() { return getToken(SqlParser.INF, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TimeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTimeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTimeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTimeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeValueContext timeValue() throws RecognitionException {
		TimeValueContext _localctx = new TimeValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_timeValue);
		int _la;
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				dateFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				dateExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(784);
					match(MINUS);
					}
				}

				setState(787);
				match(INF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<NodeNameContext> nodeName() {
			return getRuleContexts(NodeNameContext.class);
		}
		public NodeNameContext nodeName(int i) {
			return getRuleContext(NodeNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			nodeName();
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(791);
					match(DOT);
					setState(792);
					nodeName();
					}
					} 
				}
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdfTypeContext extends ParserRuleContext {
		public TerminalNode UDAF() { return getToken(SqlParser.UDAF, 0); }
		public TerminalNode UDTF() { return getToken(SqlParser.UDTF, 0); }
		public TerminalNode UDSF() { return getToken(SqlParser.UDSF, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlParser.TRANSFORM, 0); }
		public UdfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUdfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUdfType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUdfType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UdfTypeContext udfType() throws RecognitionException {
		UdfTypeContext _localctx = new UdfTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_udfType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRANSFORM) | (1L << UDAF) | (1L << UDTF) | (1L << UDSF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JobStatusContext extends ParserRuleContext {
		public TerminalNode UNKNOWN() { return getToken(SqlParser.UNKNOWN, 0); }
		public TerminalNode FINISHED() { return getToken(SqlParser.FINISHED, 0); }
		public TerminalNode CREATED() { return getToken(SqlParser.CREATED, 0); }
		public TerminalNode RUNNING() { return getToken(SqlParser.RUNNING, 0); }
		public TerminalNode FAILING() { return getToken(SqlParser.FAILING, 0); }
		public TerminalNode FAILED() { return getToken(SqlParser.FAILED, 0); }
		public TerminalNode CLOSING() { return getToken(SqlParser.CLOSING, 0); }
		public TerminalNode CLOSED() { return getToken(SqlParser.CLOSED, 0); }
		public JobStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJobStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJobStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJobStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobStatusContext jobStatus() throws RecognitionException {
		JobStatusContext _localctx = new JobStatusContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jobStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (UNKNOWN - 67)) | (1L << (FINISHED - 67)) | (1L << (CREATED - 67)) | (1L << (RUNNING - 67)) | (1L << (FAILING - 67)) | (1L << (FAILED - 67)) | (1L << (CLOSING - 67)) | (1L << (CLOSED - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public ValueNodeContext valueNode() {
			return getRuleContext(ValueNodeContext.class,0);
		}
		public KeyWordsContext keyWords() {
			return getRuleContext(KeyWordsContext.class,0);
		}
		public NodeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNodeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNodeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNodeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeNameContext nodeName() throws RecognitionException {
		NodeNameContext _localctx = new NodeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nodeName);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				valueNode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(805);
				keyWords();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueNodeContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode TIME_WITH_UNIT() { return getToken(SqlParser.TIME_WITH_UNIT, 0); }
		public DateExpressionContext dateExpression() {
			return getRuleContext(DateExpressionContext.class,0);
		}
		public DateFormatContext dateFormat() {
			return getRuleContext(DateFormatContext.class,0);
		}
		public TerminalNode EXPONENT() { return getToken(SqlParser.EXPONENT, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public BooleanClauseContext booleanClause() {
			return getRuleContext(BooleanClauseContext.class,0);
		}
		public ValueNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterValueNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitValueNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitValueNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueNodeContext valueNode() throws RecognitionException {
		ValueNodeContext _localctx = new ValueNodeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_valueNode);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(TIME_WITH_UNIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				dateExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				dateFormat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(812);
					match(MINUS);
					}
				}

				setState(815);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==EXPONENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(816);
				booleanClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyWordsContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SqlParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(SqlParser.DELETE, 0); }
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode INTO() { return getToken(SqlParser.INTO, 0); }
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(SqlParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SqlParser.OFFSET, 0); }
		public TerminalNode TIME() { return getToken(SqlParser.TIME, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public TerminalNode SERIES() { return getToken(SqlParser.SERIES, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlParser.TIMESTAMP, 0); }
		public TerminalNode GROUP() { return getToken(SqlParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(SqlParser.ORDER, 0); }
		public TerminalNode HAVING() { return getToken(SqlParser.HAVING, 0); }
		public TerminalNode AGG() { return getToken(SqlParser.AGG, 0); }
		public TerminalNode LEVEL() { return getToken(SqlParser.LEVEL, 0); }
		public TerminalNode ADD() { return getToken(SqlParser.ADD, 0); }
		public TerminalNode VALUE() { return getToken(SqlParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(SqlParser.VALUES, 0); }
		public TerminalNode NOW() { return getToken(SqlParser.NOW, 0); }
		public TerminalNode COUNT() { return getToken(SqlParser.COUNT, 0); }
		public TerminalNode LAST() { return getToken(SqlParser.LAST, 0); }
		public TerminalNode CLEAR() { return getToken(SqlParser.CLEAR, 0); }
		public TerminalNode MIN() { return getToken(SqlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SqlParser.MAX, 0); }
		public TerminalNode AVG() { return getToken(SqlParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(SqlParser.SUM, 0); }
		public TerminalNode DESC() { return getToken(SqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(SqlParser.ASC, 0); }
		public TerminalNode STORAGEENGINE() { return getToken(SqlParser.STORAGEENGINE, 0); }
		public TerminalNode POINTS() { return getToken(SqlParser.POINTS, 0); }
		public TerminalNode DATA() { return getToken(SqlParser.DATA, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlParser.LAST_VALUE, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlParser.FIRST_VALUE, 0); }
		public TerminalNode REPLICA() { return getToken(SqlParser.REPLICA, 0); }
		public TerminalNode IOTDB() { return getToken(SqlParser.IOTDB, 0); }
		public TerminalNode INFLUXDB() { return getToken(SqlParser.INFLUXDB, 0); }
		public TerminalNode DROP() { return getToken(SqlParser.DROP, 0); }
		public TerminalNode REGISTER() { return getToken(SqlParser.REGISTER, 0); }
		public TerminalNode PYTHON() { return getToken(SqlParser.PYTHON, 0); }
		public TerminalNode TASK() { return getToken(SqlParser.TASK, 0); }
		public TerminalNode COMMIT() { return getToken(SqlParser.COMMIT, 0); }
		public TerminalNode JOB() { return getToken(SqlParser.JOB, 0); }
		public TerminalNode STATUS() { return getToken(SqlParser.STATUS, 0); }
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public UdfTypeContext udfType() {
			return getRuleContext(UdfTypeContext.class,0);
		}
		public JobStatusContext jobStatus() {
			return getRuleContext(JobStatusContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(SqlParser.WITHOUT, 0); }
		public TerminalNode TAG() { return getToken(SqlParser.TAG, 0); }
		public TerminalNode WITH_PRECISE() { return getToken(SqlParser.WITH_PRECISE, 0); }
		public TerminalNode TIME_OFFSET() { return getToken(SqlParser.TIME_OFFSET, 0); }
		public TerminalNode CANCEL() { return getToken(SqlParser.CANCEL, 0); }
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(SqlParser.CROSS, 0); }
		public TerminalNode NATURAL() { return getToken(SqlParser.NATURAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public TerminalNode USING() { return getToken(SqlParser.USING, 0); }
		public TerminalNode OVER() { return getToken(SqlParser.OVER, 0); }
		public TerminalNode RANGE() { return getToken(SqlParser.RANGE, 0); }
		public TerminalNode STEP() { return getToken(SqlParser.STEP, 0); }
		public TerminalNode REMOVE() { return getToken(SqlParser.REMOVE, 0); }
		public TerminalNode HISTORYDATARESOURCE() { return getToken(SqlParser.HISTORYDATARESOURCE, 0); }
		public TerminalNode COMPACT() { return getToken(SqlParser.COMPACT, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlParser.EXPLAIN, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlParser.LOGICAL, 0); }
		public TerminalNode PHYSICAL() { return getToken(SqlParser.PHYSICAL, 0); }
		public KeyWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyWords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyWords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordsContext keyWords() throws RecognitionException {
		KeyWordsContext _localctx = new KeyWordsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_keyWords);
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(INSERT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(DELETE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(SELECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				match(SHOW);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				match(INTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				match(WHERE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				match(FROM);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(826);
				match(BY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(827);
				match(LIMIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(828);
				match(OFFSET);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(829);
				match(TIME);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(830);
				match(KEY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(831);
				match(SERIES);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(832);
				match(TIMESTAMP);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(833);
				match(GROUP);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(834);
				match(ORDER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(835);
				match(HAVING);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(836);
				match(AGG);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(837);
				match(LEVEL);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(838);
				match(ADD);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(839);
				match(VALUE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(840);
				match(VALUES);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(841);
				match(NOW);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(842);
				match(COUNT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(843);
				match(LAST);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(844);
				match(CLEAR);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(845);
				match(MIN);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(846);
				match(MAX);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(847);
				match(AVG);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(848);
				match(COUNT);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(849);
				match(SUM);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(850);
				match(DESC);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(851);
				match(ASC);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(852);
				match(STORAGEENGINE);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(853);
				match(POINTS);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(854);
				match(DATA);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(855);
				match(NULL);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(856);
				match(LAST_VALUE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(857);
				match(FIRST_VALUE);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(858);
				match(REPLICA);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(859);
				match(IOTDB);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(860);
				match(INFLUXDB);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(861);
				match(DROP);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(862);
				match(REGISTER);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(863);
				match(PYTHON);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(864);
				match(TASK);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(865);
				match(COMMIT);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(866);
				match(JOB);
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(867);
				match(STATUS);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(868);
				match(AS);
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(869);
				udfType();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(870);
				jobStatus();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(871);
				match(WITH);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(872);
				match(WITHOUT);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(873);
				match(TAG);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(874);
				match(WITH_PRECISE);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(875);
				match(TIME_OFFSET);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(876);
				match(CANCEL);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(877);
				match(INNER);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(878);
				match(OUTER);
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(879);
				match(CROSS);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(880);
				match(NATURAL);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(881);
				match(LEFT);
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(882);
				match(RIGHT);
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 65);
				{
				setState(883);
				match(FULL);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 66);
				{
				setState(884);
				match(JOIN);
				}
				break;
			case 67:
				enterOuterAlt(_localctx, 67);
				{
				setState(885);
				match(ON);
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 68);
				{
				setState(886);
				match(USING);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 69);
				{
				setState(887);
				match(OVER);
				}
				break;
			case 70:
				enterOuterAlt(_localctx, 70);
				{
				setState(888);
				match(RANGE);
				}
				break;
			case 71:
				enterOuterAlt(_localctx, 71);
				{
				setState(889);
				match(STEP);
				}
				break;
			case 72:
				enterOuterAlt(_localctx, 72);
				{
				setState(890);
				match(REMOVE);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 73);
				{
				setState(891);
				match(HISTORYDATARESOURCE);
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 74);
				{
				setState(892);
				match(COMPACT);
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 75);
				{
				setState(893);
				match(EXPLAIN);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 76);
				{
				setState(894);
				match(LOGICAL);
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 77);
				{
				setState(895);
				match(PHYSICAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateFormatContext extends ParserRuleContext {
		public TerminalNode DATETIME() { return getToken(SqlParser.DATETIME, 0); }
		public TerminalNode TIME_WITH_UNIT() { return getToken(SqlParser.TIME_WITH_UNIT, 0); }
		public TerminalNode NOW() { return getToken(SqlParser.NOW, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public DateFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDateFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDateFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDateFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateFormatContext dateFormat() throws RecognitionException {
		DateFormatContext _localctx = new DateFormatContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dateFormat);
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATETIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(DATETIME);
				}
				break;
			case TIME_WITH_UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(TIME_WITH_UNIT);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				match(NOW);
				setState(901);
				match(LR_BRACKET);
				setState(902);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public DateExpressionContext dateExpression() {
			return getRuleContext(DateExpressionContext.class,0);
		}
		public RealLiteralContext realLiteral() {
			return getRuleContext(RealLiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanClauseContext booleanClause() {
			return getRuleContext(BooleanClauseContext.class,0);
		}
		public TerminalNode NaN() { return getToken(SqlParser.NaN, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constant);
		int _la;
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				dateExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(906);
					match(MINUS);
					}
				}

				setState(909);
				realLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(910);
					match(MINUS);
					}
				}

				setState(913);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(914);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(915);
				booleanClause();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(916);
				match(NaN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(917);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanClauseContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlParser.FALSE, 0); }
		public BooleanClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBooleanClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBooleanClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBooleanClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanClauseContext booleanClause() throws RecognitionException {
		BooleanClauseContext _localctx = new BooleanClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_booleanClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateExpressionContext extends ParserRuleContext {
		public DateFormatContext dateFormat() {
			return getRuleContext(DateFormatContext.class,0);
		}
		public List<TerminalNode> TIME_WITH_UNIT() { return getTokens(SqlParser.TIME_WITH_UNIT); }
		public TerminalNode TIME_WITH_UNIT(int i) {
			return getToken(SqlParser.TIME_WITH_UNIT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SqlParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlParser.MINUS, i);
		}
		public DateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateExpressionContext dateExpression() throws RecognitionException {
		DateExpressionContext _localctx = new DateExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dateExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			dateFormat();
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(923);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(924);
					match(TIME_WITH_UNIT);
					}
					} 
				}
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealLiteralContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(SqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SqlParser.INT, i);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode EXPONENT() { return getToken(SqlParser.EXPONENT, 0); }
		public RealLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRealLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRealLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRealLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealLiteralContext realLiteral() throws RecognitionException {
		RealLiteralContext _localctx = new RealLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_realLiteral);
		int _la;
		try {
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				match(INT);
				setState(931);
				match(DOT);
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(932);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==EXPONENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(DOT);
				setState(936);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==EXPONENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case EXPONENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(EXPONENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemovedStorageEngineContext extends ParserRuleContext {
		public StringLiteralContext ip;
		public Token port;
		public StringLiteralContext schemaPrefix;
		public StringLiteralContext dataPrefix;
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public RemovedStorageEngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removedStorageEngine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRemovedStorageEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRemovedStorageEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRemovedStorageEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemovedStorageEngineContext removedStorageEngine() throws RecognitionException {
		RemovedStorageEngineContext _localctx = new RemovedStorageEngineContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_removedStorageEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(LR_BRACKET);
			setState(941);
			((RemovedStorageEngineContext)_localctx).ip = stringLiteral();
			setState(942);
			match(COMMA);
			setState(943);
			((RemovedStorageEngineContext)_localctx).port = match(INT);
			setState(944);
			match(COMMA);
			setState(945);
			((RemovedStorageEngineContext)_localctx).schemaPrefix = stringLiteral();
			setState(946);
			match(COMMA);
			setState(947);
			((RemovedStorageEngineContext)_localctx).dataPrefix = stringLiteral();
			setState(948);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING_LITERAL() { return getToken(SqlParser.SINGLE_QUOTE_STRING_LITERAL, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING_LITERAL() { return getToken(SqlParser.DOUBLE_QUOTE_STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_QUOTE_STRING_LITERAL || _la==SINGLE_QUOTE_STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u03b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0083\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008b\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0096\b\u0001\n\u0001\f\u0001\u0099"+
		"\t\u0001\u0001\u0001\u0003\u0001\u009c\b\u0001\u0001\u0001\u0003\u0001"+
		"\u009f\b\u0001\u0001\u0001\u0003\u0001\u00a2\b\u0001\u0001\u0001\u0003"+
		"\u0001\u00a5\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00b0"+
		"\b\u0001\n\u0001\f\u0001\u00b3\t\u0001\u0001\u0001\u0003\u0001\u00b6\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00c0\b\u0001\n\u0001\f\u0001"+
		"\u00c3\t\u0001\u0003\u0001\u00c5\b\u0001\u0001\u0001\u0003\u0001\u00c8"+
		"\b\u0001\u0001\u0001\u0003\u0001\u00cb\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00ff\b\u0001\n\u0001\f\u0001\u0102\t\u0001\u0001\u0001\u0003"+
		"\u0001\u0105\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u010a"+
		"\b\u0002\u0001\u0002\u0003\u0002\u010d\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0110\b\u0002\u0001\u0002\u0003\u0002\u0113\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0119\b\u0003\n\u0003\f\u0003"+
		"\u011c\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0129\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u012d\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0132\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u013a\b\u0004\n\u0004\f\u0004\u013d\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0147\b\u0007\n\u0007\f\u0007\u014a\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u014f\b\b\n\b\f\b\u0152\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u015b\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0169\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0174\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u017b\b\t\u0001\n\u0003\n\u017e\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0189\b\n\u0001"+
		"\n\u0003\n\u018c\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0198\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01a5"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u01b3\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u01b9\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u01bd\b\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01c9\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u01ce\b\u000f\n\u000f\f\u000f\u01d1\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01d6\b\u0010\n\u0010"+
		"\f\u0010\u01d9\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01e3\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01e8\b\u0012\n\u0012"+
		"\f\u0012\u01eb\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01f0\b\u0013\n\u0013\f\u0013\u01f3\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u01fd\b\u0015\n\u0015\f\u0015\u0200\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u020f\b\u0019\n\u0019\f\u0019\u0212\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u021f\b\u001a\u0003\u001a\u0221"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0225\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u022e\b\u001d\n\u001d\f\u001d\u0231\t\u001d\u0001\u001e\u0003"+
		"\u001e\u0234\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0239"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u023f"+
		"\b\u001e\u0003\u001e\u0241\b\u001e\u0001\u001e\u0003\u001e\u0244\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u024a\b\u001f"+
		"\u0001\u001f\u0003\u001f\u024d\b\u001f\u0001\u001f\u0003\u001f\u0250\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0254\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0258\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u025c"+
		"\b\u001f\u0003\u001f\u025e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0005 \u0265\b \n \f \u0268\t \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0271\b\"\u0001\"\u0001\"\u0005\"\u0275\b\"\n\"\f\""+
		"\u0278\t\"\u0001\"\u0003\"\u027b\b\"\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0288\b$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0294"+
		"\b&\n&\f&\u0297\t&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u02b4\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u02bd\b)\u0001)\u0003)\u02c0\b)\u0001)\u0001)\u0003)\u02c4\b)\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02cf"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0004,\u02d5\b,\u000b,\f,\u02d6\u0001"+
		",\u0001,\u0001-\u0001-\u0003-\u02dd\b-\u0001.\u0003.\u02e0\b.\u0001.\u0005"+
		".\u02e3\b.\n.\f.\u02e6\t.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u02ee\b.\u0003.\u02f0\b.\u0001/\u0001/\u0001/\u0001/\u0004/\u02f6\b"+
		"/\u000b/\f/\u02f7\u0001/\u0001/\u00010\u00030\u02fd\b0\u00010\u00040\u0300"+
		"\b0\u000b0\f0\u0301\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00032\u0312\b2\u00012\u0003"+
		"2\u0315\b2\u00013\u00013\u00013\u00053\u031a\b3\n3\f3\u031d\t3\u00014"+
		"\u00014\u00015\u00015\u00016\u00016\u00016\u00016\u00036\u0327\b6\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u032e\b7\u00017\u00017\u00037\u0332"+
		"\b7\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0381\b8\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0388\b9\u0001:\u0001:\u0003:\u038c"+
		"\b:\u0001:\u0001:\u0003:\u0390\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u0397\b:\u0001;\u0001;\u0001<\u0001<\u0001<\u0005<\u039e\b<\n<\f<\u03a1"+
		"\t<\u0001=\u0001=\u0001=\u0003=\u03a6\b=\u0001=\u0001=\u0001=\u0003=\u03ab"+
		"\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0000\u0001\b@\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000\u000f\u0001\u0000\\]\u0001\u0000p"+
		"q\u0002\u0000ccrs\u0002\u0000\u001f&\u0082\u0082\u0001\u0000_`\u0002\u0000"+
		"cc\u0082\u0082\u0001\u0000OQ\u0001\u0000OP\u0001\u0000/0\u0002\u0000~"+
		"~\u0080\u0080\u0002\u000066:<\u0001\u0000CJ\u0001\u0000~\u007f\u0001\u0000"+
		"\u001c\u001d\u0001\u0000\u0083\u0084\u0465\u0000\u0080\u0001\u0000\u0000"+
		"\u0000\u0002\u0104\u0001\u0000\u0000\u0000\u0004\u0106\u0001\u0000\u0000"+
		"\u0000\u0006\u0114\u0001\u0000\u0000\u0000\b\u0131\u0001\u0000\u0000\u0000"+
		"\n\u013e\u0001\u0000\u0000\u0000\f\u0140\u0001\u0000\u0000\u0000\u000e"+
		"\u0143\u0001\u0000\u0000\u0000\u0010\u014b\u0001\u0000\u0000\u0000\u0012"+
		"\u017a\u0001\u0000\u0000\u0000\u0014\u01b8\u0001\u0000\u0000\u0000\u0016"+
		"\u01bc\u0001\u0000\u0000\u0000\u0018\u01be\u0001\u0000\u0000\u0000\u001a"+
		"\u01c0\u0001\u0000\u0000\u0000\u001c\u01c8\u0001\u0000\u0000\u0000\u001e"+
		"\u01ca\u0001\u0000\u0000\u0000 \u01d2\u0001\u0000\u0000\u0000\"\u01e2"+
		"\u0001\u0000\u0000\u0000$\u01e4\u0001\u0000\u0000\u0000&\u01ec\u0001\u0000"+
		"\u0000\u0000(\u01f4\u0001\u0000\u0000\u0000*\u01f8\u0001\u0000\u0000\u0000"+
		",\u0203\u0001\u0000\u0000\u0000.\u0207\u0001\u0000\u0000\u00000\u0209"+
		"\u0001\u0000\u0000\u00002\u020b\u0001\u0000\u0000\u00004\u0220\u0001\u0000"+
		"\u0000\u00006\u0224\u0001\u0000\u0000\u00008\u0226\u0001\u0000\u0000\u0000"+
		":\u022a\u0001\u0000\u0000\u0000<\u0243\u0001\u0000\u0000\u0000>\u025d"+
		"\u0001\u0000\u0000\u0000@\u025f\u0001\u0000\u0000\u0000B\u0269\u0001\u0000"+
		"\u0000\u0000D\u026c\u0001\u0000\u0000\u0000F\u027c\u0001\u0000\u0000\u0000"+
		"H\u027f\u0001\u0000\u0000\u0000J\u028b\u0001\u0000\u0000\u0000L\u028d"+
		"\u0001\u0000\u0000\u0000N\u0298\u0001\u0000\u0000\u0000P\u02b3\u0001\u0000"+
		"\u0000\u0000R\u02c3\u0001\u0000\u0000\u0000T\u02c5\u0001\u0000\u0000\u0000"+
		"V\u02ce\u0001\u0000\u0000\u0000X\u02d0\u0001\u0000\u0000\u0000Z\u02da"+
		"\u0001\u0000\u0000\u0000\\\u02ef\u0001\u0000\u0000\u0000^\u02f1\u0001"+
		"\u0000\u0000\u0000`\u02ff\u0001\u0000\u0000\u0000b\u0303\u0001\u0000\u0000"+
		"\u0000d\u0314\u0001\u0000\u0000\u0000f\u0316\u0001\u0000\u0000\u0000h"+
		"\u031e\u0001\u0000\u0000\u0000j\u0320\u0001\u0000\u0000\u0000l\u0326\u0001"+
		"\u0000\u0000\u0000n\u0331\u0001\u0000\u0000\u0000p\u0380\u0001\u0000\u0000"+
		"\u0000r\u0387\u0001\u0000\u0000\u0000t\u0396\u0001\u0000\u0000\u0000v"+
		"\u0398\u0001\u0000\u0000\u0000x\u039a\u0001\u0000\u0000\u0000z\u03aa\u0001"+
		"\u0000\u0000\u0000|\u03ac\u0001\u0000\u0000\u0000~\u03b6\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081\u0083\u0005\u0001\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0000\u0000"+
		"\u0001\u0085\u0001\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0002\u0000"+
		"\u0000\u0087\u0088\u0005\f\u0000\u0000\u0088\u008a\u0003f3\u0000\u0089"+
		"\u008b\u0003*\u0015\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003X,\u0000\u008d\u008e\u0005\u0016\u0000\u0000\u008e\u008f\u0003\\"+
		".\u0000\u008f\u0105\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0003\u0000"+
		"\u0000\u0091\u0092\u0005\r\u0000\u0000\u0092\u0097\u0003f3\u0000\u0093"+
		"\u0094\u0005b\u0000\u0000\u0094\u0096\u0003f3\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009c\u0003"+
		"\f\u0006\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u001c"+
		"\u000e\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u0105\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005[\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0000\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0105\u0003\u0004\u0002"+
		"\u0000\u00a7\u00a8\u0005%\u0000\u0000\u00a8\u0105\u0005,\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0005\u001a\u0000\u0000\u00ab"+
		"\u00ac\u0005.\u0000\u0000\u00ac\u00b1\u0003f3\u0000\u00ad\u00ae\u0005"+
		"b\u0000\u0000\u00ae\u00b0\u0003f3\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\u001c\u000e"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u0105\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005-\u0000\u0000"+
		"\u00b8\u0105\u0005)\u0000\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba"+
		"\u00bb\u0005\u001a\u0000\u0000\u00bb\u00c4\u0005.\u0000\u0000\u00bc\u00c1"+
		"\u0003f3\u0000\u00bd\u00be\u0005b\u0000\u0000\u00be\u00c0\u0003f3\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003\u001c\u000e\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003R)\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0105"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0005\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0006\u0000\u0000\u00ce\u0105\u0005\u0007\u0000\u0000\u00cf\u00d0"+
		"\u0005*\u0000\u0000\u00d0\u00d1\u0005+\u0000\u0000\u00d1\u0105\u0003`"+
		"0\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3\u00d4\u0005\b\u0000"+
		"\u0000\u00d4\u0105\u0005\t\u0000\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000"+
		"\u00d6\u00d7\u00052\u0000\u0000\u00d7\u00d8\u00053\u0000\u0000\u00d8\u0105"+
		"\u00054\u0000\u0000\u00d9\u00da\u00052\u0000\u0000\u00da\u00db\u0003h"+
		"4\u0000\u00db\u00dc\u00053\u0000\u0000\u00dc\u00dd\u00054\u0000\u0000"+
		"\u00dd\u00de\u0003~?\u0000\u00de\u00df\u0005\u000b\u0000\u0000\u00df\u00e0"+
		"\u0003~?\u0000\u00e0\u00e1\u00059\u0000\u0000\u00e1\u00e2\u0003~?\u0000"+
		"\u00e2\u0105\u0001\u0000\u0000\u0000\u00e3\u00e4\u00051\u0000\u0000\u00e4"+
		"\u00e5\u00053\u0000\u0000\u00e5\u00e6\u00054\u0000\u0000\u00e6\u0105\u0003"+
		"~?\u0000\u00e7\u00e8\u00055\u0000\u0000\u00e8\u00e9\u00056\u0000\u0000"+
		"\u00e9\u00ea\u00057\u0000\u0000\u00ea\u0105\u0003~?\u0000\u00eb\u00ec"+
		"\u0005\u0005\u0000\u0000\u00ec\u00ed\u00056\u0000\u0000\u00ed\u00ee\u0005"+
		"7\u0000\u0000\u00ee\u00ef\u00058\u0000\u0000\u00ef\u0105\u0005~\u0000"+
		"\u0000\u00f0\u00f1\u0005B\u0000\u0000\u00f1\u00f2\u00056\u0000\u0000\u00f2"+
		"\u00f3\u00057\u0000\u0000\u00f3\u0105\u0005~\u0000\u0000\u00f4\u00f5\u0005"+
		"\u0005\u0000\u0000\u00f5\u00f6\u0003j5\u0000\u00f6\u00f7\u00056\u0000"+
		"\u0000\u00f7\u00f8\u00057\u0000\u0000\u00f8\u0105\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005X\u0000\u0000\u00fa\u00fb\u0005Y\u0000\u0000\u00fb\u0100"+
		"\u0003|>\u0000\u00fc\u00fd\u0005b\u0000\u0000\u00fd\u00ff\u0003|>\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0105\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0005Z\u0000\u0000\u0104\u0086\u0001\u0000\u0000\u0000\u0104"+
		"\u0090\u0001\u0000\u0000\u0000\u0104\u00a1\u0001\u0000\u0000\u0000\u0104"+
		"\u00a7\u0001\u0000\u0000\u0000\u0104\u00a9\u0001\u0000\u0000\u0000\u0104"+
		"\u00b7\u0001\u0000\u0000\u0000\u0104\u00b9\u0001\u0000\u0000\u0000\u0104"+
		"\u00cc\u0001\u0000\u0000\u0000\u0104\u00cf\u0001\u0000\u0000\u0000\u0104"+
		"\u00d2\u0001\u0000\u0000\u0000\u0104\u00d5\u0001\u0000\u0000\u0000\u0104"+
		"\u00d9\u0001\u0000\u0000\u0000\u0104\u00e3\u0001\u0000\u0000\u0000\u0104"+
		"\u00e7\u0001\u0000\u0000\u0000\u0104\u00eb\u0001\u0000\u0000\u0000\u0104"+
		"\u00f0\u0001\u0000\u0000\u0000\u0104\u00f4\u0001\u0000\u0000\u0000\u0104"+
		"\u00f9\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0003\u0001\u0000\u0000\u0000\u0106\u0107\u0003\u0006\u0003\u0000\u0107"+
		"\u0109\u00032\u0019\u0000\u0108\u010a\u0003\f\u0006\u0000\u0109\u0108"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c"+
		"\u0001\u0000\u0000\u0000\u010b\u010d\u0003\u001c\u000e\u0000\u010c\u010b"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u0110\u0003>\u001f\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u0003N\'\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0005\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u011a\u0003\b\u0004"+
		"\u0000\u0116\u0117\u0005b\u0000\u0000\u0117\u0119\u0003\b\u0004\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u0007\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0006\u0004\uffff\uffff\u0000\u011e\u011f\u0005u\u0000\u0000"+
		"\u011f\u0120\u0003\b\u0004\u0000\u0120\u0121\u0005v\u0000\u0000\u0121"+
		"\u0132\u0001\u0000\u0000\u0000\u0122\u0132\u0003t:\u0000\u0123\u0124\u0003"+
		"\n\u0005\u0000\u0124\u0125\u0005u\u0000\u0000\u0125\u0126\u0003f3\u0000"+
		"\u0126\u0128\u0005v\u0000\u0000\u0127\u0129\u0003N\'\u0000\u0128\u0127"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0132"+
		"\u0001\u0000\u0000\u0000\u012a\u012c\u0003f3\u0000\u012b\u012d\u0003N"+
		"\'\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u0132\u0001\u0000\u0000\u0000\u012e\u012f\u0007\u0001\u0000"+
		"\u0000\u012f\u0132\u0003\b\u0004\u0004\u0130\u0132\u00038\u001c\u0000"+
		"\u0131\u011d\u0001\u0000\u0000\u0000\u0131\u0122\u0001\u0000\u0000\u0000"+
		"\u0131\u0123\u0001\u0000\u0000\u0000\u0131\u012a\u0001\u0000\u0000\u0000"+
		"\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u013b\u0001\u0000\u0000\u0000\u0133\u0134\n\u0003\u0000\u0000\u0134"+
		"\u0135\u0007\u0002\u0000\u0000\u0135\u013a\u0003\b\u0004\u0004\u0136\u0137"+
		"\n\u0002\u0000\u0000\u0137\u0138\u0007\u0001\u0000\u0000\u0138\u013a\u0003"+
		"\b\u0004\u0003\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\t\u0001\u0000\u0000"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0007\u0003\u0000"+
		"\u0000\u013f\u000b\u0001\u0000\u0000\u0000\u0140\u0141\u0005\n\u0000\u0000"+
		"\u0141\u0142\u0003\u000e\u0007\u0000\u0142\r\u0001\u0000\u0000\u0000\u0143"+
		"\u0148\u0003\u0010\b\u0000\u0144\u0145\u0005m\u0000\u0000\u0145\u0147"+
		"\u0003\u0010\b\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u000f\u0001\u0000\u0000\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014b\u0150\u0003\u0012\t\u0000\u014c\u014d\u0005l"+
		"\u0000\u0000\u014d\u014f\u0003\u0012\t\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0011\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u015b\u0005\u001b\u0000"+
		"\u0000\u0154\u015b\u0003f3\u0000\u0155\u0156\u0003\n\u0005\u0000\u0156"+
		"\u0157\u0005u\u0000\u0000\u0157\u0158\u0003f3\u0000\u0158\u0159\u0005"+
		"v\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0153\u0001\u0000"+
		"\u0000\u0000\u015a\u0154\u0001\u0000\u0000\u0000\u015a\u0155\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0003V+\u0000"+
		"\u015d\u015e\u0003t:\u0000\u015e\u017b\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0003t:\u0000\u0160\u0168\u0003V+\u0000\u0161\u0169\u0005\u001b\u0000"+
		"\u0000\u0162\u0169\u0003f3\u0000\u0163\u0164\u0003\n\u0005\u0000\u0164"+
		"\u0165\u0005u\u0000\u0000\u0165\u0166\u0003f3\u0000\u0166\u0167\u0005"+
		"v\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0161\u0001\u0000"+
		"\u0000\u0000\u0168\u0162\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000"+
		"\u0000\u0000\u0169\u017b\u0001\u0000\u0000\u0000\u016a\u016b\u0003f3\u0000"+
		"\u016b\u016c\u0003V+\u0000\u016c\u016d\u0003f3\u0000\u016d\u017b\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0003f3\u0000\u016f\u0170\u0005k\u0000"+
		"\u0000\u0170\u0171\u0003~?\u0000\u0171\u017b\u0001\u0000\u0000\u0000\u0172"+
		"\u0174\u0005n\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0005u\u0000\u0000\u0176\u0177\u0003\u000e\u0007\u0000\u0177\u0178\u0005"+
		"v\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u017b\u0003\u0014"+
		"\n\u0000\u017a\u015a\u0001\u0000\u0000\u0000\u017a\u015f\u0001\u0000\u0000"+
		"\u0000\u017a\u016a\u0001\u0000\u0000\u0000\u017a\u016e\u0001\u0000\u0000"+
		"\u0000\u017a\u0173\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000"+
		"\u0000\u017b\u0013\u0001\u0000\u0000\u0000\u017c\u017e\u0005n\u0000\u0000"+
		"\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0005^\u0000\u0000\u0180"+
		"\u01b9\u00038\u001c\u0000\u0181\u0189\u0003f3\u0000\u0182\u0189\u0003"+
		"t:\u0000\u0183\u0184\u0003\n\u0005\u0000\u0184\u0185\u0005u\u0000\u0000"+
		"\u0185\u0186\u0003f3\u0000\u0186\u0187\u0005v\u0000\u0000\u0187\u0189"+
		"\u0001\u0000\u0000\u0000\u0188\u0181\u0001\u0000\u0000\u0000\u0188\u0182"+
		"\u0001\u0000\u0000\u0000\u0188\u0183\u0001\u0000\u0000\u0000\u0189\u018b"+
		"\u0001\u0000\u0000\u0000\u018a\u018c\u0005n\u0000\u0000\u018b\u018a\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0005\u000b\u0000\u0000\u018e\u018f\u0003"+
		"8\u001c\u0000\u018f\u01b9\u0001\u0000\u0000\u0000\u0190\u0198\u0003f3"+
		"\u0000\u0191\u0198\u0003t:\u0000\u0192\u0193\u0003\n\u0005\u0000\u0193"+
		"\u0194\u0005u\u0000\u0000\u0194\u0195\u0003f3\u0000\u0195\u0196\u0005"+
		"v\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0190\u0001\u0000"+
		"\u0000\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0197\u0192\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0003V+\u0000"+
		"\u019a\u019b\u0003\u0016\u000b\u0000\u019b\u019c\u00038\u001c\u0000\u019c"+
		"\u01b9\u0001\u0000\u0000\u0000\u019d\u01a5\u0003f3\u0000\u019e\u01a5\u0003"+
		"t:\u0000\u019f\u01a0\u0003\n\u0005\u0000\u01a0\u01a1\u0005u\u0000\u0000"+
		"\u01a1\u01a2\u0003f3\u0000\u01a2\u01a3\u0005v\u0000\u0000\u01a3\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a4\u019d\u0001\u0000\u0000\u0000\u01a4\u019e"+
		"\u0001\u0000\u0000\u0000\u01a4\u019f\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0003V+\u0000\u01a7\u01a8\u00038"+
		"\u001c\u0000\u01a8\u01b9\u0001\u0000\u0000\u0000\u01a9\u01aa\u00038\u001c"+
		"\u0000\u01aa\u01b2\u0003V+\u0000\u01ab\u01b3\u0003f3\u0000\u01ac\u01b3"+
		"\u0003t:\u0000\u01ad\u01ae\u0003\n\u0005\u0000\u01ae\u01af\u0005u\u0000"+
		"\u0000\u01af\u01b0\u0003f3\u0000\u01b0\u01b1\u0005v\u0000\u0000\u01b1"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b2\u01ab\u0001\u0000\u0000\u0000\u01b2"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b2\u01ad\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b4\u01b5\u00038\u001c\u0000\u01b5\u01b6"+
		"\u0003V+\u0000\u01b6\u01b7\u00038\u001c\u0000\u01b7\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b8\u017d\u0001\u0000\u0000\u0000\u01b8\u0188\u0001\u0000"+
		"\u0000\u0000\u01b8\u0197\u0001\u0000\u0000\u0000\u01b8\u01a4\u0001\u0000"+
		"\u0000\u0000\u01b8\u01a9\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b9\u0015\u0001\u0000\u0000\u0000\u01ba\u01bd\u0003\u0018"+
		"\f\u0000\u01bb\u01bd\u0003\u001a\r\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u0017\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0005a\u0000\u0000\u01bf\u0019\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0007\u0004\u0000\u0000\u01c1\u001b\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005=\u0000\u0000\u01c3\u01c9\u0003\u001e\u000f\u0000\u01c4"+
		"\u01c5\u0005@\u0000\u0000\u01c5\u01c9\u0003$\u0012\u0000\u01c6\u01c7\u0005"+
		">\u0000\u0000\u01c7\u01c9\u0005?\u0000\u0000\u01c8\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c4\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c9\u001d\u0001\u0000\u0000\u0000\u01ca\u01cf\u0003 \u0010\u0000"+
		"\u01cb\u01cc\u0005m\u0000\u0000\u01cc\u01ce\u0003 \u0010\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u001f"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d7"+
		"\u0003\"\u0011\u0000\u01d3\u01d4\u0005l\u0000\u0000\u01d4\u01d6\u0003"+
		"\"\u0011\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8!\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0003.\u0017\u0000\u01db\u01dc\u0005d\u0000\u0000\u01dc"+
		"\u01dd\u00030\u0018\u0000\u01dd\u01e3\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0005u\u0000\u0000\u01df\u01e0\u0003\u001e\u000f\u0000\u01e0\u01e1\u0005"+
		"v\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01da\u0001\u0000"+
		"\u0000\u0000\u01e2\u01de\u0001\u0000\u0000\u0000\u01e3#\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e9\u0003&\u0013\u0000\u01e5\u01e6\u0005m\u0000\u0000\u01e6"+
		"\u01e8\u0003&\u0013\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01eb"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ea%\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ec\u01f1\u0003(\u0014\u0000\u01ed\u01ee\u0005l\u0000"+
		"\u0000\u01ee\u01f0\u0003(\u0014\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\'\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0003.\u0017\u0000\u01f5\u01f6"+
		"\u0005d\u0000\u0000\u01f6\u01f7\u00030\u0018\u0000\u01f7)\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0005w\u0000\u0000\u01f9\u01fe\u0003,\u0016\u0000"+
		"\u01fa\u01fb\u0005b\u0000\u0000\u01fb\u01fd\u0003,\u0016\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0201"+
		"\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0005x\u0000\u0000\u0202+\u0001\u0000\u0000\u0000\u0203\u0204\u0003."+
		"\u0017\u0000\u0204\u0205\u0005d\u0000\u0000\u0205\u0206\u00030\u0018\u0000"+
		"\u0206-\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u0082\u0000\u0000\u0208"+
		"/\u0001\u0000\u0000\u0000\u0209\u020a\u0007\u0005\u0000\u0000\u020a1\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005\r\u0000\u0000\u020c\u0210\u00036"+
		"\u001b\u0000\u020d\u020f\u00034\u001a\u0000\u020e\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u02113\u0001\u0000\u0000\u0000"+
		"\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0214\u0005b\u0000\u0000\u0214"+
		"\u0221\u00036\u001b\u0000\u0215\u0216\u0005M\u0000\u0000\u0216\u0217\u0005"+
		"R\u0000\u0000\u0217\u0221\u00036\u001b\u0000\u0218\u0219\u0003<\u001e"+
		"\u0000\u0219\u021e\u00036\u001b\u0000\u021a\u021b\u0005S\u0000\u0000\u021b"+
		"\u021f\u0003\u000e\u0007\u0000\u021c\u021d\u0005T\u0000\u0000\u021d\u021f"+
		"\u0003:\u001d\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001"+
		"\u0000\u0000\u0000\u0220\u0213\u0001\u0000\u0000\u0000\u0220\u0215\u0001"+
		"\u0000\u0000\u0000\u0220\u0218\u0001\u0000\u0000\u0000\u02215\u0001\u0000"+
		"\u0000\u0000\u0222\u0225\u0003f3\u0000\u0223\u0225\u00038\u001c\u0000"+
		"\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000"+
		"\u02257\u0001\u0000\u0000\u0000\u0226\u0227\u0005u\u0000\u0000\u0227\u0228"+
		"\u0003\u0004\u0002\u0000\u0228\u0229\u0005v\u0000\u0000\u02299\u0001\u0000"+
		"\u0000\u0000\u022a\u022f\u0003f3\u0000\u022b\u022c\u0005b\u0000\u0000"+
		"\u022c\u022e\u0003f3\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0231"+
		"\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u0001\u0000\u0000\u0000\u0230;\u0001\u0000\u0000\u0000\u0231\u022f\u0001"+
		"\u0000\u0000\u0000\u0232\u0234\u0005K\u0000\u0000\u0233\u0232\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0244\u0005R\u0000\u0000\u0236\u0238\u0007\u0006\u0000"+
		"\u0000\u0237\u0239\u0005L\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000"+
		"\u023a\u0244\u0005R\u0000\u0000\u023b\u0240\u0005N\u0000\u0000\u023c\u023e"+
		"\u0007\u0007\u0000\u0000\u023d\u023f\u0005L\u0000\u0000\u023e\u023d\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001"+
		"\u0000\u0000\u0000\u0240\u023c\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0005"+
		"R\u0000\u0000\u0243\u0233\u0001\u0000\u0000\u0000\u0243\u0236\u0001\u0000"+
		"\u0000\u0000\u0243\u023b\u0001\u0000\u0000\u0000\u0244=\u0001\u0000\u0000"+
		"\u0000\u0245\u025e\u0003R)\u0000\u0246\u025e\u0003L&\u0000\u0247\u0249"+
		"\u0003@ \u0000\u0248\u024a\u0003B!\u0000\u0249\u0248\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000"+
		"\u0000\u024b\u024d\u0003D\"\u0000\u024c\u024b\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000"+
		"\u024e\u0250\u0003R)\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0001\u0000\u0000\u0000\u0250\u025e\u0001\u0000\u0000\u0000\u0251\u0253"+
		"\u0003F#\u0000\u0252\u0254\u0003R)\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u025e\u0001\u0000\u0000"+
		"\u0000\u0255\u0257\u0003H$\u0000\u0256\u0258\u0003R)\u0000\u0257\u0256"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025e"+
		"\u0001\u0000\u0000\u0000\u0259\u025b\u0003D\"\u0000\u025a\u025c\u0003"+
		"R)\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u0245\u0001\u0000\u0000"+
		"\u0000\u025d\u0246\u0001\u0000\u0000\u0000\u025d\u0247\u0001\u0000\u0000"+
		"\u0000\u025d\u0251\u0001\u0000\u0000\u0000\u025d\u0255\u0001\u0000\u0000"+
		"\u0000\u025d\u0259\u0001\u0000\u0000\u0000\u025e?\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0005\u000f\u0000\u0000\u0260\u0261\u0005\u0014\u0000\u0000"+
		"\u0261\u0266\u0003f3\u0000\u0262\u0263\u0005b\u0000\u0000\u0263\u0265"+
		"\u0003f3\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000"+
		"\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000"+
		"\u0000\u0000\u0267A\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0269\u026a\u0005\u0011\u0000\u0000\u026a\u026b\u0003\u000e\u0007"+
		"\u0000\u026bC\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u0010\u0000\u0000"+
		"\u026d\u0270\u0005\u0014\u0000\u0000\u026e\u0271\u0005\u001b\u0000\u0000"+
		"\u026f\u0271\u0003f3\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f"+
		"\u0001\u0000\u0000\u0000\u0271\u0276\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\u0005b\u0000\u0000\u0273\u0275\u0003f3\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000"+
		"\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027b\u0007\b\u0000"+
		"\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027bE\u0001\u0000\u0000\u0000\u027c\u027d\u0003H$\u0000\u027d"+
		"\u027e\u0003L&\u0000\u027eG\u0001\u0000\u0000\u0000\u027f\u0280\u0005"+
		"U\u0000\u0000\u0280\u0281\u0005u\u0000\u0000\u0281\u0282\u0005V\u0000"+
		"\u0000\u0282\u0283\u0003J%\u0000\u0283\u0284\u0005\u000b\u0000\u0000\u0284"+
		"\u0287\u0003P(\u0000\u0285\u0286\u0005W\u0000\u0000\u0286\u0288\u0003"+
		"J%\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005v\u0000\u0000"+
		"\u028aI\u0001\u0000\u0000\u0000\u028b\u028c\u0007\t\u0000\u0000\u028c"+
		"K\u0001\u0000\u0000\u0000\u028d\u028e\u0005\u0012\u0000\u0000\u028e\u028f"+
		"\u0005\u0013\u0000\u0000\u028f\u0290\u0005d\u0000\u0000\u0290\u0295\u0005"+
		"~\u0000\u0000\u0291\u0292\u0005b\u0000\u0000\u0292\u0294\u0005~\u0000"+
		"\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000"+
		"\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000"+
		"\u0000\u0296M\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u00059\u0000\u0000\u0299\u029a\u0005\u0082\u0000\u0000\u029a"+
		"O\u0001\u0000\u0000\u0000\u029b\u029c\u0005w\u0000\u0000\u029c\u029d\u0003"+
		"d2\u0000\u029d\u029e\u0005b\u0000\u0000\u029e\u029f\u0003d2\u0000\u029f"+
		"\u02a0\u0005v\u0000\u0000\u02a0\u02b4\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0005u\u0000\u0000\u02a2\u02a3\u0003d2\u0000\u02a3\u02a4\u0005b\u0000"+
		"\u0000\u02a4\u02a5\u0003d2\u0000\u02a5\u02a6\u0005v\u0000\u0000\u02a6"+
		"\u02b4\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005w\u0000\u0000\u02a8\u02a9"+
		"\u0003d2\u0000\u02a9\u02aa\u0005b\u0000\u0000\u02aa\u02ab\u0003d2\u0000"+
		"\u02ab\u02ac\u0005x\u0000\u0000\u02ac\u02b4\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0005u\u0000\u0000\u02ae\u02af\u0003d2\u0000\u02af\u02b0\u0005"+
		"b\u0000\u0000\u02b0\u02b1\u0003d2\u0000\u02b1\u02b2\u0005x\u0000\u0000"+
		"\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u029b\u0001\u0000\u0000\u0000"+
		"\u02b3\u02a1\u0001\u0000\u0000\u0000\u02b3\u02a7\u0001\u0000\u0000\u0000"+
		"\u02b3\u02ad\u0001\u0000\u0000\u0000\u02b4Q\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0005\'\u0000\u0000\u02b6\u02b7\u0005~\u0000\u0000\u02b7\u02b8"+
		"\u0005b\u0000\u0000\u02b8\u02c4\u0005~\u0000\u0000\u02b9\u02ba\u0005\'"+
		"\u0000\u0000\u02ba\u02bc\u0005~\u0000\u0000\u02bb\u02bd\u0003T*\u0000"+
		"\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bd\u02c4\u0001\u0000\u0000\u0000\u02be\u02c0\u0003T*\u0000\u02bf\u02be"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005\'\u0000\u0000\u02c2\u02c4\u0005"+
		"~\u0000\u0000\u02c3\u02b5\u0001\u0000\u0000\u0000\u02c3\u02b9\u0001\u0000"+
		"\u0000\u0000\u02c3\u02bf\u0001\u0000\u0000\u0000\u02c4S\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c6\u0005(\u0000\u0000\u02c6\u02c7\u0005~\u0000\u0000\u02c7"+
		"U\u0001\u0000\u0000\u0000\u02c8\u02cf\u0005e\u0000\u0000\u02c9\u02cf\u0005"+
		"f\u0000\u0000\u02ca\u02cf\u0005g\u0000\u0000\u02cb\u02cf\u0005h\u0000"+
		"\u0000\u02cc\u02cf\u0005d\u0000\u0000\u02cd\u02cf\u0005i\u0000\u0000\u02ce"+
		"\u02c8\u0001\u0000\u0000\u0000\u02ce\u02c9\u0001\u0000\u0000\u0000\u02ce"+
		"\u02ca\u0001\u0000\u0000\u0000\u02ce\u02cb\u0001\u0000\u0000\u0000\u02ce"+
		"\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf"+
		"W\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005u\u0000\u0000\u02d1\u02d4\u0005"+
		"\u001b\u0000\u0000\u02d2\u02d3\u0005b\u0000\u0000\u02d3\u02d5\u0003Z-"+
		"\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005v\u0000\u0000"+
		"\u02d9Y\u0001\u0000\u0000\u0000\u02da\u02dc\u0003f3\u0000\u02db\u02dd"+
		"\u0003*\u0015\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dd[\u0001\u0000\u0000\u0000\u02de\u02e0\u0005b\u0000"+
		"\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e3\u0003^/\u0000\u02e2"+
		"\u02df\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5"+
		"\u02f0\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e8\u0005u\u0000\u0000\u02e8\u02e9\u0003\u0004\u0002\u0000\u02e9\u02ed"+
		"\u0005v\u0000\u0000\u02ea\u02eb\u0005A\u0000\u0000\u02eb\u02ec\u0005d"+
		"\u0000\u0000\u02ec\u02ee\u0005~\u0000\u0000\u02ed\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f0\u0001\u0000\u0000"+
		"\u0000\u02ef\u02e4\u0001\u0000\u0000\u0000\u02ef\u02e7\u0001\u0000\u0000"+
		"\u0000\u02f0]\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005u\u0000\u0000\u02f2"+
		"\u02f5\u0003d2\u0000\u02f3\u02f4\u0005b\u0000\u0000\u02f4\u02f6\u0003"+
		"t:\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005v\u0000\u0000"+
		"\u02fa_\u0001\u0000\u0000\u0000\u02fb\u02fd\u0005b\u0000\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u0300\u0003b1\u0000\u02ff\u02fc\u0001\u0000"+
		"\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302a\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0005u\u0000\u0000\u0304\u0305\u0003~?\u0000\u0305"+
		"\u0306\u0005b\u0000\u0000\u0306\u0307\u0005~\u0000\u0000\u0307\u0308\u0005"+
		"b\u0000\u0000\u0308\u0309\u0003~?\u0000\u0309\u030a\u0005b\u0000\u0000"+
		"\u030a\u030b\u0003~?\u0000\u030b\u030c\u0005v\u0000\u0000\u030cc\u0001"+
		"\u0000\u0000\u0000\u030d\u0315\u0003r9\u0000\u030e\u0315\u0003x<\u0000"+
		"\u030f\u0315\u0005~\u0000\u0000\u0310\u0312\u0005p\u0000\u0000\u0311\u0310"+
		"\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313"+
		"\u0001\u0000\u0000\u0000\u0313\u0315\u0005}\u0000\u0000\u0314\u030d\u0001"+
		"\u0000\u0000\u0000\u0314\u030e\u0001\u0000\u0000\u0000\u0314\u030f\u0001"+
		"\u0000\u0000\u0000\u0314\u0311\u0001\u0000\u0000\u0000\u0315e\u0001\u0000"+
		"\u0000\u0000\u0316\u031b\u0003l6\u0000\u0317\u0318\u0005t\u0000\u0000"+
		"\u0318\u031a\u0003l6\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u031a\u031d"+
		"\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0001\u0000\u0000\u0000\u031cg\u0001\u0000\u0000\u0000\u031d\u031b\u0001"+
		"\u0000\u0000\u0000\u031e\u031f\u0007\n\u0000\u0000\u031fi\u0001\u0000"+
		"\u0000\u0000\u0320\u0321\u0007\u000b\u0000\u0000\u0321k\u0001\u0000\u0000"+
		"\u0000\u0322\u0327\u0005\u0082\u0000\u0000\u0323\u0327\u0005c\u0000\u0000"+
		"\u0324\u0327\u0003n7\u0000\u0325\u0327\u0003p8\u0000\u0326\u0322\u0001"+
		"\u0000\u0000\u0000\u0326\u0323\u0001\u0000\u0000\u0000\u0326\u0324\u0001"+
		"\u0000\u0000\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0327m\u0001\u0000"+
		"\u0000\u0000\u0328\u0332\u0003~?\u0000\u0329\u0332\u0005\u0080\u0000\u0000"+
		"\u032a\u0332\u0003x<\u0000\u032b\u0332\u0003r9\u0000\u032c\u032e\u0005"+
		"p\u0000\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000"+
		"\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0332\u0007\f\u0000"+
		"\u0000\u0330\u0332\u0003v;\u0000\u0331\u0328\u0001\u0000\u0000\u0000\u0331"+
		"\u0329\u0001\u0000\u0000\u0000\u0331\u032a\u0001\u0000\u0000\u0000\u0331"+
		"\u032b\u0001\u0000\u0000\u0000\u0331\u032d\u0001\u0000\u0000\u0000\u0331"+
		"\u0330\u0001\u0000\u0000\u0000\u0332o\u0001\u0000\u0000\u0000\u0333\u0381"+
		"\u0005\u0002\u0000\u0000\u0334\u0381\u0005\u0003\u0000\u0000\u0335\u0381"+
		"\u0005\u0004\u0000\u0000\u0336\u0381\u0005\u0005\u0000\u0000\u0337\u0381"+
		"\u0005\f\u0000\u0000\u0338\u0381\u0005\n\u0000\u0000\u0339\u0381\u0005"+
		"\r\u0000\u0000\u033a\u0381\u0005\u0014\u0000\u0000\u033b\u0381\u0005\'"+
		"\u0000\u0000\u033c\u0381\u0005(\u0000\u0000\u033d\u0381\u0005\u001a\u0000"+
		"\u0000\u033e\u0381\u0005\u001b\u0000\u0000\u033f\u0381\u0005.\u0000\u0000"+
		"\u0340\u0381\u0005\u000e\u0000\u0000\u0341\u0381\u0005\u000f\u0000\u0000"+
		"\u0342\u0381\u0005\u0010\u0000\u0000\u0343\u0381\u0005\u0011\u0000\u0000"+
		"\u0344\u0381\u0005\u0012\u0000\u0000\u0345\u0381\u0005\u0013\u0000\u0000"+
		"\u0346\u0381\u0005*\u0000\u0000\u0347\u0381\u0005\u0015\u0000\u0000\u0348"+
		"\u0381\u0005\u0016\u0000\u0000\u0349\u0381\u0005\u0019\u0000\u0000\u034a"+
		"\u0381\u0005%\u0000\u0000\u034b\u0381\u0005\u001f\u0000\u0000\u034c\u0381"+
		"\u0005-\u0000\u0000\u034d\u0381\u0005\"\u0000\u0000\u034e\u0381\u0005"+
		"#\u0000\u0000\u034f\u0381\u0005$\u0000\u0000\u0350\u0381\u0005%\u0000"+
		"\u0000\u0351\u0381\u0005&\u0000\u0000\u0352\u0381\u0005/\u0000\u0000\u0353"+
		"\u0381\u00050\u0000\u0000\u0354\u0381\u0005+\u0000\u0000\u0355\u0381\u0005"+
		",\u0000\u0000\u0356\u0381\u0005)\u0000\u0000\u0357\u0381\u0005\u001e\u0000"+
		"\u0000\u0358\u0381\u0005!\u0000\u0000\u0359\u0381\u0005 \u0000\u0000\u035a"+
		"\u0381\u0005\u0006\u0000\u0000\u035b\u0381\u0005\u0017\u0000\u0000\u035c"+
		"\u0381\u0005\u0018\u0000\u0000\u035d\u0381\u00051\u0000\u0000\u035e\u0381"+
		"\u00052\u0000\u0000\u035f\u0381\u00053\u0000\u0000\u0360\u0381\u00054"+
		"\u0000\u0000\u0361\u0381\u00055\u0000\u0000\u0362\u0381\u00057\u0000\u0000"+
		"\u0363\u0381\u00058\u0000\u0000\u0364\u0381\u00059\u0000\u0000\u0365\u0381"+
		"\u0003h4\u0000\u0366\u0381\u0003j5\u0000\u0367\u0381\u0005=\u0000\u0000"+
		"\u0368\u0381\u0005>\u0000\u0000\u0369\u0381\u0005?\u0000\u0000\u036a\u0381"+
		"\u0005@\u0000\u0000\u036b\u0381\u0005A\u0000\u0000\u036c\u0381\u0005B"+
		"\u0000\u0000\u036d\u0381\u0005K\u0000\u0000\u036e\u0381\u0005L\u0000\u0000"+
		"\u036f\u0381\u0005M\u0000\u0000\u0370\u0381\u0005N\u0000\u0000\u0371\u0381"+
		"\u0005O\u0000\u0000\u0372\u0381\u0005P\u0000\u0000\u0373\u0381\u0005Q"+
		"\u0000\u0000\u0374\u0381\u0005R\u0000\u0000\u0375\u0381\u0005S\u0000\u0000"+
		"\u0376\u0381\u0005T\u0000\u0000\u0377\u0381\u0005U\u0000\u0000\u0378\u0381"+
		"\u0005V\u0000\u0000\u0379\u0381\u0005W\u0000\u0000\u037a\u0381\u0005X"+
		"\u0000\u0000\u037b\u0381\u0005Y\u0000\u0000\u037c\u0381\u0005Z\u0000\u0000"+
		"\u037d\u0381\u0005[\u0000\u0000\u037e\u0381\u0005\\\u0000\u0000\u037f"+
		"\u0381\u0005]\u0000\u0000\u0380\u0333\u0001\u0000\u0000\u0000\u0380\u0334"+
		"\u0001\u0000\u0000\u0000\u0380\u0335\u0001\u0000\u0000\u0000\u0380\u0336"+
		"\u0001\u0000\u0000\u0000\u0380\u0337\u0001\u0000\u0000\u0000\u0380\u0338"+
		"\u0001\u0000\u0000\u0000\u0380\u0339\u0001\u0000\u0000\u0000\u0380\u033a"+
		"\u0001\u0000\u0000\u0000\u0380\u033b\u0001\u0000\u0000\u0000\u0380\u033c"+
		"\u0001\u0000\u0000\u0000\u0380\u033d\u0001\u0000\u0000\u0000\u0380\u033e"+
		"\u0001\u0000\u0000\u0000\u0380\u033f\u0001\u0000\u0000\u0000\u0380\u0340"+
		"\u0001\u0000\u0000\u0000\u0380\u0341\u0001\u0000\u0000\u0000\u0380\u0342"+
		"\u0001\u0000\u0000\u0000\u0380\u0343\u0001\u0000\u0000\u0000\u0380\u0344"+
		"\u0001\u0000\u0000\u0000\u0380\u0345\u0001\u0000\u0000\u0000\u0380\u0346"+
		"\u0001\u0000\u0000\u0000\u0380\u0347\u0001\u0000\u0000\u0000\u0380\u0348"+
		"\u0001\u0000\u0000\u0000\u0380\u0349\u0001\u0000\u0000\u0000\u0380\u034a"+
		"\u0001\u0000\u0000\u0000\u0380\u034b\u0001\u0000\u0000\u0000\u0380\u034c"+
		"\u0001\u0000\u0000\u0000\u0380\u034d\u0001\u0000\u0000\u0000\u0380\u034e"+
		"\u0001\u0000\u0000\u0000\u0380\u034f\u0001\u0000\u0000\u0000\u0380\u0350"+
		"\u0001\u0000\u0000\u0000\u0380\u0351\u0001\u0000\u0000\u0000\u0380\u0352"+
		"\u0001\u0000\u0000\u0000\u0380\u0353\u0001\u0000\u0000\u0000\u0380\u0354"+
		"\u0001\u0000\u0000\u0000\u0380\u0355\u0001\u0000\u0000\u0000\u0380\u0356"+
		"\u0001\u0000\u0000\u0000\u0380\u0357\u0001\u0000\u0000\u0000\u0380\u0358"+
		"\u0001\u0000\u0000\u0000\u0380\u0359\u0001\u0000\u0000\u0000\u0380\u035a"+
		"\u0001\u0000\u0000\u0000\u0380\u035b\u0001\u0000\u0000\u0000\u0380\u035c"+
		"\u0001\u0000\u0000\u0000\u0380\u035d\u0001\u0000\u0000\u0000\u0380\u035e"+
		"\u0001\u0000\u0000\u0000\u0380\u035f\u0001\u0000\u0000\u0000\u0380\u0360"+
		"\u0001\u0000\u0000\u0000\u0380\u0361\u0001\u0000\u0000\u0000\u0380\u0362"+
		"\u0001\u0000\u0000\u0000\u0380\u0363\u0001\u0000\u0000\u0000\u0380\u0364"+
		"\u0001\u0000\u0000\u0000\u0380\u0365\u0001\u0000\u0000\u0000\u0380\u0366"+
		"\u0001\u0000\u0000\u0000\u0380\u0367\u0001\u0000\u0000\u0000\u0380\u0368"+
		"\u0001\u0000\u0000\u0000\u0380\u0369\u0001\u0000\u0000\u0000\u0380\u036a"+
		"\u0001\u0000\u0000\u0000\u0380\u036b\u0001\u0000\u0000\u0000\u0380\u036c"+
		"\u0001\u0000\u0000\u0000\u0380\u036d\u0001\u0000\u0000\u0000\u0380\u036e"+
		"\u0001\u0000\u0000\u0000\u0380\u036f\u0001\u0000\u0000\u0000\u0380\u0370"+
		"\u0001\u0000\u0000\u0000\u0380\u0371\u0001\u0000\u0000\u0000\u0380\u0372"+
		"\u0001\u0000\u0000\u0000\u0380\u0373\u0001\u0000\u0000\u0000\u0380\u0374"+
		"\u0001\u0000\u0000\u0000\u0380\u0375\u0001\u0000\u0000\u0000\u0380\u0376"+
		"\u0001\u0000\u0000\u0000\u0380\u0377\u0001\u0000\u0000\u0000\u0380\u0378"+
		"\u0001\u0000\u0000\u0000\u0380\u0379\u0001\u0000\u0000\u0000\u0380\u037a"+
		"\u0001\u0000\u0000\u0000\u0380\u037b\u0001\u0000\u0000\u0000\u0380\u037c"+
		"\u0001\u0000\u0000\u0000\u0380\u037d\u0001\u0000\u0000\u0000\u0380\u037e"+
		"\u0001\u0000\u0000\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0381q\u0001"+
		"\u0000\u0000\u0000\u0382\u0388\u0005\u0081\u0000\u0000\u0383\u0388\u0005"+
		"\u0080\u0000\u0000\u0384\u0385\u0005\u0019\u0000\u0000\u0385\u0386\u0005"+
		"u\u0000\u0000\u0386\u0388\u0005v\u0000\u0000\u0387\u0382\u0001\u0000\u0000"+
		"\u0000\u0387\u0383\u0001\u0000\u0000\u0000\u0387\u0384\u0001\u0000\u0000"+
		"\u0000\u0388s\u0001\u0000\u0000\u0000\u0389\u0397\u0003x<\u0000\u038a"+
		"\u038c\u0005p\u0000\u0000\u038b\u038a\u0001\u0000\u0000\u0000\u038b\u038c"+
		"\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u0397"+
		"\u0003z=\u0000\u038e\u0390\u0005p\u0000\u0000\u038f\u038e\u0001\u0000"+
		"\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000"+
		"\u0000\u0000\u0391\u0397\u0005~\u0000\u0000\u0392\u0397\u0003~?\u0000"+
		"\u0393\u0397\u0003v;\u0000\u0394\u0397\u0005|\u0000\u0000\u0395\u0397"+
		"\u0005\u001e\u0000\u0000\u0396\u0389\u0001\u0000\u0000\u0000\u0396\u038b"+
		"\u0001\u0000\u0000\u0000\u0396\u038f\u0001\u0000\u0000\u0000\u0396\u0392"+
		"\u0001\u0000\u0000\u0000\u0396\u0393\u0001\u0000\u0000\u0000\u0396\u0394"+
		"\u0001\u0000\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0397u\u0001"+
		"\u0000\u0000\u0000\u0398\u0399\u0007\r\u0000\u0000\u0399w\u0001\u0000"+
		"\u0000\u0000\u039a\u039f\u0003r9\u0000\u039b\u039c\u0007\u0001\u0000\u0000"+
		"\u039c\u039e\u0005\u0080\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000"+
		"\u039e\u03a1\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000"+
		"\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0y\u0001\u0000\u0000\u0000\u03a1"+
		"\u039f\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005~\u0000\u0000\u03a3\u03a5"+
		"\u0005t\u0000\u0000\u03a4\u03a6\u0007\f\u0000\u0000\u03a5\u03a4\u0001"+
		"\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03ab\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a8\u0005t\u0000\u0000\u03a8\u03ab\u0007\f"+
		"\u0000\u0000\u03a9\u03ab\u0005\u007f\u0000\u0000\u03aa\u03a2\u0001\u0000"+
		"\u0000\u0000\u03aa\u03a7\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001\u0000"+
		"\u0000\u0000\u03ab{\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005u\u0000\u0000"+
		"\u03ad\u03ae\u0003~?\u0000\u03ae\u03af\u0005b\u0000\u0000\u03af\u03b0"+
		"\u0005~\u0000\u0000\u03b0\u03b1\u0005b\u0000\u0000\u03b1\u03b2\u0003~"+
		"?\u0000\u03b2\u03b3\u0005b\u0000\u0000\u03b3\u03b4\u0003~?\u0000\u03b4"+
		"\u03b5\u0005v\u0000\u0000\u03b5}\u0001\u0000\u0000\u0000\u03b6\u03b7\u0007"+
		"\u000e\u0000\u0000\u03b7\u007f\u0001\u0000\u0000\u0000a\u0082\u008a\u0097"+
		"\u009b\u009e\u00a1\u00a4\u00b1\u00b5\u00c1\u00c4\u00c7\u00ca\u0100\u0104"+
		"\u0109\u010c\u010f\u0112\u011a\u0128\u012c\u0131\u0139\u013b\u0148\u0150"+
		"\u015a\u0168\u0173\u017a\u017d\u0188\u018b\u0197\u01a4\u01b2\u01b8\u01bc"+
		"\u01c8\u01cf\u01d7\u01e2\u01e9\u01f1\u01fe\u0210\u021e\u0220\u0224\u022f"+
		"\u0233\u0238\u023e\u0240\u0243\u0249\u024c\u024f\u0253\u0257\u025b\u025d"+
		"\u0266\u0270\u0276\u027a\u0287\u0295\u02b3\u02bc\u02bf\u02c3\u02ce\u02d6"+
		"\u02dc\u02df\u02e4\u02ed\u02ef\u02f7\u02fc\u0301\u0311\u0314\u031b\u0326"+
		"\u032d\u0331\u0380\u0387\u038b\u038f\u0396\u039f\u03a5\u03aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}