// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * MySQL database profile.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.MysqlProfile}
 */
public final class MysqlProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.MysqlProfile)
    MysqlProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MysqlProfile.newBuilder() to construct.
  private MysqlProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MysqlProfile() {
    hostname_ = "";
    username_ = "";
    password_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MysqlProfile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MysqlProfile(
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

            hostname_ = s;
            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            password_ = s;
            break;
          }
          case 42: {
            com.google.cloud.datastream.v1.MysqlSslConfig.Builder subBuilder = null;
            if (sslConfig_ != null) {
              subBuilder = sslConfig_.toBuilder();
            }
            sslConfig_ = input.readMessage(com.google.cloud.datastream.v1.MysqlSslConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sslConfig_);
              sslConfig_ = subBuilder.buildPartial();
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
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.MysqlProfile.class, com.google.cloud.datastream.v1.MysqlProfile.Builder.class);
  }

  public static final int HOSTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object hostname_;
  /**
   * <pre>
   * Required. Hostname for the MySQL connection.
   * </pre>
   *
   * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The hostname.
   */
  @java.lang.Override
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Hostname for the MySQL connection.
   * </pre>
   *
   * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for hostname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <pre>
   * Port for the MySQL connection, default value is 3306.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object username_;
  /**
   * <pre>
   * Required. Username for the MySQL connection.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Username for the MySQL connection.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 4;
  private volatile java.lang.Object password_;
  /**
   * <pre>
   * Required. Input only. Password for the MySQL connection.
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Input only. Password for the MySQL connection.
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSL_CONFIG_FIELD_NUMBER = 5;
  private com.google.cloud.datastream.v1.MysqlSslConfig sslConfig_;
  /**
   * <pre>
   * SSL configuration for the MySQL connection.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
   * @return Whether the sslConfig field is set.
   */
  @java.lang.Override
  public boolean hasSslConfig() {
    return sslConfig_ != null;
  }
  /**
   * <pre>
   * SSL configuration for the MySQL connection.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
   * @return The sslConfig.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlSslConfig getSslConfig() {
    return sslConfig_ == null ? com.google.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance() : sslConfig_;
  }
  /**
   * <pre>
   * SSL configuration for the MySQL connection.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlSslConfigOrBuilder getSslConfigOrBuilder() {
    return getSslConfig();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostname_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, password_);
    }
    if (sslConfig_ != null) {
      output.writeMessage(5, getSslConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostname_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, password_);
    }
    if (sslConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getSslConfig());
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
    if (!(obj instanceof com.google.cloud.datastream.v1.MysqlProfile)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.MysqlProfile other = (com.google.cloud.datastream.v1.MysqlProfile) obj;

    if (!getHostname()
        .equals(other.getHostname())) return false;
    if (getPort()
        != other.getPort()) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (hasSslConfig() != other.hasSslConfig()) return false;
    if (hasSslConfig()) {
      if (!getSslConfig()
          .equals(other.getSslConfig())) return false;
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
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    if (hasSslConfig()) {
      hash = (37 * hash) + SSL_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSslConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.MysqlProfile parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.MysqlProfile prototype) {
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
   * MySQL database profile.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.MysqlProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.MysqlProfile)
      com.google.cloud.datastream.v1.MysqlProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.MysqlProfile.class, com.google.cloud.datastream.v1.MysqlProfile.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.MysqlProfile.newBuilder()
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
      hostname_ = "";

      port_ = 0;

      username_ = "";

      password_ = "";

      if (sslConfigBuilder_ == null) {
        sslConfig_ = null;
      } else {
        sslConfig_ = null;
        sslConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_MysqlProfile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlProfile getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.MysqlProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlProfile build() {
      com.google.cloud.datastream.v1.MysqlProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.MysqlProfile buildPartial() {
      com.google.cloud.datastream.v1.MysqlProfile result = new com.google.cloud.datastream.v1.MysqlProfile(this);
      result.hostname_ = hostname_;
      result.port_ = port_;
      result.username_ = username_;
      result.password_ = password_;
      if (sslConfigBuilder_ == null) {
        result.sslConfig_ = sslConfig_;
      } else {
        result.sslConfig_ = sslConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1.MysqlProfile) {
        return mergeFrom((com.google.cloud.datastream.v1.MysqlProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.MysqlProfile other) {
      if (other == com.google.cloud.datastream.v1.MysqlProfile.getDefaultInstance()) return this;
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (other.hasSslConfig()) {
        mergeSslConfig(other.getSslConfig());
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
      com.google.cloud.datastream.v1.MysqlProfile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1.MysqlProfile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hostname_ = "";
    /**
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The hostname.
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for hostname.
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostname_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostname() {
      
      hostname_ = getDefaultInstance().getHostname();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostname_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * Port for the MySQL connection, default value is 3306.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * Port for the MySQL connection, default value is 3306.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Port for the MySQL connection, default value is 3306.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <pre>
     * Required. Input only. Password for the MySQL connection.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Input only. Password for the MySQL connection.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Input only. Password for the MySQL connection.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Input only. Password for the MySQL connection.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Input only. Password for the MySQL connection.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datastream.v1.MysqlSslConfig sslConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlSslConfig, com.google.cloud.datastream.v1.MysqlSslConfig.Builder, com.google.cloud.datastream.v1.MysqlSslConfigOrBuilder> sslConfigBuilder_;
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     * @return Whether the sslConfig field is set.
     */
    public boolean hasSslConfig() {
      return sslConfigBuilder_ != null || sslConfig_ != null;
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     * @return The sslConfig.
     */
    public com.google.cloud.datastream.v1.MysqlSslConfig getSslConfig() {
      if (sslConfigBuilder_ == null) {
        return sslConfig_ == null ? com.google.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance() : sslConfig_;
      } else {
        return sslConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder setSslConfig(com.google.cloud.datastream.v1.MysqlSslConfig value) {
      if (sslConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sslConfig_ = value;
        onChanged();
      } else {
        sslConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder setSslConfig(
        com.google.cloud.datastream.v1.MysqlSslConfig.Builder builderForValue) {
      if (sslConfigBuilder_ == null) {
        sslConfig_ = builderForValue.build();
        onChanged();
      } else {
        sslConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder mergeSslConfig(com.google.cloud.datastream.v1.MysqlSslConfig value) {
      if (sslConfigBuilder_ == null) {
        if (sslConfig_ != null) {
          sslConfig_ =
            com.google.cloud.datastream.v1.MysqlSslConfig.newBuilder(sslConfig_).mergeFrom(value).buildPartial();
        } else {
          sslConfig_ = value;
        }
        onChanged();
      } else {
        sslConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder clearSslConfig() {
      if (sslConfigBuilder_ == null) {
        sslConfig_ = null;
        onChanged();
      } else {
        sslConfig_ = null;
        sslConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public com.google.cloud.datastream.v1.MysqlSslConfig.Builder getSslConfigBuilder() {
      
      onChanged();
      return getSslConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public com.google.cloud.datastream.v1.MysqlSslConfigOrBuilder getSslConfigOrBuilder() {
      if (sslConfigBuilder_ != null) {
        return sslConfigBuilder_.getMessageOrBuilder();
      } else {
        return sslConfig_ == null ?
            com.google.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance() : sslConfig_;
      }
    }
    /**
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.MysqlSslConfig, com.google.cloud.datastream.v1.MysqlSslConfig.Builder, com.google.cloud.datastream.v1.MysqlSslConfigOrBuilder> 
        getSslConfigFieldBuilder() {
      if (sslConfigBuilder_ == null) {
        sslConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.MysqlSslConfig, com.google.cloud.datastream.v1.MysqlSslConfig.Builder, com.google.cloud.datastream.v1.MysqlSslConfigOrBuilder>(
                getSslConfig(),
                getParentForChildren(),
                isClean());
        sslConfig_ = null;
      }
      return sslConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.MysqlProfile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.MysqlProfile)
  private static final com.google.cloud.datastream.v1.MysqlProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.MysqlProfile();
  }

  public static com.google.cloud.datastream.v1.MysqlProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlProfile>
      PARSER = new com.google.protobuf.AbstractParser<MysqlProfile>() {
    @java.lang.Override
    public MysqlProfile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MysqlProfile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MysqlProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.MysqlProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

