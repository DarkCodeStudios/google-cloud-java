// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface ListBuildTriggersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.ListBuildTriggersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  java.util.List<com.google.cloudbuild.v1.BuildTrigger> 
      getTriggersList();
  /**
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  com.google.cloudbuild.v1.BuildTrigger getTriggers(int index);
  /**
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  int getTriggersCount();
  /**
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.BuildTriggerOrBuilder> 
      getTriggersOrBuilderList();
  /**
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  com.google.cloudbuild.v1.BuildTriggerOrBuilder getTriggersOrBuilder(
      int index);

  /**
   * <pre>
   * Token to receive the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to receive the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
