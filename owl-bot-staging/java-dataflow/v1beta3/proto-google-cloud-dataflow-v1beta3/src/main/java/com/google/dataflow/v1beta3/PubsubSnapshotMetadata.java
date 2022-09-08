// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/snapshots.proto

package com.google.dataflow.v1beta3;

/**
 * <pre>
 * Represents a Pubsub snapshot.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.PubsubSnapshotMetadata}
 */
public final class PubsubSnapshotMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.PubsubSnapshotMetadata)
    PubsubSnapshotMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PubsubSnapshotMetadata.newBuilder() to construct.
  private PubsubSnapshotMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PubsubSnapshotMetadata() {
    topicName_ = "";
    snapshotName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PubsubSnapshotMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PubsubSnapshotMetadata(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            topicName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            snapshotName_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (expireTime_ != null) {
              subBuilder = expireTime_.toBuilder();
            }
            expireTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expireTime_);
              expireTime_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.dataflow.v1beta3.SnapshotsProto.internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.SnapshotsProto.internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.PubsubSnapshotMetadata.class, com.google.dataflow.v1beta3.PubsubSnapshotMetadata.Builder.class);
  }

  public static final int TOPIC_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object topicName_;
  /**
   * <pre>
   * The name of the Pubsub topic.
   * </pre>
   *
   * <code>string topic_name = 1;</code>
   * @return The topicName.
   */
  @java.lang.Override
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Pubsub topic.
   * </pre>
   *
   * <code>string topic_name = 1;</code>
   * @return The bytes for topicName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object snapshotName_;
  /**
   * <pre>
   * The name of the Pubsub snapshot.
   * </pre>
   *
   * <code>string snapshot_name = 2;</code>
   * @return The snapshotName.
   */
  @java.lang.Override
  public java.lang.String getSnapshotName() {
    java.lang.Object ref = snapshotName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Pubsub snapshot.
   * </pre>
   *
   * <code>string snapshot_name = 2;</code>
   * @return The bytes for snapshotName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnapshotNameBytes() {
    java.lang.Object ref = snapshotName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshotName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   * <pre>
   * The expire time of the Pubsub snapshot.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   * @return Whether the expireTime field is set.
   */
  @java.lang.Override
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   * <pre>
   * The expire time of the Pubsub snapshot.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   * <pre>
   * The expire time of the Pubsub snapshot.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return getExpireTime();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, snapshotName_);
    }
    if (expireTime_ != null) {
      output.writeMessage(3, getExpireTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topicName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, snapshotName_);
    }
    if (expireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExpireTime());
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
    if (!(obj instanceof com.google.dataflow.v1beta3.PubsubSnapshotMetadata)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.PubsubSnapshotMetadata other = (com.google.dataflow.v1beta3.PubsubSnapshotMetadata) obj;

    if (!getTopicName()
        .equals(other.getTopicName())) return false;
    if (!getSnapshotName()
        .equals(other.getSnapshotName())) return false;
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime()
          .equals(other.getExpireTime())) return false;
    }
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
    hash = (37 * hash) + TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (37 * hash) + SNAPSHOT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotName().hashCode();
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata parseFrom(
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
  public static Builder newBuilder(com.google.dataflow.v1beta3.PubsubSnapshotMetadata prototype) {
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
   * Represents a Pubsub snapshot.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.PubsubSnapshotMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.PubsubSnapshotMetadata)
      com.google.dataflow.v1beta3.PubsubSnapshotMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.SnapshotsProto.internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.SnapshotsProto.internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.PubsubSnapshotMetadata.class, com.google.dataflow.v1beta3.PubsubSnapshotMetadata.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.PubsubSnapshotMetadata.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      topicName_ = "";

      snapshotName_ = "";

      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.dataflow.v1beta3.SnapshotsProto.internal_static_google_dataflow_v1beta3_PubsubSnapshotMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.PubsubSnapshotMetadata getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.PubsubSnapshotMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.PubsubSnapshotMetadata build() {
      com.google.dataflow.v1beta3.PubsubSnapshotMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.PubsubSnapshotMetadata buildPartial() {
      com.google.dataflow.v1beta3.PubsubSnapshotMetadata result = new com.google.dataflow.v1beta3.PubsubSnapshotMetadata(this);
      result.topicName_ = topicName_;
      result.snapshotName_ = snapshotName_;
      if (expireTimeBuilder_ == null) {
        result.expireTime_ = expireTime_;
      } else {
        result.expireTime_ = expireTimeBuilder_.build();
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
      if (other instanceof com.google.dataflow.v1beta3.PubsubSnapshotMetadata) {
        return mergeFrom((com.google.dataflow.v1beta3.PubsubSnapshotMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.PubsubSnapshotMetadata other) {
      if (other == com.google.dataflow.v1beta3.PubsubSnapshotMetadata.getDefaultInstance()) return this;
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        onChanged();
      }
      if (!other.getSnapshotName().isEmpty()) {
        snapshotName_ = other.snapshotName_;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
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
      com.google.dataflow.v1beta3.PubsubSnapshotMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.dataflow.v1beta3.PubsubSnapshotMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object topicName_ = "";
    /**
     * <pre>
     * The name of the Pubsub topic.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return The topicName.
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Pubsub topic.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return The bytes for topicName.
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Pubsub topic.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topicName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Pubsub topic.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      
      topicName_ = getDefaultInstance().getTopicName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Pubsub topic.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @param value The bytes for topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topicName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object snapshotName_ = "";
    /**
     * <pre>
     * The name of the Pubsub snapshot.
     * </pre>
     *
     * <code>string snapshot_name = 2;</code>
     * @return The snapshotName.
     */
    public java.lang.String getSnapshotName() {
      java.lang.Object ref = snapshotName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Pubsub snapshot.
     * </pre>
     *
     * <code>string snapshot_name = 2;</code>
     * @return The bytes for snapshotName.
     */
    public com.google.protobuf.ByteString
        getSnapshotNameBytes() {
      java.lang.Object ref = snapshotName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshotName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Pubsub snapshot.
     * </pre>
     *
     * <code>string snapshot_name = 2;</code>
     * @param value The snapshotName to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshotName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Pubsub snapshot.
     * </pre>
     *
     * <code>string snapshot_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapshotName() {
      
      snapshotName_ = getDefaultInstance().getSnapshotName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Pubsub snapshot.
     * </pre>
     *
     * <code>string snapshot_name = 2;</code>
     * @param value The bytes for snapshotName to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshotName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expireTimeBuilder_;
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     * @return Whether the expireTime field is set.
     */
    public boolean hasExpireTime() {
      return expireTimeBuilder_ != null || expireTime_ != null;
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     * @return The expireTime.
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder setExpireTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (expireTime_ != null) {
          expireTime_ =
            com.google.protobuf.Timestamp.newBuilder(expireTime_).mergeFrom(value).buildPartial();
        } else {
          expireTime_ = value;
        }
        onChanged();
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder clearExpireTime() {
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
        onChanged();
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
      
      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      }
    }
    /**
     * <pre>
     * The expire time of the Pubsub snapshot.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(),
                getParentForChildren(),
                isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.PubsubSnapshotMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.PubsubSnapshotMetadata)
  private static final com.google.dataflow.v1beta3.PubsubSnapshotMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.PubsubSnapshotMetadata();
  }

  public static com.google.dataflow.v1beta3.PubsubSnapshotMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PubsubSnapshotMetadata>
      PARSER = new com.google.protobuf.AbstractParser<PubsubSnapshotMetadata>() {
    @java.lang.Override
    public PubsubSnapshotMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PubsubSnapshotMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PubsubSnapshotMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PubsubSnapshotMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.PubsubSnapshotMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

