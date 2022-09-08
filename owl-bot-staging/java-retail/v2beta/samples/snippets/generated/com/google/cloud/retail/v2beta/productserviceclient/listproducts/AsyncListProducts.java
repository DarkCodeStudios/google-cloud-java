/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_productserviceclient_listproducts_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.retail.v2beta.BranchName;
import com.google.cloud.retail.v2beta.ListProductsRequest;
import com.google.cloud.retail.v2beta.Product;
import com.google.cloud.retail.v2beta.ProductServiceClient;
import com.google.protobuf.FieldMask;

public class AsyncListProducts {

  public static void main(String[] args) throws Exception {
    asyncListProducts();
  }

  public static void asyncListProducts() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ProductServiceClient productServiceClient = ProductServiceClient.create()) {
      ListProductsRequest request =
          ListProductsRequest.newBuilder()
              .setParent(
                  BranchName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[BRANCH]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setReadMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Product> future =
          productServiceClient.listProductsPagedCallable().futureCall(request);
      // Do something.
      for (Product element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END retail_v2beta_generated_productserviceclient_listproducts_async]
