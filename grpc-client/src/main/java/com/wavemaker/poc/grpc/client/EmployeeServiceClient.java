package com.wavemaker.poc.grpc.client;

import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;
import com.wavemaker.poc.grpc.model.Employee;
import com.wavemaker.poc.grpc.model.EmployeeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class EmployeeServiceClient {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceClient.class);
    private static final ManagedChannel channel = ManagedChannelBuilder
            .forAddress("localhost", 50051)
            .usePlaintext()
            .build();


    public static void main(String[] args) throws InterruptedException {
        try {
            addEmployeeAsync();
            addEmployeeSync();
//            addEmployees();
//            getEmployees();
//            getEmployeesStream();
            invokeTest();
        } catch (StatusRuntimeException e) {
            logger.error(e.getStatus().getDescription());
            logger.error(e.getStatus().getCode().name());
            logger.error(e.getMessage());
            assert e.getTrailers() != null;
            logger.error(e.getTrailers().toString());
        }
//        serverStreaminRPC();
    }

    private static void addEmployeeAsync() {
        Employee emp1 = Employee.newBuilder().setId("1").setFirstname("Eric").setLastname("Linn").build();
        CountDownLatch finishLatch = new CountDownLatch(1);
        EmployeeServiceGrpc.newStub(channel).addEmployee(emp1, new StreamObserver<StringValue>() {
            @Override
            public void onNext(StringValue value) {
                logger.info("got value {} ", value.getValue());
            }

            @Override
            public void onError(Throwable t) {
                logger.error("error while invoking addEmployee", t);
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
                logger.info("Stream completed by server");
            }
        });
        try {
            if (!finishLatch.await(120, TimeUnit.SECONDS)) {
                logger.warn("FAILED : Process orders cannot finish within 60 seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        channelShutdown();
    }

    private static void addEmployeeSync() {
        Employee emp1 = Employee.newBuilder().setId("1").setFirstname("Eric").setLastname("Linn").build();
        StringValue stringValue = EmployeeServiceGrpc.newBlockingStub(channel).addEmployee(emp1);
        logger.info(" server added emp {} ", stringValue.getValue());
        channelShutdown();
    }


    private static void addEmployees() throws InterruptedException {
        EmployeeServiceGrpc.EmployeeServiceStub asyncStub = EmployeeServiceGrpc.newStub(channel);
        CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<Employee> employeeStreamObserver = asyncStub.addEmployees(new StreamObserver<StringValue>() {

            @Override
            public void onNext(StringValue value) {
                logger.info("Value obtained during adding employee {}", value.getValue());
            }

            @Override
            public void onError(Throwable t) {
                logger.error("Error while receiving response ", t);
            }

            @Override
            public void onCompleted() {
                logger.info("Server completed sending the value");
                finishLatch.countDown();
            }
        });
        employeeStreamObserver.onNext(Employee.newBuilder().setId("1").setActive(true).setFirstname("Eric").setLastname("Linn").build());
        employeeStreamObserver.onNext(Employee.newBuilder().setId("2").setActive(true).setFirstname("John").setLastname("Linn").build());
        employeeStreamObserver.onNext(Employee.newBuilder().setId("3").setActive(true).setFirstname("Wick").setLastname("Linn").build());
        employeeStreamObserver.onNext(Employee.newBuilder().setId("4").setActive(true).setFirstname("Joshua").setLastname("Linn").build());
        employeeStreamObserver.onCompleted();
        try {
            if (!finishLatch.await(120, TimeUnit.SECONDS)) {
                logger.warn("FAILED : Process orders cannot finish within 60 seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        channelShutdown();
    }

    private static void getEmployees() {
        EmployeeServiceGrpc.EmployeeServiceStub stub = EmployeeServiceGrpc.newStub(channel);
        CountDownLatch finishLatch = new CountDownLatch(1);
        stub.getEmployees(Empty.newBuilder().build(), new StreamObserver<Employee>() {

            @Override
            public void onNext(Employee value) {
                logger.info("Employee got {} ", value);
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
                logger.info("Stream is closed ");
            }
        });
        try {
            if (!finishLatch.await(120, TimeUnit.SECONDS)) {
                logger.warn("FAILED : Process orders cannot finish within 60 seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        channelShutdown();

    }

    private static void getEmployeesStream() {
        EmployeeServiceGrpc.EmployeeServiceStub stub = EmployeeServiceGrpc.newStub(channel);
        StreamObserver<StringValue> employeesStream = stub.getEmployeesStream(new StreamObserver<Employee>() {
            @Override
            public void onNext(Employee value) {
                logger.info("Server sent value {} ", value);
            }

            @Override
            public void onError(Throwable t) {
                logger.error("Some error occurred ", t);
            }

            @Override
            public void onCompleted() {
                logger.error("Server ended the Stream");
            }
        });
        employeesStream.onNext(StringValue.newBuilder().setValue("1").build());
        employeesStream.onNext(StringValue.newBuilder().setValue("2").build());
        employeesStream.onNext(StringValue.newBuilder().setValue("3").build());
        try {
            Thread.sleep(3000);
            employeesStream.onCompleted();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void invokeTest() {
        EmployeeServiceGrpc.EmployeeServiceStub employeeServiceStub = EmployeeServiceGrpc.newStub(channel);
        CountDownLatch finishLatch = new CountDownLatch(1);
        employeeServiceStub.test(StringValue.newBuilder().setValue("1").build(), new StreamObserver<Employee>() {
            @Override
            public void onNext(Employee value) {

            }

            @Override
            public void onError(Throwable t) {
                logger.error("error ", t);
                logger.error("-------------");
                if (t instanceof StatusRuntimeException) {
                    StatusRuntimeException exception = (StatusRuntimeException) t;
                    logger.error(exception.getMessage());
                    logger.error(exception.getTrailers().toString());
                    logger.error(exception.getStatus().toString());
                }
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        });
        try {
            if (!finishLatch.await(120, TimeUnit.SECONDS)) {
                logger.warn("FAILED : Process orders cannot finish within 60 seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void channelShutdown() {
//        channel.shutdown();
    }

}
