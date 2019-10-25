package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HistoryFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtAllRightsReserved;
	private JTextField txtTrip;
	private JTextField txtTrip_1;
	private JTextField txtTrip_2;

	/** 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistoryFrame frame = new HistoryFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HistoryFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 868, 57);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Namma Ride");
		label.setVerticalTextPosition(SwingConstants.TOP);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIconTextGap(8);
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.RED);
		label.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 39));
		label.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		label.setBackground(SystemColor.menu);
		label.setBounds(0, 0, 424, 45);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 68, 238, 345);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton.setBounds(15, 83, 206, 39);
		panel_1.add(btnNewButton);
		
		JButton btnYourRide = new JButton("Your Ride");
		btnYourRide.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnYourRide.setBounds(15, 32, 206, 39);
		panel_1.add(btnYourRide);
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnViewProfile.setBounds(15, 133, 206, 39);
		panel_1.add(btnViewProfile);
		
		JButton btnJoinARide = new JButton("Join A Ride");
		btnJoinARide.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnJoinARide.setBounds(15, 183, 206, 39);
		panel_1.add(btnJoinARide);
		
		JButton btnOfferARide = new JButton("Offer A Ride");
		btnOfferARide.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnOfferARide.setBounds(15, 233, 206, 39);
		panel_1.add(btnOfferARide);
		
		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnFeedback.setBounds(15, 283, 206, 39);
		panel_1.add(btnFeedback);
		
		txtAllRightsReserved = new JTextField();
		txtAllRightsReserved.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtAllRightsReserved.setHorizontalAlignment(SwingConstants.CENTER);
		txtAllRightsReserved.setText("All Rights Reserved 2019 @");
		txtAllRightsReserved.setBackground(Color.RED);
		txtAllRightsReserved.setBounds(0, 420, 713, 36);
		contentPane.add(txtAllRightsReserved);
		txtAllRightsReserved.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(258, 68, 455, 345);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtTrip = new JTextField();
		txtTrip.setText("Trip1");
		txtTrip.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTrip.setBounds(10, 58, 435, 73);
		panel_2.add(txtTrip);
		txtTrip.setColumns(10);
		
		txtTrip_1 = new JTextField();
		txtTrip_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTrip_1.setText("Trip2");
		txtTrip_1.setBounds(10, 156, 435, 73);
		panel_2.add(txtTrip_1);
		txtTrip_1.setColumns(10);
		
		txtTrip_2 = new JTextField();
		txtTrip_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTrip_2.setText("Trip3");
		txtTrip_2.setBounds(10, 253, 435, 67);
		panel_2.add(txtTrip_2);
		txtTrip_2.setColumns(10);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblHistory.setForeground(Color.WHITE);
		lblHistory.setBounds(10, 11, 131, 28);
		panel_2.add(lblHistory);
	}
}
