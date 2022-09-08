// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for [DatasetService.ListDataItems][google.cloud.aiplatform.v1.DatasetService.ListDataItems].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListDataItemsResponse}
 */
public final class ListDataItemsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListDataItemsResponse)
    ListDataItemsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDataItemsResponse.newBuilder() to construct.
  private ListDataItemsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDataItemsResponse() {
    dataItems_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDataItemsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDataItemsResponse(
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
              dataItems_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.DataItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            dataItems_.add(
                input.readMessage(com.google.cloud.aiplatform.v1.DataItem.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        dataItems_ = java.util.Collections.unmodifiableList(dataItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListDataItemsResponse.class, com.google.cloud.aiplatform.v1.ListDataItemsResponse.Builder.class);
  }

  public static final int DATA_ITEMS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1.DataItem> dataItems_;
  /**
   * <pre>
   * A list of DataItems that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.DataItem> getDataItemsList() {
    return dataItems_;
  }
  /**
   * <pre>
   * A list of DataItems that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.DataItemOrBuilder> 
      getDataItemsOrBuilderList() {
    return dataItems_;
  }
  /**
   * <pre>
   * A list of DataItems that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
   */
  @java.lang.Override
  public int getDataItemsCount() {
    return dataItems_.size();
  }
  /**
   * <pre>
   * A list of DataItems that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DataItem getDataItems(int index) {
    return dataItems_.get(index);
  }
  /**
   * <pre>
   * A list of DataItems that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DataItemOrBuilder getDataItemsOrBuilder(
      int index) {
    return dataItems_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < dataItems_.size(); i++) {
      output.writeMessage(1, dataItems_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dataItems_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListDataItemsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListDataItemsResponse other = (com.google.cloud.aiplatform.v1.ListDataItemsResponse) obj;

    if (!getDataItemsList()
        .equals(other.getDataItemsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getDataItemsCount() > 0) {
      hash = (37 * hash) + DATA_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getDataItemsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ListDataItemsResponse prototype) {
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
   * Response message for [DatasetService.ListDataItems][google.cloud.aiplatform.v1.DatasetService.ListDataItems].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListDataItemsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListDataItemsResponse)
      com.google.cloud.aiplatform.v1.ListDataItemsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListDataItemsResponse.class, com.google.cloud.aiplatform.v1.ListDataItemsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListDataItemsResponse.newBuilder()
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
        getDataItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataItemsBuilder_ == null) {
        dataItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataItemsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_ListDataItemsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListDataItemsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListDataItemsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListDataItemsResponse build() {
      com.google.cloud.aiplatform.v1.ListDataItemsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListDataItemsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListDataItemsResponse result = new com.google.cloud.aiplatform.v1.ListDataItemsResponse(this);
      int from_bitField0_ = bitField0_;
      if (dataItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataItems_ = java.util.Collections.unmodifiableList(dataItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataItems_ = dataItems_;
      } else {
        result.dataItems_ = dataItemsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListDataItemsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListDataItemsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListDataItemsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListDataItemsResponse.getDefaultInstance()) return this;
      if (dataItemsBuilder_ == null) {
        if (!other.dataItems_.isEmpty()) {
          if (dataItems_.isEmpty()) {
            dataItems_ = other.dataItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataItemsIsMutable();
            dataItems_.addAll(other.dataItems_);
          }
          onChanged();
        }
      } else {
        if (!other.dataItems_.isEmpty()) {
          if (dataItemsBuilder_.isEmpty()) {
            dataItemsBuilder_.dispose();
            dataItemsBuilder_ = null;
            dataItems_ = other.dataItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataItemsFieldBuilder() : null;
          } else {
            dataItemsBuilder_.addAllMessages(other.dataItems_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.aiplatform.v1.ListDataItemsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.ListDataItemsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1.DataItem> dataItems_ =
      java.util.Collections.emptyList();
    private void ensureDataItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataItems_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.DataItem>(dataItems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.DataItem, com.google.cloud.aiplatform.v1.DataItem.Builder, com.google.cloud.aiplatform.v1.DataItemOrBuilder> dataItemsBuilder_;

    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.DataItem> getDataItemsList() {
      if (dataItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataItems_);
      } else {
        return dataItemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public int getDataItemsCount() {
      if (dataItemsBuilder_ == null) {
        return dataItems_.size();
      } else {
        return dataItemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DataItem getDataItems(int index) {
      if (dataItemsBuilder_ == null) {
        return dataItems_.get(index);
      } else {
        return dataItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder setDataItems(
        int index, com.google.cloud.aiplatform.v1.DataItem value) {
      if (dataItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataItemsIsMutable();
        dataItems_.set(index, value);
        onChanged();
      } else {
        dataItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder setDataItems(
        int index, com.google.cloud.aiplatform.v1.DataItem.Builder builderForValue) {
      if (dataItemsBuilder_ == null) {
        ensureDataItemsIsMutable();
        dataItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder addDataItems(com.google.cloud.aiplatform.v1.DataItem value) {
      if (dataItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataItemsIsMutable();
        dataItems_.add(value);
        onChanged();
      } else {
        dataItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder addDataItems(
        int index, com.google.cloud.aiplatform.v1.DataItem value) {
      if (dataItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataItemsIsMutable();
        dataItems_.add(index, value);
        onChanged();
      } else {
        dataItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder addDataItems(
        com.google.cloud.aiplatform.v1.DataItem.Builder builderForValue) {
      if (dataItemsBuilder_ == null) {
        ensureDataItemsIsMutable();
        dataItems_.add(builderForValue.build());
        onChanged();
      } else {
        dataItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder addDataItems(
        int index, com.google.cloud.aiplatform.v1.DataItem.Builder builderForValue) {
      if (dataItemsBuilder_ == null) {
        ensureDataItemsIsMutable();
        dataItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder addAllDataItems(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.DataItem> values) {
      if (dataItemsBuilder_ == null) {
        ensureDataItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataItems_);
        onChanged();
      } else {
        dataItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder clearDataItems() {
      if (dataItemsBuilder_ == null) {
        dataItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public Builder removeDataItems(int index) {
      if (dataItemsBuilder_ == null) {
        ensureDataItemsIsMutable();
        dataItems_.remove(index);
        onChanged();
      } else {
        dataItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DataItem.Builder getDataItemsBuilder(
        int index) {
      return getDataItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DataItemOrBuilder getDataItemsOrBuilder(
        int index) {
      if (dataItemsBuilder_ == null) {
        return dataItems_.get(index);  } else {
        return dataItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.DataItemOrBuilder> 
         getDataItemsOrBuilderList() {
      if (dataItemsBuilder_ != null) {
        return dataItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataItems_);
      }
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DataItem.Builder addDataItemsBuilder() {
      return getDataItemsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1.DataItem.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.DataItem.Builder addDataItemsBuilder(
        int index) {
      return getDataItemsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1.DataItem.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of DataItems that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.DataItem data_items = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.DataItem.Builder> 
         getDataItemsBuilderList() {
      return getDataItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.DataItem, com.google.cloud.aiplatform.v1.DataItem.Builder, com.google.cloud.aiplatform.v1.DataItemOrBuilder> 
        getDataItemsFieldBuilder() {
      if (dataItemsBuilder_ == null) {
        dataItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DataItem, com.google.cloud.aiplatform.v1.DataItem.Builder, com.google.cloud.aiplatform.v1.DataItemOrBuilder>(
                dataItems_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataItems_ = null;
      }
      return dataItemsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListDataItemsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListDataItemsResponse)
  private static final com.google.cloud.aiplatform.v1.ListDataItemsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListDataItemsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListDataItemsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataItemsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDataItemsResponse>() {
    @java.lang.Override
    public ListDataItemsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDataItemsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDataItemsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataItemsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListDataItemsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

