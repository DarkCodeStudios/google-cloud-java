// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/gkebackup.proto

package com.google.cloud.gkebackup.v1;

public interface ListVolumeBackupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.ListVolumeBackupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Backup that contains the VolumeBackups to list.
   * Format: projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The Backup that contains the VolumeBackups to list.
   * Format: projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The target number of results to return in a single response.
   * If not specified, a default value will be chosen by the service.
   * Note that the response may inclue a partial list and a caller should
   * only rely on the response's
   * [next_page_token][google.cloud.gkebackup.v1.ListVolumeBackupsResponse.next_page_token]
   * to determine if there are more instances left to be queried.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value of
   * [next_page_token][google.cloud.gkebackup.v1.ListVolumeBackupsResponse.next_page_token]
   * received from a previous `ListVolumeBackups` call.
   * Provide this to retrieve the subsequent page in a multi-page list of
   * results. When paginating, all other parameters provided to
   * `ListVolumeBackups` must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value of
   * [next_page_token][google.cloud.gkebackup.v1.ListVolumeBackupsResponse.next_page_token]
   * received from a previous `ListVolumeBackups` call.
   * Provide this to retrieve the subsequent page in a multi-page list of
   * results. When paginating, all other parameters provided to
   * `ListVolumeBackups` must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Field match expression used to filter the results.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Field match expression used to filter the results.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Field by which to sort the results.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Field by which to sort the results.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
