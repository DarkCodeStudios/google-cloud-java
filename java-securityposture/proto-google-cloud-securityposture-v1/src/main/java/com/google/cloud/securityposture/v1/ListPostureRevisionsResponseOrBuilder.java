/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

public interface ListPostureRevisionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securityposture.v1.ListPostureRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  java.util.List<com.google.cloud.securityposture.v1.Posture> getRevisionsList();
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  com.google.cloud.securityposture.v1.Posture getRevisions(int index);
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  int getRevisionsCount();
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securityposture.v1.PostureOrBuilder>
      getRevisionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  com.google.cloud.securityposture.v1.PostureOrBuilder getRevisionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
