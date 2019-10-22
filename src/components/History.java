package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class History extends JFrame {

	private JPanel contentPane;
	private JTextField txtHistory;
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
					History frame = new History();
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
	public History() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnYourRide = new JButton("Your Ride");
		
		JButton btnJoinARide = new JButton("Join A Ride");
		
		JButton btnFeedback = new JButton("Feedback");
		
		JLabel lblNammaRide = new JLabel("\r\n\r\n");
		lblNammaRide.setForeground(new Color(255, 255, 255));
		lblNammaRide.setBackground(new Color(0, 0, 0));
		lblNammaRide.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		
		JButton btnDashboard = new JButton("Dashboard");
		
		JButton btnViewProfile = new JButton("View Profile");
		
		JButton btnOfferARide = new JButton("Offer A Ride");
		
		txtHistory = new JTextField();
		txtHistory.setText("History");
		txtHistory.setColumns(10);
		
		txtTrip = new JTextField();
		txtTrip.setText("Trip1");
		txtTrip.setColumns(10);
		
		txtTrip_1 = new JTextField();
		txtTrip_1.setText("Trip2");
		txtTrip_1.setColumns(10);
		
		txtTrip_2 = new JTextField();
		txtTrip_2.setText("Trip3");
		txtTrip_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
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
		label.setBounds(0, 0, 457, 72);
		panel.add(label);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnYourRide, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnDashboard, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnViewProfile)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnFeedback, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnOfferARide, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(btnJoinARide, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTrip_2, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
						.addComponent(txtTrip_1, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
						.addComponent(txtTrip, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
						.addComponent(txtHistory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(242))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 884, GroupLayout.PREFERRED_SIZE)
					.addGap(88)
					.addComponent(lblNammaRide, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addComponent(lblNammaRide))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnYourRide)
						.addComponent(txtHistory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDashboard)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnViewProfile)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnJoinARide))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(txtTrip, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTrip_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOfferARide)
						.addComponent(txtTrip_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFeedback)
					.addGap(47))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
