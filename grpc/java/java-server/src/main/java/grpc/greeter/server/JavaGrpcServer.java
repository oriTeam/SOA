package grpc.greeter.server;

import grpc.greeter.GreetingServiceGrpc;
import grpc.greeter.HelloRequest;
import grpc.greeter.HelloResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class JavaGrpcServer {
  static public void main(String [] args) throws IOException, InterruptedException {
    Server server = ServerBuilder.forPort(2901)
        .addService(new GreetingServiceImpl()).build();

    System.out.println("Starting Java-Server...");
    server.start();
    System.out.println("Java-Server already started ! Listening ...");
    server.awaitTermination();
  }

  public static class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
      System.out.println("Client: " + request.getMsg());

      String greeting = request.getMsg() + " all clients";

      HelloResponse response = HelloResponse.newBuilder().setGreeting(greeting).build();

      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }
}
