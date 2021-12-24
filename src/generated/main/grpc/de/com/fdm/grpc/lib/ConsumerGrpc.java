package de.com.fdm.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: receiver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConsumerGrpc {

  private ConsumerGrpc() {}

  public static final String SERVICE_NAME = "de.com.fdm.grpc.Consumer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.com.fdm.grpc.lib.TwitchMessage,
      de.com.fdm.grpc.lib.Empty> getConsumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consume",
      requestType = de.com.fdm.grpc.lib.TwitchMessage.class,
      responseType = de.com.fdm.grpc.lib.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.com.fdm.grpc.lib.TwitchMessage,
      de.com.fdm.grpc.lib.Empty> getConsumeMethod() {
    io.grpc.MethodDescriptor<de.com.fdm.grpc.lib.TwitchMessage, de.com.fdm.grpc.lib.Empty> getConsumeMethod;
    if ((getConsumeMethod = ConsumerGrpc.getConsumeMethod) == null) {
      synchronized (ConsumerGrpc.class) {
        if ((getConsumeMethod = ConsumerGrpc.getConsumeMethod) == null) {
          ConsumerGrpc.getConsumeMethod = getConsumeMethod =
              io.grpc.MethodDescriptor.<de.com.fdm.grpc.lib.TwitchMessage, de.com.fdm.grpc.lib.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.com.fdm.grpc.lib.TwitchMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.com.fdm.grpc.lib.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ConsumerMethodDescriptorSupplier("consume"))
              .build();
        }
      }
    }
    return getConsumeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsumerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumerStub>() {
        @java.lang.Override
        public ConsumerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumerStub(channel, callOptions);
        }
      };
    return ConsumerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsumerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumerBlockingStub>() {
        @java.lang.Override
        public ConsumerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumerBlockingStub(channel, callOptions);
        }
      };
    return ConsumerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsumerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConsumerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConsumerFutureStub>() {
        @java.lang.Override
        public ConsumerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConsumerFutureStub(channel, callOptions);
        }
      };
    return ConsumerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConsumerImplBase implements io.grpc.BindableService {

    /**
     */
    public void consume(de.com.fdm.grpc.lib.TwitchMessage request,
        io.grpc.stub.StreamObserver<de.com.fdm.grpc.lib.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsumeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConsumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                de.com.fdm.grpc.lib.TwitchMessage,
                de.com.fdm.grpc.lib.Empty>(
                  this, METHODID_CONSUME)))
          .build();
    }
  }

  /**
   */
  public static final class ConsumerStub extends io.grpc.stub.AbstractAsyncStub<ConsumerStub> {
    private ConsumerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumerStub(channel, callOptions);
    }

    /**
     */
    public void consume(de.com.fdm.grpc.lib.TwitchMessage request,
        io.grpc.stub.StreamObserver<de.com.fdm.grpc.lib.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConsumerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConsumerBlockingStub> {
    private ConsumerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumerBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.com.fdm.grpc.lib.Empty consume(de.com.fdm.grpc.lib.TwitchMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsumeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConsumerFutureStub extends io.grpc.stub.AbstractFutureStub<ConsumerFutureStub> {
    private ConsumerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConsumerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.com.fdm.grpc.lib.Empty> consume(
        de.com.fdm.grpc.lib.TwitchMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSUME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsumerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsumerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSUME:
          serviceImpl.consume((de.com.fdm.grpc.lib.TwitchMessage) request,
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

  private static abstract class ConsumerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsumerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.com.fdm.grpc.lib.ReceiverProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Consumer");
    }
  }

  private static final class ConsumerFileDescriptorSupplier
      extends ConsumerBaseDescriptorSupplier {
    ConsumerFileDescriptorSupplier() {}
  }

  private static final class ConsumerMethodDescriptorSupplier
      extends ConsumerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsumerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConsumerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsumerFileDescriptorSupplier())
              .addMethod(getConsumeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
