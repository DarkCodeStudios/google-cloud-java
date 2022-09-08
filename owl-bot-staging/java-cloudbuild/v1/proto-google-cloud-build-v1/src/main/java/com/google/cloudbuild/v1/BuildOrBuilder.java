// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface BuildOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Build)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The 'Build' name with format:
   * `projects/{project}/locations/{location}/builds/{build}`, where {build}
   * is a unique identifier generated by the service.
   * </pre>
   *
   * <code>string name = 45 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The 'Build' name with format:
   * `projects/{project}/locations/{location}/builds/{build}`, where {build}
   * is a unique identifier generated by the service.
   * </pre>
   *
   * <code>string name = 45 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Unique identifier of the build.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. Unique identifier of the build.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. ID of the project.
   * </pre>
   *
   * <code>string project_id = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Output only. ID of the project.
   * </pre>
   *
   * <code>string project_id = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Output only. Status of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.Status status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.Status status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.cloudbuild.v1.Build.Status getStatus();

  /**
   * <pre>
   * Output only. Customer-readable message about the current status.
   * </pre>
   *
   * <code>string status_detail = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   * <pre>
   * Output only. Customer-readable message about the current status.
   * </pre>
   *
   * <code>string status_detail = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString
      getStatusDetailBytes();

  /**
   * <pre>
   * The location of the source files to build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Source source = 3;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * The location of the source files to build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Source source = 3;</code>
   * @return The source.
   */
  com.google.cloudbuild.v1.Source getSource();
  /**
   * <pre>
   * The location of the source files to build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Source source = 3;</code>
   */
  com.google.cloudbuild.v1.SourceOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  java.util.List<com.google.cloudbuild.v1.BuildStep> 
      getStepsList();
  /**
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  com.google.cloudbuild.v1.BuildStep getSteps(int index);
  /**
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  int getStepsCount();
  /**
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.BuildStepOrBuilder> 
      getStepsOrBuilderList();
  /**
   * <pre>
   * Required. The operations to be performed on the workspace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildStep steps = 11;</code>
   */
  com.google.cloudbuild.v1.BuildStepOrBuilder getStepsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Results of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Results results = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the results field is set.
   */
  boolean hasResults();
  /**
   * <pre>
   * Output only. Results of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Results results = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The results.
   */
  com.google.cloudbuild.v1.Results getResults();
  /**
   * <pre>
   * Output only. Results of the build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Results results = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloudbuild.v1.ResultsOrBuilder getResultsOrBuilder();

  /**
   * <pre>
   * Output only. Time at which the request to create the build was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Time at which the request to create the build was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Time at which the request to create the build was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Output only. Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Output only. Time at which execution of the build was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. Time at which execution of the build was finished.
   * The difference between finish_time and start_time is the duration of the
   * build's execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the finishTime field is set.
   */
  boolean hasFinishTime();
  /**
   * <pre>
   * Output only. Time at which execution of the build was finished.
   * The difference between finish_time and start_time is the duration of the
   * build's execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The finishTime.
   */
  com.google.protobuf.Timestamp getFinishTime();
  /**
   * <pre>
   * Output only. Time at which execution of the build was finished.
   * The difference between finish_time and start_time is the duration of the
   * build's execution.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();

  /**
   * <pre>
   * Amount of time that this build should be allowed to run, to second
   * granularity. If this amount of time elapses, work on the build will cease
   * and the build status will be `TIMEOUT`.
   * `timeout` starts ticking from `startTime`.
   * Default time is ten minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * Amount of time that this build should be allowed to run, to second
   * granularity. If this amount of time elapses, work on the build will cease
   * and the build status will be `TIMEOUT`.
   * `timeout` starts ticking from `startTime`.
   * Default time is ten minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * Amount of time that this build should be allowed to run, to second
   * granularity. If this amount of time elapses, work on the build will cease
   * and the build status will be `TIMEOUT`.
   * `timeout` starts ticking from `startTime`.
   * Default time is ten minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 12;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   * @return A list containing the images.
   */
  java.util.List<java.lang.String>
      getImagesList();
  /**
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   * @return The count of images.
   */
  int getImagesCount();
  /**
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   * @param index The index of the element to return.
   * @return The images at the given index.
   */
  java.lang.String getImages(int index);
  /**
   * <pre>
   * A list of images to be pushed upon the successful completion of all build
   * steps.
   * The images are pushed using the builder service account's credentials.
   * The digests of the pushed images will be stored in the `Build` resource's
   * results field.
   * If any of the images fail to be pushed, the build status is marked
   * `FAILURE`.
   * </pre>
   *
   * <code>repeated string images = 13;</code>
   * @param index The index of the value to return.
   * @return The bytes of the images at the given index.
   */
  com.google.protobuf.ByteString
      getImagesBytes(int index);

  /**
   * <pre>
   * TTL in queue for this build. If provided and the build is enqueued longer
   * than this value, the build will expire and the build status will be
   * `EXPIRED`.
   * The TTL starts ticking from create_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration queue_ttl = 40;</code>
   * @return Whether the queueTtl field is set.
   */
  boolean hasQueueTtl();
  /**
   * <pre>
   * TTL in queue for this build. If provided and the build is enqueued longer
   * than this value, the build will expire and the build status will be
   * `EXPIRED`.
   * The TTL starts ticking from create_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration queue_ttl = 40;</code>
   * @return The queueTtl.
   */
  com.google.protobuf.Duration getQueueTtl();
  /**
   * <pre>
   * TTL in queue for this build. If provided and the build is enqueued longer
   * than this value, the build will expire and the build status will be
   * `EXPIRED`.
   * The TTL starts ticking from create_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration queue_ttl = 40;</code>
   */
  com.google.protobuf.DurationOrBuilder getQueueTtlOrBuilder();

  /**
   * <pre>
   * Artifacts produced by the build that should be uploaded upon
   * successful completion of all build steps.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts artifacts = 37;</code>
   * @return Whether the artifacts field is set.
   */
  boolean hasArtifacts();
  /**
   * <pre>
   * Artifacts produced by the build that should be uploaded upon
   * successful completion of all build steps.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts artifacts = 37;</code>
   * @return The artifacts.
   */
  com.google.cloudbuild.v1.Artifacts getArtifacts();
  /**
   * <pre>
   * Artifacts produced by the build that should be uploaded upon
   * successful completion of all build steps.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Artifacts artifacts = 37;</code>
   */
  com.google.cloudbuild.v1.ArtifactsOrBuilder getArtifactsOrBuilder();

  /**
   * <pre>
   * Google Cloud Storage bucket where logs should be written (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * </pre>
   *
   * <code>string logs_bucket = 19;</code>
   * @return The logsBucket.
   */
  java.lang.String getLogsBucket();
  /**
   * <pre>
   * Google Cloud Storage bucket where logs should be written (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
   * </pre>
   *
   * <code>string logs_bucket = 19;</code>
   * @return The bytes for logsBucket.
   */
  com.google.protobuf.ByteString
      getLogsBucketBytes();

  /**
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.SourceProvenance source_provenance = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the sourceProvenance field is set.
   */
  boolean hasSourceProvenance();
  /**
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.SourceProvenance source_provenance = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sourceProvenance.
   */
  com.google.cloudbuild.v1.SourceProvenance getSourceProvenance();
  /**
   * <pre>
   * Output only. A permanent fixed identifier for source.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.SourceProvenance source_provenance = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloudbuild.v1.SourceProvenanceOrBuilder getSourceProvenanceOrBuilder();

  /**
   * <pre>
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it
   * was triggered automatically.
   * </pre>
   *
   * <code>string build_trigger_id = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The buildTriggerId.
   */
  java.lang.String getBuildTriggerId();
  /**
   * <pre>
   * Output only. The ID of the `BuildTrigger` that triggered this build, if it
   * was triggered automatically.
   * </pre>
   *
   * <code>string build_trigger_id = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for buildTriggerId.
   */
  com.google.protobuf.ByteString
      getBuildTriggerIdBytes();

  /**
   * <pre>
   * Special options for this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildOptions options = 23;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   * Special options for this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildOptions options = 23;</code>
   * @return The options.
   */
  com.google.cloudbuild.v1.BuildOptions getOptions();
  /**
   * <pre>
   * Special options for this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildOptions options = 23;</code>
   */
  com.google.cloudbuild.v1.BuildOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <pre>
   * Output only. URL to logs for this build in Google Cloud Console.
   * </pre>
   *
   * <code>string log_url = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The logUrl.
   */
  java.lang.String getLogUrl();
  /**
   * <pre>
   * Output only. URL to logs for this build in Google Cloud Console.
   * </pre>
   *
   * <code>string log_url = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for logUrl.
   */
  com.google.protobuf.ByteString
      getLogUrlBytes();

  /**
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  int getSubstitutionsCount();
  /**
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  boolean containsSubstitutions(
      java.lang.String key);
  /**
   * Use {@link #getSubstitutionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSubstitutions();
  /**
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSubstitutionsMap();
  /**
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */

  /* nullable */
java.lang.String getSubstitutionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Substitutions data for `Build` resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; substitutions = 29;</code>
   */

  java.lang.String getSubstitutionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * Tags for annotation of a `Build`. These are not docker tags.
   * </pre>
   *
   * <code>repeated string tags = 31;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * Note: Secret Manager is the recommended technique
   * for managing sensitive data with Cloud Build. Use `available_secrets` to
   * configure builds to access secrets from Secret Manager. For instructions,
   * see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  java.util.List<com.google.cloudbuild.v1.Secret> 
      getSecretsList();
  /**
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * Note: Secret Manager is the recommended technique
   * for managing sensitive data with Cloud Build. Use `available_secrets` to
   * configure builds to access secrets from Secret Manager. For instructions,
   * see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  com.google.cloudbuild.v1.Secret getSecrets(int index);
  /**
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * Note: Secret Manager is the recommended technique
   * for managing sensitive data with Cloud Build. Use `available_secrets` to
   * configure builds to access secrets from Secret Manager. For instructions,
   * see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  int getSecretsCount();
  /**
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * Note: Secret Manager is the recommended technique
   * for managing sensitive data with Cloud Build. Use `available_secrets` to
   * configure builds to access secrets from Secret Manager. For instructions,
   * see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.SecretOrBuilder> 
      getSecretsOrBuilderList();
  /**
   * <pre>
   * Secrets to decrypt using Cloud Key Management Service.
   * Note: Secret Manager is the recommended technique
   * for managing sensitive data with Cloud Build. Use `available_secrets` to
   * configure builds to access secrets from Secret Manager. For instructions,
   * see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Secret secrets = 32;</code>
   */
  com.google.cloudbuild.v1.SecretOrBuilder getSecretsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps.
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * * SETUPBUILD: time to set up build.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTimingCount();
  /**
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps.
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * * SETUPBUILD: time to set up build.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsTiming(
      java.lang.String key);
  /**
   * Use {@link #getTimingMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloudbuild.v1.TimeSpan>
  getTiming();
  /**
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps.
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * * SETUPBUILD: time to set up build.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, com.google.cloudbuild.v1.TimeSpan>
  getTimingMap();
  /**
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps.
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * * SETUPBUILD: time to set up build.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  /* nullable */
com.google.cloudbuild.v1.TimeSpan getTimingOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloudbuild.v1.TimeSpan defaultValue);
  /**
   * <pre>
   * Output only. Stores timing information for phases of the build. Valid keys
   * are:
   * * BUILD: time to execute all build steps.
   * * PUSH: time to push all specified images.
   * * FETCHSOURCE: time to fetch source.
   * * SETUPBUILD: time to set up build.
   * If the build does not specify source or images,
   * these keys will not be included.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.TimeSpan&gt; timing = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  com.google.cloudbuild.v1.TimeSpan getTimingOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. Describes this build's approval configuration, status,
   * and result.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildApproval approval = 44 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approval field is set.
   */
  boolean hasApproval();
  /**
   * <pre>
   * Output only. Describes this build's approval configuration, status,
   * and result.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildApproval approval = 44 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approval.
   */
  com.google.cloudbuild.v1.BuildApproval getApproval();
  /**
   * <pre>
   * Output only. Describes this build's approval configuration, status,
   * and result.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildApproval approval = 44 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloudbuild.v1.BuildApprovalOrBuilder getApprovalOrBuilder();

  /**
   * <pre>
   * IAM service account whose credentials will be used at build runtime.
   * Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * ACCOUNT can be email address or uniqueId of the service account.
   * </pre>
   *
   * <code>string service_account = 42 [(.google.api.resource_reference) = { ... }</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * IAM service account whose credentials will be used at build runtime.
   * Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * ACCOUNT can be email address or uniqueId of the service account.
   * </pre>
   *
   * <code>string service_account = 42 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * Secrets and secret environment variables.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Secrets available_secrets = 47;</code>
   * @return Whether the availableSecrets field is set.
   */
  boolean hasAvailableSecrets();
  /**
   * <pre>
   * Secrets and secret environment variables.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Secrets available_secrets = 47;</code>
   * @return The availableSecrets.
   */
  com.google.cloudbuild.v1.Secrets getAvailableSecrets();
  /**
   * <pre>
   * Secrets and secret environment variables.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Secrets available_secrets = 47;</code>
   */
  com.google.cloudbuild.v1.SecretsOrBuilder getAvailableSecretsOrBuilder();

  /**
   * <pre>
   * Output only. Non-fatal problems encountered during the execution of the
   * build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build.Warning warnings = 49 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloudbuild.v1.Build.Warning> 
      getWarningsList();
  /**
   * <pre>
   * Output only. Non-fatal problems encountered during the execution of the
   * build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build.Warning warnings = 49 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloudbuild.v1.Build.Warning getWarnings(int index);
  /**
   * <pre>
   * Output only. Non-fatal problems encountered during the execution of the
   * build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build.Warning warnings = 49 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getWarningsCount();
  /**
   * <pre>
   * Output only. Non-fatal problems encountered during the execution of the
   * build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build.Warning warnings = 49 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.Build.WarningOrBuilder> 
      getWarningsOrBuilderList();
  /**
   * <pre>
   * Output only. Non-fatal problems encountered during the execution of the
   * build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build.Warning warnings = 49 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloudbuild.v1.Build.WarningOrBuilder getWarningsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Contains information about the build when status=FAILURE.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.FailureInfo failure_info = 51 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the failureInfo field is set.
   */
  boolean hasFailureInfo();
  /**
   * <pre>
   * Output only. Contains information about the build when status=FAILURE.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.FailureInfo failure_info = 51 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failureInfo.
   */
  com.google.cloudbuild.v1.Build.FailureInfo getFailureInfo();
  /**
   * <pre>
   * Output only. Contains information about the build when status=FAILURE.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build.FailureInfo failure_info = 51 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloudbuild.v1.Build.FailureInfoOrBuilder getFailureInfoOrBuilder();
}
