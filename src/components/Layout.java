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
		setBounds(100, 100, 1035, 683);

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
		panel.setBackground(Color.RED);
		panel.setBounds(0, 78, 336, 900);
		contentPane.add(panel);
		panel.setLayout(null);

		JInternalFrame internalFrame = new JInternalFrame("Vehicle Pooling for BMSCE");
		internalFrame.setBackground(Color.YELLOW);
		internalFrame.setBounds(327, 110, 910, 510);
		contentPane.add(internalFrame);
		internalFrame.setVisible(true);
		internalFrame.setResizable(false);
		contentPane.add(internalFrame);
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
		btnFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnFeedback.setBackground(Color.WHITE);
		btnFeedback.setForeground(SystemColor.infoText);
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
		btnOfferARide.setForeground(Color.BLACK);
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
		btnJoinARide.setForeground(Color.BLACK);
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
		btnViewProfile.setForeground(Color.BLACK);
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
		btnDashboard.setForeground(Color.BLACK);
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
		btnYourRide.setForeground(Color.BLACK);
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
		label_1.setForeground(Color.BLACK);
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
		panel_1.setForeground(Color.RED);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 2000, 78);
		contentPane.add(panel_1);

		JLabel label = new JLabel("Namma Ride");
		label.setVerticalTextPosition(SwingConstants.TOP);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIconTextGap(8);
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.RED);
		label.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 60));
		label.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		label.setBackground(SystemColor.menu);
		label.setBounds(0, 0, 424, 78);
		panel_1.add(label);

	}
}
