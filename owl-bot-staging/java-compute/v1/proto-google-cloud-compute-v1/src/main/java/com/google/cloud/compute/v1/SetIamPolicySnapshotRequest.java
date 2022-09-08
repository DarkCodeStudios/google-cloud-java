// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for Snapshots.SetIamPolicy. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SetIamPolicySnapshotRequest}
 */
public final class SetIamPolicySnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SetIamPolicySnapshotRequest)
    SetIamPolicySnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetIamPolicySnapshotRequest.newBuilder() to construct.
  private SetIamPolicySnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetIamPolicySnapshotRequest() {
    project_ = "";
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetIamPolicySnapshotRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetIamPolicySnapshotRequest(
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
          case 1566449778: {
            java.lang.String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case 1820481738: {
            java.lang.String s = input.readStringRequireUtf8();

            project_ = s;
            break;
          }
          case -1598579310: {
            com.google.cloud.compute.v1.GlobalSetPolicyRequest.Builder subBuilder = null;
            if (globalSetPolicyRequestResource_ != null) {
              subBuilder = globalSetPolicyRequestResource_.toBuilder();
            }
            globalSetPolicyRequestResource_ = input.readMessage(com.google.cloud.compute.v1.GlobalSetPolicyRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(globalSetPolicyRequestResource_);
              globalSetPolicyRequestResource_ = subBuilder.buildPartial();
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicySnapshotRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicySnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.class, com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.Builder.class);
  }

  public static final int GLOBAL_SET_POLICY_REQUEST_RESOURCE_FIELD_NUMBER = 337048498;
  private com.google.cloud.compute.v1.GlobalSetPolicyRequest globalSetPolicyRequestResource_;
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the globalSetPolicyRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasGlobalSetPolicyRequestResource() {
    return globalSetPolicyRequestResource_ != null;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The globalSetPolicyRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalSetPolicyRequest getGlobalSetPolicyRequestResource() {
    return globalSetPolicyRequestResource_ == null ? com.google.cloud.compute.v1.GlobalSetPolicyRequest.getDefaultInstance() : globalSetPolicyRequestResource_;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalSetPolicyRequestOrBuilder getGlobalSetPolicyRequestResourceOrBuilder() {
    return getGlobalSetPolicyRequestResource();
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

  public static final int RESOURCE_FIELD_NUMBER = 195806222;
  private volatile java.lang.Object resource_;
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (globalSetPolicyRequestResource_ != null) {
      output.writeMessage(337048498, getGlobalSetPolicyRequestResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (globalSetPolicyRequestResource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(337048498, getGlobalSetPolicyRequestResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.SetIamPolicySnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SetIamPolicySnapshotRequest other = (com.google.cloud.compute.v1.SetIamPolicySnapshotRequest) obj;

    if (hasGlobalSetPolicyRequestResource() != other.hasGlobalSetPolicyRequestResource()) return false;
    if (hasGlobalSetPolicyRequestResource()) {
      if (!getGlobalSetPolicyRequestResource()
          .equals(other.getGlobalSetPolicyRequestResource())) return false;
    }
    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getResource()
        .equals(other.getResource())) return false;
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
    if (hasGlobalSetPolicyRequestResource()) {
      hash = (37 * hash) + GLOBAL_SET_POLICY_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalSetPolicyRequestResource().hashCode();
    }
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SetIamPolicySnapshotRequest prototype) {
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
   * A request message for Snapshots.SetIamPolicy. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SetIamPolicySnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SetIamPolicySnapshotRequest)
      com.google.cloud.compute.v1.SetIamPolicySnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicySnapshotRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicySnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.class, com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.newBuilder()
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
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        globalSetPolicyRequestResource_ = null;
      } else {
        globalSetPolicyRequestResource_ = null;
        globalSetPolicyRequestResourceBuilder_ = null;
      }
      project_ = "";

      resource_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicySnapshotRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicySnapshotRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicySnapshotRequest build() {
      com.google.cloud.compute.v1.SetIamPolicySnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicySnapshotRequest buildPartial() {
      com.google.cloud.compute.v1.SetIamPolicySnapshotRequest result = new com.google.cloud.compute.v1.SetIamPolicySnapshotRequest(this);
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        result.globalSetPolicyRequestResource_ = globalSetPolicyRequestResource_;
      } else {
        result.globalSetPolicyRequestResource_ = globalSetPolicyRequestResourceBuilder_.build();
      }
      result.project_ = project_;
      result.resource_ = resource_;
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
      if (other instanceof com.google.cloud.compute.v1.SetIamPolicySnapshotRequest) {
        return mergeFrom((com.google.cloud.compute.v1.SetIamPolicySnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SetIamPolicySnapshotRequest other) {
      if (other == com.google.cloud.compute.v1.SetIamPolicySnapshotRequest.getDefaultInstance()) return this;
      if (other.hasGlobalSetPolicyRequestResource()) {
        mergeGlobalSetPolicyRequestResource(other.getGlobalSetPolicyRequestResource());
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
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
      com.google.cloud.compute.v1.SetIamPolicySnapshotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.SetIamPolicySnapshotRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.compute.v1.GlobalSetPolicyRequest globalSetPolicyRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.GlobalSetPolicyRequest, com.google.cloud.compute.v1.GlobalSetPolicyRequest.Builder, com.google.cloud.compute.v1.GlobalSetPolicyRequestOrBuilder> globalSetPolicyRequestResourceBuilder_;
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the globalSetPolicyRequestResource field is set.
     */
    public boolean hasGlobalSetPolicyRequestResource() {
      return globalSetPolicyRequestResourceBuilder_ != null || globalSetPolicyRequestResource_ != null;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The globalSetPolicyRequestResource.
     */
    public com.google.cloud.compute.v1.GlobalSetPolicyRequest getGlobalSetPolicyRequestResource() {
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        return globalSetPolicyRequestResource_ == null ? com.google.cloud.compute.v1.GlobalSetPolicyRequest.getDefaultInstance() : globalSetPolicyRequestResource_;
      } else {
        return globalSetPolicyRequestResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGlobalSetPolicyRequestResource(com.google.cloud.compute.v1.GlobalSetPolicyRequest value) {
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        globalSetPolicyRequestResource_ = value;
        onChanged();
      } else {
        globalSetPolicyRequestResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGlobalSetPolicyRequestResource(
        com.google.cloud.compute.v1.GlobalSetPolicyRequest.Builder builderForValue) {
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        globalSetPolicyRequestResource_ = builderForValue.build();
        onChanged();
      } else {
        globalSetPolicyRequestResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeGlobalSetPolicyRequestResource(com.google.cloud.compute.v1.GlobalSetPolicyRequest value) {
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        if (globalSetPolicyRequestResource_ != null) {
          globalSetPolicyRequestResource_ =
            com.google.cloud.compute.v1.GlobalSetPolicyRequest.newBuilder(globalSetPolicyRequestResource_).mergeFrom(value).buildPartial();
        } else {
          globalSetPolicyRequestResource_ = value;
        }
        onChanged();
      } else {
        globalSetPolicyRequestResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearGlobalSetPolicyRequestResource() {
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        globalSetPolicyRequestResource_ = null;
        onChanged();
      } else {
        globalSetPolicyRequestResource_ = null;
        globalSetPolicyRequestResourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.GlobalSetPolicyRequest.Builder getGlobalSetPolicyRequestResourceBuilder() {
      
      onChanged();
      return getGlobalSetPolicyRequestResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.GlobalSetPolicyRequestOrBuilder getGlobalSetPolicyRequestResourceOrBuilder() {
      if (globalSetPolicyRequestResourceBuilder_ != null) {
        return globalSetPolicyRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return globalSetPolicyRequestResource_ == null ?
            com.google.cloud.compute.v1.GlobalSetPolicyRequest.getDefaultInstance() : globalSetPolicyRequestResource_;
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.GlobalSetPolicyRequest global_set_policy_request_resource = 337048498 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.GlobalSetPolicyRequest, com.google.cloud.compute.v1.GlobalSetPolicyRequest.Builder, com.google.cloud.compute.v1.GlobalSetPolicyRequestOrBuilder> 
        getGlobalSetPolicyRequestResourceFieldBuilder() {
      if (globalSetPolicyRequestResourceBuilder_ == null) {
        globalSetPolicyRequestResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.GlobalSetPolicyRequest, com.google.cloud.compute.v1.GlobalSetPolicyRequest.Builder, com.google.cloud.compute.v1.GlobalSetPolicyRequestOrBuilder>(
                getGlobalSetPolicyRequestResource(),
                getParentForChildren(),
                isClean());
        globalSetPolicyRequestResource_ = null;
      }
      return globalSetPolicyRequestResourceBuilder_;
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

    private java.lang.Object resource_ = "";
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      
      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resource_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SetIamPolicySnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SetIamPolicySnapshotRequest)
  private static final com.google.cloud.compute.v1.SetIamPolicySnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SetIamPolicySnapshotRequest();
  }

  public static com.google.cloud.compute.v1.SetIamPolicySnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetIamPolicySnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetIamPolicySnapshotRequest>() {
    @java.lang.Override
    public SetIamPolicySnapshotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetIamPolicySnapshotRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetIamPolicySnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetIamPolicySnapshotRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SetIamPolicySnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

