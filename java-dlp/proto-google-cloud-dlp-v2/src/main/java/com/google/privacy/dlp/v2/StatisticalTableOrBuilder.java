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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface StatisticalTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.StatisticalTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Auxiliary table location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the table field is set.
   */
  boolean hasTable();
  /**
   *
   *
   * <pre>
   * Required. Auxiliary table location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The table.
   */
  com.google.privacy.dlp.v2.BigQueryTable getTable();
  /**
   *
   *
   * <pre>
   * Required. Auxiliary table location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Quasi-identifier columns.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField quasi_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField> getQuasiIdsList();
  /**
   *
   *
   * <pre>
   * Required. Quasi-identifier columns.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField quasi_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField getQuasiIds(int index);
  /**
   *
   *
   * <pre>
   * Required. Quasi-identifier columns.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField quasi_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getQuasiIdsCount();
  /**
   *
   *
   * <pre>
   * Required. Quasi-identifier columns.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField quasi_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierFieldOrBuilder>
      getQuasiIdsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Quasi-identifier columns.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierField quasi_ids = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.StatisticalTable.QuasiIdentifierFieldOrBuilder getQuasiIdsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. The relative frequency column must contain a floating-point number
   * between 0 and 1 (inclusive). Null values are assumed to be zero.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.FieldId relative_frequency = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the relativeFrequency field is set.
   */
  boolean hasRelativeFrequency();
  /**
   *
   *
   * <pre>
   * Required. The relative frequency column must contain a floating-point number
   * between 0 and 1 (inclusive). Null values are assumed to be zero.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.FieldId relative_frequency = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The relativeFrequency.
   */
  com.google.privacy.dlp.v2.FieldId getRelativeFrequency();
  /**
   *
   *
   * <pre>
   * Required. The relative frequency column must contain a floating-point number
   * between 0 and 1 (inclusive). Null values are assumed to be zero.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.FieldId relative_frequency = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getRelativeFrequencyOrBuilder();
}