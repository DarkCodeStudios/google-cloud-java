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
// source: google/cloud/video/transcoder/v1beta1/resources.proto

package com.google.cloud.video.transcoder.v1beta1;

/**
 *
 *
 * <pre>
 * Segment settings for `"ts"`, `"fmp4"` and `"vtt"`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.transcoder.v1beta1.SegmentSettings}
 */
public final class SegmentSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.transcoder.v1beta1.SegmentSettings)
    SegmentSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SegmentSettings.newBuilder() to construct.
  private SegmentSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SegmentSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SegmentSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SegmentSettings(
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
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (segmentDuration_ != null) {
                subBuilder = segmentDuration_.toBuilder();
              }
              segmentDuration_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(segmentDuration_);
                segmentDuration_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              individualSegments_ = input.readBool();
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
    return com.google.cloud.video.transcoder.v1beta1.ResourcesProto
        .internal_static_google_cloud_video_transcoder_v1beta1_SegmentSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.transcoder.v1beta1.ResourcesProto
        .internal_static_google_cloud_video_transcoder_v1beta1_SegmentSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.transcoder.v1beta1.SegmentSettings.class,
            com.google.cloud.video.transcoder.v1beta1.SegmentSettings.Builder.class);
  }

  public static final int SEGMENT_DURATION_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration segmentDuration_;
  /**
   *
   *
   * <pre>
   * Duration of the segments in seconds. The default is `"6.0s"`.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_duration = 1;</code>
   *
   * @return Whether the segmentDuration field is set.
   */
  @java.lang.Override
  public boolean hasSegmentDuration() {
    return segmentDuration_ != null;
  }
  /**
   *
   *
   * <pre>
   * Duration of the segments in seconds. The default is `"6.0s"`.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_duration = 1;</code>
   *
   * @return The segmentDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getSegmentDuration() {
    return segmentDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : segmentDuration_;
  }
  /**
   *
   *
   * <pre>
   * Duration of the segments in seconds. The default is `"6.0s"`.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_duration = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getSegmentDurationOrBuilder() {
    return getSegmentDuration();
  }

  public static final int INDIVIDUAL_SEGMENTS_FIELD_NUMBER = 3;
  private boolean individualSegments_;
  /**
   *
   *
   * <pre>
   * Required. Create an individual segment file. The default is `false`.
   * </pre>
   *
   * <code>bool individual_segments = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The individualSegments.
   */
  @java.lang.Override
  public boolean getIndividualSegments() {
    return individualSegments_;
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
    if (segmentDuration_ != null) {
      output.writeMessage(1, getSegmentDuration());
    }
    if (individualSegments_ != false) {
      output.writeBool(3, individualSegments_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (segmentDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSegmentDuration());
    }
    if (individualSegments_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, individualSegments_);
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
    if (!(obj instanceof com.google.cloud.video.transcoder.v1beta1.SegmentSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.video.transcoder.v1beta1.SegmentSettings other =
        (com.google.cloud.video.transcoder.v1beta1.SegmentSettings) obj;

    if (hasSegmentDuration() != other.hasSegmentDuration()) return false;
    if (hasSegmentDuration()) {
      if (!getSegmentDuration().equals(other.getSegmentDuration())) return false;
    }
    if (getIndividualSegments() != other.getIndividualSegments()) return false;
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
    if (hasSegmentDuration()) {
      hash = (37 * hash) + SEGMENT_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentDuration().hashCode();
    }
    hash = (37 * hash) + INDIVIDUAL_SEGMENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIndividualSegments());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings parseFrom(
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
      com.google.cloud.video.transcoder.v1beta1.SegmentSettings prototype) {
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
   * Segment settings for `"ts"`, `"fmp4"` and `"vtt"`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.transcoder.v1beta1.SegmentSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.transcoder.v1beta1.SegmentSettings)
      com.google.cloud.video.transcoder.v1beta1.SegmentSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.transcoder.v1beta1.ResourcesProto
          .internal_static_google_cloud_video_transcoder_v1beta1_SegmentSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.transcoder.v1beta1.ResourcesProto
          .internal_static_google_cloud_video_transcoder_v1beta1_SegmentSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.transcoder.v1beta1.SegmentSettings.class,
              com.google.cloud.video.transcoder.v1beta1.SegmentSettings.Builder.class);
    }

    // Construct using com.google.cloud.video.transcoder.v1beta1.SegmentSettings.newBuilder()
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
      if (segmentDurationBuilder_ == null) {
        segmentDuration_ = null;
      } else {
        segmentDuration_ = null;
        segmentDurationBuilder_ = null;
      }
      individualSegments_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.transcoder.v1beta1.ResourcesProto
          .internal_static_google_cloud_video_transcoder_v1beta1_SegmentSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1beta1.SegmentSettings getDefaultInstanceForType() {
      return com.google.cloud.video.transcoder.v1beta1.SegmentSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1beta1.SegmentSettings build() {
      com.google.cloud.video.transcoder.v1beta1.SegmentSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.transcoder.v1beta1.SegmentSettings buildPartial() {
      com.google.cloud.video.transcoder.v1beta1.SegmentSettings result =
          new com.google.cloud.video.transcoder.v1beta1.SegmentSettings(this);
      if (segmentDurationBuilder_ == null) {
        result.segmentDuration_ = segmentDuration_;
      } else {
        result.segmentDuration_ = segmentDurationBuilder_.build();
      }
      result.individualSegments_ = individualSegments_;
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
      if (other instanceof com.google.cloud.video.transcoder.v1beta1.SegmentSettings) {
        return mergeFrom((com.google.cloud.video.transcoder.v1beta1.SegmentSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.transcoder.v1beta1.SegmentSettings other) {
      if (other == com.google.cloud.video.transcoder.v1beta1.SegmentSettings.getDefaultInstance())
        return this;
      if (other.hasSegmentDuration()) {
        mergeSegmentDuration(other.getSegmentDuration());
      }
      if (other.getIndividualSegments() != false) {
        setIndividualSegments(other.getIndividualSegments());
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
      com.google.cloud.video.transcoder.v1beta1.SegmentSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.video.transcoder.v1beta1.SegmentSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration segmentDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        segmentDurationBuilder_;
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     *
     * @return Whether the segmentDuration field is set.
     */
    public boolean hasSegmentDuration() {
      return segmentDurationBuilder_ != null || segmentDuration_ != null;
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     *
     * @return The segmentDuration.
     */
    public com.google.protobuf.Duration getSegmentDuration() {
      if (segmentDurationBuilder_ == null) {
        return segmentDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : segmentDuration_;
      } else {
        return segmentDurationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    public Builder setSegmentDuration(com.google.protobuf.Duration value) {
      if (segmentDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segmentDuration_ = value;
        onChanged();
      } else {
        segmentDurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    public Builder setSegmentDuration(com.google.protobuf.Duration.Builder builderForValue) {
      if (segmentDurationBuilder_ == null) {
        segmentDuration_ = builderForValue.build();
        onChanged();
      } else {
        segmentDurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    public Builder mergeSegmentDuration(com.google.protobuf.Duration value) {
      if (segmentDurationBuilder_ == null) {
        if (segmentDuration_ != null) {
          segmentDuration_ =
              com.google.protobuf.Duration.newBuilder(segmentDuration_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          segmentDuration_ = value;
        }
        onChanged();
      } else {
        segmentDurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    public Builder clearSegmentDuration() {
      if (segmentDurationBuilder_ == null) {
        segmentDuration_ = null;
        onChanged();
      } else {
        segmentDuration_ = null;
        segmentDurationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getSegmentDurationBuilder() {

      onChanged();
      return getSegmentDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getSegmentDurationOrBuilder() {
      if (segmentDurationBuilder_ != null) {
        return segmentDurationBuilder_.getMessageOrBuilder();
      } else {
        return segmentDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : segmentDuration_;
      }
    }
    /**
     *
     *
     * <pre>
     * Duration of the segments in seconds. The default is `"6.0s"`.
     * </pre>
     *
     * <code>.google.protobuf.Duration segment_duration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getSegmentDurationFieldBuilder() {
      if (segmentDurationBuilder_ == null) {
        segmentDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getSegmentDuration(), getParentForChildren(), isClean());
        segmentDuration_ = null;
      }
      return segmentDurationBuilder_;
    }

    private boolean individualSegments_;
    /**
     *
     *
     * <pre>
     * Required. Create an individual segment file. The default is `false`.
     * </pre>
     *
     * <code>bool individual_segments = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The individualSegments.
     */
    @java.lang.Override
    public boolean getIndividualSegments() {
      return individualSegments_;
    }
    /**
     *
     *
     * <pre>
     * Required. Create an individual segment file. The default is `false`.
     * </pre>
     *
     * <code>bool individual_segments = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The individualSegments to set.
     * @return This builder for chaining.
     */
    public Builder setIndividualSegments(boolean value) {

      individualSegments_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Create an individual segment file. The default is `false`.
     * </pre>
     *
     * <code>bool individual_segments = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndividualSegments() {

      individualSegments_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.transcoder.v1beta1.SegmentSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.transcoder.v1beta1.SegmentSettings)
  private static final com.google.cloud.video.transcoder.v1beta1.SegmentSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.transcoder.v1beta1.SegmentSettings();
  }

  public static com.google.cloud.video.transcoder.v1beta1.SegmentSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SegmentSettings> PARSER =
      new com.google.protobuf.AbstractParser<SegmentSettings>() {
        @java.lang.Override
        public SegmentSettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SegmentSettings(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SegmentSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SegmentSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.transcoder.v1beta1.SegmentSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
