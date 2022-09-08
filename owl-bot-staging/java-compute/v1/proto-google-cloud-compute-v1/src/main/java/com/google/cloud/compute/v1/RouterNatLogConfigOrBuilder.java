// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RouterNatLogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterNatLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates whether or not to export logs. This is false by default.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   * <pre>
   * Indicates whether or not to export logs. This is false by default.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return The enable.
   */
  boolean getEnable();

  /**
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
   * Check the Filter enum for the list of possible values.
   * </pre>
   *
   * <code>optional string filter = 336120696;</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
   * Check the Filter enum for the list of possible values.
   * </pre>
   *
   * <code>optional string filter = 336120696;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
   * Check the Filter enum for the list of possible values.
   * </pre>
   *
   * <code>optional string filter = 336120696;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
