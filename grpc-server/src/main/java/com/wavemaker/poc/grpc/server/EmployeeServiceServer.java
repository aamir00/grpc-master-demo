package com.wavemaker.poc.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class EmployeeServiceServer {
    private static Server server = null;

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceServer.class);

    public static void main(String[] args) {
        int port = 50051;
        try {
            server = ServerBuilder.forPort(port)
                    .addService(ServerInterceptors.intercept(new EmployeeServiceImpl(), new EmployeeServerInterceptor()))
                    .build()
                    .start();

            logger.debug("Server started, listening on {} ", port);
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                logger.warn("Shutting down gRPC server since JVM is shutting down");
                if (server != null) {
                    server.shutdown();
                }
                logger.warn("Server shut down");
            }));

            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
