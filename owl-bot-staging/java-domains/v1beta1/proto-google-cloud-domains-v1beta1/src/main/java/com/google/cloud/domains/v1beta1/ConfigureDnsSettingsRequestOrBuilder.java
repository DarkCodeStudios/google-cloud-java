// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

public interface ConfigureDnsSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.ConfigureDnsSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the `Registration` whose DNS settings are being updated,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The registration.
   */
  java.lang.String getRegistration();
  /**
   * <pre>
   * Required. The name of the `Registration` whose DNS settings are being updated,
   * in the format `projects/&#42;&#47;locations/&#42;&#47;registrations/&#42;`.
   * </pre>
   *
   * <code>string registration = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for registration.
   */
  com.google.protobuf.ByteString
      getRegistrationBytes();

  /**
   * <pre>
   * Fields of the `DnsSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings dns_settings = 2;</code>
   * @return Whether the dnsSettings field is set.
   */
  boolean hasDnsSettings();
  /**
   * <pre>
   * Fields of the `DnsSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings dns_settings = 2;</code>
   * @return The dnsSettings.
   */
  com.google.cloud.domains.v1beta1.DnsSettings getDnsSettings();
  /**
   * <pre>
   * Fields of the `DnsSettings` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings dns_settings = 2;</code>
   */
  com.google.cloud.domains.v1beta1.DnsSettingsOrBuilder getDnsSettingsOrBuilder();

  /**
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the name servers are being updated for an existing
   * Custom DNS configuration, the `update_mask` is
   * `"custom_dns.name_servers"`.
   * When changing the DNS provider from one type to another, pass the new
   * provider's field name as part of the field mask. For example, when changing
   * from a Google Domains DNS configuration to a Custom DNS configuration, the
   * `update_mask` is `"custom_dns"`. //
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the name servers are being updated for an existing
   * Custom DNS configuration, the `update_mask` is
   * `"custom_dns.name_servers"`.
   * When changing the DNS provider from one type to another, pass the new
   * provider's field name as part of the field mask. For example, when changing
   * from a Google Domains DNS configuration to a Custom DNS configuration, the
   * `update_mask` is `"custom_dns"`. //
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the name servers are being updated for an existing
   * Custom DNS configuration, the `update_mask` is
   * `"custom_dns.name_servers"`.
   * When changing the DNS provider from one type to another, pass the new
   * provider's field name as part of the field mask. For example, when changing
   * from a Google Domains DNS configuration to a Custom DNS configuration, the
   * `update_mask` is `"custom_dns"`. //
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Validate the request without actually updating the DNS settings.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
