// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RegionInstanceGroupManagersSetTargetPoolsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   * <pre>
   * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   * <pre>
   * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString
      getFingerprintBytes();

  /**
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   * @return A list containing the targetPools.
   */
  java.util.List<java.lang.String>
      getTargetPoolsList();
  /**
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   * @return The count of targetPools.
   */
  int getTargetPoolsCount();
  /**
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   * @param index The index of the element to return.
   * @return The targetPools at the given index.
   */
  java.lang.String getTargetPools(int index);
  /**
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   * @param index The index of the value to return.
   * @return The bytes of the targetPools at the given index.
   */
  com.google.protobuf.ByteString
      getTargetPoolsBytes(int index);
}
