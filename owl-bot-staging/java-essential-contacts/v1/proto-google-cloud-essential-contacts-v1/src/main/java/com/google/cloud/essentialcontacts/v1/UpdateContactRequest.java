// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/essentialcontacts/v1/service.proto

package com.google.cloud.essentialcontacts.v1;

/**
 * <pre>
 * Request message for the UpdateContact method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.essentialcontacts.v1.UpdateContactRequest}
 */
public final class UpdateContactRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.essentialcontacts.v1.UpdateContactRequest)
    UpdateContactRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateContactRequest.newBuilder() to construct.
  private UpdateContactRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateContactRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateContactRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateContactRequest(
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
          case 18: {
            com.google.cloud.essentialcontacts.v1.Contact.Builder subBuilder = null;
            if (contact_ != null) {
              subBuilder = contact_.toBuilder();
            }
            contact_ = input.readMessage(com.google.cloud.essentialcontacts.v1.Contact.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contact_);
              contact_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return com.google.cloud.essentialcontacts.v1.Service.internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.essentialcontacts.v1.Service.internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.essentialcontacts.v1.UpdateContactRequest.class, com.google.cloud.essentialcontacts.v1.UpdateContactRequest.Builder.class);
  }

  public static final int CONTACT_FIELD_NUMBER = 2;
  private com.google.cloud.essentialcontacts.v1.Contact contact_;
  /**
   * <pre>
   * Required. The contact resource to replace the existing saved contact. Note:
   * the email address of the contact cannot be modified.
   * </pre>
   *
   * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the contact field is set.
   */
  @java.lang.Override
  public boolean hasContact() {
    return contact_ != null;
  }
  /**
   * <pre>
   * Required. The contact resource to replace the existing saved contact. Note:
   * the email address of the contact cannot be modified.
   * </pre>
   *
   * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The contact.
   */
  @java.lang.Override
  public com.google.cloud.essentialcontacts.v1.Contact getContact() {
    return contact_ == null ? com.google.cloud.essentialcontacts.v1.Contact.getDefaultInstance() : contact_;
  }
  /**
   * <pre>
   * Required. The contact resource to replace the existing saved contact. Note:
   * the email address of the contact cannot be modified.
   * </pre>
   *
   * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.essentialcontacts.v1.ContactOrBuilder getContactOrBuilder() {
    return getContact();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. The update mask applied to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Optional. The update mask applied to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Optional. The update mask applied to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (contact_ != null) {
      output.writeMessage(2, getContact());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contact_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getContact());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.essentialcontacts.v1.UpdateContactRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.essentialcontacts.v1.UpdateContactRequest other = (com.google.cloud.essentialcontacts.v1.UpdateContactRequest) obj;

    if (hasContact() != other.hasContact()) return false;
    if (hasContact()) {
      if (!getContact()
          .equals(other.getContact())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasContact()) {
      hash = (37 * hash) + CONTACT_FIELD_NUMBER;
      hash = (53 * hash) + getContact().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.essentialcontacts.v1.UpdateContactRequest prototype) {
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
   * Request message for the UpdateContact method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.essentialcontacts.v1.UpdateContactRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.essentialcontacts.v1.UpdateContactRequest)
      com.google.cloud.essentialcontacts.v1.UpdateContactRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.essentialcontacts.v1.Service.internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.essentialcontacts.v1.Service.internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.essentialcontacts.v1.UpdateContactRequest.class, com.google.cloud.essentialcontacts.v1.UpdateContactRequest.Builder.class);
    }

    // Construct using com.google.cloud.essentialcontacts.v1.UpdateContactRequest.newBuilder()
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
      if (contactBuilder_ == null) {
        contact_ = null;
      } else {
        contact_ = null;
        contactBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.essentialcontacts.v1.Service.internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.essentialcontacts.v1.UpdateContactRequest getDefaultInstanceForType() {
      return com.google.cloud.essentialcontacts.v1.UpdateContactRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.essentialcontacts.v1.UpdateContactRequest build() {
      com.google.cloud.essentialcontacts.v1.UpdateContactRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.essentialcontacts.v1.UpdateContactRequest buildPartial() {
      com.google.cloud.essentialcontacts.v1.UpdateContactRequest result = new com.google.cloud.essentialcontacts.v1.UpdateContactRequest(this);
      if (contactBuilder_ == null) {
        result.contact_ = contact_;
      } else {
        result.contact_ = contactBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.essentialcontacts.v1.UpdateContactRequest) {
        return mergeFrom((com.google.cloud.essentialcontacts.v1.UpdateContactRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.essentialcontacts.v1.UpdateContactRequest other) {
      if (other == com.google.cloud.essentialcontacts.v1.UpdateContactRequest.getDefaultInstance()) return this;
      if (other.hasContact()) {
        mergeContact(other.getContact());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.essentialcontacts.v1.UpdateContactRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.essentialcontacts.v1.UpdateContactRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.essentialcontacts.v1.Contact contact_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.essentialcontacts.v1.Contact, com.google.cloud.essentialcontacts.v1.Contact.Builder, com.google.cloud.essentialcontacts.v1.ContactOrBuilder> contactBuilder_;
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the contact field is set.
     */
    public boolean hasContact() {
      return contactBuilder_ != null || contact_ != null;
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The contact.
     */
    public com.google.cloud.essentialcontacts.v1.Contact getContact() {
      if (contactBuilder_ == null) {
        return contact_ == null ? com.google.cloud.essentialcontacts.v1.Contact.getDefaultInstance() : contact_;
      } else {
        return contactBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContact(com.google.cloud.essentialcontacts.v1.Contact value) {
      if (contactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contact_ = value;
        onChanged();
      } else {
        contactBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContact(
        com.google.cloud.essentialcontacts.v1.Contact.Builder builderForValue) {
      if (contactBuilder_ == null) {
        contact_ = builderForValue.build();
        onChanged();
      } else {
        contactBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeContact(com.google.cloud.essentialcontacts.v1.Contact value) {
      if (contactBuilder_ == null) {
        if (contact_ != null) {
          contact_ =
            com.google.cloud.essentialcontacts.v1.Contact.newBuilder(contact_).mergeFrom(value).buildPartial();
        } else {
          contact_ = value;
        }
        onChanged();
      } else {
        contactBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearContact() {
      if (contactBuilder_ == null) {
        contact_ = null;
        onChanged();
      } else {
        contact_ = null;
        contactBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.essentialcontacts.v1.Contact.Builder getContactBuilder() {
      
      onChanged();
      return getContactFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.essentialcontacts.v1.ContactOrBuilder getContactOrBuilder() {
      if (contactBuilder_ != null) {
        return contactBuilder_.getMessageOrBuilder();
      } else {
        return contact_ == null ?
            com.google.cloud.essentialcontacts.v1.Contact.getDefaultInstance() : contact_;
      }
    }
    /**
     * <pre>
     * Required. The contact resource to replace the existing saved contact. Note:
     * the email address of the contact cannot be modified.
     * </pre>
     *
     * <code>.google.cloud.essentialcontacts.v1.Contact contact = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.essentialcontacts.v1.Contact, com.google.cloud.essentialcontacts.v1.Contact.Builder, com.google.cloud.essentialcontacts.v1.ContactOrBuilder> 
        getContactFieldBuilder() {
      if (contactBuilder_ == null) {
        contactBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.essentialcontacts.v1.Contact, com.google.cloud.essentialcontacts.v1.Contact.Builder, com.google.cloud.essentialcontacts.v1.ContactOrBuilder>(
                getContact(),
                getParentForChildren(),
                isClean());
        contact_ = null;
      }
      return contactBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Optional. The update mask applied to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.essentialcontacts.v1.UpdateContactRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.essentialcontacts.v1.UpdateContactRequest)
  private static final com.google.cloud.essentialcontacts.v1.UpdateContactRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.essentialcontacts.v1.UpdateContactRequest();
  }

  public static com.google.cloud.essentialcontacts.v1.UpdateContactRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateContactRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateContactRequest>() {
    @java.lang.Override
    public UpdateContactRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateContactRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateContactRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateContactRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.essentialcontacts.v1.UpdateContactRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

