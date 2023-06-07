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
// source: google/cloud/binaryauthorization/v1beta1/resources.proto

package com.google.cloud.binaryauthorization.v1beta1;

/**
 *
 *
 * <pre>
 * An [admission allowlist pattern][google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern] exempts images
 * from checks by [admission rules][google.cloud.binaryauthorization.v1beta1.AdmissionRule].
 * </pre>
 *
 * Protobuf type {@code google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern}
 */
public final class AdmissionWhitelistPattern extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)
    AdmissionWhitelistPatternOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AdmissionWhitelistPattern.newBuilder() to construct.
  private AdmissionWhitelistPattern(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AdmissionWhitelistPattern() {
    namePattern_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AdmissionWhitelistPattern();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto
        .internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto
        .internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern.class,
            com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern.Builder.class);
  }

  public static final int NAME_PATTERN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object namePattern_ = "";
  /**
   *
   *
   * <pre>
   * An image name pattern to allowlist, in the form `registry/path/to/image`.
   * This supports a trailing `*` as a wildcard, but this is allowed only in
   * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
   * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
   * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
   * matches subdirectories, i.e., `gcr.io/nginx**` matches
   * `gcr.io/nginx/image`.
   * </pre>
   *
   * <code>string name_pattern = 1;</code>
   *
   * @return The namePattern.
   */
  @java.lang.Override
  public java.lang.String getNamePattern() {
    java.lang.Object ref = namePattern_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namePattern_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An image name pattern to allowlist, in the form `registry/path/to/image`.
   * This supports a trailing `*` as a wildcard, but this is allowed only in
   * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
   * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
   * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
   * matches subdirectories, i.e., `gcr.io/nginx**` matches
   * `gcr.io/nginx/image`.
   * </pre>
   *
   * <code>string name_pattern = 1;</code>
   *
   * @return The bytes for namePattern.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNamePatternBytes() {
    java.lang.Object ref = namePattern_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      namePattern_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namePattern_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namePattern_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namePattern_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namePattern_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)) {
      return super.equals(obj);
    }
    com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern other =
        (com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern) obj;

    if (!getNamePattern().equals(other.getNamePattern())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_PATTERN_FIELD_NUMBER;
    hash = (53 * hash) + getNamePattern().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern prototype) {
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
   * An [admission allowlist pattern][google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern] exempts images
   * from checks by [admission rules][google.cloud.binaryauthorization.v1beta1.AdmissionRule].
   * </pre>
   *
   * Protobuf type {@code google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)
      com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPatternOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto
          .internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto
          .internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern.class,
              com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern.Builder.class);
    }

    // Construct using
    // com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      namePattern_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto
          .internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
        getDefaultInstanceForType() {
      return com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern build() {
      com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern buildPartial() {
      com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern result =
          new com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.namePattern_ = namePattern_;
      }
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
      if (other instanceof com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern) {
        return mergeFrom(
            (com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern other) {
      if (other
          == com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
              .getDefaultInstance()) return this;
      if (!other.getNamePattern().isEmpty()) {
        namePattern_ = other.namePattern_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                namePattern_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object namePattern_ = "";
    /**
     *
     *
     * <pre>
     * An image name pattern to allowlist, in the form `registry/path/to/image`.
     * This supports a trailing `*` as a wildcard, but this is allowed only in
     * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
     * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
     * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
     * matches subdirectories, i.e., `gcr.io/nginx**` matches
     * `gcr.io/nginx/image`.
     * </pre>
     *
     * <code>string name_pattern = 1;</code>
     *
     * @return The namePattern.
     */
    public java.lang.String getNamePattern() {
      java.lang.Object ref = namePattern_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namePattern_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An image name pattern to allowlist, in the form `registry/path/to/image`.
     * This supports a trailing `*` as a wildcard, but this is allowed only in
     * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
     * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
     * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
     * matches subdirectories, i.e., `gcr.io/nginx**` matches
     * `gcr.io/nginx/image`.
     * </pre>
     *
     * <code>string name_pattern = 1;</code>
     *
     * @return The bytes for namePattern.
     */
    public com.google.protobuf.ByteString getNamePatternBytes() {
      java.lang.Object ref = namePattern_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namePattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An image name pattern to allowlist, in the form `registry/path/to/image`.
     * This supports a trailing `*` as a wildcard, but this is allowed only in
     * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
     * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
     * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
     * matches subdirectories, i.e., `gcr.io/nginx**` matches
     * `gcr.io/nginx/image`.
     * </pre>
     *
     * <code>string name_pattern = 1;</code>
     *
     * @param value The namePattern to set.
     * @return This builder for chaining.
     */
    public Builder setNamePattern(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      namePattern_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An image name pattern to allowlist, in the form `registry/path/to/image`.
     * This supports a trailing `*` as a wildcard, but this is allowed only in
     * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
     * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
     * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
     * matches subdirectories, i.e., `gcr.io/nginx**` matches
     * `gcr.io/nginx/image`.
     * </pre>
     *
     * <code>string name_pattern = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamePattern() {
      namePattern_ = getDefaultInstance().getNamePattern();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An image name pattern to allowlist, in the form `registry/path/to/image`.
     * This supports a trailing `*` as a wildcard, but this is allowed only in
     * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
     * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
     * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
     * matches subdirectories, i.e., `gcr.io/nginx**` matches
     * `gcr.io/nginx/image`.
     * </pre>
     *
     * <code>string name_pattern = 1;</code>
     *
     * @param value The bytes for namePattern to set.
     * @return This builder for chaining.
     */
    public Builder setNamePatternBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      namePattern_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)
  private static final com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern();
  }

  public static com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdmissionWhitelistPattern> PARSER =
      new com.google.protobuf.AbstractParser<AdmissionWhitelistPattern>() {
        @java.lang.Override
        public AdmissionWhitelistPattern parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<AdmissionWhitelistPattern> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdmissionWhitelistPattern> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
