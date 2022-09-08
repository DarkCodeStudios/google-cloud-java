// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/baremetalsolution/v2/network.proto

package com.google.cloud.baremetalsolution.v2;

/**
 * <pre>
 * A reservation of one or more addresses in a network.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.NetworkAddressReservation}
 */
public final class NetworkAddressReservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.NetworkAddressReservation)
    NetworkAddressReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkAddressReservation.newBuilder() to construct.
  private NetworkAddressReservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkAddressReservation() {
    startAddress_ = "";
    endAddress_ = "";
    note_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworkAddressReservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NetworkAddressReservation(
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

            startAddress_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            endAddress_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            note_ = s;
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
    return com.google.cloud.baremetalsolution.v2.NetworkProto.internal_static_google_cloud_baremetalsolution_v2_NetworkAddressReservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.NetworkProto.internal_static_google_cloud_baremetalsolution_v2_NetworkAddressReservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.class, com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.Builder.class);
  }

  public static final int START_ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object startAddress_;
  /**
   * <pre>
   * The first address of this reservation block.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string start_address = 1;</code>
   * @return The startAddress.
   */
  @java.lang.Override
  public java.lang.String getStartAddress() {
    java.lang.Object ref = startAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The first address of this reservation block.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string start_address = 1;</code>
   * @return The bytes for startAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartAddressBytes() {
    java.lang.Object ref = startAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object endAddress_;
  /**
   * <pre>
   * The last address of this reservation block, inclusive. I.e., for cases when
   * reservations are only single addresses, end_address and start_address will
   * be the same.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string end_address = 2;</code>
   * @return The endAddress.
   */
  @java.lang.Override
  public java.lang.String getEndAddress() {
    java.lang.Object ref = endAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The last address of this reservation block, inclusive. I.e., for cases when
   * reservations are only single addresses, end_address and start_address will
   * be the same.
   * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
   * </pre>
   *
   * <code>string end_address = 2;</code>
   * @return The bytes for endAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndAddressBytes() {
    java.lang.Object ref = endAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTE_FIELD_NUMBER = 3;
  private volatile java.lang.Object note_;
  /**
   * <pre>
   * A note about this reservation, intended for human consumption.
   * </pre>
   *
   * <code>string note = 3;</code>
   * @return The note.
   */
  @java.lang.Override
  public java.lang.String getNote() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      note_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A note about this reservation, intended for human consumption.
   * </pre>
   *
   * <code>string note = 3;</code>
   * @return The bytes for note.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNoteBytes() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      note_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, startAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, endAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(note_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, note_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, startAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, endAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(note_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, note_);
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.NetworkAddressReservation)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.NetworkAddressReservation other = (com.google.cloud.baremetalsolution.v2.NetworkAddressReservation) obj;

    if (!getStartAddress()
        .equals(other.getStartAddress())) return false;
    if (!getEndAddress()
        .equals(other.getEndAddress())) return false;
    if (!getNote()
        .equals(other.getNote())) return false;
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
    hash = (37 * hash) + START_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getStartAddress().hashCode();
    hash = (37 * hash) + END_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getEndAddress().hashCode();
    hash = (37 * hash) + NOTE_FIELD_NUMBER;
    hash = (53 * hash) + getNote().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.baremetalsolution.v2.NetworkAddressReservation prototype) {
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
   * A reservation of one or more addresses in a network.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.NetworkAddressReservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.NetworkAddressReservation)
      com.google.cloud.baremetalsolution.v2.NetworkAddressReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto.internal_static_google_cloud_baremetalsolution_v2_NetworkAddressReservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto.internal_static_google_cloud_baremetalsolution_v2_NetworkAddressReservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.class, com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.newBuilder()
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
      startAddress_ = "";

      endAddress_ = "";

      note_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.NetworkProto.internal_static_google_cloud_baremetalsolution_v2_NetworkAddressReservation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.NetworkAddressReservation getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.NetworkAddressReservation build() {
      com.google.cloud.baremetalsolution.v2.NetworkAddressReservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.NetworkAddressReservation buildPartial() {
      com.google.cloud.baremetalsolution.v2.NetworkAddressReservation result = new com.google.cloud.baremetalsolution.v2.NetworkAddressReservation(this);
      result.startAddress_ = startAddress_;
      result.endAddress_ = endAddress_;
      result.note_ = note_;
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.NetworkAddressReservation) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.NetworkAddressReservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.NetworkAddressReservation other) {
      if (other == com.google.cloud.baremetalsolution.v2.NetworkAddressReservation.getDefaultInstance()) return this;
      if (!other.getStartAddress().isEmpty()) {
        startAddress_ = other.startAddress_;
        onChanged();
      }
      if (!other.getEndAddress().isEmpty()) {
        endAddress_ = other.endAddress_;
        onChanged();
      }
      if (!other.getNote().isEmpty()) {
        note_ = other.note_;
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
      com.google.cloud.baremetalsolution.v2.NetworkAddressReservation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.baremetalsolution.v2.NetworkAddressReservation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object startAddress_ = "";
    /**
     * <pre>
     * The first address of this reservation block.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string start_address = 1;</code>
     * @return The startAddress.
     */
    public java.lang.String getStartAddress() {
      java.lang.Object ref = startAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The first address of this reservation block.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string start_address = 1;</code>
     * @return The bytes for startAddress.
     */
    public com.google.protobuf.ByteString
        getStartAddressBytes() {
      java.lang.Object ref = startAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The first address of this reservation block.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string start_address = 1;</code>
     * @param value The startAddress to set.
     * @return This builder for chaining.
     */
    public Builder setStartAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The first address of this reservation block.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string start_address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartAddress() {
      
      startAddress_ = getDefaultInstance().getStartAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The first address of this reservation block.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string start_address = 1;</code>
     * @param value The bytes for startAddress to set.
     * @return This builder for chaining.
     */
    public Builder setStartAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endAddress_ = "";
    /**
     * <pre>
     * The last address of this reservation block, inclusive. I.e., for cases when
     * reservations are only single addresses, end_address and start_address will
     * be the same.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string end_address = 2;</code>
     * @return The endAddress.
     */
    public java.lang.String getEndAddress() {
      java.lang.Object ref = endAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The last address of this reservation block, inclusive. I.e., for cases when
     * reservations are only single addresses, end_address and start_address will
     * be the same.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string end_address = 2;</code>
     * @return The bytes for endAddress.
     */
    public com.google.protobuf.ByteString
        getEndAddressBytes() {
      java.lang.Object ref = endAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The last address of this reservation block, inclusive. I.e., for cases when
     * reservations are only single addresses, end_address and start_address will
     * be the same.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string end_address = 2;</code>
     * @param value The endAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEndAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The last address of this reservation block, inclusive. I.e., for cases when
     * reservations are only single addresses, end_address and start_address will
     * be the same.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string end_address = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndAddress() {
      
      endAddress_ = getDefaultInstance().getEndAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The last address of this reservation block, inclusive. I.e., for cases when
     * reservations are only single addresses, end_address and start_address will
     * be the same.
     * Must be specified as a single IPv4 address, e.g. 10.1.2.2.
     * </pre>
     *
     * <code>string end_address = 2;</code>
     * @param value The bytes for endAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEndAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endAddress_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object note_ = "";
    /**
     * <pre>
     * A note about this reservation, intended for human consumption.
     * </pre>
     *
     * <code>string note = 3;</code>
     * @return The note.
     */
    public java.lang.String getNote() {
      java.lang.Object ref = note_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        note_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A note about this reservation, intended for human consumption.
     * </pre>
     *
     * <code>string note = 3;</code>
     * @return The bytes for note.
     */
    public com.google.protobuf.ByteString
        getNoteBytes() {
      java.lang.Object ref = note_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        note_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A note about this reservation, intended for human consumption.
     * </pre>
     *
     * <code>string note = 3;</code>
     * @param value The note to set.
     * @return This builder for chaining.
     */
    public Builder setNote(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      note_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A note about this reservation, intended for human consumption.
     * </pre>
     *
     * <code>string note = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNote() {
      
      note_ = getDefaultInstance().getNote();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A note about this reservation, intended for human consumption.
     * </pre>
     *
     * <code>string note = 3;</code>
     * @param value The bytes for note to set.
     * @return This builder for chaining.
     */
    public Builder setNoteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      note_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.NetworkAddressReservation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.NetworkAddressReservation)
  private static final com.google.cloud.baremetalsolution.v2.NetworkAddressReservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.NetworkAddressReservation();
  }

  public static com.google.cloud.baremetalsolution.v2.NetworkAddressReservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkAddressReservation>
      PARSER = new com.google.protobuf.AbstractParser<NetworkAddressReservation>() {
    @java.lang.Override
    public NetworkAddressReservation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NetworkAddressReservation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetworkAddressReservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkAddressReservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.NetworkAddressReservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

