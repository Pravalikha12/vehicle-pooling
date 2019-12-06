package components;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Dashboard extends JPanel {
	private JButton btnPastRides;
	// private ResultSet rs1;
	private JTable table;
	private JTextField txtHistory;

	/**
	 * Create the panel.
	 */
	public Dashboard() {
		setForeground(Color.WHITE);
		setBackground(new Color(30, 144, 255));
		setLayout(null);
		
				btnPastRides = new JButton("View Your Past Rides");
				btnPastRides.setBorder(new LineBorder(new Color(0, 0, 128), 4));
				btnPastRides.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				btnPastRides.setForeground(new Color(0, 0, 128));
				btnPastRides.setBounds(331, 72, 357, 57);
				add(btnPastRides);
				btnPastRides.setBackground(Color.WHITE);
				
				txtHistory = new JTextField();
				txtHistory.setForeground(Color.WHITE);
				txtHistory.setBounds(0, 0, 993, 39);
				add(txtHistory);
				txtHistory.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				txtHistory.setHorizontalAlignment(SwingConstants.CENTER);
				txtHistory.setBackground(new Color(0, 0, 128));
				txtHistory.setText("History");
				txtHistory.setColumns(10);

		btnPastRides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					showTableData();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

	}

	public void showTableData() {
		String columnNames[] = { "Trip Id", "Scheduled time", "Scheduled date", "Source", "Destination",
				"Co passengers" };
		// frame = new JFrame("All Requests");
		// frame.getContentPane().setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		// table.setRowHeight(70);
		int statusTripId = 0;
		String t_time = "";
		String t_date = "";
		String source = "";
		String dest = "";
		String otherUsers = "";
		scroll.setBounds(20, 200, 900, 100);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			Statement stmt1 = con.createStatement();
			String sql1 = "Select * from rides_in where R_user_id = " + Login.userid.getText() + " and (Status='Ended' or Status='EndedByRider')";
			ResultSet rs1 = stmt1.executeQuery(sql1);
			while (rs1.next()) {
				Statement stmt2 = con.createStatement();
				String sql3 = "Select R_user_id from rides_in where R_trip_id = " + rs1.getInt("R_trip_id");
				ResultSet rs3 = stmt2.executeQuery(sql3);
				while (rs3.next()) {
					Statement stmt3 = con.createStatement();
					String sql4 = "Select Fname,Mname,Lname from user where User_id = " + rs3.getInt("R_user_id");
					ResultSet rs4 = stmt3.executeQuery(sql4);

					while (rs4.next()) {
						otherUsers = otherUsers + " , " + rs4.getString("Fname") + " " + rs4.getString("Mname") + " "
								+ rs4.getString("Lname");
					}
				}
				String sql2 = "select * from trip where Trip_id=" + rs1.getInt("R_trip_id");

				PreparedStatement ps = con.prepareStatement(sql2);
				ResultSet rs = ps.executeQuery();
				int i = 0;
				while (rs.next()) {
					statusTripId = rs.getInt("Trip_id");
					t_time = rs.getString("T_time");
					t_date = rs.getString("T_date");
					source = rs.getString("Source");
					dest = rs.getString("Destination");
					model.addRow(new Object[] { statusTripId, t_time, t_date, source, dest, otherUsers });
					i++;
				}
				if (i < 1) {
					JOptionPane.showMessageDialog(null, "No other user in the ride", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				if (i == 1) {
					System.out.println(i + " Record Found");
				} else {
					System.out.println(i + " Records Found");
				}

			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		this.add(scroll);
		setVisible(true);
		// setSize(200,100);
	}
}
