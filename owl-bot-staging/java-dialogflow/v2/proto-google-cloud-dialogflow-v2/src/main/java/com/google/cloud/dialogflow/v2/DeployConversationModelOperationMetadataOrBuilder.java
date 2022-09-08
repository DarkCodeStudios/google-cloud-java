// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public interface DeployConversationModelOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.DeployConversationModelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the conversation model. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
   * </pre>
   *
   * <code>string conversation_model = 1;</code>
   * @return The conversationModel.
   */
  java.lang.String getConversationModel();
  /**
   * <pre>
   * The resource name of the conversation model. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
   * </pre>
   *
   * <code>string conversation_model = 1;</code>
   * @return The bytes for conversationModel.
   */
  com.google.protobuf.ByteString
      getConversationModelBytes();

  /**
   * <pre>
   * Timestamp when request to deploy conversation model was submitted. The time
   * is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Timestamp when request to deploy conversation model was submitted. The time
   * is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Timestamp when request to deploy conversation model was submitted. The time
   * is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
