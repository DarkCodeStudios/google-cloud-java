// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_object_tracking.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLVideoObjectTrackingProto {
  private AutoMLVideoObjectTrackingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n[google/cloud/aiplatform/v1/schema/trai" +
      "ningjob/definition/automl_video_object_t" +
      "racking.proto\0228google.cloud.aiplatform.v" +
      "1.schema.trainingjob.definition\"\206\001\n\031Auto" +
      "MlVideoObjectTracking\022i\n\006inputs\030\001 \001(\0132Y." +
      "google.cloud.aiplatform.v1.schema.traini" +
      "ngjob.definition.AutoMlVideoObjectTracki" +
      "ngInputs\"\345\002\n\037AutoMlVideoObjectTrackingIn" +
      "puts\022w\n\nmodel_type\030\001 \001(\0162c.google.cloud." +
      "aiplatform.v1.schema.trainingjob.definit" +
      "ion.AutoMlVideoObjectTrackingInputs.Mode" +
      "lType\"\310\001\n\tModelType\022\032\n\026MODEL_TYPE_UNSPEC" +
      "IFIED\020\000\022\t\n\005CLOUD\020\001\022\026\n\022MOBILE_VERSATILE_1" +
      "\020\002\022\034\n\030MOBILE_CORAL_VERSATILE_1\020\003\022\036\n\032MOBI" +
      "LE_CORAL_LOW_LATENCY_1\020\004\022\035\n\031MOBILE_JETSO" +
      "N_VERSATILE_1\020\005\022\037\n\033MOBILE_JETSON_LOW_LAT" +
      "ENCY_1\020\006B\373\002\n<com.google.cloud.aiplatform" +
      ".v1.schema.trainingjob.definitionB\036AutoM" +
      "LVideoObjectTrackingProtoP\001Zbgoogle.gola" +
      "ng.org/genproto/googleapis/cloud/aiplatf" +
      "orm/v1/schema/trainingjob/definition;def" +
      "inition\252\0028Google.Cloud.AIPlatform.V1.Sch" +
      "ema.TrainingJob.Definition\312\0028Google\\Clou" +
      "d\\AIPlatform\\V1\\Schema\\TrainingJob\\Defin" +
      "ition\352\002>Google::Cloud::AIPlatform::V1::S" +
      "chema::TrainingJob::Definitionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTracking_descriptor,
        new java.lang.String[] { "Inputs", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoObjectTrackingInputs_descriptor,
        new java.lang.String[] { "ModelType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
