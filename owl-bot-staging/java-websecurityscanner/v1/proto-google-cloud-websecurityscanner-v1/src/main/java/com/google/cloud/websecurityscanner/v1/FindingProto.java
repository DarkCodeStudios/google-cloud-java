// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding.proto

package com.google.cloud.websecurityscanner.v1;

public final class FindingProto {
  private FindingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_Finding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_Finding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/websecurityscanner/v1/fin" +
      "ding.proto\022\"google.cloud.websecurityscan" +
      "ner.v1\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\0326google/cloud" +
      "/websecurityscanner/v1/finding_addon.pro" +
      "to\"\261\007\n\007Finding\022\014\n\004name\030\001 \001(\t\022\024\n\014finding_" +
      "type\030\002 \001(\t\022K\n\010severity\030\021 \001(\01624.google.cl" +
      "oud.websecurityscanner.v1.Finding.Severi" +
      "tyB\003\340A\003\022\023\n\013http_method\030\003 \001(\t\022\022\n\nfuzzed_u" +
      "rl\030\004 \001(\t\022\014\n\004body\030\005 \001(\t\022\023\n\013description\030\006 " +
      "\001(\t\022\030\n\020reproduction_url\030\007 \001(\t\022\021\n\tframe_u" +
      "rl\030\010 \001(\t\022\021\n\tfinal_url\030\t \001(\t\022\023\n\013tracking_" +
      "id\030\n \001(\t\0226\n\004form\030\020 \001(\0132(.google.cloud.we" +
      "bsecurityscanner.v1.Form\022M\n\020outdated_lib" +
      "rary\030\013 \001(\01323.google.cloud.websecuritysca" +
      "nner.v1.OutdatedLibrary\022Q\n\022violating_res" +
      "ource\030\014 \001(\01325.google.cloud.websecuritysc" +
      "anner.v1.ViolatingResource\022Q\n\022vulnerable" +
      "_headers\030\017 \001(\01325.google.cloud.websecurit" +
      "yscanner.v1.VulnerableHeaders\022W\n\025vulnera" +
      "ble_parameters\030\r \001(\01328.google.cloud.webs" +
      "ecurityscanner.v1.VulnerableParameters\0224" +
      "\n\003xss\030\016 \001(\0132\'.google.cloud.websecuritysc" +
      "anner.v1.Xss\"Q\n\010Severity\022\030\n\024SEVERITY_UNS" +
      "PECIFIED\020\000\022\014\n\010CRITICAL\020\001\022\010\n\004HIGH\020\002\022\n\n\006ME" +
      "DIUM\020\003\022\007\n\003LOW\020\004:\204\001\352A\200\001\n)websecurityscann" +
      "er.googleapis.com/Finding\022Sprojects/{pro" +
      "ject}/scanConfigs/{scan_config}/scanRuns" +
      "/{scan_run}/findings/{finding}B\200\002\n&com.g" +
      "oogle.cloud.websecurityscanner.v1B\014Findi" +
      "ngProtoP\001ZTgoogle.golang.org/genproto/go" +
      "ogleapis/cloud/websecurityscanner/v1;web" +
      "securityscanner\252\002\"Google.Cloud.WebSecuri" +
      "tyScanner.V1\312\002\"Google\\Cloud\\WebSecurityS" +
      "canner\\V1\352\002%Google::Cloud::WebSecuritySc" +
      "anner::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.websecurityscanner.v1.FindingAddonProto.getDescriptor(),
        });
    internal_static_google_cloud_websecurityscanner_v1_Finding_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_Finding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_Finding_descriptor,
        new java.lang.String[] { "Name", "FindingType", "Severity", "HttpMethod", "FuzzedUrl", "Body", "Description", "ReproductionUrl", "FrameUrl", "FinalUrl", "TrackingId", "Form", "OutdatedLibrary", "ViolatingResource", "VulnerableHeaders", "VulnerableParameters", "Xss", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1.FindingAddonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
