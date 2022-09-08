// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface DominantColorsAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.DominantColorsAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.ColorInfo colors = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.ColorInfo> 
      getColorsList();
  /**
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.ColorInfo colors = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.ColorInfo getColors(int index);
  /**
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.ColorInfo colors = 1;</code>
   */
  int getColorsCount();
  /**
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.ColorInfo colors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.ColorInfoOrBuilder> 
      getColorsOrBuilderList();
  /**
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.ColorInfo colors = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.ColorInfoOrBuilder getColorsOrBuilder(
      int index);
}
