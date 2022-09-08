// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/operations.proto

package com.google.cloud.automl.v1;

public interface BatchPredictOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.BatchPredictOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictInputConfig input_config = 1;</code>
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictInputConfig input_config = 1;</code>
   * @return The inputConfig.
   */
  com.google.cloud.automl.v1.BatchPredictInputConfig getInputConfig();
  /**
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictInputConfig input_config = 1;</code>
   */
  com.google.cloud.automl.v1.BatchPredictInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;</code>
   * @return Whether the outputInfo field is set.
   */
  boolean hasOutputInfo();
  /**
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;</code>
   * @return The outputInfo.
   */
  com.google.cloud.automl.v1.BatchPredictOperationMetadata.BatchPredictOutputInfo getOutputInfo();
  /**
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;</code>
   */
  com.google.cloud.automl.v1.BatchPredictOperationMetadata.BatchPredictOutputInfoOrBuilder getOutputInfoOrBuilder();
}
