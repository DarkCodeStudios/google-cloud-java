/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * The overall outcome /decision / result indicator.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.Outcome}
 */
public enum Outcome implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>OUTCOME_UNSPECIFIED = 0;</code>
   */
  OUTCOME_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A positive outcome / passing indicator (for example, candidate was
   * recommended for hiring or to be moved forward in the hiring process,
   * candidate passed a test).
   * </pre>
   *
   * <code>POSITIVE = 1;</code>
   */
  POSITIVE(1),
  /**
   *
   *
   * <pre>
   * A neutral outcome / no clear indicator (for example, no strong
   * reccommendation either to move forward / not move forward, neutral score).
   * </pre>
   *
   * <code>NEUTRAL = 2;</code>
   */
  NEUTRAL(2),
  /**
   *
   *
   * <pre>
   * A negative outcome / failing indicator (for example, candidate was
   * recommended to NOT move forward in the hiring process, failed a test).
   * </pre>
   *
   * <code>NEGATIVE = 3;</code>
   */
  NEGATIVE(3),
  /**
   *
   *
   * <pre>
   * The assessment outcome is not available or otherwise unknown (for example,
   * candidate did not complete assessment).
   * </pre>
   *
   * <code>OUTCOME_NOT_AVAILABLE = 4;</code>
   */
  OUTCOME_NOT_AVAILABLE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value.
   * </pre>
   *
   * <code>OUTCOME_UNSPECIFIED = 0;</code>
   */
  public static final int OUTCOME_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A positive outcome / passing indicator (for example, candidate was
   * recommended for hiring or to be moved forward in the hiring process,
   * candidate passed a test).
   * </pre>
   *
   * <code>POSITIVE = 1;</code>
   */
  public static final int POSITIVE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * A neutral outcome / no clear indicator (for example, no strong
   * reccommendation either to move forward / not move forward, neutral score).
   * </pre>
   *
   * <code>NEUTRAL = 2;</code>
   */
  public static final int NEUTRAL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * A negative outcome / failing indicator (for example, candidate was
   * recommended to NOT move forward in the hiring process, failed a test).
   * </pre>
   *
   * <code>NEGATIVE = 3;</code>
   */
  public static final int NEGATIVE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The assessment outcome is not available or otherwise unknown (for example,
   * candidate did not complete assessment).
   * </pre>
   *
   * <code>OUTCOME_NOT_AVAILABLE = 4;</code>
   */
  public static final int OUTCOME_NOT_AVAILABLE_VALUE = 4;

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
  public static Outcome valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Outcome forNumber(int value) {
    switch (value) {
      case 0:
        return OUTCOME_UNSPECIFIED;
      case 1:
        return POSITIVE;
      case 2:
        return NEUTRAL;
      case 3:
        return NEGATIVE;
      case 4:
        return OUTCOME_NOT_AVAILABLE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Outcome> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Outcome> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Outcome>() {
        public Outcome findValueByNumber(int number) {
          return Outcome.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(12);
  }

  private static final Outcome[] VALUES = values();

  public static Outcome valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Outcome(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.Outcome)
}
