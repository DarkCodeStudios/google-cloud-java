// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetTargetSslProxyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetTargetSslProxyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the TargetSslProxy resource to return.
   * </pre>
   *
   * <code>string target_ssl_proxy = 338795853 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetSslProxy.
   */
  java.lang.String getTargetSslProxy();
  /**
   * <pre>
   * Name of the TargetSslProxy resource to return.
   * </pre>
   *
   * <code>string target_ssl_proxy = 338795853 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetSslProxy.
   */
  com.google.protobuf.ByteString
      getTargetSslProxyBytes();
}
