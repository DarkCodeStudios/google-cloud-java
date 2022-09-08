// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/audience.proto

package com.google.analytics.admin.v1alpha;

public interface AudienceDimensionOrMetricFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A filter for a string-type dimension that matches a particular pattern.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.StringFilter string_filter = 2;</code>
   * @return Whether the stringFilter field is set.
   */
  boolean hasStringFilter();
  /**
   * <pre>
   * A filter for a string-type dimension that matches a particular pattern.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.StringFilter string_filter = 2;</code>
   * @return The stringFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.StringFilter getStringFilter();
  /**
   * <pre>
   * A filter for a string-type dimension that matches a particular pattern.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.StringFilter string_filter = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.StringFilterOrBuilder getStringFilterOrBuilder();

  /**
   * <pre>
   * A filter for a string dimension that matches a particular list of
   * options.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.InListFilter in_list_filter = 3;</code>
   * @return Whether the inListFilter field is set.
   */
  boolean hasInListFilter();
  /**
   * <pre>
   * A filter for a string dimension that matches a particular list of
   * options.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.InListFilter in_list_filter = 3;</code>
   * @return The inListFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.InListFilter getInListFilter();
  /**
   * <pre>
   * A filter for a string dimension that matches a particular list of
   * options.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.InListFilter in_list_filter = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.InListFilterOrBuilder getInListFilterOrBuilder();

  /**
   * <pre>
   * A filter for numeric or date values on a dimension or metric.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.NumericFilter numeric_filter = 4;</code>
   * @return Whether the numericFilter field is set.
   */
  boolean hasNumericFilter();
  /**
   * <pre>
   * A filter for numeric or date values on a dimension or metric.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.NumericFilter numeric_filter = 4;</code>
   * @return The numericFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.NumericFilter getNumericFilter();
  /**
   * <pre>
   * A filter for numeric or date values on a dimension or metric.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.NumericFilter numeric_filter = 4;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.NumericFilterOrBuilder getNumericFilterOrBuilder();

  /**
   * <pre>
   * A filter for numeric or date values between certain values on a dimension
   * or metric.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.BetweenFilter between_filter = 5;</code>
   * @return Whether the betweenFilter field is set.
   */
  boolean hasBetweenFilter();
  /**
   * <pre>
   * A filter for numeric or date values between certain values on a dimension
   * or metric.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.BetweenFilter between_filter = 5;</code>
   * @return The betweenFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.BetweenFilter getBetweenFilter();
  /**
   * <pre>
   * A filter for numeric or date values between certain values on a dimension
   * or metric.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.BetweenFilter between_filter = 5;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.BetweenFilterOrBuilder getBetweenFilterOrBuilder();

  /**
   * <pre>
   * Required. Immutable. The dimension name or metric name to filter.
   * </pre>
   *
   * <code>string field_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   * <pre>
   * Required. Immutable. The dimension name or metric name to filter.
   * </pre>
   *
   * <code>string field_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <pre>
   * Optional. Indicates whether this filter needs dynamic evaluation or not. If set to
   * true, users join the Audience if they ever met the condition (static
   * evaluation). If unset or set to false, user evaluation for an Audience is
   * dynamic; users are added to an Audience when they meet the conditions and
   * then removed when they no longer meet them.
   * This can only be set when Audience scope is ACROSS_ALL_SESSIONS.
   * </pre>
   *
   * <code>bool at_any_point_in_time = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The atAnyPointInTime.
   */
  boolean getAtAnyPointInTime();

  /**
   * <pre>
   * Optional. If set, specifies the time window for which to evaluate data in number of
   * days. If not set, then audience data is evaluated against lifetime data
   * (i.e., infinite time window).
   * For example, if set to 1 day, only the current day's data is evaluated. The
   * reference point is the current day when at_any_point_in_time is unset or
   * false.
   * It can only be set when Audience scope is ACROSS_ALL_SESSIONS and cannot be
   * greater than 60 days.
   * </pre>
   *
   * <code>int32 in_any_n_day_period = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The inAnyNDayPeriod.
   */
  int getInAnyNDayPeriod();

  public com.google.analytics.admin.v1alpha.AudienceDimensionOrMetricFilter.OneFilterCase getOneFilterCase();
}
