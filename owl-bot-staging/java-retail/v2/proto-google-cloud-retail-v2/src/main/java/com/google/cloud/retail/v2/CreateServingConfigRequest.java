// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/serving_config_service.proto

package com.google.cloud.retail.v2;

/**
 * <pre>
 * Request for CreateServingConfig method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.CreateServingConfigRequest}
 */
public final class CreateServingConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.CreateServingConfigRequest)
    CreateServingConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateServingConfigRequest.newBuilder() to construct.
  private CreateServingConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServingConfigRequest() {
    parent_ = "";
    servingConfigId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateServingConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateServingConfigRequest(
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
          case 18: {
            com.google.cloud.retail.v2.ServingConfig.Builder subBuilder = null;
            if (servingConfig_ != null) {
              subBuilder = servingConfig_.toBuilder();
            }
            servingConfig_ = input.readMessage(com.google.cloud.retail.v2.ServingConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(servingConfig_);
              servingConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            servingConfigId_ = s;
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
    return com.google.cloud.retail.v2.ServingConfigServiceProto.internal_static_google_cloud_retail_v2_CreateServingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.ServingConfigServiceProto.internal_static_google_cloud_retail_v2_CreateServingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.CreateServingConfigRequest.class, com.google.cloud.retail.v2.CreateServingConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. Full resource name of parent. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
   * Required. Full resource name of parent. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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

  public static final int SERVING_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2.ServingConfig servingConfig_;
  /**
   * <pre>
   * Required. The ServingConfig to create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the servingConfig field is set.
   */
  @java.lang.Override
  public boolean hasServingConfig() {
    return servingConfig_ != null;
  }
  /**
   * <pre>
   * Required. The ServingConfig to create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The servingConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ServingConfig getServingConfig() {
    return servingConfig_ == null ? com.google.cloud.retail.v2.ServingConfig.getDefaultInstance() : servingConfig_;
  }
  /**
   * <pre>
   * Required. The ServingConfig to create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ServingConfigOrBuilder getServingConfigOrBuilder() {
    return getServingConfig();
  }

  public static final int SERVING_CONFIG_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object servingConfigId_;
  /**
   * <pre>
   * Required. The ID to use for the ServingConfig, which will become the final
   * component of the ServingConfig's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-_/.
   * </pre>
   *
   * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The servingConfigId.
   */
  @java.lang.Override
  public java.lang.String getServingConfigId() {
    java.lang.Object ref = servingConfigId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      servingConfigId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the ServingConfig, which will become the final
   * component of the ServingConfig's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-_/.
   * </pre>
   *
   * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for servingConfigId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServingConfigIdBytes() {
    java.lang.Object ref = servingConfigId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      servingConfigId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (servingConfig_ != null) {
      output.writeMessage(2, getServingConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(servingConfigId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, servingConfigId_);
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
    if (servingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getServingConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(servingConfigId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, servingConfigId_);
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
    if (!(obj instanceof com.google.cloud.retail.v2.CreateServingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.CreateServingConfigRequest other = (com.google.cloud.retail.v2.CreateServingConfigRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasServingConfig() != other.hasServingConfig()) return false;
    if (hasServingConfig()) {
      if (!getServingConfig()
          .equals(other.getServingConfig())) return false;
    }
    if (!getServingConfigId()
        .equals(other.getServingConfigId())) return false;
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
    if (hasServingConfig()) {
      hash = (37 * hash) + SERVING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getServingConfig().hashCode();
    }
    hash = (37 * hash) + SERVING_CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServingConfigId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2.CreateServingConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2.CreateServingConfigRequest prototype) {
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
   * Request for CreateServingConfig method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.CreateServingConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.CreateServingConfigRequest)
      com.google.cloud.retail.v2.CreateServingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2.ServingConfigServiceProto.internal_static_google_cloud_retail_v2_CreateServingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.ServingConfigServiceProto.internal_static_google_cloud_retail_v2_CreateServingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.CreateServingConfigRequest.class, com.google.cloud.retail.v2.CreateServingConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.CreateServingConfigRequest.newBuilder()
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

      if (servingConfigBuilder_ == null) {
        servingConfig_ = null;
      } else {
        servingConfig_ = null;
        servingConfigBuilder_ = null;
      }
      servingConfigId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2.ServingConfigServiceProto.internal_static_google_cloud_retail_v2_CreateServingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.CreateServingConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.CreateServingConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.CreateServingConfigRequest build() {
      com.google.cloud.retail.v2.CreateServingConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.CreateServingConfigRequest buildPartial() {
      com.google.cloud.retail.v2.CreateServingConfigRequest result = new com.google.cloud.retail.v2.CreateServingConfigRequest(this);
      result.parent_ = parent_;
      if (servingConfigBuilder_ == null) {
        result.servingConfig_ = servingConfig_;
      } else {
        result.servingConfig_ = servingConfigBuilder_.build();
      }
      result.servingConfigId_ = servingConfigId_;
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
      if (other instanceof com.google.cloud.retail.v2.CreateServingConfigRequest) {
        return mergeFrom((com.google.cloud.retail.v2.CreateServingConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.CreateServingConfigRequest other) {
      if (other == com.google.cloud.retail.v2.CreateServingConfigRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasServingConfig()) {
        mergeServingConfig(other.getServingConfig());
      }
      if (!other.getServingConfigId().isEmpty()) {
        servingConfigId_ = other.servingConfigId_;
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
      com.google.cloud.retail.v2.CreateServingConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2.CreateServingConfigRequest) e.getUnfinishedMessage();
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
     * Required. Full resource name of parent. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. Full resource name of parent. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. Full resource name of parent. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. Full resource name of parent. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. Full resource name of parent. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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

    private com.google.cloud.retail.v2.ServingConfig servingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.ServingConfig, com.google.cloud.retail.v2.ServingConfig.Builder, com.google.cloud.retail.v2.ServingConfigOrBuilder> servingConfigBuilder_;
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the servingConfig field is set.
     */
    public boolean hasServingConfig() {
      return servingConfigBuilder_ != null || servingConfig_ != null;
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The servingConfig.
     */
    public com.google.cloud.retail.v2.ServingConfig getServingConfig() {
      if (servingConfigBuilder_ == null) {
        return servingConfig_ == null ? com.google.cloud.retail.v2.ServingConfig.getDefaultInstance() : servingConfig_;
      } else {
        return servingConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setServingConfig(com.google.cloud.retail.v2.ServingConfig value) {
      if (servingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        servingConfig_ = value;
        onChanged();
      } else {
        servingConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setServingConfig(
        com.google.cloud.retail.v2.ServingConfig.Builder builderForValue) {
      if (servingConfigBuilder_ == null) {
        servingConfig_ = builderForValue.build();
        onChanged();
      } else {
        servingConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeServingConfig(com.google.cloud.retail.v2.ServingConfig value) {
      if (servingConfigBuilder_ == null) {
        if (servingConfig_ != null) {
          servingConfig_ =
            com.google.cloud.retail.v2.ServingConfig.newBuilder(servingConfig_).mergeFrom(value).buildPartial();
        } else {
          servingConfig_ = value;
        }
        onChanged();
      } else {
        servingConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearServingConfig() {
      if (servingConfigBuilder_ == null) {
        servingConfig_ = null;
        onChanged();
      } else {
        servingConfig_ = null;
        servingConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2.ServingConfig.Builder getServingConfigBuilder() {
      
      onChanged();
      return getServingConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2.ServingConfigOrBuilder getServingConfigOrBuilder() {
      if (servingConfigBuilder_ != null) {
        return servingConfigBuilder_.getMessageOrBuilder();
      } else {
        return servingConfig_ == null ?
            com.google.cloud.retail.v2.ServingConfig.getDefaultInstance() : servingConfig_;
      }
    }
    /**
     * <pre>
     * Required. The ServingConfig to create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2.ServingConfig, com.google.cloud.retail.v2.ServingConfig.Builder, com.google.cloud.retail.v2.ServingConfigOrBuilder> 
        getServingConfigFieldBuilder() {
      if (servingConfigBuilder_ == null) {
        servingConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.ServingConfig, com.google.cloud.retail.v2.ServingConfig.Builder, com.google.cloud.retail.v2.ServingConfigOrBuilder>(
                getServingConfig(),
                getParentForChildren(),
                isClean());
        servingConfig_ = null;
      }
      return servingConfigBuilder_;
    }

    private java.lang.Object servingConfigId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the ServingConfig, which will become the final
     * component of the ServingConfig's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-_/.
     * </pre>
     *
     * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The servingConfigId.
     */
    public java.lang.String getServingConfigId() {
      java.lang.Object ref = servingConfigId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        servingConfigId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the ServingConfig, which will become the final
     * component of the ServingConfig's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-_/.
     * </pre>
     *
     * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for servingConfigId.
     */
    public com.google.protobuf.ByteString
        getServingConfigIdBytes() {
      java.lang.Object ref = servingConfigId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        servingConfigId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the ServingConfig, which will become the final
     * component of the ServingConfig's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-_/.
     * </pre>
     *
     * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The servingConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setServingConfigId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      servingConfigId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the ServingConfig, which will become the final
     * component of the ServingConfig's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-_/.
     * </pre>
     *
     * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearServingConfigId() {
      
      servingConfigId_ = getDefaultInstance().getServingConfigId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the ServingConfig, which will become the final
     * component of the ServingConfig's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-_/.
     * </pre>
     *
     * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for servingConfigId to set.
     * @return This builder for chaining.
     */
    public Builder setServingConfigIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      servingConfigId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.CreateServingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.CreateServingConfigRequest)
  private static final com.google.cloud.retail.v2.CreateServingConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.CreateServingConfigRequest();
  }

  public static com.google.cloud.retail.v2.CreateServingConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServingConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateServingConfigRequest>() {
    @java.lang.Override
    public CreateServingConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateServingConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateServingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.CreateServingConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

