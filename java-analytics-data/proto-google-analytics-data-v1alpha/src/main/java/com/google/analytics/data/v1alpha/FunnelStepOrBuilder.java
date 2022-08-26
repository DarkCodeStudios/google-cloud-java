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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelStepOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The distinctive name for this step. If unspecified, steps will be named
   * by a 1 based indexed name (i.e. "0. ", "1. ", etc.). This name defines
   * string value returned by the `funnelStepName` dimension. For example,
   * specifying `name = Purchase` in the request's third funnel step will
   * produce `3. Purchase` in the funnel report response.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The distinctive name for this step. If unspecified, steps will be named
   * by a 1 based indexed name (i.e. "0. ", "1. ", etc.). This name defines
   * string value returned by the `funnelStepName` dimension. For example,
   * specifying `name = Purchase` in the request's third funnel step will
   * produce `3. Purchase` in the funnel report response.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If true, this step must directly follow the previous step. If false,
   * there can be events between the previous step and this step. If
   * unspecified, `isDirectlyFollowedBy` is treated as false.
   * </pre>
   *
   * <code>bool is_directly_followed_by = 2;</code>
   *
   * @return The isDirectlyFollowedBy.
   */
  boolean getIsDirectlyFollowedBy();

  /**
   *
   *
   * <pre>
   * If specified, this step must complete within this duration of the
   * completion of the prior step. `withinDurationFromPriorStep` is inclusive
   * of the endpoint at the microsecond granularity. For example a duration of
   * 5 seconds can be completed at 4.9 or 5.0 seconds, but not 5 seconds and 1
   * microsecond.
   * `withinDurationFromPriorStep` is optional, and if unspecified, steps may
   * be separated by any time duration.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within_duration_from_prior_step = 3;</code>
   *
   * @return Whether the withinDurationFromPriorStep field is set.
   */
  boolean hasWithinDurationFromPriorStep();
  /**
   *
   *
   * <pre>
   * If specified, this step must complete within this duration of the
   * completion of the prior step. `withinDurationFromPriorStep` is inclusive
   * of the endpoint at the microsecond granularity. For example a duration of
   * 5 seconds can be completed at 4.9 or 5.0 seconds, but not 5 seconds and 1
   * microsecond.
   * `withinDurationFromPriorStep` is optional, and if unspecified, steps may
   * be separated by any time duration.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within_duration_from_prior_step = 3;</code>
   *
   * @return The withinDurationFromPriorStep.
   */
  com.google.protobuf.Duration getWithinDurationFromPriorStep();
  /**
   *
   *
   * <pre>
   * If specified, this step must complete within this duration of the
   * completion of the prior step. `withinDurationFromPriorStep` is inclusive
   * of the endpoint at the microsecond granularity. For example a duration of
   * 5 seconds can be completed at 4.9 or 5.0 seconds, but not 5 seconds and 1
   * microsecond.
   * `withinDurationFromPriorStep` is optional, and if unspecified, steps may
   * be separated by any time duration.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration within_duration_from_prior_step = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getWithinDurationFromPriorStepOrBuilder();

  /**
   *
   *
   * <pre>
   * The condition that your users must meet to be included in this step of
   * the funnel journey.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpression filter_expression = 4;</code>
   *
   * @return Whether the filterExpression field is set.
   */
  boolean hasFilterExpression();
  /**
   *
   *
   * <pre>
   * The condition that your users must meet to be included in this step of
   * the funnel journey.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpression filter_expression = 4;</code>
   *
   * @return The filterExpression.
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpression getFilterExpression();
  /**
   *
   *
   * <pre>
   * The condition that your users must meet to be included in this step of
   * the funnel journey.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelFilterExpression filter_expression = 4;</code>
   */
  com.google.analytics.data.v1alpha.FunnelFilterExpressionOrBuilder getFilterExpressionOrBuilder();
}