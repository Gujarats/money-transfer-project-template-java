package moneytransferapp.util;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.serviceclient.WorkflowServiceStubsOptions;

public class Utils {
  public static WorkflowClient initConnectionServer() {
    WorkflowServiceStubsOptions options = WorkflowServiceStubsOptions.newBuilder()
        .setTarget("localhost:7233")
        //.setTarget("127.0.0.1:7233")
        .build();
    WorkflowServiceStubs service = WorkflowServiceStubs.newInstance(options);
    WorkflowClient client = WorkflowClient.newInstance(service);
    return client;
  }

}
