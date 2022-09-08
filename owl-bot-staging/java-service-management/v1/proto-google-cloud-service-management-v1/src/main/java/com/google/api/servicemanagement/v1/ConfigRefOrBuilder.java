// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface ConfigRefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ConfigRef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of a service config. It must have the following
   * format: "services/{service name}/configs/{config id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of a service config. It must have the following
   * format: "services/{service name}/configs/{config id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
