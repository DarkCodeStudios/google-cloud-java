// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface SourceProvenanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.SourceProvenance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource resolved_storage_source = 3;</code>
   * @return Whether the resolvedStorageSource field is set.
   */
  boolean hasResolvedStorageSource();
  /**
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource resolved_storage_source = 3;</code>
   * @return The resolvedStorageSource.
   */
  com.google.cloudbuild.v1.StorageSource getResolvedStorageSource();
  /**
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource resolved_storage_source = 3;</code>
   */
  com.google.cloudbuild.v1.StorageSourceOrBuilder getResolvedStorageSourceOrBuilder();

  /**
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource resolved_repo_source = 6;</code>
   * @return Whether the resolvedRepoSource field is set.
   */
  boolean hasResolvedRepoSource();
  /**
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource resolved_repo_source = 6;</code>
   * @return The resolvedRepoSource.
   */
  com.google.cloudbuild.v1.RepoSource getResolvedRepoSource();
  /**
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource resolved_repo_source = 6;</code>
   */
  com.google.cloudbuild.v1.RepoSourceOrBuilder getResolvedRepoSourceOrBuilder();

  /**
   * <pre>
   * A copy of the build's `source.storage_source_manifest`, if exists, with any
   * revisions resolved.
   * This feature is in Preview.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSourceManifest resolved_storage_source_manifest = 9;</code>
   * @return Whether the resolvedStorageSourceManifest field is set.
   */
  boolean hasResolvedStorageSourceManifest();
  /**
   * <pre>
   * A copy of the build's `source.storage_source_manifest`, if exists, with any
   * revisions resolved.
   * This feature is in Preview.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSourceManifest resolved_storage_source_manifest = 9;</code>
   * @return The resolvedStorageSourceManifest.
   */
  com.google.cloudbuild.v1.StorageSourceManifest getResolvedStorageSourceManifest();
  /**
   * <pre>
   * A copy of the build's `source.storage_source_manifest`, if exists, with any
   * revisions resolved.
   * This feature is in Preview.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSourceManifest resolved_storage_source_manifest = 9;</code>
   */
  com.google.cloudbuild.v1.StorageSourceManifestOrBuilder getResolvedStorageSourceManifestOrBuilder();

  /**
   * <pre>
   * Output only. Hash(es) of the build source, which can be used to verify that
   * the original source integrity was maintained in the build. Note that
   * `FileHashes` will only be populated if `BuildOptions` has requested a
   * `SourceProvenanceHash`.
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   * If the build source came in a single package such as a gzipped tarfile
   * (`.tar.gz`), the `FileHash` will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.FileHashes&gt; file_hashes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getFileHashesCount();
  /**
   * <pre>
   * Output only. Hash(es) of the build source, which can be used to verify that
   * the original source integrity was maintained in the build. Note that
   * `FileHashes` will only be populated if `BuildOptions` has requested a
   * `SourceProvenanceHash`.
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   * If the build source came in a single package such as a gzipped tarfile
   * (`.tar.gz`), the `FileHash` will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.FileHashes&gt; file_hashes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsFileHashes(
      java.lang.String key);
  /**
   * Use {@link #getFileHashesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloudbuild.v1.FileHashes>
  getFileHashes();
  /**
   * <pre>
   * Output only. Hash(es) of the build source, which can be used to verify that
   * the original source integrity was maintained in the build. Note that
   * `FileHashes` will only be populated if `BuildOptions` has requested a
   * `SourceProvenanceHash`.
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   * If the build source came in a single package such as a gzipped tarfile
   * (`.tar.gz`), the `FileHash` will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.FileHashes&gt; file_hashes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, com.google.cloudbuild.v1.FileHashes>
  getFileHashesMap();
  /**
   * <pre>
   * Output only. Hash(es) of the build source, which can be used to verify that
   * the original source integrity was maintained in the build. Note that
   * `FileHashes` will only be populated if `BuildOptions` has requested a
   * `SourceProvenanceHash`.
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   * If the build source came in a single package such as a gzipped tarfile
   * (`.tar.gz`), the `FileHash` will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.FileHashes&gt; file_hashes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  /* nullable */
com.google.cloudbuild.v1.FileHashes getFileHashesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloudbuild.v1.FileHashes defaultValue);
  /**
   * <pre>
   * Output only. Hash(es) of the build source, which can be used to verify that
   * the original source integrity was maintained in the build. Note that
   * `FileHashes` will only be populated if `BuildOptions` has requested a
   * `SourceProvenanceHash`.
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   * If the build source came in a single package such as a gzipped tarfile
   * (`.tar.gz`), the `FileHash` will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .google.devtools.cloudbuild.v1.FileHashes&gt; file_hashes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  com.google.cloudbuild.v1.FileHashes getFileHashesOrThrow(
      java.lang.String key);
}
