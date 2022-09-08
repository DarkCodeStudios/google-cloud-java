// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface AnalyzeSyntaxResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.AnalyzeSyntaxResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sentences in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Sentence sentences = 1;</code>
   */
  java.util.List<com.google.cloud.language.v1beta2.Sentence> 
      getSentencesList();
  /**
   * <pre>
   * Sentences in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Sentence sentences = 1;</code>
   */
  com.google.cloud.language.v1beta2.Sentence getSentences(int index);
  /**
   * <pre>
   * Sentences in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Sentence sentences = 1;</code>
   */
  int getSentencesCount();
  /**
   * <pre>
   * Sentences in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Sentence sentences = 1;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1beta2.SentenceOrBuilder> 
      getSentencesOrBuilderList();
  /**
   * <pre>
   * Sentences in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Sentence sentences = 1;</code>
   */
  com.google.cloud.language.v1beta2.SentenceOrBuilder getSentencesOrBuilder(
      int index);

  /**
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Token tokens = 2;</code>
   */
  java.util.List<com.google.cloud.language.v1beta2.Token> 
      getTokensList();
  /**
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Token tokens = 2;</code>
   */
  com.google.cloud.language.v1beta2.Token getTokens(int index);
  /**
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Token tokens = 2;</code>
   */
  int getTokensCount();
  /**
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Token tokens = 2;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1beta2.TokenOrBuilder> 
      getTokensOrBuilderList();
  /**
   * <pre>
   * Tokens, along with their syntactic information, in the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1beta2.Token tokens = 2;</code>
   */
  com.google.cloud.language.v1beta2.TokenOrBuilder getTokensOrBuilder(
      int index);

  /**
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1beta2.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 3;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1beta2.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 3;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();
}
