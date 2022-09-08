// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Configuration for the size bounds of an instance group, including its
 * proportional size to other groups.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig}
 */
public final class InstanceGroupAutoscalingPolicyConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig)
    InstanceGroupAutoscalingPolicyConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstanceGroupAutoscalingPolicyConfig.newBuilder() to construct.
  private InstanceGroupAutoscalingPolicyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstanceGroupAutoscalingPolicyConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstanceGroupAutoscalingPolicyConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstanceGroupAutoscalingPolicyConfig(
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
          case 8: {

            minInstances_ = input.readInt32();
            break;
          }
          case 16: {

            maxInstances_ = input.readInt32();
            break;
          }
          case 24: {

            weight_ = input.readInt32();
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
    return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.class, com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.Builder.class);
  }

  public static final int MIN_INSTANCES_FIELD_NUMBER = 1;
  private int minInstances_;
  /**
   * <pre>
   * Optional. Minimum number of instances for this group.
   * Primary workers - Bounds: [2, max_instances]. Default: 2.
   * Secondary workers - Bounds: [0, max_instances]. Default: 0.
   * </pre>
   *
   * <code>int32 min_instances = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The minInstances.
   */
  @java.lang.Override
  public int getMinInstances() {
    return minInstances_;
  }

  public static final int MAX_INSTANCES_FIELD_NUMBER = 2;
  private int maxInstances_;
  /**
   * <pre>
   * Required. Maximum number of instances for this group. Required for primary
   * workers. Note that by default, clusters will not use secondary workers.
   * Required for secondary workers if the minimum secondary instances is set.
   * Primary workers - Bounds: [min_instances, ).
   * Secondary workers - Bounds: [min_instances, ). Default: 0.
   * </pre>
   *
   * <code>int32 max_instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The maxInstances.
   */
  @java.lang.Override
  public int getMaxInstances() {
    return maxInstances_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 3;
  private int weight_;
  /**
   * <pre>
   * Optional. Weight for the instance group, which is used to determine the
   * fraction of total workers in the cluster from this instance group.
   * For example, if primary workers have weight 2, and secondary workers have
   * weight 1, the cluster will have approximately 2 primary workers for each
   * secondary worker.
   * The cluster may not reach the specified balance if constrained
   * by min/max bounds or other autoscaling settings. For example, if
   * `max_instances` for secondary workers is 0, then only primary workers will
   * be added. The cluster can also be out of balance when created.
   * If weight is not set on any instance group, the cluster will default to
   * equal weight for all groups: the cluster will attempt to maintain an equal
   * number of workers in each group within the configured size bounds for each
   * group. If weight is set for one group only, the cluster will default to
   * zero weight on the unset group. For example if weight is set only on
   * primary workers, the cluster will use primary workers only and no
   * secondary workers.
   * </pre>
   *
   * <code>int32 weight = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The weight.
   */
  @java.lang.Override
  public int getWeight() {
    return weight_;
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
    if (minInstances_ != 0) {
      output.writeInt32(1, minInstances_);
    }
    if (maxInstances_ != 0) {
      output.writeInt32(2, maxInstances_);
    }
    if (weight_ != 0) {
      output.writeInt32(3, weight_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minInstances_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, minInstances_);
    }
    if (maxInstances_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxInstances_);
    }
    if (weight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, weight_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig other = (com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig) obj;

    if (getMinInstances()
        != other.getMinInstances()) return false;
    if (getMaxInstances()
        != other.getMaxInstances()) return false;
    if (getWeight()
        != other.getWeight()) return false;
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
    hash = (37 * hash) + MIN_INSTANCES_FIELD_NUMBER;
    hash = (53 * hash) + getMinInstances();
    hash = (37 * hash) + MAX_INSTANCES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxInstances();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getWeight();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig prototype) {
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
   * Configuration for the size bounds of an instance group, including its
   * proportional size to other groups.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig)
      com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.class, com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.newBuilder()
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
      minInstances_ = 0;

      maxInstances_ = 0;

      weight_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig build() {
      com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig buildPartial() {
      com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig result = new com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig(this);
      result.minInstances_ = minInstances_;
      result.maxInstances_ = maxInstances_;
      result.weight_ = weight_;
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
      if (other instanceof com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig other) {
      if (other == com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig.getDefaultInstance()) return this;
      if (other.getMinInstances() != 0) {
        setMinInstances(other.getMinInstances());
      }
      if (other.getMaxInstances() != 0) {
        setMaxInstances(other.getMaxInstances());
      }
      if (other.getWeight() != 0) {
        setWeight(other.getWeight());
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
      com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minInstances_ ;
    /**
     * <pre>
     * Optional. Minimum number of instances for this group.
     * Primary workers - Bounds: [2, max_instances]. Default: 2.
     * Secondary workers - Bounds: [0, max_instances]. Default: 0.
     * </pre>
     *
     * <code>int32 min_instances = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The minInstances.
     */
    @java.lang.Override
    public int getMinInstances() {
      return minInstances_;
    }
    /**
     * <pre>
     * Optional. Minimum number of instances for this group.
     * Primary workers - Bounds: [2, max_instances]. Default: 2.
     * Secondary workers - Bounds: [0, max_instances]. Default: 0.
     * </pre>
     *
     * <code>int32 min_instances = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The minInstances to set.
     * @return This builder for chaining.
     */
    public Builder setMinInstances(int value) {
      
      minInstances_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Minimum number of instances for this group.
     * Primary workers - Bounds: [2, max_instances]. Default: 2.
     * Secondary workers - Bounds: [0, max_instances]. Default: 0.
     * </pre>
     *
     * <code>int32 min_instances = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinInstances() {
      
      minInstances_ = 0;
      onChanged();
      return this;
    }

    private int maxInstances_ ;
    /**
     * <pre>
     * Required. Maximum number of instances for this group. Required for primary
     * workers. Note that by default, clusters will not use secondary workers.
     * Required for secondary workers if the minimum secondary instances is set.
     * Primary workers - Bounds: [min_instances, ).
     * Secondary workers - Bounds: [min_instances, ). Default: 0.
     * </pre>
     *
     * <code>int32 max_instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The maxInstances.
     */
    @java.lang.Override
    public int getMaxInstances() {
      return maxInstances_;
    }
    /**
     * <pre>
     * Required. Maximum number of instances for this group. Required for primary
     * workers. Note that by default, clusters will not use secondary workers.
     * Required for secondary workers if the minimum secondary instances is set.
     * Primary workers - Bounds: [min_instances, ).
     * Secondary workers - Bounds: [min_instances, ). Default: 0.
     * </pre>
     *
     * <code>int32 max_instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The maxInstances to set.
     * @return This builder for chaining.
     */
    public Builder setMaxInstances(int value) {
      
      maxInstances_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Maximum number of instances for this group. Required for primary
     * workers. Note that by default, clusters will not use secondary workers.
     * Required for secondary workers if the minimum secondary instances is set.
     * Primary workers - Bounds: [min_instances, ).
     * Secondary workers - Bounds: [min_instances, ). Default: 0.
     * </pre>
     *
     * <code>int32 max_instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxInstances() {
      
      maxInstances_ = 0;
      onChanged();
      return this;
    }

    private int weight_ ;
    /**
     * <pre>
     * Optional. Weight for the instance group, which is used to determine the
     * fraction of total workers in the cluster from this instance group.
     * For example, if primary workers have weight 2, and secondary workers have
     * weight 1, the cluster will have approximately 2 primary workers for each
     * secondary worker.
     * The cluster may not reach the specified balance if constrained
     * by min/max bounds or other autoscaling settings. For example, if
     * `max_instances` for secondary workers is 0, then only primary workers will
     * be added. The cluster can also be out of balance when created.
     * If weight is not set on any instance group, the cluster will default to
     * equal weight for all groups: the cluster will attempt to maintain an equal
     * number of workers in each group within the configured size bounds for each
     * group. If weight is set for one group only, the cluster will default to
     * zero weight on the unset group. For example if weight is set only on
     * primary workers, the cluster will use primary workers only and no
     * secondary workers.
     * </pre>
     *
     * <code>int32 weight = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The weight.
     */
    @java.lang.Override
    public int getWeight() {
      return weight_;
    }
    /**
     * <pre>
     * Optional. Weight for the instance group, which is used to determine the
     * fraction of total workers in the cluster from this instance group.
     * For example, if primary workers have weight 2, and secondary workers have
     * weight 1, the cluster will have approximately 2 primary workers for each
     * secondary worker.
     * The cluster may not reach the specified balance if constrained
     * by min/max bounds or other autoscaling settings. For example, if
     * `max_instances` for secondary workers is 0, then only primary workers will
     * be added. The cluster can also be out of balance when created.
     * If weight is not set on any instance group, the cluster will default to
     * equal weight for all groups: the cluster will attempt to maintain an equal
     * number of workers in each group within the configured size bounds for each
     * group. If weight is set for one group only, the cluster will default to
     * zero weight on the unset group. For example if weight is set only on
     * primary workers, the cluster will use primary workers only and no
     * secondary workers.
     * </pre>
     *
     * <code>int32 weight = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(int value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Weight for the instance group, which is used to determine the
     * fraction of total workers in the cluster from this instance group.
     * For example, if primary workers have weight 2, and secondary workers have
     * weight 1, the cluster will have approximately 2 primary workers for each
     * secondary worker.
     * The cluster may not reach the specified balance if constrained
     * by min/max bounds or other autoscaling settings. For example, if
     * `max_instances` for secondary workers is 0, then only primary workers will
     * be added. The cluster can also be out of balance when created.
     * If weight is not set on any instance group, the cluster will default to
     * equal weight for all groups: the cluster will attempt to maintain an equal
     * number of workers in each group within the configured size bounds for each
     * group. If weight is set for one group only, the cluster will default to
     * zero weight on the unset group. For example if weight is set only on
     * primary workers, the cluster will use primary workers only and no
     * secondary workers.
     * </pre>
     *
     * <code>int32 weight = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig)
  private static final com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig();
  }

  public static com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupAutoscalingPolicyConfig>
      PARSER = new com.google.protobuf.AbstractParser<InstanceGroupAutoscalingPolicyConfig>() {
    @java.lang.Override
    public InstanceGroupAutoscalingPolicyConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstanceGroupAutoscalingPolicyConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstanceGroupAutoscalingPolicyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupAutoscalingPolicyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

