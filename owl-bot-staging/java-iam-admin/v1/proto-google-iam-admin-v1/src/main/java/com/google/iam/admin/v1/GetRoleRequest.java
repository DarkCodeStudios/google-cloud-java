// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 * <pre>
 * The request to get the definition of an existing role.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.GetRoleRequest}
 */
public final class GetRoleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.GetRoleRequest)
    GetRoleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRoleRequest.newBuilder() to construct.
  private GetRoleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRoleRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRoleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetRoleRequest(
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

            name_ = s;
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
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_GetRoleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_GetRoleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.GetRoleRequest.class, com.google.iam.admin.v1.GetRoleRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The `name` parameter's value depends on the target resource for the
   * request, namely
   * [`roles`](/iam/reference/rest/v1/roles),
   * [`projects`](/iam/reference/rest/v1/projects.roles), or
   * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
   * resource type's `name` value format is described below:
   * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
   *   This method returns results from all
   *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
   *   Cloud IAM. Example request URL:
   *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
   * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
   *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
   *   [custom roles](/iam/docs/understanding-custom-roles) that have been
   *   created at the project level. Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
   * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
   *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
   *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
   *   have been created at the organization level. Example request URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The `name` parameter's value depends on the target resource for the
   * request, namely
   * [`roles`](/iam/reference/rest/v1/roles),
   * [`projects`](/iam/reference/rest/v1/projects.roles), or
   * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
   * resource type's `name` value format is described below:
   * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
   *   This method returns results from all
   *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
   *   Cloud IAM. Example request URL:
   *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
   * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
   *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
   *   [custom roles](/iam/docs/understanding-custom-roles) that have been
   *   created at the project level. Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
   * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
   *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
   *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
   *   have been created at the organization level. Example request URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
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
    if (!(obj instanceof com.google.iam.admin.v1.GetRoleRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.GetRoleRequest other = (com.google.iam.admin.v1.GetRoleRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.GetRoleRequest parseFrom(
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
  public static Builder newBuilder(com.google.iam.admin.v1.GetRoleRequest prototype) {
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
   * The request to get the definition of an existing role.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.GetRoleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.GetRoleRequest)
      com.google.iam.admin.v1.GetRoleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_GetRoleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_GetRoleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.GetRoleRequest.class, com.google.iam.admin.v1.GetRoleRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.GetRoleRequest.newBuilder()
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
      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_GetRoleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.GetRoleRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.GetRoleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.GetRoleRequest build() {
      com.google.iam.admin.v1.GetRoleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.GetRoleRequest buildPartial() {
      com.google.iam.admin.v1.GetRoleRequest result = new com.google.iam.admin.v1.GetRoleRequest(this);
      result.name_ = name_;
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
      if (other instanceof com.google.iam.admin.v1.GetRoleRequest) {
        return mergeFrom((com.google.iam.admin.v1.GetRoleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.GetRoleRequest other) {
      if (other == com.google.iam.admin.v1.GetRoleRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      com.google.iam.admin.v1.GetRoleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.admin.v1.GetRoleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`roles`](/iam/reference/rest/v1/roles),
     * [`projects`](/iam/reference/rest/v1/projects.roles), or
     * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
     * resource type's `name` value format is described below:
     * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
     *   This method returns results from all
     *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
     *   Cloud IAM. Example request URL:
     *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
     * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
     *   [custom roles](/iam/docs/understanding-custom-roles) that have been
     *   created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`roles`](/iam/reference/rest/v1/roles),
     * [`projects`](/iam/reference/rest/v1/projects.roles), or
     * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
     * resource type's `name` value format is described below:
     * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
     *   This method returns results from all
     *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
     *   Cloud IAM. Example request URL:
     *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
     * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
     *   [custom roles](/iam/docs/understanding-custom-roles) that have been
     *   created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`roles`](/iam/reference/rest/v1/roles),
     * [`projects`](/iam/reference/rest/v1/projects.roles), or
     * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
     * resource type's `name` value format is described below:
     * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
     *   This method returns results from all
     *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
     *   Cloud IAM. Example request URL:
     *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
     * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
     *   [custom roles](/iam/docs/understanding-custom-roles) that have been
     *   created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`roles`](/iam/reference/rest/v1/roles),
     * [`projects`](/iam/reference/rest/v1/projects.roles), or
     * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
     * resource type's `name` value format is described below:
     * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
     *   This method returns results from all
     *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
     *   Cloud IAM. Example request URL:
     *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
     * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
     *   [custom roles](/iam/docs/understanding-custom-roles) that have been
     *   created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `name` parameter's value depends on the target resource for the
     * request, namely
     * [`roles`](/iam/reference/rest/v1/roles),
     * [`projects`](/iam/reference/rest/v1/projects.roles), or
     * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
     * resource type's `name` value format is described below:
     * * [`roles.get()`](/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME}`.
     *   This method returns results from all
     *   [predefined roles](/iam/docs/understanding-roles#predefined_roles) in
     *   Cloud IAM. Example request URL:
     *   `https://iam.googleapis.com/v1/roles/{ROLE_NAME}`
     * * [`projects.roles.get()`](/iam/reference/rest/v1/projects.roles/get):
     *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method returns only
     *   [custom roles](/iam/docs/understanding-custom-roles) that have been
     *   created at the project level. Example request URL:
     *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
     * * [`organizations.roles.get()`](/iam/reference/rest/v1/organizations.roles/get):
     *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
     *   returns only [custom roles](/iam/docs/understanding-custom-roles) that
     *   have been created at the organization level. Example request URL:
     *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
     * Note: Wildcard (*) values are invalid; you must specify a complete project
     * ID or organization ID.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.GetRoleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.GetRoleRequest)
  private static final com.google.iam.admin.v1.GetRoleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.GetRoleRequest();
  }

  public static com.google.iam.admin.v1.GetRoleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRoleRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetRoleRequest>() {
    @java.lang.Override
    public GetRoleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetRoleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetRoleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRoleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.GetRoleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

