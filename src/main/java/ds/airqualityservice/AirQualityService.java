package ds.airqualityservice;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Random;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import ds.airqualityservice.AirQualityServiceGrpc.AirQualityServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AirQualityService extends AirQualityServiceImplBase{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		AirQualityService airQualityService = new AirQualityService();
		
		Properties prop = airQualityService.getProperties();
		
		airQualityService.registerService(prop);

		int port = Integer.valueOf( prop.getProperty("service_port") );

		try {
			Server server = ServerBuilder.forPort(port)
					.addService(airQualityService)
					.build()
					.start();

			System.out.println("Air quality service started, listening on " + port);

			server.awaitTermination();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	private void registerService(Properties prop) {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "example";
	           // int service_port = 1234;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

	            
	            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/airqualityservice.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("Air Quality Service properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
		
	}

	public void getLatestReading (GetLatestReadingRequest request, StreamObserver<GetLatestReadingResponse> responseObserver){
		System.out.println("---Receiving get latest reading request from client ---");
		
		int latestReadingString = 50;
		
		GetLatestReadingResponse reply = GetLatestReadingResponse.newBuilder().setPm25(latestReadingString).build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted(); 
} 
	
	public void getHistoricalData(GetHistoricalDataRequest request, StreamObserver<GetHistoricalDataResponse> responseObserver) {
		
		System.out.printf("The last %d days historial data ", request.getNumDays());
		
		Random rand = new Random();
		
		for (int i = 0; i < request.getNumDays(); i++) {
			
			int pm2_5 = rand.nextInt(100);
			
			GetHistoricalDataResponse reply = GetHistoricalDataResponse.newBuilder().setPm25(pm2_5).build();
			
			responseObserver.onNext(reply);
		
		
		try {
			//wait for a second
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		responseObserver.onCompleted();
}
			
}











