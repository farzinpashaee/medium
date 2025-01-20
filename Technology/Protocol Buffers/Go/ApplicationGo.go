package main

import (
	"fmt"
	"log"

	"google.golang.org/protobuf/proto"
)

func main() {


	author := &Author{
		Name: StringPtr("J.K. Rowling"),
	}

	book := &Book{
		Title: StringPtr("Harry Potter and the Philosopher's Stone"),
		Author: author,
		Id: Int32Ptr(123),
	}

	serializedBook, err := proto.Marshal(book)
	if err != nil {
		log.Fatalf("Failed to serialize book: %v", err)
	}
	fmt.Printf("\nSerialized Book (binary): %v\n", serializedBook)

	deserializedBook := &Book{}
	err = proto.Unmarshal(serializedBook, deserializedBook)
	if err != nil {
		log.Fatalf("Failed to deserialize book: %v", err)
	}

	fmt.Println("\nDeserialized Book:")
	fmt.Printf("Title: %s\n", deserializedBook.GetTitle())
	fmt.Printf("Author: %s\n", deserializedBook.GetAuthor().GetName())

}

func StringPtr(s string) *string {
    return &s
}

func Int32Ptr(i int32) *int32 {
    return &i
}