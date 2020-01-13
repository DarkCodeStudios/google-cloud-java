/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Detailed error codes and messages.
   * </pre>
   *
   * <code>.google.rpc.Status details = 1;</code>
   *
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   *
   *
   * <pre>
   * Detailed error codes and messages.
   * </pre>
   *
   * <code>.google.rpc.Status details = 1;</code>
   *
   * @return The details.
   */
  com.google.rpc.Status getDetails();
  /**
   *
   *
   * <pre>
   * Detailed error codes and messages.
   * </pre>
   *
   * <code>.google.rpc.Status details = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  java.util.List<com.google.protobuf.Timestamp> getTimestampsList();
  /**
   *
   *
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  com.google.protobuf.Timestamp getTimestamps(int index);
  /**
   *
   *
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  int getTimestampsCount();
  /**
   *
   *
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.TimestampOrBuilder> getTimestampsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The times the error occurred.
   * </pre>
   *
   * <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampsOrBuilder(int index);
}
