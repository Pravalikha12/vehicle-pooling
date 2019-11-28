package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Layout extends JFrame {

	private JDesktopPane contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
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
	public Layout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JDesktopPane();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		YourRide yourRide = new YourRide();
		Dashboard dashboard = new Dashboard();
		JoinARide joinARide = new JoinARide();
		OfferARide offerARide = new OfferARide();
		ViewProfile viewProfile = new ViewProfile();
		Feedback feedback = new Feedback();
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 45, 221, 299);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBackground(Color.YELLOW);
		internalFrame.setBounds(205, 45, 779, 460);
		contentPane.add(internalFrame);
		internalFrame.setVisible(true);
		internalFrame.setContentPane(viewProfile);
		
		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnFeedback.setBackground(Color.RED);
		btnFeedback.setForeground(SystemColor.infoText);
		btnFeedback.setBounds(21, 257, 175, 31);
		panel.add(btnFeedback);
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(feedback);
				}
				catch(Exception e){
					
				}
			}});
				
		JButton btnOfferARide = new JButton("Offer A Ride");
		btnOfferARide.setForeground(Color.BLACK);
		btnOfferARide.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnOfferARide.setBackground(Color.RED);
		btnOfferARide.setBounds(21, 215, 175, 31);
		panel.add(btnOfferARide);
		btnOfferARide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(offerARide);
				}
				catch(Exception e){
					
				}
			}});
		
		JButton btnJoinARide = new JButton("Join A Ride");
		btnJoinARide.setForeground(Color.BLACK);
		btnJoinARide.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnJoinARide.setBackground(Color.RED);
		btnJoinARide.setBounds(21, 173, 175, 31);
		panel.add(btnJoinARide);
		btnJoinARide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(joinARide);
				}
				catch(Exception e){
					
				}
			}});
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setForeground(Color.BLACK);
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnViewProfile.setBackground(Color.RED);
		btnViewProfile.setBounds(21, 131, 175, 31);
		panel.add(btnViewProfile);
		btnViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(viewProfile);
				}
				catch(Exception e){
					
				}
			}});
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setForeground(Color.BLACK);
		btnDashboard.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnDashboard.setBackground(Color.RED);
		btnDashboard.setBounds(21, 89, 175, 31);
		panel.add(btnDashboard);
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(dashboard);
				}
				catch(Exception e){
					
				}
			}});
		
		JButton btnYourRide = new JButton("Your Ride");
		btnYourRide.setForeground(Color.BLACK);
		btnYourRide.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnYourRide.setBackground(Color.RED);
		btnYourRide.setBounds(21, 47, 175, 31);
		panel.add(btnYourRide);
		btnYourRide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(yourRide);
				}
				catch(Exception e){
					
				}
			}});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.RED);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 721, 45);
		contentPane.add(panel_1);
		
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
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 343, 721, 30);
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("All Rights Reserved 2019 \u00A9 ");
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(0, 0, 206, 30);
		panel_2.add(label_1);
		
		
		
	}
}
