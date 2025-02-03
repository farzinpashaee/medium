package com.csl.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */

@io.grpc.stub.annotations.GrpcGenerated
public final class BookStoreServiceGrpc {

  private BookStoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BookStoreService.java";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.csl.protobuf.BookPreview,
      com.csl.protobuf.Book> getPreviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "preview",
      requestType = com.csl.protobuf.BookPreview.class,
      responseType = com.csl.protobuf.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csl.protobuf.BookPreview,
      com.csl.protobuf.Book> getPreviewMethod() {
    io.grpc.MethodDescriptor<com.csl.protobuf.BookPreview, com.csl.protobuf.Book> getPreviewMethod;
    if ((getPreviewMethod = BookStoreServiceGrpc.getPreviewMethod) == null) {
      synchronized (BookStoreServiceGrpc.class) {
        if ((getPreviewMethod = BookStoreServiceGrpc.getPreviewMethod) == null) {
          BookStoreServiceGrpc.getPreviewMethod = getPreviewMethod =
              io.grpc.MethodDescriptor.<com.csl.protobuf.BookPreview, com.csl.protobuf.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "preview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csl.protobuf.BookPreview.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csl.protobuf.Book.getDefaultInstance()))
              .setSchemaDescriptor(new BookStoreServiceMethodDescriptorSupplier("preview"))
              .build();
        }
      }
    }
    return getPreviewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceStub>() {
        @java.lang.Override
        public BookStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreServiceStub(channel, callOptions);
        }
      };
    return BookStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BookStoreServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceBlockingV2Stub>() {
        @java.lang.Override
        public BookStoreServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return BookStoreServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceBlockingStub>() {
        @java.lang.Override
        public BookStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return BookStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreServiceFutureStub>() {
        @java.lang.Override
        public BookStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreServiceFutureStub(channel, callOptions);
        }
      };
    return BookStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void preview(com.csl.protobuf.BookPreview request,
        io.grpc.stub.StreamObserver<com.csl.protobuf.Book> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreviewMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookStoreService.java.
   */
  public static abstract class BookStoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookStoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookStoreService.java.
   */
  public static final class BookStoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookStoreServiceStub> {
    private BookStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void preview(com.csl.protobuf.BookPreview request,
        io.grpc.stub.StreamObserver<com.csl.protobuf.Book> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreviewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookStoreService.java.
   */
  public static final class BookStoreServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BookStoreServiceBlockingV2Stub> {
    private BookStoreServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.csl.protobuf.Book preview(com.csl.protobuf.BookPreview request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreviewMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BookStoreService.java.
   */
  public static final class BookStoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookStoreServiceBlockingStub> {
    private BookStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.csl.protobuf.Book preview(com.csl.protobuf.BookPreview request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreviewMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookStoreService.java.
   */
  public static final class BookStoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookStoreServiceFutureStub> {
    private BookStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csl.protobuf.Book> preview(
        com.csl.protobuf.BookPreview request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreviewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREVIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREVIEW:
          serviceImpl.preview((com.csl.protobuf.BookPreview) request,
              (io.grpc.stub.StreamObserver<com.csl.protobuf.Book>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPreviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.csl.protobuf.BookPreview,
              com.csl.protobuf.Book>(
                service, METHODID_PREVIEW)))
        .build();
  }

  private static abstract class BookStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.csl.protobuf.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookStoreService.java");
    }
  }

  private static final class BookStoreServiceFileDescriptorSupplier
      extends BookStoreServiceBaseDescriptorSupplier {
    BookStoreServiceFileDescriptorSupplier() {}
  }

  private static final class BookStoreServiceMethodDescriptorSupplier
      extends BookStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookStoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookStoreServiceFileDescriptorSupplier())
              .addMethod(getPreviewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
