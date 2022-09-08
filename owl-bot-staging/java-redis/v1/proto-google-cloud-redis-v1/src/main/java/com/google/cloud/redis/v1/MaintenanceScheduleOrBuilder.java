// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

public interface MaintenanceScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1.MaintenanceSchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The start time of any upcoming scheduled maintenance for this instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Output only. The start time of any upcoming scheduled maintenance for this instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Output only. The start time of any upcoming scheduled maintenance for this instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. The end time of any upcoming scheduled maintenance for this instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. The end time of any upcoming scheduled maintenance for this instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. The end time of any upcoming scheduled maintenance for this instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * If the scheduled maintenance can be rescheduled, default is true.
   * </pre>
   *
   * <code>bool can_reschedule = 3 [deprecated = true];</code>
   * @deprecated google.cloud.redis.v1.MaintenanceSchedule.can_reschedule is deprecated.
   *     See google/cloud/redis/v1/cloud_redis.proto;l=576
   * @return The canReschedule.
   */
  @java.lang.Deprecated boolean getCanReschedule();

  /**
   * <pre>
   * Output only. The deadline that the maintenance schedule start time can not go beyond,
   * including reschedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_deadline_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the scheduleDeadlineTime field is set.
   */
  boolean hasScheduleDeadlineTime();
  /**
   * <pre>
   * Output only. The deadline that the maintenance schedule start time can not go beyond,
   * including reschedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_deadline_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The scheduleDeadlineTime.
   */
  com.google.protobuf.Timestamp getScheduleDeadlineTime();
  /**
   * <pre>
   * Output only. The deadline that the maintenance schedule start time can not go beyond,
   * including reschedule.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_deadline_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleDeadlineTimeOrBuilder();
}
