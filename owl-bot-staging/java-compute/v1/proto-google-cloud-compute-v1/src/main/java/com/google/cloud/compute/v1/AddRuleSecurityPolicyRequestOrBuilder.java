// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AddRuleSecurityPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AddRuleSecurityPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the security policy to update.
   * </pre>
   *
   * <code>string security_policy = 171082513 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityPolicy.
   */
  java.lang.String getSecurityPolicy();
  /**
   * <pre>
   * Name of the security policy to update.
   * </pre>
   *
   * <code>string security_policy = 171082513 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for securityPolicy.
   */
  com.google.protobuf.ByteString
      getSecurityPolicyBytes();

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SecurityPolicyRule security_policy_rule_resource = 402693443 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securityPolicyRuleResource field is set.
   */
  boolean hasSecurityPolicyRuleResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SecurityPolicyRule security_policy_rule_resource = 402693443 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityPolicyRuleResource.
   */
  com.google.cloud.compute.v1.SecurityPolicyRule getSecurityPolicyRuleResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SecurityPolicyRule security_policy_rule_resource = 402693443 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleOrBuilder getSecurityPolicyRuleResourceOrBuilder();

  /**
   * <pre>
   * If true, the request will not be committed.
   * </pre>
   *
   * <code>optional bool validate_only = 242744629;</code>
   * @return Whether the validateOnly field is set.
   */
  boolean hasValidateOnly();
  /**
   * <pre>
   * If true, the request will not be committed.
   * </pre>
   *
   * <code>optional bool validate_only = 242744629;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
