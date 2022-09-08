// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Response message for
 * [KeyManagementService.GenerateRandomBytes][google.cloud.kms.v1.KeyManagementService.GenerateRandomBytes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.GenerateRandomBytesResponse}
 */
public final class GenerateRandomBytesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.GenerateRandomBytesResponse)
    GenerateRandomBytesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateRandomBytesResponse.newBuilder() to construct.
  private GenerateRandomBytesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateRandomBytesResponse() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateRandomBytesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenerateRandomBytesResponse(
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

            data_ = input.readBytes();
            break;
          }
          case 26: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (dataCrc32C_ != null) {
              subBuilder = dataCrc32C_.toBuilder();
            }
            dataCrc32C_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataCrc32C_);
              dataCrc32C_ = subBuilder.buildPartial();
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
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_GenerateRandomBytesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_GenerateRandomBytesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.GenerateRandomBytesResponse.class, com.google.cloud.kms.v1.GenerateRandomBytesResponse.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * The generated data.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int DATA_CRC32C_FIELD_NUMBER = 3;
  private com.google.protobuf.Int64Value dataCrc32C_;
  /**
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
   * An integrity check of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * can be performed by computing the CRC32C checksum of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
   * @return Whether the dataCrc32c field is set.
   */
  @java.lang.Override
  public boolean hasDataCrc32C() {
    return dataCrc32C_ != null;
  }
  /**
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
   * An integrity check of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * can be performed by computing the CRC32C checksum of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
   * @return The dataCrc32c.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getDataCrc32C() {
    return dataCrc32C_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : dataCrc32C_;
  }
  /**
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
   * An integrity check of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * can be performed by computing the CRC32C checksum of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getDataCrc32COrBuilder() {
    return getDataCrc32C();
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
    if (!data_.isEmpty()) {
      output.writeBytes(1, data_);
    }
    if (dataCrc32C_ != null) {
      output.writeMessage(3, getDataCrc32C());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, data_);
    }
    if (dataCrc32C_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDataCrc32C());
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
    if (!(obj instanceof com.google.cloud.kms.v1.GenerateRandomBytesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.GenerateRandomBytesResponse other = (com.google.cloud.kms.v1.GenerateRandomBytesResponse) obj;

    if (!getData()
        .equals(other.getData())) return false;
    if (hasDataCrc32C() != other.hasDataCrc32C()) return false;
    if (hasDataCrc32C()) {
      if (!getDataCrc32C()
          .equals(other.getDataCrc32C())) return false;
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
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (hasDataCrc32C()) {
      hash = (37 * hash) + DATA_CRC32C_FIELD_NUMBER;
      hash = (53 * hash) + getDataCrc32C().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.kms.v1.GenerateRandomBytesResponse prototype) {
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
   * Response message for
   * [KeyManagementService.GenerateRandomBytes][google.cloud.kms.v1.KeyManagementService.GenerateRandomBytes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.GenerateRandomBytesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.GenerateRandomBytesResponse)
      com.google.cloud.kms.v1.GenerateRandomBytesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_GenerateRandomBytesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_GenerateRandomBytesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.GenerateRandomBytesResponse.class, com.google.cloud.kms.v1.GenerateRandomBytesResponse.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.GenerateRandomBytesResponse.newBuilder()
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
      data_ = com.google.protobuf.ByteString.EMPTY;

      if (dataCrc32CBuilder_ == null) {
        dataCrc32C_ = null;
      } else {
        dataCrc32C_ = null;
        dataCrc32CBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_GenerateRandomBytesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.GenerateRandomBytesResponse getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.GenerateRandomBytesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.GenerateRandomBytesResponse build() {
      com.google.cloud.kms.v1.GenerateRandomBytesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.GenerateRandomBytesResponse buildPartial() {
      com.google.cloud.kms.v1.GenerateRandomBytesResponse result = new com.google.cloud.kms.v1.GenerateRandomBytesResponse(this);
      result.data_ = data_;
      if (dataCrc32CBuilder_ == null) {
        result.dataCrc32C_ = dataCrc32C_;
      } else {
        result.dataCrc32C_ = dataCrc32CBuilder_.build();
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
      if (other instanceof com.google.cloud.kms.v1.GenerateRandomBytesResponse) {
        return mergeFrom((com.google.cloud.kms.v1.GenerateRandomBytesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.GenerateRandomBytesResponse other) {
      if (other == com.google.cloud.kms.v1.GenerateRandomBytesResponse.getDefaultInstance()) return this;
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.hasDataCrc32C()) {
        mergeDataCrc32C(other.getDataCrc32C());
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
      com.google.cloud.kms.v1.GenerateRandomBytesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.GenerateRandomBytesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The generated data.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * The generated data.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated data.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value dataCrc32C_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> dataCrc32CBuilder_;
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     * @return Whether the dataCrc32c field is set.
     */
    public boolean hasDataCrc32C() {
      return dataCrc32CBuilder_ != null || dataCrc32C_ != null;
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     * @return The dataCrc32c.
     */
    public com.google.protobuf.Int64Value getDataCrc32C() {
      if (dataCrc32CBuilder_ == null) {
        return dataCrc32C_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : dataCrc32C_;
      } else {
        return dataCrc32CBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    public Builder setDataCrc32C(com.google.protobuf.Int64Value value) {
      if (dataCrc32CBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataCrc32C_ = value;
        onChanged();
      } else {
        dataCrc32CBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    public Builder setDataCrc32C(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (dataCrc32CBuilder_ == null) {
        dataCrc32C_ = builderForValue.build();
        onChanged();
      } else {
        dataCrc32CBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    public Builder mergeDataCrc32C(com.google.protobuf.Int64Value value) {
      if (dataCrc32CBuilder_ == null) {
        if (dataCrc32C_ != null) {
          dataCrc32C_ =
            com.google.protobuf.Int64Value.newBuilder(dataCrc32C_).mergeFrom(value).buildPartial();
        } else {
          dataCrc32C_ = value;
        }
        onChanged();
      } else {
        dataCrc32CBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    public Builder clearDataCrc32C() {
      if (dataCrc32CBuilder_ == null) {
        dataCrc32C_ = null;
        onChanged();
      } else {
        dataCrc32C_ = null;
        dataCrc32CBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    public com.google.protobuf.Int64Value.Builder getDataCrc32CBuilder() {
      
      onChanged();
      return getDataCrc32CFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getDataCrc32COrBuilder() {
      if (dataCrc32CBuilder_ != null) {
        return dataCrc32CBuilder_.getMessageOrBuilder();
      } else {
        return dataCrc32C_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : dataCrc32C_;
      }
    }
    /**
     * <pre>
     * Integrity verification field. A CRC32C checksum of the returned
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
     * An integrity check of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * can be performed by computing the CRC32C checksum of
     * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
     * and comparing your results to this field. Discard the response in case of
     * non-matching checksum values, and perform a limited number of retries. A
     * persistent mismatch may indicate an issue in your computation of the CRC32C
     * checksum. Note: This field is defined as int64 for reasons of compatibility
     * across different languages. However, it is a non-negative integer, which
     * will never exceed 2^32-1, and can be safely downconverted to uint32 in
     * languages that support this type.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getDataCrc32CFieldBuilder() {
      if (dataCrc32CBuilder_ == null) {
        dataCrc32CBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getDataCrc32C(),
                getParentForChildren(),
                isClean());
        dataCrc32C_ = null;
      }
      return dataCrc32CBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.GenerateRandomBytesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.GenerateRandomBytesResponse)
  private static final com.google.cloud.kms.v1.GenerateRandomBytesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.GenerateRandomBytesResponse();
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateRandomBytesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateRandomBytesResponse>() {
    @java.lang.Override
    public GenerateRandomBytesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenerateRandomBytesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenerateRandomBytesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateRandomBytesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.GenerateRandomBytesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

