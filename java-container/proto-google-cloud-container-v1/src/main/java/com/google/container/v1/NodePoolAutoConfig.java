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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Node pool configs that apply to all auto-provisioned node pools
 * in autopilot clusters and node auto-provisioning enabled clusters.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.NodePoolAutoConfig}
 */
public final class NodePoolAutoConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.NodePoolAutoConfig)
    NodePoolAutoConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NodePoolAutoConfig.newBuilder() to construct.
  private NodePoolAutoConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodePoolAutoConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodePoolAutoConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NodePoolAutoConfig(
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
          case 10:
            {
              com.google.container.v1.NetworkTags.Builder subBuilder = null;
              if (networkTags_ != null) {
                subBuilder = networkTags_.toBuilder();
              }
              networkTags_ =
                  input.readMessage(
                      com.google.container.v1.NetworkTags.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(networkTags_);
                networkTags_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NodePoolAutoConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_NodePoolAutoConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.NodePoolAutoConfig.class,
            com.google.container.v1.NodePoolAutoConfig.Builder.class);
  }

  public static final int NETWORK_TAGS_FIELD_NUMBER = 1;
  private com.google.container.v1.NetworkTags networkTags_;
  /**
   *
   *
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
   *
   * @return Whether the networkTags field is set.
   */
  @java.lang.Override
  public boolean hasNetworkTags() {
    return networkTags_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
   *
   * @return The networkTags.
   */
  @java.lang.Override
  public com.google.container.v1.NetworkTags getNetworkTags() {
    return networkTags_ == null
        ? com.google.container.v1.NetworkTags.getDefaultInstance()
        : networkTags_;
  }
  /**
   *
   *
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1.NetworkTagsOrBuilder getNetworkTagsOrBuilder() {
    return getNetworkTags();
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
    if (networkTags_ != null) {
      output.writeMessage(1, getNetworkTags());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (networkTags_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNetworkTags());
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
    if (!(obj instanceof com.google.container.v1.NodePoolAutoConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.NodePoolAutoConfig other =
        (com.google.container.v1.NodePoolAutoConfig) obj;

    if (hasNetworkTags() != other.hasNetworkTags()) return false;
    if (hasNetworkTags()) {
      if (!getNetworkTags().equals(other.getNetworkTags())) return false;
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
    if (hasNetworkTags()) {
      hash = (37 * hash) + NETWORK_TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkTags().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.NodePoolAutoConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.NodePoolAutoConfig prototype) {
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
   * Node pool configs that apply to all auto-provisioned node pools
   * in autopilot clusters and node auto-provisioning enabled clusters.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.NodePoolAutoConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.NodePoolAutoConfig)
      com.google.container.v1.NodePoolAutoConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodePoolAutoConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodePoolAutoConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.NodePoolAutoConfig.class,
              com.google.container.v1.NodePoolAutoConfig.Builder.class);
    }

    // Construct using com.google.container.v1.NodePoolAutoConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (networkTagsBuilder_ == null) {
        networkTags_ = null;
      } else {
        networkTags_ = null;
        networkTagsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_NodePoolAutoConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.NodePoolAutoConfig getDefaultInstanceForType() {
      return com.google.container.v1.NodePoolAutoConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.NodePoolAutoConfig build() {
      com.google.container.v1.NodePoolAutoConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.NodePoolAutoConfig buildPartial() {
      com.google.container.v1.NodePoolAutoConfig result =
          new com.google.container.v1.NodePoolAutoConfig(this);
      if (networkTagsBuilder_ == null) {
        result.networkTags_ = networkTags_;
      } else {
        result.networkTags_ = networkTagsBuilder_.build();
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
      if (other instanceof com.google.container.v1.NodePoolAutoConfig) {
        return mergeFrom((com.google.container.v1.NodePoolAutoConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.NodePoolAutoConfig other) {
      if (other == com.google.container.v1.NodePoolAutoConfig.getDefaultInstance()) return this;
      if (other.hasNetworkTags()) {
        mergeNetworkTags(other.getNetworkTags());
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
      com.google.container.v1.NodePoolAutoConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.NodePoolAutoConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.container.v1.NetworkTags networkTags_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.NetworkTags,
            com.google.container.v1.NetworkTags.Builder,
            com.google.container.v1.NetworkTagsOrBuilder>
        networkTagsBuilder_;
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     *
     * @return Whether the networkTags field is set.
     */
    public boolean hasNetworkTags() {
      return networkTagsBuilder_ != null || networkTags_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     *
     * @return The networkTags.
     */
    public com.google.container.v1.NetworkTags getNetworkTags() {
      if (networkTagsBuilder_ == null) {
        return networkTags_ == null
            ? com.google.container.v1.NetworkTags.getDefaultInstance()
            : networkTags_;
      } else {
        return networkTagsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    public Builder setNetworkTags(com.google.container.v1.NetworkTags value) {
      if (networkTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        networkTags_ = value;
        onChanged();
      } else {
        networkTagsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    public Builder setNetworkTags(com.google.container.v1.NetworkTags.Builder builderForValue) {
      if (networkTagsBuilder_ == null) {
        networkTags_ = builderForValue.build();
        onChanged();
      } else {
        networkTagsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    public Builder mergeNetworkTags(com.google.container.v1.NetworkTags value) {
      if (networkTagsBuilder_ == null) {
        if (networkTags_ != null) {
          networkTags_ =
              com.google.container.v1.NetworkTags.newBuilder(networkTags_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          networkTags_ = value;
        }
        onChanged();
      } else {
        networkTagsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    public Builder clearNetworkTags() {
      if (networkTagsBuilder_ == null) {
        networkTags_ = null;
        onChanged();
      } else {
        networkTags_ = null;
        networkTagsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    public com.google.container.v1.NetworkTags.Builder getNetworkTagsBuilder() {

      onChanged();
      return getNetworkTagsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    public com.google.container.v1.NetworkTagsOrBuilder getNetworkTagsOrBuilder() {
      if (networkTagsBuilder_ != null) {
        return networkTagsBuilder_.getMessageOrBuilder();
      } else {
        return networkTags_ == null
            ? com.google.container.v1.NetworkTags.getDefaultInstance()
            : networkTags_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls and are specified by
     * the client during cluster creation. Each tag within the list
     * must comply with RFC1035.
     * </pre>
     *
     * <code>.google.container.v1.NetworkTags network_tags = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.NetworkTags,
            com.google.container.v1.NetworkTags.Builder,
            com.google.container.v1.NetworkTagsOrBuilder>
        getNetworkTagsFieldBuilder() {
      if (networkTagsBuilder_ == null) {
        networkTagsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.NetworkTags,
                com.google.container.v1.NetworkTags.Builder,
                com.google.container.v1.NetworkTagsOrBuilder>(
                getNetworkTags(), getParentForChildren(), isClean());
        networkTags_ = null;
      }
      return networkTagsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.NodePoolAutoConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.NodePoolAutoConfig)
  private static final com.google.container.v1.NodePoolAutoConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.NodePoolAutoConfig();
  }

  public static com.google.container.v1.NodePoolAutoConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodePoolAutoConfig> PARSER =
      new com.google.protobuf.AbstractParser<NodePoolAutoConfig>() {
        @java.lang.Override
        public NodePoolAutoConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NodePoolAutoConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NodePoolAutoConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodePoolAutoConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.NodePoolAutoConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}