/*
 * Copyright 2020 Google LLC
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
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

public interface SourceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.source.SourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A SourceContext referring to a revision in a Google Cloud Source Repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.CloudRepoSourceContext cloud_repo = 1;</code>
   *
   * @return Whether the cloudRepo field is set.
   */
  boolean hasCloudRepo();
  /**
   *
   *
   * <pre>
   * A SourceContext referring to a revision in a Google Cloud Source Repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.CloudRepoSourceContext cloud_repo = 1;</code>
   *
   * @return The cloudRepo.
   */
  io.grafeas.v1beta1.source.CloudRepoSourceContext getCloudRepo();
  /**
   *
   *
   * <pre>
   * A SourceContext referring to a revision in a Google Cloud Source Repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.CloudRepoSourceContext cloud_repo = 1;</code>
   */
  io.grafeas.v1beta1.source.CloudRepoSourceContextOrBuilder getCloudRepoOrBuilder();

  /**
   *
   *
   * <pre>
   * A SourceContext referring to a Gerrit project.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.GerritSourceContext gerrit = 2;</code>
   *
   * @return Whether the gerrit field is set.
   */
  boolean hasGerrit();
  /**
   *
   *
   * <pre>
   * A SourceContext referring to a Gerrit project.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.GerritSourceContext gerrit = 2;</code>
   *
   * @return The gerrit.
   */
  io.grafeas.v1beta1.source.GerritSourceContext getGerrit();
  /**
   *
   *
   * <pre>
   * A SourceContext referring to a Gerrit project.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.GerritSourceContext gerrit = 2;</code>
   */
  io.grafeas.v1beta1.source.GerritSourceContextOrBuilder getGerritOrBuilder();

  /**
   *
   *
   * <pre>
   * A SourceContext referring to any third party Git repo (e.g., GitHub).
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.GitSourceContext git = 3;</code>
   *
   * @return Whether the git field is set.
   */
  boolean hasGit();
  /**
   *
   *
   * <pre>
   * A SourceContext referring to any third party Git repo (e.g., GitHub).
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.GitSourceContext git = 3;</code>
   *
   * @return The git.
   */
  io.grafeas.v1beta1.source.GitSourceContext getGit();
  /**
   *
   *
   * <pre>
   * A SourceContext referring to any third party Git repo (e.g., GitHub).
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.GitSourceContext git = 3;</code>
   */
  io.grafeas.v1beta1.source.GitSourceContextOrBuilder getGitOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  public io.grafeas.v1beta1.source.SourceContext.ContextCase getContextCase();
}