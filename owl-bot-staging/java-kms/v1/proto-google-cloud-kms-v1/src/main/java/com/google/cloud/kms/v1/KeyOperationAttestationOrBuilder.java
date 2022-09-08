// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface KeyOperationAttestationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.KeyOperationAttestation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The format of the attestation data.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   * <pre>
   * Output only. The format of the attestation data.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat format = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The format.
   */
  com.google.cloud.kms.v1.KeyOperationAttestation.AttestationFormat getFormat();

  /**
   * <pre>
   * Output only. The attestation data provided by the HSM when the key
   * operation was performed.
   * </pre>
   *
   * <code>bytes content = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <pre>
   * Output only. The certificate chains needed to validate the attestation
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.CertificateChains cert_chains = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the certChains field is set.
   */
  boolean hasCertChains();
  /**
   * <pre>
   * Output only. The certificate chains needed to validate the attestation
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.CertificateChains cert_chains = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The certChains.
   */
  com.google.cloud.kms.v1.KeyOperationAttestation.CertificateChains getCertChains();
  /**
   * <pre>
   * Output only. The certificate chains needed to validate the attestation
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyOperationAttestation.CertificateChains cert_chains = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.kms.v1.KeyOperationAttestation.CertificateChainsOrBuilder getCertChainsOrBuilder();
}
