// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface ListLocationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListLocationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A full list of GKE locations.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Location locations = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.Location> 
      getLocationsList();
  /**
   * <pre>
   * A full list of GKE locations.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Location locations = 1;</code>
   */
  com.google.container.v1beta1.Location getLocations(int index);
  /**
   * <pre>
   * A full list of GKE locations.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Location locations = 1;</code>
   */
  int getLocationsCount();
  /**
   * <pre>
   * A full list of GKE locations.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Location locations = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.LocationOrBuilder> 
      getLocationsOrBuilderList();
  /**
   * <pre>
   * A full list of GKE locations.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.Location locations = 1;</code>
   */
  com.google.container.v1beta1.LocationOrBuilder getLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Only return ListLocationsResponse that occur after the page_token. This
   * value should be populated from the ListLocationsResponse.next_page_token if
   * that response token was set (which happens when listing more Locations than
   * fit in a single ListLocationsResponse).
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Only return ListLocationsResponse that occur after the page_token. This
   * value should be populated from the ListLocationsResponse.next_page_token if
   * that response token was set (which happens when listing more Locations than
   * fit in a single ListLocationsResponse).
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
