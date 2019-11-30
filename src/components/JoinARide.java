package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JoinARide extends JPanel {
	private JTextField JoinDest;
	private JTextField JoinSource;

	/**
	 * Create the panel.
	 */
	public JoinARide() {
		setBackground(Color.RED);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(59, 16, 704, 525);
		add(panel_1);
		
		JoinDest = new JTextField();
		JoinDest.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		JoinDest.setColumns(10);
		JoinDest.setBounds(222, 75, 417, 81);
		panel_1.add(JoinDest);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTo.setBounds(396, 31, 39, 28);
		panel_1.add(lblTo);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblFrom.setBounds(396, 188, 61, 28);
		panel_1.add(lblFrom);
		
		JoinSource = new JTextField();
		JoinSource.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		JoinSource.setColumns(10);
		JoinSource.setBounds(222, 242, 417, 81);
		panel_1.add(JoinSource);
		
		JButton btnViewAvailableRides = new JButton("View Available Rides");
		btnViewAvailableRides.setBounds(222, 364, 417, 39);
		panel_1.add(btnViewAvailableRides);
		btnViewAvailableRides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					String sql = "Select Source,Destination,Avail_seats from trip where ";
					ResultSet rs = stmt.executeQuery(sql);
					if (rs.next())
						JOptionPane.showMessageDialog(null, "Login successful!");
					else
						JOptionPane.showMessageDialog(null, "Incorrext Username or Password!");
					
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}

		});

	}
}
