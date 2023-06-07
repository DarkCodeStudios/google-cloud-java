/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/channel/v1/reports_service.proto

package com.google.cloud.channel.v1;

public interface ReportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Report)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The report's resource name. Specifies the account and report used
   * to generate report data. The report_id identifier is a UID (for example,
   * `613bf59q`).
   *
   * Name uses the format:
   * accounts/{account_id}/reports/{report_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The report's resource name. Specifies the account and report used
   * to generate report data. The report_id identifier is a UID (for example,
   * `613bf59q`).
   *
   * Name uses the format:
   * accounts/{account_id}/reports/{report_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A human-readable name for this report.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * A human-readable name for this report.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The list of columns included in the report. This defines the schema of
   * the report results.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Column columns = 3;</code>
   */
  java.util.List<com.google.cloud.channel.v1.Column> getColumnsList();
  /**
   *
   *
   * <pre>
   * The list of columns included in the report. This defines the schema of
   * the report results.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Column columns = 3;</code>
   */
  com.google.cloud.channel.v1.Column getColumns(int index);
  /**
   *
   *
   * <pre>
   * The list of columns included in the report. This defines the schema of
   * the report results.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Column columns = 3;</code>
   */
  int getColumnsCount();
  /**
   *
   *
   * <pre>
   * The list of columns included in the report. This defines the schema of
   * the report results.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Column columns = 3;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ColumnOrBuilder> getColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of columns included in the report. This defines the schema of
   * the report results.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Column columns = 3;</code>
   */
  com.google.cloud.channel.v1.ColumnOrBuilder getColumnsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A description of other aspects of the report, such as the products
   * it supports.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of other aspects of the report, such as the products
   * it supports.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
