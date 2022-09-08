// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 * <pre>
 * State for PolicyControllerState.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState}
 */
public final class PolicyControllerState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState)
    PolicyControllerStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyControllerState.newBuilder() to construct.
  private PolicyControllerState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyControllerState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyControllerState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PolicyControllerState(
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
            com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.Builder subBuilder = null;
            if (version_ != null) {
              subBuilder = version_.toBuilder();
            }
            version_ = input.readMessage(com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(version_);
              version_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.Builder subBuilder = null;
            if (deploymentState_ != null) {
              subBuilder = deploymentState_.toBuilder();
            }
            deploymentState_ = input.readMessage(com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deploymentState_);
              deploymentState_ = subBuilder.buildPartial();
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
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_PolicyControllerState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_PolicyControllerState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.class, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version_;
  /**
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion getVersion() {
    return version_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersionOrBuilder getVersionOrBuilder() {
    return getVersion();
  }

  public static final int DEPLOYMENT_STATE_FIELD_NUMBER = 2;
  private com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deploymentState_;
  /**
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
   * @return Whether the deploymentState field is set.
   */
  @java.lang.Override
  public boolean hasDeploymentState() {
    return deploymentState_ != null;
  }
  /**
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
   * @return The deploymentState.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState getDeploymentState() {
    return deploymentState_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.getDefaultInstance() : deploymentState_;
  }
  /**
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentStateOrBuilder getDeploymentStateOrBuilder() {
    return getDeploymentState();
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
    if (version_ != null) {
      output.writeMessage(1, getVersion());
    }
    if (deploymentState_ != null) {
      output.writeMessage(2, getDeploymentState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVersion());
    }
    if (deploymentState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeploymentState());
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState other = (com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState) obj;

    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (hasDeploymentState() != other.hasDeploymentState()) return false;
    if (hasDeploymentState()) {
      if (!getDeploymentState()
          .equals(other.getDeploymentState())) return false;
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
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasDeploymentState()) {
      hash = (37 * hash) + DEPLOYMENT_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState prototype) {
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
   * State for PolicyControllerState.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState)
      com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_PolicyControllerState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_PolicyControllerState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.class, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.newBuilder()
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
      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      if (deploymentStateBuilder_ == null) {
        deploymentState_ = null;
      } else {
        deploymentState_ = null;
        deploymentStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_PolicyControllerState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState result = new com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState(this);
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
      if (deploymentStateBuilder_ == null) {
        result.deploymentState_ = deploymentState_;
      } else {
        result.deploymentState_ = deploymentStateBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState.getDefaultInstance()) return this;
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasDeploymentState()) {
        mergeDeploymentState(other.getDeploymentState());
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
      com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersionOrBuilder> versionBuilder_;
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     * @return The version.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    public Builder setVersion(com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    public Builder mergeVersion(com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
            com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.newBuilder(version_).mergeFrom(value).buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.Builder getVersionBuilder() {
      
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion version = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersion.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerVersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deploymentState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState, com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentStateOrBuilder> deploymentStateBuilder_;
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     * @return Whether the deploymentState field is set.
     */
    public boolean hasDeploymentState() {
      return deploymentStateBuilder_ != null || deploymentState_ != null;
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     * @return The deploymentState.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState getDeploymentState() {
      if (deploymentStateBuilder_ == null) {
        return deploymentState_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.getDefaultInstance() : deploymentState_;
      } else {
        return deploymentStateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    public Builder setDeploymentState(com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState value) {
      if (deploymentStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deploymentState_ = value;
        onChanged();
      } else {
        deploymentStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    public Builder setDeploymentState(
        com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.Builder builderForValue) {
      if (deploymentStateBuilder_ == null) {
        deploymentState_ = builderForValue.build();
        onChanged();
      } else {
        deploymentStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    public Builder mergeDeploymentState(com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState value) {
      if (deploymentStateBuilder_ == null) {
        if (deploymentState_ != null) {
          deploymentState_ =
            com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.newBuilder(deploymentState_).mergeFrom(value).buildPartial();
        } else {
          deploymentState_ = value;
        }
        onChanged();
      } else {
        deploymentStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    public Builder clearDeploymentState() {
      if (deploymentStateBuilder_ == null) {
        deploymentState_ = null;
        onChanged();
      } else {
        deploymentState_ = null;
        deploymentStateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.Builder getDeploymentStateBuilder() {
      
      onChanged();
      return getDeploymentStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentStateOrBuilder getDeploymentStateOrBuilder() {
      if (deploymentStateBuilder_ != null) {
        return deploymentStateBuilder_.getMessageOrBuilder();
      } else {
        return deploymentState_ == null ?
            com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.getDefaultInstance() : deploymentState_;
      }
    }
    /**
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState deployment_state = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState, com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentStateOrBuilder> 
        getDeploymentStateFieldBuilder() {
      if (deploymentStateBuilder_ == null) {
        deploymentStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState, com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentState.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.GatekeeperDeploymentStateOrBuilder>(
                getDeploymentState(),
                getParentForChildren(),
                isClean());
        deploymentState_ = null;
      }
      return deploymentStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyControllerState>
      PARSER = new com.google.protobuf.AbstractParser<PolicyControllerState>() {
    @java.lang.Override
    public PolicyControllerState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PolicyControllerState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyControllerState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyControllerState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.PolicyControllerState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

