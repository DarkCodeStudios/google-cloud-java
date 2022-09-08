// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/import_config.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * Request message for ImportCompletionData methods.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.ImportCompletionDataRequest}
 */
public final class ImportCompletionDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.ImportCompletionDataRequest)
    ImportCompletionDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportCompletionDataRequest.newBuilder() to construct.
  private ImportCompletionDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportCompletionDataRequest() {
    parent_ = "";
    notificationPubsubTopic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportCompletionDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImportCompletionDataRequest(
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
            com.google.cloud.retail.v2beta.CompletionDataInputConfig.Builder subBuilder = null;
            if (inputConfig_ != null) {
              subBuilder = inputConfig_.toBuilder();
            }
            inputConfig_ = input.readMessage(com.google.cloud.retail.v2beta.CompletionDataInputConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(inputConfig_);
              inputConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            notificationPubsubTopic_ = s;
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
    return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.ImportCompletionDataRequest.class, com.google.cloud.retail.v2beta.ImportCompletionDataRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The catalog which the suggestions dataset belongs to.
   * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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
   * Required. The catalog which the suggestions dataset belongs to.
   * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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

  public static final int INPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2beta.CompletionDataInputConfig inputConfig_;
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.CompletionDataInputConfig getInputConfig() {
    return inputConfig_ == null ? com.google.cloud.retail.v2beta.CompletionDataInputConfig.getDefaultInstance() : inputConfig_;
  }
  /**
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.CompletionDataInputConfigOrBuilder getInputConfigOrBuilder() {
    return getInputConfig();
  }

  public static final int NOTIFICATION_PUBSUB_TOPIC_FIELD_NUMBER = 3;
  private volatile java.lang.Object notificationPubsubTopic_;
  /**
   * <pre>
   * Pub/Sub topic for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 3;</code>
   * @return The notificationPubsubTopic.
   */
  @java.lang.Override
  public java.lang.String getNotificationPubsubTopic() {
    java.lang.Object ref = notificationPubsubTopic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notificationPubsubTopic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Pub/Sub topic for receiving notification. If this field is set,
   * when the import is finished, a notification is sent to
   * specified Pub/Sub topic. The message data is JSON string of a
   * [Operation][google.longrunning.Operation].
   * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string notification_pubsub_topic = 3;</code>
   * @return The bytes for notificationPubsubTopic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotificationPubsubTopicBytes() {
    java.lang.Object ref = notificationPubsubTopic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notificationPubsubTopic_ = b;
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
    if (inputConfig_ != null) {
      output.writeMessage(2, getInputConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notificationPubsubTopic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, notificationPubsubTopic_);
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
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInputConfig());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notificationPubsubTopic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, notificationPubsubTopic_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.ImportCompletionDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.ImportCompletionDataRequest other = (com.google.cloud.retail.v2beta.ImportCompletionDataRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig()
          .equals(other.getInputConfig())) return false;
    }
    if (!getNotificationPubsubTopic()
        .equals(other.getNotificationPubsubTopic())) return false;
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
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    hash = (37 * hash) + NOTIFICATION_PUBSUB_TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationPubsubTopic().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.retail.v2beta.ImportCompletionDataRequest prototype) {
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
   * Request message for ImportCompletionData methods.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.ImportCompletionDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.ImportCompletionDataRequest)
      com.google.cloud.retail.v2beta.ImportCompletionDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.ImportCompletionDataRequest.class, com.google.cloud.retail.v2beta.ImportCompletionDataRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.ImportCompletionDataRequest.newBuilder()
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

      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }
      notificationPubsubTopic_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.ImportConfigProto.internal_static_google_cloud_retail_v2beta_ImportCompletionDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ImportCompletionDataRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.ImportCompletionDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ImportCompletionDataRequest build() {
      com.google.cloud.retail.v2beta.ImportCompletionDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.ImportCompletionDataRequest buildPartial() {
      com.google.cloud.retail.v2beta.ImportCompletionDataRequest result = new com.google.cloud.retail.v2beta.ImportCompletionDataRequest(this);
      result.parent_ = parent_;
      if (inputConfigBuilder_ == null) {
        result.inputConfig_ = inputConfig_;
      } else {
        result.inputConfig_ = inputConfigBuilder_.build();
      }
      result.notificationPubsubTopic_ = notificationPubsubTopic_;
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
      if (other instanceof com.google.cloud.retail.v2beta.ImportCompletionDataRequest) {
        return mergeFrom((com.google.cloud.retail.v2beta.ImportCompletionDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.ImportCompletionDataRequest other) {
      if (other == com.google.cloud.retail.v2beta.ImportCompletionDataRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
      }
      if (!other.getNotificationPubsubTopic().isEmpty()) {
        notificationPubsubTopic_ = other.notificationPubsubTopic_;
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
      com.google.cloud.retail.v2beta.ImportCompletionDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.ImportCompletionDataRequest) e.getUnfinishedMessage();
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
     * Required. The catalog which the suggestions dataset belongs to.
     * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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
     * Required. The catalog which the suggestions dataset belongs to.
     * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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
     * Required. The catalog which the suggestions dataset belongs to.
     * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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
     * Required. The catalog which the suggestions dataset belongs to.
     * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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
     * Required. The catalog which the suggestions dataset belongs to.
     * Format: `projects/1234/locations/global/catalogs/default_catalog`.
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

    private com.google.cloud.retail.v2beta.CompletionDataInputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2beta.CompletionDataInputConfig, com.google.cloud.retail.v2beta.CompletionDataInputConfig.Builder, com.google.cloud.retail.v2beta.CompletionDataInputConfigOrBuilder> inputConfigBuilder_;
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return inputConfigBuilder_ != null || inputConfig_ != null;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The inputConfig.
     */
    public com.google.cloud.retail.v2beta.CompletionDataInputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null ? com.google.cloud.retail.v2beta.CompletionDataInputConfig.getDefaultInstance() : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInputConfig(com.google.cloud.retail.v2beta.CompletionDataInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInputConfig(
        com.google.cloud.retail.v2beta.CompletionDataInputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeInputConfig(com.google.cloud.retail.v2beta.CompletionDataInputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (inputConfig_ != null) {
          inputConfig_ =
            com.google.cloud.retail.v2beta.CompletionDataInputConfig.newBuilder(inputConfig_).mergeFrom(value).buildPartial();
        } else {
          inputConfig_ = value;
        }
        onChanged();
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearInputConfig() {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
        onChanged();
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.CompletionDataInputConfig.Builder getInputConfigBuilder() {
      
      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.retail.v2beta.CompletionDataInputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null ?
            com.google.cloud.retail.v2beta.CompletionDataInputConfig.getDefaultInstance() : inputConfig_;
      }
    }
    /**
     * <pre>
     * Required. The desired input location of the data.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.CompletionDataInputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.retail.v2beta.CompletionDataInputConfig, com.google.cloud.retail.v2beta.CompletionDataInputConfig.Builder, com.google.cloud.retail.v2beta.CompletionDataInputConfigOrBuilder> 
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.CompletionDataInputConfig, com.google.cloud.retail.v2beta.CompletionDataInputConfig.Builder, com.google.cloud.retail.v2beta.CompletionDataInputConfigOrBuilder>(
                getInputConfig(),
                getParentForChildren(),
                isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
    }

    private java.lang.Object notificationPubsubTopic_ = "";
    /**
     * <pre>
     * Pub/Sub topic for receiving notification. If this field is set,
     * when the import is finished, a notification is sent to
     * specified Pub/Sub topic. The message data is JSON string of a
     * [Operation][google.longrunning.Operation].
     * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string notification_pubsub_topic = 3;</code>
     * @return The notificationPubsubTopic.
     */
    public java.lang.String getNotificationPubsubTopic() {
      java.lang.Object ref = notificationPubsubTopic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notificationPubsubTopic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Pub/Sub topic for receiving notification. If this field is set,
     * when the import is finished, a notification is sent to
     * specified Pub/Sub topic. The message data is JSON string of a
     * [Operation][google.longrunning.Operation].
     * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string notification_pubsub_topic = 3;</code>
     * @return The bytes for notificationPubsubTopic.
     */
    public com.google.protobuf.ByteString
        getNotificationPubsubTopicBytes() {
      java.lang.Object ref = notificationPubsubTopic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notificationPubsubTopic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Pub/Sub topic for receiving notification. If this field is set,
     * when the import is finished, a notification is sent to
     * specified Pub/Sub topic. The message data is JSON string of a
     * [Operation][google.longrunning.Operation].
     * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string notification_pubsub_topic = 3;</code>
     * @param value The notificationPubsubTopic to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationPubsubTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      notificationPubsubTopic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pub/Sub topic for receiving notification. If this field is set,
     * when the import is finished, a notification is sent to
     * specified Pub/Sub topic. The message data is JSON string of a
     * [Operation][google.longrunning.Operation].
     * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string notification_pubsub_topic = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotificationPubsubTopic() {
      
      notificationPubsubTopic_ = getDefaultInstance().getNotificationPubsubTopic();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pub/Sub topic for receiving notification. If this field is set,
     * when the import is finished, a notification is sent to
     * specified Pub/Sub topic. The message data is JSON string of a
     * [Operation][google.longrunning.Operation].
     * Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string notification_pubsub_topic = 3;</code>
     * @param value The bytes for notificationPubsubTopic to set.
     * @return This builder for chaining.
     */
    public Builder setNotificationPubsubTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      notificationPubsubTopic_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.ImportCompletionDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.ImportCompletionDataRequest)
  private static final com.google.cloud.retail.v2beta.ImportCompletionDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.ImportCompletionDataRequest();
  }

  public static com.google.cloud.retail.v2beta.ImportCompletionDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportCompletionDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImportCompletionDataRequest>() {
    @java.lang.Override
    public ImportCompletionDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImportCompletionDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportCompletionDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportCompletionDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.ImportCompletionDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

