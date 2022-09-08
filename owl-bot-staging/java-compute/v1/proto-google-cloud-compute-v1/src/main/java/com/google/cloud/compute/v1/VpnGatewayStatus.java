// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.VpnGatewayStatus}
 */
public final class VpnGatewayStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.VpnGatewayStatus)
    VpnGatewayStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VpnGatewayStatus.newBuilder() to construct.
  private VpnGatewayStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VpnGatewayStatus() {
    vpnConnections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VpnGatewayStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VpnGatewayStatus(
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
          case -780290990: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vpnConnections_ = new java.util.ArrayList<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection>();
              mutable_bitField0_ |= 0x00000001;
            }
            vpnConnections_.add(
                input.readMessage(com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.parser(), extensionRegistry));
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
        vpnConnections_ = java.util.Collections.unmodifiableList(vpnConnections_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.VpnGatewayStatus.class, com.google.cloud.compute.v1.VpnGatewayStatus.Builder.class);
  }

  public static final int VPN_CONNECTIONS_FIELD_NUMBER = 439334538;
  private java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection> vpnConnections_;
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection> getVpnConnectionsList() {
    return vpnConnections_;
  }
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder> 
      getVpnConnectionsOrBuilderList() {
    return vpnConnections_;
  }
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  @java.lang.Override
  public int getVpnConnectionsCount() {
    return vpnConnections_.size();
  }
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection getVpnConnections(int index) {
    return vpnConnections_.get(index);
  }
  /**
   * <pre>
   * List of VPN connection for this VpnGateway.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder getVpnConnectionsOrBuilder(
      int index) {
    return vpnConnections_.get(index);
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
    for (int i = 0; i < vpnConnections_.size(); i++) {
      output.writeMessage(439334538, vpnConnections_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vpnConnections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(439334538, vpnConnections_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.VpnGatewayStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.VpnGatewayStatus other = (com.google.cloud.compute.v1.VpnGatewayStatus) obj;

    if (!getVpnConnectionsList()
        .equals(other.getVpnConnectionsList())) return false;
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
    if (getVpnConnectionsCount() > 0) {
      hash = (37 * hash) + VPN_CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getVpnConnectionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.VpnGatewayStatus parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.VpnGatewayStatus prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.VpnGatewayStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.VpnGatewayStatus)
      com.google.cloud.compute.v1.VpnGatewayStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.VpnGatewayStatus.class, com.google.cloud.compute.v1.VpnGatewayStatus.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.VpnGatewayStatus.newBuilder()
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
        getVpnConnectionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (vpnConnectionsBuilder_ == null) {
        vpnConnections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        vpnConnectionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_VpnGatewayStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewayStatus getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewayStatus build() {
      com.google.cloud.compute.v1.VpnGatewayStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnGatewayStatus buildPartial() {
      com.google.cloud.compute.v1.VpnGatewayStatus result = new com.google.cloud.compute.v1.VpnGatewayStatus(this);
      int from_bitField0_ = bitField0_;
      if (vpnConnectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vpnConnections_ = java.util.Collections.unmodifiableList(vpnConnections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vpnConnections_ = vpnConnections_;
      } else {
        result.vpnConnections_ = vpnConnectionsBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.VpnGatewayStatus) {
        return mergeFrom((com.google.cloud.compute.v1.VpnGatewayStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.VpnGatewayStatus other) {
      if (other == com.google.cloud.compute.v1.VpnGatewayStatus.getDefaultInstance()) return this;
      if (vpnConnectionsBuilder_ == null) {
        if (!other.vpnConnections_.isEmpty()) {
          if (vpnConnections_.isEmpty()) {
            vpnConnections_ = other.vpnConnections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVpnConnectionsIsMutable();
            vpnConnections_.addAll(other.vpnConnections_);
          }
          onChanged();
        }
      } else {
        if (!other.vpnConnections_.isEmpty()) {
          if (vpnConnectionsBuilder_.isEmpty()) {
            vpnConnectionsBuilder_.dispose();
            vpnConnectionsBuilder_ = null;
            vpnConnections_ = other.vpnConnections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vpnConnectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVpnConnectionsFieldBuilder() : null;
          } else {
            vpnConnectionsBuilder_.addAllMessages(other.vpnConnections_);
          }
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
      com.google.cloud.compute.v1.VpnGatewayStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.VpnGatewayStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection> vpnConnections_ =
      java.util.Collections.emptyList();
    private void ensureVpnConnectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vpnConnections_ = new java.util.ArrayList<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection>(vpnConnections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder> vpnConnectionsBuilder_;

    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection> getVpnConnectionsList() {
      if (vpnConnectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vpnConnections_);
      } else {
        return vpnConnectionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public int getVpnConnectionsCount() {
      if (vpnConnectionsBuilder_ == null) {
        return vpnConnections_.size();
      } else {
        return vpnConnectionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection getVpnConnections(int index) {
      if (vpnConnectionsBuilder_ == null) {
        return vpnConnections_.get(index);
      } else {
        return vpnConnectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder setVpnConnections(
        int index, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection value) {
      if (vpnConnectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVpnConnectionsIsMutable();
        vpnConnections_.set(index, value);
        onChanged();
      } else {
        vpnConnectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder setVpnConnections(
        int index, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder builderForValue) {
      if (vpnConnectionsBuilder_ == null) {
        ensureVpnConnectionsIsMutable();
        vpnConnections_.set(index, builderForValue.build());
        onChanged();
      } else {
        vpnConnectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder addVpnConnections(com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection value) {
      if (vpnConnectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVpnConnectionsIsMutable();
        vpnConnections_.add(value);
        onChanged();
      } else {
        vpnConnectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder addVpnConnections(
        int index, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection value) {
      if (vpnConnectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVpnConnectionsIsMutable();
        vpnConnections_.add(index, value);
        onChanged();
      } else {
        vpnConnectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder addVpnConnections(
        com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder builderForValue) {
      if (vpnConnectionsBuilder_ == null) {
        ensureVpnConnectionsIsMutable();
        vpnConnections_.add(builderForValue.build());
        onChanged();
      } else {
        vpnConnectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder addVpnConnections(
        int index, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder builderForValue) {
      if (vpnConnectionsBuilder_ == null) {
        ensureVpnConnectionsIsMutable();
        vpnConnections_.add(index, builderForValue.build());
        onChanged();
      } else {
        vpnConnectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder addAllVpnConnections(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection> values) {
      if (vpnConnectionsBuilder_ == null) {
        ensureVpnConnectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vpnConnections_);
        onChanged();
      } else {
        vpnConnectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder clearVpnConnections() {
      if (vpnConnectionsBuilder_ == null) {
        vpnConnections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vpnConnectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public Builder removeVpnConnections(int index) {
      if (vpnConnectionsBuilder_ == null) {
        ensureVpnConnectionsIsMutable();
        vpnConnections_.remove(index);
        onChanged();
      } else {
        vpnConnectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder getVpnConnectionsBuilder(
        int index) {
      return getVpnConnectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder getVpnConnectionsOrBuilder(
        int index) {
      if (vpnConnectionsBuilder_ == null) {
        return vpnConnections_.get(index);  } else {
        return vpnConnectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder> 
         getVpnConnectionsOrBuilderList() {
      if (vpnConnectionsBuilder_ != null) {
        return vpnConnectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vpnConnections_);
      }
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder addVpnConnectionsBuilder() {
      return getVpnConnectionsFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.getDefaultInstance());
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder addVpnConnectionsBuilder(
        int index) {
      return getVpnConnectionsFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.getDefaultInstance());
    }
    /**
     * <pre>
     * List of VPN connection for this VpnGateway.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusVpnConnection vpn_connections = 439334538;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder> 
         getVpnConnectionsBuilderList() {
      return getVpnConnectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder> 
        getVpnConnectionsFieldBuilder() {
      if (vpnConnectionsBuilder_ == null) {
        vpnConnectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnection.Builder, com.google.cloud.compute.v1.VpnGatewayStatusVpnConnectionOrBuilder>(
                vpnConnections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vpnConnections_ = null;
      }
      return vpnConnectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.VpnGatewayStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.VpnGatewayStatus)
  private static final com.google.cloud.compute.v1.VpnGatewayStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.VpnGatewayStatus();
  }

  public static com.google.cloud.compute.v1.VpnGatewayStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpnGatewayStatus>
      PARSER = new com.google.protobuf.AbstractParser<VpnGatewayStatus>() {
    @java.lang.Override
    public VpnGatewayStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VpnGatewayStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VpnGatewayStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpnGatewayStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.VpnGatewayStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

