// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/resource.proto

package com.google.cloud.speech.v1p1beta1;

public interface TranscriptNormalizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.TranscriptNormalization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of replacement entries. We will perform replacement with one entry
   * at a time. For example, the second entry in ["cat" =&gt; "dog", "mountain cat"
   * =&gt; "mountain dog"] will never be applied because we will always process the
   * first entry before it. At most 100 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry entries = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry> 
      getEntriesList();
  /**
   * <pre>
   * A list of replacement entries. We will perform replacement with one entry
   * at a time. For example, the second entry in ["cat" =&gt; "dog", "mountain cat"
   * =&gt; "mountain dog"] will never be applied because we will always process the
   * first entry before it. At most 100 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry entries = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry getEntries(int index);
  /**
   * <pre>
   * A list of replacement entries. We will perform replacement with one entry
   * at a time. For example, the second entry in ["cat" =&gt; "dog", "mountain cat"
   * =&gt; "mountain dog"] will never be applied because we will always process the
   * first entry before it. At most 100 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * A list of replacement entries. We will perform replacement with one entry
   * at a time. For example, the second entry in ["cat" =&gt; "dog", "mountain cat"
   * =&gt; "mountain dog"] will never be applied because we will always process the
   * first entry before it. At most 100 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry entries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.TranscriptNormalization.EntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * A list of replacement entries. We will perform replacement with one entry
   * at a time. For example, the second entry in ["cat" =&gt; "dog", "mountain cat"
   * =&gt; "mountain dog"] will never be applied because we will always process the
   * first entry before it. At most 100 entries.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.TranscriptNormalization.Entry entries = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.TranscriptNormalization.EntryOrBuilder getEntriesOrBuilder(
      int index);
}
