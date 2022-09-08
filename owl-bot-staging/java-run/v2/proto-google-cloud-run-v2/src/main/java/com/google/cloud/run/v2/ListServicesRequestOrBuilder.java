// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/service.proto

package com.google.cloud.run.v2;

public interface ListServicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The location and project to list resources on.
   * Location must be a valid GCP region, and may not be the "-" wildcard.
   * Format: projects/{projectnumber}/locations/{location}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The location and project to list resources on.
   * Location must be a valid GCP region, and may not be the "-" wildcard.
   * Format: projects/{projectnumber}/locations/{location}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Maximum number of Services to return in this call.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token received from a previous call to ListServices.
   * All other parameters must match.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token received from a previous call to ListServices.
   * All other parameters must match.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * If true, returns deleted (but unexpired) resources along with active ones.
   * </pre>
   *
   * <code>bool show_deleted = 4;</code>
   * @return The showDeleted.
   */
  boolean getShowDeleted();
}
