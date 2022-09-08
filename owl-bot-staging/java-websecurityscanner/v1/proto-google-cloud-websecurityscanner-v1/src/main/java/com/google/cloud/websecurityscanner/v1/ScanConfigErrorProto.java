// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/scan_config_error.proto

package com.google.cloud.websecurityscanner.v1;

public final class ScanConfigErrorProto {
  private ScanConfigErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_ScanConfigError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ScanConfigError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/websecurityscanner/v1/sca" +
      "n_config_error.proto\022\"google.cloud.webse" +
      "curityscanner.v1\"\351\013\n\017ScanConfigError\022F\n\004" +
      "code\030\001 \001(\01628.google.cloud.websecuritysca" +
      "nner.v1.ScanConfigError.Code\022\022\n\nfield_na" +
      "me\030\002 \001(\t\"\371\n\n\004Code\022\024\n\020CODE_UNSPECIFIED\020\000\022" +
      "\006\n\002OK\020\000\022\022\n\016INTERNAL_ERROR\020\001\022\037\n\033APPENGINE" +
      "_API_BACKEND_ERROR\020\002\022 \n\034APPENGINE_API_NO" +
      "T_ACCESSIBLE\020\003\022\"\n\036APPENGINE_DEFAULT_HOST" +
      "_MISSING\020\004\022!\n\035CANNOT_USE_GOOGLE_COM_ACCO" +
      "UNT\020\006\022\034\n\030CANNOT_USE_OWNER_ACCOUNT\020\007\022\035\n\031C" +
      "OMPUTE_API_BACKEND_ERROR\020\010\022\036\n\032COMPUTE_AP" +
      "I_NOT_ACCESSIBLE\020\t\0227\n3CUSTOM_LOGIN_URL_D" +
      "OES_NOT_BELONG_TO_CURRENT_PROJECT\020\n\022\036\n\032C" +
      "USTOM_LOGIN_URL_MALFORMED\020\013\0223\n/CUSTOM_LO" +
      "GIN_URL_MAPPED_TO_NON_ROUTABLE_ADDRESS\020\014" +
      "\0221\n-CUSTOM_LOGIN_URL_MAPPED_TO_UNRESERVE" +
      "D_ADDRESS\020\r\0220\n,CUSTOM_LOGIN_URL_HAS_NON_" +
      "ROUTABLE_IP_ADDRESS\020\016\022.\n*CUSTOM_LOGIN_UR" +
      "L_HAS_UNRESERVED_IP_ADDRESS\020\017\022\027\n\023DUPLICA" +
      "TE_SCAN_NAME\020\020\022\027\n\023INVALID_FIELD_VALUE\020\022\022" +
      "$\n FAILED_TO_AUTHENTICATE_TO_TARGET\020\023\022\034\n" +
      "\030FINDING_TYPE_UNSPECIFIED\020\024\022\035\n\031FORBIDDEN" +
      "_TO_SCAN_COMPUTE\020\025\022$\n FORBIDDEN_UPDATE_T" +
      "O_MANAGED_SCAN\020+\022\024\n\020MALFORMED_FILTER\020\026\022\033" +
      "\n\027MALFORMED_RESOURCE_NAME\020\027\022\024\n\020PROJECT_I" +
      "NACTIVE\020\030\022\022\n\016REQUIRED_FIELD\020\031\022\036\n\032RESOURC" +
      "E_NAME_INCONSISTENT\020\032\022\030\n\024SCAN_ALREADY_RU" +
      "NNING\020\033\022\024\n\020SCAN_NOT_RUNNING\020\034\022/\n+SEED_UR" +
      "L_DOES_NOT_BELONG_TO_CURRENT_PROJECT\020\035\022\026" +
      "\n\022SEED_URL_MALFORMED\020\036\022+\n\'SEED_URL_MAPPE" +
      "D_TO_NON_ROUTABLE_ADDRESS\020\037\022)\n%SEED_URL_" +
      "MAPPED_TO_UNRESERVED_ADDRESS\020 \022(\n$SEED_U" +
      "RL_HAS_NON_ROUTABLE_IP_ADDRESS\020!\022&\n\"SEED" +
      "_URL_HAS_UNRESERVED_IP_ADDRESS\020#\022\"\n\036SERV" +
      "ICE_ACCOUNT_NOT_CONFIGURED\020$\022\022\n\016TOO_MANY" +
      "_SCANS\020%\022\"\n\036UNABLE_TO_RESOLVE_PROJECT_IN" +
      "FO\020&\022(\n$UNSUPPORTED_BLACKLIST_PATTERN_FO" +
      "RMAT\020\'\022\026\n\022UNSUPPORTED_FILTER\020(\022\034\n\030UNSUPP" +
      "ORTED_FINDING_TYPE\020)\022\032\n\026UNSUPPORTED_URL_" +
      "SCHEME\020*\032\002\020\001B\210\002\n&com.google.cloud.websec" +
      "urityscanner.v1B\024ScanConfigErrorProtoP\001Z" +
      "Tgoogle.golang.org/genproto/googleapis/c" +
      "loud/websecurityscanner/v1;websecuritysc" +
      "anner\252\002\"Google.Cloud.WebSecurityScanner." +
      "V1\312\002\"Google\\Cloud\\WebSecurityScanner\\V1\352" +
      "\002%Google::Cloud::WebSecurityScanner::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_websecurityscanner_v1_ScanConfigError_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_ScanConfigError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_ScanConfigError_descriptor,
        new java.lang.String[] { "Code", "FieldName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
