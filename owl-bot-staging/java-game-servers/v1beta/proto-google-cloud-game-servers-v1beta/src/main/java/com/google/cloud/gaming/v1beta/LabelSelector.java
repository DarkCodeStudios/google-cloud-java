// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/common.proto

package com.google.cloud.gaming.v1beta;

/**
 * <pre>
 * The label selector, used to group labels on the resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.LabelSelector}
 */
public final class LabelSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.LabelSelector)
    LabelSelectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabelSelector.newBuilder() to construct.
  private LabelSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabelSelector() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabelSelector();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LabelSelector(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              labels_ = com.google.protobuf.MapField.newMapField(
                  LabelsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            labels__ = input.readMessage(
                LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            labels_.getMutableMap().put(
                labels__.getKey(), labels__.getValue());
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
    return com.google.cloud.gaming.v1beta.Common.internal_static_google_cloud_gaming_v1beta_LabelSelector_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetLabels();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.Common.internal_static_google_cloud_gaming_v1beta_LabelSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.LabelSelector.class, com.google.cloud.gaming.v1beta.LabelSelector.Builder.class);
  }

  public static final int LABELS_FIELD_NUMBER = 1;
  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.gaming.v1beta.Common.internal_static_google_cloud_gaming_v1beta_LabelSelector_LabelsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> labels_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  @java.lang.Override
  public boolean containsLabels(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetLabels().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Resource labels for this selector.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getLabelsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetLabels(),
        LabelsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      labels__ = LabelsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels__);
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
    if (!(obj instanceof com.google.cloud.gaming.v1beta.LabelSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.LabelSelector other = (com.google.cloud.gaming.v1beta.LabelSelector) obj;

    if (!internalGetLabels().equals(
        other.internalGetLabels())) return false;
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
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.LabelSelector parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gaming.v1beta.LabelSelector prototype) {
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
   * The label selector, used to group labels on the resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.LabelSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.LabelSelector)
      com.google.cloud.gaming.v1beta.LabelSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gaming.v1beta.Common.internal_static_google_cloud_gaming_v1beta_LabelSelector_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.Common.internal_static_google_cloud_gaming_v1beta_LabelSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.LabelSelector.class, com.google.cloud.gaming.v1beta.LabelSelector.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1beta.LabelSelector.newBuilder()
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
      internalGetMutableLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gaming.v1beta.Common.internal_static_google_cloud_gaming_v1beta_LabelSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.LabelSelector getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.LabelSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.LabelSelector build() {
      com.google.cloud.gaming.v1beta.LabelSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.LabelSelector buildPartial() {
      com.google.cloud.gaming.v1beta.LabelSelector result = new com.google.cloud.gaming.v1beta.LabelSelector(this);
      int from_bitField0_ = bitField0_;
      result.labels_ = internalGetLabels();
      result.labels_.makeImmutable();
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
      if (other instanceof com.google.cloud.gaming.v1beta.LabelSelector) {
        return mergeFrom((com.google.cloud.gaming.v1beta.LabelSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1beta.LabelSelector other) {
      if (other == com.google.cloud.gaming.v1beta.LabelSelector.getDefaultInstance()) return this;
      internalGetMutableLabels().mergeFrom(
          other.internalGetLabels());
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
      com.google.cloud.gaming.v1beta.LabelSelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gaming.v1beta.LabelSelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> labels_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableLabels() {
      onChanged();;
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    @java.lang.Override
    public boolean containsLabels(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetLabels().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLabelsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getLabelsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getLabelsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      internalGetMutableLabels().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public Builder removeLabels(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableLabels().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableLabels() {
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */
    public Builder putLabels(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableLabels().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Resource labels for this selector.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public Builder putAllLabels(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.LabelSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.LabelSelector)
  private static final com.google.cloud.gaming.v1beta.LabelSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1beta.LabelSelector();
  }

  public static com.google.cloud.gaming.v1beta.LabelSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelSelector>
      PARSER = new com.google.protobuf.AbstractParser<LabelSelector>() {
    @java.lang.Override
    public LabelSelector parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LabelSelector(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LabelSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.LabelSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

