// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface MysqlSourceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.MysqlSourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
   * @return Whether the allowlist field is set.
   */
  boolean hasAllowlist();
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
   * @return The allowlist.
   */
  com.google.cloud.datastream.v1alpha1.MysqlRdbms getAllowlist();
  /**
   * <pre>
   * MySQL objects to retrieve from the source.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms allowlist = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder getAllowlistOrBuilder();

  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
   * @return Whether the rejectlist field is set.
   */
  boolean hasRejectlist();
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
   * @return The rejectlist.
   */
  com.google.cloud.datastream.v1alpha1.MysqlRdbms getRejectlist();
  /**
   * <pre>
   * MySQL objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlRdbms rejectlist = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder getRejectlistOrBuilder();
}
