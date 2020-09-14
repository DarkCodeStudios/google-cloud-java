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
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

public interface CustomAttributeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.CustomAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 500B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   *
   * @return A list containing the stringValues.
   */
  java.util.List<java.lang.String> getStringValuesList();
  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 500B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   *
   * @return The count of stringValues.
   */
  int getStringValuesCount();
  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 500B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The stringValues at the given index.
   */
  java.lang.String getStringValues(int index);
  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform a string match (`CASE_SENSITIVE_MATCH` or
   * `CASE_INSENSITIVE_MATCH`) search.
   * For filterable `string_value`s, a maximum total number of 200 values
   * is allowed, with each `string_value` has a byte size of no more than
   * 500B. For unfilterable `string_values`, the maximum total byte size of
   * unfilterable `string_values` is 50KB.
   * Empty string isn't allowed.
   * </pre>
   *
   * <code>repeated string string_values = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the stringValues at the given index.
   */
  com.google.protobuf.ByteString getStringValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform number range search.
   * (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
   * Currently at most 1
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] is
   * supported.
   * </pre>
   *
   * <code>repeated int64 long_values = 2;</code>
   *
   * @return A list containing the longValues.
   */
  java.util.List<java.lang.Long> getLongValuesList();
  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform number range search.
   * (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
   * Currently at most 1
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] is
   * supported.
   * </pre>
   *
   * <code>repeated int64 long_values = 2;</code>
   *
   * @return The count of longValues.
   */
  int getLongValuesCount();
  /**
   *
   *
   * <pre>
   * Exactly one of
   * [string_values][google.cloud.talent.v4.CustomAttribute.string_values] or
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] must be
   * specified.
   * This field is used to perform number range search.
   * (`EQ`, `GT`, `GE`, `LE`, `LT`) over filterable `long_value`.
   * Currently at most 1
   * [long_values][google.cloud.talent.v4.CustomAttribute.long_values] is
   * supported.
   * </pre>
   *
   * <code>repeated int64 long_values = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The longValues at the given index.
   */
  long getLongValues(int index);

  /**
   *
   *
   * <pre>
   * If the `filterable` flag is true, the custom field values may be used for
   * custom attribute filters
   * [JobQuery.custom_attribute_filter][google.cloud.talent.v4.JobQuery.custom_attribute_filter].
   * If false, these values may not be used for custom attribute filters.
   * Default is false.
   * </pre>
   *
   * <code>bool filterable = 3;</code>
   *
   * @return The filterable.
   */
  boolean getFilterable();

  /**
   *
   *
   * <pre>
   * If the `keyword_searchable` flag is true, the keywords in custom fields are
   * searchable by keyword match.
   * If false, the values are not searchable by keyword match.
   * Default is false.
   * </pre>
   *
   * <code>bool keyword_searchable = 4;</code>
   *
   * @return The keywordSearchable.
   */
  boolean getKeywordSearchable();
}
