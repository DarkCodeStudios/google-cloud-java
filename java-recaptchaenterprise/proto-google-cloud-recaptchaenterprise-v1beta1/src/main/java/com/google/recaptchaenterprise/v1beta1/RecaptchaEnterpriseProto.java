/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

public final class RecaptchaEnterpriseProto {
  private RecaptchaEnterpriseProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateAssessmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateAssessmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_PasswordLeakVerification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_PasswordLeakVerification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_Assessment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_Assessment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_Event_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_TokenProperties_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_TokenProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recaptchaenterprise_v1beta1_AccountDefenderAssessment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recaptchaenterprise_v1beta1_AccountDefenderAssessment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/recaptchaenterprise/v1bet"
          + "a1/recaptchaenterprise.proto\022(google.clo"
          + "ud.recaptchaenterprise.v1beta1\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\"\255\001\n\027CreateAssessmentR"
          + "equest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudres"
          + "ourcemanager.googleapis.com/Project\022M\n\na"
          + "ssessment\030\002 \001(\01324.google.cloud.recaptcha"
          + "enterprise.v1beta1.AssessmentB\003\340A\002\"\272\005\n\031A"
          + "nnotateAssessmentRequest\022C\n\004name\030\001 \001(\tB5"
          + "\340A\002\372A/\n-recaptchaenterprise.googleapis.c"
          + "om/Assessment\022g\n\nannotation\030\002 \001(\0162N.goog"
          + "le.cloud.recaptchaenterprise.v1beta1.Ann"
          + "otateAssessmentRequest.AnnotationB\003\340A\001\022`"
          + "\n\007reasons\030\003 \003(\0162J.google.cloud.recaptcha"
          + "enterprise.v1beta1.AnnotateAssessmentReq"
          + "uest.ReasonB\003\340A\001\022\036\n\021hashed_account_id\030\004 "
          + "\001(\014B\003\340A\001\"~\n\nAnnotation\022\032\n\026ANNOTATION_UNS"
          + "PECIFIED\020\000\022\016\n\nLEGITIMATE\020\001\022\016\n\nFRAUDULENT"
          + "\020\002\022\030\n\020PASSWORD_CORRECT\020\003\032\002\010\001\022\032\n\022PASSWORD"
          + "_INCORRECT\020\004\032\002\010\001\"\354\001\n\006Reason\022\026\n\022REASON_UN"
          + "SPECIFIED\020\000\022\016\n\nCHARGEBACK\020\001\022\024\n\020CHARGEBAC"
          + "K_FRAUD\020\010\022\026\n\022CHARGEBACK_DISPUTE\020\t\022\026\n\022PAY"
          + "MENT_HEURISTICS\020\002\022\030\n\024INITIATED_TWO_FACTO"
          + "R\020\007\022\025\n\021PASSED_TWO_FACTOR\020\003\022\025\n\021FAILED_TWO"
          + "_FACTOR\020\004\022\024\n\020CORRECT_PASSWORD\020\005\022\026\n\022INCOR"
          + "RECT_PASSWORD\020\006\"\034\n\032AnnotateAssessmentRes"
          + "ponse\"\206\001\n\030PasswordLeakVerification\022$\n\027ha"
          + "shed_user_credentials\030\001 \001(\014B\003\340A\001\022\037\n\022cred"
          + "entials_leaked\030\002 \001(\010B\003\340A\003\022#\n\026canonicaliz"
          + "ed_username\030\003 \001(\tB\003\340A\001\"\234\006\n\nAssessment\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022>\n\005event\030\002 \001(\0132/.google"
          + ".cloud.recaptchaenterprise.v1beta1.Event"
          + "\022\022\n\005score\030\003 \001(\002B\003\340A\003\022X\n\020token_properties"
          + "\030\004 \001(\01329.google.cloud.recaptchaenterpris"
          + "e.v1beta1.TokenPropertiesB\003\340A\003\022_\n\007reason"
          + "s\030\005 \003(\0162I.google.cloud.recaptchaenterpri"
          + "se.v1beta1.Assessment.ClassificationReas"
          + "onB\003\340A\003\022f\n\032password_leak_verification\030\007 "
          + "\001(\0132B.google.cloud.recaptchaenterprise.v"
          + "1beta1.PasswordLeakVerification\022h\n\033accou"
          + "nt_defender_assessment\030\010 \001(\0132C.google.cl"
          + "oud.recaptchaenterprise.v1beta1.AccountD"
          + "efenderAssessment\"\270\001\n\024ClassificationReas"
          + "on\022%\n!CLASSIFICATION_REASON_UNSPECIFIED\020"
          + "\000\022\016\n\nAUTOMATION\020\001\022\032\n\026UNEXPECTED_ENVIRONM"
          + "ENT\020\002\022\024\n\020TOO_MUCH_TRAFFIC\020\003\022\035\n\031UNEXPECTE"
          + "D_USAGE_PATTERNS\020\004\022\030\n\024LOW_CONFIDENCE_SCO"
          + "RE\020\005:_\352A\\\n-recaptchaenterprise.googleapi"
          + "s.com/Assessment\022+projects/{project}/ass"
          + "essments/{assessment}\"\247\001\n\005Event\022\022\n\005token"
          + "\030\001 \001(\tB\003\340A\001\022\025\n\010site_key\030\002 \001(\tB\003\340A\001\022\027\n\nus"
          + "er_agent\030\003 \001(\tB\003\340A\001\022\034\n\017user_ip_address\030\004"
          + " \001(\tB\003\340A\001\022\034\n\017expected_action\030\005 \001(\tB\003\340A\001\022"
          + "\036\n\021hashed_account_id\030\006 \001(\014B\003\340A\001\"\377\002\n\017Toke"
          + "nProperties\022\r\n\005valid\030\001 \001(\010\022_\n\016invalid_re"
          + "ason\030\002 \001(\0162G.google.cloud.recaptchaenter"
          + "prise.v1beta1.TokenProperties.InvalidRea"
          + "son\022/\n\013create_time\030\003 \001(\0132\032.google.protob"
          + "uf.Timestamp\022\020\n\010hostname\030\004 \001(\t\022\016\n\006action"
          + "\030\005 \001(\t\"\250\001\n\rInvalidReason\022\036\n\032INVALID_REAS"
          + "ON_UNSPECIFIED\020\000\022\032\n\026UNKNOWN_INVALID_REAS"
          + "ON\020\001\022\r\n\tMALFORMED\020\002\022\013\n\007EXPIRED\020\003\022\010\n\004DUPE"
          + "\020\004\022\025\n\rSITE_MISMATCH\020\005\032\002\010\001\022\013\n\007MISSING\020\006\022\021"
          + "\n\rBROWSER_ERROR\020\007\"\273\002\n\031AccountDefenderAss"
          + "essment\022h\n\006labels\030\001 \003(\0162X.google.cloud.r"
          + "ecaptchaenterprise.v1beta1.AccountDefend"
          + "erAssessment.AccountDefenderLabel\"\263\001\n\024Ac"
          + "countDefenderLabel\022&\n\"ACCOUNT_DEFENDER_L"
          + "ABEL_UNSPECIFIED\020\000\022\021\n\rPROFILE_MATCH\020\001\022\035\n"
          + "\031SUSPICIOUS_LOGIN_ACTIVITY\020\002\022\037\n\033SUSPICIO"
          + "US_ACCOUNT_CREATION\020\003\022 \n\034RELATED_ACCOUNT"
          + "S_NUMBER_HIGH\020\0042\315\004\n!RecaptchaEnterpriseS"
          + "erviceV1Beta1\022\335\001\n\020CreateAssessment\022A.goo"
          + "gle.cloud.recaptchaenterprise.v1beta1.Cr"
          + "eateAssessmentRequest\0324.google.cloud.rec"
          + "aptchaenterprise.v1beta1.Assessment\"P\202\323\344"
          + "\223\0026\"(/v1beta1/{parent=projects/*}/assess"
          + "ments:\nassessment\332A\021parent,assessment\022\357\001"
          + "\n\022AnnotateAssessment\022C.google.cloud.reca"
          + "ptchaenterprise.v1beta1.AnnotateAssessme"
          + "ntRequest\032D.google.cloud.recaptchaenterp"
          + "rise.v1beta1.AnnotateAssessmentResponse\""
          + "N\202\323\344\223\0026\"1/v1beta1/{name=projects/*/asses"
          + "sments/*}:annotate:\001*\332A\017name,annotation\032"
          + "V\312A\"recaptchaenterprise.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\257\002\n&com.google.recaptchaenterpri"
          + "se.v1beta1B\030RecaptchaEnterpriseProtoP\001Z^"
          + "cloud.google.com/go/recaptchaenterprise/"
          + "apiv1beta1/recaptchaenterprisepb;recaptc"
          + "haenterprisepb\242\002\004GCRE\252\002(Google.Cloud.Rec"
          + "aptchaEnterprise.V1Beta1\312\002(Google\\Cloud\\"
          + "RecaptchaEnterprise\\V1beta1\352\002+Google::Cl"
          + "oud::RecaptchaEnterprise::V1beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateAssessmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateAssessmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_CreateAssessmentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Assessment",
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentRequest_descriptor,
            new java.lang.String[] {
              "Name", "Annotation", "Reasons", "HashedAccountId",
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_AnnotateAssessmentResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_recaptchaenterprise_v1beta1_PasswordLeakVerification_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_PasswordLeakVerification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_PasswordLeakVerification_descriptor,
            new java.lang.String[] {
              "HashedUserCredentials", "CredentialsLeaked", "CanonicalizedUsername",
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_Assessment_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_Assessment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_Assessment_descriptor,
            new java.lang.String[] {
              "Name",
              "Event",
              "Score",
              "TokenProperties",
              "Reasons",
              "PasswordLeakVerification",
              "AccountDefenderAssessment",
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_Event_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_Event_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_Event_descriptor,
            new java.lang.String[] {
              "Token", "SiteKey", "UserAgent", "UserIpAddress", "ExpectedAction", "HashedAccountId",
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_TokenProperties_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_TokenProperties_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_TokenProperties_descriptor,
            new java.lang.String[] {
              "Valid", "InvalidReason", "CreateTime", "Hostname", "Action",
            });
    internal_static_google_cloud_recaptchaenterprise_v1beta1_AccountDefenderAssessment_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recaptchaenterprise_v1beta1_AccountDefenderAssessment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recaptchaenterprise_v1beta1_AccountDefenderAssessment_descriptor,
            new java.lang.String[] {
              "Labels",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
