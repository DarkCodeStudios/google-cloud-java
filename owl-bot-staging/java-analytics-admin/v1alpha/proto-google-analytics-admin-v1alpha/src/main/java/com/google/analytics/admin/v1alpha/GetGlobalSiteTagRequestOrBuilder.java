// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface GetGlobalSiteTagRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.GetGlobalSiteTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the site tag to lookup.
   * Note that site tags are singletons and do not have unique IDs.
   * Format: properties/{property_id}/dataStreams/{stream_id}/globalSiteTag
   * Example: "properties/123/dataStreams/456/globalSiteTag"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the site tag to lookup.
   * Note that site tags are singletons and do not have unique IDs.
   * Format: properties/{property_id}/dataStreams/{stream_id}/globalSiteTag
   * Example: "properties/123/dataStreams/456/globalSiteTag"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
