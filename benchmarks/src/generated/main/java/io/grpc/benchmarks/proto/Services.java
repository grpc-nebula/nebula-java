// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/testing/services.proto

package io.grpc.benchmarks.proto;

public final class Services {
  private Services() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033grpc/testing/services.proto\022\014grpc.test" +
      "ing\032\033grpc/testing/messages.proto\032\032grpc/t" +
      "esting/control.proto2\246\003\n\020BenchmarkServic" +
      "e\022F\n\tUnaryCall\022\033.grpc.testing.SimpleRequ" +
      "est\032\034.grpc.testing.SimpleResponse\022N\n\rStr" +
      "eamingCall\022\033.grpc.testing.SimpleRequest\032" +
      "\034.grpc.testing.SimpleResponse(\0010\001\022R\n\023Str" +
      "eamingFromClient\022\033.grpc.testing.SimpleRe" +
      "quest\032\034.grpc.testing.SimpleResponse(\001\022R\n" +
      "\023StreamingFromServer\022\033.grpc.testing.Simp" +
      "leRequest\032\034.grpc.testing.SimpleResponse0" +
      "\001\022R\n\021StreamingBothWays\022\033.grpc.testing.Si" +
      "mpleRequest\032\034.grpc.testing.SimpleRespons" +
      "e(\0010\0012\227\002\n\rWorkerService\022E\n\tRunServer\022\030.g" +
      "rpc.testing.ServerArgs\032\032.grpc.testing.Se" +
      "rverStatus(\0010\001\022E\n\tRunClient\022\030.grpc.testi" +
      "ng.ClientArgs\032\032.grpc.testing.ClientStatu" +
      "s(\0010\001\022B\n\tCoreCount\022\031.grpc.testing.CoreRe" +
      "quest\032\032.grpc.testing.CoreResponse\0224\n\nQui" +
      "tWorker\022\022.grpc.testing.Void\032\022.grpc.testi" +
      "ng.Void2^\n\030ReportQpsScenarioService\022B\n\016R" +
      "eportScenario\022\034.grpc.testing.ScenarioRes" +
      "ult\032\022.grpc.testing.VoidB$\n\030io.grpc.bench" +
      "marks.protoB\010Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.benchmarks.proto.Messages.getDescriptor(),
          io.grpc.benchmarks.proto.Control.getDescriptor(),
        }, assigner);
    io.grpc.benchmarks.proto.Messages.getDescriptor();
    io.grpc.benchmarks.proto.Control.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
