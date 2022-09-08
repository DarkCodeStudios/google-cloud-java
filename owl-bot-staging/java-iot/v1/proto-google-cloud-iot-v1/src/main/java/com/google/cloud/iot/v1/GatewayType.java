// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Gateway type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.iot.v1.GatewayType}
 */
public enum GatewayType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * If unspecified, the device is considered a non-gateway device.
   * </pre>
   *
   * <code>GATEWAY_TYPE_UNSPECIFIED = 0;</code>
   */
  GATEWAY_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The device is a gateway.
   * </pre>
   *
   * <code>GATEWAY = 1;</code>
   */
  GATEWAY(1),
  /**
   * <pre>
   * The device is not a gateway.
   * </pre>
   *
   * <code>NON_GATEWAY = 2;</code>
   */
  NON_GATEWAY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * If unspecified, the device is considered a non-gateway device.
   * </pre>
   *
   * <code>GATEWAY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int GATEWAY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The device is a gateway.
   * </pre>
   *
   * <code>GATEWAY = 1;</code>
   */
  public static final int GATEWAY_VALUE = 1;
  /**
   * <pre>
   * The device is not a gateway.
   * </pre>
   *
   * <code>NON_GATEWAY = 2;</code>
   */
  public static final int NON_GATEWAY_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GatewayType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GatewayType forNumber(int value) {
    switch (value) {
      case 0: return GATEWAY_TYPE_UNSPECIFIED;
      case 1: return GATEWAY;
      case 2: return NON_GATEWAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GatewayType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GatewayType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GatewayType>() {
          public GatewayType findValueByNumber(int number) {
            return GatewayType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final GatewayType[] VALUES = values();

  public static GatewayType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GatewayType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.iot.v1.GatewayType)
}

