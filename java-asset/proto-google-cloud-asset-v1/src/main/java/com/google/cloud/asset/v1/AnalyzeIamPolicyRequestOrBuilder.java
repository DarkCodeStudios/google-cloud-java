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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface AnalyzeIamPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeIamPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The request query.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the analysisQuery field is set.
   */
  boolean hasAnalysisQuery();
  /**
   *
   *
   * <pre>
   * Required. The request query.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The analysisQuery.
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQuery getAnalysisQuery();
  /**
   *
   *
   * <pre>
   * Required. The request query.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.asset.v1.IamPolicyAnalysisQueryOrBuilder getAnalysisQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The name of a saved query, which must be in the format of:
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * If both `analysis_query` and `saved_analysis_query` are provided, they
   * will be merged together with the `saved_analysis_query` as base and
   * the `analysis_query` as overrides. For more details of the merge behavior,
   * please refer to the
   * [MergeFrom](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.message#Message.MergeFrom.details)
   * page.
   * Note that you cannot override primitive fields with default value, such as
   * 0 or empty string, etc., because we use proto3, which doesn't support field
   * presence yet.
   * </pre>
   *
   * <code>string saved_analysis_query = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The savedAnalysisQuery.
   */
  java.lang.String getSavedAnalysisQuery();
  /**
   *
   *
   * <pre>
   * Optional. The name of a saved query, which must be in the format of:
   * * projects/project_number/savedQueries/saved_query_id
   * * folders/folder_number/savedQueries/saved_query_id
   * * organizations/organization_number/savedQueries/saved_query_id
   * If both `analysis_query` and `saved_analysis_query` are provided, they
   * will be merged together with the `saved_analysis_query` as base and
   * the `analysis_query` as overrides. For more details of the merge behavior,
   * please refer to the
   * [MergeFrom](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.message#Message.MergeFrom.details)
   * page.
   * Note that you cannot override primitive fields with default value, such as
   * 0 or empty string, etc., because we use proto3, which doesn't support field
   * presence yet.
   * </pre>
   *
   * <code>string saved_analysis_query = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for savedAnalysisQuery.
   */
  com.google.protobuf.ByteString getSavedAnalysisQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete.  See JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json).
   * If this field is set with a value less than the RPC deadline, and the
   * execution of your query hasn't finished in the specified
   * execution timeout,  you will get a response with partial result.
   * Otherwise, your query's execution will continue until the RPC deadline.
   * If it's not finished until then, you will get a  DEADLINE_EXCEEDED error.
   * Default is empty.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the executionTimeout field is set.
   */
  boolean hasExecutionTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete.  See JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json).
   * If this field is set with a value less than the RPC deadline, and the
   * execution of your query hasn't finished in the specified
   * execution timeout,  you will get a response with partial result.
   * Otherwise, your query's execution will continue until the RPC deadline.
   * If it's not finished until then, you will get a  DEADLINE_EXCEEDED error.
   * Default is empty.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The executionTimeout.
   */
  com.google.protobuf.Duration getExecutionTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Amount of time executable has to complete.  See JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json).
   * If this field is set with a value less than the RPC deadline, and the
   * execution of your query hasn't finished in the specified
   * execution timeout,  you will get a response with partial result.
   * Otherwise, your query's execution will continue until the RPC deadline.
   * If it's not finished until then, you will get a  DEADLINE_EXCEEDED error.
   * Default is empty.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration execution_timeout = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getExecutionTimeoutOrBuilder();
}
