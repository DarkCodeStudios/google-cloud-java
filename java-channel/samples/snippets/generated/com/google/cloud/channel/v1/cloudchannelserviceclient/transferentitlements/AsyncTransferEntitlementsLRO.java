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

package com.google.cloud.channel.v1.samples;

// [START channel_v1_generated_cloudchannelserviceclient_transferentitlements_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.Entitlement;
import com.google.cloud.channel.v1.OperationMetadata;
import com.google.cloud.channel.v1.TransferEntitlementsRequest;
import com.google.cloud.channel.v1.TransferEntitlementsResponse;
import java.util.ArrayList;

public class AsyncTransferEntitlementsLRO {

  public static void main(String[] args) throws Exception {
    asyncTransferEntitlementsLRO();
  }

  public static void asyncTransferEntitlementsLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      TransferEntitlementsRequest request =
          TransferEntitlementsRequest.newBuilder()
              .setParent("parent-995424086")
              .addAllEntitlements(new ArrayList<Entitlement>())
              .setAuthToken("authToken1450587441")
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<TransferEntitlementsResponse, OperationMetadata> future =
          cloudChannelServiceClient.transferEntitlementsOperationCallable().futureCall(request);
      // Do something.
      TransferEntitlementsResponse response = future.get();
    }
  }
}
// [END channel_v1_generated_cloudchannelserviceclient_transferentitlements_lro_async]