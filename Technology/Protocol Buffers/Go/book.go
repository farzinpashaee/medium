// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.3
// 	protoc        v5.29.2
// source: Book.proto

package main

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type Book struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Id            *int32                 `protobuf:"varint,1,opt,name=id,proto3,oneof" json:"id,omitempty"`
	Title         *string                `protobuf:"bytes,2,opt,name=title,proto3,oneof" json:"title,omitempty"`
	Author        *Author                `protobuf:"bytes,3,opt,name=author,proto3,oneof" json:"author,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Book) Reset() {
	*x = Book{}
	mi := &file_Book_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Book) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Book) ProtoMessage() {}

func (x *Book) ProtoReflect() protoreflect.Message {
	mi := &file_Book_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Book.ProtoReflect.Descriptor instead.
func (*Book) Descriptor() ([]byte, []int) {
	return file_Book_proto_rawDescGZIP(), []int{0}
}

func (x *Book) GetId() int32 {
	if x != nil && x.Id != nil {
		return *x.Id
	}
	return 0
}

func (x *Book) GetTitle() string {
	if x != nil && x.Title != nil {
		return *x.Title
	}
	return ""
}

func (x *Book) GetAuthor() *Author {
	if x != nil {
		return x.Author
	}
	return nil
}

type Author struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Name          *string                `protobuf:"bytes,1,opt,name=name,proto3,oneof" json:"name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Author) Reset() {
	*x = Author{}
	mi := &file_Book_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Author) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Author) ProtoMessage() {}

func (x *Author) ProtoReflect() protoreflect.Message {
	mi := &file_Book_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Author.ProtoReflect.Descriptor instead.
func (*Author) Descriptor() ([]byte, []int) {
	return file_Book_proto_rawDescGZIP(), []int{1}
}

func (x *Author) GetName() string {
	if x != nil && x.Name != nil {
		return *x.Name
	}
	return ""
}

var File_Book_proto protoreflect.FileDescriptor

var file_Book_proto_rawDesc = []byte{
	0x0a, 0x0a, 0x42, 0x6f, 0x6f, 0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x78, 0x0a, 0x04,
	0x42, 0x6f, 0x6f, 0x6b, 0x12, 0x13, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05,
	0x48, 0x00, 0x52, 0x02, 0x69, 0x64, 0x88, 0x01, 0x01, 0x12, 0x19, 0x0a, 0x05, 0x74, 0x69, 0x74,
	0x6c, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x48, 0x01, 0x52, 0x05, 0x74, 0x69, 0x74, 0x6c,
	0x65, 0x88, 0x01, 0x01, 0x12, 0x24, 0x0a, 0x06, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x48, 0x02, 0x52,
	0x06, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x88, 0x01, 0x01, 0x42, 0x05, 0x0a, 0x03, 0x5f, 0x69,
	0x64, 0x42, 0x08, 0x0a, 0x06, 0x5f, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x42, 0x09, 0x0a, 0x07, 0x5f,
	0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x22, 0x2a, 0x0a, 0x06, 0x41, 0x75, 0x74, 0x68, 0x6f, 0x72,
	0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x88, 0x01, 0x01, 0x42, 0x07, 0x0a, 0x05, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x42, 0x12, 0x5a, 0x10, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x73, 0x6c, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_Book_proto_rawDescOnce sync.Once
	file_Book_proto_rawDescData = file_Book_proto_rawDesc
)

func file_Book_proto_rawDescGZIP() []byte {
	file_Book_proto_rawDescOnce.Do(func() {
		file_Book_proto_rawDescData = protoimpl.X.CompressGZIP(file_Book_proto_rawDescData)
	})
	return file_Book_proto_rawDescData
}

var file_Book_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_Book_proto_goTypes = []any{
	(*Book)(nil),   // 0: Book
	(*Author)(nil), // 1: Author
}
var file_Book_proto_depIdxs = []int32{
	1, // 0: Book.author:type_name -> Author
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_Book_proto_init() }
func file_Book_proto_init() {
	if File_Book_proto != nil {
		return
	}
	file_Book_proto_msgTypes[0].OneofWrappers = []any{}
	file_Book_proto_msgTypes[1].OneofWrappers = []any{}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_Book_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_Book_proto_goTypes,
		DependencyIndexes: file_Book_proto_depIdxs,
		MessageInfos:      file_Book_proto_msgTypes,
	}.Build()
	File_Book_proto = out.File
	file_Book_proto_rawDesc = nil
	file_Book_proto_goTypes = nil
	file_Book_proto_depIdxs = nil
}
