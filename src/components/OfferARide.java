package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OfferARide extends JPanel {
	private JTextField txtDestination;
	private JTextField txtSource;
	private JTextField txtTime;
	private JTextField txtCar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public OfferARide() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.RED);
		panel.setBounds(-30, 0, 968, 557);
		add(panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(63, 36, 867, 483);
		panel.add(panel_3);
		
		txtDestination = new JTextField();
		txtDestination.setText("Destination");
		txtDestination.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtDestination.setColumns(10);
		txtDestination.setBounds(66, 34, 251, 46);
		panel_3.add(txtDestination);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTo.setBounds(15, 42, 131, 28);
		panel_3.add(lblTo);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblFrom.setBounds(454, 41, 67, 28);
		panel_3.add(lblFrom);
		
		txtSource = new JTextField();
		txtSource.setText("Source");
		txtSource.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtSource.setColumns(10);
		txtSource.setBounds(536, 34, 251, 46);
		panel_3.add(txtSource);
		
		JLabel lblScheduleTime = new JLabel("Schedule time:");
		lblScheduleTime.setForeground(Color.WHITE);
		lblScheduleTime.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblScheduleTime.setBounds(15, 114, 219, 28);
		panel_3.add(lblScheduleTime);
		
		txtTime = new JTextField();
		txtTime.setText("Time");
		txtTime.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTime.setColumns(10);
		txtTime.setBounds(66, 148, 251, 46);
		panel_3.add(txtTime);
		
		txtCar = new JTextField();
		txtCar.setText("Car");
		txtCar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtCar.setColumns(10);
		txtCar.setBounds(536, 155, 251, 46);
		panel_3.add(txtCar);
		
		JLabel lblVehicle = new JLabel("Vehicle:");
		lblVehicle.setForeground(Color.WHITE);
		lblVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblVehicle.setBounds(445, 155, 76, 28);
		panel_3.add(lblVehicle);
		
		JButton btnOffer = new JButton("Offer");
		btnOffer.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnOffer.setBounds(365, 226, 115, 29);
		panel_3.add(btnOffer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 271, 341, 181);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTripId = new JLabel("Trip id");
		lblTripId.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblTripId.setBounds(15, 23, 69, 20);
		panel_1.add(lblTripId);
		
		textField = new JTextField();
		textField.setBounds(114, 21, 146, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblVehicleId = new JLabel("Vehicle id");
		lblVehicleId.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblVehicleId.setBounds(15, 72, 84, 20);
		panel_1.add(lblVehicleId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 70, 146, 26);
		panel_1.add(textField_1);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblCapacity.setBounds(15, 120, 69, 20);
		panel_1.add(lblCapacity);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(114, 118, 146, 26);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(478, 271, 363, 181);
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnViewProfile.setBounds(15, 122, 115, 29);
		panel_2.add(btnViewProfile);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAccept.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAccept.setBounds(131, 122, 105, 29);
		panel_2.add(btnAccept);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReject.setBounds(239, 122, 97, 29);
		panel_2.add(btnReject);
		
		JLabel lblNewLabel = new JLabel("Carol M Thars has requested a ride");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 16, 264, 44);
		panel_2.add(lblNewLabel);

	}
}
