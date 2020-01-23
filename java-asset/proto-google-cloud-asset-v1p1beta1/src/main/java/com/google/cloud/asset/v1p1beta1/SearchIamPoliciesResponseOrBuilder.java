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
// source: google/cloud/asset/v1p1beta1/asset_service.proto

package com.google.cloud.asset.v1p1beta1;

public interface SearchIamPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p1beta1.SearchIamPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.IamPolicySearchResult results = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1p1beta1.IamPolicySearchResult> getResultsList();
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.IamPolicySearchResult results = 1;</code>
   */
  com.google.cloud.asset.v1p1beta1.IamPolicySearchResult getResults(int index);
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.IamPolicySearchResult results = 1;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.IamPolicySearchResult results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1p1beta1.IamPolicySearchResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.IamPolicySearchResult results = 1;</code>
   */
  com.google.cloud.asset.v1p1beta1.IamPolicySearchResultOrBuilder getResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Set if there are more results than those appearing in this response; to get
   * the next set of results, call this method again, using this value as the
   * `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Set if there are more results than those appearing in this response; to get
   * the next set of results, call this method again, using this value as the
   * `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
