// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

public interface MetadataIntegrationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.MetadataIntegration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The integration config for the Data Catalog service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
   * @return Whether the dataCatalogConfig field is set.
   */
  boolean hasDataCatalogConfig();
  /**
   * <pre>
   * The integration config for the Data Catalog service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
   * @return The dataCatalogConfig.
   */
  com.google.cloud.metastore.v1alpha.DataCatalogConfig getDataCatalogConfig();
  /**
   * <pre>
   * The integration config for the Data Catalog service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataCatalogConfig data_catalog_config = 1;</code>
   */
  com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder getDataCatalogConfigOrBuilder();

  /**
   * <pre>
   * The integration config for the Dataplex service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
   * @return Whether the dataplexConfig field is set.
   */
  boolean hasDataplexConfig();
  /**
   * <pre>
   * The integration config for the Dataplex service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
   * @return The dataplexConfig.
   */
  com.google.cloud.metastore.v1alpha.DataplexConfig getDataplexConfig();
  /**
   * <pre>
   * The integration config for the Dataplex service.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1alpha.DataplexConfig dataplex_config = 2;</code>
   */
  com.google.cloud.metastore.v1alpha.DataplexConfigOrBuilder getDataplexConfigOrBuilder();
}
