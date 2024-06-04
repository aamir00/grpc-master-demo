package com.wavemaker.poc.grpc.server;

import io.grpc.ForwardingServerCallListener;
import io.grpc.ServerCall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeServiceListener<ReqT> extends ForwardingServerCallListener<ReqT> {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceListener.class);
    private final ServerCall.Listener<ReqT> delegate;


    EmployeeServiceListener(ServerCall.Listener<ReqT> delegate) {
        this.delegate = delegate;
    }

    @Override
    protected ServerCall.Listener<ReqT> delegate() {
        return this.delegate;
    }

    @Override
    public void onMessage(ReqT message) {
        logger.info("Message Received from Client -> Service " + message);
        super.onMessage(message);
    }
}
