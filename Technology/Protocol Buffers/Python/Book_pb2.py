# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: Book.proto
# Protobuf Python Version: 5.29.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    2,
    '',
    'Book.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\nBook.proto\"e\n\x04\x42ook\x12\x0f\n\x02id\x18\x01 \x01(\x05H\x00\x88\x01\x01\x12\x12\n\x05title\x18\x02 \x01(\tH\x01\x88\x01\x01\x12\x1c\n\x06\x61uthor\x18\x03 \x01(\x0b\x32\x07.AuthorH\x02\x88\x01\x01\x42\x05\n\x03_idB\x08\n\x06_titleB\t\n\x07_author\"$\n\x06\x41uthor\x12\x11\n\x04name\x18\x01 \x01(\tH\x00\x88\x01\x01\x42\x07\n\x05_nameB\x14\n\x10\x63om.csl.protobufP\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'Book_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.csl.protobufP\001'
  _globals['_BOOK']._serialized_start=14
  _globals['_BOOK']._serialized_end=115
  _globals['_AUTHOR']._serialized_start=117
  _globals['_AUTHOR']._serialized_end=153
# @@protoc_insertion_point(module_scope)
