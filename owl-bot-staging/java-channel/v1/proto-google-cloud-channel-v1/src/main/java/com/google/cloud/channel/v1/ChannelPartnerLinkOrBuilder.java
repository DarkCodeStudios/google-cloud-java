// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/channel_partner_links.proto

package com.google.cloud.channel.v1;

public interface ChannelPartnerLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ChannelPartnerLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name for the channel partner link, in the format
   * accounts/{account_id}/channelPartnerLinks/{id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name for the channel partner link, in the format
   * accounts/{account_id}/channelPartnerLinks/{id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Cloud Identity ID of the linked reseller.
   * </pre>
   *
   * <code>string reseller_cloud_identity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resellerCloudIdentityId.
   */
  java.lang.String getResellerCloudIdentityId();
  /**
   * <pre>
   * Required. Cloud Identity ID of the linked reseller.
   * </pre>
   *
   * <code>string reseller_cloud_identity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resellerCloudIdentityId.
   */
  com.google.protobuf.ByteString
      getResellerCloudIdentityIdBytes();

  /**
   * <pre>
   * Required. State of the channel partner link.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ChannelPartnerLinkState link_state = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for linkState.
   */
  int getLinkStateValue();
  /**
   * <pre>
   * Required. State of the channel partner link.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ChannelPartnerLinkState link_state = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The linkState.
   */
  com.google.cloud.channel.v1.ChannelPartnerLinkState getLinkState();

  /**
   * <pre>
   * Output only. URI of the web page where partner accepts the link invitation.
   * </pre>
   *
   * <code>string invite_link_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The inviteLinkUri.
   */
  java.lang.String getInviteLinkUri();
  /**
   * <pre>
   * Output only. URI of the web page where partner accepts the link invitation.
   * </pre>
   *
   * <code>string invite_link_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for inviteLinkUri.
   */
  com.google.protobuf.ByteString
      getInviteLinkUriBytes();

  /**
   * <pre>
   * Output only. Timestamp of when the channel partner link is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp of when the channel partner link is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp of when the channel partner link is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp of when the channel partner link is updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp of when the channel partner link is updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp of when the channel partner link is updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Public identifier that a customer must use to generate a transfer token
   * to move to this distributor-reseller combination.
   * </pre>
   *
   * <code>string public_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The publicId.
   */
  java.lang.String getPublicId();
  /**
   * <pre>
   * Output only. Public identifier that a customer must use to generate a transfer token
   * to move to this distributor-reseller combination.
   * </pre>
   *
   * <code>string public_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for publicId.
   */
  com.google.protobuf.ByteString
      getPublicIdBytes();

  /**
   * <pre>
   * Output only. Cloud Identity info of the channel partner (IR).
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CloudIdentityInfo channel_partner_cloud_identity_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the channelPartnerCloudIdentityInfo field is set.
   */
  boolean hasChannelPartnerCloudIdentityInfo();
  /**
   * <pre>
   * Output only. Cloud Identity info of the channel partner (IR).
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CloudIdentityInfo channel_partner_cloud_identity_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The channelPartnerCloudIdentityInfo.
   */
  com.google.cloud.channel.v1.CloudIdentityInfo getChannelPartnerCloudIdentityInfo();
  /**
   * <pre>
   * Output only. Cloud Identity info of the channel partner (IR).
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CloudIdentityInfo channel_partner_cloud_identity_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.channel.v1.CloudIdentityInfoOrBuilder getChannelPartnerCloudIdentityInfoOrBuilder();
}
