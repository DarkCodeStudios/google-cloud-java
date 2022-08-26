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
// source: google/cloud/documentai/v1/processor.proto

package com.google.cloud.documentai.v1;

public interface ProcessorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.Processor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The resource name of the processor.
   * Format: `projects/{project}/locations/{location}/processors/{processor}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. The resource name of the processor.
   * Format: `projects/{project}/locations/{location}/processors/{processor}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The processor type, e.g., OCR_PROCESSOR, INVOICE_PROCESSOR, etc.
   * To get a list of processors types, see
   * [FetchProcessorTypes][google.cloud.documentai.v1.DocumentProcessorService.FetchProcessorTypes].
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The processor type, e.g., OCR_PROCESSOR, INVOICE_PROCESSOR, etc.
   * To get a list of processors types, see
   * [FetchProcessorTypes][google.cloud.documentai.v1.DocumentProcessorService.FetchProcessorTypes].
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The display name of the processor.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the processor.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of the processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the processor.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.Processor.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.documentai.v1.Processor.State getState();

  /**
   *
   *
   * <pre>
   * The default processor version.
   * </pre>
   *
   * <code>string default_processor_version = 9 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The defaultProcessorVersion.
   */
  java.lang.String getDefaultProcessorVersion();
  /**
   *
   *
   * <pre>
   * The default processor version.
   * </pre>
   *
   * <code>string default_processor_version = 9 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for defaultProcessorVersion.
   */
  com.google.protobuf.ByteString getDefaultProcessorVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The http endpoint that can be called to invoke processing.
   * </pre>
   *
   * <code>
   * string process_endpoint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The processEndpoint.
   */
  java.lang.String getProcessEndpoint();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. The http endpoint that can be called to invoke processing.
   * </pre>
   *
   * <code>
   * string process_endpoint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for processEndpoint.
   */
  com.google.protobuf.ByteString getProcessEndpointBytes();

  /**
   *
   *
   * <pre>
   * The time the processor was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time the processor was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time the processor was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The KMS key used for encryption/decryption in CMEK scenarios.
   * See https://cloud.google.com/security-key-management.
   * </pre>
   *
   * <code>string kms_key_name = 8;</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * The KMS key used for encryption/decryption in CMEK scenarios.
   * See https://cloud.google.com/security-key-management.
   * </pre>
   *
   * <code>string kms_key_name = 8;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();
}