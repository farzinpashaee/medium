package com.csl.service;

import com.csl.protobuf.Author;
import com.csl.protobuf.Book;
import com.csl.protobuf.BookStoreServiceGrpc;

public class BooksStoreService extends BookStoreServiceGrpc.BookStoreServiceImplBase {

    public void preview(com.csl.protobuf.BookPreview request,
            io.grpc.stub.StreamObserver<com.csl.protobuf.Book> responseObserver) {

        Author author = Author.newBuilder()
                .setName("Agatha Christie")
                .build();
        Book book = Book.newBuilder()
                .setId(123)
                .setTitle("The Murder of Roger Ackroyd")
                .setAuthor(author)
                .build();

        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }
}