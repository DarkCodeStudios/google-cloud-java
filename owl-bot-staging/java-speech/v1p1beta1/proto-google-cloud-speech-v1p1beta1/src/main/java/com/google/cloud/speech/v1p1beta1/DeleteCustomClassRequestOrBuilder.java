// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1p1beta1;

public interface DeleteCustomClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.DeleteCustomClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the custom class to delete. Format:
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the custom class to delete. Format:
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
