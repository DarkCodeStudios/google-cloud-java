// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

/**
 * <pre>
 * Encapsulation of billing information for a GCP Console project. A project
 * has at most one associated billing account at a time (but a billing account
 * can be assigned to multiple projects).
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.v1.ProjectBillingInfo}
 */
public final class ProjectBillingInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.v1.ProjectBillingInfo)
    ProjectBillingInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProjectBillingInfo.newBuilder() to construct.
  private ProjectBillingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectBillingInfo() {
    name_ = "";
    projectId_ = "";
    billingAccountName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProjectBillingInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProjectBillingInfo(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            billingAccountName_ = s;
            break;
          }
          case 32: {

            billingEnabled_ = input.readBool();
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
    return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_ProjectBillingInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_ProjectBillingInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.v1.ProjectBillingInfo.class, com.google.cloud.billing.v1.ProjectBillingInfo.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the
   * billing information for project `tokyo-rain-123` would be
   * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name for the `ProjectBillingInfo`; has the form
   * `projects/{project_id}/billingInfo`. For example, the resource name for the
   * billing information for project `tokyo-rain-123` would be
   * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The ID of the project that this `ProjectBillingInfo` represents, such as
   * `tokyo-rain-123`. This is a convenience field so that you don't need to
   * parse the `name` field to obtain a project ID. This field is read-only.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the project that this `ProjectBillingInfo` represents, such as
   * `tokyo-rain-123`. This is a convenience field so that you don't need to
   * parse the `name` field to obtain a project ID. This field is read-only.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLING_ACCOUNT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object billingAccountName_;
  /**
   * <pre>
   * The resource name of the billing account associated with the project, if
   * any. For example, `billingAccounts/012345-567890-ABCDEF`.
   * </pre>
   *
   * <code>string billing_account_name = 3;</code>
   * @return The billingAccountName.
   */
  @java.lang.Override
  public java.lang.String getBillingAccountName() {
    java.lang.Object ref = billingAccountName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billingAccountName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the billing account associated with the project, if
   * any. For example, `billingAccounts/012345-567890-ABCDEF`.
   * </pre>
   *
   * <code>string billing_account_name = 3;</code>
   * @return The bytes for billingAccountName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBillingAccountNameBytes() {
    java.lang.Object ref = billingAccountName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billingAccountName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLING_ENABLED_FIELD_NUMBER = 4;
  private boolean billingEnabled_;
  /**
   * <pre>
   * True if the project is associated with an open billing account, to which
   * usage on the project is charged. False if the project is associated with a
   * closed billing account, or no billing account at all, and therefore cannot
   * use paid services. This field is read-only.
   * </pre>
   *
   * <code>bool billing_enabled = 4;</code>
   * @return The billingEnabled.
   */
  @java.lang.Override
  public boolean getBillingEnabled() {
    return billingEnabled_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingAccountName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, billingAccountName_);
    }
    if (billingEnabled_ != false) {
      output.writeBool(4, billingEnabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingAccountName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, billingAccountName_);
    }
    if (billingEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, billingEnabled_);
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
    if (!(obj instanceof com.google.cloud.billing.v1.ProjectBillingInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.v1.ProjectBillingInfo other = (com.google.cloud.billing.v1.ProjectBillingInfo) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (!getBillingAccountName()
        .equals(other.getBillingAccountName())) return false;
    if (getBillingEnabled()
        != other.getBillingEnabled()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + BILLING_ACCOUNT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBillingAccountName().hashCode();
    hash = (37 * hash) + BILLING_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBillingEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.billing.v1.ProjectBillingInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.billing.v1.ProjectBillingInfo prototype) {
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
   * Encapsulation of billing information for a GCP Console project. A project
   * has at most one associated billing account at a time (but a billing account
   * can be assigned to multiple projects).
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.v1.ProjectBillingInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.v1.ProjectBillingInfo)
      com.google.cloud.billing.v1.ProjectBillingInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_ProjectBillingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_ProjectBillingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.v1.ProjectBillingInfo.class, com.google.cloud.billing.v1.ProjectBillingInfo.Builder.class);
    }

    // Construct using com.google.cloud.billing.v1.ProjectBillingInfo.newBuilder()
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
      name_ = "";

      projectId_ = "";

      billingAccountName_ = "";

      billingEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.billing.v1.CloudBillingProto.internal_static_google_cloud_billing_v1_ProjectBillingInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.ProjectBillingInfo getDefaultInstanceForType() {
      return com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.ProjectBillingInfo build() {
      com.google.cloud.billing.v1.ProjectBillingInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.ProjectBillingInfo buildPartial() {
      com.google.cloud.billing.v1.ProjectBillingInfo result = new com.google.cloud.billing.v1.ProjectBillingInfo(this);
      result.name_ = name_;
      result.projectId_ = projectId_;
      result.billingAccountName_ = billingAccountName_;
      result.billingEnabled_ = billingEnabled_;
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
      if (other instanceof com.google.cloud.billing.v1.ProjectBillingInfo) {
        return mergeFrom((com.google.cloud.billing.v1.ProjectBillingInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.v1.ProjectBillingInfo other) {
      if (other == com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getBillingAccountName().isEmpty()) {
        billingAccountName_ = other.billingAccountName_;
        onChanged();
      }
      if (other.getBillingEnabled() != false) {
        setBillingEnabled(other.getBillingEnabled());
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
      com.google.cloud.billing.v1.ProjectBillingInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.billing.v1.ProjectBillingInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name for the `ProjectBillingInfo`; has the form
     * `projects/{project_id}/billingInfo`. For example, the resource name for the
     * billing information for project `tokyo-rain-123` would be
     * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name for the `ProjectBillingInfo`; has the form
     * `projects/{project_id}/billingInfo`. For example, the resource name for the
     * billing information for project `tokyo-rain-123` would be
     * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name for the `ProjectBillingInfo`; has the form
     * `projects/{project_id}/billingInfo`. For example, the resource name for the
     * billing information for project `tokyo-rain-123` would be
     * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name for the `ProjectBillingInfo`; has the form
     * `projects/{project_id}/billingInfo`. For example, the resource name for the
     * billing information for project `tokyo-rain-123` would be
     * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name for the `ProjectBillingInfo`; has the form
     * `projects/{project_id}/billingInfo`. For example, the resource name for the
     * billing information for project `tokyo-rain-123` would be
     * `projects/tokyo-rain-123/billingInfo`. This field is read-only.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The ID of the project that this `ProjectBillingInfo` represents, such as
     * `tokyo-rain-123`. This is a convenience field so that you don't need to
     * parse the `name` field to obtain a project ID. This field is read-only.
     * </pre>
     *
     * <code>string project_id = 2;</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project that this `ProjectBillingInfo` represents, such as
     * `tokyo-rain-123`. This is a convenience field so that you don't need to
     * parse the `name` field to obtain a project ID. This field is read-only.
     * </pre>
     *
     * <code>string project_id = 2;</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project that this `ProjectBillingInfo` represents, such as
     * `tokyo-rain-123`. This is a convenience field so that you don't need to
     * parse the `name` field to obtain a project ID. This field is read-only.
     * </pre>
     *
     * <code>string project_id = 2;</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project that this `ProjectBillingInfo` represents, such as
     * `tokyo-rain-123`. This is a convenience field so that you don't need to
     * parse the `name` field to obtain a project ID. This field is read-only.
     * </pre>
     *
     * <code>string project_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project that this `ProjectBillingInfo` represents, such as
     * `tokyo-rain-123`. This is a convenience field so that you don't need to
     * parse the `name` field to obtain a project ID. This field is read-only.
     * </pre>
     *
     * <code>string project_id = 2;</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object billingAccountName_ = "";
    /**
     * <pre>
     * The resource name of the billing account associated with the project, if
     * any. For example, `billingAccounts/012345-567890-ABCDEF`.
     * </pre>
     *
     * <code>string billing_account_name = 3;</code>
     * @return The billingAccountName.
     */
    public java.lang.String getBillingAccountName() {
      java.lang.Object ref = billingAccountName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billingAccountName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the billing account associated with the project, if
     * any. For example, `billingAccounts/012345-567890-ABCDEF`.
     * </pre>
     *
     * <code>string billing_account_name = 3;</code>
     * @return The bytes for billingAccountName.
     */
    public com.google.protobuf.ByteString
        getBillingAccountNameBytes() {
      java.lang.Object ref = billingAccountName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billingAccountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the billing account associated with the project, if
     * any. For example, `billingAccounts/012345-567890-ABCDEF`.
     * </pre>
     *
     * <code>string billing_account_name = 3;</code>
     * @param value The billingAccountName to set.
     * @return This builder for chaining.
     */
    public Builder setBillingAccountName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      billingAccountName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the billing account associated with the project, if
     * any. For example, `billingAccounts/012345-567890-ABCDEF`.
     * </pre>
     *
     * <code>string billing_account_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingAccountName() {
      
      billingAccountName_ = getDefaultInstance().getBillingAccountName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the billing account associated with the project, if
     * any. For example, `billingAccounts/012345-567890-ABCDEF`.
     * </pre>
     *
     * <code>string billing_account_name = 3;</code>
     * @param value The bytes for billingAccountName to set.
     * @return This builder for chaining.
     */
    public Builder setBillingAccountNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      billingAccountName_ = value;
      onChanged();
      return this;
    }

    private boolean billingEnabled_ ;
    /**
     * <pre>
     * True if the project is associated with an open billing account, to which
     * usage on the project is charged. False if the project is associated with a
     * closed billing account, or no billing account at all, and therefore cannot
     * use paid services. This field is read-only.
     * </pre>
     *
     * <code>bool billing_enabled = 4;</code>
     * @return The billingEnabled.
     */
    @java.lang.Override
    public boolean getBillingEnabled() {
      return billingEnabled_;
    }
    /**
     * <pre>
     * True if the project is associated with an open billing account, to which
     * usage on the project is charged. False if the project is associated with a
     * closed billing account, or no billing account at all, and therefore cannot
     * use paid services. This field is read-only.
     * </pre>
     *
     * <code>bool billing_enabled = 4;</code>
     * @param value The billingEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setBillingEnabled(boolean value) {
      
      billingEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if the project is associated with an open billing account, to which
     * usage on the project is charged. False if the project is associated with a
     * closed billing account, or no billing account at all, and therefore cannot
     * use paid services. This field is read-only.
     * </pre>
     *
     * <code>bool billing_enabled = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingEnabled() {
      
      billingEnabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.billing.v1.ProjectBillingInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.v1.ProjectBillingInfo)
  private static final com.google.cloud.billing.v1.ProjectBillingInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.v1.ProjectBillingInfo();
  }

  public static com.google.cloud.billing.v1.ProjectBillingInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectBillingInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProjectBillingInfo>() {
    @java.lang.Override
    public ProjectBillingInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProjectBillingInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProjectBillingInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectBillingInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.v1.ProjectBillingInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

