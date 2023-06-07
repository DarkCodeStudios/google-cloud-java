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
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

public interface MetastoreServiceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.MetastoreServiceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Resource name of an existing Dataproc Metastore service.
   *
   * Example:
   *
   * * `projects/[project_id]/locations/[region]/services/[service_id]`
   * </pre>
   *
   * <code>
   * string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The metastoreService.
   */
  java.lang.String getMetastoreService();
  /**
   *
   *
   * <pre>
   * Optional. Resource name of an existing Dataproc Metastore service.
   *
   * Example:
   *
   * * `projects/[project_id]/locations/[region]/services/[service_id]`
   * </pre>
   *
   * <code>
   * string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for metastoreService.
   */
  com.google.protobuf.ByteString getMetastoreServiceBytes();
}
