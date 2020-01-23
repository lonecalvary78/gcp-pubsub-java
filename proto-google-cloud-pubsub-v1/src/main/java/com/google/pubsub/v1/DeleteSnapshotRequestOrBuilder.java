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
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface DeleteSnapshotRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.DeleteSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the snapshot to delete.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 1;</code>
   *
   * @return The snapshot.
   */
  java.lang.String getSnapshot();
  /**
   *
   *
   * <pre>
   * The name of the snapshot to delete.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 1;</code>
   *
   * @return The bytes for snapshot.
   */
  com.google.protobuf.ByteString getSnapshotBytes();
}
