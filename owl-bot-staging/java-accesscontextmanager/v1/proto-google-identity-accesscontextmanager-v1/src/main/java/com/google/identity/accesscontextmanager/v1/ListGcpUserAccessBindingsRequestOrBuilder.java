// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface ListGcpUserAccessBindingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.ListGcpUserAccessBindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Example: "organizations/256"
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Example: "organizations/256"
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Maximum number of items to return. The server may return fewer items.
   * If left blank, the server may return any number of items.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. If left blank, returns the first page. To enumerate all items, use the
   * [next_page_token]
   * [google.identity.accesscontextmanager.v1.ListGcpUserAccessBindingsResponse.next_page_token]
   * from your previous list operation.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. If left blank, returns the first page. To enumerate all items, use the
   * [next_page_token]
   * [google.identity.accesscontextmanager.v1.ListGcpUserAccessBindingsResponse.next_page_token]
   * from your previous list operation.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
