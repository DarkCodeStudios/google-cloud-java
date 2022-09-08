// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/optimization/v1/fleet_routing.proto

package com.google.cloud.optimization.v1;

/**
 * <pre>
 * Encapsulates a location (a geographic point, and an optional heading).
 * </pre>
 *
 * Protobuf type {@code google.cloud.optimization.v1.Location}
 */
public final class Location extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.optimization.v1.Location)
    LocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Location() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Location();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Location(
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
          case 10: {
            com.google.type.LatLng.Builder subBuilder = null;
            if (latLng_ != null) {
              subBuilder = latLng_.toBuilder();
            }
            latLng_ = input.readMessage(com.google.type.LatLng.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(latLng_);
              latLng_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            heading_ = input.readInt32();
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
    return com.google.cloud.optimization.v1.FleetRoutingProto.internal_static_google_cloud_optimization_v1_Location_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.optimization.v1.FleetRoutingProto.internal_static_google_cloud_optimization_v1_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.optimization.v1.Location.class, com.google.cloud.optimization.v1.Location.Builder.class);
  }

  private int bitField0_;
  public static final int LAT_LNG_FIELD_NUMBER = 1;
  private com.google.type.LatLng latLng_;
  /**
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   * @return Whether the latLng field is set.
   */
  @java.lang.Override
  public boolean hasLatLng() {
    return latLng_ != null;
  }
  /**
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   * @return The latLng.
   */
  @java.lang.Override
  public com.google.type.LatLng getLatLng() {
    return latLng_ == null ? com.google.type.LatLng.getDefaultInstance() : latLng_;
  }
  /**
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getLatLngOrBuilder() {
    return getLatLng();
  }

  public static final int HEADING_FIELD_NUMBER = 2;
  private int heading_;
  /**
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc.
   * </pre>
   *
   * <code>optional int32 heading = 2;</code>
   * @return Whether the heading field is set.
   */
  @java.lang.Override
  public boolean hasHeading() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc.
   * </pre>
   *
   * <code>optional int32 heading = 2;</code>
   * @return The heading.
   */
  @java.lang.Override
  public int getHeading() {
    return heading_;
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
    if (latLng_ != null) {
      output.writeMessage(1, getLatLng());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(2, heading_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latLng_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLatLng());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, heading_);
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
    if (!(obj instanceof com.google.cloud.optimization.v1.Location)) {
      return super.equals(obj);
    }
    com.google.cloud.optimization.v1.Location other = (com.google.cloud.optimization.v1.Location) obj;

    if (hasLatLng() != other.hasLatLng()) return false;
    if (hasLatLng()) {
      if (!getLatLng()
          .equals(other.getLatLng())) return false;
    }
    if (hasHeading() != other.hasHeading()) return false;
    if (hasHeading()) {
      if (getHeading()
          != other.getHeading()) return false;
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
    if (hasLatLng()) {
      hash = (37 * hash) + LAT_LNG_FIELD_NUMBER;
      hash = (53 * hash) + getLatLng().hashCode();
    }
    if (hasHeading()) {
      hash = (37 * hash) + HEADING_FIELD_NUMBER;
      hash = (53 * hash) + getHeading();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.optimization.v1.Location parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.optimization.v1.Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.optimization.v1.Location parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.optimization.v1.Location parseFrom(
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
  public static Builder newBuilder(com.google.cloud.optimization.v1.Location prototype) {
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
   * Encapsulates a location (a geographic point, and an optional heading).
   * </pre>
   *
   * Protobuf type {@code google.cloud.optimization.v1.Location}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.optimization.v1.Location)
      com.google.cloud.optimization.v1.LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.optimization.v1.FleetRoutingProto.internal_static_google_cloud_optimization_v1_Location_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.optimization.v1.FleetRoutingProto.internal_static_google_cloud_optimization_v1_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.optimization.v1.Location.class, com.google.cloud.optimization.v1.Location.Builder.class);
    }

    // Construct using com.google.cloud.optimization.v1.Location.newBuilder()
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
      if (latLngBuilder_ == null) {
        latLng_ = null;
      } else {
        latLng_ = null;
        latLngBuilder_ = null;
      }
      heading_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.optimization.v1.FleetRoutingProto.internal_static_google_cloud_optimization_v1_Location_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.Location getDefaultInstanceForType() {
      return com.google.cloud.optimization.v1.Location.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.Location build() {
      com.google.cloud.optimization.v1.Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.Location buildPartial() {
      com.google.cloud.optimization.v1.Location result = new com.google.cloud.optimization.v1.Location(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (latLngBuilder_ == null) {
        result.latLng_ = latLng_;
      } else {
        result.latLng_ = latLngBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.heading_ = heading_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.optimization.v1.Location) {
        return mergeFrom((com.google.cloud.optimization.v1.Location)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.optimization.v1.Location other) {
      if (other == com.google.cloud.optimization.v1.Location.getDefaultInstance()) return this;
      if (other.hasLatLng()) {
        mergeLatLng(other.getLatLng());
      }
      if (other.hasHeading()) {
        setHeading(other.getHeading());
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
      com.google.cloud.optimization.v1.Location parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.optimization.v1.Location) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.type.LatLng latLng_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> latLngBuilder_;
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     * @return Whether the latLng field is set.
     */
    public boolean hasLatLng() {
      return latLngBuilder_ != null || latLng_ != null;
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     * @return The latLng.
     */
    public com.google.type.LatLng getLatLng() {
      if (latLngBuilder_ == null) {
        return latLng_ == null ? com.google.type.LatLng.getDefaultInstance() : latLng_;
      } else {
        return latLngBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder setLatLng(com.google.type.LatLng value) {
      if (latLngBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        latLng_ = value;
        onChanged();
      } else {
        latLngBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder setLatLng(
        com.google.type.LatLng.Builder builderForValue) {
      if (latLngBuilder_ == null) {
        latLng_ = builderForValue.build();
        onChanged();
      } else {
        latLngBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder mergeLatLng(com.google.type.LatLng value) {
      if (latLngBuilder_ == null) {
        if (latLng_ != null) {
          latLng_ =
            com.google.type.LatLng.newBuilder(latLng_).mergeFrom(value).buildPartial();
        } else {
          latLng_ = value;
        }
        onChanged();
      } else {
        latLngBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder clearLatLng() {
      if (latLngBuilder_ == null) {
        latLng_ = null;
        onChanged();
      } else {
        latLng_ = null;
        latLngBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public com.google.type.LatLng.Builder getLatLngBuilder() {
      
      onChanged();
      return getLatLngFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getLatLngOrBuilder() {
      if (latLngBuilder_ != null) {
        return latLngBuilder_.getMessageOrBuilder();
      } else {
        return latLng_ == null ?
            com.google.type.LatLng.getDefaultInstance() : latLng_;
      }
    }
    /**
     * <pre>
     * The waypoint's geographic coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> 
        getLatLngFieldBuilder() {
      if (latLngBuilder_ == null) {
        latLngBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>(
                getLatLng(),
                getParentForChildren(),
                isClean());
        latLng_ = null;
      }
      return latLngBuilder_;
    }

    private int heading_ ;
    /**
     * <pre>
     * The compass heading associated with the direction of the flow of traffic.
     * This value is used to specify the side of the road to use for pickup and
     * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
     * of due North, 90 specifies a heading of due East, etc.
     * </pre>
     *
     * <code>optional int32 heading = 2;</code>
     * @return Whether the heading field is set.
     */
    @java.lang.Override
    public boolean hasHeading() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The compass heading associated with the direction of the flow of traffic.
     * This value is used to specify the side of the road to use for pickup and
     * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
     * of due North, 90 specifies a heading of due East, etc.
     * </pre>
     *
     * <code>optional int32 heading = 2;</code>
     * @return The heading.
     */
    @java.lang.Override
    public int getHeading() {
      return heading_;
    }
    /**
     * <pre>
     * The compass heading associated with the direction of the flow of traffic.
     * This value is used to specify the side of the road to use for pickup and
     * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
     * of due North, 90 specifies a heading of due East, etc.
     * </pre>
     *
     * <code>optional int32 heading = 2;</code>
     * @param value The heading to set.
     * @return This builder for chaining.
     */
    public Builder setHeading(int value) {
      bitField0_ |= 0x00000001;
      heading_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compass heading associated with the direction of the flow of traffic.
     * This value is used to specify the side of the road to use for pickup and
     * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
     * of due North, 90 specifies a heading of due East, etc.
     * </pre>
     *
     * <code>optional int32 heading = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeading() {
      bitField0_ = (bitField0_ & ~0x00000001);
      heading_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.optimization.v1.Location)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.optimization.v1.Location)
  private static final com.google.cloud.optimization.v1.Location DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.optimization.v1.Location();
  }

  public static com.google.cloud.optimization.v1.Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location>
      PARSER = new com.google.protobuf.AbstractParser<Location>() {
    @java.lang.Override
    public Location parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Location(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.optimization.v1.Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

