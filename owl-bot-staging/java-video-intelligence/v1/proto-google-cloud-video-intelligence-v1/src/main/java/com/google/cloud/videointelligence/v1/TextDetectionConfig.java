// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 * <pre>
 * Config for TEXT_DETECTION.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.TextDetectionConfig}
 */
public final class TextDetectionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.TextDetectionConfig)
    TextDetectionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextDetectionConfig.newBuilder() to construct.
  private TextDetectionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextDetectionConfig() {
    languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextDetectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextDetectionConfig(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              languageHints_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            languageHints_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            model_ = s;
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
        languageHints_ = languageHints_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_TextDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_TextDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.TextDetectionConfig.class, com.google.cloud.videointelligence.v1.TextDetectionConfig.Builder.class);
  }

  public static final int LANGUAGE_HINTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList languageHints_;
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @return A list containing the languageHints.
   */
  public com.google.protobuf.ProtocolStringList
      getLanguageHintsList() {
    return languageHints_;
  }
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @return The count of languageHints.
   */
  public int getLanguageHintsCount() {
    return languageHints_.size();
  }
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @param index The index of the element to return.
   * @return The languageHints at the given index.
   */
  public java.lang.String getLanguageHints(int index) {
    return languageHints_.get(index);
  }
  /**
   * <pre>
   * Language hint can be specified if the language to be detected is known a
   * priori. It can increase the accuracy of the detection. Language hint must
   * be language code in BCP-47 format.
   * Automatic language detection is performed if no hint is provided.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageHints at the given index.
   */
  public com.google.protobuf.ByteString
      getLanguageHintsBytes(int index) {
    return languageHints_.getByteString(index);
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object model_;
  /**
   * <pre>
   * Model to use for text detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 2;</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Model to use for text detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 2;</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
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
    for (int i = 0; i < languageHints_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageHints_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, model_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < languageHints_.size(); i++) {
        dataSize += computeStringSizeNoTag(languageHints_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLanguageHintsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, model_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.TextDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.TextDetectionConfig other = (com.google.cloud.videointelligence.v1.TextDetectionConfig) obj;

    if (!getLanguageHintsList()
        .equals(other.getLanguageHintsList())) return false;
    if (!getModel()
        .equals(other.getModel())) return false;
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
    if (getLanguageHintsCount() > 0) {
      hash = (37 * hash) + LANGUAGE_HINTS_FIELD_NUMBER;
      hash = (53 * hash) + getLanguageHintsList().hashCode();
    }
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1.TextDetectionConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1.TextDetectionConfig prototype) {
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
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.TextDetectionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.TextDetectionConfig)
      com.google.cloud.videointelligence.v1.TextDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_TextDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_TextDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.TextDetectionConfig.class, com.google.cloud.videointelligence.v1.TextDetectionConfig.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.TextDetectionConfig.newBuilder()
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
      languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      model_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1_TextDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.TextDetectionConfig getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.TextDetectionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.TextDetectionConfig build() {
      com.google.cloud.videointelligence.v1.TextDetectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.TextDetectionConfig buildPartial() {
      com.google.cloud.videointelligence.v1.TextDetectionConfig result = new com.google.cloud.videointelligence.v1.TextDetectionConfig(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        languageHints_ = languageHints_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.languageHints_ = languageHints_;
      result.model_ = model_;
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
      if (other instanceof com.google.cloud.videointelligence.v1.TextDetectionConfig) {
        return mergeFrom((com.google.cloud.videointelligence.v1.TextDetectionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.TextDetectionConfig other) {
      if (other == com.google.cloud.videointelligence.v1.TextDetectionConfig.getDefaultInstance()) return this;
      if (!other.languageHints_.isEmpty()) {
        if (languageHints_.isEmpty()) {
          languageHints_ = other.languageHints_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLanguageHintsIsMutable();
          languageHints_.addAll(other.languageHints_);
        }
        onChanged();
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
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
      com.google.cloud.videointelligence.v1.TextDetectionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1.TextDetectionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLanguageHintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languageHints_ = new com.google.protobuf.LazyStringArrayList(languageHints_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @return A list containing the languageHints.
     */
    public com.google.protobuf.ProtocolStringList
        getLanguageHintsList() {
      return languageHints_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @return The count of languageHints.
     */
    public int getLanguageHintsCount() {
      return languageHints_.size();
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param index The index of the element to return.
     * @return The languageHints at the given index.
     */
    public java.lang.String getLanguageHints(int index) {
      return languageHints_.get(index);
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the languageHints at the given index.
     */
    public com.google.protobuf.ByteString
        getLanguageHintsBytes(int index) {
      return languageHints_.getByteString(index);
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param index The index to set the value at.
     * @param value The languageHints to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageHints(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLanguageHintsIsMutable();
      languageHints_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param value The languageHints to add.
     * @return This builder for chaining.
     */
    public Builder addLanguageHints(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLanguageHintsIsMutable();
      languageHints_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param values The languageHints to add.
     * @return This builder for chaining.
     */
    public Builder addAllLanguageHints(
        java.lang.Iterable<java.lang.String> values) {
      ensureLanguageHintsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, languageHints_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageHints() {
      languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Language hint can be specified if the language to be detected is known a
     * priori. It can increase the accuracy of the detection. Language hint must
     * be language code in BCP-47 format.
     * Automatic language detection is performed if no hint is provided.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param value The bytes of the languageHints to add.
     * @return This builder for chaining.
     */
    public Builder addLanguageHintsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLanguageHintsIsMutable();
      languageHints_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <pre>
     * Model to use for text detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 2;</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Model to use for text detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 2;</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Model to use for text detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 2;</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to use for text detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to use for text detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 2;</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.TextDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.TextDetectionConfig)
  private static final com.google.cloud.videointelligence.v1.TextDetectionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.TextDetectionConfig();
  }

  public static com.google.cloud.videointelligence.v1.TextDetectionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextDetectionConfig>
      PARSER = new com.google.protobuf.AbstractParser<TextDetectionConfig>() {
    @java.lang.Override
    public TextDetectionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TextDetectionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.TextDetectionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

