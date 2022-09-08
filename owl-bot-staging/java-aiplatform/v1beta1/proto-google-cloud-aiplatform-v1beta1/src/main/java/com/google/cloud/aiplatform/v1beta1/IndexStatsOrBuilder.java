// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index.proto

package com.google.cloud.aiplatform.v1beta1;

public interface IndexStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.IndexStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The number of vectors in the Index.
   * </pre>
   *
   * <code>int64 vectors_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The vectorsCount.
   */
  long getVectorsCount();

  /**
   * <pre>
   * Output only. The number of shards in the Index.
   * </pre>
   *
   * <code>int32 shards_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The shardsCount.
   */
  int getShardsCount();
}
