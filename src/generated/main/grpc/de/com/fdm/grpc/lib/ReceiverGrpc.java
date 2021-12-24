package de.com.fdm.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: receiver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReceiverGrpc {

  private ReceiverGrpc() {}

  public static final String SERVICE_NAME = "de.com.fdm.grpc.Receiver";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.com.fdm.grpc.lib.Registration,
      de.com.fdm.grpc.lib.Empty> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = de.com.fdm.grpc.lib.Registration.class,
      responseType = de.com.fdm.grpc.lib.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.com.fdm.grpc.lib.Registration,
      de.com.fdm.grpc.lib.Empty> getRegisterMethod() {
    io.grpc.MethodDescriptor<de.com.fdm.grpc.lib.Registration, de.com.fdm.grpc.lib.Empty> getRegisterMethod;
    if ((getRegisterMethod = ReceiverGrpc.getRegisterMethod) == null) {
      synchronized (ReceiverGrpc.class) {
        if ((getRegisterMethod = ReceiverGrpc.getRegisterMethod) == null) {
          ReceiverGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<de.com.fdm.grpc.lib.Registration, de.com.fdm.grpc.lib.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.com.fdm.grpc.lib.Registration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.com.fdm.grpc.lib.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ReceiverMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReceiverStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReceiverStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReceiverStub>() {
        @java.lang.Override
        public ReceiverStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReceiverStub(channel, callOptions);
        }
      };
    return ReceiverStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReceiverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReceiverBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReceiverBlockingStub>() {
        @java.lang.Override
        public ReceiverBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReceiverBlockingStub(channel, callOptions);
        }
      };
    return ReceiverBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReceiverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReceiverFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReceiverFutureStub>() {
        @java.lang.Override
        public ReceiverFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReceiverFutureStub(channel, callOptions);
        }
      };
    return ReceiverFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReceiverImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(de.com.fdm.grpc.lib.Registration request,
        io.grpc.stub.StreamObserver<de.com.fdm.grpc.lib.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                de.com.fdm.grpc.lib.Registration,
                de.com.fdm.grpc.lib.Empty>(
                  this, METHODID_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class ReceiverStub extends io.grpc.stub.AbstractAsyncStub<ReceiverStub> {
    private ReceiverStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReceiverStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReceiverStub(channel, callOptions);
    }

    /**
     */
    public void register(de.com.fdm.grpc.lib.Registration request,
        io.grpc.stub.StreamObserver<de.com.fdm.grpc.lib.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReceiverBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReceiverBlockingStub> {
    private ReceiverBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReceiverBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReceiverBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.com.fdm.grpc.lib.Empty register(de.com.fdm.grpc.lib.Registration request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReceiverFutureStub extends io.grpc.stub.AbstractFutureStub<ReceiverFutureStub> {
    private ReceiverFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReceiverFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReceiverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.com.fdm.grpc.lib.Empty> register(
        de.com.fdm.grpc.lib.Registration request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReceiverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReceiverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((de.com.fdm.grpc.lib.Registration) request,
              (io.grpc.stub.StreamObserver<de.com.fdm.grpc.lib.Empty>) responseObserver);
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

  private static abstract class ReceiverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReceiverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.com.fdm.grpc.lib.ReceiverProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Receiver");
    }
  }

  private static final class ReceiverFileDescriptorSupplier
      extends ReceiverBaseDescriptorSupplier {
    ReceiverFileDescriptorSupplier() {}
  }

  private static final class ReceiverMethodDescriptorSupplier
      extends ReceiverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReceiverMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReceiverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReceiverFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
