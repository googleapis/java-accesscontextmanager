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
// source: google/identity/accesscontextmanager/v1/access_policy.proto

package com.google.identity.accesscontextmanager.v1;

public final class PolicyProto {
  private PolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_AccessPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_AccessPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/identity/accesscontextmanager/v"
          + "1/access_policy.proto\022\'google.identity.a"
          + "ccesscontextmanager.v1\032\031google/api/resou"
          + "rce.proto\032\037google/protobuf/timestamp.pro"
          + "to\032\034google/api/annotations.proto\"\202\002\n\014Acc"
          + "essPolicy\022\014\n\004name\030\001 \001(\t\022\016\n\006parent\030\002 \001(\t\022"
          + "\r\n\005title\030\003 \001(\t\022/\n\013create_time\030\004 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022/\n\013update_time\030\005"
          + " \001(\0132\032.google.protobuf.Timestamp\022\014\n\004etag"
          + "\030\006 \001(\t:U\352AR\n0accesscontextmanager.google"
          + "apis.com/AccessPolicy\022\036accessPolicies/{a"
          + "ccess_policy}B\241\002\n+com.google.identity.ac"
          + "cesscontextmanager.v1B\013PolicyProtoP\001Z[go"
          + "ogle.golang.org/genproto/googleapis/iden"
          + "tity/accesscontextmanager/v1;accessconte"
          + "xtmanager\242\002\004GACM\252\002\'Google.Identity.Acces"
          + "sContextManager.V1\312\002\'Google\\Identity\\Acc"
          + "essContextManager\\V1\352\002*Google::Identity:"
          + ":AccessContextManager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_identity_accesscontextmanager_v1_AccessPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_identity_accesscontextmanager_v1_AccessPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_AccessPolicy_descriptor,
            new java.lang.String[] {
              "Name", "Parent", "Title", "CreateTime", "UpdateTime", "Etag",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
