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
// source: google/identity/accesscontextmanager/v1/access_level.proto

package com.google.identity.accesscontextmanager.v1;

public interface AccessLevelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.AccessLevel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name for the Access Level. The `short_name` component
   * must begin with a letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum
   * length of the `access_level` component is 50 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name for the Access Level. The `short_name` component
   * must begin with a letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum
   * length of the `access_level` component is 50 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Human readable title. Must be unique within the Policy.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Human readable title. Must be unique within the Policy.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Description of the `AccessLevel` and its use. Does not affect behavior.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the `AccessLevel` and its use. Does not affect behavior.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * A `BasicLevel` composed of `Conditions`.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.BasicLevel basic = 4;</code>
   *
   * @return Whether the basic field is set.
   */
  boolean hasBasic();
  /**
   *
   *
   * <pre>
   * A `BasicLevel` composed of `Conditions`.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.BasicLevel basic = 4;</code>
   *
   * @return The basic.
   */
  com.google.identity.accesscontextmanager.v1.BasicLevel getBasic();
  /**
   *
   *
   * <pre>
   * A `BasicLevel` composed of `Conditions`.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.BasicLevel basic = 4;</code>
   */
  com.google.identity.accesscontextmanager.v1.BasicLevelOrBuilder getBasicOrBuilder();

  /**
   *
   *
   * <pre>
   * A `CustomLevel` written in the Common Expression Language.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.CustomLevel custom = 5;</code>
   *
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   *
   *
   * <pre>
   * A `CustomLevel` written in the Common Expression Language.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.CustomLevel custom = 5;</code>
   *
   * @return The custom.
   */
  com.google.identity.accesscontextmanager.v1.CustomLevel getCustom();
  /**
   *
   *
   * <pre>
   * A `CustomLevel` written in the Common Expression Language.
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.CustomLevel custom = 5;</code>
   */
  com.google.identity.accesscontextmanager.v1.CustomLevelOrBuilder getCustomOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessLevel` was created in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessLevel` was created in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessLevel` was created in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessLevel` was updated in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessLevel` was updated in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the `AccessLevel` was updated in UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  public com.google.identity.accesscontextmanager.v1.AccessLevel.LevelCase getLevelCase();
}
