// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface DiskInstantiationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DiskInstantiationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 464761403;</code>
   * @return Whether the autoDelete field is set.
   */
  boolean hasAutoDelete();
  /**
   * <pre>
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 464761403;</code>
   * @return The autoDelete.
   */
  boolean getAutoDelete();

  /**
   * <pre>
   * The custom source image to be used to restore this disk when instantiating this instance template.
   * </pre>
   *
   * <code>optional string custom_image = 184123149;</code>
   * @return Whether the customImage field is set.
   */
  boolean hasCustomImage();
  /**
   * <pre>
   * The custom source image to be used to restore this disk when instantiating this instance template.
   * </pre>
   *
   * <code>optional string custom_image = 184123149;</code>
   * @return The customImage.
   */
  java.lang.String getCustomImage();
  /**
   * <pre>
   * The custom source image to be used to restore this disk when instantiating this instance template.
   * </pre>
   *
   * <code>optional string custom_image = 184123149;</code>
   * @return The bytes for customImage.
   */
  com.google.protobuf.ByteString
      getCustomImageBytes();

  /**
   * <pre>
   * Specifies the device name of the disk to which the configurations apply to.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   * @return Whether the deviceName field is set.
   */
  boolean hasDeviceName();
  /**
   * <pre>
   * Specifies the device name of the disk to which the configurations apply to.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   * @return The deviceName.
   */
  java.lang.String getDeviceName();
  /**
   * <pre>
   * Specifies the device name of the disk to which the configurations apply to.
   * </pre>
   *
   * <code>optional string device_name = 67541716;</code>
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString
      getDeviceNameBytes();

  /**
   * <pre>
   * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
   * Check the InstantiateFrom enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instantiate_from = 393383903;</code>
   * @return Whether the instantiateFrom field is set.
   */
  boolean hasInstantiateFrom();
  /**
   * <pre>
   * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
   * Check the InstantiateFrom enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instantiate_from = 393383903;</code>
   * @return The instantiateFrom.
   */
  java.lang.String getInstantiateFrom();
  /**
   * <pre>
   * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance's corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
   * Check the InstantiateFrom enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instantiate_from = 393383903;</code>
   * @return The bytes for instantiateFrom.
   */
  com.google.protobuf.ByteString
      getInstantiateFromBytes();
}
