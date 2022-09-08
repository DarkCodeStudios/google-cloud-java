// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

public interface CropHintsParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.CropHintsParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Aspect ratios in floats, representing the ratio of the width to the height
   * of the image. For example, if the desired aspect ratio is 4/3, the
   * corresponding float value should be 1.33333.  If not specified, the
   * best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are
   * ignored.
   * </pre>
   *
   * <code>repeated float aspect_ratios = 1;</code>
   * @return A list containing the aspectRatios.
   */
  java.util.List<java.lang.Float> getAspectRatiosList();
  /**
   * <pre>
   * Aspect ratios in floats, representing the ratio of the width to the height
   * of the image. For example, if the desired aspect ratio is 4/3, the
   * corresponding float value should be 1.33333.  If not specified, the
   * best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are
   * ignored.
   * </pre>
   *
   * <code>repeated float aspect_ratios = 1;</code>
   * @return The count of aspectRatios.
   */
  int getAspectRatiosCount();
  /**
   * <pre>
   * Aspect ratios in floats, representing the ratio of the width to the height
   * of the image. For example, if the desired aspect ratio is 4/3, the
   * corresponding float value should be 1.33333.  If not specified, the
   * best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are
   * ignored.
   * </pre>
   *
   * <code>repeated float aspect_ratios = 1;</code>
   * @param index The index of the element to return.
   * @return The aspectRatios at the given index.
   */
  float getAspectRatios(int index);
}
