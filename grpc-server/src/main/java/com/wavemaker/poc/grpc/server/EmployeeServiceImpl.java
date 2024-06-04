package com.wavemaker.poc.grpc.server;


import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;
import com.google.rpc.Code;
import com.wavemaker.poc.grpc.model.Employee;
import com.wavemaker.poc.grpc.model.EmployeeServiceGrpc;
import io.grpc.Status;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private static final Map<String, Employee> employees = new HashMap<>();

    @Override
    public void getEmployees(Empty request, StreamObserver<Employee> responseObserver) {
        employees.forEach((id, employee) -> responseObserver.onNext(employee));
        responseObserver.onCompleted();
    }

    @Override
    public void addEmployee(Employee request, StreamObserver<StringValue> responseObserver) {
        if (employees.containsKey(request.getId())) {
            responseObserver.onError(Status.ALREADY_EXISTS.asException());
        }
        logger.info(" adding employee with id:{}  firstname:{}, active:{], lastname:{}, locations:{}",
                request.getId(), request.getFirstname(), request.getActive(), request.getLastname(), request.getLocations());
        employees.put(request.getId(), request);
        responseObserver.onNext(StringValue.newBuilder().setValue(request.getId()).build());
        responseObserver.onNext(StringValue.newBuilder().setValue("2").build());
        responseObserver.onCompleted();
    }


    @Override
    public StreamObserver<Employee> addEmployees(StreamObserver<StringValue> responseObserver) {

        return new StreamObserver<Employee>() {
            int count;

            boolean responseSent;

            @Override
            public void onNext(Employee value) {
                logger.info("Adding Employee {} {} ", value.getId(), value.getFirstname());
                employees.put(value.getId(), value);
                count++;

                // no need to wait for client to send all the values
                if (count == 3) {
                    responseObserver.onNext(StringValue.newBuilder().setValue(Integer.toString(count)).build());
                    responseObserver.onCompleted();
                    responseSent = true;
                }
            }

            @Override
            public void onError(Throwable t) {
                logger.error("Some error occurred while executing addEmployees ", t);
            }

            @Override
            public void onCompleted() {
                logger.info("Stream addEmployee ended by client, added {} employees", count);
                // can send all the values after the client has sent the details or we can send it any time
//                responseObserver.onNext(StringValue.newBuilder().setValue(Integer.toString(count)).build());
//                responseObserver.onCompleted();
            }
        };

    }


    @Override
    public StreamObserver<StringValue> getEmployeesStream(StreamObserver<Employee> responseObserver) {
        return new StreamObserver<StringValue>() {

            int count;

            @Override
            public void onNext(StringValue empId) {
                responseObserver.onNext(employees.get(empId.getValue()));
                count++;
                if (count == 2) {
                    responseObserver.onCompleted();
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                logger.info("Stream ended by client");
            }
        };
    }


    @Override
    public void test(StringValue request, StreamObserver<Employee> responseObserver) {
//        logger.info("Got Request {} ", request.getValue());
//        responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Invalid ID received.").asException());
        responseObserver.onError(Status.DATA_LOSS.asException());
        com.google.rpc.Status status = com.google.rpc.Status.newBuilder().setCode(Code.RESOURCE_EXHAUSTED_VALUE).setMessage("google rpc error")
                .build();
        responseObserver.onError(StatusProto.toStatusRuntimeException(status));
    }
}
