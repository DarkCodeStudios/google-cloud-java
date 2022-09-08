// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

@java.lang.Deprecated public interface FaceAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.FaceAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Thumbnail of a representative face view (in JPEG format).
   * </pre>
   *
   * <code>bytes thumbnail = 1;</code>
   * @return The thumbnail.
   */
  com.google.protobuf.ByteString getThumbnail();

  /**
   * <pre>
   * All video segments where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceSegment segments = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.FaceSegment> 
      getSegmentsList();
  /**
   * <pre>
   * All video segments where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1.FaceSegment getSegments(int index);
  /**
   * <pre>
   * All video segments where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceSegment segments = 2;</code>
   */
  int getSegmentsCount();
  /**
   * <pre>
   * All video segments where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceSegment segments = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.FaceSegmentOrBuilder> 
      getSegmentsOrBuilderList();
  /**
   * <pre>
   * All video segments where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1.FaceSegmentOrBuilder getSegmentsOrBuilder(
      int index);

  /**
   * <pre>
   * All video frames where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceFrame frames = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.FaceFrame> 
      getFramesList();
  /**
   * <pre>
   * All video frames where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceFrame frames = 3;</code>
   */
  com.google.cloud.videointelligence.v1.FaceFrame getFrames(int index);
  /**
   * <pre>
   * All video frames where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceFrame frames = 3;</code>
   */
  int getFramesCount();
  /**
   * <pre>
   * All video frames where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceFrame frames = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.FaceFrameOrBuilder> 
      getFramesOrBuilderList();
  /**
   * <pre>
   * All video frames where a face was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.FaceFrame frames = 3;</code>
   */
  com.google.cloud.videointelligence.v1.FaceFrameOrBuilder getFramesOrBuilder(
      int index);
}
