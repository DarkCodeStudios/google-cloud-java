// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

public interface CropHintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.CropHint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.BoundingPoly bounding_poly = 1;</code>
   * @return Whether the boundingPoly field is set.
   */
  boolean hasBoundingPoly();
  /**
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.BoundingPoly bounding_poly = 1;</code>
   * @return The boundingPoly.
   */
  com.google.cloud.vision.v1p1beta1.BoundingPoly getBoundingPoly();
  /**
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1p1beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   * <pre>
   * Confidence of this being a salient region.  Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   * @return The confidence.
   */
  float getConfidence();

  /**
   * <pre>
   * Fraction of importance of this salient region with respect to the original
   * image.
   * </pre>
   *
   * <code>float importance_fraction = 3;</code>
   * @return The importanceFraction.
   */
  float getImportanceFraction();
}
