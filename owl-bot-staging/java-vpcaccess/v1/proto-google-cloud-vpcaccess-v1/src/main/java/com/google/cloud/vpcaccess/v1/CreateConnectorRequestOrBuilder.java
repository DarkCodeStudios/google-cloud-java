// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vpcaccess/v1/vpc_access.proto

package com.google.cloud.vpcaccess.v1;

public interface CreateConnectorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vpcaccess.v1.CreateConnectorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location in which the configuration should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location in which the configuration should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The ID to use for this connector.
   * </pre>
   *
   * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The connectorId.
   */
  java.lang.String getConnectorId();
  /**
   * <pre>
   * Required. The ID to use for this connector.
   * </pre>
   *
   * <code>string connector_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for connectorId.
   */
  com.google.protobuf.ByteString
      getConnectorIdBytes();

  /**
   * <pre>
   * Required. Resource to create.
   * </pre>
   *
   * <code>.google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the connector field is set.
   */
  boolean hasConnector();
  /**
   * <pre>
   * Required. Resource to create.
   * </pre>
   *
   * <code>.google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The connector.
   */
  com.google.cloud.vpcaccess.v1.Connector getConnector();
  /**
   * <pre>
   * Required. Resource to create.
   * </pre>
   *
   * <code>.google.cloud.vpcaccess.v1.Connector connector = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vpcaccess.v1.ConnectorOrBuilder getConnectorOrBuilder();
}
