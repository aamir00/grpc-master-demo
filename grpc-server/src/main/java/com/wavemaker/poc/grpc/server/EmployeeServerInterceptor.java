package com.wavemaker.poc.grpc.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeServerInterceptor implements ServerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServerInterceptor.class);
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        logger.info("Inside interceptor {} ", call.getAttributes());
        logger.info(" {} ", call.getAuthority());
        logger.info(" {} ", call.getMethodDescriptor());
        logger.info(" {} ", headers.toString());
        return new EmployeeServiceListener<>(next.startCall(call,headers));
    }
}
