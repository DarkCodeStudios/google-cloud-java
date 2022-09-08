// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AzureNodePoolAutoscalingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Minimum number of nodes in the node pool. Must be greater than or equal to
   * 1 and less than or equal to max_node_count.
   * </pre>
   *
   * <code>int32 min_node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The minNodeCount.
   */
  int getMinNodeCount();

  /**
   * <pre>
   * Required. Maximum number of nodes in the node pool. Must be greater than or equal to
   * min_node_count and less than or equal to 50.
   * </pre>
   *
   * <code>int32 max_node_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The maxNodeCount.
   */
  int getMaxNodeCount();
}
