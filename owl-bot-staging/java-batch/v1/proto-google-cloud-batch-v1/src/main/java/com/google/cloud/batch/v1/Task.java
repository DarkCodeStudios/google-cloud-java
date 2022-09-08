// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

/**
 * <pre>
 * A Cloud Batch task.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1.Task}
 */
public final class Task extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1.Task)
    TaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Task.newBuilder() to construct.
  private Task(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Task() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Task();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Task(
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
          case 18: {
            com.google.cloud.batch.v1.TaskStatus.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.google.cloud.batch.v1.TaskStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
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
    return com.google.cloud.batch.v1.TaskProto.internal_static_google_cloud_batch_v1_Task_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1.TaskProto.internal_static_google_cloud_batch_v1_Task_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1.Task.class, com.google.cloud.batch.v1.Task.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Task name.
   * The name is generated from the parent TaskGroup name and 'id' field.
   * For example:
   * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * Task name.
   * The name is generated from the parent TaskGroup name and 'id' field.
   * For example:
   * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.cloud.batch.v1.TaskStatus status_;
  /**
   * <pre>
   * Task Status.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * Task Status.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.TaskStatus getStatus() {
    return status_ == null ? com.google.cloud.batch.v1.TaskStatus.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Task Status.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.batch.v1.TaskStatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (status_ != null) {
      output.writeMessage(2, getStatus());
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
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
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
    if (!(obj instanceof com.google.cloud.batch.v1.Task)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1.Task other = (com.google.cloud.batch.v1.Task) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1.Task parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.batch.v1.Task parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.batch.v1.Task parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.batch.v1.Task parseFrom(
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
  public static Builder newBuilder(com.google.cloud.batch.v1.Task prototype) {
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
   * A Cloud Batch task.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1.Task}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1.Task)
      com.google.cloud.batch.v1.TaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.batch.v1.TaskProto.internal_static_google_cloud_batch_v1_Task_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1.TaskProto.internal_static_google_cloud_batch_v1_Task_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1.Task.class, com.google.cloud.batch.v1.Task.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1.Task.newBuilder()
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

      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.batch.v1.TaskProto.internal_static_google_cloud_batch_v1_Task_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.Task getDefaultInstanceForType() {
      return com.google.cloud.batch.v1.Task.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.Task build() {
      com.google.cloud.batch.v1.Task result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.Task buildPartial() {
      com.google.cloud.batch.v1.Task result = new com.google.cloud.batch.v1.Task(this);
      result.name_ = name_;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
      if (other instanceof com.google.cloud.batch.v1.Task) {
        return mergeFrom((com.google.cloud.batch.v1.Task)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1.Task other) {
      if (other == com.google.cloud.batch.v1.Task.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      com.google.cloud.batch.v1.Task parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.batch.v1.Task) e.getUnfinishedMessage();
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
     * Task name.
     * The name is generated from the parent TaskGroup name and 'id' field.
     * For example:
     * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Task name.
     * The name is generated from the parent TaskGroup name and 'id' field.
     * For example:
     * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Task name.
     * The name is generated from the parent TaskGroup name and 'id' field.
     * For example:
     * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Task name.
     * The name is generated from the parent TaskGroup name and 'id' field.
     * For example:
     * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Task name.
     * The name is generated from the parent TaskGroup name and 'id' field.
     * For example:
     * "projects/123456/locations/us-west1/jobs/job01/taskGroups/group01/tasks/task01".
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private com.google.cloud.batch.v1.TaskStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.batch.v1.TaskStatus, com.google.cloud.batch.v1.TaskStatus.Builder, com.google.cloud.batch.v1.TaskStatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     * @return The status.
     */
    public com.google.cloud.batch.v1.TaskStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.cloud.batch.v1.TaskStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    public Builder setStatus(com.google.cloud.batch.v1.TaskStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    public Builder setStatus(
        com.google.cloud.batch.v1.TaskStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    public Builder mergeStatus(com.google.cloud.batch.v1.TaskStatus value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.google.cloud.batch.v1.TaskStatus.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    public com.google.cloud.batch.v1.TaskStatus.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    public com.google.cloud.batch.v1.TaskStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.cloud.batch.v1.TaskStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * Task Status.
     * </pre>
     *
     * <code>.google.cloud.batch.v1.TaskStatus status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.batch.v1.TaskStatus, com.google.cloud.batch.v1.TaskStatus.Builder, com.google.cloud.batch.v1.TaskStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.batch.v1.TaskStatus, com.google.cloud.batch.v1.TaskStatus.Builder, com.google.cloud.batch.v1.TaskStatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1.Task)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1.Task)
  private static final com.google.cloud.batch.v1.Task DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1.Task();
  }

  public static com.google.cloud.batch.v1.Task getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Task>
      PARSER = new com.google.protobuf.AbstractParser<Task>() {
    @java.lang.Override
    public Task parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Task(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Task> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Task> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1.Task getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

