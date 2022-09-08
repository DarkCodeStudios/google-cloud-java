// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * A Dialogflow source of conversation data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.DialogflowSource}
 */
public final class DialogflowSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.DialogflowSource)
    DialogflowSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DialogflowSource.newBuilder() to construct.
  private DialogflowSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DialogflowSource() {
    dialogflowConversation_ = "";
    audioUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DialogflowSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DialogflowSource(
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

            dialogflowConversation_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            audioUri_ = s;
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
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.DialogflowSource.class, com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder.class);
  }

  public static final int DIALOGFLOW_CONVERSATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object dialogflowConversation_;
  /**
   * <pre>
   * Output only. The name of the Dialogflow conversation that this conversation
   * resource is derived from. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}
   * </pre>
   *
   * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dialogflowConversation.
   */
  @java.lang.Override
  public java.lang.String getDialogflowConversation() {
    java.lang.Object ref = dialogflowConversation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dialogflowConversation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The name of the Dialogflow conversation that this conversation
   * resource is derived from. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}
   * </pre>
   *
   * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for dialogflowConversation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDialogflowConversationBytes() {
    java.lang.Object ref = dialogflowConversation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dialogflowConversation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIO_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object audioUri_;
  /**
   * <pre>
   * Cloud Storage URI that points to a file that contains the conversation
   * audio.
   * </pre>
   *
   * <code>string audio_uri = 3;</code>
   * @return The audioUri.
   */
  @java.lang.Override
  public java.lang.String getAudioUri() {
    java.lang.Object ref = audioUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audioUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Cloud Storage URI that points to a file that contains the conversation
   * audio.
   * </pre>
   *
   * <code>string audio_uri = 3;</code>
   * @return The bytes for audioUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAudioUriBytes() {
    java.lang.Object ref = audioUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      audioUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dialogflowConversation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dialogflowConversation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audioUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, audioUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dialogflowConversation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dialogflowConversation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audioUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, audioUri_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.DialogflowSource)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.DialogflowSource other = (com.google.cloud.contactcenterinsights.v1.DialogflowSource) obj;

    if (!getDialogflowConversation()
        .equals(other.getDialogflowConversation())) return false;
    if (!getAudioUri()
        .equals(other.getAudioUri())) return false;
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
    hash = (37 * hash) + DIALOGFLOW_CONVERSATION_FIELD_NUMBER;
    hash = (53 * hash) + getDialogflowConversation().hashCode();
    hash = (37 * hash) + AUDIO_URI_FIELD_NUMBER;
    hash = (53 * hash) + getAudioUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.DialogflowSource prototype) {
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
   * A Dialogflow source of conversation data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.DialogflowSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.DialogflowSource)
      com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.DialogflowSource.class, com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.DialogflowSource.newBuilder()
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
      dialogflowConversation_ = "";

      audioUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowSource getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowSource build() {
      com.google.cloud.contactcenterinsights.v1.DialogflowSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowSource buildPartial() {
      com.google.cloud.contactcenterinsights.v1.DialogflowSource result = new com.google.cloud.contactcenterinsights.v1.DialogflowSource(this);
      result.dialogflowConversation_ = dialogflowConversation_;
      result.audioUri_ = audioUri_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.DialogflowSource) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.DialogflowSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.DialogflowSource other) {
      if (other == com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance()) return this;
      if (!other.getDialogflowConversation().isEmpty()) {
        dialogflowConversation_ = other.dialogflowConversation_;
        onChanged();
      }
      if (!other.getAudioUri().isEmpty()) {
        audioUri_ = other.audioUri_;
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
      com.google.cloud.contactcenterinsights.v1.DialogflowSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.contactcenterinsights.v1.DialogflowSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dialogflowConversation_ = "";
    /**
     * <pre>
     * Output only. The name of the Dialogflow conversation that this conversation
     * resource is derived from. Format:
     * projects/{project}/locations/{location}/conversations/{conversation}
     * </pre>
     *
     * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The dialogflowConversation.
     */
    public java.lang.String getDialogflowConversation() {
      java.lang.Object ref = dialogflowConversation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dialogflowConversation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The name of the Dialogflow conversation that this conversation
     * resource is derived from. Format:
     * projects/{project}/locations/{location}/conversations/{conversation}
     * </pre>
     *
     * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for dialogflowConversation.
     */
    public com.google.protobuf.ByteString
        getDialogflowConversationBytes() {
      java.lang.Object ref = dialogflowConversation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dialogflowConversation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The name of the Dialogflow conversation that this conversation
     * resource is derived from. Format:
     * projects/{project}/locations/{location}/conversations/{conversation}
     * </pre>
     *
     * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The dialogflowConversation to set.
     * @return This builder for chaining.
     */
    public Builder setDialogflowConversation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dialogflowConversation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The name of the Dialogflow conversation that this conversation
     * resource is derived from. Format:
     * projects/{project}/locations/{location}/conversations/{conversation}
     * </pre>
     *
     * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearDialogflowConversation() {
      
      dialogflowConversation_ = getDefaultInstance().getDialogflowConversation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The name of the Dialogflow conversation that this conversation
     * resource is derived from. Format:
     * projects/{project}/locations/{location}/conversations/{conversation}
     * </pre>
     *
     * <code>string dialogflow_conversation = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for dialogflowConversation to set.
     * @return This builder for chaining.
     */
    public Builder setDialogflowConversationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dialogflowConversation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object audioUri_ = "";
    /**
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 3;</code>
     * @return The audioUri.
     */
    public java.lang.String getAudioUri() {
      java.lang.Object ref = audioUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audioUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 3;</code>
     * @return The bytes for audioUri.
     */
    public com.google.protobuf.ByteString
        getAudioUriBytes() {
      java.lang.Object ref = audioUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        audioUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 3;</code>
     * @param value The audioUri to set.
     * @return This builder for chaining.
     */
    public Builder setAudioUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      audioUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioUri() {
      
      audioUri_ = getDefaultInstance().getAudioUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 3;</code>
     * @param value The bytes for audioUri to set.
     * @return This builder for chaining.
     */
    public Builder setAudioUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      audioUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.DialogflowSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.DialogflowSource)
  private static final com.google.cloud.contactcenterinsights.v1.DialogflowSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.DialogflowSource();
  }

  public static com.google.cloud.contactcenterinsights.v1.DialogflowSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DialogflowSource>
      PARSER = new com.google.protobuf.AbstractParser<DialogflowSource>() {
    @java.lang.Override
    public DialogflowSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DialogflowSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DialogflowSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DialogflowSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DialogflowSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

