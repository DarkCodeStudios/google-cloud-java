// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_service.proto

package com.google.cloud.gkemulticloud.v1;

/**
 * <pre>
 * Response message for `AzureClusters.ListAzureClusters` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAzureClustersResponse}
 */
public final class ListAzureClustersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.ListAzureClustersResponse)
    ListAzureClustersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAzureClustersResponse.newBuilder() to construct.
  private ListAzureClustersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAzureClustersResponse() {
    azureClusters_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAzureClustersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListAzureClustersResponse(
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
              azureClusters_ = new java.util.ArrayList<com.google.cloud.gkemulticloud.v1.AzureCluster>();
              mutable_bitField0_ |= 0x00000001;
            }
            azureClusters_.add(
                input.readMessage(com.google.cloud.gkemulticloud.v1.AzureCluster.parser(), extensionRegistry));
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
        azureClusters_ = java.util.Collections.unmodifiableList(azureClusters_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAzureClustersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAzureClustersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.class, com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.Builder.class);
  }

  public static final int AZURE_CLUSTERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.gkemulticloud.v1.AzureCluster> azureClusters_;
  /**
   * <pre>
   * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkemulticloud.v1.AzureCluster> getAzureClustersList() {
    return azureClusters_;
  }
  /**
   * <pre>
   * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder> 
      getAzureClustersOrBuilderList() {
    return azureClusters_;
  }
  /**
   * <pre>
   * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
   */
  @java.lang.Override
  public int getAzureClustersCount() {
    return azureClusters_.size();
  }
  /**
   * <pre>
   * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureCluster getAzureClusters(int index) {
    return azureClusters_.get(index);
  }
  /**
   * <pre>
   * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder getAzureClustersOrBuilder(
      int index) {
    return azureClusters_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < azureClusters_.size(); i++) {
      output.writeMessage(1, azureClusters_.get(i));
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
    for (int i = 0; i < azureClusters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, azureClusters_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse other = (com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse) obj;

    if (!getAzureClustersList()
        .equals(other.getAzureClustersList())) return false;
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
    if (getAzureClustersCount() > 0) {
      hash = (37 * hash) + AZURE_CLUSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getAzureClustersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse prototype) {
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
   * Response message for `AzureClusters.ListAzureClusters` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAzureClustersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.ListAzureClustersResponse)
      com.google.cloud.gkemulticloud.v1.ListAzureClustersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAzureClustersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAzureClustersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.class, com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.newBuilder()
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
        getAzureClustersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (azureClustersBuilder_ == null) {
        azureClusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        azureClustersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureServiceProto.internal_static_google_cloud_gkemulticloud_v1_ListAzureClustersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse build() {
      com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse buildPartial() {
      com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse result = new com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse(this);
      int from_bitField0_ = bitField0_;
      if (azureClustersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          azureClusters_ = java.util.Collections.unmodifiableList(azureClusters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.azureClusters_ = azureClusters_;
      } else {
        result.azureClusters_ = azureClustersBuilder_.build();
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse other) {
      if (other == com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse.getDefaultInstance()) return this;
      if (azureClustersBuilder_ == null) {
        if (!other.azureClusters_.isEmpty()) {
          if (azureClusters_.isEmpty()) {
            azureClusters_ = other.azureClusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAzureClustersIsMutable();
            azureClusters_.addAll(other.azureClusters_);
          }
          onChanged();
        }
      } else {
        if (!other.azureClusters_.isEmpty()) {
          if (azureClustersBuilder_.isEmpty()) {
            azureClustersBuilder_.dispose();
            azureClustersBuilder_ = null;
            azureClusters_ = other.azureClusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            azureClustersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAzureClustersFieldBuilder() : null;
          } else {
            azureClustersBuilder_.addAllMessages(other.azureClusters_);
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
      com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.gkemulticloud.v1.AzureCluster> azureClusters_ =
      java.util.Collections.emptyList();
    private void ensureAzureClustersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        azureClusters_ = new java.util.ArrayList<com.google.cloud.gkemulticloud.v1.AzureCluster>(azureClusters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkemulticloud.v1.AzureCluster, com.google.cloud.gkemulticloud.v1.AzureCluster.Builder, com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder> azureClustersBuilder_;

    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AzureCluster> getAzureClustersList() {
      if (azureClustersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(azureClusters_);
      } else {
        return azureClustersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public int getAzureClustersCount() {
      if (azureClustersBuilder_ == null) {
        return azureClusters_.size();
      } else {
        return azureClustersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureCluster getAzureClusters(int index) {
      if (azureClustersBuilder_ == null) {
        return azureClusters_.get(index);
      } else {
        return azureClustersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder setAzureClusters(
        int index, com.google.cloud.gkemulticloud.v1.AzureCluster value) {
      if (azureClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAzureClustersIsMutable();
        azureClusters_.set(index, value);
        onChanged();
      } else {
        azureClustersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder setAzureClusters(
        int index, com.google.cloud.gkemulticloud.v1.AzureCluster.Builder builderForValue) {
      if (azureClustersBuilder_ == null) {
        ensureAzureClustersIsMutable();
        azureClusters_.set(index, builderForValue.build());
        onChanged();
      } else {
        azureClustersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder addAzureClusters(com.google.cloud.gkemulticloud.v1.AzureCluster value) {
      if (azureClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAzureClustersIsMutable();
        azureClusters_.add(value);
        onChanged();
      } else {
        azureClustersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder addAzureClusters(
        int index, com.google.cloud.gkemulticloud.v1.AzureCluster value) {
      if (azureClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAzureClustersIsMutable();
        azureClusters_.add(index, value);
        onChanged();
      } else {
        azureClustersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder addAzureClusters(
        com.google.cloud.gkemulticloud.v1.AzureCluster.Builder builderForValue) {
      if (azureClustersBuilder_ == null) {
        ensureAzureClustersIsMutable();
        azureClusters_.add(builderForValue.build());
        onChanged();
      } else {
        azureClustersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder addAzureClusters(
        int index, com.google.cloud.gkemulticloud.v1.AzureCluster.Builder builderForValue) {
      if (azureClustersBuilder_ == null) {
        ensureAzureClustersIsMutable();
        azureClusters_.add(index, builderForValue.build());
        onChanged();
      } else {
        azureClustersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder addAllAzureClusters(
        java.lang.Iterable<? extends com.google.cloud.gkemulticloud.v1.AzureCluster> values) {
      if (azureClustersBuilder_ == null) {
        ensureAzureClustersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, azureClusters_);
        onChanged();
      } else {
        azureClustersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder clearAzureClusters() {
      if (azureClustersBuilder_ == null) {
        azureClusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        azureClustersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public Builder removeAzureClusters(int index) {
      if (azureClustersBuilder_ == null) {
        ensureAzureClustersIsMutable();
        azureClusters_.remove(index);
        onChanged();
      } else {
        azureClustersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureCluster.Builder getAzureClustersBuilder(
        int index) {
      return getAzureClustersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder getAzureClustersOrBuilder(
        int index) {
      if (azureClustersBuilder_ == null) {
        return azureClusters_.get(index);  } else {
        return azureClustersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder> 
         getAzureClustersOrBuilderList() {
      if (azureClustersBuilder_ != null) {
        return azureClustersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(azureClusters_);
      }
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureCluster.Builder addAzureClustersBuilder() {
      return getAzureClustersFieldBuilder().addBuilder(
          com.google.cloud.gkemulticloud.v1.AzureCluster.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureCluster.Builder addAzureClustersBuilder(
        int index) {
      return getAzureClustersFieldBuilder().addBuilder(
          index, com.google.cloud.gkemulticloud.v1.AzureCluster.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resources in the specified GCP
     * project and region region.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureCluster azure_clusters = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AzureCluster.Builder> 
         getAzureClustersBuilderList() {
      return getAzureClustersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkemulticloud.v1.AzureCluster, com.google.cloud.gkemulticloud.v1.AzureCluster.Builder, com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder> 
        getAzureClustersFieldBuilder() {
      if (azureClustersBuilder_ == null) {
        azureClustersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AzureCluster, com.google.cloud.gkemulticloud.v1.AzureCluster.Builder, com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder>(
                azureClusters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        azureClusters_ = null;
      }
      return azureClustersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.ListAzureClustersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.ListAzureClustersResponse)
  private static final com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse();
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAzureClustersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAzureClustersResponse>() {
    @java.lang.Override
    public ListAzureClustersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListAzureClustersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListAzureClustersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAzureClustersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.ListAzureClustersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

