/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1beta1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Redis instances are managed and addressed at regional level so
   * location_id here refers to a GCP region; however, users may choose which
   * specific zone (or collection of zones for cross-zone instances) an instance
   * should be provisioned in. Refer to [location_id] and
   * [alternative_location_id] fields for more details.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Redis instances are managed and addressed at regional level so
   * location_id here refers to a GCP region; however, users may choose which
   * specific zone (or collection of zones for cross-zone instances) an instance
   * should be provisioned in. Refer to [location_id] and
   * [alternative_location_id] fields for more details.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * An arbitrary and optional user-provided name for the instance.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * An arbitrary and optional user-provided name for the instance.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The zone where the instance will be provisioned. If not provided,
   * the service will choose a zone for the instance. For STANDARD_HA tier,
   * instances will be created across two zones for protection against zonal
   * failures. If [alternative_location_id] is also provided, it must be
   * different from [location_id].
   * </pre>
   *
   * <code>string location_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Optional. The zone where the instance will be provisioned. If not provided,
   * the service will choose a zone for the instance. For STANDARD_HA tier,
   * instances will be created across two zones for protection against zonal
   * failures. If [alternative_location_id] is also provided, it must be
   * different from [location_id].
   * </pre>
   *
   * <code>string location_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Only applicable to STANDARD_HA tier which protects the instance
   * against zonal failures by provisioning it across two zones. If provided, it
   * must be a different zone from the one provided in [location_id].
   * </pre>
   *
   * <code>string alternative_location_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getAlternativeLocationId();
  /**
   *
   *
   * <pre>
   * Optional. Only applicable to STANDARD_HA tier which protects the instance
   * against zonal failures by provisioning it across two zones. If provided, it
   * must be a different zone from the one provided in [location_id].
   * </pre>
   *
   * <code>string alternative_location_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getAlternativeLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The version of Redis software.
   * If not provided, latest supported version will be used. Updating the
   * version will perform an upgrade/downgrade to the new version. Currently,
   * the supported values are:
   *  *   `REDIS_4_0` for Redis 4.0 compatibility (default)
   *  *   `REDIS_3_2` for Redis 3.2 compatibility
   * </pre>
   *
   * <code>string redis_version = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getRedisVersion();
  /**
   *
   *
   * <pre>
   * Optional. The version of Redis software.
   * If not provided, latest supported version will be used. Updating the
   * version will perform an upgrade/downgrade to the new version. Currently,
   * the supported values are:
   *  *   `REDIS_4_0` for Redis 4.0 compatibility (default)
   *  *   `REDIS_3_2` for Redis 3.2 compatibility
   * </pre>
   *
   * <code>string redis_version = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getRedisVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The CIDR range of internal addresses that are reserved for this
   * instance. If not provided, the service will choose an unused /29 block,
   * for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be unique
   * and non-overlapping with existing subnets in an authorized network.
   * </pre>
   *
   * <code>string reserved_ip_range = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getReservedIpRange();
  /**
   *
   *
   * <pre>
   * Optional. The CIDR range of internal addresses that are reserved for this
   * instance. If not provided, the service will choose an unused /29 block,
   * for example, 10.0.0.0/29 or 192.168.0.0/29. Ranges must be unique
   * and non-overlapping with existing subnets in an authorized network.
   * </pre>
   *
   * <code>string reserved_ip_range = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getReservedIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed Redis endpoint used by
   * clients to connect to the service.
   * </pre>
   *
   * <code>string host = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed Redis endpoint used by
   * clients to connect to the service.
   * </pre>
   *
   * <code>string host = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Output only. The port number of the exposed Redis endpoint.
   * </pre>
   *
   * <code>int32 port = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Output only. The current zone where the Redis endpoint is placed. For Basic
   * Tier instances, this will always be the same as the [location_id]
   * provided by the user at creation time. For Standard Tier instances,
   * this can be either [location_id] or [alternative_location_id] and can
   * change after a failover event.
   * </pre>
   *
   * <code>string current_location_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getCurrentLocationId();
  /**
   *
   *
   * <pre>
   * Output only. The current zone where the Redis endpoint is placed. For Basic
   * Tier instances, this will always be the same as the [location_id]
   * provided by the user at creation time. For Standard Tier instances,
   * this can be either [location_id] or [alternative_location_id] and can
   * change after a failover event.
   * </pre>
   *
   * <code>string current_location_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getCurrentLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.State state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.State state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.v1beta1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current status of this
   * instance, if available.
   * </pre>
   *
   * <code>string status_message = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current status of this
   * instance, if available.
   * </pre>
   *
   * <code>string status_message = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis 3.2 and above:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis 4.0 and above:
   *  *   activedefrag
   *  *   lfu-log-factor
   *  *   lfu-decay-time
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getRedisConfigsCount();
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis 3.2 and above:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis 4.0 and above:
   *  *   activedefrag
   *  *   lfu-log-factor
   *  *   lfu-decay-time
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsRedisConfigs(java.lang.String key);
  /** Use {@link #getRedisConfigsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigs();
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis 3.2 and above:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis 4.0 and above:
   *  *   activedefrag
   *  *   lfu-log-factor
   *  *   lfu-decay-time
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigsMap();
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis 3.2 and above:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis 4.0 and above:
   *  *   activedefrag
   *  *   lfu-log-factor
   *  *   lfu-decay-time
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getRedisConfigsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis 3.2 and above:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis 4.0 and above:
   *  *   activedefrag
   *  *   lfu-log-factor
   *  *   lfu-decay-time
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getRedisConfigsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The service tier of the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.Tier tier = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * Required. The service tier of the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.Instance.Tier tier = 17 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.redis.v1beta1.Instance.Tier getTier();

  /**
   *
   *
   * <pre>
   * Required. Redis memory size in GiB.
   * </pre>
   *
   * <code>int32 memory_size_gb = 18 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getMemorySizeGb();

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getAuthorizedNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getAuthorizedNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cloud IAM identity used by import / export operations to
   * transfer data to/from Cloud Storage. Format is
   * "serviceAccount:&lt;service_account_email&gt;". The value may change over time
   * for a given instance so should be checked before each import/export
   * operation.
   * </pre>
   *
   * <code>string persistence_iam_identity = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getPersistenceIamIdentity();
  /**
   *
   *
   * <pre>
   * Output only. Cloud IAM identity used by import / export operations to
   * transfer data to/from Cloud Storage. Format is
   * "serviceAccount:&lt;service_account_email&gt;". The value may change over time
   * for a given instance so should be checked before each import/export
   * operation.
   * </pre>
   *
   * <code>string persistence_iam_identity = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getPersistenceIamIdentityBytes();
}
