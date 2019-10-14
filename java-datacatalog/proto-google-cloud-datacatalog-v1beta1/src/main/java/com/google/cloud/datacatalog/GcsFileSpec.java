/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/datacatalog/v1beta1/gcs_fileset_spec.proto

package com.google.cloud.datacatalog;

/**
 *
 *
 * <pre>
 * Specifications of a single file in GCS.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.GcsFileSpec}
 */
public final class GcsFileSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.GcsFileSpec)
    GcsFileSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcsFileSpec.newBuilder() to construct.
  private GcsFileSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcsFileSpec() {
    filePath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GcsFileSpec(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              filePath_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.datacatalog.SystemTimestamps.Builder subBuilder = null;
              if (gcsTimestamps_ != null) {
                subBuilder = gcsTimestamps_.toBuilder();
              }
              gcsTimestamps_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.SystemTimestamps.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gcsTimestamps_);
                gcsTimestamps_ = subBuilder.buildPartial();
              }

              break;
            }
          case 32:
            {
              sizeBytes_ = input.readInt64();
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
    return com.google.cloud.datacatalog.GcsFilesetSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1beta1_GcsFileSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.GcsFilesetSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1beta1_GcsFileSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.GcsFileSpec.class,
            com.google.cloud.datacatalog.GcsFileSpec.Builder.class);
  }

  public static final int FILE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object filePath_;
  /**
   *
   *
   * <pre>
   * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
   * </pre>
   *
   * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
   * </pre>
   *
   * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_TIMESTAMPS_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.SystemTimestamps gcsTimestamps_;
  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the GCS file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public boolean hasGcsTimestamps() {
    return gcsTimestamps_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the GCS file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public com.google.cloud.datacatalog.SystemTimestamps getGcsTimestamps() {
    return gcsTimestamps_ == null
        ? com.google.cloud.datacatalog.SystemTimestamps.getDefaultInstance()
        : gcsTimestamps_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the GCS file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public com.google.cloud.datacatalog.SystemTimestampsOrBuilder getGcsTimestampsOrBuilder() {
    return getGcsTimestamps();
  }

  public static final int SIZE_BYTES_FIELD_NUMBER = 4;
  private long sizeBytes_;
  /**
   *
   *
   * <pre>
   * Output only. The size of the file, in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public long getSizeBytes() {
    return sizeBytes_;
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
    if (!getFilePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePath_);
    }
    if (gcsTimestamps_ != null) {
      output.writeMessage(2, getGcsTimestamps());
    }
    if (sizeBytes_ != 0L) {
      output.writeInt64(4, sizeBytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFilePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePath_);
    }
    if (gcsTimestamps_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGcsTimestamps());
    }
    if (sizeBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, sizeBytes_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.GcsFileSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.GcsFileSpec other = (com.google.cloud.datacatalog.GcsFileSpec) obj;

    if (!getFilePath().equals(other.getFilePath())) return false;
    if (hasGcsTimestamps() != other.hasGcsTimestamps()) return false;
    if (hasGcsTimestamps()) {
      if (!getGcsTimestamps().equals(other.getGcsTimestamps())) return false;
    }
    if (getSizeBytes() != other.getSizeBytes()) return false;
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
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    if (hasGcsTimestamps()) {
      hash = (37 * hash) + GCS_TIMESTAMPS_FIELD_NUMBER;
      hash = (53 * hash) + getGcsTimestamps().hashCode();
    }
    hash = (37 * hash) + SIZE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSizeBytes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.GcsFileSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.GcsFileSpec prototype) {
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
   * Specifications of a single file in GCS.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.GcsFileSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.GcsFileSpec)
      com.google.cloud.datacatalog.GcsFileSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.GcsFilesetSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1beta1_GcsFileSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.GcsFilesetSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1beta1_GcsFileSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.GcsFileSpec.class,
              com.google.cloud.datacatalog.GcsFileSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.GcsFileSpec.newBuilder()
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
      filePath_ = "";

      if (gcsTimestampsBuilder_ == null) {
        gcsTimestamps_ = null;
      } else {
        gcsTimestamps_ = null;
        gcsTimestampsBuilder_ = null;
      }
      sizeBytes_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.GcsFilesetSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1beta1_GcsFileSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.GcsFileSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.GcsFileSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.GcsFileSpec build() {
      com.google.cloud.datacatalog.GcsFileSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.GcsFileSpec buildPartial() {
      com.google.cloud.datacatalog.GcsFileSpec result =
          new com.google.cloud.datacatalog.GcsFileSpec(this);
      result.filePath_ = filePath_;
      if (gcsTimestampsBuilder_ == null) {
        result.gcsTimestamps_ = gcsTimestamps_;
      } else {
        result.gcsTimestamps_ = gcsTimestampsBuilder_.build();
      }
      result.sizeBytes_ = sizeBytes_;
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
      if (other instanceof com.google.cloud.datacatalog.GcsFileSpec) {
        return mergeFrom((com.google.cloud.datacatalog.GcsFileSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.GcsFileSpec other) {
      if (other == com.google.cloud.datacatalog.GcsFileSpec.getDefaultInstance()) return this;
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        onChanged();
      }
      if (other.hasGcsTimestamps()) {
        mergeGcsTimestamps(other.getGcsTimestamps());
      }
      if (other.getSizeBytes() != 0L) {
        setSizeBytes(other.getSizeBytes());
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
      com.google.cloud.datacatalog.GcsFileSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.GcsFileSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object filePath_ = "";
    /**
     *
     *
     * <pre>
     * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFilePath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filePath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFilePath() {

      filePath_ = getDefaultInstance().getFilePath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
     * </pre>
     *
     * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFilePathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filePath_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.SystemTimestamps gcsTimestamps_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.SystemTimestamps,
            com.google.cloud.datacatalog.SystemTimestamps.Builder,
            com.google.cloud.datacatalog.SystemTimestampsOrBuilder>
        gcsTimestampsBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public boolean hasGcsTimestamps() {
      return gcsTimestampsBuilder_ != null || gcsTimestamps_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.SystemTimestamps getGcsTimestamps() {
      if (gcsTimestampsBuilder_ == null) {
        return gcsTimestamps_ == null
            ? com.google.cloud.datacatalog.SystemTimestamps.getDefaultInstance()
            : gcsTimestamps_;
      } else {
        return gcsTimestampsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setGcsTimestamps(com.google.cloud.datacatalog.SystemTimestamps value) {
      if (gcsTimestampsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsTimestamps_ = value;
        onChanged();
      } else {
        gcsTimestampsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setGcsTimestamps(
        com.google.cloud.datacatalog.SystemTimestamps.Builder builderForValue) {
      if (gcsTimestampsBuilder_ == null) {
        gcsTimestamps_ = builderForValue.build();
        onChanged();
      } else {
        gcsTimestampsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeGcsTimestamps(com.google.cloud.datacatalog.SystemTimestamps value) {
      if (gcsTimestampsBuilder_ == null) {
        if (gcsTimestamps_ != null) {
          gcsTimestamps_ =
              com.google.cloud.datacatalog.SystemTimestamps.newBuilder(gcsTimestamps_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gcsTimestamps_ = value;
        }
        onChanged();
      } else {
        gcsTimestampsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearGcsTimestamps() {
      if (gcsTimestampsBuilder_ == null) {
        gcsTimestamps_ = null;
        onChanged();
      } else {
        gcsTimestamps_ = null;
        gcsTimestampsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.SystemTimestamps.Builder getGcsTimestampsBuilder() {

      onChanged();
      return getGcsTimestampsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.SystemTimestampsOrBuilder getGcsTimestampsOrBuilder() {
      if (gcsTimestampsBuilder_ != null) {
        return gcsTimestampsBuilder_.getMessageOrBuilder();
      } else {
        return gcsTimestamps_ == null
            ? com.google.cloud.datacatalog.SystemTimestamps.getDefaultInstance()
            : gcsTimestamps_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Timestamps about the GCS file.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.SystemTimestamps,
            com.google.cloud.datacatalog.SystemTimestamps.Builder,
            com.google.cloud.datacatalog.SystemTimestampsOrBuilder>
        getGcsTimestampsFieldBuilder() {
      if (gcsTimestampsBuilder_ == null) {
        gcsTimestampsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.SystemTimestamps,
                com.google.cloud.datacatalog.SystemTimestamps.Builder,
                com.google.cloud.datacatalog.SystemTimestampsOrBuilder>(
                getGcsTimestamps(), getParentForChildren(), isClean());
        gcsTimestamps_ = null;
      }
      return gcsTimestampsBuilder_;
    }

    private long sizeBytes_;
    /**
     *
     *
     * <pre>
     * Output only. The size of the file, in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public long getSizeBytes() {
      return sizeBytes_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The size of the file, in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setSizeBytes(long value) {

      sizeBytes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The size of the file, in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearSizeBytes() {

      sizeBytes_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.GcsFileSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.GcsFileSpec)
  private static final com.google.cloud.datacatalog.GcsFileSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.GcsFileSpec();
  }

  public static com.google.cloud.datacatalog.GcsFileSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsFileSpec> PARSER =
      new com.google.protobuf.AbstractParser<GcsFileSpec>() {
        @java.lang.Override
        public GcsFileSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GcsFileSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GcsFileSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsFileSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.GcsFileSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
