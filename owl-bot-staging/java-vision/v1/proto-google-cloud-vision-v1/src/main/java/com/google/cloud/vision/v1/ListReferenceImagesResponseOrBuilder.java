// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

public interface ListReferenceImagesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.ListReferenceImagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ReferenceImage reference_images = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.ReferenceImage> 
      getReferenceImagesList();
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ReferenceImage reference_images = 1;</code>
   */
  com.google.cloud.vision.v1.ReferenceImage getReferenceImages(int index);
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ReferenceImage reference_images = 1;</code>
   */
  int getReferenceImagesCount();
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ReferenceImage reference_images = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.ReferenceImageOrBuilder> 
      getReferenceImagesOrBuilderList();
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.ReferenceImage reference_images = 1;</code>
   */
  com.google.cloud.vision.v1.ReferenceImageOrBuilder getReferenceImagesOrBuilder(
      int index);

  /**
   * <pre>
   * The maximum number of items to return. Default 10, maximum 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
