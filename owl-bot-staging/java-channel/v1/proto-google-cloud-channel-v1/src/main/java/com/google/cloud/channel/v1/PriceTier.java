// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/offers.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Defines price at resource tier level.
 * For example, an offer with following definition :
 * * Tier 1: Provide 25% discount for all seats between 1 and 25.
 * * Tier 2: Provide 10% discount for all seats between 26 and 100.
 * * Tier 3: Provide flat 15% discount for all seats above 100.
 * Each of these tiers is represented as a PriceTier.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.PriceTier}
 */
public final class PriceTier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.PriceTier)
    PriceTierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PriceTier.newBuilder() to construct.
  private PriceTier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PriceTier() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PriceTier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PriceTier(
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

            firstResource_ = input.readInt32();
            break;
          }
          case 16: {

            lastResource_ = input.readInt32();
            break;
          }
          case 26: {
            com.google.cloud.channel.v1.Price.Builder subBuilder = null;
            if (price_ != null) {
              subBuilder = price_.toBuilder();
            }
            price_ = input.readMessage(com.google.cloud.channel.v1.Price.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(price_);
              price_ = subBuilder.buildPartial();
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
    return com.google.cloud.channel.v1.OffersProto.internal_static_google_cloud_channel_v1_PriceTier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.OffersProto.internal_static_google_cloud_channel_v1_PriceTier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.PriceTier.class, com.google.cloud.channel.v1.PriceTier.Builder.class);
  }

  public static final int FIRST_RESOURCE_FIELD_NUMBER = 1;
  private int firstResource_;
  /**
   * <pre>
   * First resource for which the tier price applies.
   * </pre>
   *
   * <code>int32 first_resource = 1;</code>
   * @return The firstResource.
   */
  @java.lang.Override
  public int getFirstResource() {
    return firstResource_;
  }

  public static final int LAST_RESOURCE_FIELD_NUMBER = 2;
  private int lastResource_;
  /**
   * <pre>
   * Last resource for which the tier price applies.
   * </pre>
   *
   * <code>int32 last_resource = 2;</code>
   * @return The lastResource.
   */
  @java.lang.Override
  public int getLastResource() {
    return lastResource_;
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private com.google.cloud.channel.v1.Price price_;
  /**
   * <pre>
   * Price of the tier.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 3;</code>
   * @return Whether the price field is set.
   */
  @java.lang.Override
  public boolean hasPrice() {
    return price_ != null;
  }
  /**
   * <pre>
   * Price of the tier.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Price getPrice() {
    return price_ == null ? com.google.cloud.channel.v1.Price.getDefaultInstance() : price_;
  }
  /**
   * <pre>
   * Price of the tier.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Price price = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.PriceOrBuilder getPriceOrBuilder() {
    return getPrice();
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
    if (firstResource_ != 0) {
      output.writeInt32(1, firstResource_);
    }
    if (lastResource_ != 0) {
      output.writeInt32(2, lastResource_);
    }
    if (price_ != null) {
      output.writeMessage(3, getPrice());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstResource_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstResource_);
    }
    if (lastResource_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, lastResource_);
    }
    if (price_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPrice());
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
    if (!(obj instanceof com.google.cloud.channel.v1.PriceTier)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.PriceTier other = (com.google.cloud.channel.v1.PriceTier) obj;

    if (getFirstResource()
        != other.getFirstResource()) return false;
    if (getLastResource()
        != other.getLastResource()) return false;
    if (hasPrice() != other.hasPrice()) return false;
    if (hasPrice()) {
      if (!getPrice()
          .equals(other.getPrice())) return false;
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
    hash = (37 * hash) + FIRST_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getFirstResource();
    hash = (37 * hash) + LAST_RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getLastResource();
    if (hasPrice()) {
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.PriceTier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.PriceTier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.PriceTier parseFrom(
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
  public static Builder newBuilder(com.google.cloud.channel.v1.PriceTier prototype) {
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
   * Defines price at resource tier level.
   * For example, an offer with following definition :
   * * Tier 1: Provide 25% discount for all seats between 1 and 25.
   * * Tier 2: Provide 10% discount for all seats between 26 and 100.
   * * Tier 3: Provide flat 15% discount for all seats above 100.
   * Each of these tiers is represented as a PriceTier.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.PriceTier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.PriceTier)
      com.google.cloud.channel.v1.PriceTierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.OffersProto.internal_static_google_cloud_channel_v1_PriceTier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.OffersProto.internal_static_google_cloud_channel_v1_PriceTier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.PriceTier.class, com.google.cloud.channel.v1.PriceTier.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.PriceTier.newBuilder()
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
      firstResource_ = 0;

      lastResource_ = 0;

      if (priceBuilder_ == null) {
        price_ = null;
      } else {
        price_ = null;
        priceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.OffersProto.internal_static_google_cloud_channel_v1_PriceTier_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.PriceTier getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.PriceTier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.PriceTier build() {
      com.google.cloud.channel.v1.PriceTier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.PriceTier buildPartial() {
      com.google.cloud.channel.v1.PriceTier result = new com.google.cloud.channel.v1.PriceTier(this);
      result.firstResource_ = firstResource_;
      result.lastResource_ = lastResource_;
      if (priceBuilder_ == null) {
        result.price_ = price_;
      } else {
        result.price_ = priceBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.PriceTier) {
        return mergeFrom((com.google.cloud.channel.v1.PriceTier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.PriceTier other) {
      if (other == com.google.cloud.channel.v1.PriceTier.getDefaultInstance()) return this;
      if (other.getFirstResource() != 0) {
        setFirstResource(other.getFirstResource());
      }
      if (other.getLastResource() != 0) {
        setLastResource(other.getLastResource());
      }
      if (other.hasPrice()) {
        mergePrice(other.getPrice());
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
      com.google.cloud.channel.v1.PriceTier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.PriceTier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstResource_ ;
    /**
     * <pre>
     * First resource for which the tier price applies.
     * </pre>
     *
     * <code>int32 first_resource = 1;</code>
     * @return The firstResource.
     */
    @java.lang.Override
    public int getFirstResource() {
      return firstResource_;
    }
    /**
     * <pre>
     * First resource for which the tier price applies.
     * </pre>
     *
     * <code>int32 first_resource = 1;</code>
     * @param value The firstResource to set.
     * @return This builder for chaining.
     */
    public Builder setFirstResource(int value) {
      
      firstResource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First resource for which the tier price applies.
     * </pre>
     *
     * <code>int32 first_resource = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstResource() {
      
      firstResource_ = 0;
      onChanged();
      return this;
    }

    private int lastResource_ ;
    /**
     * <pre>
     * Last resource for which the tier price applies.
     * </pre>
     *
     * <code>int32 last_resource = 2;</code>
     * @return The lastResource.
     */
    @java.lang.Override
    public int getLastResource() {
      return lastResource_;
    }
    /**
     * <pre>
     * Last resource for which the tier price applies.
     * </pre>
     *
     * <code>int32 last_resource = 2;</code>
     * @param value The lastResource to set.
     * @return This builder for chaining.
     */
    public Builder setLastResource(int value) {
      
      lastResource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Last resource for which the tier price applies.
     * </pre>
     *
     * <code>int32 last_resource = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastResource() {
      
      lastResource_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.Price price_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.Price, com.google.cloud.channel.v1.Price.Builder, com.google.cloud.channel.v1.PriceOrBuilder> priceBuilder_;
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     * @return Whether the price field is set.
     */
    public boolean hasPrice() {
      return priceBuilder_ != null || price_ != null;
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     * @return The price.
     */
    public com.google.cloud.channel.v1.Price getPrice() {
      if (priceBuilder_ == null) {
        return price_ == null ? com.google.cloud.channel.v1.Price.getDefaultInstance() : price_;
      } else {
        return priceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    public Builder setPrice(com.google.cloud.channel.v1.Price value) {
      if (priceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        price_ = value;
        onChanged();
      } else {
        priceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    public Builder setPrice(
        com.google.cloud.channel.v1.Price.Builder builderForValue) {
      if (priceBuilder_ == null) {
        price_ = builderForValue.build();
        onChanged();
      } else {
        priceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    public Builder mergePrice(com.google.cloud.channel.v1.Price value) {
      if (priceBuilder_ == null) {
        if (price_ != null) {
          price_ =
            com.google.cloud.channel.v1.Price.newBuilder(price_).mergeFrom(value).buildPartial();
        } else {
          price_ = value;
        }
        onChanged();
      } else {
        priceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    public Builder clearPrice() {
      if (priceBuilder_ == null) {
        price_ = null;
        onChanged();
      } else {
        price_ = null;
        priceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    public com.google.cloud.channel.v1.Price.Builder getPriceBuilder() {
      
      onChanged();
      return getPriceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    public com.google.cloud.channel.v1.PriceOrBuilder getPriceOrBuilder() {
      if (priceBuilder_ != null) {
        return priceBuilder_.getMessageOrBuilder();
      } else {
        return price_ == null ?
            com.google.cloud.channel.v1.Price.getDefaultInstance() : price_;
      }
    }
    /**
     * <pre>
     * Price of the tier.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Price price = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.Price, com.google.cloud.channel.v1.Price.Builder, com.google.cloud.channel.v1.PriceOrBuilder> 
        getPriceFieldBuilder() {
      if (priceBuilder_ == null) {
        priceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Price, com.google.cloud.channel.v1.Price.Builder, com.google.cloud.channel.v1.PriceOrBuilder>(
                getPrice(),
                getParentForChildren(),
                isClean());
        price_ = null;
      }
      return priceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.PriceTier)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.PriceTier)
  private static final com.google.cloud.channel.v1.PriceTier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.PriceTier();
  }

  public static com.google.cloud.channel.v1.PriceTier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PriceTier>
      PARSER = new com.google.protobuf.AbstractParser<PriceTier>() {
    @java.lang.Override
    public PriceTier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PriceTier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PriceTier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PriceTier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.PriceTier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

