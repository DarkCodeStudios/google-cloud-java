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
// source: google/cloud/dialogflow/v2/environment.proto

package com.google.cloud.dialogflow.v2;

public final class EnvironmentProto {
  private EnvironmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListEnvironmentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListEnvironmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/dialogflow/v2/environment"
          + ".proto\022\032google.cloud.dialogflow.v2\032\034goog"
          + "le/api/annotations.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032\033google/protobuf/empty.proto\032 googl"
          + "e/protobuf/field_mask.proto\032\037google/prot"
          + "obuf/timestamp.proto\032\027google/api/client."
          + "proto\"\367\002\n\013Environment\022\021\n\004name\030\001 \001(\tB\003\340A\003"
          + "\022\030\n\013description\030\002 \001(\tB\003\340A\001\022\032\n\ragent_vers"
          + "ion\030\003 \001(\tB\003\340A\001\022A\n\005state\030\004 \001(\0162-.google.c"
          + "loud.dialogflow.v2.Environment.StateB\003\340A"
          + "\003\0224\n\013update_time\030\005 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\"E\n\005State\022\025\n\021STATE_UNSPEC"
          + "IFIED\020\000\022\013\n\007STOPPED\020\001\022\013\n\007LOADING\020\002\022\013\n\007RUN"
          + "NING\020\003:_\352A\\\n%dialogflow.googleapis.com/E"
          + "nvironment\0223projects/{project}/agent/env"
          + "ironments/{environment}\"\211\001\n\027ListEnvironm"
          + "entsRequest\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\022%dia"
          + "logflow.googleapis.com/Environment\022\026\n\tpa"
          + "ge_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003"
          + "\340A\001\"r\n\030ListEnvironmentsResponse\022=\n\014envir"
          + "onments\030\001 \003(\0132\'.google.cloud.dialogflow."
          + "v2.Environment\022\027\n\017next_page_token\030\002 \001(\t2"
          + "\274\002\n\014Environments\022\261\001\n\020ListEnvironments\0223."
          + "google.cloud.dialogflow.v2.ListEnvironme"
          + "ntsRequest\0324.google.cloud.dialogflow.v2."
          + "ListEnvironmentsResponse\"2\202\323\344\223\002,\022*/v2/{p"
          + "arent=projects/*/agent}/environments\032x\312A"
          + "\031dialogflow.googleapis.com\322AYhttps://www"
          + ".googleapis.com/auth/cloud-platform,http"
          + "s://www.googleapis.com/auth/dialogflowB\237"
          + "\001\n\036com.google.cloud.dialogflow.v2B\020Envir"
          + "onmentProtoP\001ZDgoogle.golang.org/genprot"
          + "o/googleapis/cloud/dialogflow/v2;dialogf"
          + "low\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Environment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Environment_descriptor,
            new java.lang.String[] {
              "Name", "Description", "AgentVersion", "State", "UpdateTime",
            });
    internal_static_google_cloud_dialogflow_v2_ListEnvironmentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListEnvironmentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListEnvironmentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListEnvironmentsResponse_descriptor,
            new java.lang.String[] {
              "Environments", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
