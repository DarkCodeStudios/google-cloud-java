// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/templates.proto

package com.google.dataflow.v1beta3;

public interface DynamicTemplateLaunchParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.DynamicTemplateLaunchParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path to dynamic template spec file on Cloud Storage.
   * The file must be a Json serialized DynamicTemplateFieSpec object.
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return The gcsPath.
   */
  java.lang.String getGcsPath();
  /**
   * <pre>
   * Path to dynamic template spec file on Cloud Storage.
   * The file must be a Json serialized DynamicTemplateFieSpec object.
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return The bytes for gcsPath.
   */
  com.google.protobuf.ByteString
      getGcsPathBytes();

  /**
   * <pre>
   * Cloud Storage path for staging dependencies.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string staging_location = 2;</code>
   * @return The stagingLocation.
   */
  java.lang.String getStagingLocation();
  /**
   * <pre>
   * Cloud Storage path for staging dependencies.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string staging_location = 2;</code>
   * @return The bytes for stagingLocation.
   */
  com.google.protobuf.ByteString
      getStagingLocationBytes();
}
