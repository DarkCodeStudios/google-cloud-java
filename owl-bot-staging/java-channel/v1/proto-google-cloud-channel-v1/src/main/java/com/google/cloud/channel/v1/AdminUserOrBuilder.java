// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/common.proto

package com.google.cloud.channel.v1;

public interface AdminUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.AdminUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Primary email of the admin user.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * Primary email of the admin user.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * Given name of the admin user.
   * </pre>
   *
   * <code>string given_name = 2;</code>
   * @return The givenName.
   */
  java.lang.String getGivenName();
  /**
   * <pre>
   * Given name of the admin user.
   * </pre>
   *
   * <code>string given_name = 2;</code>
   * @return The bytes for givenName.
   */
  com.google.protobuf.ByteString
      getGivenNameBytes();

  /**
   * <pre>
   * Family name of the admin user.
   * </pre>
   *
   * <code>string family_name = 3;</code>
   * @return The familyName.
   */
  java.lang.String getFamilyName();
  /**
   * <pre>
   * Family name of the admin user.
   * </pre>
   *
   * <code>string family_name = 3;</code>
   * @return The bytes for familyName.
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();
}
