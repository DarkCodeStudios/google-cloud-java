// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/alert_service.proto

package com.google.monitoring.v3;

public interface CreateAlertPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateAlertPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
   * which to create the alerting policy. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * Note that this field names the parent container in which the alerting
   * policy will be written, not the name of the created policy. |name| must be
   * a host project of a Metrics Scope, otherwise INVALID_ARGUMENT error will
   * return. The alerting policy that is returned will have a name that contains
   * a normalized representation of this name as a prefix but adds a suffix of
   * the form `/alertPolicies/[ALERT_POLICY_ID]`, identifying the policy in the
   * container.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
   * which to create the alerting policy. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * Note that this field names the parent container in which the alerting
   * policy will be written, not the name of the created policy. |name| must be
   * a host project of a Metrics Scope, otherwise INVALID_ARGUMENT error will
   * return. The alerting policy that is returned will have a name that contains
   * a normalized representation of this name as a prefix but adds a suffix of
   * the form `/alertPolicies/[ALERT_POLICY_ID]`, identifying the policy in the
   * container.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new `[ALERT_POLICY_ID]` value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the alertPolicy field is set.
   */
  boolean hasAlertPolicy();
  /**
   * <pre>
   * Required. The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new `[ALERT_POLICY_ID]` value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The alertPolicy.
   */
  com.google.monitoring.v3.AlertPolicy getAlertPolicy();
  /**
   * <pre>
   * Required. The requested alerting policy. You should omit the `name` field in this
   * policy. The name will be returned in the new policy, including
   * a new `[ALERT_POLICY_ID]` value.
   * </pre>
   *
   * <code>.google.monitoring.v3.AlertPolicy alert_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.v3.AlertPolicyOrBuilder getAlertPolicyOrBuilder();
}
