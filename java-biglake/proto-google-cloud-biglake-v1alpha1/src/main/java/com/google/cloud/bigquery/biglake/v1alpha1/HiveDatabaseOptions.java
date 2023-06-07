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
// source: google/cloud/bigquery/biglake/v1alpha1/metastore.proto

package com.google.cloud.bigquery.biglake.v1alpha1;

/**
 *
 *
 * <pre>
 * Options of a Hive database.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions}
 */
public final class HiveDatabaseOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions)
    HiveDatabaseOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HiveDatabaseOptions.newBuilder() to construct.
  private HiveDatabaseOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HiveDatabaseOptions() {
    locationUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HiveDatabaseOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1alpha1_HiveDatabaseOptions_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetParameters();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1alpha1_HiveDatabaseOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.class,
            com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.Builder.class);
  }

  public static final int LOCATION_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object locationUri_ = "";
  /**
   *
   *
   * <pre>
   * Cloud Storage folder URI where the database data is stored, starting with
   * "gs://".
   * </pre>
   *
   * <code>string location_uri = 1;</code>
   *
   * @return The locationUri.
   */
  @java.lang.Override
  public java.lang.String getLocationUri() {
    java.lang.Object ref = locationUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locationUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage folder URI where the database data is stored, starting with
   * "gs://".
   * </pre>
   *
   * <code>string location_uri = 1;</code>
   *
   * @return The bytes for locationUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationUriBytes() {
    java.lang.Object ref = locationUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      locationUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;

  private static final class ParametersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
                .internal_static_google_cloud_bigquery_biglake_v1alpha1_HiveDatabaseOptions_ParametersEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> parameters_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetParameters() {
    if (parameters_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ParametersDefaultEntryHolder.defaultEntry);
    }
    return parameters_;
  }

  public int getParametersCount() {
    return internalGetParameters().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  @java.lang.Override
  public boolean containsParameters(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetParameters().getMap().containsKey(key);
  }
  /** Use {@link #getParametersMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getParameters() {
    return getParametersMap();
  }
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
    return internalGetParameters().getMap();
  }
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getParametersOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locationUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, locationUri_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetParameters(), ParametersDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locationUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, locationUri_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetParameters().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> parameters__ =
          ParametersDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, parameters__);
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
    if (!(obj instanceof com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions other =
        (com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions) obj;

    if (!getLocationUri().equals(other.getLocationUri())) return false;
    if (!internalGetParameters().equals(other.internalGetParameters())) return false;
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
    hash = (37 * hash) + LOCATION_URI_FIELD_NUMBER;
    hash = (53 * hash) + getLocationUri().hashCode();
    if (!internalGetParameters().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions parseFrom(
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
      com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions prototype) {
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
   * Options of a Hive database.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions)
      com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_HiveDatabaseOptions_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetParameters();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableParameters();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_HiveDatabaseOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.class,
              com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      locationUri_ = "";
      internalGetMutableParameters().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_HiveDatabaseOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions build() {
      com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions buildPartial() {
      com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions result =
          new com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.locationUri_ = locationUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parameters_ = internalGetParameters();
        result.parameters_.makeImmutable();
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
      if (other instanceof com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions) {
        return mergeFrom((com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions other) {
      if (other
          == com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions.getDefaultInstance())
        return this;
      if (!other.getLocationUri().isEmpty()) {
        locationUri_ = other.locationUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableParameters().mergeFrom(other.internalGetParameters());
      bitField0_ |= 0x00000002;
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
                locationUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> parameters__ =
                    input.readMessage(
                        ParametersDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableParameters()
                    .getMutableMap()
                    .put(parameters__.getKey(), parameters__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object locationUri_ = "";
    /**
     *
     *
     * <pre>
     * Cloud Storage folder URI where the database data is stored, starting with
     * "gs://".
     * </pre>
     *
     * <code>string location_uri = 1;</code>
     *
     * @return The locationUri.
     */
    public java.lang.String getLocationUri() {
      java.lang.Object ref = locationUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locationUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage folder URI where the database data is stored, starting with
     * "gs://".
     * </pre>
     *
     * <code>string location_uri = 1;</code>
     *
     * @return The bytes for locationUri.
     */
    public com.google.protobuf.ByteString getLocationUriBytes() {
      java.lang.Object ref = locationUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        locationUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage folder URI where the database data is stored, starting with
     * "gs://".
     * </pre>
     *
     * <code>string location_uri = 1;</code>
     *
     * @param value The locationUri to set.
     * @return This builder for chaining.
     */
    public Builder setLocationUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      locationUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage folder URI where the database data is stored, starting with
     * "gs://".
     * </pre>
     *
     * <code>string location_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocationUri() {
      locationUri_ = getDefaultInstance().getLocationUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage folder URI where the database data is stored, starting with
     * "gs://".
     * </pre>
     *
     * <code>string location_uri = 1;</code>
     *
     * @param value The bytes for locationUri to set.
     * @return This builder for chaining.
     */
    public Builder setLocationUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      locationUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> parameters_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetParameters() {
      if (parameters_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParametersDefaultEntryHolder.defaultEntry);
      }
      return parameters_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableParameters() {
      if (parameters_ == null) {
        parameters_ =
            com.google.protobuf.MapField.newMapField(ParametersDefaultEntryHolder.defaultEntry);
      }
      if (!parameters_.isMutable()) {
        parameters_ = parameters_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return parameters_;
    }

    public int getParametersCount() {
      return internalGetParameters().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    @java.lang.Override
    public boolean containsParameters(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetParameters().getMap().containsKey(key);
    }
    /** Use {@link #getParametersMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
      return getParametersMap();
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
      return internalGetParameters().getMap();
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getParametersOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getParametersOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParameters() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableParameters().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    public Builder removeParameters(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableParameters().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableParameters() {
      bitField0_ |= 0x00000002;
      return internalGetMutableParameters().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    public Builder putParameters(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableParameters().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Stores user supplied Hive database parameters.
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 2;</code>
     */
    public Builder putAllParameters(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableParameters().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions)
  private static final com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions();
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HiveDatabaseOptions> PARSER =
      new com.google.protobuf.AbstractParser<HiveDatabaseOptions>() {
        @java.lang.Override
        public HiveDatabaseOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<HiveDatabaseOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HiveDatabaseOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.HiveDatabaseOptions
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
