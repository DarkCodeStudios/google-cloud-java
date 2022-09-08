// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface BatchUpdateJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.BatchUpdateJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The jobs to be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Job> 
      getJobsList();
  /**
   * <pre>
   * Required. The jobs to be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4beta1.Job getJobs(int index);
  /**
   * <pre>
   * Required. The jobs to be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getJobsCount();
  /**
   * <pre>
   * Required. The jobs to be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <pre>
   * Required. The jobs to be updated.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4beta1.JobOrBuilder getJobsOrBuilder(
      int index);

  /**
   * <pre>
   * Strongly recommended for the best service experience. Be aware that it will
   * also increase latency when checking the status of a batch operation.
   * If [update_mask][google.cloud.talent.v4beta1.BatchUpdateJobsRequest.update_mask] is provided, only the specified fields in
   * [Job][google.cloud.talent.v4beta1.Job] are updated. Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * If [update_mask][google.cloud.talent.v4beta1.BatchUpdateJobsRequest.update_mask] is provided, The [Job][google.cloud.talent.v4beta1.Job] inside
   * [JobResult][google.cloud.talent.v4beta1.JobOperationResult.JobResult]
   * will only contains fields that is updated, plus the Id of the Job.
   * Otherwise,  [Job][google.cloud.talent.v4beta1.Job] will include all fields, which can yield a very
   * large response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Strongly recommended for the best service experience. Be aware that it will
   * also increase latency when checking the status of a batch operation.
   * If [update_mask][google.cloud.talent.v4beta1.BatchUpdateJobsRequest.update_mask] is provided, only the specified fields in
   * [Job][google.cloud.talent.v4beta1.Job] are updated. Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * If [update_mask][google.cloud.talent.v4beta1.BatchUpdateJobsRequest.update_mask] is provided, The [Job][google.cloud.talent.v4beta1.Job] inside
   * [JobResult][google.cloud.talent.v4beta1.JobOperationResult.JobResult]
   * will only contains fields that is updated, plus the Id of the Job.
   * Otherwise,  [Job][google.cloud.talent.v4beta1.Job] will include all fields, which can yield a very
   * large response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Strongly recommended for the best service experience. Be aware that it will
   * also increase latency when checking the status of a batch operation.
   * If [update_mask][google.cloud.talent.v4beta1.BatchUpdateJobsRequest.update_mask] is provided, only the specified fields in
   * [Job][google.cloud.talent.v4beta1.Job] are updated. Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * If [update_mask][google.cloud.talent.v4beta1.BatchUpdateJobsRequest.update_mask] is provided, The [Job][google.cloud.talent.v4beta1.Job] inside
   * [JobResult][google.cloud.talent.v4beta1.JobOperationResult.JobResult]
   * will only contains fields that is updated, plus the Id of the Job.
   * Otherwise,  [Job][google.cloud.talent.v4beta1.Job] will include all fields, which can yield a very
   * large response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
