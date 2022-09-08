// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ImageLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ImageLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Bounding boxes locating the pixels within the image containing the finding.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BoundingBox bounding_boxes = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.BoundingBox> 
      getBoundingBoxesList();
  /**
   * <pre>
   * Bounding boxes locating the pixels within the image containing the finding.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BoundingBox bounding_boxes = 1;</code>
   */
  com.google.privacy.dlp.v2.BoundingBox getBoundingBoxes(int index);
  /**
   * <pre>
   * Bounding boxes locating the pixels within the image containing the finding.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BoundingBox bounding_boxes = 1;</code>
   */
  int getBoundingBoxesCount();
  /**
   * <pre>
   * Bounding boxes locating the pixels within the image containing the finding.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BoundingBox bounding_boxes = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.BoundingBoxOrBuilder> 
      getBoundingBoxesOrBuilderList();
  /**
   * <pre>
   * Bounding boxes locating the pixels within the image containing the finding.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BoundingBox bounding_boxes = 1;</code>
   */
  com.google.privacy.dlp.v2.BoundingBoxOrBuilder getBoundingBoxesOrBuilder(
      int index);
}
