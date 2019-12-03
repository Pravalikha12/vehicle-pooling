package components;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Layout extends JFrame {

	private JDesktopPane contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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
		setBounds(100, 100, 1000, 600);

		contentPane = new JDesktopPane();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		YourRide yourRide = new YourRide();
		Dashboard dashboard = new Dashboard();
		JoinARide joinARide = new JoinARide();
		OfferARide offerARide = new OfferARide();
		ViewProfile viewProfile = new ViewProfile();
		viewProfile.setForeground(Color.WHITE);
		viewProfile.setBackground(new Color(30, 144, 255));
		Feedback feedback = new Feedback();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		System.out.println("before internal frame");

		panel.setBounds(0, 78, 325, 709);
		contentPane.add(panel);
		panel.setLayout(null);

		JInternalFrame internalFrame = new JInternalFrame("Vehicle Pooling for BMSCE");
		internalFrame.setForeground(new Color(0, 0, 128));
		internalFrame.setBackground(new Color(30, 144, 255));
		// internalFrame.setBounds(327, 110, 910, 510);
		internalFrame.setBounds(324, 78, 990, 580);

		internalFrame.setVisible(true);
		internalFrame.setResizable(false);

		contentPane.add(internalFrame);
		System.out.println("after internal frame");

		JScrollPane JViewProfile = new JScrollPane(viewProfile, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		internalFrame.setContentPane(JViewProfile);

		// JInternalFrame[] frames = contentPane.desktop.getAllFrames();
		// JInternalFrame f = frames[0];
		BasicInternalFrameUI ui = (BasicInternalFrameUI) internalFrame.getUI();

		Component north = ui.getNorthPane();
		MouseMotionListener[] actions = north.getListeners(MouseMotionListener.class);

		for (int i = 0; i < actions.length; i++)
			north.removeMouseMotionListener(actions[i]);

		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnFeedback.setBackground(Color.WHITE);
		btnFeedback.setForeground(new Color(0, 0, 139));
		btnFeedback.setBounds(51, 438, 226, 45);
		panel.add(btnFeedback);
		btnFeedback.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(feedback);
				} catch (Exception e) {

				}
			}
		});

		JButton btnOfferARide = new JButton("Offer A Ride");
		btnOfferARide.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnOfferARide.setForeground(new Color(0, 0, 139));
		btnOfferARide.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnOfferARide.setBackground(Color.WHITE);
		btnOfferARide.setBounds(51, 365, 226, 45);
		panel.add(btnOfferARide);
		btnOfferARide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(offerARide);
				} catch (Exception e) {

				}
			}
		});

		JButton btnJoinARide = new JButton("Join A Ride");
		btnJoinARide.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnJoinARide.setForeground(new Color(0, 0, 139));
		btnJoinARide.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnJoinARide.setBackground(Color.WHITE);
		btnJoinARide.setBounds(51, 292, 226, 45);
		panel.add(btnJoinARide);
		btnJoinARide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					JScrollPane JJoinARide = new JScrollPane(joinARide,
							ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
							ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
					internalFrame.setContentPane(JJoinARide);
				} catch (Exception e) {

				}
			}
		});

		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewProfile.setForeground(new Color(0, 0, 139));
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnViewProfile.setBackground(Color.WHITE);
		btnViewProfile.setBounds(51, 219, 226, 45);
		panel.add(btnViewProfile);
		btnViewProfile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(viewProfile);
				} catch (Exception e) {

				}
			}
		});

		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnDashboard.setForeground(new Color(0, 0, 139));
		btnDashboard.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnDashboard.setBackground(Color.WHITE);
		btnDashboard.setBounds(51, 146, 226, 45);
		panel.add(btnDashboard);
		btnDashboard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(dashboard);
				} catch (Exception e) {

				}
			}
		});

		JButton btnYourRide = new JButton("Your Ride");
		btnYourRide.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnYourRide.setForeground(new Color(0, 0, 139));
		btnYourRide.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnYourRide.setBackground(Color.WHITE);
		btnYourRide.setBounds(51, 73, 226, 45);
		panel.add(btnYourRide);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-118, 930, 1000, 40);
		panel.add(panel_2);
		panel_2.setForeground(Color.BLACK);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);

		JLabel label_1 = new JLabel("All Rights Reserved 2019 \u00A9 ");
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(0, 540, 336, 30);
		panel.add(label_1);
		btnYourRide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					internalFrame.setContentPane(yourRide);
				} catch (Exception e) {

				}
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(30, 144, 255));
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 0, 1368, 78);
		contentPane.add(panel_1);

		JLabel label = new JLabel("Namma Ride");
		label.setVerticalTextPosition(SwingConstants.TOP);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIconTextGap(8);
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(new Color(30, 144, 255));
		label.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 60));
		label.setBorder(new LineBorder(new Color(30, 144, 255), 0));
		label.setBackground(SystemColor.menu);
		label.setBounds(500, 0, 318, 78);
		panel_1.add(label);

	}
}
