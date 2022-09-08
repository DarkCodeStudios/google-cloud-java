// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * The reservation_id must only contain lower case alphanumeric characters or
   * dashes. It must start with a letter and must not end with a dash. Its
   * maximum length is 64 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * The reservation_id must only contain lower case alphanumeric characters or
   * dashes. It must start with a letter and must not end with a dash. Its
   * maximum length is 64 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Minimum slots available to this reservation. A slot is a unit of
   * computational power in BigQuery, and serves as the unit of parallelism.
   * Queries using this reservation might use more slots during runtime if
   * ignore_idle_slots is set to false.
   * If the new reservation's slot capacity exceeds the project's slot capacity
   * or if total slot capacity of the new reservation and its siblings exceeds
   * the project's slot capacity, the request will fail with
   * `google.rpc.Code.RESOURCE_EXHAUSTED`.
   * NOTE: for reservations in US or EU multi-regions, slot capacity constraints
   * are checked separately for default and auxiliary regions. See
   * multi_region_auxiliary flag for more details.
   * </pre>
   *
   * <code>int64 slot_capacity = 2;</code>
   * @return The slotCapacity.
   */
  long getSlotCapacity();

  /**
   * <pre>
   * If false, any query or pipeline job using this reservation will use idle
   * slots from other reservations within the same admin project. If true, a
   * query or pipeline job using this reservation will execute with the slot
   * capacity specified in the slot_capacity field at most.
   * </pre>
   *
   * <code>bool ignore_idle_slots = 4;</code>
   * @return The ignoreIdleSlots.
   */
  boolean getIgnoreIdleSlots();

  /**
   * <pre>
   * Maximum number of queries that are allowed to run concurrently in this
   * reservation. This is a soft limit due to asynchronous nature of the system
   * and various optimizations for small queries.
   * Default value is 0 which means that concurrency will be automatically set
   * based on the reservation size.
   * </pre>
   *
   * <code>int64 concurrency = 16;</code>
   * @return The concurrency.
   */
  long getConcurrency();

  /**
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the creationTime field is set.
   */
  boolean hasCreationTime();
  /**
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creationTime.
   */
  com.google.protobuf.Timestamp getCreationTime();
  /**
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimeOrBuilder();

  /**
   * <pre>
   * Output only. Last update time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Last update time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Last update time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Applicable only for reservations located within one of the BigQuery
   * multi-regions (US or EU).
   * If set to true, this reservation is placed in the organization's
   * secondary region which is designated for disaster recovery purposes.
   * If false, this reservation is placed in the organization's default region.
   * </pre>
   *
   * <code>bool multi_region_auxiliary = 14;</code>
   * @return The multiRegionAuxiliary.
   */
  boolean getMultiRegionAuxiliary();
}
