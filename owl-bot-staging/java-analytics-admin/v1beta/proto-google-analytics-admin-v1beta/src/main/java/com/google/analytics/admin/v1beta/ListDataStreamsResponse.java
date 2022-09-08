// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 * <pre>
 * Response message for ListDataStreams RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.ListDataStreamsResponse}
 */
public final class ListDataStreamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.ListDataStreamsResponse)
    ListDataStreamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDataStreamsResponse.newBuilder() to construct.
  private ListDataStreamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDataStreamsResponse() {
    dataStreams_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDataStreamsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDataStreamsResponse(
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
              dataStreams_ = new java.util.ArrayList<com.google.analytics.admin.v1beta.DataStream>();
              mutable_bitField0_ |= 0x00000001;
            }
            dataStreams_.add(
                input.readMessage(com.google.analytics.admin.v1beta.DataStream.parser(), extensionRegistry));
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
        dataStreams_ = java.util.Collections.unmodifiableList(dataStreams_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListDataStreamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListDataStreamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.ListDataStreamsResponse.class, com.google.analytics.admin.v1beta.ListDataStreamsResponse.Builder.class);
  }

  public static final int DATA_STREAMS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1beta.DataStream> dataStreams_;
  /**
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1beta.DataStream> getDataStreamsList() {
    return dataStreams_;
  }
  /**
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1beta.DataStreamOrBuilder> 
      getDataStreamsOrBuilderList() {
    return dataStreams_;
  }
  /**
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  @java.lang.Override
  public int getDataStreamsCount() {
    return dataStreams_.size();
  }
  /**
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.DataStream getDataStreams(int index) {
    return dataStreams_.get(index);
  }
  /**
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.DataStreamOrBuilder getDataStreamsOrBuilder(
      int index) {
    return dataStreams_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < dataStreams_.size(); i++) {
      output.writeMessage(1, dataStreams_.get(i));
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
    for (int i = 0; i < dataStreams_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dataStreams_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.ListDataStreamsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.ListDataStreamsResponse other = (com.google.analytics.admin.v1beta.ListDataStreamsResponse) obj;

    if (!getDataStreamsList()
        .equals(other.getDataStreamsList())) return false;
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
    if (getDataStreamsCount() > 0) {
      hash = (37 * hash) + DATA_STREAMS_FIELD_NUMBER;
      hash = (53 * hash) + getDataStreamsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1beta.ListDataStreamsResponse prototype) {
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
   * Response message for ListDataStreams RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.ListDataStreamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.ListDataStreamsResponse)
      com.google.analytics.admin.v1beta.ListDataStreamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListDataStreamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListDataStreamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.ListDataStreamsResponse.class, com.google.analytics.admin.v1beta.ListDataStreamsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.ListDataStreamsResponse.newBuilder()
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
        getDataStreamsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dataStreamsBuilder_ == null) {
        dataStreams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataStreamsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto.internal_static_google_analytics_admin_v1beta_ListDataStreamsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListDataStreamsResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.ListDataStreamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListDataStreamsResponse build() {
      com.google.analytics.admin.v1beta.ListDataStreamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListDataStreamsResponse buildPartial() {
      com.google.analytics.admin.v1beta.ListDataStreamsResponse result = new com.google.analytics.admin.v1beta.ListDataStreamsResponse(this);
      int from_bitField0_ = bitField0_;
      if (dataStreamsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataStreams_ = java.util.Collections.unmodifiableList(dataStreams_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataStreams_ = dataStreams_;
      } else {
        result.dataStreams_ = dataStreamsBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1beta.ListDataStreamsResponse) {
        return mergeFrom((com.google.analytics.admin.v1beta.ListDataStreamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.ListDataStreamsResponse other) {
      if (other == com.google.analytics.admin.v1beta.ListDataStreamsResponse.getDefaultInstance()) return this;
      if (dataStreamsBuilder_ == null) {
        if (!other.dataStreams_.isEmpty()) {
          if (dataStreams_.isEmpty()) {
            dataStreams_ = other.dataStreams_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataStreamsIsMutable();
            dataStreams_.addAll(other.dataStreams_);
          }
          onChanged();
        }
      } else {
        if (!other.dataStreams_.isEmpty()) {
          if (dataStreamsBuilder_.isEmpty()) {
            dataStreamsBuilder_.dispose();
            dataStreamsBuilder_ = null;
            dataStreams_ = other.dataStreams_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataStreamsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataStreamsFieldBuilder() : null;
          } else {
            dataStreamsBuilder_.addAllMessages(other.dataStreams_);
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
      com.google.analytics.admin.v1beta.ListDataStreamsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1beta.ListDataStreamsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1beta.DataStream> dataStreams_ =
      java.util.Collections.emptyList();
    private void ensureDataStreamsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataStreams_ = new java.util.ArrayList<com.google.analytics.admin.v1beta.DataStream>(dataStreams_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1beta.DataStream, com.google.analytics.admin.v1beta.DataStream.Builder, com.google.analytics.admin.v1beta.DataStreamOrBuilder> dataStreamsBuilder_;

    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.DataStream> getDataStreamsList() {
      if (dataStreamsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataStreams_);
      } else {
        return dataStreamsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public int getDataStreamsCount() {
      if (dataStreamsBuilder_ == null) {
        return dataStreams_.size();
      } else {
        return dataStreamsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1beta.DataStream getDataStreams(int index) {
      if (dataStreamsBuilder_ == null) {
        return dataStreams_.get(index);
      } else {
        return dataStreamsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder setDataStreams(
        int index, com.google.analytics.admin.v1beta.DataStream value) {
      if (dataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataStreamsIsMutable();
        dataStreams_.set(index, value);
        onChanged();
      } else {
        dataStreamsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder setDataStreams(
        int index, com.google.analytics.admin.v1beta.DataStream.Builder builderForValue) {
      if (dataStreamsBuilder_ == null) {
        ensureDataStreamsIsMutable();
        dataStreams_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataStreamsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder addDataStreams(com.google.analytics.admin.v1beta.DataStream value) {
      if (dataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataStreamsIsMutable();
        dataStreams_.add(value);
        onChanged();
      } else {
        dataStreamsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder addDataStreams(
        int index, com.google.analytics.admin.v1beta.DataStream value) {
      if (dataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataStreamsIsMutable();
        dataStreams_.add(index, value);
        onChanged();
      } else {
        dataStreamsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder addDataStreams(
        com.google.analytics.admin.v1beta.DataStream.Builder builderForValue) {
      if (dataStreamsBuilder_ == null) {
        ensureDataStreamsIsMutable();
        dataStreams_.add(builderForValue.build());
        onChanged();
      } else {
        dataStreamsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder addDataStreams(
        int index, com.google.analytics.admin.v1beta.DataStream.Builder builderForValue) {
      if (dataStreamsBuilder_ == null) {
        ensureDataStreamsIsMutable();
        dataStreams_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataStreamsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder addAllDataStreams(
        java.lang.Iterable<? extends com.google.analytics.admin.v1beta.DataStream> values) {
      if (dataStreamsBuilder_ == null) {
        ensureDataStreamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataStreams_);
        onChanged();
      } else {
        dataStreamsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder clearDataStreams() {
      if (dataStreamsBuilder_ == null) {
        dataStreams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataStreamsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public Builder removeDataStreams(int index) {
      if (dataStreamsBuilder_ == null) {
        ensureDataStreamsIsMutable();
        dataStreams_.remove(index);
        onChanged();
      } else {
        dataStreamsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1beta.DataStream.Builder getDataStreamsBuilder(
        int index) {
      return getDataStreamsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1beta.DataStreamOrBuilder getDataStreamsOrBuilder(
        int index) {
      if (dataStreamsBuilder_ == null) {
        return dataStreams_.get(index);  } else {
        return dataStreamsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1beta.DataStreamOrBuilder> 
         getDataStreamsOrBuilderList() {
      if (dataStreamsBuilder_ != null) {
        return dataStreamsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataStreams_);
      }
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1beta.DataStream.Builder addDataStreamsBuilder() {
      return getDataStreamsFieldBuilder().addBuilder(
          com.google.analytics.admin.v1beta.DataStream.getDefaultInstance());
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1beta.DataStream.Builder addDataStreamsBuilder(
        int index) {
      return getDataStreamsFieldBuilder().addBuilder(
          index, com.google.analytics.admin.v1beta.DataStream.getDefaultInstance());
    }
    /**
     * <pre>
     * List of DataStreams.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.DataStream.Builder> 
         getDataStreamsBuilderList() {
      return getDataStreamsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1beta.DataStream, com.google.analytics.admin.v1beta.DataStream.Builder, com.google.analytics.admin.v1beta.DataStreamOrBuilder> 
        getDataStreamsFieldBuilder() {
      if (dataStreamsBuilder_ == null) {
        dataStreamsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1beta.DataStream, com.google.analytics.admin.v1beta.DataStream.Builder, com.google.analytics.admin.v1beta.DataStreamOrBuilder>(
                dataStreams_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataStreams_ = null;
      }
      return dataStreamsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.ListDataStreamsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.ListDataStreamsResponse)
  private static final com.google.analytics.admin.v1beta.ListDataStreamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.ListDataStreamsResponse();
  }

  public static com.google.analytics.admin.v1beta.ListDataStreamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataStreamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDataStreamsResponse>() {
    @java.lang.Override
    public ListDataStreamsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDataStreamsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDataStreamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataStreamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.ListDataStreamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

