// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeconnect/v1/tether.proto

package com.google.cloud.apigeeconnect.v1;

/**
 * <pre>
 * Payload for EgressRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeconnect.v1.Payload}
 */
public final class Payload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeconnect.v1.Payload)
    PayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Payload.newBuilder() to construct.
  private Payload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Payload() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Payload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Payload(
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
            com.google.cloud.apigeeconnect.v1.HttpRequest.Builder subBuilder = null;
            if (kindCase_ == 1) {
              subBuilder = ((com.google.cloud.apigeeconnect.v1.HttpRequest) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(com.google.cloud.apigeeconnect.v1.HttpRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.cloud.apigeeconnect.v1.HttpRequest) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 1;
            break;
          }
          case 18: {
            com.google.cloud.apigeeconnect.v1.StreamInfo.Builder subBuilder = null;
            if (kindCase_ == 2) {
              subBuilder = ((com.google.cloud.apigeeconnect.v1.StreamInfo) kind_).toBuilder();
            }
            kind_ =
                input.readMessage(com.google.cloud.apigeeconnect.v1.StreamInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.cloud.apigeeconnect.v1.StreamInfo) kind_);
              kind_ = subBuilder.buildPartial();
            }
            kindCase_ = 2;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            kindCase_ = 3;
            kind_ = rawValue;
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
    return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Payload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Payload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeconnect.v1.Payload.class, com.google.cloud.apigeeconnect.v1.Payload.Builder.class);
  }

  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HTTP_REQUEST(1),
    STREAM_INFO(2),
    ACTION(3),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return HTTP_REQUEST;
        case 2: return STREAM_INFO;
        case 3: return ACTION;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  public static final int HTTP_REQUEST_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The HttpRequest proto.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
   * @return Whether the httpRequest field is set.
   */
  @java.lang.Override
  public boolean hasHttpRequest() {
    return kindCase_ == 1;
  }
  /**
   * <pre>
   * The HttpRequest proto.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
   * @return The httpRequest.
   */
  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.HttpRequest getHttpRequest() {
    if (kindCase_ == 1) {
       return (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_;
    }
    return com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance();
  }
  /**
   * <pre>
   * The HttpRequest proto.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.HttpRequestOrBuilder getHttpRequestOrBuilder() {
    if (kindCase_ == 1) {
       return (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_;
    }
    return com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance();
  }

  public static final int STREAM_INFO_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The information of stream.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
   * @return Whether the streamInfo field is set.
   */
  @java.lang.Override
  public boolean hasStreamInfo() {
    return kindCase_ == 2;
  }
  /**
   * <pre>
   * The information of stream.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
   * @return The streamInfo.
   */
  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.StreamInfo getStreamInfo() {
    if (kindCase_ == 2) {
       return (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_;
    }
    return com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance();
  }
  /**
   * <pre>
   * The information of stream.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.StreamInfoOrBuilder getStreamInfoOrBuilder() {
    if (kindCase_ == 2) {
       return (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_;
    }
    return com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance();
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The action taken by agent.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
   * @return Whether the action field is set.
   */
  public boolean hasAction() {
    return kindCase_ == 3;
  }
  /**
   * <pre>
   * The action taken by agent.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
   * @return The enum numeric value on the wire for action.
   */
  public int getActionValue() {
    if (kindCase_ == 3) {
      return (java.lang.Integer) kind_;
    }
    return 0;
  }
  /**
   * <pre>
   * The action taken by agent.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
   * @return The action.
   */
  public com.google.cloud.apigeeconnect.v1.Action getAction() {
    if (kindCase_ == 3) {
      @SuppressWarnings("deprecation")
      com.google.cloud.apigeeconnect.v1.Action result = com.google.cloud.apigeeconnect.v1.Action.valueOf(
          (java.lang.Integer) kind_);
      return result == null ? com.google.cloud.apigeeconnect.v1.Action.UNRECOGNIZED : result;
    }
    return com.google.cloud.apigeeconnect.v1.Action.ACTION_UNSPECIFIED;
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
    if (kindCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_);
    }
    if (kindCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_);
    }
    if (kindCase_ == 3) {
      output.writeEnum(3, ((java.lang.Integer) kind_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_);
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_);
    }
    if (kindCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ((java.lang.Integer) kind_));
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
    if (!(obj instanceof com.google.cloud.apigeeconnect.v1.Payload)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeconnect.v1.Payload other = (com.google.cloud.apigeeconnect.v1.Payload) obj;

    if (!getKindCase().equals(other.getKindCase())) return false;
    switch (kindCase_) {
      case 1:
        if (!getHttpRequest()
            .equals(other.getHttpRequest())) return false;
        break;
      case 2:
        if (!getStreamInfo()
            .equals(other.getStreamInfo())) return false;
        break;
      case 3:
        if (getActionValue()
            != other.getActionValue()) return false;
        break;
      case 0:
      default:
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
    switch (kindCase_) {
      case 1:
        hash = (37 * hash) + HTTP_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getHttpRequest().hashCode();
        break;
      case 2:
        hash = (37 * hash) + STREAM_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getStreamInfo().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ACTION_FIELD_NUMBER;
        hash = (53 * hash) + getActionValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeconnect.v1.Payload parseFrom(
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
  public static Builder newBuilder(com.google.cloud.apigeeconnect.v1.Payload prototype) {
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
   * Payload for EgressRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeconnect.v1.Payload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeconnect.v1.Payload)
      com.google.cloud.apigeeconnect.v1.PayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Payload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Payload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeconnect.v1.Payload.class, com.google.cloud.apigeeconnect.v1.Payload.Builder.class);
    }

    // Construct using com.google.cloud.apigeeconnect.v1.Payload.newBuilder()
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
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Payload_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Payload getDefaultInstanceForType() {
      return com.google.cloud.apigeeconnect.v1.Payload.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Payload build() {
      com.google.cloud.apigeeconnect.v1.Payload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Payload buildPartial() {
      com.google.cloud.apigeeconnect.v1.Payload result = new com.google.cloud.apigeeconnect.v1.Payload(this);
      if (kindCase_ == 1) {
        if (httpRequestBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = httpRequestBuilder_.build();
        }
      }
      if (kindCase_ == 2) {
        if (streamInfoBuilder_ == null) {
          result.kind_ = kind_;
        } else {
          result.kind_ = streamInfoBuilder_.build();
        }
      }
      if (kindCase_ == 3) {
        result.kind_ = kind_;
      }
      result.kindCase_ = kindCase_;
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
      if (other instanceof com.google.cloud.apigeeconnect.v1.Payload) {
        return mergeFrom((com.google.cloud.apigeeconnect.v1.Payload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeconnect.v1.Payload other) {
      if (other == com.google.cloud.apigeeconnect.v1.Payload.getDefaultInstance()) return this;
      switch (other.getKindCase()) {
        case HTTP_REQUEST: {
          mergeHttpRequest(other.getHttpRequest());
          break;
        }
        case STREAM_INFO: {
          mergeStreamInfo(other.getStreamInfo());
          break;
        }
        case ACTION: {
          setActionValue(other.getActionValue());
          break;
        }
        case KIND_NOT_SET: {
          break;
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
      com.google.cloud.apigeeconnect.v1.Payload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.apigeeconnect.v1.Payload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int kindCase_ = 0;
    private java.lang.Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.forNumber(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeconnect.v1.HttpRequest, com.google.cloud.apigeeconnect.v1.HttpRequest.Builder, com.google.cloud.apigeeconnect.v1.HttpRequestOrBuilder> httpRequestBuilder_;
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     * @return Whether the httpRequest field is set.
     */
    @java.lang.Override
    public boolean hasHttpRequest() {
      return kindCase_ == 1;
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     * @return The httpRequest.
     */
    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.HttpRequest getHttpRequest() {
      if (httpRequestBuilder_ == null) {
        if (kindCase_ == 1) {
          return (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_;
        }
        return com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance();
      } else {
        if (kindCase_ == 1) {
          return httpRequestBuilder_.getMessage();
        }
        return com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    public Builder setHttpRequest(com.google.cloud.apigeeconnect.v1.HttpRequest value) {
      if (httpRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        httpRequestBuilder_.setMessage(value);
      }
      kindCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    public Builder setHttpRequest(
        com.google.cloud.apigeeconnect.v1.HttpRequest.Builder builderForValue) {
      if (httpRequestBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        httpRequestBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    public Builder mergeHttpRequest(com.google.cloud.apigeeconnect.v1.HttpRequest value) {
      if (httpRequestBuilder_ == null) {
        if (kindCase_ == 1 &&
            kind_ != com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance()) {
          kind_ = com.google.cloud.apigeeconnect.v1.HttpRequest.newBuilder((com.google.cloud.apigeeconnect.v1.HttpRequest) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 1) {
          httpRequestBuilder_.mergeFrom(value);
        } else {
          httpRequestBuilder_.setMessage(value);
        }
      }
      kindCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    public Builder clearHttpRequest() {
      if (httpRequestBuilder_ == null) {
        if (kindCase_ == 1) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 1) {
          kindCase_ = 0;
          kind_ = null;
        }
        httpRequestBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    public com.google.cloud.apigeeconnect.v1.HttpRequest.Builder getHttpRequestBuilder() {
      return getHttpRequestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.HttpRequestOrBuilder getHttpRequestOrBuilder() {
      if ((kindCase_ == 1) && (httpRequestBuilder_ != null)) {
        return httpRequestBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 1) {
          return (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_;
        }
        return com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The HttpRequest proto.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.HttpRequest http_request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeconnect.v1.HttpRequest, com.google.cloud.apigeeconnect.v1.HttpRequest.Builder, com.google.cloud.apigeeconnect.v1.HttpRequestOrBuilder> 
        getHttpRequestFieldBuilder() {
      if (httpRequestBuilder_ == null) {
        if (!(kindCase_ == 1)) {
          kind_ = com.google.cloud.apigeeconnect.v1.HttpRequest.getDefaultInstance();
        }
        httpRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeconnect.v1.HttpRequest, com.google.cloud.apigeeconnect.v1.HttpRequest.Builder, com.google.cloud.apigeeconnect.v1.HttpRequestOrBuilder>(
                (com.google.cloud.apigeeconnect.v1.HttpRequest) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 1;
      onChanged();;
      return httpRequestBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeconnect.v1.StreamInfo, com.google.cloud.apigeeconnect.v1.StreamInfo.Builder, com.google.cloud.apigeeconnect.v1.StreamInfoOrBuilder> streamInfoBuilder_;
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     * @return Whether the streamInfo field is set.
     */
    @java.lang.Override
    public boolean hasStreamInfo() {
      return kindCase_ == 2;
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     * @return The streamInfo.
     */
    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.StreamInfo getStreamInfo() {
      if (streamInfoBuilder_ == null) {
        if (kindCase_ == 2) {
          return (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_;
        }
        return com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance();
      } else {
        if (kindCase_ == 2) {
          return streamInfoBuilder_.getMessage();
        }
        return com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    public Builder setStreamInfo(com.google.cloud.apigeeconnect.v1.StreamInfo value) {
      if (streamInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        streamInfoBuilder_.setMessage(value);
      }
      kindCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    public Builder setStreamInfo(
        com.google.cloud.apigeeconnect.v1.StreamInfo.Builder builderForValue) {
      if (streamInfoBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        streamInfoBuilder_.setMessage(builderForValue.build());
      }
      kindCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    public Builder mergeStreamInfo(com.google.cloud.apigeeconnect.v1.StreamInfo value) {
      if (streamInfoBuilder_ == null) {
        if (kindCase_ == 2 &&
            kind_ != com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance()) {
          kind_ = com.google.cloud.apigeeconnect.v1.StreamInfo.newBuilder((com.google.cloud.apigeeconnect.v1.StreamInfo) kind_)
              .mergeFrom(value).buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        if (kindCase_ == 2) {
          streamInfoBuilder_.mergeFrom(value);
        } else {
          streamInfoBuilder_.setMessage(value);
        }
      }
      kindCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    public Builder clearStreamInfo() {
      if (streamInfoBuilder_ == null) {
        if (kindCase_ == 2) {
          kindCase_ = 0;
          kind_ = null;
          onChanged();
        }
      } else {
        if (kindCase_ == 2) {
          kindCase_ = 0;
          kind_ = null;
        }
        streamInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    public com.google.cloud.apigeeconnect.v1.StreamInfo.Builder getStreamInfoBuilder() {
      return getStreamInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.StreamInfoOrBuilder getStreamInfoOrBuilder() {
      if ((kindCase_ == 2) && (streamInfoBuilder_ != null)) {
        return streamInfoBuilder_.getMessageOrBuilder();
      } else {
        if (kindCase_ == 2) {
          return (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_;
        }
        return com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The information of stream.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.StreamInfo stream_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeconnect.v1.StreamInfo, com.google.cloud.apigeeconnect.v1.StreamInfo.Builder, com.google.cloud.apigeeconnect.v1.StreamInfoOrBuilder> 
        getStreamInfoFieldBuilder() {
      if (streamInfoBuilder_ == null) {
        if (!(kindCase_ == 2)) {
          kind_ = com.google.cloud.apigeeconnect.v1.StreamInfo.getDefaultInstance();
        }
        streamInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeconnect.v1.StreamInfo, com.google.cloud.apigeeconnect.v1.StreamInfo.Builder, com.google.cloud.apigeeconnect.v1.StreamInfoOrBuilder>(
                (com.google.cloud.apigeeconnect.v1.StreamInfo) kind_,
                getParentForChildren(),
                isClean());
        kind_ = null;
      }
      kindCase_ = 2;
      onChanged();;
      return streamInfoBuilder_;
    }

    /**
     * <pre>
     * The action taken by agent.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
     * @return Whether the action field is set.
     */
    @java.lang.Override
    public boolean hasAction() {
      return kindCase_ == 3;
    }
    /**
     * <pre>
     * The action taken by agent.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override
    public int getActionValue() {
      if (kindCase_ == 3) {
        return ((java.lang.Integer) kind_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * The action taken by agent.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      kindCase_ = 3;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action taken by agent.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
     * @return The action.
     */
    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Action getAction() {
      if (kindCase_ == 3) {
        @SuppressWarnings("deprecation")
        com.google.cloud.apigeeconnect.v1.Action result = com.google.cloud.apigeeconnect.v1.Action.valueOf(
            (java.lang.Integer) kind_);
        return result == null ? com.google.cloud.apigeeconnect.v1.Action.UNRECOGNIZED : result;
      }
      return com.google.cloud.apigeeconnect.v1.Action.ACTION_UNSPECIFIED;
    }
    /**
     * <pre>
     * The action taken by agent.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.google.cloud.apigeeconnect.v1.Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kindCase_ = 3;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action taken by agent.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Action action = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      if (kindCase_ == 3) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeconnect.v1.Payload)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeconnect.v1.Payload)
  private static final com.google.cloud.apigeeconnect.v1.Payload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeconnect.v1.Payload();
  }

  public static com.google.cloud.apigeeconnect.v1.Payload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Payload>
      PARSER = new com.google.protobuf.AbstractParser<Payload>() {
    @java.lang.Override
    public Payload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Payload(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Payload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Payload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.Payload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

