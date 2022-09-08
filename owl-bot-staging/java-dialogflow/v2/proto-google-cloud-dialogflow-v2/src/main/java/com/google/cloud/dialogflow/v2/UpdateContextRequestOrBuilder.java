// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/context.proto

package com.google.cloud.dialogflow.v2;

public interface UpdateContextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.UpdateContextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The context to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * Required. The context to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The context.
   */
  com.google.cloud.dialogflow.v2.Context getContext();
  /**
   * <pre>
   * Required. The context to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Context context = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2.ContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
