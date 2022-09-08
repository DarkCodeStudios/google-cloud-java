// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * Create a metadata entity request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.CreateEntityRequest}
 */
public final class CreateEntityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.CreateEntityRequest)
    CreateEntityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEntityRequest.newBuilder() to construct.
  private CreateEntityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEntityRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEntityRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateEntityRequest(
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

            parent_ = s;
            break;
          }
          case 26: {
            com.google.cloud.dataplex.v1.Entity.Builder subBuilder = null;
            if (entity_ != null) {
              subBuilder = entity_.toBuilder();
            }
            entity_ = input.readMessage(com.google.cloud.dataplex.v1.Entity.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entity_);
              entity_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            validateOnly_ = input.readBool();
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
    return com.google.cloud.dataplex.v1.MetadataProto.internal_static_google_cloud_dataplex_v1_CreateEntityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.MetadataProto.internal_static_google_cloud_dataplex_v1_CreateEntityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.CreateEntityRequest.class, com.google.cloud.dataplex.v1.CreateEntityRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_FIELD_NUMBER = 3;
  private com.google.cloud.dataplex.v1.Entity entity_;
  /**
   * <pre>
   * Required. Entity resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <pre>
   * Required. Entity resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Entity getEntity() {
    return entity_ == null ? com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
  }
  /**
   * <pre>
   * Required. Entity resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.EntityOrBuilder getEntityOrBuilder() {
    return getEntity();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_;
  /**
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (entity_ != null) {
      output.writeMessage(3, getEntity());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEntity());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.CreateEntityRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.CreateEntityRequest other = (com.google.cloud.dataplex.v1.CreateEntityRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.CreateEntityRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.CreateEntityRequest prototype) {
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
   * Create a metadata entity request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.CreateEntityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.CreateEntityRequest)
      com.google.cloud.dataplex.v1.CreateEntityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.MetadataProto.internal_static_google_cloud_dataplex_v1_CreateEntityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.MetadataProto.internal_static_google_cloud_dataplex_v1_CreateEntityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.CreateEntityRequest.class, com.google.cloud.dataplex.v1.CreateEntityRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.CreateEntityRequest.newBuilder()
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
      parent_ = "";

      if (entityBuilder_ == null) {
        entity_ = null;
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.MetadataProto.internal_static_google_cloud_dataplex_v1_CreateEntityRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateEntityRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.CreateEntityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateEntityRequest build() {
      com.google.cloud.dataplex.v1.CreateEntityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.CreateEntityRequest buildPartial() {
      com.google.cloud.dataplex.v1.CreateEntityRequest result = new com.google.cloud.dataplex.v1.CreateEntityRequest(this);
      result.parent_ = parent_;
      if (entityBuilder_ == null) {
        result.entity_ = entity_;
      } else {
        result.entity_ = entityBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.dataplex.v1.CreateEntityRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.CreateEntityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.CreateEntityRequest other) {
      if (other == com.google.cloud.dataplex.v1.CreateEntityRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
      com.google.cloud.dataplex.v1.CreateEntityRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataplex.v1.CreateEntityRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the parent zone:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dataplex.v1.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.Entity, com.google.cloud.dataplex.v1.Entity.Builder, com.google.cloud.dataplex.v1.EntityOrBuilder> entityBuilder_;
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return entityBuilder_ != null || entity_ != null;
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The entity.
     */
    public com.google.cloud.dataplex.v1.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEntity(com.google.cloud.dataplex.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
        onChanged();
      } else {
        entityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEntity(
        com.google.cloud.dataplex.v1.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
        onChanged();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeEntity(com.google.cloud.dataplex.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (entity_ != null) {
          entity_ =
            com.google.cloud.dataplex.v1.Entity.newBuilder(entity_).mergeFrom(value).buildPartial();
        } else {
          entity_ = value;
        }
        onChanged();
      } else {
        entityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEntity() {
      if (entityBuilder_ == null) {
        entity_ = null;
        onChanged();
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.Entity.Builder getEntityBuilder() {
      
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            com.google.cloud.dataplex.v1.Entity.getDefaultInstance() : entity_;
      }
    }
    /**
     * <pre>
     * Required. Entity resource.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Entity entity = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.Entity, com.google.cloud.dataplex.v1.Entity.Builder, com.google.cloud.dataplex.v1.EntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Entity, com.google.cloud.dataplex.v1.Entity.Builder, com.google.cloud.dataplex.v1.EntityOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.CreateEntityRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.CreateEntityRequest)
  private static final com.google.cloud.dataplex.v1.CreateEntityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.CreateEntityRequest();
  }

  public static com.google.cloud.dataplex.v1.CreateEntityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntityRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEntityRequest>() {
    @java.lang.Override
    public CreateEntityRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateEntityRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateEntityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.CreateEntityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

