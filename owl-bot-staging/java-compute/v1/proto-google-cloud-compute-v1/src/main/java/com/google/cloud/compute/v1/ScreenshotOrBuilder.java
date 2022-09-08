// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ScreenshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Screenshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   * @return Whether the contents field is set.
   */
  boolean hasContents();
  /**
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   * @return The contents.
   */
  java.lang.String getContents();
  /**
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   * @return The bytes for contents.
   */
  com.google.protobuf.ByteString
      getContentsBytes();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();
}
