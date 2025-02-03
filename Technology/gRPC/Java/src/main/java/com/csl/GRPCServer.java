package com.csl;

import com.csl.service.BooksStoreService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;


class GRPCServer{

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new BooksStoreService()).build();

        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }

}