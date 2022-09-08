// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface AnnotationValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.AnnotationValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Annotation value for image classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation image_classification_annotation = 1;</code>
   * @return Whether the imageClassificationAnnotation field is set.
   */
  boolean hasImageClassificationAnnotation();
  /**
   * <pre>
   * Annotation value for image classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation image_classification_annotation = 1;</code>
   * @return The imageClassificationAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation getImageClassificationAnnotation();
  /**
   * <pre>
   * Annotation value for image classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotation image_classification_annotation = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.ImageClassificationAnnotationOrBuilder getImageClassificationAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for image bounding box, oriented bounding box
   * and polygon cases.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotation image_bounding_poly_annotation = 2;</code>
   * @return Whether the imageBoundingPolyAnnotation field is set.
   */
  boolean hasImageBoundingPolyAnnotation();
  /**
   * <pre>
   * Annotation value for image bounding box, oriented bounding box
   * and polygon cases.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotation image_bounding_poly_annotation = 2;</code>
   * @return The imageBoundingPolyAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotation getImageBoundingPolyAnnotation();
  /**
   * <pre>
   * Annotation value for image bounding box, oriented bounding box
   * and polygon cases.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotation image_bounding_poly_annotation = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.ImageBoundingPolyAnnotationOrBuilder getImageBoundingPolyAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for image polyline cases.
   * Polyline here is different from BoundingPoly. It is formed by
   * line segments connected to each other but not closed form(Bounding Poly).
   * The line segments can cross each other.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation image_polyline_annotation = 8;</code>
   * @return Whether the imagePolylineAnnotation field is set.
   */
  boolean hasImagePolylineAnnotation();
  /**
   * <pre>
   * Annotation value for image polyline cases.
   * Polyline here is different from BoundingPoly. It is formed by
   * line segments connected to each other but not closed form(Bounding Poly).
   * The line segments can cross each other.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation image_polyline_annotation = 8;</code>
   * @return The imagePolylineAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation getImagePolylineAnnotation();
  /**
   * <pre>
   * Annotation value for image polyline cases.
   * Polyline here is different from BoundingPoly. It is formed by
   * line segments connected to each other but not closed form(Bounding Poly).
   * The line segments can cross each other.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation image_polyline_annotation = 8;</code>
   */
  com.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotationOrBuilder getImagePolylineAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for image segmentation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation image_segmentation_annotation = 9;</code>
   * @return Whether the imageSegmentationAnnotation field is set.
   */
  boolean hasImageSegmentationAnnotation();
  /**
   * <pre>
   * Annotation value for image segmentation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation image_segmentation_annotation = 9;</code>
   * @return The imageSegmentationAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation getImageSegmentationAnnotation();
  /**
   * <pre>
   * Annotation value for image segmentation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotation image_segmentation_annotation = 9;</code>
   */
  com.google.cloud.datalabeling.v1beta1.ImageSegmentationAnnotationOrBuilder getImageSegmentationAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for text classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextClassificationAnnotation text_classification_annotation = 3;</code>
   * @return Whether the textClassificationAnnotation field is set.
   */
  boolean hasTextClassificationAnnotation();
  /**
   * <pre>
   * Annotation value for text classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextClassificationAnnotation text_classification_annotation = 3;</code>
   * @return The textClassificationAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.TextClassificationAnnotation getTextClassificationAnnotation();
  /**
   * <pre>
   * Annotation value for text classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextClassificationAnnotation text_classification_annotation = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.TextClassificationAnnotationOrBuilder getTextClassificationAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for text entity extraction case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation text_entity_extraction_annotation = 10;</code>
   * @return Whether the textEntityExtractionAnnotation field is set.
   */
  boolean hasTextEntityExtractionAnnotation();
  /**
   * <pre>
   * Annotation value for text entity extraction case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation text_entity_extraction_annotation = 10;</code>
   * @return The textEntityExtractionAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation getTextEntityExtractionAnnotation();
  /**
   * <pre>
   * Annotation value for text entity extraction case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation text_entity_extraction_annotation = 10;</code>
   */
  com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotationOrBuilder getTextEntityExtractionAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for video classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoClassificationAnnotation video_classification_annotation = 4;</code>
   * @return Whether the videoClassificationAnnotation field is set.
   */
  boolean hasVideoClassificationAnnotation();
  /**
   * <pre>
   * Annotation value for video classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoClassificationAnnotation video_classification_annotation = 4;</code>
   * @return The videoClassificationAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.VideoClassificationAnnotation getVideoClassificationAnnotation();
  /**
   * <pre>
   * Annotation value for video classification case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoClassificationAnnotation video_classification_annotation = 4;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoClassificationAnnotationOrBuilder getVideoClassificationAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for video object detection and tracking case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoObjectTrackingAnnotation video_object_tracking_annotation = 5;</code>
   * @return Whether the videoObjectTrackingAnnotation field is set.
   */
  boolean hasVideoObjectTrackingAnnotation();
  /**
   * <pre>
   * Annotation value for video object detection and tracking case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoObjectTrackingAnnotation video_object_tracking_annotation = 5;</code>
   * @return The videoObjectTrackingAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.VideoObjectTrackingAnnotation getVideoObjectTrackingAnnotation();
  /**
   * <pre>
   * Annotation value for video object detection and tracking case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoObjectTrackingAnnotation video_object_tracking_annotation = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoObjectTrackingAnnotationOrBuilder getVideoObjectTrackingAnnotationOrBuilder();

  /**
   * <pre>
   * Annotation value for video event case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoEventAnnotation video_event_annotation = 6;</code>
   * @return Whether the videoEventAnnotation field is set.
   */
  boolean hasVideoEventAnnotation();
  /**
   * <pre>
   * Annotation value for video event case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoEventAnnotation video_event_annotation = 6;</code>
   * @return The videoEventAnnotation.
   */
  com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation getVideoEventAnnotation();
  /**
   * <pre>
   * Annotation value for video event case.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.VideoEventAnnotation video_event_annotation = 6;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoEventAnnotationOrBuilder getVideoEventAnnotationOrBuilder();

  public com.google.cloud.datalabeling.v1beta1.AnnotationValue.ValueTypeCase getValueTypeCase();
}
