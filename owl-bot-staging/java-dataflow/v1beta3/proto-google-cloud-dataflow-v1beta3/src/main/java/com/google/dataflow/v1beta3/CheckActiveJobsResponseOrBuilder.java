// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

public interface CheckActiveJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.CheckActiveJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If True, active jobs exists for project. False otherwise.
   * </pre>
   *
   * <code>bool active_jobs_exist = 1;</code>
   * @return The activeJobsExist.
   */
  boolean getActiveJobsExist();
}
