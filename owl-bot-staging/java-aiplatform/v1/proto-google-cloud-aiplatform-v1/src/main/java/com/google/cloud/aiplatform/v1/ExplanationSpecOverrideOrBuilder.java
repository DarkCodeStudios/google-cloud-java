// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/explanation.proto

package com.google.cloud.aiplatform.v1;

public interface ExplanationSpecOverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExplanationSpecOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parameters to be overridden. Note that the
   * [method][google.cloud.aiplatform.v1.ExplanationParameters.method] cannot be changed. If not specified,
   * no parameter is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationParameters parameters = 1;</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * The parameters to be overridden. Note that the
   * [method][google.cloud.aiplatform.v1.ExplanationParameters.method] cannot be changed. If not specified,
   * no parameter is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationParameters parameters = 1;</code>
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1.ExplanationParameters getParameters();
  /**
   * <pre>
   * The parameters to be overridden. Note that the
   * [method][google.cloud.aiplatform.v1.ExplanationParameters.method] cannot be changed. If not specified,
   * no parameter is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationParameters parameters = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ExplanationParametersOrBuilder getParametersOrBuilder();

  /**
   * <pre>
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationMetadataOverride metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationMetadataOverride metadata = 2;</code>
   * @return The metadata.
   */
  com.google.cloud.aiplatform.v1.ExplanationMetadataOverride getMetadata();
  /**
   * <pre>
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationMetadataOverride metadata = 2;</code>
   */
  com.google.cloud.aiplatform.v1.ExplanationMetadataOverrideOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * The example-based explanations parameter overrides.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExamplesOverride examples_override = 3;</code>
   * @return Whether the examplesOverride field is set.
   */
  boolean hasExamplesOverride();
  /**
   * <pre>
   * The example-based explanations parameter overrides.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExamplesOverride examples_override = 3;</code>
   * @return The examplesOverride.
   */
  com.google.cloud.aiplatform.v1.ExamplesOverride getExamplesOverride();
  /**
   * <pre>
   * The example-based explanations parameter overrides.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExamplesOverride examples_override = 3;</code>
   */
  com.google.cloud.aiplatform.v1.ExamplesOverrideOrBuilder getExamplesOverrideOrBuilder();
}
