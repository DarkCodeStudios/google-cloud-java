// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/service.proto

package com.google.cloud.secretmanager.v1;

public interface AddSecretVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1.AddSecretVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the [Secret][google.cloud.secretmanager.v1.Secret] to associate with the
   * [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format `projects/&#42;&#47;secrets/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the [Secret][google.cloud.secretmanager.v1.Secret] to associate with the
   * [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format `projects/&#42;&#47;secrets/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The secret payload of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * Required. The secret payload of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The payload.
   */
  com.google.cloud.secretmanager.v1.SecretPayload getPayload();
  /**
   * <pre>
   * Required. The secret payload of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder getPayloadOrBuilder();
}
