package ds.airqualityservice;

import java.io.IOException;

import ds.airqualityservice.AirQualityServiceGrpc.AirQualityServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AirQualityService extends AirQualityServiceImplBase{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		AirQualityService airQualityService = new AirQualityService();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(airQualityService)
				.build()
				.start();

		System.out.println("Service-1 started, listening on " + port);

		server.awaitTermination();
	}
	
	//public void 
} 