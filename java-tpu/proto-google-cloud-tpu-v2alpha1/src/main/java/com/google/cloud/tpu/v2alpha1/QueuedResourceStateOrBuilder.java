/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface QueuedResourceStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.QueuedResourceState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * State of the QueuedResource request.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * State of the QueuedResource request.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.State getState();

  /**
   *
   *
   * <pre>
   * Further data for the creating state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.CreatingData creating_data = 2;</code>
   *
   * @return Whether the creatingData field is set.
   */
  boolean hasCreatingData();
  /**
   *
   *
   * <pre>
   * Further data for the creating state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.CreatingData creating_data = 2;</code>
   *
   * @return The creatingData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.CreatingData getCreatingData();
  /**
   *
   *
   * <pre>
   * Further data for the creating state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.CreatingData creating_data = 2;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.CreatingDataOrBuilder
      getCreatingDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the accepted state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.AcceptedData accepted_data = 3;</code>
   *
   * @return Whether the acceptedData field is set.
   */
  boolean hasAcceptedData();
  /**
   *
   *
   * <pre>
   * Further data for the accepted state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.AcceptedData accepted_data = 3;</code>
   *
   * @return The acceptedData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.AcceptedData getAcceptedData();
  /**
   *
   *
   * <pre>
   * Further data for the accepted state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.AcceptedData accepted_data = 3;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.AcceptedDataOrBuilder
      getAcceptedDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the provisioning state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.ProvisioningData provisioning_data = 4;
   * </code>
   *
   * @return Whether the provisioningData field is set.
   */
  boolean hasProvisioningData();
  /**
   *
   *
   * <pre>
   * Further data for the provisioning state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.ProvisioningData provisioning_data = 4;
   * </code>
   *
   * @return The provisioningData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.ProvisioningData getProvisioningData();
  /**
   *
   *
   * <pre>
   * Further data for the provisioning state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.ProvisioningData provisioning_data = 4;
   * </code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.ProvisioningDataOrBuilder
      getProvisioningDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the failed state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.FailedData failed_data = 5;</code>
   *
   * @return Whether the failedData field is set.
   */
  boolean hasFailedData();
  /**
   *
   *
   * <pre>
   * Further data for the failed state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.FailedData failed_data = 5;</code>
   *
   * @return The failedData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.FailedData getFailedData();
  /**
   *
   *
   * <pre>
   * Further data for the failed state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.FailedData failed_data = 5;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.FailedDataOrBuilder getFailedDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the deleting state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.DeletingData deleting_data = 6;</code>
   *
   * @return Whether the deletingData field is set.
   */
  boolean hasDeletingData();
  /**
   *
   *
   * <pre>
   * Further data for the deleting state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.DeletingData deleting_data = 6;</code>
   *
   * @return The deletingData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.DeletingData getDeletingData();
  /**
   *
   *
   * <pre>
   * Further data for the deleting state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.DeletingData deleting_data = 6;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.DeletingDataOrBuilder
      getDeletingDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the active state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.ActiveData active_data = 7;</code>
   *
   * @return Whether the activeData field is set.
   */
  boolean hasActiveData();
  /**
   *
   *
   * <pre>
   * Further data for the active state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.ActiveData active_data = 7;</code>
   *
   * @return The activeData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.ActiveData getActiveData();
  /**
   *
   *
   * <pre>
   * Further data for the active state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.ActiveData active_data = 7;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.ActiveDataOrBuilder getActiveDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the suspending state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendingData suspending_data = 8;</code>
   *
   * @return Whether the suspendingData field is set.
   */
  boolean hasSuspendingData();
  /**
   *
   *
   * <pre>
   * Further data for the suspending state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendingData suspending_data = 8;</code>
   *
   * @return The suspendingData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendingData getSuspendingData();
  /**
   *
   *
   * <pre>
   * Further data for the suspending state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendingData suspending_data = 8;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendingDataOrBuilder
      getSuspendingDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Further data for the suspended state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendedData suspended_data = 9;</code>
   *
   * @return Whether the suspendedData field is set.
   */
  boolean hasSuspendedData();
  /**
   *
   *
   * <pre>
   * Further data for the suspended state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendedData suspended_data = 9;</code>
   *
   * @return The suspendedData.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendedData getSuspendedData();
  /**
   *
   *
   * <pre>
   * Further data for the suspended state.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendedData suspended_data = 9;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.SuspendedDataOrBuilder
      getSuspendedDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The initiator of the QueuedResources's current state.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2alpha1.QueuedResourceState.StateInitiator state_initiator = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for stateInitiator.
   */
  int getStateInitiatorValue();
  /**
   *
   *
   * <pre>
   * Output only. The initiator of the QueuedResources's current state.
   * </pre>
   *
   * <code>
   * .google.cloud.tpu.v2alpha1.QueuedResourceState.StateInitiator state_initiator = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateInitiator.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState.StateInitiator getStateInitiator();

  com.google.cloud.tpu.v2alpha1.QueuedResourceState.StateDataCase getStateDataCase();
}
