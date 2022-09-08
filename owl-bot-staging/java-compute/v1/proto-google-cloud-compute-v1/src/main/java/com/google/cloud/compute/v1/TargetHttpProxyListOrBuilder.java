// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface TargetHttpProxyListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetHttpProxyList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] Unique identifier for the resource; defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] Unique identifier for the resource; defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * [Output Only] Unique identifier for the resource; defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * A list of TargetHttpProxy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy items = 100526016;</code>
   */
  java.util.List<com.google.cloud.compute.v1.TargetHttpProxy> 
      getItemsList();
  /**
   * <pre>
   * A list of TargetHttpProxy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy items = 100526016;</code>
   */
  com.google.cloud.compute.v1.TargetHttpProxy getItems(int index);
  /**
   * <pre>
   * A list of TargetHttpProxy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy items = 100526016;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * A list of TargetHttpProxy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy items = 100526016;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.TargetHttpProxyOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * A list of TargetHttpProxy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.TargetHttpProxy items = 100526016;</code>
   */
  com.google.cloud.compute.v1.TargetHttpProxyOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * Type of resource. Always compute#targetHttpProxyList for lists of target HTTP proxies.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * Type of resource. Always compute#targetHttpProxyList for lists of target HTTP proxies.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * Type of resource. Always compute#targetHttpProxyList for lists of target HTTP proxies.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   * @return Whether the nextPageToken field is set.
   */
  boolean hasNextPageToken();
  /**
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
