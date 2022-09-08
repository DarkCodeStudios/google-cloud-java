// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface GlossaryInputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.GlossaryInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   * For unidirectional glossaries:
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   * For equivalent term sets glossaries:
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. See documentation for more information -
   *   [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   * For unidirectional glossaries:
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   * For equivalent term sets glossaries:
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. See documentation for more information -
   *   [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
   * @return The gcsSource.
   */
  com.google.cloud.translate.v3.GcsSource getGcsSource();
  /**
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   * For unidirectional glossaries:
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   * For equivalent term sets glossaries:
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. See documentation for more information -
   *   [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.translate.v3.GcsSourceOrBuilder getGcsSourceOrBuilder();

  public com.google.cloud.translate.v3.GlossaryInputConfig.SourceCase getSourceCase();
}
