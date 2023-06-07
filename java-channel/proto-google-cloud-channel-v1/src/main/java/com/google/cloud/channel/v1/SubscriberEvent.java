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
// source: google/cloud/channel/v1/subscriber_event.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Represents information which resellers will get as part of notification from
 * Pub/Sub.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.SubscriberEvent}
 */
public final class SubscriberEvent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.SubscriberEvent)
    SubscriberEventOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubscriberEvent.newBuilder() to construct.
  private SubscriberEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubscriberEvent() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubscriberEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.SubscriberEventProto
        .internal_static_google_cloud_channel_v1_SubscriberEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.SubscriberEventProto
        .internal_static_google_cloud_channel_v1_SubscriberEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.SubscriberEvent.class,
            com.google.cloud.channel.v1.SubscriberEvent.Builder.class);
  }

  private int eventCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object event_;

  public enum EventCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CUSTOMER_EVENT(1),
    ENTITLEMENT_EVENT(2),
    EVENT_NOT_SET(0);
    private final int value;

    private EventCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventCase valueOf(int value) {
      return forNumber(value);
    }

    public static EventCase forNumber(int value) {
      switch (value) {
        case 1:
          return CUSTOMER_EVENT;
        case 2:
          return ENTITLEMENT_EVENT;
        case 0:
          return EVENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public EventCase getEventCase() {
    return EventCase.forNumber(eventCase_);
  }

  public static final int CUSTOMER_EVENT_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Customer event sent as part of Pub/Sub event to partners.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
   *
   * @return Whether the customerEvent field is set.
   */
  @java.lang.Override
  public boolean hasCustomerEvent() {
    return eventCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Customer event sent as part of Pub/Sub event to partners.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
   *
   * @return The customerEvent.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerEvent getCustomerEvent() {
    if (eventCase_ == 1) {
      return (com.google.cloud.channel.v1.CustomerEvent) event_;
    }
    return com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Customer event sent as part of Pub/Sub event to partners.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerEventOrBuilder getCustomerEventOrBuilder() {
    if (eventCase_ == 1) {
      return (com.google.cloud.channel.v1.CustomerEvent) event_;
    }
    return com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance();
  }

  public static final int ENTITLEMENT_EVENT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Entitlement event sent as part of Pub/Sub event to partners.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
   *
   * @return Whether the entitlementEvent field is set.
   */
  @java.lang.Override
  public boolean hasEntitlementEvent() {
    return eventCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Entitlement event sent as part of Pub/Sub event to partners.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
   *
   * @return The entitlementEvent.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.EntitlementEvent getEntitlementEvent() {
    if (eventCase_ == 2) {
      return (com.google.cloud.channel.v1.EntitlementEvent) event_;
    }
    return com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Entitlement event sent as part of Pub/Sub event to partners.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.EntitlementEventOrBuilder getEntitlementEventOrBuilder() {
    if (eventCase_ == 2) {
      return (com.google.cloud.channel.v1.EntitlementEvent) event_;
    }
    return com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance();
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
    if (eventCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.channel.v1.CustomerEvent) event_);
    }
    if (eventCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.channel.v1.EntitlementEvent) event_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.channel.v1.CustomerEvent) event_);
    }
    if (eventCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.channel.v1.EntitlementEvent) event_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.SubscriberEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.SubscriberEvent other =
        (com.google.cloud.channel.v1.SubscriberEvent) obj;

    if (!getEventCase().equals(other.getEventCase())) return false;
    switch (eventCase_) {
      case 1:
        if (!getCustomerEvent().equals(other.getCustomerEvent())) return false;
        break;
      case 2:
        if (!getEntitlementEvent().equals(other.getEntitlementEvent())) return false;
        break;
      case 0:
      default:
    }
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
    switch (eventCase_) {
      case 1:
        hash = (37 * hash) + CUSTOMER_EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getCustomerEvent().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ENTITLEMENT_EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getEntitlementEvent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.SubscriberEvent parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.SubscriberEvent prototype) {
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
   * Represents information which resellers will get as part of notification from
   * Pub/Sub.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.SubscriberEvent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.SubscriberEvent)
      com.google.cloud.channel.v1.SubscriberEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.SubscriberEventProto
          .internal_static_google_cloud_channel_v1_SubscriberEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.SubscriberEventProto
          .internal_static_google_cloud_channel_v1_SubscriberEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.SubscriberEvent.class,
              com.google.cloud.channel.v1.SubscriberEvent.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.SubscriberEvent.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (customerEventBuilder_ != null) {
        customerEventBuilder_.clear();
      }
      if (entitlementEventBuilder_ != null) {
        entitlementEventBuilder_.clear();
      }
      eventCase_ = 0;
      event_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.SubscriberEventProto
          .internal_static_google_cloud_channel_v1_SubscriberEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.SubscriberEvent getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.SubscriberEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.SubscriberEvent build() {
      com.google.cloud.channel.v1.SubscriberEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.SubscriberEvent buildPartial() {
      com.google.cloud.channel.v1.SubscriberEvent result =
          new com.google.cloud.channel.v1.SubscriberEvent(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.SubscriberEvent result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.channel.v1.SubscriberEvent result) {
      result.eventCase_ = eventCase_;
      result.event_ = this.event_;
      if (eventCase_ == 1 && customerEventBuilder_ != null) {
        result.event_ = customerEventBuilder_.build();
      }
      if (eventCase_ == 2 && entitlementEventBuilder_ != null) {
        result.event_ = entitlementEventBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.SubscriberEvent) {
        return mergeFrom((com.google.cloud.channel.v1.SubscriberEvent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.SubscriberEvent other) {
      if (other == com.google.cloud.channel.v1.SubscriberEvent.getDefaultInstance()) return this;
      switch (other.getEventCase()) {
        case CUSTOMER_EVENT:
          {
            mergeCustomerEvent(other.getCustomerEvent());
            break;
          }
        case ENTITLEMENT_EVENT:
          {
            mergeEntitlementEvent(other.getEntitlementEvent());
            break;
          }
        case EVENT_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getCustomerEventFieldBuilder().getBuilder(), extensionRegistry);
                eventCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getEntitlementEventFieldBuilder().getBuilder(), extensionRegistry);
                eventCase_ = 2;
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

    private int eventCase_ = 0;
    private java.lang.Object event_;

    public EventCase getEventCase() {
      return EventCase.forNumber(eventCase_);
    }

    public Builder clearEvent() {
      eventCase_ = 0;
      event_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerEvent,
            com.google.cloud.channel.v1.CustomerEvent.Builder,
            com.google.cloud.channel.v1.CustomerEventOrBuilder>
        customerEventBuilder_;
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     *
     * @return Whether the customerEvent field is set.
     */
    @java.lang.Override
    public boolean hasCustomerEvent() {
      return eventCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     *
     * @return The customerEvent.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.CustomerEvent getCustomerEvent() {
      if (customerEventBuilder_ == null) {
        if (eventCase_ == 1) {
          return (com.google.cloud.channel.v1.CustomerEvent) event_;
        }
        return com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance();
      } else {
        if (eventCase_ == 1) {
          return customerEventBuilder_.getMessage();
        }
        return com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    public Builder setCustomerEvent(com.google.cloud.channel.v1.CustomerEvent value) {
      if (customerEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        customerEventBuilder_.setMessage(value);
      }
      eventCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    public Builder setCustomerEvent(
        com.google.cloud.channel.v1.CustomerEvent.Builder builderForValue) {
      if (customerEventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        customerEventBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    public Builder mergeCustomerEvent(com.google.cloud.channel.v1.CustomerEvent value) {
      if (customerEventBuilder_ == null) {
        if (eventCase_ == 1
            && event_ != com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance()) {
          event_ =
              com.google.cloud.channel.v1.CustomerEvent.newBuilder(
                      (com.google.cloud.channel.v1.CustomerEvent) event_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 1) {
          customerEventBuilder_.mergeFrom(value);
        } else {
          customerEventBuilder_.setMessage(value);
        }
      }
      eventCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    public Builder clearCustomerEvent() {
      if (customerEventBuilder_ == null) {
        if (eventCase_ == 1) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 1) {
          eventCase_ = 0;
          event_ = null;
        }
        customerEventBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    public com.google.cloud.channel.v1.CustomerEvent.Builder getCustomerEventBuilder() {
      return getCustomerEventFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.CustomerEventOrBuilder getCustomerEventOrBuilder() {
      if ((eventCase_ == 1) && (customerEventBuilder_ != null)) {
        return customerEventBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 1) {
          return (com.google.cloud.channel.v1.CustomerEvent) event_;
        }
        return com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Customer event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerEvent customer_event = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerEvent,
            com.google.cloud.channel.v1.CustomerEvent.Builder,
            com.google.cloud.channel.v1.CustomerEventOrBuilder>
        getCustomerEventFieldBuilder() {
      if (customerEventBuilder_ == null) {
        if (!(eventCase_ == 1)) {
          event_ = com.google.cloud.channel.v1.CustomerEvent.getDefaultInstance();
        }
        customerEventBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.CustomerEvent,
                com.google.cloud.channel.v1.CustomerEvent.Builder,
                com.google.cloud.channel.v1.CustomerEventOrBuilder>(
                (com.google.cloud.channel.v1.CustomerEvent) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 1;
      onChanged();
      return customerEventBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.EntitlementEvent,
            com.google.cloud.channel.v1.EntitlementEvent.Builder,
            com.google.cloud.channel.v1.EntitlementEventOrBuilder>
        entitlementEventBuilder_;
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     *
     * @return Whether the entitlementEvent field is set.
     */
    @java.lang.Override
    public boolean hasEntitlementEvent() {
      return eventCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     *
     * @return The entitlementEvent.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.EntitlementEvent getEntitlementEvent() {
      if (entitlementEventBuilder_ == null) {
        if (eventCase_ == 2) {
          return (com.google.cloud.channel.v1.EntitlementEvent) event_;
        }
        return com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance();
      } else {
        if (eventCase_ == 2) {
          return entitlementEventBuilder_.getMessage();
        }
        return com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    public Builder setEntitlementEvent(com.google.cloud.channel.v1.EntitlementEvent value) {
      if (entitlementEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        entitlementEventBuilder_.setMessage(value);
      }
      eventCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    public Builder setEntitlementEvent(
        com.google.cloud.channel.v1.EntitlementEvent.Builder builderForValue) {
      if (entitlementEventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        entitlementEventBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    public Builder mergeEntitlementEvent(com.google.cloud.channel.v1.EntitlementEvent value) {
      if (entitlementEventBuilder_ == null) {
        if (eventCase_ == 2
            && event_ != com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance()) {
          event_ =
              com.google.cloud.channel.v1.EntitlementEvent.newBuilder(
                      (com.google.cloud.channel.v1.EntitlementEvent) event_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 2) {
          entitlementEventBuilder_.mergeFrom(value);
        } else {
          entitlementEventBuilder_.setMessage(value);
        }
      }
      eventCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    public Builder clearEntitlementEvent() {
      if (entitlementEventBuilder_ == null) {
        if (eventCase_ == 2) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 2) {
          eventCase_ = 0;
          event_ = null;
        }
        entitlementEventBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    public com.google.cloud.channel.v1.EntitlementEvent.Builder getEntitlementEventBuilder() {
      return getEntitlementEventFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.EntitlementEventOrBuilder getEntitlementEventOrBuilder() {
      if ((eventCase_ == 2) && (entitlementEventBuilder_ != null)) {
        return entitlementEventBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 2) {
          return (com.google.cloud.channel.v1.EntitlementEvent) event_;
        }
        return com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Entitlement event sent as part of Pub/Sub event to partners.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.EntitlementEvent entitlement_event = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.EntitlementEvent,
            com.google.cloud.channel.v1.EntitlementEvent.Builder,
            com.google.cloud.channel.v1.EntitlementEventOrBuilder>
        getEntitlementEventFieldBuilder() {
      if (entitlementEventBuilder_ == null) {
        if (!(eventCase_ == 2)) {
          event_ = com.google.cloud.channel.v1.EntitlementEvent.getDefaultInstance();
        }
        entitlementEventBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.EntitlementEvent,
                com.google.cloud.channel.v1.EntitlementEvent.Builder,
                com.google.cloud.channel.v1.EntitlementEventOrBuilder>(
                (com.google.cloud.channel.v1.EntitlementEvent) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 2;
      onChanged();
      return entitlementEventBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.SubscriberEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.SubscriberEvent)
  private static final com.google.cloud.channel.v1.SubscriberEvent DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.SubscriberEvent();
  }

  public static com.google.cloud.channel.v1.SubscriberEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscriberEvent> PARSER =
      new com.google.protobuf.AbstractParser<SubscriberEvent>() {
        @java.lang.Override
        public SubscriberEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscriberEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscriberEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.SubscriberEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
