// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 * <pre>
 * Metadata for the `DeleteWorkerPool` operation.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata}
 */
public final class DeleteWorkerPoolOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)
    DeleteWorkerPoolOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteWorkerPoolOperationMetadata.newBuilder() to construct.
  private DeleteWorkerPoolOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteWorkerPoolOperationMetadata() {
    workerPool_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteWorkerPoolOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteWorkerPoolOperationMetadata(
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

            workerPool_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createTime_ != null) {
              subBuilder = createTime_.toBuilder();
            }
            createTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createTime_);
              createTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (completeTime_ != null) {
              subBuilder = completeTime_.toBuilder();
            }
            completeTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(completeTime_);
              completeTime_ = subBuilder.buildPartial();
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
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_DeleteWorkerPoolOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_DeleteWorkerPoolOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.class, com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.Builder.class);
  }

  public static final int WORKER_POOL_FIELD_NUMBER = 1;
  private volatile java.lang.Object workerPool_;
  /**
   * <pre>
   * The resource name of the `WorkerPool` being deleted.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * </pre>
   *
   * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The workerPool.
   */
  @java.lang.Override
  public java.lang.String getWorkerPool() {
    java.lang.Object ref = workerPool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workerPool_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the `WorkerPool` being deleted.
   * Format:
   * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
   * </pre>
   *
   * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workerPool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkerPoolBytes() {
    java.lang.Object ref = workerPool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workerPool_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int COMPLETE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp completeTime_;
  /**
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   * @return Whether the completeTime field is set.
   */
  @java.lang.Override
  public boolean hasCompleteTime() {
    return completeTime_ != null;
  }
  /**
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   * @return The completeTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCompleteTime() {
    return completeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
  }
  /**
   * <pre>
   * Time the operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder() {
    return getCompleteTime();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workerPool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, workerPool_);
    }
    if (createTime_ != null) {
      output.writeMessage(2, getCreateTime());
    }
    if (completeTime_ != null) {
      output.writeMessage(3, getCompleteTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workerPool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, workerPool_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreateTime());
    }
    if (completeTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCompleteTime());
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
    if (!(obj instanceof com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata other = (com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata) obj;

    if (!getWorkerPool()
        .equals(other.getWorkerPool())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (hasCompleteTime() != other.hasCompleteTime()) return false;
    if (hasCompleteTime()) {
      if (!getCompleteTime()
          .equals(other.getCompleteTime())) return false;
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
    hash = (37 * hash) + WORKER_POOL_FIELD_NUMBER;
    hash = (53 * hash) + getWorkerPool().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasCompleteTime()) {
      hash = (37 * hash) + COMPLETE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompleteTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata prototype) {
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
   * Metadata for the `DeleteWorkerPool` operation.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)
      com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_DeleteWorkerPoolOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_DeleteWorkerPoolOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.class, com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.newBuilder()
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
      workerPool_ = "";

      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      if (completeTimeBuilder_ == null) {
        completeTime_ = null;
      } else {
        completeTime_ = null;
        completeTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_DeleteWorkerPoolOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata build() {
      com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata buildPartial() {
      com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata result = new com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata(this);
      result.workerPool_ = workerPool_;
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      if (completeTimeBuilder_ == null) {
        result.completeTime_ = completeTime_;
      } else {
        result.completeTime_ = completeTimeBuilder_.build();
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
      if (other instanceof com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata) {
        return mergeFrom((com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata other) {
      if (other == com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata.getDefaultInstance()) return this;
      if (!other.getWorkerPool().isEmpty()) {
        workerPool_ = other.workerPool_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasCompleteTime()) {
        mergeCompleteTime(other.getCompleteTime());
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
      com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object workerPool_ = "";
    /**
     * <pre>
     * The resource name of the `WorkerPool` being deleted.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The workerPool.
     */
    public java.lang.String getWorkerPool() {
      java.lang.Object ref = workerPool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workerPool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being deleted.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for workerPool.
     */
    public com.google.protobuf.ByteString
        getWorkerPoolBytes() {
      java.lang.Object ref = workerPool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workerPool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being deleted.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The workerPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerPool(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      workerPool_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being deleted.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkerPool() {
      
      workerPool_ = getDefaultInstance().getWorkerPool();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the `WorkerPool` being deleted.
     * Format:
     * `projects/{project}/locations/{location}/workerPools/{worker_pool}`.
     * </pre>
     *
     * <code>string worker_pool = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for workerPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerPoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      workerPool_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp completeTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> completeTimeBuilder_;
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     * @return Whether the completeTime field is set.
     */
    public boolean hasCompleteTime() {
      return completeTimeBuilder_ != null || completeTime_ != null;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     * @return The completeTime.
     */
    public com.google.protobuf.Timestamp getCompleteTime() {
      if (completeTimeBuilder_ == null) {
        return completeTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
      } else {
        return completeTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder setCompleteTime(com.google.protobuf.Timestamp value) {
      if (completeTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        completeTime_ = value;
        onChanged();
      } else {
        completeTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder setCompleteTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (completeTimeBuilder_ == null) {
        completeTime_ = builderForValue.build();
        onChanged();
      } else {
        completeTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder mergeCompleteTime(com.google.protobuf.Timestamp value) {
      if (completeTimeBuilder_ == null) {
        if (completeTime_ != null) {
          completeTime_ =
            com.google.protobuf.Timestamp.newBuilder(completeTime_).mergeFrom(value).buildPartial();
        } else {
          completeTime_ = value;
        }
        onChanged();
      } else {
        completeTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public Builder clearCompleteTime() {
      if (completeTimeBuilder_ == null) {
        completeTime_ = null;
        onChanged();
      } else {
        completeTime_ = null;
        completeTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCompleteTimeBuilder() {
      
      onChanged();
      return getCompleteTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder() {
      if (completeTimeBuilder_ != null) {
        return completeTimeBuilder_.getMessageOrBuilder();
      } else {
        return completeTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : completeTime_;
      }
    }
    /**
     * <pre>
     * Time the operation was completed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp complete_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCompleteTimeFieldBuilder() {
      if (completeTimeBuilder_ == null) {
        completeTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCompleteTime(),
                getParentForChildren(),
                isClean());
        completeTime_ = null;
      }
      return completeTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.DeleteWorkerPoolOperationMetadata)
  private static final com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata();
  }

  public static com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteWorkerPoolOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<DeleteWorkerPoolOperationMetadata>() {
    @java.lang.Override
    public DeleteWorkerPoolOperationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteWorkerPoolOperationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteWorkerPoolOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteWorkerPoolOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.DeleteWorkerPoolOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

