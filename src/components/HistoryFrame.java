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
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

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
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		JButton btnYourRide = new JButton("Your Ride");
		btnYourRide.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		JButton btnJoinARide = new JButton("Join A Ride");
		btnJoinARide.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		JButton btnOfferARide = new JButton("Offer A Ride");
		btnOfferARide.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		txtAllRightsReserved = new JTextField();
		txtAllRightsReserved.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtAllRightsReserved.setHorizontalAlignment(SwingConstants.CENTER);
		txtAllRightsReserved.setText("All Rights Reserved 2019 @");
		txtAllRightsReserved.setBackground(Color.RED);
		txtAllRightsReserved.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(Color.BLACK);
		
		txtTrip = new JTextField();
		txtTrip.setText("Trip1");
		txtTrip.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTrip.setColumns(10);
		
		txtTrip_1 = new JTextField();
		txtTrip_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTrip_1.setText("Trip2");
		txtTrip_1.setColumns(10);
		
		txtTrip_2 = new JTextField();
		txtTrip_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtTrip_2.setText("Trip3");
		txtTrip_2.setColumns(10);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblHistory.setForeground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(txtAllRightsReserved, GroupLayout.PREFERRED_SIZE, 713, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
					.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addGap(10)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(txtAllRightsReserved, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnYourRide, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewProfile, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnJoinARide, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOfferARide, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFeedback, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addComponent(btnYourRide, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnViewProfile, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnJoinARide, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnOfferARide, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnFeedback, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHistory, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTrip, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTrip_1, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTrip_2, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(11)
					.addComponent(lblHistory, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(txtTrip, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(txtTrip_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(txtTrip_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel, label, panel_1, btnNewButton, btnYourRide, btnViewProfile, btnJoinARide, btnOfferARide, btnFeedback, txtAllRightsReserved, panel_2, txtTrip, txtTrip_1, txtTrip_2, lblHistory}));
	}
}
