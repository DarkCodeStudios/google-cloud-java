// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for InstanceGroupManagers.Get. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetInstanceGroupManagerRequest}
 */
public final class GetInstanceGroupManagerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetInstanceGroupManagerRequest)
    GetInstanceGroupManagerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetInstanceGroupManagerRequest.newBuilder() to construct.
  private GetInstanceGroupManagerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetInstanceGroupManagerRequest() {
    instanceGroupManager_ = "";
    project_ = "";
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetInstanceGroupManagerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetInstanceGroupManagerRequest(
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
          case 29957474: {
            java.lang.String s = input.readStringRequireUtf8();

            zone_ = s;
            break;
          }
          case 1820481738: {
            java.lang.String s = input.readStringRequireUtf8();

            project_ = s;
            break;
          }
          case 1994907162: {
            java.lang.String s = input.readStringRequireUtf8();

            instanceGroupManager_ = s;
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetInstanceGroupManagerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetInstanceGroupManagerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.class, com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.Builder.class);
  }

  public static final int INSTANCE_GROUP_MANAGER_FIELD_NUMBER = 249363395;
  private volatile java.lang.Object instanceGroupManager_;
  /**
   * <pre>
   * The name of the managed instance group.
   * </pre>
   *
   * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceGroupManager.
   */
  @java.lang.Override
  public java.lang.String getInstanceGroupManager() {
    java.lang.Object ref = instanceGroupManager_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceGroupManager_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the managed instance group.
   * </pre>
   *
   * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceGroupManager.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstanceGroupManagerBytes() {
    java.lang.Object ref = instanceGroupManager_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceGroupManager_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  private volatile java.lang.Object project_;
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 3744684;
  private volatile java.lang.Object zone_;
  /**
   * <pre>
   * The name of the zone where the managed instance group is located.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the zone where the managed instance group is located.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3744684, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceGroupManager_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 249363395, instanceGroupManager_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3744684, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceGroupManager_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(249363395, instanceGroupManager_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetInstanceGroupManagerRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetInstanceGroupManagerRequest other = (com.google.cloud.compute.v1.GetInstanceGroupManagerRequest) obj;

    if (!getInstanceGroupManager()
        .equals(other.getInstanceGroupManager())) return false;
    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getZone()
        .equals(other.getZone())) return false;
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
    hash = (37 * hash) + INSTANCE_GROUP_MANAGER_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceGroupManager().hashCode();
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.GetInstanceGroupManagerRequest prototype) {
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
   * A request message for InstanceGroupManagers.Get. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetInstanceGroupManagerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetInstanceGroupManagerRequest)
      com.google.cloud.compute.v1.GetInstanceGroupManagerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetInstanceGroupManagerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetInstanceGroupManagerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.class, com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.newBuilder()
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
      instanceGroupManager_ = "";

      project_ = "";

      zone_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetInstanceGroupManagerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetInstanceGroupManagerRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetInstanceGroupManagerRequest build() {
      com.google.cloud.compute.v1.GetInstanceGroupManagerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetInstanceGroupManagerRequest buildPartial() {
      com.google.cloud.compute.v1.GetInstanceGroupManagerRequest result = new com.google.cloud.compute.v1.GetInstanceGroupManagerRequest(this);
      result.instanceGroupManager_ = instanceGroupManager_;
      result.project_ = project_;
      result.zone_ = zone_;
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
      if (other instanceof com.google.cloud.compute.v1.GetInstanceGroupManagerRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetInstanceGroupManagerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetInstanceGroupManagerRequest other) {
      if (other == com.google.cloud.compute.v1.GetInstanceGroupManagerRequest.getDefaultInstance()) return this;
      if (!other.getInstanceGroupManager().isEmpty()) {
        instanceGroupManager_ = other.instanceGroupManager_;
        onChanged();
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
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
      com.google.cloud.compute.v1.GetInstanceGroupManagerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.GetInstanceGroupManagerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instanceGroupManager_ = "";
    /**
     * <pre>
     * The name of the managed instance group.
     * </pre>
     *
     * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The instanceGroupManager.
     */
    public java.lang.String getInstanceGroupManager() {
      java.lang.Object ref = instanceGroupManager_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceGroupManager_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the managed instance group.
     * </pre>
     *
     * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for instanceGroupManager.
     */
    public com.google.protobuf.ByteString
        getInstanceGroupManagerBytes() {
      java.lang.Object ref = instanceGroupManager_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceGroupManager_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the managed instance group.
     * </pre>
     *
     * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The instanceGroupManager to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceGroupManager(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceGroupManager_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the managed instance group.
     * </pre>
     *
     * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceGroupManager() {
      
      instanceGroupManager_ = getDefaultInstance().getInstanceGroupManager();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the managed instance group.
     * </pre>
     *
     * <code>string instance_group_manager = 249363395 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for instanceGroupManager to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceGroupManagerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceGroupManager_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      project_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      
      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      project_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * The name of the zone where the managed instance group is located.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the zone where the managed instance group is located.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the zone where the managed instance group is located.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the zone where the managed instance group is located.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      
      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the zone where the managed instance group is located.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zone_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetInstanceGroupManagerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetInstanceGroupManagerRequest)
  private static final com.google.cloud.compute.v1.GetInstanceGroupManagerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetInstanceGroupManagerRequest();
  }

  public static com.google.cloud.compute.v1.GetInstanceGroupManagerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetInstanceGroupManagerRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetInstanceGroupManagerRequest>() {
    @java.lang.Override
    public GetInstanceGroupManagerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetInstanceGroupManagerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetInstanceGroupManagerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetInstanceGroupManagerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetInstanceGroupManagerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

