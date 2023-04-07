// Generated from /Users/iznauy/研究生/IginX/antlr/src/main/antlr4/cn/edu/tsinghua/iginx/sql/Sql.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(SqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(SqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SqlParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code countPointsStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountPointsStatement(SqlParser.CountPointsStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteTimeSeriesStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteTimeSeriesStatement(SqlParser.DeleteTimeSeriesStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearDataStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearDataStatement(SqlParser.ClearDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTimeSeriesStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTimeSeriesStatement(SqlParser.ShowTimeSeriesStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showReplicationStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowReplicationStatement(SqlParser.ShowReplicationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addStorageEngineStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStorageEngineStatement(SqlParser.AddStorageEngineStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showClusterInfoStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowClusterInfoStatement(SqlParser.ShowClusterInfoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRegisterTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRegisterTaskStatement(SqlParser.ShowRegisterTaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code registerTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterTaskStatement(SqlParser.RegisterTaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTaskStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTaskStatement(SqlParser.DropTaskStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commitTransformJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitTransformJobStatement(SqlParser.CommitTransformJobStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showJobStatusStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowJobStatusStatement(SqlParser.ShowJobStatusStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cancelJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancelJobStatement(SqlParser.CancelJobStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showEligibleJobStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEligibleJobStatement(SqlParser.ShowEligibleJobStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code removeHistoryDataResourceStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveHistoryDataResourceStatement(SqlParser.RemoveHistoryDataResourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactStatement}
	 * labeled alternative in {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactStatement(SqlParser.CompactStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#queryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryClause(SqlParser.QueryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SqlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SqlParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(SqlParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(SqlParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#predicateWithSubquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateWithSubquery(SqlParser.PredicateWithSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(SqlParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(SqlParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#some}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome(SqlParser.SomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(SqlParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orTagExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrTagExpression(SqlParser.OrTagExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andTagExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndTagExpression(SqlParser.AndTagExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tagExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagExpression(SqlParser.TagExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orPreciseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPreciseExpression(SqlParser.OrPreciseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#andPreciseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPreciseExpression(SqlParser.AndPreciseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#preciseTagExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreciseTagExpression(SqlParser.PreciseTagExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tagList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagList(SqlParser.TagListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tagEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagEquation(SqlParser.TagEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tagKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagKey(SqlParser.TagKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tagValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagValue(SqlParser.TagValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPart(SqlParser.JoinPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(SqlParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColList(SqlParser.ColListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(SqlParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#specialClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialClause(SqlParser.SpecialClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(SqlParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SqlParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(SqlParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#downsampleWithLevelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDownsampleWithLevelClause(SqlParser.DownsampleWithLevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#downsampleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDownsampleClause(SqlParser.DownsampleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggLen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggLen(SqlParser.AggLenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggregateWithLevelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWithLevelClause(SqlParser.AggregateWithLevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#asClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsClause(SqlParser.AsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timeInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeInterval(SqlParser.TimeIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(SqlParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertColumnsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnsSpec(SqlParser.InsertColumnsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertPath(SqlParser.InsertPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertValuesSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesSpec(SqlParser.InsertValuesSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertMultiValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertMultiValue(SqlParser.InsertMultiValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#storageEngineSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageEngineSpec(SqlParser.StorageEngineSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#storageEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageEngine(SqlParser.StorageEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeValue(SqlParser.TimeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(SqlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#udfType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfType(SqlParser.UdfTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#jobStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobStatus(SqlParser.JobStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#nodeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeName(SqlParser.NodeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#valueNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNode(SqlParser.ValueNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyWords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyWords(SqlParser.KeyWordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dateFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateFormat(SqlParser.DateFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#booleanClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanClause(SqlParser.BooleanClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateExpression(SqlParser.DateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#realLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteral(SqlParser.RealLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removedStorageEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemovedStorageEngine(SqlParser.RemovedStorageEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SqlParser.StringLiteralContext ctx);
}