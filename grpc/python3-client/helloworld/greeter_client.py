
"""The Python implementation of the GRPC client."""

from __future__ import print_function

import grpc

import services_pb2
import services_pb2_grpc


def run():
  channel = grpc.insecure_channel('localhost:2901')
  stub = services_pb2_grpc.GreetingServiceStub(channel)
  response = stub.greeting(services_pb2.HelloRequest(msg='Hello'))
  print("From Server: " + response.greeting)


if __name__ == '__main__':
  run()
