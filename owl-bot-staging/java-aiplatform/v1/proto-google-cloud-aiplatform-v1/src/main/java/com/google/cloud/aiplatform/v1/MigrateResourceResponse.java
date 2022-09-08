// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/migration_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Describes a successfully migrated resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.MigrateResourceResponse}
 */
public final class MigrateResourceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.MigrateResourceResponse)
    MigrateResourceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MigrateResourceResponse.newBuilder() to construct.
  private MigrateResourceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MigrateResourceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MigrateResourceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MigrateResourceResponse(
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
            migratedResourceCase_ = 1;
            migratedResource_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            migratedResourceCase_ = 2;
            migratedResource_ = s;
            break;
          }
          case 26: {
            com.google.cloud.aiplatform.v1.MigratableResource.Builder subBuilder = null;
            if (migratableResource_ != null) {
              subBuilder = migratableResource_.toBuilder();
            }
            migratableResource_ = input.readMessage(com.google.cloud.aiplatform.v1.MigratableResource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(migratableResource_);
              migratableResource_ = subBuilder.buildPartial();
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
    return com.google.cloud.aiplatform.v1.MigrationServiceProto.internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MigrationServiceProto.internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.MigrateResourceResponse.class, com.google.cloud.aiplatform.v1.MigrateResourceResponse.Builder.class);
  }

  private int migratedResourceCase_ = 0;
  private java.lang.Object migratedResource_;
  public enum MigratedResourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DATASET(1),
    MODEL(2),
    MIGRATEDRESOURCE_NOT_SET(0);
    private final int value;
    private MigratedResourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MigratedResourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static MigratedResourceCase forNumber(int value) {
      switch (value) {
        case 1: return DATASET;
        case 2: return MODEL;
        case 0: return MIGRATEDRESOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MigratedResourceCase
  getMigratedResourceCase() {
    return MigratedResourceCase.forNumber(
        migratedResourceCase_);
  }

  public static final int DATASET_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Migrated Dataset's resource name.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the dataset field is set.
   */
  public boolean hasDataset() {
    return migratedResourceCase_ == 1;
  }
  /**
   * <pre>
   * Migrated Dataset's resource name.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The dataset.
   */
  public java.lang.String getDataset() {
    java.lang.Object ref = "";
    if (migratedResourceCase_ == 1) {
      ref = migratedResource_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (migratedResourceCase_ == 1) {
        migratedResource_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Migrated Dataset's resource name.
   * </pre>
   *
   * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for dataset.
   */
  public com.google.protobuf.ByteString
      getDatasetBytes() {
    java.lang.Object ref = "";
    if (migratedResourceCase_ == 1) {
      ref = migratedResource_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (migratedResourceCase_ == 1) {
        migratedResource_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Migrated Model's resource name.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the model field is set.
   */
  public boolean hasModel() {
    return migratedResourceCase_ == 2;
  }
  /**
   * <pre>
   * Migrated Model's resource name.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  public java.lang.String getModel() {
    java.lang.Object ref = "";
    if (migratedResourceCase_ == 2) {
      ref = migratedResource_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (migratedResourceCase_ == 2) {
        migratedResource_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Migrated Model's resource name.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = "";
    if (migratedResourceCase_ == 2) {
      ref = migratedResource_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (migratedResourceCase_ == 2) {
        migratedResource_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIGRATABLE_RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.aiplatform.v1.MigratableResource migratableResource_;
  /**
   * <pre>
   * Before migration, the identifier in ml.googleapis.com,
   * automl.googleapis.com or datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
   * @return Whether the migratableResource field is set.
   */
  @java.lang.Override
  public boolean hasMigratableResource() {
    return migratableResource_ != null;
  }
  /**
   * <pre>
   * Before migration, the identifier in ml.googleapis.com,
   * automl.googleapis.com or datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
   * @return The migratableResource.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MigratableResource getMigratableResource() {
    return migratableResource_ == null ? com.google.cloud.aiplatform.v1.MigratableResource.getDefaultInstance() : migratableResource_;
  }
  /**
   * <pre>
   * Before migration, the identifier in ml.googleapis.com,
   * automl.googleapis.com or datalabeling.googleapis.com.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder getMigratableResourceOrBuilder() {
    return getMigratableResource();
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
    if (migratedResourceCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, migratedResource_);
    }
    if (migratedResourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, migratedResource_);
    }
    if (migratableResource_ != null) {
      output.writeMessage(3, getMigratableResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (migratedResourceCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, migratedResource_);
    }
    if (migratedResourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, migratedResource_);
    }
    if (migratableResource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMigratableResource());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.MigrateResourceResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.MigrateResourceResponse other = (com.google.cloud.aiplatform.v1.MigrateResourceResponse) obj;

    if (hasMigratableResource() != other.hasMigratableResource()) return false;
    if (hasMigratableResource()) {
      if (!getMigratableResource()
          .equals(other.getMigratableResource())) return false;
    }
    if (!getMigratedResourceCase().equals(other.getMigratedResourceCase())) return false;
    switch (migratedResourceCase_) {
      case 1:
        if (!getDataset()
            .equals(other.getDataset())) return false;
        break;
      case 2:
        if (!getModel()
            .equals(other.getModel())) return false;
        break;
      case 0:
      default:
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
    if (hasMigratableResource()) {
      hash = (37 * hash) + MIGRATABLE_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getMigratableResource().hashCode();
    }
    switch (migratedResourceCase_) {
      case 1:
        hash = (37 * hash) + DATASET_FIELD_NUMBER;
        hash = (53 * hash) + getDataset().hashCode();
        break;
      case 2:
        hash = (37 * hash) + MODEL_FIELD_NUMBER;
        hash = (53 * hash) + getModel().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.MigrateResourceResponse prototype) {
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
   * Describes a successfully migrated resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.MigrateResourceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.MigrateResourceResponse)
      com.google.cloud.aiplatform.v1.MigrateResourceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.MigrationServiceProto.internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MigrationServiceProto.internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.MigrateResourceResponse.class, com.google.cloud.aiplatform.v1.MigrateResourceResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.MigrateResourceResponse.newBuilder()
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
      if (migratableResourceBuilder_ == null) {
        migratableResource_ = null;
      } else {
        migratableResource_ = null;
        migratableResourceBuilder_ = null;
      }
      migratedResourceCase_ = 0;
      migratedResource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MigrationServiceProto.internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MigrateResourceResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.MigrateResourceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MigrateResourceResponse build() {
      com.google.cloud.aiplatform.v1.MigrateResourceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MigrateResourceResponse buildPartial() {
      com.google.cloud.aiplatform.v1.MigrateResourceResponse result = new com.google.cloud.aiplatform.v1.MigrateResourceResponse(this);
      if (migratedResourceCase_ == 1) {
        result.migratedResource_ = migratedResource_;
      }
      if (migratedResourceCase_ == 2) {
        result.migratedResource_ = migratedResource_;
      }
      if (migratableResourceBuilder_ == null) {
        result.migratableResource_ = migratableResource_;
      } else {
        result.migratableResource_ = migratableResourceBuilder_.build();
      }
      result.migratedResourceCase_ = migratedResourceCase_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.MigrateResourceResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.MigrateResourceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.MigrateResourceResponse other) {
      if (other == com.google.cloud.aiplatform.v1.MigrateResourceResponse.getDefaultInstance()) return this;
      if (other.hasMigratableResource()) {
        mergeMigratableResource(other.getMigratableResource());
      }
      switch (other.getMigratedResourceCase()) {
        case DATASET: {
          migratedResourceCase_ = 1;
          migratedResource_ = other.migratedResource_;
          onChanged();
          break;
        }
        case MODEL: {
          migratedResourceCase_ = 2;
          migratedResource_ = other.migratedResource_;
          onChanged();
          break;
        }
        case MIGRATEDRESOURCE_NOT_SET: {
          break;
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
      com.google.cloud.aiplatform.v1.MigrateResourceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.MigrateResourceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int migratedResourceCase_ = 0;
    private java.lang.Object migratedResource_;
    public MigratedResourceCase
        getMigratedResourceCase() {
      return MigratedResourceCase.forNumber(
          migratedResourceCase_);
    }

    public Builder clearMigratedResource() {
      migratedResourceCase_ = 0;
      migratedResource_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Migrated Dataset's resource name.
     * </pre>
     *
     * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return Whether the dataset field is set.
     */
    @java.lang.Override
    public boolean hasDataset() {
      return migratedResourceCase_ == 1;
    }
    /**
     * <pre>
     * Migrated Dataset's resource name.
     * </pre>
     *
     * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The dataset.
     */
    @java.lang.Override
    public java.lang.String getDataset() {
      java.lang.Object ref = "";
      if (migratedResourceCase_ == 1) {
        ref = migratedResource_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (migratedResourceCase_ == 1) {
          migratedResource_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Migrated Dataset's resource name.
     * </pre>
     *
     * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for dataset.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDatasetBytes() {
      java.lang.Object ref = "";
      if (migratedResourceCase_ == 1) {
        ref = migratedResource_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (migratedResourceCase_ == 1) {
          migratedResource_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Migrated Dataset's resource name.
     * </pre>
     *
     * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The dataset to set.
     * @return This builder for chaining.
     */
    public Builder setDataset(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  migratedResourceCase_ = 1;
      migratedResource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Migrated Dataset's resource name.
     * </pre>
     *
     * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDataset() {
      if (migratedResourceCase_ == 1) {
        migratedResourceCase_ = 0;
        migratedResource_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Migrated Dataset's resource name.
     * </pre>
     *
     * <code>string dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for dataset to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      migratedResourceCase_ = 1;
      migratedResource_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Migrated Model's resource name.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return Whether the model field is set.
     */
    @java.lang.Override
    public boolean hasModel() {
      return migratedResourceCase_ == 2;
    }
    /**
     * <pre>
     * Migrated Model's resource name.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The model.
     */
    @java.lang.Override
    public java.lang.String getModel() {
      java.lang.Object ref = "";
      if (migratedResourceCase_ == 2) {
        ref = migratedResource_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (migratedResourceCase_ == 2) {
          migratedResource_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Migrated Model's resource name.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for model.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = "";
      if (migratedResourceCase_ == 2) {
        ref = migratedResource_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (migratedResourceCase_ == 2) {
          migratedResource_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Migrated Model's resource name.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  migratedResourceCase_ = 2;
      migratedResource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Migrated Model's resource name.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      if (migratedResourceCase_ == 2) {
        migratedResourceCase_ = 0;
        migratedResource_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Migrated Model's resource name.
     * </pre>
     *
     * <code>string model = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      migratedResourceCase_ = 2;
      migratedResource_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.MigratableResource migratableResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.MigratableResource, com.google.cloud.aiplatform.v1.MigratableResource.Builder, com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder> migratableResourceBuilder_;
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     * @return Whether the migratableResource field is set.
     */
    public boolean hasMigratableResource() {
      return migratableResourceBuilder_ != null || migratableResource_ != null;
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     * @return The migratableResource.
     */
    public com.google.cloud.aiplatform.v1.MigratableResource getMigratableResource() {
      if (migratableResourceBuilder_ == null) {
        return migratableResource_ == null ? com.google.cloud.aiplatform.v1.MigratableResource.getDefaultInstance() : migratableResource_;
      } else {
        return migratableResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    public Builder setMigratableResource(com.google.cloud.aiplatform.v1.MigratableResource value) {
      if (migratableResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        migratableResource_ = value;
        onChanged();
      } else {
        migratableResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    public Builder setMigratableResource(
        com.google.cloud.aiplatform.v1.MigratableResource.Builder builderForValue) {
      if (migratableResourceBuilder_ == null) {
        migratableResource_ = builderForValue.build();
        onChanged();
      } else {
        migratableResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    public Builder mergeMigratableResource(com.google.cloud.aiplatform.v1.MigratableResource value) {
      if (migratableResourceBuilder_ == null) {
        if (migratableResource_ != null) {
          migratableResource_ =
            com.google.cloud.aiplatform.v1.MigratableResource.newBuilder(migratableResource_).mergeFrom(value).buildPartial();
        } else {
          migratableResource_ = value;
        }
        onChanged();
      } else {
        migratableResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    public Builder clearMigratableResource() {
      if (migratableResourceBuilder_ == null) {
        migratableResource_ = null;
        onChanged();
      } else {
        migratableResource_ = null;
        migratableResourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    public com.google.cloud.aiplatform.v1.MigratableResource.Builder getMigratableResourceBuilder() {
      
      onChanged();
      return getMigratableResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    public com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder getMigratableResourceOrBuilder() {
      if (migratableResourceBuilder_ != null) {
        return migratableResourceBuilder_.getMessageOrBuilder();
      } else {
        return migratableResource_ == null ?
            com.google.cloud.aiplatform.v1.MigratableResource.getDefaultInstance() : migratableResource_;
      }
    }
    /**
     * <pre>
     * Before migration, the identifier in ml.googleapis.com,
     * automl.googleapis.com or datalabeling.googleapis.com.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.MigratableResource migratable_resource = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.MigratableResource, com.google.cloud.aiplatform.v1.MigratableResource.Builder, com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder> 
        getMigratableResourceFieldBuilder() {
      if (migratableResourceBuilder_ == null) {
        migratableResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.MigratableResource, com.google.cloud.aiplatform.v1.MigratableResource.Builder, com.google.cloud.aiplatform.v1.MigratableResourceOrBuilder>(
                getMigratableResource(),
                getParentForChildren(),
                isClean());
        migratableResource_ = null;
      }
      return migratableResourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.MigrateResourceResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.MigrateResourceResponse)
  private static final com.google.cloud.aiplatform.v1.MigrateResourceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.MigrateResourceResponse();
  }

  public static com.google.cloud.aiplatform.v1.MigrateResourceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MigrateResourceResponse>
      PARSER = new com.google.protobuf.AbstractParser<MigrateResourceResponse>() {
    @java.lang.Override
    public MigrateResourceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MigrateResourceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MigrateResourceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MigrateResourceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MigrateResourceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

