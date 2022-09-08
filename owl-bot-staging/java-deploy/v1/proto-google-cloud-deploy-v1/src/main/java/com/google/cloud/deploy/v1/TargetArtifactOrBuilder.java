// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface TargetArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.TargetArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the artifactUri field is set.
   */
  boolean hasArtifactUri();
  /**
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The artifactUri.
   */
  java.lang.String getArtifactUri();
  /**
   * <pre>
   * Output only. URI of a directory containing the artifacts. This contains
   * deployment configuration used by Skaffold during a rollout, and all
   * paths are relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for artifactUri.
   */
  com.google.protobuf.ByteString
      getArtifactUriBytes();

  /**
   * <pre>
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The skaffoldConfigPath.
   */
  java.lang.String getSkaffoldConfigPath();
  /**
   * <pre>
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * </pre>
   *
   * <code>string skaffold_config_path = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for skaffoldConfigPath.
   */
  com.google.protobuf.ByteString
      getSkaffoldConfigPathBytes();

  /**
   * <pre>
   * Output only. File path of the rendered manifest relative to the URI.
   * </pre>
   *
   * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manifestPath.
   */
  java.lang.String getManifestPath();
  /**
   * <pre>
   * Output only. File path of the rendered manifest relative to the URI.
   * </pre>
   *
   * <code>string manifest_path = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for manifestPath.
   */
  com.google.protobuf.ByteString
      getManifestPathBytes();

  public com.google.cloud.deploy.v1.TargetArtifact.UriCase getUriCase();
}
