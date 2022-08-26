/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The data for a phrase match rule.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.PhraseMatchRule}
 */
public final class PhraseMatchRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.PhraseMatchRule)
    PhraseMatchRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PhraseMatchRule.newBuilder() to construct.
  private PhraseMatchRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PhraseMatchRule() {
    query_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PhraseMatchRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PhraseMatchRule(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              query_ = s;
              break;
            }
          case 16:
            {
              negated_ = input.readBool();
              break;
            }
          case 26:
            {
              com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder subBuilder =
                  null;
              if (config_ != null) {
                subBuilder = config_.toBuilder();
              }
              config_ =
                  input.readMessage(
                      com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(config_);
                config_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.class,
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.Builder.class);
  }

  public static final int QUERY_FIELD_NUMBER = 1;
  private volatile java.lang.Object query_;
  /**
   *
   *
   * <pre>
   * Required. The phrase to be matched.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  @java.lang.Override
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The phrase to be matched.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEGATED_FIELD_NUMBER = 2;
  private boolean negated_;
  /**
   *
   *
   * <pre>
   * Specifies whether the phrase must be missing from the transcript segment or
   * present in the transcript segment.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   *
   * @return The negated.
   */
  @java.lang.Override
  public boolean getNegated() {
    return negated_;
  }

  public static final int CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config_;
  /**
   *
   *
   * <pre>
   * Provides additional information about the rule that specifies how to apply
   * the rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
   *
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   *
   *
   * <pre>
   * Provides additional information about the rule that specifies how to apply
   * the rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
   *
   * @return The config.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig getConfig() {
    return config_ == null
        ? com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.getDefaultInstance()
        : config_;
  }
  /**
   *
   *
   * <pre>
   * Provides additional information about the rule that specifies how to apply
   * the rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder
      getConfigOrBuilder() {
    return getConfig();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
    }
    if (negated_ != false) {
      output.writeBool(2, negated_);
    }
    if (config_ != null) {
      output.writeMessage(3, getConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(query_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
    }
    if (negated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, negated_);
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getConfig());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.PhraseMatchRule)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.PhraseMatchRule other =
        (com.google.cloud.contactcenterinsights.v1.PhraseMatchRule) obj;

    if (!getQuery().equals(other.getQuery())) return false;
    if (getNegated() != other.getNegated()) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig().equals(other.getConfig())) return false;
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
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + NEGATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNegated());
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The data for a phrase match rule.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.PhraseMatchRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.PhraseMatchRule)
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.class,
              com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      query_ = "";

      negated_ = false;

      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRule getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRule build() {
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRule buildPartial() {
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRule result =
          new com.google.cloud.contactcenterinsights.v1.PhraseMatchRule(this);
      result.query_ = query_;
      result.negated_ = negated_;
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.PhraseMatchRule) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.PhraseMatchRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.PhraseMatchRule other) {
      if (other == com.google.cloud.contactcenterinsights.v1.PhraseMatchRule.getDefaultInstance())
        return this;
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (other.getNegated() != false) {
        setNegated(other.getNegated());
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.contactcenterinsights.v1.PhraseMatchRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     *
     *
     * <pre>
     * Required. The phrase to be matched.
     * </pre>
     *
     * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The query.
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase to be matched.
     * </pre>
     *
     * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for query.
     */
    public com.google.protobuf.ByteString getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase to be matched.
     * </pre>
     *
     * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The query to set.
     * @return This builder for chaining.
     */
    public Builder setQuery(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      query_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase to be matched.
     * </pre>
     *
     * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQuery() {

      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The phrase to be matched.
     * </pre>
     *
     * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for query to set.
     * @return This builder for chaining.
     */
    public Builder setQueryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      query_ = value;
      onChanged();
      return this;
    }

    private boolean negated_;
    /**
     *
     *
     * <pre>
     * Specifies whether the phrase must be missing from the transcript segment or
     * present in the transcript segment.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     *
     * @return The negated.
     */
    @java.lang.Override
    public boolean getNegated() {
      return negated_;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether the phrase must be missing from the transcript segment or
     * present in the transcript segment.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     *
     * @param value The negated to set.
     * @return This builder for chaining.
     */
    public Builder setNegated(boolean value) {

      negated_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies whether the phrase must be missing from the transcript segment or
     * present in the transcript segment.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNegated() {

      negated_ = false;
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig,
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder,
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder>
        configBuilder_;
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     *
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     *
     * @return The config.
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null
            ? com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.getDefaultInstance()
            : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    public Builder setConfig(
        com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    public Builder setConfig(
        com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    public Builder mergeConfig(
        com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
              com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.newBuilder(config_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder
        getConfigBuilder() {

      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder
        getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null
            ? com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.getDefaultInstance()
            : config_;
      }
    }
    /**
     *
     *
     * <pre>
     * Provides additional information about the rule that specifies how to apply
     * the rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig,
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder,
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder>
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig,
                com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder,
                com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder>(
                getConfig(), getParentForChildren(), isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.PhraseMatchRule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.PhraseMatchRule)
  private static final com.google.cloud.contactcenterinsights.v1.PhraseMatchRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.PhraseMatchRule();
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhraseMatchRule> PARSER =
      new com.google.protobuf.AbstractParser<PhraseMatchRule>() {
        @java.lang.Override
        public PhraseMatchRule parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PhraseMatchRule(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PhraseMatchRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhraseMatchRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatchRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}