// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Pub/Sub topic message for a DataProfileAction.PubSubNotification event.
 * To receive a message of protocol buffer schema type, convert the message data
 * to an object of this proto class.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DataProfilePubSubMessage}
 */
public final class DataProfilePubSubMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DataProfilePubSubMessage)
    DataProfilePubSubMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataProfilePubSubMessage.newBuilder() to construct.
  private DataProfilePubSubMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataProfilePubSubMessage() {
    event_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataProfilePubSubMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataProfilePubSubMessage(
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
            com.google.privacy.dlp.v2.TableDataProfile.Builder subBuilder = null;
            if (profile_ != null) {
              subBuilder = profile_.toBuilder();
            }
            profile_ = input.readMessage(com.google.privacy.dlp.v2.TableDataProfile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(profile_);
              profile_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            event_ = rawValue;
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
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfilePubSubMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfilePubSubMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DataProfilePubSubMessage.class, com.google.privacy.dlp.v2.DataProfilePubSubMessage.Builder.class);
  }

  public static final int PROFILE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.TableDataProfile profile_;
  /**
   * <pre>
   * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `full_resource` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
   * @return Whether the profile field is set.
   */
  @java.lang.Override
  public boolean hasProfile() {
    return profile_ != null;
  }
  /**
   * <pre>
   * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `full_resource` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
   * @return The profile.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.TableDataProfile getProfile() {
    return profile_ == null ? com.google.privacy.dlp.v2.TableDataProfile.getDefaultInstance() : profile_;
  }
  /**
   * <pre>
   * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `full_resource` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.TableDataProfileOrBuilder getProfileOrBuilder() {
    return getProfile();
  }

  public static final int EVENT_FIELD_NUMBER = 2;
  private int event_;
  /**
   * <pre>
   * The event that caused the Pub/Sub message to be sent.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
   * @return The enum numeric value on the wire for event.
   */
  @java.lang.Override public int getEventValue() {
    return event_;
  }
  /**
   * <pre>
   * The event that caused the Pub/Sub message to be sent.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
   * @return The event.
   */
  @java.lang.Override public com.google.privacy.dlp.v2.DataProfileAction.EventType getEvent() {
    @SuppressWarnings("deprecation")
    com.google.privacy.dlp.v2.DataProfileAction.EventType result = com.google.privacy.dlp.v2.DataProfileAction.EventType.valueOf(event_);
    return result == null ? com.google.privacy.dlp.v2.DataProfileAction.EventType.UNRECOGNIZED : result;
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
    if (profile_ != null) {
      output.writeMessage(1, getProfile());
    }
    if (event_ != com.google.privacy.dlp.v2.DataProfileAction.EventType.EVENT_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, event_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (profile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProfile());
    }
    if (event_ != com.google.privacy.dlp.v2.DataProfileAction.EventType.EVENT_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, event_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DataProfilePubSubMessage)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DataProfilePubSubMessage other = (com.google.privacy.dlp.v2.DataProfilePubSubMessage) obj;

    if (hasProfile() != other.hasProfile()) return false;
    if (hasProfile()) {
      if (!getProfile()
          .equals(other.getProfile())) return false;
    }
    if (event_ != other.event_) return false;
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
    if (hasProfile()) {
      hash = (37 * hash) + PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getProfile().hashCode();
    }
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + event_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.DataProfilePubSubMessage prototype) {
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
   * Pub/Sub topic message for a DataProfileAction.PubSubNotification event.
   * To receive a message of protocol buffer schema type, convert the message data
   * to an object of this proto class.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DataProfilePubSubMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DataProfilePubSubMessage)
      com.google.privacy.dlp.v2.DataProfilePubSubMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfilePubSubMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfilePubSubMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DataProfilePubSubMessage.class, com.google.privacy.dlp.v2.DataProfilePubSubMessage.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DataProfilePubSubMessage.newBuilder()
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
      if (profileBuilder_ == null) {
        profile_ = null;
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }
      event_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfilePubSubMessage_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfilePubSubMessage getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DataProfilePubSubMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfilePubSubMessage build() {
      com.google.privacy.dlp.v2.DataProfilePubSubMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfilePubSubMessage buildPartial() {
      com.google.privacy.dlp.v2.DataProfilePubSubMessage result = new com.google.privacy.dlp.v2.DataProfilePubSubMessage(this);
      if (profileBuilder_ == null) {
        result.profile_ = profile_;
      } else {
        result.profile_ = profileBuilder_.build();
      }
      result.event_ = event_;
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
      if (other instanceof com.google.privacy.dlp.v2.DataProfilePubSubMessage) {
        return mergeFrom((com.google.privacy.dlp.v2.DataProfilePubSubMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DataProfilePubSubMessage other) {
      if (other == com.google.privacy.dlp.v2.DataProfilePubSubMessage.getDefaultInstance()) return this;
      if (other.hasProfile()) {
        mergeProfile(other.getProfile());
      }
      if (other.event_ != 0) {
        setEventValue(other.getEventValue());
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
      com.google.privacy.dlp.v2.DataProfilePubSubMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.DataProfilePubSubMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.TableDataProfile profile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.TableDataProfile, com.google.privacy.dlp.v2.TableDataProfile.Builder, com.google.privacy.dlp.v2.TableDataProfileOrBuilder> profileBuilder_;
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     * @return Whether the profile field is set.
     */
    public boolean hasProfile() {
      return profileBuilder_ != null || profile_ != null;
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     * @return The profile.
     */
    public com.google.privacy.dlp.v2.TableDataProfile getProfile() {
      if (profileBuilder_ == null) {
        return profile_ == null ? com.google.privacy.dlp.v2.TableDataProfile.getDefaultInstance() : profile_;
      } else {
        return profileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    public Builder setProfile(com.google.privacy.dlp.v2.TableDataProfile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profile_ = value;
        onChanged();
      } else {
        profileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    public Builder setProfile(
        com.google.privacy.dlp.v2.TableDataProfile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        profile_ = builderForValue.build();
        onChanged();
      } else {
        profileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    public Builder mergeProfile(com.google.privacy.dlp.v2.TableDataProfile value) {
      if (profileBuilder_ == null) {
        if (profile_ != null) {
          profile_ =
            com.google.privacy.dlp.v2.TableDataProfile.newBuilder(profile_).mergeFrom(value).buildPartial();
        } else {
          profile_ = value;
        }
        onChanged();
      } else {
        profileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    public Builder clearProfile() {
      if (profileBuilder_ == null) {
        profile_ = null;
        onChanged();
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    public com.google.privacy.dlp.v2.TableDataProfile.Builder getProfileBuilder() {
      
      onChanged();
      return getProfileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    public com.google.privacy.dlp.v2.TableDataProfileOrBuilder getProfileOrBuilder() {
      if (profileBuilder_ != null) {
        return profileBuilder_.getMessageOrBuilder();
      } else {
        return profile_ == null ?
            com.google.privacy.dlp.v2.TableDataProfile.getDefaultInstance() : profile_;
      }
    }
    /**
     * <pre>
     * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
     * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
     * `full_resource` will be populated.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.TableDataProfile, com.google.privacy.dlp.v2.TableDataProfile.Builder, com.google.privacy.dlp.v2.TableDataProfileOrBuilder> 
        getProfileFieldBuilder() {
      if (profileBuilder_ == null) {
        profileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.TableDataProfile, com.google.privacy.dlp.v2.TableDataProfile.Builder, com.google.privacy.dlp.v2.TableDataProfileOrBuilder>(
                getProfile(),
                getParentForChildren(),
                isClean());
        profile_ = null;
      }
      return profileBuilder_;
    }

    private int event_ = 0;
    /**
     * <pre>
     * The event that caused the Pub/Sub message to be sent.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
     * @return The enum numeric value on the wire for event.
     */
    @java.lang.Override public int getEventValue() {
      return event_;
    }
    /**
     * <pre>
     * The event that caused the Pub/Sub message to be sent.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
     * @param value The enum numeric value on the wire for event to set.
     * @return This builder for chaining.
     */
    public Builder setEventValue(int value) {
      
      event_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event that caused the Pub/Sub message to be sent.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
     * @return The event.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileAction.EventType getEvent() {
      @SuppressWarnings("deprecation")
      com.google.privacy.dlp.v2.DataProfileAction.EventType result = com.google.privacy.dlp.v2.DataProfileAction.EventType.valueOf(event_);
      return result == null ? com.google.privacy.dlp.v2.DataProfileAction.EventType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The event that caused the Pub/Sub message to be sent.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
     * @param value The event to set.
     * @return This builder for chaining.
     */
    public Builder setEvent(com.google.privacy.dlp.v2.DataProfileAction.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      event_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event that caused the Pub/Sub message to be sent.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvent() {
      
      event_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DataProfilePubSubMessage)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DataProfilePubSubMessage)
  private static final com.google.privacy.dlp.v2.DataProfilePubSubMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DataProfilePubSubMessage();
  }

  public static com.google.privacy.dlp.v2.DataProfilePubSubMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataProfilePubSubMessage>
      PARSER = new com.google.protobuf.AbstractParser<DataProfilePubSubMessage>() {
    @java.lang.Override
    public DataProfilePubSubMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataProfilePubSubMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataProfilePubSubMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataProfilePubSubMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfilePubSubMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

