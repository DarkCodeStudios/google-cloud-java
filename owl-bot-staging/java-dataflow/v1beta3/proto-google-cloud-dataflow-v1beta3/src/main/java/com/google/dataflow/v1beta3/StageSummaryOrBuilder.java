// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/metrics.proto

package com.google.dataflow.v1beta3;

public interface StageSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.StageSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of this stage
   * </pre>
   *
   * <code>string stage_id = 1;</code>
   * @return The stageId.
   */
  java.lang.String getStageId();
  /**
   * <pre>
   * ID of this stage
   * </pre>
   *
   * <code>string stage_id = 1;</code>
   * @return The bytes for stageId.
   */
  com.google.protobuf.ByteString
      getStageIdBytes();

  /**
   * <pre>
   * State of this stage.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ExecutionState state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * State of this stage.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ExecutionState state = 2;</code>
   * @return The state.
   */
  com.google.dataflow.v1beta3.ExecutionState getState();

  /**
   * <pre>
   * Start time of this stage.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Start time of this stage.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Start time of this stage.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * End time of this stage.
   * If the work item is completed, this is the actual end time of the stage.
   * Otherwise, it is the predicted end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * End time of this stage.
   * If the work item is completed, this is the actual end time of the stage.
   * Otherwise, it is the predicted end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * End time of this stage.
   * If the work item is completed, this is the actual end time of the stage.
   * Otherwise, it is the predicted end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Progress for this stage.
   * Only applicable to Batch jobs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ProgressTimeseries progress = 5;</code>
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   * <pre>
   * Progress for this stage.
   * Only applicable to Batch jobs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ProgressTimeseries progress = 5;</code>
   * @return The progress.
   */
  com.google.dataflow.v1beta3.ProgressTimeseries getProgress();
  /**
   * <pre>
   * Progress for this stage.
   * Only applicable to Batch jobs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ProgressTimeseries progress = 5;</code>
   */
  com.google.dataflow.v1beta3.ProgressTimeseriesOrBuilder getProgressOrBuilder();

  /**
   * <pre>
   * Metrics for this stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 6;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.MetricUpdate> 
      getMetricsList();
  /**
   * <pre>
   * Metrics for this stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 6;</code>
   */
  com.google.dataflow.v1beta3.MetricUpdate getMetrics(int index);
  /**
   * <pre>
   * Metrics for this stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 6;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Metrics for this stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 6;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.MetricUpdateOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * Metrics for this stage.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 6;</code>
   */
  com.google.dataflow.v1beta3.MetricUpdateOrBuilder getMetricsOrBuilder(
      int index);
}
