package com.wavemaker.poc.grpc.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: EmployeeService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "grpctest.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wavemaker.poc.grpc.model.Employee,
      com.google.protobuf.StringValue> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployee",
      requestType = com.wavemaker.poc.grpc.model.Employee.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wavemaker.poc.grpc.model.Employee,
      com.google.protobuf.StringValue> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<com.wavemaker.poc.grpc.model.Employee, com.google.protobuf.StringValue> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
          EmployeeServiceGrpc.getAddEmployeeMethod = getAddEmployeeMethod =
              io.grpc.MethodDescriptor.<com.wavemaker.poc.grpc.model.Employee, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wavemaker.poc.grpc.model.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("addEmployee"))
              .build();
        }
      }
    }
    return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.wavemaker.poc.grpc.model.Employee> getGetEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployee",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.wavemaker.poc.grpc.model.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.wavemaker.poc.grpc.model.Employee> getGetEmployeeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.wavemaker.poc.grpc.model.Employee> getGetEmployeeMethod;
    if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeMethod = EmployeeServiceGrpc.getGetEmployeeMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeMethod = getGetEmployeeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.wavemaker.poc.grpc.model.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wavemaker.poc.grpc.model.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployee"))
              .build();
        }
      }
    }
    return getGetEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wavemaker.poc.grpc.model.Employee,
      com.google.protobuf.StringValue> getAddEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployees",
      requestType = com.wavemaker.poc.grpc.model.Employee.class,
      responseType = com.google.protobuf.StringValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.wavemaker.poc.grpc.model.Employee,
      com.google.protobuf.StringValue> getAddEmployeesMethod() {
    io.grpc.MethodDescriptor<com.wavemaker.poc.grpc.model.Employee, com.google.protobuf.StringValue> getAddEmployeesMethod;
    if ((getAddEmployeesMethod = EmployeeServiceGrpc.getAddEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddEmployeesMethod = EmployeeServiceGrpc.getAddEmployeesMethod) == null) {
          EmployeeServiceGrpc.getAddEmployeesMethod = getAddEmployeesMethod =
              io.grpc.MethodDescriptor.<com.wavemaker.poc.grpc.model.Employee, com.google.protobuf.StringValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wavemaker.poc.grpc.model.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("addEmployees"))
              .build();
        }
      }
    }
    return getAddEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.wavemaker.poc.grpc.model.Employee> getGetEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployees",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.wavemaker.poc.grpc.model.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.wavemaker.poc.grpc.model.Employee> getGetEmployeesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.wavemaker.poc.grpc.model.Employee> getGetEmployeesMethod;
    if ((getGetEmployeesMethod = EmployeeServiceGrpc.getGetEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeesMethod = EmployeeServiceGrpc.getGetEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeesMethod = getGetEmployeesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.wavemaker.poc.grpc.model.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wavemaker.poc.grpc.model.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployees"))
              .build();
        }
      }
    }
    return getGetEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.wavemaker.poc.grpc.model.Employee> getGetEmployeesStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeesStream",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.wavemaker.poc.grpc.model.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.wavemaker.poc.grpc.model.Employee> getGetEmployeesStreamMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.wavemaker.poc.grpc.model.Employee> getGetEmployeesStreamMethod;
    if ((getGetEmployeesStreamMethod = EmployeeServiceGrpc.getGetEmployeesStreamMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeesStreamMethod = EmployeeServiceGrpc.getGetEmployeesStreamMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeesStreamMethod = getGetEmployeesStreamMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.wavemaker.poc.grpc.model.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeesStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wavemaker.poc.grpc.model.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeesStream"))
              .build();
        }
      }
    }
    return getGetEmployeesStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.wavemaker.poc.grpc.model.Employee> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.wavemaker.poc.grpc.model.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.wavemaker.poc.grpc.model.Employee> getTestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.wavemaker.poc.grpc.model.Employee> getTestMethod;
    if ((getTestMethod = EmployeeServiceGrpc.getTestMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getTestMethod = EmployeeServiceGrpc.getTestMethod) == null) {
          EmployeeServiceGrpc.getTestMethod = getTestMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.wavemaker.poc.grpc.model.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wavemaker.poc.grpc.model.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("test"))
              .build();
        }
      }
    }
    return getTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addEmployee(com.wavemaker.poc.grpc.model.Employee request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void getEmployee(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> addEmployees(
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddEmployeesMethod(), responseObserver);
    }

    /**
     */
    default void getEmployees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> getEmployeesStream(
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetEmployeesStreamMethod(), responseObserver);
    }

    /**
     */
    default void test(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeService.
   */
  public static abstract class EmployeeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void addEmployee(com.wavemaker.poc.grpc.model.Employee request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployee(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> addEmployees(
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAddEmployeesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getEmployees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> getEmployeesStream(
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetEmployeesStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void test(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.StringValue addEmployee(com.wavemaker.poc.grpc.model.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wavemaker.poc.grpc.model.Employee getEmployee(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wavemaker.poc.grpc.model.Employee> getEmployees(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetEmployeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wavemaker.poc.grpc.model.Employee test(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> addEmployee(
        com.wavemaker.poc.grpc.model.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wavemaker.poc.grpc.model.Employee> getEmployee(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wavemaker.poc.grpc.model.Employee> test(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EMPLOYEE = 0;
  private static final int METHODID_GET_EMPLOYEE = 1;
  private static final int METHODID_GET_EMPLOYEES = 2;
  private static final int METHODID_TEST = 3;
  private static final int METHODID_ADD_EMPLOYEES = 4;
  private static final int METHODID_GET_EMPLOYEES_STREAM = 5;

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
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((com.wavemaker.poc.grpc.model.Employee) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE:
          serviceImpl.getEmployee((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEES:
          serviceImpl.getEmployees((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee>) responseObserver);
          break;
        case METHODID_TEST:
          serviceImpl.test((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee>) responseObserver);
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
        case METHODID_ADD_EMPLOYEES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addEmployees(
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
        case METHODID_GET_EMPLOYEES_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getEmployeesStream(
              (io.grpc.stub.StreamObserver<com.wavemaker.poc.grpc.model.Employee>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wavemaker.poc.grpc.model.Employee,
              com.google.protobuf.StringValue>(
                service, METHODID_ADD_EMPLOYEE)))
        .addMethod(
          getGetEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.wavemaker.poc.grpc.model.Employee>(
                service, METHODID_GET_EMPLOYEE)))
        .addMethod(
          getAddEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.wavemaker.poc.grpc.model.Employee,
              com.google.protobuf.StringValue>(
                service, METHODID_ADD_EMPLOYEES)))
        .addMethod(
          getGetEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.wavemaker.poc.grpc.model.Employee>(
                service, METHODID_GET_EMPLOYEES)))
        .addMethod(
          getGetEmployeesStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.wavemaker.poc.grpc.model.Employee>(
                service, METHODID_GET_EMPLOYEES_STREAM)))
        .addMethod(
          getTestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.wavemaker.poc.grpc.model.Employee>(
                service, METHODID_TEST)))
        .build();
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wavemaker.poc.grpc.model.EmployeeServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getGetEmployeeMethod())
              .addMethod(getAddEmployeesMethod())
              .addMethod(getGetEmployeesMethod())
              .addMethod(getGetEmployeesStreamMethod())
              .addMethod(getTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
