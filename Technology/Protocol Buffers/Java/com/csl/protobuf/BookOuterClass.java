// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Book.proto
// Protobuf Java Version: 4.29.2

package com.csl.protobuf;

public final class BookOuterClass {
  private BookOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      BookOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Author_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Author_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nBook.proto\"e\n\004Book\022\017\n\002id\030\001 \001(\005H\000\210\001\001\022\022\n" +
      "\005title\030\002 \001(\tH\001\210\001\001\022\034\n\006author\030\003 \001(\0132\007.Auth" +
      "orH\002\210\001\001B\005\n\003_idB\010\n\006_titleB\t\n\007_author\"$\n\006A" +
      "uthor\022\021\n\004name\030\001 \001(\tH\000\210\001\001B\007\n\005_nameB\024\n\020com" +
      ".csl.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Book_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Book_descriptor,
        new java.lang.String[] { "Id", "Title", "Author", });
    internal_static_Author_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Author_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Author_descriptor,
        new java.lang.String[] { "Name", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
