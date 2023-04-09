package ds.airqualityservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: airqualityservice.proto")
public final class AirQualityServiceGrpc {

  private AirQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "airquality.AirQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.airqualityservice.GetLatestReadingRequest,
      ds.airqualityservice.GetLatestReadingResponse> getGetLatestReadingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestReading",
      requestType = ds.airqualityservice.GetLatestReadingRequest.class,
      responseType = ds.airqualityservice.GetLatestReadingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.airqualityservice.GetLatestReadingRequest,
      ds.airqualityservice.GetLatestReadingResponse> getGetLatestReadingMethod() {
    io.grpc.MethodDescriptor<ds.airqualityservice.GetLatestReadingRequest, ds.airqualityservice.GetLatestReadingResponse> getGetLatestReadingMethod;
    if ((getGetLatestReadingMethod = AirQualityServiceGrpc.getGetLatestReadingMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetLatestReadingMethod = AirQualityServiceGrpc.getGetLatestReadingMethod) == null) {
          AirQualityServiceGrpc.getGetLatestReadingMethod = getGetLatestReadingMethod = 
              io.grpc.MethodDescriptor.<ds.airqualityservice.GetLatestReadingRequest, ds.airqualityservice.GetLatestReadingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AirQualityService", "GetLatestReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airqualityservice.GetLatestReadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airqualityservice.GetLatestReadingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("GetLatestReading"))
                  .build();
          }
        }
     }
     return getGetLatestReadingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.airqualityservice.GetHistoricalDataRequest,
      ds.airqualityservice.GetHistoricalDataResponse> getGetHistoricalDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHistoricalData",
      requestType = ds.airqualityservice.GetHistoricalDataRequest.class,
      responseType = ds.airqualityservice.GetHistoricalDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.airqualityservice.GetHistoricalDataRequest,
      ds.airqualityservice.GetHistoricalDataResponse> getGetHistoricalDataMethod() {
    io.grpc.MethodDescriptor<ds.airqualityservice.GetHistoricalDataRequest, ds.airqualityservice.GetHistoricalDataResponse> getGetHistoricalDataMethod;
    if ((getGetHistoricalDataMethod = AirQualityServiceGrpc.getGetHistoricalDataMethod) == null) {
      synchronized (AirQualityServiceGrpc.class) {
        if ((getGetHistoricalDataMethod = AirQualityServiceGrpc.getGetHistoricalDataMethod) == null) {
          AirQualityServiceGrpc.getGetHistoricalDataMethod = getGetHistoricalDataMethod = 
              io.grpc.MethodDescriptor.<ds.airqualityservice.GetHistoricalDataRequest, ds.airqualityservice.GetHistoricalDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AirQualityService", "GetHistoricalData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airqualityservice.GetHistoricalDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.airqualityservice.GetHistoricalDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualityServiceMethodDescriptorSupplier("GetHistoricalData"))
                  .build();
          }
        }
     }
     return getGetHistoricalDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualityServiceStub newStub(io.grpc.Channel channel) {
    return new AirQualityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirQualityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirQualityServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AirQualityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLatestReading(ds.airqualityservice.GetLatestReadingRequest request,
        io.grpc.stub.StreamObserver<ds.airqualityservice.GetLatestReadingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestReadingMethod(), responseObserver);
    }

    /**
     */
    public void getHistoricalData(ds.airqualityservice.GetHistoricalDataRequest request,
        io.grpc.stub.StreamObserver<ds.airqualityservice.GetHistoricalDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHistoricalDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLatestReadingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.airqualityservice.GetLatestReadingRequest,
                ds.airqualityservice.GetLatestReadingResponse>(
                  this, METHODID_GET_LATEST_READING)))
          .addMethod(
            getGetHistoricalDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.airqualityservice.GetHistoricalDataRequest,
                ds.airqualityservice.GetHistoricalDataResponse>(
                  this, METHODID_GET_HISTORICAL_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirQualityServiceStub extends io.grpc.stub.AbstractStub<AirQualityServiceStub> {
    private AirQualityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLatestReading(ds.airqualityservice.GetLatestReadingRequest request,
        io.grpc.stub.StreamObserver<ds.airqualityservice.GetLatestReadingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestReadingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHistoricalData(ds.airqualityservice.GetHistoricalDataRequest request,
        io.grpc.stub.StreamObserver<ds.airqualityservice.GetHistoricalDataResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetHistoricalDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirQualityServiceBlockingStub extends io.grpc.stub.AbstractStub<AirQualityServiceBlockingStub> {
    private AirQualityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.airqualityservice.GetLatestReadingResponse getLatestReading(ds.airqualityservice.GetLatestReadingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestReadingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.airqualityservice.GetHistoricalDataResponse> getHistoricalData(
        ds.airqualityservice.GetHistoricalDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetHistoricalDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirQualityServiceFutureStub extends io.grpc.stub.AbstractStub<AirQualityServiceFutureStub> {
    private AirQualityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.airqualityservice.GetLatestReadingResponse> getLatestReading(
        ds.airqualityservice.GetLatestReadingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestReadingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LATEST_READING = 0;
  private static final int METHODID_GET_HISTORICAL_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirQualityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirQualityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LATEST_READING:
          serviceImpl.getLatestReading((ds.airqualityservice.GetLatestReadingRequest) request,
              (io.grpc.stub.StreamObserver<ds.airqualityservice.GetLatestReadingResponse>) responseObserver);
          break;
        case METHODID_GET_HISTORICAL_DATA:
          serviceImpl.getHistoricalData((ds.airqualityservice.GetHistoricalDataRequest) request,
              (io.grpc.stub.StreamObserver<ds.airqualityservice.GetHistoricalDataResponse>) responseObserver);
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

  private static abstract class AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.airqualityservice.AirQualityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQualityService");
    }
  }

  private static final class AirQualityServiceFileDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier {
    AirQualityServiceFileDescriptorSupplier() {}
  }

  private static final class AirQualityServiceMethodDescriptorSupplier
      extends AirQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualityServiceFileDescriptorSupplier())
              .addMethod(getGetLatestReadingMethod())
              .addMethod(getGetHistoricalDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
