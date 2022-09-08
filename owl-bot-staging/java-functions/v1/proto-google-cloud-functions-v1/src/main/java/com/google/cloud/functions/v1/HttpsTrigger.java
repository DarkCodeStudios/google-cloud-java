// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

/**
 * <pre>
 * Describes HttpsTrigger, could be used to connect web hooks to function.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v1.HttpsTrigger}
 */
public final class HttpsTrigger extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v1.HttpsTrigger)
    HttpsTriggerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpsTrigger.newBuilder() to construct.
  private HttpsTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpsTrigger() {
    url_ = "";
    securityLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpsTrigger();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HttpsTrigger(
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

            url_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            securityLevel_ = rawValue;
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
    return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_HttpsTrigger_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_HttpsTrigger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v1.HttpsTrigger.class, com.google.cloud.functions.v1.HttpsTrigger.Builder.class);
  }

  /**
   * <pre>
   * Available security level settings.
   * This controls the methods to enforce security (HTTPS) on a URL.
   * If unspecified, SECURE_OPTIONAL will be used.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.functions.v1.HttpsTrigger.SecurityLevel}
   */
  public enum SecurityLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>SECURITY_LEVEL_UNSPECIFIED = 0;</code>
     */
    SECURITY_LEVEL_UNSPECIFIED(0),
    /**
     * <pre>
     * Requests for a URL that match this handler that do not use HTTPS are
     * automatically redirected to the HTTPS URL with the same path. Query
     * parameters are reserved for the redirect.
     * </pre>
     *
     * <code>SECURE_ALWAYS = 1;</code>
     */
    SECURE_ALWAYS(1),
    /**
     * <pre>
     * Both HTTP and HTTPS requests with URLs that match the handler succeed
     * without redirects. The application can examine the request to determine
     * which protocol was used and respond accordingly.
     * </pre>
     *
     * <code>SECURE_OPTIONAL = 2;</code>
     */
    SECURE_OPTIONAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>SECURITY_LEVEL_UNSPECIFIED = 0;</code>
     */
    public static final int SECURITY_LEVEL_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Requests for a URL that match this handler that do not use HTTPS are
     * automatically redirected to the HTTPS URL with the same path. Query
     * parameters are reserved for the redirect.
     * </pre>
     *
     * <code>SECURE_ALWAYS = 1;</code>
     */
    public static final int SECURE_ALWAYS_VALUE = 1;
    /**
     * <pre>
     * Both HTTP and HTTPS requests with URLs that match the handler succeed
     * without redirects. The application can examine the request to determine
     * which protocol was used and respond accordingly.
     * </pre>
     *
     * <code>SECURE_OPTIONAL = 2;</code>
     */
    public static final int SECURE_OPTIONAL_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SecurityLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SecurityLevel forNumber(int value) {
      switch (value) {
        case 0: return SECURITY_LEVEL_UNSPECIFIED;
        case 1: return SECURE_ALWAYS;
        case 2: return SECURE_OPTIONAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SecurityLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SecurityLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SecurityLevel>() {
            public SecurityLevel findValueByNumber(int number) {
              return SecurityLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.functions.v1.HttpsTrigger.getDescriptor().getEnumTypes().get(0);
    }

    private static final SecurityLevel[] VALUES = values();

    public static SecurityLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SecurityLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.functions.v1.HttpsTrigger.SecurityLevel)
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * Output only. The deployed url for the function.
   * </pre>
   *
   * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The deployed url for the function.
   * </pre>
   *
   * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_LEVEL_FIELD_NUMBER = 2;
  private int securityLevel_;
  /**
   * <pre>
   * The security level for the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
   * @return The enum numeric value on the wire for securityLevel.
   */
  @java.lang.Override public int getSecurityLevelValue() {
    return securityLevel_;
  }
  /**
   * <pre>
   * The security level for the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
   * @return The securityLevel.
   */
  @java.lang.Override public com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel getSecurityLevel() {
    @SuppressWarnings("deprecation")
    com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel result = com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel.valueOf(securityLevel_);
    return result == null ? com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (securityLevel_ != com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel.SECURITY_LEVEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, securityLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (securityLevel_ != com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel.SECURITY_LEVEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, securityLevel_);
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
    if (!(obj instanceof com.google.cloud.functions.v1.HttpsTrigger)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v1.HttpsTrigger other = (com.google.cloud.functions.v1.HttpsTrigger) obj;

    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (securityLevel_ != other.securityLevel_) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + SECURITY_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + securityLevel_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1.HttpsTrigger parseFrom(
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
  public static Builder newBuilder(com.google.cloud.functions.v1.HttpsTrigger prototype) {
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
   * Describes HttpsTrigger, could be used to connect web hooks to function.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v1.HttpsTrigger}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v1.HttpsTrigger)
      com.google.cloud.functions.v1.HttpsTriggerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_HttpsTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_HttpsTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v1.HttpsTrigger.class, com.google.cloud.functions.v1.HttpsTrigger.Builder.class);
    }

    // Construct using com.google.cloud.functions.v1.HttpsTrigger.newBuilder()
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
      url_ = "";

      securityLevel_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_HttpsTrigger_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.HttpsTrigger getDefaultInstanceForType() {
      return com.google.cloud.functions.v1.HttpsTrigger.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.HttpsTrigger build() {
      com.google.cloud.functions.v1.HttpsTrigger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.HttpsTrigger buildPartial() {
      com.google.cloud.functions.v1.HttpsTrigger result = new com.google.cloud.functions.v1.HttpsTrigger(this);
      result.url_ = url_;
      result.securityLevel_ = securityLevel_;
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
      if (other instanceof com.google.cloud.functions.v1.HttpsTrigger) {
        return mergeFrom((com.google.cloud.functions.v1.HttpsTrigger)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v1.HttpsTrigger other) {
      if (other == com.google.cloud.functions.v1.HttpsTrigger.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (other.securityLevel_ != 0) {
        setSecurityLevelValue(other.getSecurityLevelValue());
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
      com.google.cloud.functions.v1.HttpsTrigger parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.functions.v1.HttpsTrigger) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * Output only. The deployed url for the function.
     * </pre>
     *
     * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The deployed url for the function.
     * </pre>
     *
     * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The deployed url for the function.
     * </pre>
     *
     * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The deployed url for the function.
     * </pre>
     *
     * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The deployed url for the function.
     * </pre>
     *
     * <code>string url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private int securityLevel_ = 0;
    /**
     * <pre>
     * The security level for the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
     * @return The enum numeric value on the wire for securityLevel.
     */
    @java.lang.Override public int getSecurityLevelValue() {
      return securityLevel_;
    }
    /**
     * <pre>
     * The security level for the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
     * @param value The enum numeric value on the wire for securityLevel to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityLevelValue(int value) {
      
      securityLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The security level for the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
     * @return The securityLevel.
     */
    @java.lang.Override
    public com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel getSecurityLevel() {
      @SuppressWarnings("deprecation")
      com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel result = com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel.valueOf(securityLevel_);
      return result == null ? com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The security level for the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
     * @param value The securityLevel to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityLevel(com.google.cloud.functions.v1.HttpsTrigger.SecurityLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      securityLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The security level for the function.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.HttpsTrigger.SecurityLevel security_level = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityLevel() {
      
      securityLevel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v1.HttpsTrigger)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v1.HttpsTrigger)
  private static final com.google.cloud.functions.v1.HttpsTrigger DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v1.HttpsTrigger();
  }

  public static com.google.cloud.functions.v1.HttpsTrigger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpsTrigger>
      PARSER = new com.google.protobuf.AbstractParser<HttpsTrigger>() {
    @java.lang.Override
    public HttpsTrigger parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HttpsTrigger(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HttpsTrigger> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpsTrigger> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v1.HttpsTrigger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

