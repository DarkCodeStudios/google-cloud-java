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

package com.google.cloud.clouddms.v1.samples;

// [START clouddms_v1_generated_datamigrationserviceclient_createconnectionprofile_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.clouddms.v1.ConnectionProfile;
import com.google.cloud.clouddms.v1.ConnectionProfileName;
import com.google.cloud.clouddms.v1.CreateConnectionProfileRequest;
import com.google.cloud.clouddms.v1.DataMigrationServiceClient;
import com.google.cloud.clouddms.v1.OperationMetadata;

public class AsyncCreateConnectionProfileLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateConnectionProfileLRO();
  }

  public static void asyncCreateConnectionProfileLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataMigrationServiceClient dataMigrationServiceClient =
        DataMigrationServiceClient.create()) {
      CreateConnectionProfileRequest request =
          CreateConnectionProfileRequest.newBuilder()
              .setParent(
                  ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
                      .toString())
              .setConnectionProfileId("connectionProfileId597575526")
              .setConnectionProfile(ConnectionProfile.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<ConnectionProfile, OperationMetadata> future =
          dataMigrationServiceClient.createConnectionProfileOperationCallable().futureCall(request);
      // Do something.
      ConnectionProfile response = future.get();
    }
  }
}
// [END clouddms_v1_generated_datamigrationserviceclient_createconnectionprofile_lro_async]
