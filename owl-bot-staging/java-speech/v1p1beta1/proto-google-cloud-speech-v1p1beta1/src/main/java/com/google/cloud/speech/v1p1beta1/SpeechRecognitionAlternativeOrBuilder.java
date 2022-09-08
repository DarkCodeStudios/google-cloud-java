// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface SpeechRecognitionAlternativeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Transcript text representing the words that the user spoke.
   * In languages that use spaces to separate words, the transcript might have a
   * leading space if it isn't the first result. You can concatenate each result
   * to obtain the full transcript without using a separator.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   * @return The transcript.
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * Transcript text representing the words that the user spoke.
   * In languages that use spaces to separate words, the transcript might have a
   * leading space if it isn't the first result. You can concatenate each result
   * to obtain the full transcript without using a separator.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is set only for the top alternative of a non-streaming
   * result or, of a streaming result where `is_final=true`.
   * This field is not guaranteed to be accurate and users should not rely on it
   * to be always provided.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   * @return The confidence.
   */
  float getConfidence();

  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.WordInfo words = 3;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.WordInfo> 
      getWordsList();
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.WordInfo words = 3;</code>
   */
  com.google.cloud.speech.v1p1beta1.WordInfo getWords(int index);
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.WordInfo words = 3;</code>
   */
  int getWordsCount();
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.WordInfo words = 3;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder> 
      getWordsOrBuilderList();
  /**
   * <pre>
   * A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.WordInfo words = 3;</code>
   */
  com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder getWordsOrBuilder(
      int index);
}
