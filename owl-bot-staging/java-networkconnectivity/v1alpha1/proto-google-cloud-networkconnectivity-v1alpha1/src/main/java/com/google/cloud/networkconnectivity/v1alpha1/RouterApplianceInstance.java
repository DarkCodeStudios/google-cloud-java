// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1alpha1/hub.proto

package com.google.cloud.networkconnectivity.v1alpha1;

/**
 * <pre>
 * RouterAppliance represents a Router appliance which is specified by a VM URI
 * and a NIC address.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance}
 */
public final class RouterApplianceInstance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)
    RouterApplianceInstanceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouterApplianceInstance.newBuilder() to construct.
  private RouterApplianceInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouterApplianceInstance() {
    virtualMachine_ = "";
    ipAddress_ = "";
    networkInterface_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouterApplianceInstance();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouterApplianceInstance(
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

            virtualMachine_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            networkInterface_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ipAddress_ = s;
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
    return com.google.cloud.networkconnectivity.v1alpha1.HubProto.internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkconnectivity.v1alpha1.HubProto.internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.class, com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.Builder.class);
  }

  public static final int VIRTUAL_MACHINE_FIELD_NUMBER = 1;
  private volatile java.lang.Object virtualMachine_;
  /**
   * <pre>
   * The URI of the virtual machine resource
   * </pre>
   *
   * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The virtualMachine.
   */
  @java.lang.Override
  public java.lang.String getVirtualMachine() {
    java.lang.Object ref = virtualMachine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      virtualMachine_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URI of the virtual machine resource
   * </pre>
   *
   * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for virtualMachine.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVirtualMachineBytes() {
    java.lang.Object ref = virtualMachine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      virtualMachine_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object ipAddress_;
  /**
   * <pre>
   * The IP address of the network interface to use for peering.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP address of the network interface to use for peering.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETWORK_INTERFACE_FIELD_NUMBER = 2;
  private volatile java.lang.Object networkInterface_;
  /**
   * <code>string network_interface = 2 [deprecated = true];</code>
   * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
   *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
   * @return The networkInterface.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getNetworkInterface() {
    java.lang.Object ref = networkInterface_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      networkInterface_ = s;
      return s;
    }
  }
  /**
   * <code>string network_interface = 2 [deprecated = true];</code>
   * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
   *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
   * @return The bytes for networkInterface.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getNetworkInterfaceBytes() {
    java.lang.Object ref = networkInterface_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      networkInterface_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtualMachine_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, virtualMachine_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(networkInterface_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, networkInterface_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtualMachine_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, virtualMachine_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(networkInterface_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, networkInterface_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipAddress_);
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
    if (!(obj instanceof com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)) {
      return super.equals(obj);
    }
    com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance other = (com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance) obj;

    if (!getVirtualMachine()
        .equals(other.getVirtualMachine())) return false;
    if (!getIpAddress()
        .equals(other.getIpAddress())) return false;
    if (!getNetworkInterface()
        .equals(other.getNetworkInterface())) return false;
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
    hash = (37 * hash) + VIRTUAL_MACHINE_FIELD_NUMBER;
    hash = (53 * hash) + getVirtualMachine().hashCode();
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + NETWORK_INTERFACE_FIELD_NUMBER;
    hash = (53 * hash) + getNetworkInterface().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance prototype) {
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
   * RouterAppliance represents a Router appliance which is specified by a VM URI
   * and a NIC address.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)
      com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networkconnectivity.v1alpha1.HubProto.internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkconnectivity.v1alpha1.HubProto.internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.class, com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.Builder.class);
    }

    // Construct using com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.newBuilder()
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
      virtualMachine_ = "";

      ipAddress_ = "";

      networkInterface_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networkconnectivity.v1alpha1.HubProto.internal_static_google_cloud_networkconnectivity_v1alpha1_RouterApplianceInstance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance getDefaultInstanceForType() {
      return com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance build() {
      com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance buildPartial() {
      com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance result = new com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance(this);
      result.virtualMachine_ = virtualMachine_;
      result.ipAddress_ = ipAddress_;
      result.networkInterface_ = networkInterface_;
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
      if (other instanceof com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance) {
        return mergeFrom((com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance other) {
      if (other == com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.getDefaultInstance()) return this;
      if (!other.getVirtualMachine().isEmpty()) {
        virtualMachine_ = other.virtualMachine_;
        onChanged();
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
      }
      if (!other.getNetworkInterface().isEmpty()) {
        networkInterface_ = other.networkInterface_;
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
      com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object virtualMachine_ = "";
    /**
     * <pre>
     * The URI of the virtual machine resource
     * </pre>
     *
     * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The virtualMachine.
     */
    public java.lang.String getVirtualMachine() {
      java.lang.Object ref = virtualMachine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        virtualMachine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URI of the virtual machine resource
     * </pre>
     *
     * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for virtualMachine.
     */
    public com.google.protobuf.ByteString
        getVirtualMachineBytes() {
      java.lang.Object ref = virtualMachine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        virtualMachine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URI of the virtual machine resource
     * </pre>
     *
     * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The virtualMachine to set.
     * @return This builder for chaining.
     */
    public Builder setVirtualMachine(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      virtualMachine_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI of the virtual machine resource
     * </pre>
     *
     * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtualMachine() {
      
      virtualMachine_ = getDefaultInstance().getVirtualMachine();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI of the virtual machine resource
     * </pre>
     *
     * <code>string virtual_machine = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for virtualMachine to set.
     * @return This builder for chaining.
     */
    public Builder setVirtualMachineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      virtualMachine_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <pre>
     * The IP address of the network interface to use for peering.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The IP address of the network interface to use for peering.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP address of the network interface to use for peering.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address of the network interface to use for peering.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address of the network interface to use for peering.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object networkInterface_ = "";
    /**
     * <code>string network_interface = 2 [deprecated = true];</code>
     * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
     *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
     * @return The networkInterface.
     */
    @java.lang.Deprecated public java.lang.String getNetworkInterface() {
      java.lang.Object ref = networkInterface_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        networkInterface_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string network_interface = 2 [deprecated = true];</code>
     * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
     *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
     * @return The bytes for networkInterface.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getNetworkInterfaceBytes() {
      java.lang.Object ref = networkInterface_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        networkInterface_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string network_interface = 2 [deprecated = true];</code>
     * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
     *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
     * @param value The networkInterface to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setNetworkInterface(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      networkInterface_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string network_interface = 2 [deprecated = true];</code>
     * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
     *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearNetworkInterface() {
      
      networkInterface_ = getDefaultInstance().getNetworkInterface();
      onChanged();
      return this;
    }
    /**
     * <code>string network_interface = 2 [deprecated = true];</code>
     * @deprecated google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance.network_interface is deprecated.
     *     See google/cloud/networkconnectivity/v1alpha1/hub.proto;l=533
     * @param value The bytes for networkInterface to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setNetworkInterfaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      networkInterface_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance)
  private static final com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance();
  }

  public static com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouterApplianceInstance>
      PARSER = new com.google.protobuf.AbstractParser<RouterApplianceInstance>() {
    @java.lang.Override
    public RouterApplianceInstance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouterApplianceInstance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouterApplianceInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouterApplianceInstance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

