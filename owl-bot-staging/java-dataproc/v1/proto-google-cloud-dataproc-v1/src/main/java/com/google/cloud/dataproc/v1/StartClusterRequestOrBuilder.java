// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface StartClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.StartClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project the
   * cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project the
   * cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <pre>
   * Optional. Specifying the `cluster_uuid` means the RPC will fail
   * (with error NOT_FOUND) if a cluster with the specified UUID does not exist.
   * </pre>
   *
   * <code>string cluster_uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The clusterUuid.
   */
  java.lang.String getClusterUuid();
  /**
   * <pre>
   * Optional. Specifying the `cluster_uuid` means the RPC will fail
   * (with error NOT_FOUND) if a cluster with the specified UUID does not exist.
   * </pre>
   *
   * <code>string cluster_uuid = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for clusterUuid.
   */
  com.google.protobuf.ByteString
      getClusterUuidBytes();

  /**
   * <pre>
   * Optional. A unique ID used to identify the request. If the server
   * receives two
   * [StartClusterRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.StartClusterRequest)s
   * with the same id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created and stored in the
   * backend is returned.
   * Recommendation: Set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A unique ID used to identify the request. If the server
   * receives two
   * [StartClusterRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.StartClusterRequest)s
   * with the same id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created and stored in the
   * backend is returned.
   * Recommendation: Set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
