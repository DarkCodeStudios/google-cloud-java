// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface StartPaidServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.StartPaidServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the entitlement to start a paid service for.
   * Name uses the format:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the entitlement to start a paid service for.
   * Name uses the format:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. You can specify an optional unique request ID, and if you need to retry
   * your request, the server will know to ignore the request if it's complete.
   * For example, you make an initial request and the request times out. If you
   * make the request again with the same request ID, the server can check if
   * it received the original operation with the same request ID. If it did, it
   * will ignore the second request.
   * The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122)
   * with the exception that zero UUID is not supported
   * (`00000000-0000-0000-0000-000000000000`).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. You can specify an optional unique request ID, and if you need to retry
   * your request, the server will know to ignore the request if it's complete.
   * For example, you make an initial request and the request times out. If you
   * make the request again with the same request ID, the server can check if
   * it received the original operation with the same request ID. If it did, it
   * will ignore the second request.
   * The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122)
   * with the exception that zero UUID is not supported
   * (`00000000-0000-0000-0000-000000000000`).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
