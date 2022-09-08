// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Request message for CreateUserLink RPC.
 * Users can have multiple email addresses associated with their Google
 * account, and one of these email addresses is the "primary" email address.
 * Any of the email addresses associated with a Google account may be used
 * for a new UserLink, but the returned UserLink will always contain the
 * "primary" email address. As a result, the input and output email address
 * for this request may differ.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateUserLinkRequest}
 */
public final class CreateUserLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateUserLinkRequest)
    CreateUserLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUserLinkRequest.newBuilder() to construct.
  private CreateUserLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUserLinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateUserLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateUserLinkRequest(
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
          case 16: {

            notifyNewUser_ = input.readBool();
            break;
          }
          case 26: {
            com.google.analytics.admin.v1alpha.UserLink.Builder subBuilder = null;
            if (userLink_ != null) {
              subBuilder = userLink_.toBuilder();
            }
            userLink_ = input.readMessage(com.google.analytics.admin.v1alpha.UserLink.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userLink_);
              userLink_ = subBuilder.buildPartial();
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
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateUserLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateUserLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateUserLinkRequest.class, com.google.analytics.admin.v1alpha.CreateUserLinkRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. Example format: accounts/1234
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
   * Required. Example format: accounts/1234
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

  public static final int NOTIFY_NEW_USER_FIELD_NUMBER = 2;
  private boolean notifyNewUser_;
  /**
   * <pre>
   * Optional. If set, then email the new user notifying them that they've been granted
   * permissions to the resource.
   * </pre>
   *
   * <code>bool notify_new_user = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The notifyNewUser.
   */
  @java.lang.Override
  public boolean getNotifyNewUser() {
    return notifyNewUser_;
  }

  public static final int USER_LINK_FIELD_NUMBER = 3;
  private com.google.analytics.admin.v1alpha.UserLink userLink_;
  /**
   * <pre>
   * Required. The user link to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the userLink field is set.
   */
  @java.lang.Override
  public boolean hasUserLink() {
    return userLink_ != null;
  }
  /**
   * <pre>
   * Required. The user link to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UserLink getUserLink() {
    return userLink_ == null ? com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance() : userLink_;
  }
  /**
   * <pre>
   * Required. The user link to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UserLinkOrBuilder getUserLinkOrBuilder() {
    return getUserLink();
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
    if (notifyNewUser_ != false) {
      output.writeBool(2, notifyNewUser_);
    }
    if (userLink_ != null) {
      output.writeMessage(3, getUserLink());
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
    if (notifyNewUser_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, notifyNewUser_);
    }
    if (userLink_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUserLink());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateUserLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateUserLinkRequest other = (com.google.analytics.admin.v1alpha.CreateUserLinkRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (getNotifyNewUser()
        != other.getNotifyNewUser()) return false;
    if (hasUserLink() != other.hasUserLink()) return false;
    if (hasUserLink()) {
      if (!getUserLink()
          .equals(other.getUserLink())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + NOTIFY_NEW_USER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNotifyNewUser());
    if (hasUserLink()) {
      hash = (37 * hash) + USER_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getUserLink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.CreateUserLinkRequest prototype) {
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
   * Request message for CreateUserLink RPC.
   * Users can have multiple email addresses associated with their Google
   * account, and one of these email addresses is the "primary" email address.
   * Any of the email addresses associated with a Google account may be used
   * for a new UserLink, but the returned UserLink will always contain the
   * "primary" email address. As a result, the input and output email address
   * for this request may differ.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateUserLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateUserLinkRequest)
      com.google.analytics.admin.v1alpha.CreateUserLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateUserLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateUserLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateUserLinkRequest.class, com.google.analytics.admin.v1alpha.CreateUserLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateUserLinkRequest.newBuilder()
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

      notifyNewUser_ = false;

      if (userLinkBuilder_ == null) {
        userLink_ = null;
      } else {
        userLink_ = null;
        userLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateUserLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateUserLinkRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateUserLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateUserLinkRequest build() {
      com.google.analytics.admin.v1alpha.CreateUserLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateUserLinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateUserLinkRequest result = new com.google.analytics.admin.v1alpha.CreateUserLinkRequest(this);
      result.parent_ = parent_;
      result.notifyNewUser_ = notifyNewUser_;
      if (userLinkBuilder_ == null) {
        result.userLink_ = userLink_;
      } else {
        result.userLink_ = userLinkBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateUserLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateUserLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateUserLinkRequest other) {
      if (other == com.google.analytics.admin.v1alpha.CreateUserLinkRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.getNotifyNewUser() != false) {
        setNotifyNewUser(other.getNotifyNewUser());
      }
      if (other.hasUserLink()) {
        mergeUserLink(other.getUserLink());
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
      com.google.analytics.admin.v1alpha.CreateUserLinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.CreateUserLinkRequest) e.getUnfinishedMessage();
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
     * Required. Example format: accounts/1234
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
     * Required. Example format: accounts/1234
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
     * Required. Example format: accounts/1234
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
     * Required. Example format: accounts/1234
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
     * Required. Example format: accounts/1234
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

    private boolean notifyNewUser_ ;
    /**
     * <pre>
     * Optional. If set, then email the new user notifying them that they've been granted
     * permissions to the resource.
     * </pre>
     *
     * <code>bool notify_new_user = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The notifyNewUser.
     */
    @java.lang.Override
    public boolean getNotifyNewUser() {
      return notifyNewUser_;
    }
    /**
     * <pre>
     * Optional. If set, then email the new user notifying them that they've been granted
     * permissions to the resource.
     * </pre>
     *
     * <code>bool notify_new_user = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The notifyNewUser to set.
     * @return This builder for chaining.
     */
    public Builder setNotifyNewUser(boolean value) {
      
      notifyNewUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If set, then email the new user notifying them that they've been granted
     * permissions to the resource.
     * </pre>
     *
     * <code>bool notify_new_user = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotifyNewUser() {
      
      notifyNewUser_ = false;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.UserLink userLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.UserLink, com.google.analytics.admin.v1alpha.UserLink.Builder, com.google.analytics.admin.v1alpha.UserLinkOrBuilder> userLinkBuilder_;
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the userLink field is set.
     */
    public boolean hasUserLink() {
      return userLinkBuilder_ != null || userLink_ != null;
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The userLink.
     */
    public com.google.analytics.admin.v1alpha.UserLink getUserLink() {
      if (userLinkBuilder_ == null) {
        return userLink_ == null ? com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance() : userLink_;
      } else {
        return userLinkBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUserLink(com.google.analytics.admin.v1alpha.UserLink value) {
      if (userLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userLink_ = value;
        onChanged();
      } else {
        userLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUserLink(
        com.google.analytics.admin.v1alpha.UserLink.Builder builderForValue) {
      if (userLinkBuilder_ == null) {
        userLink_ = builderForValue.build();
        onChanged();
      } else {
        userLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUserLink(com.google.analytics.admin.v1alpha.UserLink value) {
      if (userLinkBuilder_ == null) {
        if (userLink_ != null) {
          userLink_ =
            com.google.analytics.admin.v1alpha.UserLink.newBuilder(userLink_).mergeFrom(value).buildPartial();
        } else {
          userLink_ = value;
        }
        onChanged();
      } else {
        userLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUserLink() {
      if (userLinkBuilder_ == null) {
        userLink_ = null;
        onChanged();
      } else {
        userLink_ = null;
        userLinkBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1alpha.UserLink.Builder getUserLinkBuilder() {
      
      onChanged();
      return getUserLinkFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1alpha.UserLinkOrBuilder getUserLinkOrBuilder() {
      if (userLinkBuilder_ != null) {
        return userLinkBuilder_.getMessageOrBuilder();
      } else {
        return userLink_ == null ?
            com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance() : userLink_;
      }
    }
    /**
     * <pre>
     * Required. The user link to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.UserLink user_link = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.UserLink, com.google.analytics.admin.v1alpha.UserLink.Builder, com.google.analytics.admin.v1alpha.UserLinkOrBuilder> 
        getUserLinkFieldBuilder() {
      if (userLinkBuilder_ == null) {
        userLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.UserLink, com.google.analytics.admin.v1alpha.UserLink.Builder, com.google.analytics.admin.v1alpha.UserLinkOrBuilder>(
                getUserLink(),
                getParentForChildren(),
                isClean());
        userLink_ = null;
      }
      return userLinkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateUserLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateUserLinkRequest)
  private static final com.google.analytics.admin.v1alpha.CreateUserLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateUserLinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateUserLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUserLinkRequest>() {
    @java.lang.Override
    public CreateUserLinkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateUserLinkRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateUserLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUserLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateUserLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

