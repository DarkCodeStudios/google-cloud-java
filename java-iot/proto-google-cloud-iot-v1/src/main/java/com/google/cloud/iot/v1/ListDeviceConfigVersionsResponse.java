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
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Response for `ListDeviceConfigVersions`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.ListDeviceConfigVersionsResponse}
 */
public final class ListDeviceConfigVersionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.ListDeviceConfigVersionsResponse)
    ListDeviceConfigVersionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDeviceConfigVersionsResponse.newBuilder() to construct.
  private ListDeviceConfigVersionsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDeviceConfigVersionsResponse() {
    deviceConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDeviceConfigVersionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListDeviceConfigVersionsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                deviceConfigs_ = new java.util.ArrayList<com.google.cloud.iot.v1.DeviceConfig>();
                mutable_bitField0_ |= 0x00000001;
              }
              deviceConfigs_.add(
                  input.readMessage(
                      com.google.cloud.iot.v1.DeviceConfig.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        deviceConfigs_ = java.util.Collections.unmodifiableList(deviceConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDeviceConfigVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDeviceConfigVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.class,
            com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.Builder.class);
  }

  public static final int DEVICE_CONFIGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.iot.v1.DeviceConfig> deviceConfigs_;
  /**
   *
   *
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  public java.util.List<com.google.cloud.iot.v1.DeviceConfig> getDeviceConfigsList() {
    return deviceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.iot.v1.DeviceConfigOrBuilder>
      getDeviceConfigsOrBuilderList() {
    return deviceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  public int getDeviceConfigsCount() {
    return deviceConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  public com.google.cloud.iot.v1.DeviceConfig getDeviceConfigs(int index) {
    return deviceConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The device configuration for the last few versions. Versions are listed
   * in decreasing order, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
   */
  public com.google.cloud.iot.v1.DeviceConfigOrBuilder getDeviceConfigsOrBuilder(int index) {
    return deviceConfigs_.get(index);
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
    for (int i = 0; i < deviceConfigs_.size(); i++) {
      output.writeMessage(1, deviceConfigs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deviceConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, deviceConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse other =
        (com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse) obj;

    if (!getDeviceConfigsList().equals(other.getDeviceConfigsList())) return false;
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
    if (getDeviceConfigsCount() > 0) {
      hash = (37 * hash) + DEVICE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceConfigsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parseFrom(
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
      com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse prototype) {
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
   * Response for `ListDeviceConfigVersions`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.ListDeviceConfigVersionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.ListDeviceConfigVersionsResponse)
      com.google.cloud.iot.v1.ListDeviceConfigVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceConfigVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceConfigVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.class,
              com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDeviceConfigsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deviceConfigsBuilder_ == null) {
        deviceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        deviceConfigsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceConfigVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse build() {
      com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse buildPartial() {
      com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse result =
          new com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (deviceConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deviceConfigs_ = java.util.Collections.unmodifiableList(deviceConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deviceConfigs_ = deviceConfigs_;
      } else {
        result.deviceConfigs_ = deviceConfigsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse) {
        return mergeFrom((com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse other) {
      if (other == com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse.getDefaultInstance())
        return this;
      if (deviceConfigsBuilder_ == null) {
        if (!other.deviceConfigs_.isEmpty()) {
          if (deviceConfigs_.isEmpty()) {
            deviceConfigs_ = other.deviceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeviceConfigsIsMutable();
            deviceConfigs_.addAll(other.deviceConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.deviceConfigs_.isEmpty()) {
          if (deviceConfigsBuilder_.isEmpty()) {
            deviceConfigsBuilder_.dispose();
            deviceConfigsBuilder_ = null;
            deviceConfigs_ = other.deviceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deviceConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDeviceConfigsFieldBuilder()
                    : null;
          } else {
            deviceConfigsBuilder_.addAllMessages(other.deviceConfigs_);
          }
        }
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
      com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.iot.v1.DeviceConfig> deviceConfigs_ =
        java.util.Collections.emptyList();

    private void ensureDeviceConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deviceConfigs_ =
            new java.util.ArrayList<com.google.cloud.iot.v1.DeviceConfig>(deviceConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceConfig,
            com.google.cloud.iot.v1.DeviceConfig.Builder,
            com.google.cloud.iot.v1.DeviceConfigOrBuilder>
        deviceConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.DeviceConfig> getDeviceConfigsList() {
      if (deviceConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deviceConfigs_);
      } else {
        return deviceConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public int getDeviceConfigsCount() {
      if (deviceConfigsBuilder_ == null) {
        return deviceConfigs_.size();
      } else {
        return deviceConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceConfig getDeviceConfigs(int index) {
      if (deviceConfigsBuilder_ == null) {
        return deviceConfigs_.get(index);
      } else {
        return deviceConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder setDeviceConfigs(int index, com.google.cloud.iot.v1.DeviceConfig value) {
      if (deviceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.set(index, value);
        onChanged();
      } else {
        deviceConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder setDeviceConfigs(
        int index, com.google.cloud.iot.v1.DeviceConfig.Builder builderForValue) {
      if (deviceConfigsBuilder_ == null) {
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        deviceConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder addDeviceConfigs(com.google.cloud.iot.v1.DeviceConfig value) {
      if (deviceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.add(value);
        onChanged();
      } else {
        deviceConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder addDeviceConfigs(int index, com.google.cloud.iot.v1.DeviceConfig value) {
      if (deviceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.add(index, value);
        onChanged();
      } else {
        deviceConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder addDeviceConfigs(com.google.cloud.iot.v1.DeviceConfig.Builder builderForValue) {
      if (deviceConfigsBuilder_ == null) {
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        deviceConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder addDeviceConfigs(
        int index, com.google.cloud.iot.v1.DeviceConfig.Builder builderForValue) {
      if (deviceConfigsBuilder_ == null) {
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        deviceConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder addAllDeviceConfigs(
        java.lang.Iterable<? extends com.google.cloud.iot.v1.DeviceConfig> values) {
      if (deviceConfigsBuilder_ == null) {
        ensureDeviceConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, deviceConfigs_);
        onChanged();
      } else {
        deviceConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder clearDeviceConfigs() {
      if (deviceConfigsBuilder_ == null) {
        deviceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deviceConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public Builder removeDeviceConfigs(int index) {
      if (deviceConfigsBuilder_ == null) {
        ensureDeviceConfigsIsMutable();
        deviceConfigs_.remove(index);
        onChanged();
      } else {
        deviceConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceConfig.Builder getDeviceConfigsBuilder(int index) {
      return getDeviceConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceConfigOrBuilder getDeviceConfigsOrBuilder(int index) {
      if (deviceConfigsBuilder_ == null) {
        return deviceConfigs_.get(index);
      } else {
        return deviceConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.iot.v1.DeviceConfigOrBuilder>
        getDeviceConfigsOrBuilderList() {
      if (deviceConfigsBuilder_ != null) {
        return deviceConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deviceConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceConfig.Builder addDeviceConfigsBuilder() {
      return getDeviceConfigsFieldBuilder()
          .addBuilder(com.google.cloud.iot.v1.DeviceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceConfig.Builder addDeviceConfigsBuilder(int index) {
      return getDeviceConfigsFieldBuilder()
          .addBuilder(index, com.google.cloud.iot.v1.DeviceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The device configuration for the last few versions. Versions are listed
     * in decreasing order, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceConfig device_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.DeviceConfig.Builder>
        getDeviceConfigsBuilderList() {
      return getDeviceConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceConfig,
            com.google.cloud.iot.v1.DeviceConfig.Builder,
            com.google.cloud.iot.v1.DeviceConfigOrBuilder>
        getDeviceConfigsFieldBuilder() {
      if (deviceConfigsBuilder_ == null) {
        deviceConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.iot.v1.DeviceConfig,
                com.google.cloud.iot.v1.DeviceConfig.Builder,
                com.google.cloud.iot.v1.DeviceConfigOrBuilder>(
                deviceConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deviceConfigs_ = null;
      }
      return deviceConfigsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.ListDeviceConfigVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.ListDeviceConfigVersionsResponse)
  private static final com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse();
  }

  public static com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeviceConfigVersionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDeviceConfigVersionsResponse>() {
        @java.lang.Override
        public ListDeviceConfigVersionsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListDeviceConfigVersionsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListDeviceConfigVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeviceConfigVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
