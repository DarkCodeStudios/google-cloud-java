// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1/repository.proto

package com.google.devtools.artifactregistry.v1;

/**
 * <pre>
 * The request to update a repository.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.UpdateRepositoryRequest}
 */
public final class UpdateRepositoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.UpdateRepositoryRequest)
    UpdateRepositoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRepositoryRequest.newBuilder() to construct.
  private UpdateRepositoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRepositoryRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRepositoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateRepositoryRequest(
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
            com.google.devtools.artifactregistry.v1.Repository.Builder subBuilder = null;
            if (repository_ != null) {
              subBuilder = repository_.toBuilder();
            }
            repository_ = input.readMessage(com.google.devtools.artifactregistry.v1.Repository.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(repository_);
              repository_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return com.google.devtools.artifactregistry.v1.RepositoryProto.internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.RepositoryProto.internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.class, com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.Builder.class);
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;
  private com.google.devtools.artifactregistry.v1.Repository repository_;
  /**
   * <pre>
   * The repository that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
   * @return Whether the repository field is set.
   */
  @java.lang.Override
  public boolean hasRepository() {
    return repository_ != null;
  }
  /**
   * <pre>
   * The repository that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
   * @return The repository.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.Repository getRepository() {
    return repository_ == null ? com.google.devtools.artifactregistry.v1.Repository.getDefaultInstance() : repository_;
  }
  /**
   * <pre>
   * The repository that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.RepositoryOrBuilder getRepositoryOrBuilder() {
    return getRepository();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The update mask applies to the resource. For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (repository_ != null) {
      output.writeMessage(1, getRepository());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (repository_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRepository());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest other = (com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest) obj;

    if (hasRepository() != other.hasRepository()) return false;
    if (hasRepository()) {
      if (!getRepository()
          .equals(other.getRepository())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasRepository()) {
      hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
      hash = (53 * hash) + getRepository().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest prototype) {
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
   * The request to update a repository.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.UpdateRepositoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.UpdateRepositoryRequest)
      com.google.devtools.artifactregistry.v1.UpdateRepositoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1.RepositoryProto.internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.RepositoryProto.internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.class, com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.newBuilder()
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
      if (repositoryBuilder_ == null) {
        repository_ = null;
      } else {
        repository_ = null;
        repositoryBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.RepositoryProto.internal_static_google_devtools_artifactregistry_v1_UpdateRepositoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest build() {
      com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest buildPartial() {
      com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest result = new com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest(this);
      if (repositoryBuilder_ == null) {
        result.repository_ = repository_;
      } else {
        result.repository_ = repositoryBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest other) {
      if (other == com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest.getDefaultInstance()) return this;
      if (other.hasRepository()) {
        mergeRepository(other.getRepository());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.devtools.artifactregistry.v1.Repository repository_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1.Repository, com.google.devtools.artifactregistry.v1.Repository.Builder, com.google.devtools.artifactregistry.v1.RepositoryOrBuilder> repositoryBuilder_;
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     * @return Whether the repository field is set.
     */
    public boolean hasRepository() {
      return repositoryBuilder_ != null || repository_ != null;
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     * @return The repository.
     */
    public com.google.devtools.artifactregistry.v1.Repository getRepository() {
      if (repositoryBuilder_ == null) {
        return repository_ == null ? com.google.devtools.artifactregistry.v1.Repository.getDefaultInstance() : repository_;
      } else {
        return repositoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    public Builder setRepository(com.google.devtools.artifactregistry.v1.Repository value) {
      if (repositoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repository_ = value;
        onChanged();
      } else {
        repositoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    public Builder setRepository(
        com.google.devtools.artifactregistry.v1.Repository.Builder builderForValue) {
      if (repositoryBuilder_ == null) {
        repository_ = builderForValue.build();
        onChanged();
      } else {
        repositoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    public Builder mergeRepository(com.google.devtools.artifactregistry.v1.Repository value) {
      if (repositoryBuilder_ == null) {
        if (repository_ != null) {
          repository_ =
            com.google.devtools.artifactregistry.v1.Repository.newBuilder(repository_).mergeFrom(value).buildPartial();
        } else {
          repository_ = value;
        }
        onChanged();
      } else {
        repositoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    public Builder clearRepository() {
      if (repositoryBuilder_ == null) {
        repository_ = null;
        onChanged();
      } else {
        repository_ = null;
        repositoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.Repository.Builder getRepositoryBuilder() {
      
      onChanged();
      return getRepositoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.RepositoryOrBuilder getRepositoryOrBuilder() {
      if (repositoryBuilder_ != null) {
        return repositoryBuilder_.getMessageOrBuilder();
      } else {
        return repository_ == null ?
            com.google.devtools.artifactregistry.v1.Repository.getDefaultInstance() : repository_;
      }
    }
    /**
     * <pre>
     * The repository that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.Repository repository = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1.Repository, com.google.devtools.artifactregistry.v1.Repository.Builder, com.google.devtools.artifactregistry.v1.RepositoryOrBuilder> 
        getRepositoryFieldBuilder() {
      if (repositoryBuilder_ == null) {
        repositoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.Repository, com.google.devtools.artifactregistry.v1.Repository.Builder, com.google.devtools.artifactregistry.v1.RepositoryOrBuilder>(
                getRepository(),
                getParentForChildren(),
                isClean());
        repository_ = null;
      }
      return repositoryBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The update mask applies to the resource. For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.UpdateRepositoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.UpdateRepositoryRequest)
  private static final com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest();
  }

  public static com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRepositoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRepositoryRequest>() {
    @java.lang.Override
    public UpdateRepositoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateRepositoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateRepositoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRepositoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

