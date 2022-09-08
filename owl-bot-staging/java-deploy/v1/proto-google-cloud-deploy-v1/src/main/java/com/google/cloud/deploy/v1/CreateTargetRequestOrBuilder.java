// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface CreateTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CreateTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent collection in which the `Target` should be created.
   * Format should be
   * projects/{project_id}/locations/{location_name}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent collection in which the `Target` should be created.
   * Format should be
   * projects/{project_id}/locations/{location_name}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. ID of the `Target`.
   * </pre>
   *
   * <code>string target_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetId.
   */
  java.lang.String getTargetId();
  /**
   * <pre>
   * Required. ID of the `Target`.
   * </pre>
   *
   * <code>string target_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetId.
   */
  com.google.protobuf.ByteString
      getTargetIdBytes();

  /**
   * <pre>
   * Required. The `Target` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Target target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * Required. The `Target` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Target target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The target.
   */
  com.google.cloud.deploy.v1.Target getTarget();
  /**
   * <pre>
   * Required. The `Target` to create.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Target target = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.deploy.v1.TargetOrBuilder getTargetOrBuilder();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional. If set to true, the request is validated and the user is provided with
   * an expected result, but no actual change is made.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
