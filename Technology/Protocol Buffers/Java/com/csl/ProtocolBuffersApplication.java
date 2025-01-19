package com.csl;

import  com.csl.protobuf.Book;

class ProtocolBuffersApplication{

    public static void main(String[] args) {
        Author author = Author.newBuilder()
                .setName("Agatha Christie")
                .build();
        Book book = Book.newBuilder()
                .setId(123)
                .setTitle("The Murder of Roger Ackroyd")
                .setAuthor(author)
                .build();
        FileOutputStream output = new FileOutputStream("Book.data");
        book.writeTo(output);

        Book deserializedBook = Book.newBuilder()
                .mergeFrom(new FileInputStream("Book.data")).build();
    }

}