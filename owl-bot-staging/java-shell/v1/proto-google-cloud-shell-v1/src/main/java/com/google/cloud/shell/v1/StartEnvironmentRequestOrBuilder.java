// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

public interface StartEnvironmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.shell.v1.StartEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource that should be started, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource that should be started, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The initial access token passed to the environment. If this is present and
   * valid, the environment will be pre-authenticated with gcloud so that the
   * user can run gcloud commands in Cloud Shell without having to log in. This
   * code can be updated later by calling AuthorizeEnvironment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <pre>
   * The initial access token passed to the environment. If this is present and
   * valid, the environment will be pre-authenticated with gcloud so that the
   * user can run gcloud commands in Cloud Shell without having to log in. This
   * code can be updated later by calling AuthorizeEnvironment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   * @return A list containing the publicKeys.
   */
  java.util.List<java.lang.String>
      getPublicKeysList();
  /**
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   * @return The count of publicKeys.
   */
  int getPublicKeysCount();
  /**
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   * @param index The index of the element to return.
   * @return The publicKeys at the given index.
   */
  java.lang.String getPublicKeys(int index);
  /**
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the publicKeys at the given index.
   */
  com.google.protobuf.ByteString
      getPublicKeysBytes(int index);
}
