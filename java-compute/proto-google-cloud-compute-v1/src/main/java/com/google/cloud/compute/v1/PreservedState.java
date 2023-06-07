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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Preserved state for a given instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.PreservedState}
 */
public final class PreservedState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.PreservedState)
    PreservedStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PreservedState.newBuilder() to construct.
  private PreservedState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PreservedState() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PreservedState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_PreservedState_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 95594102:
        return internalGetDisks();
      case 86866735:
        return internalGetMetadata();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_PreservedState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.PreservedState.class,
            com.google.cloud.compute.v1.PreservedState.Builder.class);
  }

  public static final int DISKS_FIELD_NUMBER = 95594102;

  private static final class DisksDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
                    newDefaultInstance(
                        com.google.cloud.compute.v1.Compute
                            .internal_static_google_cloud_compute_v1_PreservedState_DisksEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.cloud.compute.v1.PreservedStatePreservedDisk
                            .getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
      disks_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
      internalGetDisks() {
    if (disks_ == null) {
      return com.google.protobuf.MapField.emptyMapField(DisksDefaultEntryHolder.defaultEntry);
    }
    return disks_;
  }

  public int getDisksCount() {
    return internalGetDisks().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public boolean containsDisks(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetDisks().getMap().containsKey(key);
  }
  /** Use {@link #getDisksMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
      getDisks() {
    return getDisksMap();
  }
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
      getDisksMap() {
    return internalGetDisks().getMap();
  }
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.compute.v1.PreservedStatePreservedDisk getDisksOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.PreservedStatePreservedDisk defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk> map =
        internalGetDisks().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PreservedStatePreservedDisk getDisksOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk> map =
        internalGetDisks().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int METADATA_FIELD_NUMBER = 86866735;

  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.compute.v1.Compute
                .internal_static_google_cloud_compute_v1_PreservedState_MetadataEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }

  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public boolean containsMetadata(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Preserved metadata defined for this instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 86866735;</code>
   */
  @java.lang.Override
  public java.lang.String getMetadataOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetMetadata(), MetadataDefaultEntryHolder.defaultEntry, 86866735);
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetDisks(), DisksDefaultEntryHolder.defaultEntry, 95594102);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
          MetadataDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(86866735, metadata__);
    }
    for (java.util.Map.Entry<
            java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        entry : internalGetDisks().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
          disks__ =
              DisksDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(95594102, disks__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.PreservedState)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.PreservedState other =
        (com.google.cloud.compute.v1.PreservedState) obj;

    if (!internalGetDisks().equals(other.internalGetDisks())) return false;
    if (!internalGetMetadata().equals(other.internalGetMetadata())) return false;
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
    if (!internalGetDisks().getMap().isEmpty()) {
      hash = (37 * hash) + DISKS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDisks().hashCode();
    }
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreservedState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreservedState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.PreservedState parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.PreservedState prototype) {
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
   * Preserved state for a given instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.PreservedState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.PreservedState)
      com.google.cloud.compute.v1.PreservedStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PreservedState_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 95594102:
          return internalGetDisks();
        case 86866735:
          return internalGetMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 95594102:
          return internalGetMutableDisks();
        case 86866735:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PreservedState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.PreservedState.class,
              com.google.cloud.compute.v1.PreservedState.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.PreservedState.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableDisks().clear();
      internalGetMutableMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_PreservedState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedState getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.PreservedState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedState build() {
      com.google.cloud.compute.v1.PreservedState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedState buildPartial() {
      com.google.cloud.compute.v1.PreservedState result =
          new com.google.cloud.compute.v1.PreservedState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.PreservedState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disks_ = internalGetDisks();
        result.disks_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = internalGetMetadata();
        result.metadata_.makeImmutable();
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
      if (other instanceof com.google.cloud.compute.v1.PreservedState) {
        return mergeFrom((com.google.cloud.compute.v1.PreservedState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.PreservedState other) {
      if (other == com.google.cloud.compute.v1.PreservedState.getDefaultInstance()) return this;
      internalGetMutableDisks().mergeFrom(other.internalGetDisks());
      bitField0_ |= 0x00000001;
      internalGetMutableMetadata().mergeFrom(other.internalGetMetadata());
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
            case 694933882:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
                    input.readMessage(
                        MetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableMetadata()
                    .getMutableMap()
                    .put(metadata__.getKey(), metadata__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 694933882
            case 764752818:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
                    disks__ =
                        input.readMessage(
                            DisksDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableDisks().getMutableMap().put(disks__.getKey(), disks__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 764752818
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

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        disks_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        internalGetDisks() {
      if (disks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(DisksDefaultEntryHolder.defaultEntry);
      }
      return disks_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        internalGetMutableDisks() {
      if (disks_ == null) {
        disks_ = com.google.protobuf.MapField.newMapField(DisksDefaultEntryHolder.defaultEntry);
      }
      if (!disks_.isMutable()) {
        disks_ = disks_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return disks_;
    }

    public int getDisksCount() {
      return internalGetDisks().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    @java.lang.Override
    public boolean containsDisks(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetDisks().getMap().containsKey(key);
    }
    /** Use {@link #getDisksMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        getDisks() {
      return getDisksMap();
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        getDisksMap() {
      return internalGetDisks().getMap();
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.compute.v1.PreservedStatePreservedDisk getDisksOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.cloud.compute.v1.PreservedStatePreservedDisk defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk> map =
          internalGetDisks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.PreservedStatePreservedDisk getDisksOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk> map =
          internalGetDisks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearDisks() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableDisks().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    public Builder removeDisks(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableDisks().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
        getMutableDisks() {
      bitField0_ |= 0x00000001;
      return internalGetMutableDisks().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    public Builder putDisks(
        java.lang.String key, com.google.cloud.compute.v1.PreservedStatePreservedDisk value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableDisks().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preserved disks defined for this instance. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.compute.v1.PreservedStatePreservedDisk&gt; disks = 95594102;
     * </code>
     */
    public Builder putAllDisks(
        java.util.Map<java.lang.String, com.google.cloud.compute.v1.PreservedStatePreservedDisk>
            values) {
      internalGetMutableDisks().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMetadata() {
      if (metadata_ == null) {
        metadata_ =
            com.google.protobuf.MapField.newMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return metadata_;
    }

    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public boolean containsMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getMetadataMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getMetadataOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    @java.lang.Override
    public java.lang.String getMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableMetadata().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    public Builder removeMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableMetadata().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableMetadata() {
      bitField0_ |= 0x00000002;
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    public Builder putMetadata(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableMetadata().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Preserved metadata defined for this instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 86866735;</code>
     */
    public Builder putAllMetadata(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.PreservedState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.PreservedState)
  private static final com.google.cloud.compute.v1.PreservedState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.PreservedState();
  }

  public static com.google.cloud.compute.v1.PreservedState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreservedState> PARSER =
      new com.google.protobuf.AbstractParser<PreservedState>() {
        @java.lang.Override
        public PreservedState parsePartialFrom(
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

  public static com.google.protobuf.Parser<PreservedState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreservedState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.PreservedState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
