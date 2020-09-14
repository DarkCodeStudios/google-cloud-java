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
// source: google/cloud/video/transcoder/v1beta1/services.proto

package com.google.cloud.video.transcoder.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for `TranscoderService.CreateJobTemplate`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest}
 */
public final class CreateJobTemplateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest)
    CreateJobTemplateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateJobTemplateRequest.newBuilder() to construct.
  private CreateJobTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateJobTemplateRequest() {
    parent_ = "";
    jobTemplateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateJobTemplateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateJobTemplateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.video.transcoder.v1beta1.JobTemplate.Builder subBuilder = null;
              if (jobTemplate_ != null) {
                subBuilder = jobTemplate_.toBuilder();
              }
              jobTemplate_ =
                  input.readMessage(
                      com.google.cloud.video.transcoder.v1beta1.JobTemplate.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jobTemplate_);
                jobTemplate_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              jobTemplateId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.transcoder.v1beta1.ServicesProto
        .internal_static_google_cloud_video_transcoder_v1beta1_CreateJobTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.transcoder.v1beta1.ServicesProto
        .internal_static_google_cloud_video_transcoder_v1beta1_CreateJobTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest.class,
            com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent location to create this job template.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent location to create this job template.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_TEMPLATE_FIELD_NUMBER = 2;
  private com.google.cloud.video.transcoder.v1beta1.JobTemplate jobTemplate_;
  /**
   *
   *
   * <pre>
   * Required. Parameters for creating job template.
   * </pre>
   *
   * <code>
   * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the jobTemplate field is set.
   */
  @java.lang.Override
  public boolean hasJobTemplate() {
    return jobTemplate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Parameters for creating job template.
   * </pre>
   *
   * <code>
   * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The jobTemplate.
   */
  @java.lang.Override
  public com.google.cloud.video.transcoder.v1beta1.JobTemplate getJobTemplate() {
    return jobTemplate_ == null
        ? com.google.cloud.video.transcoder.v1beta1.JobTemplate.getDefaultInstance()
        : jobTemplate_;
  }
  /**
   *
   *
   * <pre>
   * Required. Parameters for creating job template.
   * </pre>
   *
   * <code>
   * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder getJobTemplateOrBuilder() {
    return getJobTemplate();
  }

  public static final int JOB_TEMPLATE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object jobTemplateId_;
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the job template, which will become the final component
   * of the job template's resource name.
   * This value should be 4-63 characters, and valid characters
   * are `/[a-zA-Z0-9_-_]/`.
   * </pre>
   *
   * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The jobTemplateId.
   */
  @java.lang.Override
  public java.lang.String getJobTemplateId() {
    java.lang.Object ref = jobTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobTemplateId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the job template, which will become the final component
   * of the job template's resource name.
   * This value should be 4-63 characters, and valid characters
   * are `/[a-zA-Z0-9_-_]/`.
   * </pre>
   *
   * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for jobTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getJobTemplateIdBytes() {
    java.lang.Object ref = jobTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobTemplateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (jobTemplate_ != null) {
      output.writeMessage(2, getJobTemplate());
    }
    if (!getJobTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobTemplateId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (jobTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getJobTemplate());
    }
    if (!getJobTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobTemplateId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest other =
        (com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasJobTemplate() != other.hasJobTemplate()) return false;
    if (hasJobTemplate()) {
      if (!getJobTemplate().equals(other.getJobTemplate())) return false;
    }
    if (!getJobTemplateId().equals(other.getJobTemplateId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasJobTemplate()) {
      hash = (37 * hash) + JOB_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getJobTemplate().hashCode();
    }
    hash = (37 * hash) + JOB_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobTemplateId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for `TranscoderService.CreateJobTemplate`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest)
      com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.transcoder.v1beta1.ServicesProto
          .internal_static_google_cloud_video_transcoder_v1beta1_CreateJobTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.transcoder.v1beta1.ServicesProto
          .internal_static_google_cloud_video_transcoder_v1beta1_CreateJobTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest.class,
              com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (jobTemplateBuilder_ == null) {
        jobTemplate_ = null;
      } else {
        jobTemplate_ = null;
        jobTemplateBuilder_ = null;
      }
      jobTemplateId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.transcoder.v1beta1.ServicesProto
          .internal_static_google_cloud_video_transcoder_v1beta1_CreateJobTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
        getDefaultInstanceForType() {
      return com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest build() {
      com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest buildPartial() {
      com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest result =
          new com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest(this);
      result.parent_ = parent_;
      if (jobTemplateBuilder_ == null) {
        result.jobTemplate_ = jobTemplate_;
      } else {
        result.jobTemplate_ = jobTemplateBuilder_.build();
      }
      result.jobTemplateId_ = jobTemplateId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest) {
        return mergeFrom(
            (com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest other) {
      if (other
          == com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasJobTemplate()) {
        mergeJobTemplate(other.getJobTemplate());
      }
      if (!other.getJobTemplateId().isEmpty()) {
        jobTemplateId_ = other.jobTemplateId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent location to create this job template.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location to create this job template.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location to create this job template.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location to create this job template.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent location to create this job template.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.video.transcoder.v1beta1.JobTemplate jobTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.transcoder.v1beta1.JobTemplate,
            com.google.cloud.video.transcoder.v1beta1.JobTemplate.Builder,
            com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder>
        jobTemplateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the jobTemplate field is set.
     */
    public boolean hasJobTemplate() {
      return jobTemplateBuilder_ != null || jobTemplate_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The jobTemplate.
     */
    public com.google.cloud.video.transcoder.v1beta1.JobTemplate getJobTemplate() {
      if (jobTemplateBuilder_ == null) {
        return jobTemplate_ == null
            ? com.google.cloud.video.transcoder.v1beta1.JobTemplate.getDefaultInstance()
            : jobTemplate_;
      } else {
        return jobTemplateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJobTemplate(com.google.cloud.video.transcoder.v1beta1.JobTemplate value) {
      if (jobTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobTemplate_ = value;
        onChanged();
      } else {
        jobTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJobTemplate(
        com.google.cloud.video.transcoder.v1beta1.JobTemplate.Builder builderForValue) {
      if (jobTemplateBuilder_ == null) {
        jobTemplate_ = builderForValue.build();
        onChanged();
      } else {
        jobTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeJobTemplate(com.google.cloud.video.transcoder.v1beta1.JobTemplate value) {
      if (jobTemplateBuilder_ == null) {
        if (jobTemplate_ != null) {
          jobTemplate_ =
              com.google.cloud.video.transcoder.v1beta1.JobTemplate.newBuilder(jobTemplate_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          jobTemplate_ = value;
        }
        onChanged();
      } else {
        jobTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearJobTemplate() {
      if (jobTemplateBuilder_ == null) {
        jobTemplate_ = null;
        onChanged();
      } else {
        jobTemplate_ = null;
        jobTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.video.transcoder.v1beta1.JobTemplate.Builder getJobTemplateBuilder() {

      onChanged();
      return getJobTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder
        getJobTemplateOrBuilder() {
      if (jobTemplateBuilder_ != null) {
        return jobTemplateBuilder_.getMessageOrBuilder();
      } else {
        return jobTemplate_ == null
            ? com.google.cloud.video.transcoder.v1beta1.JobTemplate.getDefaultInstance()
            : jobTemplate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Parameters for creating job template.
     * </pre>
     *
     * <code>
     * .google.cloud.video.transcoder.v1beta1.JobTemplate job_template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.transcoder.v1beta1.JobTemplate,
            com.google.cloud.video.transcoder.v1beta1.JobTemplate.Builder,
            com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder>
        getJobTemplateFieldBuilder() {
      if (jobTemplateBuilder_ == null) {
        jobTemplateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.video.transcoder.v1beta1.JobTemplate,
                com.google.cloud.video.transcoder.v1beta1.JobTemplate.Builder,
                com.google.cloud.video.transcoder.v1beta1.JobTemplateOrBuilder>(
                getJobTemplate(), getParentForChildren(), isClean());
        jobTemplate_ = null;
      }
      return jobTemplateBuilder_;
    }

    private java.lang.Object jobTemplateId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the job template, which will become the final component
     * of the job template's resource name.
     * This value should be 4-63 characters, and valid characters
     * are `/[a-zA-Z0-9_-_]/`.
     * </pre>
     *
     * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The jobTemplateId.
     */
    public java.lang.String getJobTemplateId() {
      java.lang.Object ref = jobTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the job template, which will become the final component
     * of the job template's resource name.
     * This value should be 4-63 characters, and valid characters
     * are `/[a-zA-Z0-9_-_]/`.
     * </pre>
     *
     * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for jobTemplateId.
     */
    public com.google.protobuf.ByteString getJobTemplateIdBytes() {
      java.lang.Object ref = jobTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the job template, which will become the final component
     * of the job template's resource name.
     * This value should be 4-63 characters, and valid characters
     * are `/[a-zA-Z0-9_-_]/`.
     * </pre>
     *
     * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The jobTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setJobTemplateId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      jobTemplateId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the job template, which will become the final component
     * of the job template's resource name.
     * This value should be 4-63 characters, and valid characters
     * are `/[a-zA-Z0-9_-_]/`.
     * </pre>
     *
     * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJobTemplateId() {

      jobTemplateId_ = getDefaultInstance().getJobTemplateId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the job template, which will become the final component
     * of the job template's resource name.
     * This value should be 4-63 characters, and valid characters
     * are `/[a-zA-Z0-9_-_]/`.
     * </pre>
     *
     * <code>string job_template_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for jobTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setJobTemplateIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      jobTemplateId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest)
  private static final com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest();
  }

  public static com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobTemplateRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateJobTemplateRequest>() {
        @java.lang.Override
        public CreateJobTemplateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateJobTemplateRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateJobTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateJobTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.transcoder.v1beta1.CreateJobTemplateRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
