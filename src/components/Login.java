package components;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;
import java.awt.Window.Type;

public class Login extends JFrame {
	private JTextField name;
	private JPasswordField passwd;
	private JTextField txtAllRightsReserved;
	private JTextField txtAboutUs;
	private JTextField txtImage;
	private JTextField txtPassword;
	private JTextField txtEnterYourUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setType(Type.UTILITY);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		txtAboutUs = new JTextField();
		txtAboutUs.setText("About us");
		txtAboutUs.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setText("Image");
		txtImage.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtAboutUs, Alignment.LEADING)
						.addComponent(txtImage, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtAboutUs, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(txtImage, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel_2 = new JPanel();
		
		txtAllRightsReserved = new JTextField();
		txtAllRightsReserved.setText("All Rights Reserved 2019");
		txtAllRightsReserved.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtAllRightsReserved, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(txtAllRightsReserved, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tabbedPane)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Sign Up", null, panel_4, null);
		
		JLabel label = new JLabel("");
		
		JLabel lblRegistrations = new JLabel("Registration page");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(112)
							.addComponent(label))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(30)
							.addComponent(lblRegistrations)))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(5)
					.addComponent(label)
					.addGap(38)
					.addComponent(lblRegistrations)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Sign In", null, panel_5, null);
		
		JLabel lblUserName = new JLabel("User Name");
		
		JLabel lblPassword = new JLabel("Password");
		
		txtPassword = new JTextField();
		txtPassword.setText("Enter your password");
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		
		txtEnterYourUsername = new JTextField();
		txtEnterYourUsername.setText("Enter your Username");
		txtEnterYourUsername.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_5.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPassword)
							.addContainerGap())
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
								.addComponent(lblUserName, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
								.addGap(102))
							.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
								.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
									.addComponent(txtPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
									.addComponent(txtEnterYourUsername, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
								.addGap(50)))))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(26)
					.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtEnterYourUsername, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		panel_5.setLayout(gl_panel_5);
		
		JLabel lblNammaRide = new JLabel("Namma Ride");
		lblNammaRide.setFont(new Font("Liberation Serif", Font.BOLD | Font.ITALIC, 26));
		lblNammaRide.setForeground(Color.BLACK);
		lblNammaRide.setBackground(Color.RED);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNammaRide, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(229, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNammaRide, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
	}
}