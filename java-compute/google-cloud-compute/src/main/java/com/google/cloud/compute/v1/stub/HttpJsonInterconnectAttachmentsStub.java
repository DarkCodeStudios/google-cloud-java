/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InterconnectAttachmentsClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.InterconnectAttachmentsClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsRequest;
import com.google.cloud.compute.v1.DeleteInterconnectAttachmentRequest;
import com.google.cloud.compute.v1.GetInterconnectAttachmentRequest;
import com.google.cloud.compute.v1.InsertInterconnectAttachmentRequest;
import com.google.cloud.compute.v1.InterconnectAttachment;
import com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList;
import com.google.cloud.compute.v1.InterconnectAttachmentList;
import com.google.cloud.compute.v1.ListInterconnectAttachmentsRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchInterconnectAttachmentRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the InterconnectAttachments service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonInterconnectAttachmentsStub extends InterconnectAttachmentsStub {
  private static final ApiMethodDescriptor<
          AggregatedListInterconnectAttachmentsRequest, InterconnectAttachmentAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListInterconnectAttachmentsRequest, InterconnectAttachmentAggregatedList>
                  newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectAttachments/AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter
                      .<AggregatedListInterconnectAttachmentsRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/interconnectAttachments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<AggregatedListInterconnectAttachmentsRequest>
                                serializer = ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<AggregatedListInterconnectAttachmentsRequest>
                                serializer = ProtoRestSerializer.create();
                            if (request.hasFilter()) {
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                            }
                            if (request.hasIncludeAllScopes()) {
                              serializer.putQueryParam(
                                  fields, "includeAllScopes", request.getIncludeAllScopes());
                            }
                            if (request.hasMaxResults()) {
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                            }
                            if (request.hasOrderBy()) {
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            }
                            if (request.hasPageToken()) {
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            }
                            if (request.hasReturnPartialSuccess()) {
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectAttachmentAggregatedList>newBuilder()
                      .setDefaultInstance(InterconnectAttachmentAggregatedList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteInterconnectAttachmentRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeleteInterconnectAttachmentRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectAttachments/Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteInterconnectAttachmentRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/interconnectAttachments/{interconnectAttachment}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "interconnectAttachment",
                                request.getInterconnectAttachment());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetInterconnectAttachmentRequest, InterconnectAttachment>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetInterconnectAttachmentRequest, InterconnectAttachment>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectAttachments/Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetInterconnectAttachmentRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/interconnectAttachments/{interconnectAttachment}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "interconnectAttachment",
                                request.getInterconnectAttachment());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectAttachment>newBuilder()
                      .setDefaultInstance(InterconnectAttachment.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<InsertInterconnectAttachmentRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertInterconnectAttachmentRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectAttachments/Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertInterconnectAttachmentRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/interconnectAttachments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<InsertInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<InsertInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            if (request.hasValidateOnly()) {
                              serializer.putQueryParam(
                                  fields, "validateOnly", request.getValidateOnly());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "interconnectAttachmentResource",
                                      request.getInterconnectAttachmentResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListInterconnectAttachmentsRequest, InterconnectAttachmentList>
      listMethodDescriptor =
          ApiMethodDescriptor
              .<ListInterconnectAttachmentsRequest, InterconnectAttachmentList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectAttachments/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListInterconnectAttachmentsRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/interconnectAttachments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListInterconnectAttachmentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListInterconnectAttachmentsRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasFilter()) {
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                            }
                            if (request.hasMaxResults()) {
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                            }
                            if (request.hasOrderBy()) {
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            }
                            if (request.hasPageToken()) {
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            }
                            if (request.hasReturnPartialSuccess()) {
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectAttachmentList>newBuilder()
                      .setDefaultInstance(InterconnectAttachmentList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<PatchInterconnectAttachmentRequest, Operation>
      patchMethodDescriptor =
          ApiMethodDescriptor.<PatchInterconnectAttachmentRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectAttachments/Patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PatchInterconnectAttachmentRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/interconnectAttachments/{interconnectAttachment}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<PatchInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "interconnectAttachment",
                                request.getInterconnectAttachment());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<PatchInterconnectAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "interconnectAttachmentResource",
                                      request.getInterconnectAttachmentResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<
          AggregatedListInterconnectAttachmentsRequest, InterconnectAttachmentAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<
          AggregatedListInterconnectAttachmentsRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<DeleteInterconnectAttachmentRequest, Operation> deleteCallable;
  private final UnaryCallable<GetInterconnectAttachmentRequest, InterconnectAttachment> getCallable;
  private final UnaryCallable<InsertInterconnectAttachmentRequest, Operation> insertCallable;
  private final UnaryCallable<ListInterconnectAttachmentsRequest, InterconnectAttachmentList>
      listCallable;
  private final UnaryCallable<ListInterconnectAttachmentsRequest, ListPagedResponse>
      listPagedCallable;
  private final UnaryCallable<PatchInterconnectAttachmentRequest, Operation> patchCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonInterconnectAttachmentsStub create(
      InterconnectAttachmentsStubSettings settings) throws IOException {
    return new HttpJsonInterconnectAttachmentsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInterconnectAttachmentsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonInterconnectAttachmentsStub(
        InterconnectAttachmentsStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonInterconnectAttachmentsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonInterconnectAttachmentsStub(
        InterconnectAttachmentsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonInterconnectAttachmentsStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonInterconnectAttachmentsStub(
      InterconnectAttachmentsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonInterconnectAttachmentsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonInterconnectAttachmentsStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonInterconnectAttachmentsStub(
      InterconnectAttachmentsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<
            AggregatedListInterconnectAttachmentsRequest, InterconnectAttachmentAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListInterconnectAttachmentsRequest,
                    InterconnectAttachmentAggregatedList>
                    newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteInterconnectAttachmentRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteInterconnectAttachmentRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetInterconnectAttachmentRequest, InterconnectAttachment>
        getTransportSettings =
            HttpJsonCallSettings
                .<GetInterconnectAttachmentRequest, InterconnectAttachment>newBuilder()
                .setMethodDescriptor(getMethodDescriptor)
                .build();
    HttpJsonCallSettings<InsertInterconnectAttachmentRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertInterconnectAttachmentRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInterconnectAttachmentsRequest, InterconnectAttachmentList>
        listTransportSettings =
            HttpJsonCallSettings
                .<ListInterconnectAttachmentsRequest, InterconnectAttachmentList>newBuilder()
                .setMethodDescriptor(listMethodDescriptor)
                .build();
    HttpJsonCallSettings<PatchInterconnectAttachmentRequest, Operation> patchTransportSettings =
        HttpJsonCallSettings.<PatchInterconnectAttachmentRequest, Operation>newBuilder()
            .setMethodDescriptor(patchMethodDescriptor)
            .build();

    this.aggregatedListCallable =
        callableFactory.createUnaryCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.aggregatedListPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.insertCallable =
        callableFactory.createUnaryCallable(
            insertTransportSettings, settings.insertSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.patchCallable =
        callableFactory.createUnaryCallable(
            patchTransportSettings, settings.patchSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(aggregatedListMethodDescriptor);
    methodDescriptors.add(deleteMethodDescriptor);
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(insertMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    methodDescriptors.add(patchMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<
          AggregatedListInterconnectAttachmentsRequest, InterconnectAttachmentAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  @Override
  public UnaryCallable<AggregatedListInterconnectAttachmentsRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  @Override
  public UnaryCallable<DeleteInterconnectAttachmentRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  @Override
  public UnaryCallable<GetInterconnectAttachmentRequest, InterconnectAttachment> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<InsertInterconnectAttachmentRequest, Operation> insertCallable() {
    return insertCallable;
  }

  @Override
  public UnaryCallable<ListInterconnectAttachmentsRequest, InterconnectAttachmentList>
      listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListInterconnectAttachmentsRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public UnaryCallable<PatchInterconnectAttachmentRequest, Operation> patchCallable() {
    return patchCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
