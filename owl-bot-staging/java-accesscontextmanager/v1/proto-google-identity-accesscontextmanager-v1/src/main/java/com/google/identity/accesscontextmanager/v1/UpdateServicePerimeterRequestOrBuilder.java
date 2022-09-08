// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface UpdateServicePerimeterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.UpdateServicePerimeterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The updated `ServicePerimeter`. Syntactic correctness of the
   * `ServicePerimeter` is a precondition for creation.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the servicePerimeter field is set.
   */
  boolean hasServicePerimeter();
  /**
   * <pre>
   * Required. The updated `ServicePerimeter`. Syntactic correctness of the
   * `ServicePerimeter` is a precondition for creation.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The servicePerimeter.
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeter getServicePerimeter();
  /**
   * <pre>
   * Required. The updated `ServicePerimeter`. Syntactic correctness of the
   * `ServicePerimeter` is a precondition for creation.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder getServicePerimeterOrBuilder();

  /**
   * <pre>
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
