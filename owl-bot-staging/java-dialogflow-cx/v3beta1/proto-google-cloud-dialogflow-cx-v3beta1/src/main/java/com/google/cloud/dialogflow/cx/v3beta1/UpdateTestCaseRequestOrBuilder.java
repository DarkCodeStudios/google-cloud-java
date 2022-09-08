// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface UpdateTestCaseRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.UpdateTestCaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the testCase field is set.
   */
  boolean hasTestCase();
  /**
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The testCase.
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestCase getTestCase();
  /**
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestCaseOrBuilder getTestCaseOrBuilder();

  /**
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3beta1.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3beta1.TestCase.last_test_result] cannot be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3beta1.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3beta1.TestCase.last_test_result] cannot be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3beta1.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3beta1.TestCase.last_test_result] cannot be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
