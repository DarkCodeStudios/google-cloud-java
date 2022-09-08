// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/memcache/v1/cloud_memcache.proto

package com.google.cloud.memcache.v1;

public interface MemcacheParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memcache.v1.MemcacheParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The unique ID associated with this set of parameters. Users
   * can use this id to determine if the parameters associated with the instance
   * differ from the parameters associated with the nodes and any action needs
   * to be taken to apply parameters on nodes.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The unique ID associated with this set of parameters. Users
   * can use this id to determine if the parameters associated with the instance
   * differ from the parameters associated with the nodes and any action needs
   * to be taken to apply parameters on nodes.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  int getParamsCount();
  /**
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  boolean containsParams(
      java.lang.String key);
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParams();
  /**
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParamsMap();
  /**
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */

  /* nullable */
java.lang.String getParamsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * User defined set of parameters to use in the memcached process.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */

  java.lang.String getParamsOrThrow(
      java.lang.String key);
}
