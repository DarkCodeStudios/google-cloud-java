// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The static IP address represented by this resource.
   * </pre>
   *
   * <code>optional string address = 462920692;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * The static IP address represented by this resource.
   * </pre>
   *
   * <code>optional string address = 462920692;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * The static IP address represented by this resource.
   * </pre>
   *
   * <code>optional string address = 462920692;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
   * Check the AddressType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string address_type = 264307877;</code>
   * @return Whether the addressType field is set.
   */
  boolean hasAddressType();
  /**
   * <pre>
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
   * Check the AddressType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string address_type = 264307877;</code>
   * @return The addressType.
   */
  java.lang.String getAddressType();
  /**
   * <pre>
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
   * Check the AddressType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string address_type = 264307877;</code>
   * @return The bytes for addressType.
   */
  com.google.protobuf.ByteString
      getAddressTypeBytes();

  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString
      getCreationTimestampBytes();

  /**
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional description of this resource. Provide this field when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
   * Check the IpVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ip_version = 294959552;</code>
   * @return Whether the ipVersion field is set.
   */
  boolean hasIpVersion();
  /**
   * <pre>
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
   * Check the IpVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ip_version = 294959552;</code>
   * @return The ipVersion.
   */
  java.lang.String getIpVersion();
  /**
   * <pre>
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
   * Check the IpVersion enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ip_version = 294959552;</code>
   * @return The bytes for ipVersion.
   */
  com.google.protobuf.ByteString
      getIpVersionBytes();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#address for addresses.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#address for addresses.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#address for addresses.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   * @return Whether the networkTier field is set.
   */
  boolean hasNetworkTier();
  /**
   * <pre>
   * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   * @return The networkTier.
   */
  java.lang.String getNetworkTier();
  /**
   * <pre>
   * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   * @return The bytes for networkTier.
   */
  com.google.protobuf.ByteString
      getNetworkTierBytes();

  /**
   * <pre>
   * The prefix length if the resource represents an IP range.
   * </pre>
   *
   * <code>optional int32 prefix_length = 453565747;</code>
   * @return Whether the prefixLength field is set.
   */
  boolean hasPrefixLength();
  /**
   * <pre>
   * The prefix length if the resource represents an IP range.
   * </pre>
   *
   * <code>optional int32 prefix_length = 453565747;</code>
   * @return The prefixLength.
   */
  int getPrefixLength();

  /**
   * <pre>
   * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
   * Check the Purpose enum for the list of possible values.
   * </pre>
   *
   * <code>optional string purpose = 316407070;</code>
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();
  /**
   * <pre>
   * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
   * Check the Purpose enum for the list of possible values.
   * </pre>
   *
   * <code>optional string purpose = 316407070;</code>
   * @return The purpose.
   */
  java.lang.String getPurpose();
  /**
   * <pre>
   * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
   * Check the Purpose enum for the list of possible values.
   * </pre>
   *
   * <code>optional string purpose = 316407070;</code>
   * @return The bytes for purpose.
   */
  com.google.protobuf.ByteString
      getPurposeBytes();

  /**
   * <pre>
   * [Output Only] The URL of the region where a regional address resides. For regional addresses, you must specify the region as a path parameter in the HTTP request URL. *This field is not applicable to global addresses.*
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   * <pre>
   * [Output Only] The URL of the region where a regional address resides. For regional addresses, you must specify the region as a path parameter in the HTTP request URL. *This field is not applicable to global addresses.*
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * [Output Only] The URL of the region where a regional address resides. For regional addresses, you must specify the region as a path parameter in the HTTP request URL. *This field is not applicable to global addresses.*
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();
  /**
   * <pre>
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   * <pre>
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString
      getSubnetworkBytes();

  /**
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   * @return A list containing the users.
   */
  java.util.List<java.lang.String>
      getUsersList();
  /**
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   * @return The count of users.
   */
  int getUsersCount();
  /**
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   * @param index The index of the element to return.
   * @return The users at the given index.
   */
  java.lang.String getUsers(int index);
  /**
   * <pre>
   * [Output Only] The URLs of the resources that are using this address.
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   * @param index The index of the value to return.
   * @return The bytes of the users at the given index.
   */
  com.google.protobuf.ByteString
      getUsersBytes(int index);
}
