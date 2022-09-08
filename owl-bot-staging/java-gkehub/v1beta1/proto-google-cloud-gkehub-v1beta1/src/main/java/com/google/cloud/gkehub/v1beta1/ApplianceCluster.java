// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

/**
 * <pre>
 * ApplianceCluster contains information specific to GDC Edge Appliance
 * Clusters.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.ApplianceCluster}
 */
public final class ApplianceCluster extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.ApplianceCluster)
    ApplianceClusterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApplianceCluster.newBuilder() to construct.
  private ApplianceCluster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplianceCluster() {
    resourceLink_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApplianceCluster();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApplianceCluster(
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

            resourceLink_ = s;
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
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ApplianceCluster_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ApplianceCluster_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.ApplianceCluster.class, com.google.cloud.gkehub.v1beta1.ApplianceCluster.Builder.class);
  }

  public static final int RESOURCE_LINK_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceLink_;
  /**
   * <pre>
   * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
   * example:
   * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The resourceLink.
   */
  @java.lang.Override
  public java.lang.String getResourceLink() {
    java.lang.Object ref = resourceLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceLink_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
   * example:
   * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for resourceLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceLinkBytes() {
    java.lang.Object ref = resourceLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceLink_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceLink_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceLink_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.ApplianceCluster)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.ApplianceCluster other = (com.google.cloud.gkehub.v1beta1.ApplianceCluster) obj;

    if (!getResourceLink()
        .equals(other.getResourceLink())) return false;
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
    hash = (37 * hash) + RESOURCE_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getResourceLink().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1beta1.ApplianceCluster prototype) {
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
   * ApplianceCluster contains information specific to GDC Edge Appliance
   * Clusters.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.ApplianceCluster}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.ApplianceCluster)
      com.google.cloud.gkehub.v1beta1.ApplianceClusterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ApplianceCluster_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ApplianceCluster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.ApplianceCluster.class, com.google.cloud.gkehub.v1beta1.ApplianceCluster.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.ApplianceCluster.newBuilder()
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
      resourceLink_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass.internal_static_google_cloud_gkehub_v1beta1_ApplianceCluster_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ApplianceCluster getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.ApplianceCluster.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ApplianceCluster build() {
      com.google.cloud.gkehub.v1beta1.ApplianceCluster result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ApplianceCluster buildPartial() {
      com.google.cloud.gkehub.v1beta1.ApplianceCluster result = new com.google.cloud.gkehub.v1beta1.ApplianceCluster(this);
      result.resourceLink_ = resourceLink_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.ApplianceCluster) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.ApplianceCluster)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.ApplianceCluster other) {
      if (other == com.google.cloud.gkehub.v1beta1.ApplianceCluster.getDefaultInstance()) return this;
      if (!other.getResourceLink().isEmpty()) {
        resourceLink_ = other.resourceLink_;
        onChanged();
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
      com.google.cloud.gkehub.v1beta1.ApplianceCluster parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.v1beta1.ApplianceCluster) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceLink_ = "";
    /**
     * <pre>
     * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
     * example:
     * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The resourceLink.
     */
    public java.lang.String getResourceLink() {
      java.lang.Object ref = resourceLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
     * example:
     * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The bytes for resourceLink.
     */
    public com.google.protobuf.ByteString
        getResourceLinkBytes() {
      java.lang.Object ref = resourceLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
     * example:
     * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The resourceLink to set.
     * @return This builder for chaining.
     */
    public Builder setResourceLink(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceLink_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
     * example:
     * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceLink() {
      
      resourceLink_ = getDefaultInstance().getResourceLink();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. Self-link of the GCP resource for the Appliance Cluster. For
     * example:
     * //transferappliance.googleapis.com/projects/my-project/locations/us-west1-a/appliances/my-appliance
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for resourceLink to set.
     * @return This builder for chaining.
     */
    public Builder setResourceLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceLink_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.ApplianceCluster)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.ApplianceCluster)
  private static final com.google.cloud.gkehub.v1beta1.ApplianceCluster DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.ApplianceCluster();
  }

  public static com.google.cloud.gkehub.v1beta1.ApplianceCluster getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplianceCluster>
      PARSER = new com.google.protobuf.AbstractParser<ApplianceCluster>() {
    @java.lang.Override
    public ApplianceCluster parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApplianceCluster(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplianceCluster> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplianceCluster> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ApplianceCluster getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

