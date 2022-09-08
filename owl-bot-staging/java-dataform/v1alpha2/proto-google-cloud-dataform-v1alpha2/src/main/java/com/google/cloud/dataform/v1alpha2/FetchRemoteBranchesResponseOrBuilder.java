// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface FetchRemoteBranchesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @return A list containing the branches.
   */
  java.util.List<java.lang.String>
      getBranchesList();
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @return The count of branches.
   */
  int getBranchesCount();
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @param index The index of the element to return.
   * @return The branches at the given index.
   */
  java.lang.String getBranches(int index);
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the branches at the given index.
   */
  com.google.protobuf.ByteString
      getBranchesBytes(int index);
}
