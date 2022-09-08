// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface QueryDirectoryContentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry directory_entries = 1;</code>
   */
  java.util.List<com.google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry> 
      getDirectoryEntriesList();
  /**
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry directory_entries = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry getDirectoryEntries(int index);
  /**
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry directory_entries = 1;</code>
   */
  int getDirectoryEntriesCount();
  /**
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry directory_entries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntryOrBuilder> 
      getDirectoryEntriesOrBuilderList();
  /**
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntry directory_entries = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.QueryDirectoryContentsResponse.DirectoryEntryOrBuilder getDirectoryEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
