// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/data.proto

package com.google.analytics.data.v1beta;

public interface OrderByOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.OrderBy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.MetricOrderBy metric = 1;</code>
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.MetricOrderBy metric = 1;</code>
   * @return The metric.
   */
  com.google.analytics.data.v1beta.OrderBy.MetricOrderBy getMetric();
  /**
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.MetricOrderBy metric = 1;</code>
   */
  com.google.analytics.data.v1beta.OrderBy.MetricOrderByOrBuilder getMetricOrBuilder();

  /**
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.DimensionOrderBy dimension = 2;</code>
   * @return Whether the dimension field is set.
   */
  boolean hasDimension();
  /**
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.DimensionOrderBy dimension = 2;</code>
   * @return The dimension.
   */
  com.google.analytics.data.v1beta.OrderBy.DimensionOrderBy getDimension();
  /**
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.DimensionOrderBy dimension = 2;</code>
   */
  com.google.analytics.data.v1beta.OrderBy.DimensionOrderByOrBuilder getDimensionOrBuilder();

  /**
   * <pre>
   * Sorts results by a metric's values within a pivot column group.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.PivotOrderBy pivot = 3;</code>
   * @return Whether the pivot field is set.
   */
  boolean hasPivot();
  /**
   * <pre>
   * Sorts results by a metric's values within a pivot column group.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.PivotOrderBy pivot = 3;</code>
   * @return The pivot.
   */
  com.google.analytics.data.v1beta.OrderBy.PivotOrderBy getPivot();
  /**
   * <pre>
   * Sorts results by a metric's values within a pivot column group.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.OrderBy.PivotOrderBy pivot = 3;</code>
   */
  com.google.analytics.data.v1beta.OrderBy.PivotOrderByOrBuilder getPivotOrBuilder();

  /**
   * <pre>
   * If true, sorts by descending order.
   * </pre>
   *
   * <code>bool desc = 4;</code>
   * @return The desc.
   */
  boolean getDesc();

  public com.google.analytics.data.v1beta.OrderBy.OneOrderByCase getOneOrderByCase();
}
