/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securityposture.v1;

/**
 *
 *
 * <pre>
 * Message for response to listing PostureRevisions.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securityposture.v1.ListPostureRevisionsResponse}
 */
public final class ListPostureRevisionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securityposture.v1.ListPostureRevisionsResponse)
    ListPostureRevisionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPostureRevisionsResponse.newBuilder() to construct.
  private ListPostureRevisionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPostureRevisionsResponse() {
    revisions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPostureRevisionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securityposture.v1.V1mainProto
        .internal_static_google_cloud_securityposture_v1_ListPostureRevisionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securityposture.v1.V1mainProto
        .internal_static_google_cloud_securityposture_v1_ListPostureRevisionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.class,
            com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.Builder.class);
  }

  public static final int REVISIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.securityposture.v1.Posture> revisions_;
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.securityposture.v1.Posture> getRevisionsList() {
    return revisions_;
  }
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.securityposture.v1.PostureOrBuilder>
      getRevisionsOrBuilderList() {
    return revisions_;
  }
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  @java.lang.Override
  public int getRevisionsCount() {
    return revisions_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.Posture getRevisions(int index) {
    return revisions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Posture revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.PostureOrBuilder getRevisionsOrBuilder(int index) {
    return revisions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < revisions_.size(); i++) {
      output.writeMessage(1, revisions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < revisions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, revisions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.securityposture.v1.ListPostureRevisionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.securityposture.v1.ListPostureRevisionsResponse other =
        (com.google.cloud.securityposture.v1.ListPostureRevisionsResponse) obj;

    if (!getRevisionsList().equals(other.getRevisionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getRevisionsCount() > 0) {
      hash = (37 * hash) + REVISIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRevisionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse parseFrom(
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
      com.google.cloud.securityposture.v1.ListPostureRevisionsResponse prototype) {
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
   * Message for response to listing PostureRevisions.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securityposture.v1.ListPostureRevisionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securityposture.v1.ListPostureRevisionsResponse)
      com.google.cloud.securityposture.v1.ListPostureRevisionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_ListPostureRevisionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_ListPostureRevisionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.class,
              com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (revisionsBuilder_ == null) {
        revisions_ = java.util.Collections.emptyList();
      } else {
        revisions_ = null;
        revisionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_ListPostureRevisionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.ListPostureRevisionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.ListPostureRevisionsResponse build() {
      com.google.cloud.securityposture.v1.ListPostureRevisionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.ListPostureRevisionsResponse buildPartial() {
      com.google.cloud.securityposture.v1.ListPostureRevisionsResponse result =
          new com.google.cloud.securityposture.v1.ListPostureRevisionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.securityposture.v1.ListPostureRevisionsResponse result) {
      if (revisionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          revisions_ = java.util.Collections.unmodifiableList(revisions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.revisions_ = revisions_;
      } else {
        result.revisions_ = revisionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.securityposture.v1.ListPostureRevisionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.securityposture.v1.ListPostureRevisionsResponse) {
        return mergeFrom((com.google.cloud.securityposture.v1.ListPostureRevisionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securityposture.v1.ListPostureRevisionsResponse other) {
      if (other
          == com.google.cloud.securityposture.v1.ListPostureRevisionsResponse.getDefaultInstance())
        return this;
      if (revisionsBuilder_ == null) {
        if (!other.revisions_.isEmpty()) {
          if (revisions_.isEmpty()) {
            revisions_ = other.revisions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRevisionsIsMutable();
            revisions_.addAll(other.revisions_);
          }
          onChanged();
        }
      } else {
        if (!other.revisions_.isEmpty()) {
          if (revisionsBuilder_.isEmpty()) {
            revisionsBuilder_.dispose();
            revisionsBuilder_ = null;
            revisions_ = other.revisions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            revisionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRevisionsFieldBuilder()
                    : null;
          } else {
            revisionsBuilder_.addAllMessages(other.revisions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
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
                com.google.cloud.securityposture.v1.Posture m =
                    input.readMessage(
                        com.google.cloud.securityposture.v1.Posture.parser(), extensionRegistry);
                if (revisionsBuilder_ == null) {
                  ensureRevisionsIsMutable();
                  revisions_.add(m);
                } else {
                  revisionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.securityposture.v1.Posture> revisions_ =
        java.util.Collections.emptyList();

    private void ensureRevisionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        revisions_ =
            new java.util.ArrayList<com.google.cloud.securityposture.v1.Posture>(revisions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securityposture.v1.Posture,
            com.google.cloud.securityposture.v1.Posture.Builder,
            com.google.cloud.securityposture.v1.PostureOrBuilder>
        revisionsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public java.util.List<com.google.cloud.securityposture.v1.Posture> getRevisionsList() {
      if (revisionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(revisions_);
      } else {
        return revisionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public int getRevisionsCount() {
      if (revisionsBuilder_ == null) {
        return revisions_.size();
      } else {
        return revisionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public com.google.cloud.securityposture.v1.Posture getRevisions(int index) {
      if (revisionsBuilder_ == null) {
        return revisions_.get(index);
      } else {
        return revisionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder setRevisions(int index, com.google.cloud.securityposture.v1.Posture value) {
      if (revisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRevisionsIsMutable();
        revisions_.set(index, value);
        onChanged();
      } else {
        revisionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder setRevisions(
        int index, com.google.cloud.securityposture.v1.Posture.Builder builderForValue) {
      if (revisionsBuilder_ == null) {
        ensureRevisionsIsMutable();
        revisions_.set(index, builderForValue.build());
        onChanged();
      } else {
        revisionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder addRevisions(com.google.cloud.securityposture.v1.Posture value) {
      if (revisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRevisionsIsMutable();
        revisions_.add(value);
        onChanged();
      } else {
        revisionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder addRevisions(int index, com.google.cloud.securityposture.v1.Posture value) {
      if (revisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRevisionsIsMutable();
        revisions_.add(index, value);
        onChanged();
      } else {
        revisionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder addRevisions(
        com.google.cloud.securityposture.v1.Posture.Builder builderForValue) {
      if (revisionsBuilder_ == null) {
        ensureRevisionsIsMutable();
        revisions_.add(builderForValue.build());
        onChanged();
      } else {
        revisionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder addRevisions(
        int index, com.google.cloud.securityposture.v1.Posture.Builder builderForValue) {
      if (revisionsBuilder_ == null) {
        ensureRevisionsIsMutable();
        revisions_.add(index, builderForValue.build());
        onChanged();
      } else {
        revisionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder addAllRevisions(
        java.lang.Iterable<? extends com.google.cloud.securityposture.v1.Posture> values) {
      if (revisionsBuilder_ == null) {
        ensureRevisionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, revisions_);
        onChanged();
      } else {
        revisionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder clearRevisions() {
      if (revisionsBuilder_ == null) {
        revisions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        revisionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public Builder removeRevisions(int index) {
      if (revisionsBuilder_ == null) {
        ensureRevisionsIsMutable();
        revisions_.remove(index);
        onChanged();
      } else {
        revisionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public com.google.cloud.securityposture.v1.Posture.Builder getRevisionsBuilder(int index) {
      return getRevisionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public com.google.cloud.securityposture.v1.PostureOrBuilder getRevisionsOrBuilder(int index) {
      if (revisionsBuilder_ == null) {
        return revisions_.get(index);
      } else {
        return revisionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.securityposture.v1.PostureOrBuilder>
        getRevisionsOrBuilderList() {
      if (revisionsBuilder_ != null) {
        return revisionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(revisions_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public com.google.cloud.securityposture.v1.Posture.Builder addRevisionsBuilder() {
      return getRevisionsFieldBuilder()
          .addBuilder(com.google.cloud.securityposture.v1.Posture.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public com.google.cloud.securityposture.v1.Posture.Builder addRevisionsBuilder(int index) {
      return getRevisionsFieldBuilder()
          .addBuilder(index, com.google.cloud.securityposture.v1.Posture.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Posture revisions.
     * </pre>
     *
     * <code>repeated .google.cloud.securityposture.v1.Posture revisions = 1;</code>
     */
    public java.util.List<com.google.cloud.securityposture.v1.Posture.Builder>
        getRevisionsBuilderList() {
      return getRevisionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securityposture.v1.Posture,
            com.google.cloud.securityposture.v1.Posture.Builder,
            com.google.cloud.securityposture.v1.PostureOrBuilder>
        getRevisionsFieldBuilder() {
      if (revisionsBuilder_ == null) {
        revisionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.securityposture.v1.Posture,
                com.google.cloud.securityposture.v1.Posture.Builder,
                com.google.cloud.securityposture.v1.PostureOrBuilder>(
                revisions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        revisions_ = null;
      }
      return revisionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results the server should return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securityposture.v1.ListPostureRevisionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securityposture.v1.ListPostureRevisionsResponse)
  private static final com.google.cloud.securityposture.v1.ListPostureRevisionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securityposture.v1.ListPostureRevisionsResponse();
  }

  public static com.google.cloud.securityposture.v1.ListPostureRevisionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPostureRevisionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPostureRevisionsResponse>() {
        @java.lang.Override
        public ListPostureRevisionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPostureRevisionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPostureRevisionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securityposture.v1.ListPostureRevisionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
