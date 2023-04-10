package ds.client;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ds.airqualityservice.*;

public class GUIapplication {

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
	
		
	/**
	 * Initialize the contents of the frame.
	 */
	public GUIapplication() {
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
//				
//				int num1 = Integer.parseInt(textNumber1.getText());
//				int num2 = Integer.parseInt(textNumber2.getText());
//
//				int index = comboOperation.getSelectedIndex();
//				
//				if (index == 0) { textResponse.append("Result of Addition" + String.valueOf(num1 + num2)); }
//				if (index == 1) { textResponse.append("Result of Subtraction" + String.valueOf(num1 - num2)); }
//				if (index == 2) { textResponse.append("Result of Multiplication" + String.valueOf(num1 * num2)); }
//				if (index == 3) { textResponse.append("Result of Division" + String.valueOf(num1 / num2)); }
//
			}
		});
}
}
