// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AwsClusterUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsClusterUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the user, e.g. `my-gcp-id&#64;gmail.com`.
   * </pre>
   *
   * <code>string username = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * Required. The name of the user, e.g. `my-gcp-id&#64;gmail.com`.
   * </pre>
   *
   * <code>string username = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();
}
