// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 * <pre>
 * A response to CommitServicePerimetersRequest. This will be put inside of
 * Operation.response field.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse}
 */
public final class CommitServicePerimetersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse)
    CommitServicePerimetersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitServicePerimetersResponse.newBuilder() to construct.
  private CommitServicePerimetersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitServicePerimetersResponse() {
    servicePerimeters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitServicePerimetersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommitServicePerimetersResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              servicePerimeters_ = new java.util.ArrayList<com.google.identity.accesscontextmanager.v1.ServicePerimeter>();
              mutable_bitField0_ |= 0x00000001;
            }
            servicePerimeters_.add(
                input.readMessage(com.google.identity.accesscontextmanager.v1.ServicePerimeter.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        servicePerimeters_ = java.util.Collections.unmodifiableList(servicePerimeters_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_CommitServicePerimetersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_CommitServicePerimetersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.class, com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.Builder.class);
  }

  public static final int SERVICE_PERIMETERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeter> servicePerimeters_;
  /**
   * <pre>
   * List of all the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
   * the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy].
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeter> getServicePerimetersList() {
    return servicePerimeters_;
  }
  /**
   * <pre>
   * List of all the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
   * the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy].
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder> 
      getServicePerimetersOrBuilderList() {
    return servicePerimeters_;
  }
  /**
   * <pre>
   * List of all the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
   * the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy].
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
   */
  @java.lang.Override
  public int getServicePerimetersCount() {
    return servicePerimeters_.size();
  }
  /**
   * <pre>
   * List of all the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
   * the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy].
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.ServicePerimeter getServicePerimeters(int index) {
    return servicePerimeters_.get(index);
  }
  /**
   * <pre>
   * List of all the [Service Perimeter]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
   * the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy].
   * </pre>
   *
   * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder getServicePerimetersOrBuilder(
      int index) {
    return servicePerimeters_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < servicePerimeters_.size(); i++) {
      output.writeMessage(1, servicePerimeters_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < servicePerimeters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, servicePerimeters_.get(i));
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse other = (com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse) obj;

    if (!getServicePerimetersList()
        .equals(other.getServicePerimetersList())) return false;
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
    if (getServicePerimetersCount() > 0) {
      hash = (37 * hash) + SERVICE_PERIMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getServicePerimetersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A response to CommitServicePerimetersRequest. This will be put inside of
   * Operation.response field.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse)
      com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_CommitServicePerimetersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_CommitServicePerimetersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.class, com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.Builder.class);
    }

    // Construct using com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getServicePerimetersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (servicePerimetersBuilder_ == null) {
        servicePerimeters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        servicePerimetersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto.internal_static_google_identity_accesscontextmanager_v1_CommitServicePerimetersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse build() {
      com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse buildPartial() {
      com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse result = new com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse(this);
      int from_bitField0_ = bitField0_;
      if (servicePerimetersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          servicePerimeters_ = java.util.Collections.unmodifiableList(servicePerimeters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.servicePerimeters_ = servicePerimeters_;
      } else {
        result.servicePerimeters_ = servicePerimetersBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse) {
        return mergeFrom((com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse other) {
      if (other == com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse.getDefaultInstance()) return this;
      if (servicePerimetersBuilder_ == null) {
        if (!other.servicePerimeters_.isEmpty()) {
          if (servicePerimeters_.isEmpty()) {
            servicePerimeters_ = other.servicePerimeters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServicePerimetersIsMutable();
            servicePerimeters_.addAll(other.servicePerimeters_);
          }
          onChanged();
        }
      } else {
        if (!other.servicePerimeters_.isEmpty()) {
          if (servicePerimetersBuilder_.isEmpty()) {
            servicePerimetersBuilder_.dispose();
            servicePerimetersBuilder_ = null;
            servicePerimeters_ = other.servicePerimeters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            servicePerimetersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServicePerimetersFieldBuilder() : null;
          } else {
            servicePerimetersBuilder_.addAllMessages(other.servicePerimeters_);
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
      com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeter> servicePerimeters_ =
      java.util.Collections.emptyList();
    private void ensureServicePerimetersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        servicePerimeters_ = new java.util.ArrayList<com.google.identity.accesscontextmanager.v1.ServicePerimeter>(servicePerimeters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.identity.accesscontextmanager.v1.ServicePerimeter, com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder, com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder> servicePerimetersBuilder_;

    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeter> getServicePerimetersList() {
      if (servicePerimetersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(servicePerimeters_);
      } else {
        return servicePerimetersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public int getServicePerimetersCount() {
      if (servicePerimetersBuilder_ == null) {
        return servicePerimeters_.size();
      } else {
        return servicePerimetersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.ServicePerimeter getServicePerimeters(int index) {
      if (servicePerimetersBuilder_ == null) {
        return servicePerimeters_.get(index);
      } else {
        return servicePerimetersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder setServicePerimeters(
        int index, com.google.identity.accesscontextmanager.v1.ServicePerimeter value) {
      if (servicePerimetersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicePerimetersIsMutable();
        servicePerimeters_.set(index, value);
        onChanged();
      } else {
        servicePerimetersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder setServicePerimeters(
        int index, com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder builderForValue) {
      if (servicePerimetersBuilder_ == null) {
        ensureServicePerimetersIsMutable();
        servicePerimeters_.set(index, builderForValue.build());
        onChanged();
      } else {
        servicePerimetersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder addServicePerimeters(com.google.identity.accesscontextmanager.v1.ServicePerimeter value) {
      if (servicePerimetersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicePerimetersIsMutable();
        servicePerimeters_.add(value);
        onChanged();
      } else {
        servicePerimetersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder addServicePerimeters(
        int index, com.google.identity.accesscontextmanager.v1.ServicePerimeter value) {
      if (servicePerimetersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicePerimetersIsMutable();
        servicePerimeters_.add(index, value);
        onChanged();
      } else {
        servicePerimetersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder addServicePerimeters(
        com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder builderForValue) {
      if (servicePerimetersBuilder_ == null) {
        ensureServicePerimetersIsMutable();
        servicePerimeters_.add(builderForValue.build());
        onChanged();
      } else {
        servicePerimetersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder addServicePerimeters(
        int index, com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder builderForValue) {
      if (servicePerimetersBuilder_ == null) {
        ensureServicePerimetersIsMutable();
        servicePerimeters_.add(index, builderForValue.build());
        onChanged();
      } else {
        servicePerimetersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder addAllServicePerimeters(
        java.lang.Iterable<? extends com.google.identity.accesscontextmanager.v1.ServicePerimeter> values) {
      if (servicePerimetersBuilder_ == null) {
        ensureServicePerimetersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, servicePerimeters_);
        onChanged();
      } else {
        servicePerimetersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder clearServicePerimeters() {
      if (servicePerimetersBuilder_ == null) {
        servicePerimeters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        servicePerimetersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public Builder removeServicePerimeters(int index) {
      if (servicePerimetersBuilder_ == null) {
        ensureServicePerimetersIsMutable();
        servicePerimeters_.remove(index);
        onChanged();
      } else {
        servicePerimetersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder getServicePerimetersBuilder(
        int index) {
      return getServicePerimetersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder getServicePerimetersOrBuilder(
        int index) {
      if (servicePerimetersBuilder_ == null) {
        return servicePerimeters_.get(index);  } else {
        return servicePerimetersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public java.util.List<? extends com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder> 
         getServicePerimetersOrBuilderList() {
      if (servicePerimetersBuilder_ != null) {
        return servicePerimetersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(servicePerimeters_);
      }
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder addServicePerimetersBuilder() {
      return getServicePerimetersFieldBuilder().addBuilder(
          com.google.identity.accesscontextmanager.v1.ServicePerimeter.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder addServicePerimetersBuilder(
        int index) {
      return getServicePerimetersFieldBuilder().addBuilder(
          index, com.google.identity.accesscontextmanager.v1.ServicePerimeter.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all the [Service Perimeter]
     * [google.identity.accesscontextmanager.v1.ServicePerimeter] instances in
     * the [Access Policy]
     * [google.identity.accesscontextmanager.v1.AccessPolicy].
     * </pre>
     *
     * <code>repeated .google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeters = 1;</code>
     */
    public java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder> 
         getServicePerimetersBuilderList() {
      return getServicePerimetersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.identity.accesscontextmanager.v1.ServicePerimeter, com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder, com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder> 
        getServicePerimetersFieldBuilder() {
      if (servicePerimetersBuilder_ == null) {
        servicePerimetersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.ServicePerimeter, com.google.identity.accesscontextmanager.v1.ServicePerimeter.Builder, com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder>(
                servicePerimeters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        servicePerimeters_ = null;
      }
      return servicePerimetersBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse)
  private static final com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse();
  }

  public static com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitServicePerimetersResponse>
      PARSER = new com.google.protobuf.AbstractParser<CommitServicePerimetersResponse>() {
    @java.lang.Override
    public CommitServicePerimetersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommitServicePerimetersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommitServicePerimetersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitServicePerimetersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.CommitServicePerimetersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

