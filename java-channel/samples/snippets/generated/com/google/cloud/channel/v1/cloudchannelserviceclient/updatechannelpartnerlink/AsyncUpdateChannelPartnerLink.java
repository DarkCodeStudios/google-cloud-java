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

// [START channel_v1_generated_cloudchannelserviceclient_updatechannelpartnerlink_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.channel.v1.ChannelPartnerLink;
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.UpdateChannelPartnerLinkRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateChannelPartnerLink {

  public static void main(String[] args) throws Exception {
    asyncUpdateChannelPartnerLink();
  }

  public static void asyncUpdateChannelPartnerLink() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      UpdateChannelPartnerLinkRequest request =
          UpdateChannelPartnerLinkRequest.newBuilder()
              .setName("name3373707")
              .setChannelPartnerLink(ChannelPartnerLink.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<ChannelPartnerLink> future =
          cloudChannelServiceClient.updateChannelPartnerLinkCallable().futureCall(request);
      // Do something.
      ChannelPartnerLink response = future.get();
    }
  }
}
// [END channel_v1_generated_cloudchannelserviceclient_updatechannelpartnerlink_async]