// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

/**
 * <pre>
 * The response of exclusivity artifacts validation result status.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.ValidateExclusivityResponse}
 */
public final class ValidateExclusivityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)
    ValidateExclusivityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidateExclusivityResponse.newBuilder() to construct.
  private ValidateExclusivityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidateExclusivityResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValidateExclusivityResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidateExclusivityResponse(
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
            com.google.rpc.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
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
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.class, com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.google.rpc.Status status_;
  /**
   * <pre>
   * The validation result.
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * The validation result.
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * The validation result.
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse other = (com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse prototype) {
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
   * The response of exclusivity artifacts validation result status.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.ValidateExclusivityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.class, com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse build() {
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse buildPartial() {
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse result = new com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse other) {
      if (other == com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder setStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.google.rpc.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * The validation result.
     * * `OK` means that exclusivity is validated, assuming the manifest produced
     *    by GenerateExclusivityManifest is successfully applied.
     * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
     *    another Hub. See `status.message` for more information.
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)
  private static final com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse();
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateExclusivityResponse>
      PARSER = new com.google.protobuf.AbstractParser<ValidateExclusivityResponse>() {
    @java.lang.Override
    public ValidateExclusivityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidateExclusivityResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidateExclusivityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateExclusivityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ValidateExclusivityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

