// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnectors/v1/resource_info.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public final class ResourceInfoProto {
  private ResourceInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_beyondcorp_appconnectors_v1_ResourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnectors_v1_ResourceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/beyondcorp/appconnectors/" +
      "v1/resource_info.proto\022(google.cloud.bey" +
      "ondcorp.appconnectors.v1\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/protobuf/any.p" +
      "roto\032\037google/protobuf/timestamp.proto\"\376\001" +
      "\n\014ResourceInfo\022\017\n\002id\030\001 \001(\tB\003\340A\002\022F\n\006statu" +
      "s\030\002 \001(\01626.google.cloud.beyondcorp.appcon" +
      "nectors.v1.HealthStatus\022&\n\010resource\030\003 \001(" +
      "\0132\024.google.protobuf.Any\022(\n\004time\030\004 \001(\0132\032." +
      "google.protobuf.Timestamp\022C\n\003sub\030\005 \003(\01326" +
      ".google.cloud.beyondcorp.appconnectors.v" +
      "1.ResourceInfo*i\n\014HealthStatus\022\035\n\031HEALTH" +
      "_STATUS_UNSPECIFIED\020\000\022\013\n\007HEALTHY\020\001\022\r\n\tUN" +
      "HEALTHY\020\002\022\020\n\014UNRESPONSIVE\020\003\022\014\n\010DEGRADED\020" +
      "\004B\237\002\n,com.google.cloud.beyondcorp.appcon" +
      "nectors.v1B\021ResourceInfoProtoP\001ZUgoogle." +
      "golang.org/genproto/googleapis/cloud/bey" +
      "ondcorp/appconnectors/v1;appconnectors\252\002" +
      "(Google.Cloud.BeyondCorp.AppConnectors.V" +
      "1\312\002(Google\\Cloud\\BeyondCorp\\AppConnector" +
      "s\\V1\352\002,Google::Cloud::BeyondCorp::AppCon" +
      "nectors::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_beyondcorp_appconnectors_v1_ResourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_appconnectors_v1_ResourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_beyondcorp_appconnectors_v1_ResourceInfo_descriptor,
        new java.lang.String[] { "Id", "Status", "Resource", "Time", "Sub", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
