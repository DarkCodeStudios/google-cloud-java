// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

public interface ClearSuggestionFeatureConfigOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the conversation profile. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`
   * </pre>
   *
   * <code>string conversation_profile = 1;</code>
   * @return The conversationProfile.
   */
  java.lang.String getConversationProfile();
  /**
   * <pre>
   * The resource name of the conversation profile. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`
   * </pre>
   *
   * <code>string conversation_profile = 1;</code>
   * @return The bytes for conversationProfile.
   */
  com.google.protobuf.ByteString
      getConversationProfileBytes();

  /**
   * <pre>
   * Required. The participant role to remove the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for participantRole.
   */
  int getParticipantRoleValue();
  /**
   * <pre>
   * Required. The participant role to remove the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The participantRole.
   */
  com.google.cloud.dialogflow.v2.Participant.Role getParticipantRole();

  /**
   * <pre>
   * Required. The type of the suggestion feature to remove.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for suggestionFeatureType.
   */
  int getSuggestionFeatureTypeValue();
  /**
   * <pre>
   * Required. The type of the suggestion feature to remove.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionFeatureType.
   */
  com.google.cloud.dialogflow.v2.SuggestionFeature.Type getSuggestionFeatureType();

  /**
   * <pre>
   * Timestamp whe the request was created. The time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Timestamp whe the request was created. The time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Timestamp whe the request was created. The time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
