// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/recommendation.proto

package com.google.cloud.recommender.v1;

public interface SecurityProjectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.SecurityProjection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Additional security impact details that is provided by the recommender.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * Additional security impact details that is provided by the recommender.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   * @return The details.
   */
  com.google.protobuf.Struct getDetails();
  /**
   * <pre>
   * Additional security impact details that is provided by the recommender.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getDetailsOrBuilder();
}
