package com.csl;

import com.csl.protobuf.Book;
import com.csl.protobuf.BookPreview;
import com.csl.protobuf.BookStoreServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class GRPCClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        BookStoreServiceGrpc.BookStoreServiceBlockingStub stub
                = BookStoreServiceGrpc.newBlockingStub(channel);

        Book book = stub.preview(BookPreview.newBuilder()
                .setId(123)
                .build());

        System.out.println(book);
        channel.shutdown();
    }
}
