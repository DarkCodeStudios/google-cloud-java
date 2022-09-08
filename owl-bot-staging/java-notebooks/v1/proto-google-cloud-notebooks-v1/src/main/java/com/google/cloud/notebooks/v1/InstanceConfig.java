// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/instance_config.proto

package com.google.cloud.notebooks.v1;

/**
 * <pre>
 * Notebook instance configurations that can be updated.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.InstanceConfig}
 */
public final class InstanceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.InstanceConfig)
    InstanceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstanceConfig.newBuilder() to construct.
  private InstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstanceConfig() {
    notebookUpgradeSchedule_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstanceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstanceConfig(
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

            notebookUpgradeSchedule_ = s;
            break;
          }
          case 16: {

            enableHealthMonitoring_ = input.readBool();
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
    return com.google.cloud.notebooks.v1.InstanceConfigProto.internal_static_google_cloud_notebooks_v1_InstanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.InstanceConfigProto.internal_static_google_cloud_notebooks_v1_InstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.InstanceConfig.class, com.google.cloud.notebooks.v1.InstanceConfig.Builder.class);
  }

  public static final int NOTEBOOK_UPGRADE_SCHEDULE_FIELD_NUMBER = 1;
  private volatile java.lang.Object notebookUpgradeSchedule_;
  /**
   * <pre>
   * Cron expression in UTC timezone, used to schedule instance auto upgrade.
   * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
   * </pre>
   *
   * <code>string notebook_upgrade_schedule = 1;</code>
   * @return The notebookUpgradeSchedule.
   */
  @java.lang.Override
  public java.lang.String getNotebookUpgradeSchedule() {
    java.lang.Object ref = notebookUpgradeSchedule_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notebookUpgradeSchedule_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Cron expression in UTC timezone, used to schedule instance auto upgrade.
   * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
   * </pre>
   *
   * <code>string notebook_upgrade_schedule = 1;</code>
   * @return The bytes for notebookUpgradeSchedule.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotebookUpgradeScheduleBytes() {
    java.lang.Object ref = notebookUpgradeSchedule_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notebookUpgradeSchedule_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLE_HEALTH_MONITORING_FIELD_NUMBER = 2;
  private boolean enableHealthMonitoring_;
  /**
   * <pre>
   * Verifies core internal services are running.
   * </pre>
   *
   * <code>bool enable_health_monitoring = 2;</code>
   * @return The enableHealthMonitoring.
   */
  @java.lang.Override
  public boolean getEnableHealthMonitoring() {
    return enableHealthMonitoring_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notebookUpgradeSchedule_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notebookUpgradeSchedule_);
    }
    if (enableHealthMonitoring_ != false) {
      output.writeBool(2, enableHealthMonitoring_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notebookUpgradeSchedule_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, notebookUpgradeSchedule_);
    }
    if (enableHealthMonitoring_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableHealthMonitoring_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.InstanceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.InstanceConfig other = (com.google.cloud.notebooks.v1.InstanceConfig) obj;

    if (!getNotebookUpgradeSchedule()
        .equals(other.getNotebookUpgradeSchedule())) return false;
    if (getEnableHealthMonitoring()
        != other.getEnableHealthMonitoring()) return false;
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
    hash = (37 * hash) + NOTEBOOK_UPGRADE_SCHEDULE_FIELD_NUMBER;
    hash = (53 * hash) + getNotebookUpgradeSchedule().hashCode();
    hash = (37 * hash) + ENABLE_HEALTH_MONITORING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableHealthMonitoring());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.InstanceConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.notebooks.v1.InstanceConfig prototype) {
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
   * Notebook instance configurations that can be updated.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.InstanceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.InstanceConfig)
      com.google.cloud.notebooks.v1.InstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.notebooks.v1.InstanceConfigProto.internal_static_google_cloud_notebooks_v1_InstanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.InstanceConfigProto.internal_static_google_cloud_notebooks_v1_InstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.InstanceConfig.class, com.google.cloud.notebooks.v1.InstanceConfig.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.InstanceConfig.newBuilder()
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
      notebookUpgradeSchedule_ = "";

      enableHealthMonitoring_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.notebooks.v1.InstanceConfigProto.internal_static_google_cloud_notebooks_v1_InstanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.InstanceConfig getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.InstanceConfig build() {
      com.google.cloud.notebooks.v1.InstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.InstanceConfig buildPartial() {
      com.google.cloud.notebooks.v1.InstanceConfig result = new com.google.cloud.notebooks.v1.InstanceConfig(this);
      result.notebookUpgradeSchedule_ = notebookUpgradeSchedule_;
      result.enableHealthMonitoring_ = enableHealthMonitoring_;
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
      if (other instanceof com.google.cloud.notebooks.v1.InstanceConfig) {
        return mergeFrom((com.google.cloud.notebooks.v1.InstanceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.InstanceConfig other) {
      if (other == com.google.cloud.notebooks.v1.InstanceConfig.getDefaultInstance()) return this;
      if (!other.getNotebookUpgradeSchedule().isEmpty()) {
        notebookUpgradeSchedule_ = other.notebookUpgradeSchedule_;
        onChanged();
      }
      if (other.getEnableHealthMonitoring() != false) {
        setEnableHealthMonitoring(other.getEnableHealthMonitoring());
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
      com.google.cloud.notebooks.v1.InstanceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.notebooks.v1.InstanceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object notebookUpgradeSchedule_ = "";
    /**
     * <pre>
     * Cron expression in UTC timezone, used to schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * </pre>
     *
     * <code>string notebook_upgrade_schedule = 1;</code>
     * @return The notebookUpgradeSchedule.
     */
    public java.lang.String getNotebookUpgradeSchedule() {
      java.lang.Object ref = notebookUpgradeSchedule_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notebookUpgradeSchedule_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Cron expression in UTC timezone, used to schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * </pre>
     *
     * <code>string notebook_upgrade_schedule = 1;</code>
     * @return The bytes for notebookUpgradeSchedule.
     */
    public com.google.protobuf.ByteString
        getNotebookUpgradeScheduleBytes() {
      java.lang.Object ref = notebookUpgradeSchedule_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notebookUpgradeSchedule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Cron expression in UTC timezone, used to schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * </pre>
     *
     * <code>string notebook_upgrade_schedule = 1;</code>
     * @param value The notebookUpgradeSchedule to set.
     * @return This builder for chaining.
     */
    public Builder setNotebookUpgradeSchedule(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      notebookUpgradeSchedule_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cron expression in UTC timezone, used to schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * </pre>
     *
     * <code>string notebook_upgrade_schedule = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotebookUpgradeSchedule() {
      
      notebookUpgradeSchedule_ = getDefaultInstance().getNotebookUpgradeSchedule();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cron expression in UTC timezone, used to schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * </pre>
     *
     * <code>string notebook_upgrade_schedule = 1;</code>
     * @param value The bytes for notebookUpgradeSchedule to set.
     * @return This builder for chaining.
     */
    public Builder setNotebookUpgradeScheduleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      notebookUpgradeSchedule_ = value;
      onChanged();
      return this;
    }

    private boolean enableHealthMonitoring_ ;
    /**
     * <pre>
     * Verifies core internal services are running.
     * </pre>
     *
     * <code>bool enable_health_monitoring = 2;</code>
     * @return The enableHealthMonitoring.
     */
    @java.lang.Override
    public boolean getEnableHealthMonitoring() {
      return enableHealthMonitoring_;
    }
    /**
     * <pre>
     * Verifies core internal services are running.
     * </pre>
     *
     * <code>bool enable_health_monitoring = 2;</code>
     * @param value The enableHealthMonitoring to set.
     * @return This builder for chaining.
     */
    public Builder setEnableHealthMonitoring(boolean value) {
      
      enableHealthMonitoring_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Verifies core internal services are running.
     * </pre>
     *
     * <code>bool enable_health_monitoring = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableHealthMonitoring() {
      
      enableHealthMonitoring_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.InstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.InstanceConfig)
  private static final com.google.cloud.notebooks.v1.InstanceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.InstanceConfig();
  }

  public static com.google.cloud.notebooks.v1.InstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceConfig>
      PARSER = new com.google.protobuf.AbstractParser<InstanceConfig>() {
    @java.lang.Override
    public InstanceConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstanceConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.InstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

