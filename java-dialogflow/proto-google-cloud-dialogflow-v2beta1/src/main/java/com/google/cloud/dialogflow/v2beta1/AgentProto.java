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
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SubAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dialogflow/v2beta1/agent."
          + "proto\022\037google.cloud.dialogflow.v2beta1\032\034"
          + "google/api/annotations.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0321google/cloud/dialogflow/v2beta"
          + "1/environment.proto\0327google/cloud/dialog"
          + "flow/v2beta1/validation_result.proto\032#go"
          + "ogle/longrunning/operations.proto\032\033googl"
          + "e/protobuf/empty.proto\032 google/protobuf/"
          + "field_mask.proto\032\027google/api/client.prot"
          + "o\"\302\006\n\005Agent\022\016\n\006parent\030\001 \001(\t\022\024\n\014display_n"
          + "ame\030\002 \001(\t\022\035\n\025default_language_code\030\003 \001(\t"
          + "\022 \n\030supported_language_codes\030\004 \003(\t\022\021\n\tti"
          + "me_zone\030\005 \001(\t\022\023\n\013description\030\006 \001(\t\022\022\n\nav"
          + "atar_uri\030\007 \001(\t\022\026\n\016enable_logging\030\010 \001(\010\022D"
          + "\n\nmatch_mode\030\t \001(\01620.google.cloud.dialog"
          + "flow.v2beta1.Agent.MatchMode\022 \n\030classifi"
          + "cation_threshold\030\n \001(\002\022F\n\013api_version\030\016 "
          + "\001(\01621.google.cloud.dialogflow.v2beta1.Ag"
          + "ent.ApiVersion\0229\n\004tier\030\017 \001(\0162+.google.cl"
          + "oud.dialogflow.v2beta1.Agent.Tier\"V\n\tMat"
          + "chMode\022\032\n\026MATCH_MODE_UNSPECIFIED\020\000\022\025\n\021MA"
          + "TCH_MODE_HYBRID\020\001\022\026\n\022MATCH_MODE_ML_ONLY\020"
          + "\002\"l\n\nApiVersion\022\033\n\027API_VERSION_UNSPECIFI"
          + "ED\020\000\022\022\n\016API_VERSION_V1\020\001\022\022\n\016API_VERSION_"
          + "V2\020\002\022\031\n\025API_VERSION_V2_BETA_1\020\003\"^\n\004Tier\022"
          + "\024\n\020TIER_UNSPECIFIED\020\000\022\021\n\rTIER_STANDARD\020\001"
          + "\022\023\n\017TIER_ENTERPRISE\020\002\022\030\n\024TIER_ENTERPRISE"
          + "_PLUS\020\003:m\352Aj\n\037dialogflow.googleapis.com/"
          + "Agent\022\030projects/{project}/agent\022-project"
          + "s/{project}/locations/{location}/agent\"!"
          + "\n\017GetAgentRequest\022\016\n\006parent\030\001 \001(\t\"y\n\017Set"
          + "AgentRequest\0225\n\005agent\030\001 \001(\0132&.google.clo"
          + "ud.dialogflow.v2beta1.Agent\022/\n\013update_ma"
          + "sk\030\002 \001(\0132\032.google.protobuf.FieldMask\"$\n\022"
          + "DeleteAgentRequest\022\016\n\006parent\030\001 \001(\t\"0\n\010Su"
          + "bAgent\022\017\n\007project\030\001 \001(\t\022\023\n\013environment\030\002"
          + " \001(\t\"L\n\023SearchAgentsRequest\022\016\n\006parent\030\001 "
          + "\001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"g\n\024SearchAgentsResponse\0226\n\006agents\030\001 \003"
          + "(\0132&.google.cloud.dialogflow.v2beta1.Age"
          + "nt\022\027\n\017next_page_token\030\002 \001(\t\"#\n\021TrainAgen"
          + "tRequest\022\016\n\006parent\030\001 \001(\t\"7\n\022ExportAgentR"
          + "equest\022\016\n\006parent\030\001 \001(\t\022\021\n\tagent_uri\030\002 \001("
          + "\t\"L\n\023ExportAgentResponse\022\023\n\tagent_uri\030\001 "
          + "\001(\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000B\007\n\005agent\""
          + "[\n\022ImportAgentRequest\022\016\n\006parent\030\001 \001(\t\022\023\n"
          + "\tagent_uri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001("
          + "\014H\000B\007\n\005agent\"\\\n\023RestoreAgentRequest\022\016\n\006p"
          + "arent\030\001 \001(\t\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027\n\ragen"
          + "t_content\030\003 \001(\014H\000B\007\n\005agent\"M\n\032GetValidat"
          + "ionResultRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\032\n"
          + "\rlanguage_code\030\003 \001(\tB\003\340A\0012\257\017\n\006Agents\022\302\001\n"
          + "\010GetAgent\0220.google.cloud.dialogflow.v2be"
          + "ta1.GetAgentRequest\032&.google.cloud.dialo"
          + "gflow.v2beta1.Agent\"\\\202\323\344\223\002V\022\"/v2beta1/{p"
          + "arent=projects/*}/agentZ0\022./v2beta1/{par"
          + "ent=projects/*/locations/*}/agent\022\334\001\n\010Se"
          + "tAgent\0220.google.cloud.dialogflow.v2beta1"
          + ".SetAgentRequest\032&.google.cloud.dialogfl"
          + "ow.v2beta1.Agent\"v\202\323\344\223\002p\"(/v2beta1/{agen"
          + "t.parent=projects/*}/agent:\005agentZ=\"4/v2"
          + "beta1/{agent.parent=projects/*/locations"
          + "/*}/agent:\005agent\022\270\001\n\013DeleteAgent\0223.googl"
          + "e.cloud.dialogflow.v2beta1.DeleteAgentRe"
          + "quest\032\026.google.protobuf.Empty\"\\\202\323\344\223\002V*\"/"
          + "v2beta1/{parent=projects/*}/agentZ0*./v2"
          + "beta1/{parent=projects/*/locations/*}/ag"
          + "ent\022\256\001\n\014SearchAgents\0224.google.cloud.dial"
          + "ogflow.v2beta1.SearchAgentsRequest\0325.goo"
          + "gle.cloud.dialogflow.v2beta1.SearchAgent"
          + "sResponse\"1\202\323\344\223\002+\022)/v2beta1/{parent=proj"
          + "ects/*}/agent:search\022\317\001\n\nTrainAgent\0222.go"
          + "ogle.cloud.dialogflow.v2beta1.TrainAgent"
          + "Request\032\035.google.longrunning.Operation\"n"
          + "\202\323\344\223\002h\"(/v2beta1/{parent=projects/*}/age"
          + "nt:train:\001*Z9\"4/v2beta1/{parent=projects"
          + "/*/locations/*}/agent:train:\001*\022\323\001\n\013Expor"
          + "tAgent\0223.google.cloud.dialogflow.v2beta1"
          + ".ExportAgentRequest\032\035.google.longrunning"
          + ".Operation\"p\202\323\344\223\002j\")/v2beta1/{parent=pro"
          + "jects/*}/agent:export:\001*Z:\"5/v2beta1/{pa"
          + "rent=projects/*/locations/*}/agent:expor"
          + "t:\001*\022\323\001\n\013ImportAgent\0223.google.cloud.dial"
          + "ogflow.v2beta1.ImportAgentRequest\032\035.goog"
          + "le.longrunning.Operation\"p\202\323\344\223\002j\")/v2bet"
          + "a1/{parent=projects/*}/agent:import:\001*Z:"
          + "\"5/v2beta1/{parent=projects/*/locations/"
          + "*}/agent:import:\001*\022\327\001\n\014RestoreAgent\0224.go"
          + "ogle.cloud.dialogflow.v2beta1.RestoreAge"
          + "ntRequest\032\035.google.longrunning.Operation"
          + "\"r\202\323\344\223\002l\"*/v2beta1/{parent=projects/*}/a"
          + "gent:restore:\001*Z;\"6/v2beta1/{parent=proj"
          + "ects/*/locations/*}/agent:restore:\001*\022\302\001\n"
          + "\023GetValidationResult\022;.google.cloud.dial"
          + "ogflow.v2beta1.GetValidationResultReques"
          + "t\0321.google.cloud.dialogflow.v2beta1.Vali"
          + "dationResult\";\202\323\344\223\0025\0223/v2beta1/{parent=p"
          + "rojects/*}/agent/validationResult\032x\312A\031di"
          + "alogflow.googleapis.com\322AYhttps://www.go"
          + "ogleapis.com/auth/cloud-platform,https:/"
          + "/www.googleapis.com/auth/dialogflowB\250\001\n#"
          + "com.google.cloud.dialogflow.v2beta1B\nAge"
          + "ntProtoP\001ZIgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/dialogflow/v2beta1;dialog"
          + "flow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V"
          + "2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.EnvironmentProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.ValidationResultProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor,
            new java.lang.String[] {
              "Parent",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "EnableLogging",
              "MatchMode",
              "ClassificationThreshold",
              "ApiVersion",
              "Tier",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SetAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_SubAgent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor,
            new java.lang.String[] {
              "Project", "Environment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.EnvironmentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ValidationResultProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
