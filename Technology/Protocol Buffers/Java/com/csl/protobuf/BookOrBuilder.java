// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Book.proto
// Protobuf Java Version: 4.29.2

package com.csl.protobuf;

public interface BookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Book)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>optional string title = 2;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional .Author author = 3;</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <code>optional .Author author = 3;</code>
   * @return The author.
   */
  com.csl.protobuf.Author getAuthor();
  /**
   * <code>optional .Author author = 3;</code>
   */
  com.csl.protobuf.AuthorOrBuilder getAuthorOrBuilder();
}
