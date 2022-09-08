// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/server_tls_policy.proto

package com.google.cloud.networksecurity.v1beta1;

public interface UpdateServerTlsPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ServerTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ServerTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ServerTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. Updated ServerTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the serverTlsPolicy field is set.
   */
  boolean hasServerTlsPolicy();
  /**
   * <pre>
   * Required. Updated ServerTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The serverTlsPolicy.
   */
  com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy getServerTlsPolicy();
  /**
   * <pre>
   * Required. Updated ServerTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOrBuilder getServerTlsPolicyOrBuilder();
}
