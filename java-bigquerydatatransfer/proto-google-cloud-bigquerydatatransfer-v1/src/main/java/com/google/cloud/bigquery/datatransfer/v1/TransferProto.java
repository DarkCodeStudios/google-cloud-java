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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public final class TransferProto {
  private TransferProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/bigquery/datatransfer/v1/"
          + "transfer.proto\022%google.cloud.bigquery.da"
          + "tatransfer.v1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\034googl"
          + "e/protobuf/struct.proto\032\037google/protobuf"
          + "/timestamp.proto\032\027google/rpc/status.prot"
          + "o\"0\n\020EmailPreferences\022\034\n\024enable_failure_"
          + "email\030\001 \001(\010\"\220\001\n\017ScheduleOptions\022\037\n\027disab"
          + "le_auto_scheduling\030\003 \001(\010\022.\n\nstart_time\030\001"
          + " \001(\0132\032.google.protobuf.Timestamp\022,\n\010end_"
          + "time\030\002 \001(\0132\032.google.protobuf.Timestamp\"("
          + "\n\010UserInfo\022\022\n\005email\030\001 \001(\tH\000\210\001\001B\010\n\006_email"
          + "\"\272\007\n\016TransferConfig\022\014\n\004name\030\001 \001(\t\022 \n\026des"
          + "tination_dataset_id\030\002 \001(\tH\000\022\024\n\014display_n"
          + "ame\030\003 \001(\t\022\026\n\016data_source_id\030\005 \001(\t\022\'\n\006par"
          + "ams\030\t \001(\0132\027.google.protobuf.Struct\022\020\n\010sc"
          + "hedule\030\007 \001(\t\022P\n\020schedule_options\030\030 \001(\01326"
          + ".google.cloud.bigquery.datatransfer.v1.S"
          + "cheduleOptions\022 \n\030data_refresh_window_da"
          + "ys\030\014 \001(\005\022\020\n\010disabled\030\r \001(\010\0225\n\013update_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003\0227\n\rnext_run_time\030\010 \001(\0132\032.google.protob"
          + "uf.TimestampB\004\342A\001\003\022I\n\005state\030\n \001(\01624.goog"
          + "le.cloud.bigquery.datatransfer.v1.Transf"
          + "erStateB\004\342A\001\003\022\017\n\007user_id\030\013 \001(\003\022\034\n\016datase"
          + "t_region\030\016 \001(\tB\004\342A\001\003\022!\n\031notification_pub"
          + "sub_topic\030\017 \001(\t\022R\n\021email_preferences\030\022 \001"
          + "(\01327.google.cloud.bigquery.datatransfer."
          + "v1.EmailPreferences\022N\n\nowner_info\030\033 \001(\0132"
          + "/.google.cloud.bigquery.datatransfer.v1."
          + "UserInfoB\004\342A\001\003H\001\210\001\001:\271\001\352A\265\001\n2bigquerydata"
          + "transfer.googleapis.com/TransferConfig\0224"
          + "projects/{project}/transferConfigs/{tran"
          + "sfer_config}\022Iprojects/{project}/locatio"
          + "ns/{location}/transferConfigs/{transfer_"
          + "config}B\r\n\013destinationB\r\n\013_owner_info\"\203\007"
          + "\n\013TransferRun\022\014\n\004name\030\001 \001(\t\0221\n\rschedule_"
          + "time\030\003 \001(\0132\032.google.protobuf.Timestamp\022,"
          + "\n\010run_time\030\n \001(\0132\032.google.protobuf.Times"
          + "tamp\022(\n\014error_status\030\025 \001(\0132\022.google.rpc."
          + "Status\0224\n\nstart_time\030\004 \001(\0132\032.google.prot"
          + "obuf.TimestampB\004\342A\001\003\0222\n\010end_time\030\005 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\0225\n\013upda"
          + "te_time\030\006 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\022-\n\006params\030\t \001(\0132\027.google.protobu"
          + "f.StructB\004\342A\001\003\022&\n\026destination_dataset_id"
          + "\030\002 \001(\tB\004\342A\001\003H\000\022\034\n\016data_source_id\030\007 \001(\tB\004"
          + "\342A\001\003\022C\n\005state\030\010 \001(\01624.google.cloud.bigqu"
          + "ery.datatransfer.v1.TransferState\022\017\n\007use"
          + "r_id\030\013 \001(\003\022\026\n\010schedule\030\014 \001(\tB\004\342A\001\003\022\'\n\031no"
          + "tification_pubsub_topic\030\027 \001(\tB\004\342A\001\003\022X\n\021e"
          + "mail_preferences\030\031 \001(\01327.google.cloud.bi"
          + "gquery.datatransfer.v1.EmailPreferencesB"
          + "\004\342A\001\003:\304\001\352A\300\001\n\'bigquerydatatransfer.googl"
          + "eapis.com/Run\022?projects/{project}/transf"
          + "erConfigs/{transfer_config}/runs/{run}\022T"
          + "projects/{project}/locations/{location}/"
          + "transferConfigs/{transfer_config}/runs/{"
          + "run}B\r\n\013destination\"\212\002\n\017TransferMessage\022"
          + "0\n\014message_time\030\001 \001(\0132\032.google.protobuf."
          + "Timestamp\022X\n\010severity\030\002 \001(\0162F.google.clo"
          + "ud.bigquery.datatransfer.v1.TransferMess"
          + "age.MessageSeverity\022\024\n\014message_text\030\003 \001("
          + "\t\"U\n\017MessageSeverity\022 \n\034MESSAGE_SEVERITY"
          + "_UNSPECIFIED\020\000\022\010\n\004INFO\020\001\022\013\n\007WARNING\020\002\022\t\n"
          + "\005ERROR\020\003*K\n\014TransferType\022\035\n\031TRANSFER_TYP"
          + "E_UNSPECIFIED\020\000\022\t\n\005BATCH\020\001\022\r\n\tSTREAMING\020"
          + "\002\032\002\030\001*s\n\rTransferState\022\036\n\032TRANSFER_STATE"
          + "_UNSPECIFIED\020\000\022\013\n\007PENDING\020\002\022\013\n\007RUNNING\020\003"
          + "\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAILED\020\005\022\r\n\tCANCELLED"
          + "\020\006B\217\002\n)com.google.cloud.bigquery.datatra"
          + "nsfer.v1B\rTransferProtoP\001ZMcloud.google."
          + "com/go/bigquery/datatransfer/apiv1/datat"
          + "ransferpb;datatransferpb\242\002\005GCBDT\252\002%Googl"
          + "e.Cloud.BigQuery.DataTransfer.V1\312\002%Googl"
          + "e\\Cloud\\BigQuery\\DataTransfer\\V1\352\002)Googl"
          + "e::Cloud::Bigquery::DataTransfer::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor,
            new java.lang.String[] {
              "EnableFailureEmail",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor,
            new java.lang.String[] {
              "DisableAutoScheduling", "StartTime", "EndTime",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_UserInfo_descriptor,
            new java.lang.String[] {
              "Email", "Email",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DestinationDatasetId",
              "DisplayName",
              "DataSourceId",
              "Params",
              "Schedule",
              "ScheduleOptions",
              "DataRefreshWindowDays",
              "Disabled",
              "UpdateTime",
              "NextRunTime",
              "State",
              "UserId",
              "DatasetRegion",
              "NotificationPubsubTopic",
              "EmailPreferences",
              "OwnerInfo",
              "Destination",
              "OwnerInfo",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor,
            new java.lang.String[] {
              "Name",
              "ScheduleTime",
              "RunTime",
              "ErrorStatus",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Params",
              "DestinationDatasetId",
              "DataSourceId",
              "State",
              "UserId",
              "Schedule",
              "NotificationPubsubTopic",
              "EmailPreferences",
              "Destination",
            });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor,
            new java.lang.String[] {
              "MessageTime", "Severity", "MessageText",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
