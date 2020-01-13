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

public interface RecordTransformationsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RecordTransformations)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Transform the record by applying various field transformations.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.FieldTransformation> getFieldTransformationsList();
  /**
   *
   *
   * <pre>
   * Transform the record by applying various field transformations.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 1;</code>
   */
  com.google.privacy.dlp.v2.FieldTransformation getFieldTransformations(int index);
  /**
   *
   *
   * <pre>
   * Transform the record by applying various field transformations.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 1;</code>
   */
  int getFieldTransformationsCount();
  /**
   *
   *
   * <pre>
   * Transform the record by applying various field transformations.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.FieldTransformationOrBuilder>
      getFieldTransformationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Transform the record by applying various field transformations.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldTransformation field_transformations = 1;</code>
   */
  com.google.privacy.dlp.v2.FieldTransformationOrBuilder getFieldTransformationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Configuration defining which records get suppressed entirely. Records that
   * match any suppression rule are omitted from the output.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RecordSuppression record_suppressions = 2;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.RecordSuppression> getRecordSuppressionsList();
  /**
   *
   *
   * <pre>
   * Configuration defining which records get suppressed entirely. Records that
   * match any suppression rule are omitted from the output.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RecordSuppression record_suppressions = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordSuppression getRecordSuppressions(int index);
  /**
   *
   *
   * <pre>
   * Configuration defining which records get suppressed entirely. Records that
   * match any suppression rule are omitted from the output.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RecordSuppression record_suppressions = 2;</code>
   */
  int getRecordSuppressionsCount();
  /**
   *
   *
   * <pre>
   * Configuration defining which records get suppressed entirely. Records that
   * match any suppression rule are omitted from the output.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RecordSuppression record_suppressions = 2;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.RecordSuppressionOrBuilder>
      getRecordSuppressionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Configuration defining which records get suppressed entirely. Records that
   * match any suppression rule are omitted from the output.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RecordSuppression record_suppressions = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordSuppressionOrBuilder getRecordSuppressionsOrBuilder(int index);
}
