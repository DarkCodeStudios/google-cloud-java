/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/face.proto

package com.google.cloud.vision.v1p4beta1;

public final class CelebrityProto {
  private CelebrityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_Celebrity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_Celebrity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/vision/v1p4beta1/face.pro"
          + "to\022\035google.cloud.vision.v1p4beta1\032\034googl"
          + "e/api/annotations.proto\032,google/cloud/vi"
          + "sion/v1p4beta1/geometry.proto\".\n\025FaceRec"
          + "ognitionParams\022\025\n\rcelebrity_set\030\001 \003(\t\"D\n"
          + "\tCelebrity\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name"
          + "\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\"h\n\025FaceRecog"
          + "nitionResult\022;\n\tcelebrity\030\001 \001(\0132(.google"
          + ".cloud.vision.v1p4beta1.Celebrity\022\022\n\ncon"
          + "fidence\030\002 \001(\002B\204\001\n!com.google.cloud.visio"
          + "n.v1p4beta1B\016CelebrityProtoP\001ZCgoogle.go"
          + "lang.org/genproto/googleapis/cloud/visio"
          + "n/v1p4beta1;vision\370\001\001\242\002\004GCVNb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.vision.v1p4beta1.GeometryProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionParams_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionParams_descriptor,
            new java.lang.String[] {
              "CelebritySet",
            });
    internal_static_google_cloud_vision_v1p4beta1_Celebrity_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1p4beta1_Celebrity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_Celebrity_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description",
            });
    internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_descriptor,
            new java.lang.String[] {
              "Celebrity", "Confidence",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.vision.v1p4beta1.GeometryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
