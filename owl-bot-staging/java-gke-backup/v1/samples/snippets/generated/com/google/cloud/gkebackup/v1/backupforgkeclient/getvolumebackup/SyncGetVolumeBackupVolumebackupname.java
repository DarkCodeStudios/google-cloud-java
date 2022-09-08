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

package com.google.cloud.gkebackup.v1.samples;

// [START gkebackup_v1_generated_backupforgkeclient_getvolumebackup_volumebackupname_sync]
import com.google.cloud.gkebackup.v1.BackupForGKEClient;
import com.google.cloud.gkebackup.v1.VolumeBackup;
import com.google.cloud.gkebackup.v1.VolumeBackupName;

public class SyncGetVolumeBackupVolumebackupname {

  public static void main(String[] args) throws Exception {
    syncGetVolumeBackupVolumebackupname();
  }

  public static void syncGetVolumeBackupVolumebackupname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BackupForGKEClient backupForGKEClient = BackupForGKEClient.create()) {
      VolumeBackupName name =
          VolumeBackupName.of(
              "[PROJECT]", "[LOCATION]", "[BACKUP_PLAN]", "[BACKUP]", "[VOLUME_BACKUP]");
      VolumeBackup response = backupForGKEClient.getVolumeBackup(name);
    }
  }
}
// [END gkebackup_v1_generated_backupforgkeclient_getvolumebackup_volumebackupname_sync]
