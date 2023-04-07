// Generated from /Users/iznauy/研究生/IginX/antlr/src/main/antlr4/cn/edu/tsinghua/iginx/sql/Sql.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code countPointsStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCountPointsStatement(SqlParser.CountPointsStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code countPointsStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCountPointsStatement(SqlParser.CountPointsStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteTimeSeriesStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteTimeSeriesStatement(SqlParser.DeleteTimeSeriesStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteTimeSeriesStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteTimeSeriesStatement(SqlParser.DeleteTimeSeriesStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearDataStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearDataStatement(SqlParser.ClearDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearDataStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearDataStatement(SqlParser.ClearDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTimeSeriesStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTimeSeriesStatement(SqlParser.ShowTimeSeriesStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTimeSeriesStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTimeSeriesStatement(SqlParser.ShowTimeSeriesStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showReplicationStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicationStatement(SqlParser.ShowReplicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showReplicationStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicationStatement(SqlParser.ShowReplicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addStorageEngineStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddStorageEngineStatement(SqlParser.AddStorageEngineStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addStorageEngineStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddStorageEngineStatement(SqlParser.AddStorageEngineStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showClusterInfoStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowClusterInfoStatement(SqlParser.ShowClusterInfoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showClusterInfoStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowClusterInfoStatement(SqlParser.ShowClusterInfoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRegisterTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowRegisterTaskStatement(SqlParser.ShowRegisterTaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRegisterTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowRegisterTaskStatement(SqlParser.ShowRegisterTaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code registerTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRegisterTaskStatement(SqlParser.RegisterTaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code registerTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRegisterTaskStatement(SqlParser.RegisterTaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTaskStatement(SqlParser.DropTaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTaskStatement(SqlParser.DropTaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commitTransformJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommitTransformJobStatement(SqlParser.CommitTransformJobStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commitTransformJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommitTransformJobStatement(SqlParser.CommitTransformJobStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showJobStatusStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowJobStatusStatement(SqlParser.ShowJobStatusStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showJobStatusStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowJobStatusStatement(SqlParser.ShowJobStatusStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cancelJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCancelJobStatement(SqlParser.CancelJobStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cancelJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCancelJobStatement(SqlParser.CancelJobStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showEligibleJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowEligibleJobStatement(SqlParser.ShowEligibleJobStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showEligibleJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowEligibleJobStatement(SqlParser.ShowEligibleJobStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code removeHistoryDataResourceStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRemoveHistoryDataResourceStatement(SqlParser.RemoveHistoryDataResourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code removeHistoryDataResourceStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRemoveHistoryDataResourceStatement(SqlParser.RemoveHistoryDataResourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompactStatement(SqlParser.CompactStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompactStatement(SqlParser.CompactStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#queryClause}.
	 * @param ctx the parse tree
	 */
	void enterQueryClause(SqlParser.QueryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#queryClause}.
	 * @param ctx the parse tree
	 */
	void exitQueryClause(SqlParser.QueryClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SqlParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SqlParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SqlParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SqlParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SqlParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#predicateWithSubquery}.
	 * @param ctx the parse tree
	 */
	void enterPredicateWithSubquery(SqlParser.PredicateWithSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#predicateWithSubquery}.
	 * @param ctx the parse tree
	 */
	void exitPredicateWithSubquery(SqlParser.PredicateWithSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(SqlParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(SqlParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(SqlParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(SqlParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#some}.
	 * @param ctx the parse tree
	 */
	void enterSome(SqlParser.SomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#some}.
	 * @param ctx the parse tree
	 */
	void exitSome(SqlParser.SomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(SqlParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(SqlParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orTagExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrTagExpression(SqlParser.OrTagExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orTagExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrTagExpression(SqlParser.OrTagExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#andTagExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndTagExpression(SqlParser.AndTagExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#andTagExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndTagExpression(SqlParser.AndTagExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tagExpression}.
	 * @param ctx the parse tree
	 */
	void enterTagExpression(SqlParser.TagExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tagExpression}.
	 * @param ctx the parse tree
	 */
	void exitTagExpression(SqlParser.TagExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orPreciseExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrPreciseExpression(SqlParser.OrPreciseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orPreciseExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrPreciseExpression(SqlParser.OrPreciseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#andPreciseExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndPreciseExpression(SqlParser.AndPreciseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#andPreciseExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndPreciseExpression(SqlParser.AndPreciseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#preciseTagExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreciseTagExpression(SqlParser.PreciseTagExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#preciseTagExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreciseTagExpression(SqlParser.PreciseTagExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tagList}.
	 * @param ctx the parse tree
	 */
	void enterTagList(SqlParser.TagListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tagList}.
	 * @param ctx the parse tree
	 */
	void exitTagList(SqlParser.TagListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tagEquation}.
	 * @param ctx the parse tree
	 */
	void enterTagEquation(SqlParser.TagEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tagEquation}.
	 * @param ctx the parse tree
	 */
	void exitTagEquation(SqlParser.TagEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tagKey}.
	 * @param ctx the parse tree
	 */
	void enterTagKey(SqlParser.TagKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tagKey}.
	 * @param ctx the parse tree
	 */
	void exitTagKey(SqlParser.TagKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tagValue}.
	 * @param ctx the parse tree
	 */
	void enterTagValue(SqlParser.TagValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tagValue}.
	 * @param ctx the parse tree
	 */
	void exitTagValue(SqlParser.TagValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterJoinPart(SqlParser.JoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitJoinPart(SqlParser.JoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SqlParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SqlParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#colList}.
	 * @param ctx the parse tree
	 */
	void enterColList(SqlParser.ColListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#colList}.
	 * @param ctx the parse tree
	 */
	void exitColList(SqlParser.ColListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SqlParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SqlParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#specialClause}.
	 * @param ctx the parse tree
	 */
	void enterSpecialClause(SqlParser.SpecialClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#specialClause}.
	 * @param ctx the parse tree
	 */
	void exitSpecialClause(SqlParser.SpecialClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SqlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#downsampleWithLevelClause}.
	 * @param ctx the parse tree
	 */
	void enterDownsampleWithLevelClause(SqlParser.DownsampleWithLevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#downsampleWithLevelClause}.
	 * @param ctx the parse tree
	 */
	void exitDownsampleWithLevelClause(SqlParser.DownsampleWithLevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#downsampleClause}.
	 * @param ctx the parse tree
	 */
	void enterDownsampleClause(SqlParser.DownsampleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#downsampleClause}.
	 * @param ctx the parse tree
	 */
	void exitDownsampleClause(SqlParser.DownsampleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggLen}.
	 * @param ctx the parse tree
	 */
	void enterAggLen(SqlParser.AggLenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggLen}.
	 * @param ctx the parse tree
	 */
	void exitAggLen(SqlParser.AggLenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#aggregateWithLevelClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWithLevelClause(SqlParser.AggregateWithLevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#aggregateWithLevelClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWithLevelClause(SqlParser.AggregateWithLevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#asClause}.
	 * @param ctx the parse tree
	 */
	void enterAsClause(SqlParser.AsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#asClause}.
	 * @param ctx the parse tree
	 */
	void exitAsClause(SqlParser.AsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#timeInterval}.
	 * @param ctx the parse tree
	 */
	void enterTimeInterval(SqlParser.TimeIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#timeInterval}.
	 * @param ctx the parse tree
	 */
	void exitTimeInterval(SqlParser.TimeIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(SqlParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(SqlParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertColumnsSpec}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnsSpec(SqlParser.InsertColumnsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertColumnsSpec}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnsSpec(SqlParser.InsertColumnsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertPath}.
	 * @param ctx the parse tree
	 */
	void enterInsertPath(SqlParser.InsertPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertPath}.
	 * @param ctx the parse tree
	 */
	void exitInsertPath(SqlParser.InsertPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesSpec(SqlParser.InsertValuesSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesSpec(SqlParser.InsertValuesSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertMultiValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertMultiValue(SqlParser.InsertMultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertMultiValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertMultiValue(SqlParser.InsertMultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#storageEngineSpec}.
	 * @param ctx the parse tree
	 */
	void enterStorageEngineSpec(SqlParser.StorageEngineSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#storageEngineSpec}.
	 * @param ctx the parse tree
	 */
	void exitStorageEngineSpec(SqlParser.StorageEngineSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#storageEngine}.
	 * @param ctx the parse tree
	 */
	void enterStorageEngine(SqlParser.StorageEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#storageEngine}.
	 * @param ctx the parse tree
	 */
	void exitStorageEngine(SqlParser.StorageEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#timeValue}.
	 * @param ctx the parse tree
	 */
	void enterTimeValue(SqlParser.TimeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#timeValue}.
	 * @param ctx the parse tree
	 */
	void exitTimeValue(SqlParser.TimeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SqlParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SqlParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#udfType}.
	 * @param ctx the parse tree
	 */
	void enterUdfType(SqlParser.UdfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#udfType}.
	 * @param ctx the parse tree
	 */
	void exitUdfType(SqlParser.UdfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#jobStatus}.
	 * @param ctx the parse tree
	 */
	void enterJobStatus(SqlParser.JobStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#jobStatus}.
	 * @param ctx the parse tree
	 */
	void exitJobStatus(SqlParser.JobStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void enterNodeName(SqlParser.NodeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void exitNodeName(SqlParser.NodeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#valueNode}.
	 * @param ctx the parse tree
	 */
	void enterValueNode(SqlParser.ValueNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#valueNode}.
	 * @param ctx the parse tree
	 */
	void exitValueNode(SqlParser.ValueNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyWords}.
	 * @param ctx the parse tree
	 */
	void enterKeyWords(SqlParser.KeyWordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyWords}.
	 * @param ctx the parse tree
	 */
	void exitKeyWords(SqlParser.KeyWordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dateFormat}.
	 * @param ctx the parse tree
	 */
	void enterDateFormat(SqlParser.DateFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dateFormat}.
	 * @param ctx the parse tree
	 */
	void exitDateFormat(SqlParser.DateFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#booleanClause}.
	 * @param ctx the parse tree
	 */
	void enterBooleanClause(SqlParser.BooleanClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#booleanClause}.
	 * @param ctx the parse tree
	 */
	void exitBooleanClause(SqlParser.BooleanClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dateExpression}.
	 * @param ctx the parse tree
	 */
	void enterDateExpression(SqlParser.DateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dateExpression}.
	 * @param ctx the parse tree
	 */
	void exitDateExpression(SqlParser.DateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#realLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteral(SqlParser.RealLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#realLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteral(SqlParser.RealLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#removedStorageEngine}.
	 * @param ctx the parse tree
	 */
	void enterRemovedStorageEngine(SqlParser.RemovedStorageEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#removedStorageEngine}.
	 * @param ctx the parse tree
	 */
	void exitRemovedStorageEngine(SqlParser.RemovedStorageEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlParser.StringLiteralContext ctx);
}