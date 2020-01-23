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
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * A public key certificate format and data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.PublicKeyCertificate}
 */
public final class PublicKeyCertificate extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.PublicKeyCertificate)
    PublicKeyCertificateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PublicKeyCertificate.newBuilder() to construct.
  private PublicKeyCertificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PublicKeyCertificate() {
    format_ = 0;
    certificate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PublicKeyCertificate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PublicKeyCertificate(
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
          case 8:
            {
              int rawValue = input.readEnum();

              format_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              certificate_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.iot.v1.X509CertificateDetails.Builder subBuilder = null;
              if (x509Details_ != null) {
                subBuilder = x509Details_.toBuilder();
              }
              x509Details_ =
                  input.readMessage(
                      com.google.cloud.iot.v1.X509CertificateDetails.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(x509Details_);
                x509Details_ = subBuilder.buildPartial();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.PublicKeyCertificate.class,
            com.google.cloud.iot.v1.PublicKeyCertificate.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private int format_;
  /**
   *
   *
   * <pre>
   * The certificate format.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  public int getFormatValue() {
    return format_;
  }
  /**
   *
   *
   * <pre>
   * The certificate format.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
   *
   * @return The format.
   */
  public com.google.cloud.iot.v1.PublicKeyCertificateFormat getFormat() {
    @SuppressWarnings("deprecation")
    com.google.cloud.iot.v1.PublicKeyCertificateFormat result =
        com.google.cloud.iot.v1.PublicKeyCertificateFormat.valueOf(format_);
    return result == null
        ? com.google.cloud.iot.v1.PublicKeyCertificateFormat.UNRECOGNIZED
        : result;
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object certificate_;
  /**
   *
   *
   * <pre>
   * The certificate data.
   * </pre>
   *
   * <code>string certificate = 2;</code>
   *
   * @return The certificate.
   */
  public java.lang.String getCertificate() {
    java.lang.Object ref = certificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificate_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The certificate data.
   * </pre>
   *
   * <code>string certificate = 2;</code>
   *
   * @return The bytes for certificate.
   */
  public com.google.protobuf.ByteString getCertificateBytes() {
    java.lang.Object ref = certificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      certificate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int X509_DETAILS_FIELD_NUMBER = 3;
  private com.google.cloud.iot.v1.X509CertificateDetails x509Details_;
  /**
   *
   *
   * <pre>
   * [Output only] The certificate details. Used only for X.509 certificates.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
   *
   * @return Whether the x509Details field is set.
   */
  public boolean hasX509Details() {
    return x509Details_ != null;
  }
  /**
   *
   *
   * <pre>
   * [Output only] The certificate details. Used only for X.509 certificates.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
   *
   * @return The x509Details.
   */
  public com.google.cloud.iot.v1.X509CertificateDetails getX509Details() {
    return x509Details_ == null
        ? com.google.cloud.iot.v1.X509CertificateDetails.getDefaultInstance()
        : x509Details_;
  }
  /**
   *
   *
   * <pre>
   * [Output only] The certificate details. Used only for X.509 certificates.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
   */
  public com.google.cloud.iot.v1.X509CertificateDetailsOrBuilder getX509DetailsOrBuilder() {
    return getX509Details();
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
    if (format_
        != com.google.cloud.iot.v1.PublicKeyCertificateFormat
            .UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT
            .getNumber()) {
      output.writeEnum(1, format_);
    }
    if (!getCertificateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, certificate_);
    }
    if (x509Details_ != null) {
      output.writeMessage(3, getX509Details());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (format_
        != com.google.cloud.iot.v1.PublicKeyCertificateFormat
            .UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, format_);
    }
    if (!getCertificateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, certificate_);
    }
    if (x509Details_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getX509Details());
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
    if (!(obj instanceof com.google.cloud.iot.v1.PublicKeyCertificate)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.PublicKeyCertificate other =
        (com.google.cloud.iot.v1.PublicKeyCertificate) obj;

    if (format_ != other.format_) return false;
    if (!getCertificate().equals(other.getCertificate())) return false;
    if (hasX509Details() != other.hasX509Details()) return false;
    if (hasX509Details()) {
      if (!getX509Details().equals(other.getX509Details())) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getCertificate().hashCode();
    if (hasX509Details()) {
      hash = (37 * hash) + X509_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getX509Details().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.PublicKeyCertificate prototype) {
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
   * A public key certificate format and data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.PublicKeyCertificate}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.PublicKeyCertificate)
      com.google.cloud.iot.v1.PublicKeyCertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_PublicKeyCertificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.PublicKeyCertificate.class,
              com.google.cloud.iot.v1.PublicKeyCertificate.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.PublicKeyCertificate.newBuilder()
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
      format_ = 0;

      certificate_ = "";

      if (x509DetailsBuilder_ == null) {
        x509Details_ = null;
      } else {
        x509Details_ = null;
        x509DetailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_PublicKeyCertificate_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.PublicKeyCertificate getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.PublicKeyCertificate build() {
      com.google.cloud.iot.v1.PublicKeyCertificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.PublicKeyCertificate buildPartial() {
      com.google.cloud.iot.v1.PublicKeyCertificate result =
          new com.google.cloud.iot.v1.PublicKeyCertificate(this);
      result.format_ = format_;
      result.certificate_ = certificate_;
      if (x509DetailsBuilder_ == null) {
        result.x509Details_ = x509Details_;
      } else {
        result.x509Details_ = x509DetailsBuilder_.build();
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
      if (other instanceof com.google.cloud.iot.v1.PublicKeyCertificate) {
        return mergeFrom((com.google.cloud.iot.v1.PublicKeyCertificate) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.PublicKeyCertificate other) {
      if (other == com.google.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance()) return this;
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
      }
      if (!other.getCertificate().isEmpty()) {
        certificate_ = other.certificate_;
        onChanged();
      }
      if (other.hasX509Details()) {
        mergeX509Details(other.getX509Details());
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
      com.google.cloud.iot.v1.PublicKeyCertificate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.PublicKeyCertificate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int format_ = 0;
    /**
     *
     *
     * <pre>
     * The certificate format.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
     *
     * @return The enum numeric value on the wire for format.
     */
    public int getFormatValue() {
      return format_;
    }
    /**
     *
     *
     * <pre>
     * The certificate format.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
     *
     * @param value The enum numeric value on the wire for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The certificate format.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
     *
     * @return The format.
     */
    public com.google.cloud.iot.v1.PublicKeyCertificateFormat getFormat() {
      @SuppressWarnings("deprecation")
      com.google.cloud.iot.v1.PublicKeyCertificateFormat result =
          com.google.cloud.iot.v1.PublicKeyCertificateFormat.valueOf(format_);
      return result == null
          ? com.google.cloud.iot.v1.PublicKeyCertificateFormat.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The certificate format.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
     *
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(com.google.cloud.iot.v1.PublicKeyCertificateFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }

      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The certificate format.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyCertificateFormat format = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFormat() {

      format_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object certificate_ = "";
    /**
     *
     *
     * <pre>
     * The certificate data.
     * </pre>
     *
     * <code>string certificate = 2;</code>
     *
     * @return The certificate.
     */
    public java.lang.String getCertificate() {
      java.lang.Object ref = certificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The certificate data.
     * </pre>
     *
     * <code>string certificate = 2;</code>
     *
     * @return The bytes for certificate.
     */
    public com.google.protobuf.ByteString getCertificateBytes() {
      java.lang.Object ref = certificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        certificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The certificate data.
     * </pre>
     *
     * <code>string certificate = 2;</code>
     *
     * @param value The certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificate(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      certificate_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The certificate data.
     * </pre>
     *
     * <code>string certificate = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCertificate() {

      certificate_ = getDefaultInstance().getCertificate();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The certificate data.
     * </pre>
     *
     * <code>string certificate = 2;</code>
     *
     * @param value The bytes for certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      certificate_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.iot.v1.X509CertificateDetails x509Details_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.X509CertificateDetails,
            com.google.cloud.iot.v1.X509CertificateDetails.Builder,
            com.google.cloud.iot.v1.X509CertificateDetailsOrBuilder>
        x509DetailsBuilder_;
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     *
     * @return Whether the x509Details field is set.
     */
    public boolean hasX509Details() {
      return x509DetailsBuilder_ != null || x509Details_ != null;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     *
     * @return The x509Details.
     */
    public com.google.cloud.iot.v1.X509CertificateDetails getX509Details() {
      if (x509DetailsBuilder_ == null) {
        return x509Details_ == null
            ? com.google.cloud.iot.v1.X509CertificateDetails.getDefaultInstance()
            : x509Details_;
      } else {
        return x509DetailsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    public Builder setX509Details(com.google.cloud.iot.v1.X509CertificateDetails value) {
      if (x509DetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        x509Details_ = value;
        onChanged();
      } else {
        x509DetailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    public Builder setX509Details(
        com.google.cloud.iot.v1.X509CertificateDetails.Builder builderForValue) {
      if (x509DetailsBuilder_ == null) {
        x509Details_ = builderForValue.build();
        onChanged();
      } else {
        x509DetailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    public Builder mergeX509Details(com.google.cloud.iot.v1.X509CertificateDetails value) {
      if (x509DetailsBuilder_ == null) {
        if (x509Details_ != null) {
          x509Details_ =
              com.google.cloud.iot.v1.X509CertificateDetails.newBuilder(x509Details_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          x509Details_ = value;
        }
        onChanged();
      } else {
        x509DetailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    public Builder clearX509Details() {
      if (x509DetailsBuilder_ == null) {
        x509Details_ = null;
        onChanged();
      } else {
        x509Details_ = null;
        x509DetailsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    public com.google.cloud.iot.v1.X509CertificateDetails.Builder getX509DetailsBuilder() {

      onChanged();
      return getX509DetailsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    public com.google.cloud.iot.v1.X509CertificateDetailsOrBuilder getX509DetailsOrBuilder() {
      if (x509DetailsBuilder_ != null) {
        return x509DetailsBuilder_.getMessageOrBuilder();
      } else {
        return x509Details_ == null
            ? com.google.cloud.iot.v1.X509CertificateDetails.getDefaultInstance()
            : x509Details_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The certificate details. Used only for X.509 certificates.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.X509CertificateDetails x509_details = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.X509CertificateDetails,
            com.google.cloud.iot.v1.X509CertificateDetails.Builder,
            com.google.cloud.iot.v1.X509CertificateDetailsOrBuilder>
        getX509DetailsFieldBuilder() {
      if (x509DetailsBuilder_ == null) {
        x509DetailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.iot.v1.X509CertificateDetails,
                com.google.cloud.iot.v1.X509CertificateDetails.Builder,
                com.google.cloud.iot.v1.X509CertificateDetailsOrBuilder>(
                getX509Details(), getParentForChildren(), isClean());
        x509Details_ = null;
      }
      return x509DetailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.PublicKeyCertificate)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.PublicKeyCertificate)
  private static final com.google.cloud.iot.v1.PublicKeyCertificate DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.PublicKeyCertificate();
  }

  public static com.google.cloud.iot.v1.PublicKeyCertificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKeyCertificate> PARSER =
      new com.google.protobuf.AbstractParser<PublicKeyCertificate>() {
        @java.lang.Override
        public PublicKeyCertificate parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PublicKeyCertificate(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PublicKeyCertificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKeyCertificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.PublicKeyCertificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
