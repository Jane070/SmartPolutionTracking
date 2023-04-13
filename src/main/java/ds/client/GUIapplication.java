package ds.client;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ds.airqualityservice.*;
import ds.airqualityservice.AirQualityServiceGrpc.AirQualityServiceBlockingStub;
import ds.airqualityservice.AirQualityServiceGrpc.AirQualityServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUIapplication {

	private static AirQualityServiceBlockingStub blockingStub;
	private static AirQualityServiceStub asyncStub;

	private ServiceInfo airQualityServiceInfo;
	
	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextArea textResponse ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIapplication window = new GUIapplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
public GUIapplication() {
		
		String airquality_service_type = "_airqualityservice._tcp.local.";
		discoverAirQualityService(airquality_service_type);
		
		String host = airQualityServiceInfo.getHostAddresses()[0];
		int port = airQualityServiceInfo.getPort();
		
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = AirQualityServiceGrpc.newBlockingStub(channel);

		asyncStub = AirQualityServiceGrpc.newStub(channel);

		
		initialize();
	}
		

private void discoverAirQualityService(String service_type) {
	
	
	try {
		// Create a JmDNS instance
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			
		jmdns.addServiceListener(service_type, new ServiceListener() {
			
			@Override
			public void serviceResolved(ServiceEvent event) {
				System.out.println("Math Service resolved: " + event.getInfo());

				airQualityServiceInfo = event.getInfo();

				int port = airQualityServiceInfo.getPort();
				
				System.out.println("resolving " + service_type + " with properties ...");
				System.out.println("\t port: " + port);
				System.out.println("\t type:"+ event.getType());
				System.out.println("\t name: " + event.getName());
				System.out.println("\t description/properties: " + airQualityServiceInfo.getNiceTextString());
				System.out.println("\t host: " + airQualityServiceInfo.getHostAddresses()[0]);
			
				
			}
			
			@Override
			public void serviceRemoved(ServiceEvent event) {
				System.out.println("Math Service removed: " + event.getInfo());

				
			}
			
			@Override
			public void serviceAdded(ServiceEvent event) {
				System.out.println("Math Service added: " + event.getInfo());

				
			}
		});
		
		// Wait a bit
		Thread.sleep(2000);
		
//		jmdns.close();

	} catch (UnknownHostException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		frame.setTitle("Client - Service Controller");
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton btnCalculate = new JButton("Get latest reading about air quality");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GetLatestReadingRequest req = GetLatestReadingRequest.newBuilder().setLatestreading(null).build();

				GetLatestReadingResponse response = blockingStub.getLatestReading(req);
				
				System.out.println("Message sent by the server " + response.getPm25());

			}
		});
		
        panel_service_1.add(btnCalculate);
		
		textResponse = new JTextArea(3, 20);
		textResponse .setLineWrap(true);
		textResponse.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_1.add(scrollPane);
		
}
}
