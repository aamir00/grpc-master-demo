package com.wavemaker.poc.grpc.client;


import com.wavemaker.poc.grpc.model.EchoRequest;

public class SampleBuilderMain {


    public static void main(String[] args) {
        EchoRequest request = EchoRequest.newBuilder()
                .setFirstName("hello")
                .setLastName("world")
                .build();
        System.out.println(request.isInitialized());
        System.out.println(request.getUnknownFields());
        System.out.println(request.hashCode());
    }
}
