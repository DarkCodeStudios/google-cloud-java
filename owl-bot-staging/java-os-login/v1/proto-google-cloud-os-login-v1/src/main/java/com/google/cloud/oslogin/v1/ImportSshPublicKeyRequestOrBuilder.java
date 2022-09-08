// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface ImportSshPublicKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.ImportSshPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The unique ID for the user in format `users/{user}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the sshPublicKey field is set.
   */
  boolean hasSshPublicKey();
  /**
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sshPublicKey.
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey();
  /**
   * <pre>
   * Optional. The SSH public key and expiration time.
   * </pre>
   *
   * <code>.google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder getSshPublicKeyOrBuilder();

  /**
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The project ID of the Google Cloud Platform project.
   * </pre>
   *
   * <code>string project_id = 3;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();
}
