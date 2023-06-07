/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/bigquery/migration/v2alpha/migration_entities.proto

package com.google.cloud.bigquery.migration.v2alpha;

public final class MigrationEntitiesProto {
  private MigrationEntitiesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_TasksEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_TasksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationSubtask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationSubtask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/bigquery/migration/v2alph"
          + "a/migration_entities.proto\022\'google.cloud"
          + ".bigquery.migration.v2alpha\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032=google/cloud/bigquery/migration"
          + "/v2alpha/assessment_task.proto\032Egoogle/c"
          + "loud/bigquery/migration/v2alpha/migratio"
          + "n_error_details.proto\032?google/cloud/bigq"
          + "uery/migration/v2alpha/migration_metrics"
          + ".proto\032>google/cloud/bigquery/migration/"
          + "v2alpha/translation_task.proto\032\031google/p"
          + "rotobuf/any.proto\032\037google/protobuf/times"
          + "tamp.proto\032\036google/rpc/error_details.pro"
          + "to\"\202\005\n\021MigrationWorkflow\022\023\n\004name\030\001 \001(\tB\005"
          + "\342A\002\003\005\022\024\n\014display_name\030\006 \001(\t\022T\n\005tasks\030\002 \003"
          + "(\0132E.google.cloud.bigquery.migration.v2a"
          + "lpha.MigrationWorkflow.TasksEntry\022U\n\005sta"
          + "te\030\003 \001(\0162@.google.cloud.bigquery.migrati"
          + "on.v2alpha.MigrationWorkflow.StateB\004\342A\001\003"
          + "\022/\n\013create_time\030\004 \001(\0132\032.google.protobuf."
          + "Timestamp\0224\n\020last_update_time\030\005 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\032d\n\nTasksEntry\022\013\n"
          + "\003key\030\001 \001(\t\022E\n\005value\030\002 \001(\01326.google.cloud"
          + ".bigquery.migration.v2alpha.MigrationTas"
          + "k:\0028\001\"Q\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\t\n"
          + "\005DRAFT\020\001\022\013\n\007RUNNING\020\002\022\n\n\006PAUSED\020\003\022\r\n\tCOM"
          + "PLETED\020\004:u\352Ar\n2bigquerymigration.googlea"
          + "pis.com/MigrationWorkflow\022<projects/{pro"
          + "ject}/locations/{location}/workflows/{wo"
          + "rkflow}\"\203\006\n\rMigrationTask\022a\n\027assessment_"
          + "task_details\030\014 \001(\0132>.google.cloud.bigque"
          + "ry.migration.v2alpha.AssessmentTaskDetai"
          + "lsH\000\022c\n\030translation_task_details\030\r \001(\0132?"
          + ".google.cloud.bigquery.migration.v2alpha"
          + ".TranslationTaskDetailsH\000\022\021\n\002id\030\001 \001(\tB\005\342"
          + "A\002\003\005\022\014\n\004type\030\002 \001(\t\022%\n\007details\030\003 \001(\0132\024.go"
          + "ogle.protobuf.Any\022Q\n\005state\030\004 \001(\0162<.googl"
          + "e.cloud.bigquery.migration.v2alpha.Migra"
          + "tionTask.StateB\004\342A\001\003\0225\n\020processing_error"
          + "\030\005 \001(\0132\025.google.rpc.ErrorInfoB\004\342A\001\003\022/\n\013c"
          + "reate_time\030\006 \001(\0132\032.google.protobuf.Times"
          + "tamp\0224\n\020last_update_time\030\007 \001(\0132\032.google."
          + "protobuf.Timestamp\022m\n\024orchestration_resu"
          + "lt\030\n \001(\0132I.google.cloud.bigquery.migrati"
          + "on.v2alpha.MigrationTaskOrchestrationRes"
          + "ultB\004\342A\001\003\"r\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\013\n\007PENDING\020\001\022\021\n\rORCHESTRATING\020\002\022\013\n\007RUN"
          + "NING\020\003\022\n\n\006PAUSED\020\004\022\r\n\tSUCCEEDED\020\005\022\n\n\006FAI"
          + "LED\020\006B\016\n\014task_details\"\355\005\n\020MigrationSubta"
          + "sk\022\023\n\004name\030\001 \001(\tB\005\342A\002\003\005\022\017\n\007task_id\030\002 \001(\t"
          + "\022\014\n\004type\030\003 \001(\t\022T\n\005state\030\005 \001(\0162?.google.c"
          + "loud.bigquery.migration.v2alpha.Migratio"
          + "nSubtask.StateB\004\342A\001\003\0225\n\020processing_error"
          + "\030\006 \001(\0132\025.google.rpc.ErrorInfoB\004\342A\001\003\022b\n\026r"
          + "esource_error_details\030\014 \003(\0132<.google.clo"
          + "ud.bigquery.migration.v2alpha.ResourceEr"
          + "rorDetailB\004\342A\001\003\022\034\n\024resource_error_count\030"
          + "\r \001(\005\022/\n\013create_time\030\007 \001(\0132\032.google.prot"
          + "obuf.Timestamp\0224\n\020last_update_time\030\010 \001(\013"
          + "2\032.google.protobuf.Timestamp\022D\n\007metrics\030"
          + "\013 \003(\01323.google.cloud.bigquery.migration."
          + "v2alpha.TimeSeries\"^\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\013\n\007RUNNING\020\002\022\r\n\tS"
          + "UCCEEDED\020\003\022\n\n\006FAILED\020\004\022\n\n\006PAUSED\020\005:\210\001\352A\204"
          + "\001\n1bigquerymigration.googleapis.com/Migr"
          + "ationSubtask\022Oprojects/{project}/locatio"
          + "ns/{location}/workflows/{workflow}/subta"
          + "sks/{subtask}\"\232\001\n MigrationTaskOrchestra"
          + "tionResult\022k\n\022assessment_details\030\001 \001(\0132M"
          + ".google.cloud.bigquery.migration.v2alpha"
          + ".AssessmentOrchestrationResultDetailsH\000B"
          + "\t\n\007detailsB\346\001\n+com.google.cloud.bigquery"
          + ".migration.v2alphaB\026MigrationEntitiesPro"
          + "toP\001ZIcloud.google.com/go/bigquery/migra"
          + "tion/apiv2alpha/migrationpb;migrationpb\252"
          + "\002\'Google.Cloud.BigQuery.Migration.V2Alph"
          + "a\312\002\'Google\\Cloud\\BigQuery\\Migration\\V2al"
          + "phab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto.getDescriptor(),
              com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto
                  .getDescriptor(),
              com.google.cloud.bigquery.migration.v2alpha.MigrationMetricsProto.getDescriptor(),
              com.google.cloud.bigquery.migration.v2alpha.TranslationTaskProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.ErrorDetailsProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Tasks", "State", "CreateTime", "LastUpdateTime",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_TasksEntry_descriptor =
        internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_TasksEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_MigrationWorkflow_TasksEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTask_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTask_descriptor,
            new java.lang.String[] {
              "AssessmentTaskDetails",
              "TranslationTaskDetails",
              "Id",
              "Type",
              "Details",
              "State",
              "ProcessingError",
              "CreateTime",
              "LastUpdateTime",
              "OrchestrationResult",
              "TaskDetails",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationSubtask_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationSubtask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_MigrationSubtask_descriptor,
            new java.lang.String[] {
              "Name",
              "TaskId",
              "Type",
              "State",
              "ProcessingError",
              "ResourceErrorDetails",
              "ResourceErrorCount",
              "CreateTime",
              "LastUpdateTime",
              "Metrics",
            });
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_descriptor,
            new java.lang.String[] {
              "AssessmentDetails", "Details",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2alpha.MigrationErrorDetailsProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2alpha.MigrationMetricsProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2alpha.TranslationTaskProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.ErrorDetailsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
