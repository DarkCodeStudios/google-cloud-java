/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/backup_plan.proto

package com.google.cloud.gkebackup.v1;

public interface BackupPlanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.BackupPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The full name of the BackupPlan resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The full name of the BackupPlan resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this BackupPlan resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this BackupPlan resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this BackupPlan resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this BackupPlan resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this BackupPlan resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this BackupPlan resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User specified descriptive string for this BackupPlan.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User specified descriptive string for this BackupPlan.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The source cluster from which Backups will be created
   * via this BackupPlan. Valid formats:
   *
   * - `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`
   * - `projects/&#42;&#47;zones/&#42;&#47;clusters/&#42;`
   * </pre>
   *
   * <code>
   * string cluster = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The source cluster from which Backups will be created
   * via this BackupPlan. Valid formats:
   *
   * - `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`
   * - `projects/&#42;&#47;zones/&#42;&#47;clusters/&#42;`
   * </pre>
   *
   * <code>
   * string cluster = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * RetentionPolicy governs lifecycle of Backups created under this plan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.RetentionPolicy retention_policy = 7;</code>
   *
   * @return Whether the retentionPolicy field is set.
   */
  boolean hasRetentionPolicy();
  /**
   *
   *
   * <pre>
   * RetentionPolicy governs lifecycle of Backups created under this plan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.RetentionPolicy retention_policy = 7;</code>
   *
   * @return The retentionPolicy.
   */
  com.google.cloud.gkebackup.v1.BackupPlan.RetentionPolicy getRetentionPolicy();
  /**
   *
   *
   * <pre>
   * RetentionPolicy governs lifecycle of Backups created under this plan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.RetentionPolicy retention_policy = 7;</code>
   */
  com.google.cloud.gkebackup.v1.BackupPlan.RetentionPolicyOrBuilder getRetentionPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Defines a schedule for automatic Backup creation via this BackupPlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.Schedule backup_schedule = 9;</code>
   *
   * @return Whether the backupSchedule field is set.
   */
  boolean hasBackupSchedule();
  /**
   *
   *
   * <pre>
   * Defines a schedule for automatic Backup creation via this BackupPlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.Schedule backup_schedule = 9;</code>
   *
   * @return The backupSchedule.
   */
  com.google.cloud.gkebackup.v1.BackupPlan.Schedule getBackupSchedule();
  /**
   *
   *
   * <pre>
   * Defines a schedule for automatic Backup creation via this BackupPlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.Schedule backup_schedule = 9;</code>
   */
  com.google.cloud.gkebackup.v1.BackupPlan.ScheduleOrBuilder getBackupScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a backup plan from overwriting each
   * other. It is strongly suggested that systems make use of the 'etag' in the
   * read-modify-write cycle to perform BackupPlan updates in order to avoid
   * race conditions: An `etag` is returned in the response to `GetBackupPlan`,
   * and systems are expected to put that etag in the request to
   * `UpdateBackupPlan` or `DeleteBackupPlan` to ensure that their change
   * will be applied to the same version of the resource.
   * </pre>
   *
   * <code>string etag = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a backup plan from overwriting each
   * other. It is strongly suggested that systems make use of the 'etag' in the
   * read-modify-write cycle to perform BackupPlan updates in order to avoid
   * race conditions: An `etag` is returned in the response to `GetBackupPlan`,
   * and systems are expected to put that etag in the request to
   * `UpdateBackupPlan` or `DeleteBackupPlan` to ensure that their change
   * will be applied to the same version of the resource.
   * </pre>
   *
   * <code>string etag = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * This flag indicates whether this BackupPlan has been deactivated.
   * Setting this field to True locks the BackupPlan such that no further
   * updates will be allowed (except deletes), including the deactivated field
   * itself. It also prevents any new Backups from being created via this
   * BackupPlan (including scheduled Backups).
   *
   * Default: False
   * </pre>
   *
   * <code>bool deactivated = 11;</code>
   *
   * @return The deactivated.
   */
  boolean getDeactivated();

  /**
   *
   *
   * <pre>
   * Defines the configuration of Backups created via this BackupPlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.BackupConfig backup_config = 12;</code>
   *
   * @return Whether the backupConfig field is set.
   */
  boolean hasBackupConfig();
  /**
   *
   *
   * <pre>
   * Defines the configuration of Backups created via this BackupPlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.BackupConfig backup_config = 12;</code>
   *
   * @return The backupConfig.
   */
  com.google.cloud.gkebackup.v1.BackupPlan.BackupConfig getBackupConfig();
  /**
   *
   *
   * <pre>
   * Defines the configuration of Backups created via this BackupPlan.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.BackupPlan.BackupConfig backup_config = 12;</code>
   */
  com.google.cloud.gkebackup.v1.BackupPlan.BackupConfigOrBuilder getBackupConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The number of Kubernetes Pods backed up in the
   * last successful Backup created via this BackupPlan.
   * </pre>
   *
   * <code>int32 protected_pod_count = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The protectedPodCount.
   */
  int getProtectedPodCount();

  /**
   *
   *
   * <pre>
   * Output only. State of the BackupPlan. This State field reflects the
   * various stages a BackupPlan can be in
   * during the Create operation. It will be set to "DEACTIVATED"
   * if the BackupPlan is deactivated on an Update
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.BackupPlan.State state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the BackupPlan. This State field reflects the
   * various stages a BackupPlan can be in
   * during the Create operation. It will be set to "DEACTIVATED"
   * if the BackupPlan is deactivated on an Update
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.BackupPlan.State state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkebackup.v1.BackupPlan.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Human-readable description of why BackupPlan is in the current
   * `state`
   * </pre>
   *
   * <code>string state_reason = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateReason.
   */
  java.lang.String getStateReason();
  /**
   *
   *
   * <pre>
   * Output only. Human-readable description of why BackupPlan is in the current
   * `state`
   * </pre>
   *
   * <code>string state_reason = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateReason.
   */
  com.google.protobuf.ByteString getStateReasonBytes();
}
