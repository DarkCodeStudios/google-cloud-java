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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface SearchCatalogRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.SearchCatalogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The scope of this search request.
   * The `scope` is invalid if `include_org_ids`, `include_project_ids` are
   * empty AND `include_gcp_public_datasets` is set to `false`. In this case,
   * the request returns an error.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SearchCatalogRequest.Scope scope = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the scope field is set.
   */
  boolean hasScope();
  /**
   *
   *
   * <pre>
   * Required. The scope of this search request.
   * The `scope` is invalid if `include_org_ids`, `include_project_ids` are
   * empty AND `include_gcp_public_datasets` is set to `false`. In this case,
   * the request returns an error.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SearchCatalogRequest.Scope scope = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The scope.
   */
  com.google.cloud.datacatalog.v1.SearchCatalogRequest.Scope getScope();
  /**
   *
   *
   * <pre>
   * Required. The scope of this search request.
   * The `scope` is invalid if `include_org_ids`, `include_project_ids` are
   * empty AND `include_gcp_public_datasets` is set to `false`. In this case,
   * the request returns an error.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.SearchCatalogRequest.Scope scope = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.SearchCatalogRequest.ScopeOrBuilder getScopeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The query string with a minimum of 3 characters and specific syntax.
   * For more information, see
   * [Data Catalog search
   * syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference).
   * An empty query string returns all data assets (in the specified scope)
   * that you have access to.
   * A query string can be a simple `xyz` or qualified by predicates:
   * * `name:x`
   * * `column:y`
   * * `description:z`
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. The query string with a minimum of 3 characters and specific syntax.
   * For more information, see
   * [Data Catalog search
   * syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference).
   * An empty query string returns all data assets (in the specified scope)
   * that you have access to.
   * A query string can be a simple `xyz` or qualified by predicates:
   * * `name:x`
   * * `column:y`
   * * `description:z`
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Number of results to return in a single search page.
   * Can't be negative or 0, defaults to 10 in this case.
   * The maximum number is 1000. If exceeded, throws an "invalid argument"
   * exception.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Pagination token that, if specified, returns the next page of search
   * results. If empty, returns the first page.
   * This token is returned in the [SearchCatalogResponse.next_page_token][google.cloud.datacatalog.v1.SearchCatalogResponse.next_page_token]
   * field of the response to a previous
   * [SearchCatalogRequest][google.cloud.datacatalog.v1.DataCatalog.SearchCatalog]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Pagination token that, if specified, returns the next page of search
   * results. If empty, returns the first page.
   * This token is returned in the [SearchCatalogResponse.next_page_token][google.cloud.datacatalog.v1.SearchCatalogResponse.next_page_token]
   * field of the response to a previous
   * [SearchCatalogRequest][google.cloud.datacatalog.v1.DataCatalog.SearchCatalog]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Specifies the order of results.
   * Currently supported case-sensitive values are:
   * * `relevance` that can only be descending
   * * `last_modified_timestamp [asc|desc]` with descending (`desc`) as default
   * * `default` that can only be descending
   * If this parameter is omitted, it defaults to the descending `relevance`.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Specifies the order of results.
   * Currently supported case-sensitive values are:
   * * `relevance` that can only be descending
   * * `last_modified_timestamp [asc|desc]` with descending (`desc`) as default
   * * `default` that can only be descending
   * If this parameter is omitted, it defaults to the descending `relevance`.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}