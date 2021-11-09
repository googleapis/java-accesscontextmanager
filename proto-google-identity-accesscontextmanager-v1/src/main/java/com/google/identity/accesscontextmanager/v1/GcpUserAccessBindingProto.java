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
// source: google/identity/accesscontextmanager/v1/gcp_user_access_binding.proto

package com.google.identity.accesscontextmanager.v1;

public final class GcpUserAccessBindingProto {
  private GcpUserAccessBindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_identity_accesscontextmanager_v1_GcpUserAccessBinding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_identity_accesscontextmanager_v1_GcpUserAccessBinding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/identity/accesscontextmanager/v"
          + "1/gcp_user_access_binding.proto\022\'google."
          + "identity.accesscontextmanager.v1\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032\034google/api/annotations.pro"
          + "to\"\243\002\n\024GcpUserAccessBinding\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\005\022\031\n\tgroup_key\030\002 \001(\tB\006\340A\002\340A\005\022N\n\racc"
          + "ess_levels\030\003 \003(\tB7\340A\002\372A1\n/accesscontextm"
          + "anager.googleapis.com/AccessLevel:\214\001\352A\210\001"
          + "\n8accesscontextmanager.googleapis.com/Gc"
          + "pUserAccessBinding\022Lorganizations/{organ"
          + "ization}/gcpUserAccessBindings/{gcp_user"
          + "_access_binding}B\257\002\n+com.google.identity"
          + ".accesscontextmanager.v1B\031GcpUserAccessB"
          + "indingProtoP\001Z[google.golang.org/genprot"
          + "o/googleapis/identity/accesscontextmanag"
          + "er/v1;accesscontextmanager\242\002\004GACM\252\002\'Goog"
          + "le.Identity.AccessContextManager.V1\312\002\'Go"
          + "ogle\\Identity\\AccessContextManager\\V1\352\002*"
          + "Google::Identity::AccessContextManager::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_identity_accesscontextmanager_v1_GcpUserAccessBinding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_identity_accesscontextmanager_v1_GcpUserAccessBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_identity_accesscontextmanager_v1_GcpUserAccessBinding_descriptor,
            new java.lang.String[] {
              "Name", "GroupKey", "AccessLevels",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
