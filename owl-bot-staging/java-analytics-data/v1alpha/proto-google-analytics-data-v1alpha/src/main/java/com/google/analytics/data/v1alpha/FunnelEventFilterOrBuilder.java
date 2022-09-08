// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelEventFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelEventFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   * @return Whether the eventName field is set.
   */
  boolean hasEventName();
  /**
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   * @return The eventName.
   */
  java.lang.String getEventName();
  /**
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   * @return The bytes for eventName.
   */
  com.google.protobuf.ByteString
      getEventNameBytes();

  /**
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;</code>
   * @return Whether the funnelParameterFilterExpression field is set.
   */
  boolean hasFunnelParameterFilterExpression();
  /**
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;</code>
   * @return The funnelParameterFilterExpression.
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpression getFunnelParameterFilterExpression();
  /**
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;</code>
   */
  com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder getFunnelParameterFilterExpressionOrBuilder();
}
