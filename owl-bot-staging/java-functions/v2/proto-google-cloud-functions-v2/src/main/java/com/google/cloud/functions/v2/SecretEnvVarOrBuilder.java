// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2/functions.proto

package com.google.cloud.functions.v2;

public interface SecretEnvVarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2.SecretEnvVar)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the environment variable.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Name of the environment variable.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Project identifier (preferably project number but can also be the
   * project ID) of the project that contains the secret. If not set, it is
   * assumed that the secret is in the same project as the function.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project identifier (preferably project number but can also be the
   * project ID) of the project that contains the secret. If not set, it is
   * assumed that the secret is in the same project as the function.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Name of the secret in secret manager (not the full resource name).
   * </pre>
   *
   * <code>string secret = 3;</code>
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   * <pre>
   * Name of the secret in secret manager (not the full resource name).
   * </pre>
   *
   * <code>string secret = 3;</code>
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString
      getSecretBytes();

  /**
   * <pre>
   * Version of the secret (version number or the string 'latest'). It is
   * recommended to use a numeric version for secret environment variables as
   * any updates to the secret value is not reflected until new instances
   * start.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Version of the secret (version number or the string 'latest'). It is
   * recommended to use a numeric version for secret environment variables as
   * any updates to the secret value is not reflected until new instances
   * start.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
