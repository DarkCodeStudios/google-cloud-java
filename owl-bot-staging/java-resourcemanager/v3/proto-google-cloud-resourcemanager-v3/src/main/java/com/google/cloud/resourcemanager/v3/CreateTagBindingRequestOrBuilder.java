// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

package com.google.cloud.resourcemanager.v3;

public interface CreateTagBindingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.CreateTagBindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The TagBinding to be created.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagBinding field is set.
   */
  boolean hasTagBinding();
  /**
   * <pre>
   * Required. The TagBinding to be created.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagBinding.
   */
  com.google.cloud.resourcemanager.v3.TagBinding getTagBinding();
  /**
   * <pre>
   * Required. The TagBinding to be created.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagBinding tag_binding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.resourcemanager.v3.TagBindingOrBuilder getTagBindingOrBuilder();

  /**
   * <pre>
   * Optional. Set to true to perform the validations necessary for creating the resource,
   * but not actually perform the action.
   * </pre>
   *
   * <code>bool validate_only = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
