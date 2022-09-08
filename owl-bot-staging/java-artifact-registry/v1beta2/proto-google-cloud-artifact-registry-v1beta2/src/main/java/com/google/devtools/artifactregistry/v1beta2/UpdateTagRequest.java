// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/tag.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * The request to create or update a tag.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.UpdateTagRequest}
 */
public final class UpdateTagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.UpdateTagRequest)
    UpdateTagRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTagRequest.newBuilder() to construct.
  private UpdateTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTagRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTagRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateTagRequest(
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
            com.google.devtools.artifactregistry.v1beta2.Tag.Builder subBuilder = null;
            if (tag_ != null) {
              subBuilder = tag_.toBuilder();
            }
            tag_ = input.readMessage(com.google.devtools.artifactregistry.v1beta2.Tag.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tag_);
              tag_ = subBuilder.buildPartial();
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
    return com.google.devtools.artifactregistry.v1beta2.TagProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.TagProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.class, com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.Builder.class);
  }

  public static final int TAG_FIELD_NUMBER = 1;
  private com.google.devtools.artifactregistry.v1beta2.Tag tag_;
  /**
   * <pre>
   * The tag that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
   * @return Whether the tag field is set.
   */
  @java.lang.Override
  public boolean hasTag() {
    return tag_ != null;
  }
  /**
   * <pre>
   * The tag that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
   * @return The tag.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.Tag getTag() {
    return tag_ == null ? com.google.devtools.artifactregistry.v1beta2.Tag.getDefaultInstance() : tag_;
  }
  /**
   * <pre>
   * The tag that replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.TagOrBuilder getTagOrBuilder() {
    return getTag();
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
    if (tag_ != null) {
      output.writeMessage(1, getTag());
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
    if (tag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTag());
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest other = (com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest) obj;

    if (hasTag() != other.hasTag()) return false;
    if (hasTag()) {
      if (!getTag()
          .equals(other.getTag())) return false;
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
    if (hasTag()) {
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest prototype) {
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
   * The request to create or update a tag.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.UpdateTagRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.UpdateTagRequest)
      com.google.devtools.artifactregistry.v1beta2.UpdateTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.TagProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.TagProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.class, com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.newBuilder()
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
      if (tagBuilder_ == null) {
        tag_ = null;
      } else {
        tag_ = null;
        tagBuilder_ = null;
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
      return com.google.devtools.artifactregistry.v1beta2.TagProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest build() {
      com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest result = new com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest(this);
      if (tagBuilder_ == null) {
        result.tag_ = tag_;
      } else {
        result.tag_ = tagBuilder_.build();
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest.getDefaultInstance()) return this;
      if (other.hasTag()) {
        mergeTag(other.getTag());
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
      com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.devtools.artifactregistry.v1beta2.Tag tag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.Tag, com.google.devtools.artifactregistry.v1beta2.Tag.Builder, com.google.devtools.artifactregistry.v1beta2.TagOrBuilder> tagBuilder_;
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     * @return Whether the tag field is set.
     */
    public boolean hasTag() {
      return tagBuilder_ != null || tag_ != null;
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     * @return The tag.
     */
    public com.google.devtools.artifactregistry.v1beta2.Tag getTag() {
      if (tagBuilder_ == null) {
        return tag_ == null ? com.google.devtools.artifactregistry.v1beta2.Tag.getDefaultInstance() : tag_;
      } else {
        return tagBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    public Builder setTag(com.google.devtools.artifactregistry.v1beta2.Tag value) {
      if (tagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tag_ = value;
        onChanged();
      } else {
        tagBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    public Builder setTag(
        com.google.devtools.artifactregistry.v1beta2.Tag.Builder builderForValue) {
      if (tagBuilder_ == null) {
        tag_ = builderForValue.build();
        onChanged();
      } else {
        tagBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    public Builder mergeTag(com.google.devtools.artifactregistry.v1beta2.Tag value) {
      if (tagBuilder_ == null) {
        if (tag_ != null) {
          tag_ =
            com.google.devtools.artifactregistry.v1beta2.Tag.newBuilder(tag_).mergeFrom(value).buildPartial();
        } else {
          tag_ = value;
        }
        onChanged();
      } else {
        tagBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    public Builder clearTag() {
      if (tagBuilder_ == null) {
        tag_ = null;
        onChanged();
      } else {
        tag_ = null;
        tagBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.Tag.Builder getTagBuilder() {
      
      onChanged();
      return getTagFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.TagOrBuilder getTagOrBuilder() {
      if (tagBuilder_ != null) {
        return tagBuilder_.getMessageOrBuilder();
      } else {
        return tag_ == null ?
            com.google.devtools.artifactregistry.v1beta2.Tag.getDefaultInstance() : tag_;
      }
    }
    /**
     * <pre>
     * The tag that replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.Tag, com.google.devtools.artifactregistry.v1beta2.Tag.Builder, com.google.devtools.artifactregistry.v1beta2.TagOrBuilder> 
        getTagFieldBuilder() {
      if (tagBuilder_ == null) {
        tagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1beta2.Tag, com.google.devtools.artifactregistry.v1beta2.Tag.Builder, com.google.devtools.artifactregistry.v1beta2.TagOrBuilder>(
                getTag(),
                getParentForChildren(),
                isClean());
        tag_ = null;
      }
      return tagBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.UpdateTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.UpdateTagRequest)
  private static final com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest();
  }

  public static com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTagRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTagRequest>() {
    @java.lang.Override
    public UpdateTagRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateTagRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

