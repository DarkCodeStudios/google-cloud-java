// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AwsServicesAuthenticationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsServicesAuthentication)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API
   * will assume when managing AWS resources on your account.
   * </pre>
   *
   * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The roleArn.
   */
  java.lang.String getRoleArn();
  /**
   * <pre>
   * Required. The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API
   * will assume when managing AWS resources on your account.
   * </pre>
   *
   * <code>string role_arn = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for roleArn.
   */
  com.google.protobuf.ByteString
      getRoleArnBytes();

  /**
   * <pre>
   * Optional. An identifier for the assumed role session.
   * When unspecified, it defaults to `multicloud-service-agent`.
   * </pre>
   *
   * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The roleSessionName.
   */
  java.lang.String getRoleSessionName();
  /**
   * <pre>
   * Optional. An identifier for the assumed role session.
   * When unspecified, it defaults to `multicloud-service-agent`.
   * </pre>
   *
   * <code>string role_session_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for roleSessionName.
   */
  com.google.protobuf.ByteString
      getRoleSessionNameBytes();
}
