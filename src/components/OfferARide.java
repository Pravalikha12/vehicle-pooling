package components;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JSpinner.DateEditor;
import javax.swing.TransferHandler.TransferSupport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerDateModel;
import javax.swing.TransferHandler;

import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class OfferARide extends JPanel {
	private JTextField offerDest;
	private JTextField offerSource;
	private JTextField txtCar;
	public JFrame frame2;
	private JFrame frame;
	private String date;
	private JTable table;
	public int tid;
	private JDateChooser dateChooser;
	private JSpinner spinner;
	private JComponent editor;
	public static JTextField status_trip_id;
	private JTextField status_user_id;

	/**
	 * Create the panel.
	 */
	public OfferARide() {
		setLayout(null);

		date = "";

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 910, 510);
		add(panel);
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 0, 910, 510);
		panel.add(panel_3);

		offerDest = new JTextField();
		offerDest.setText("Destination");
		offerDest.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		offerDest.setColumns(10);
		offerDest.setBounds(145, 42, 251, 40);
		panel_3.add(offerDest);

		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblTo.setBounds(38, 44, 70, 28);
		panel_3.add(lblTo);

		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblFrom.setBounds(38, 118, 70, 20);
		panel_3.add(lblFrom);

		offerSource = new JTextField();
		offerSource.setText("Source");
		offerSource.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		offerSource.setColumns(10);
		offerSource.setBounds(145, 111, 251, 40);
		panel_3.add(offerSource);

		// vehicle = new JTextField();
		// vehicle.setText("Car");
		// vehicle.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		// vehicle.setColumns(10);
		// vehicle.setBounds(145, 186, 251, 40);
		// panel_3.add(vehicle);

		JLabel lblVehicle = new JLabel("Vehicle");
		lblVehicle.setForeground(Color.WHITE);
		lblVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblVehicle.setBounds(38, 193, 70, 20);
		panel_3.add(lblVehicle);

		JButton btnOffer = new JButton("Offer");
		btnOffer.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnOffer.setBounds(397, 242, 120, 35);
		panel_3.add(btnOffer);
		DateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
		//

		JButton btnViewRequests = new JButton("View Requests");
		btnViewRequests.setBounds(478, 57, 269, 45);
		panel_3.add(btnViewRequests);
		btnViewRequests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					showTableData();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		btnOffer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					tid = (int) (System.currentTimeMillis() & 0xfffffff);

					int capacity = 0;
					int temp = 0;
					date = fmt.format(dateChooser.getDate());
					String time = ((DateEditor) editor).getFormat().format(spinner.getValue()).toString();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForVid = "Select Vehicle_id from vehicle_lic where V_user_id = '" + Login.userid.getText()
							+ "'";
					ResultSet rsForVid = stmt.executeQuery(sqlForVid);
					while (rsForVid.next()) {
						temp = rsForVid.getInt("Vehicle_id");
					}

					String sqlForSeats = "Select Capacity from vehicle_desc where Vehicle_id = '" + temp + "'";
					ResultSet rsForSeats = stmt.executeQuery(sqlForSeats);
					while (rsForSeats.next()) {
						capacity = rsForSeats.getInt("Capacity");
					}
					capacity -= 1;
					String sql = "Insert into trip(Trip_id,T_date,T_time,Source,Destination,Avail_seats)" + "values("
							+ (tid) + ",'" + date + "','" + time + "','" + offerSource.getText() + "','"
							+ offerDest.getText() + "'," + capacity + ")";
					int rs = stmt.executeUpdate(sql);
					if (rs > 0)
						JOptionPane.showMessageDialog(null, "Ride offered! Your trip id is " + tid);
					else
						JOptionPane.showMessageDialog(null, "Failed to offer a ride");

					String sqlForRidesIn = "Insert into rides_in(R_user_id,R_trip_id,Status,R_seats) values("
							+ Login.userid.getText() + "," + tid + "," + 0 + "," + (capacity) + ")";
					int rsForRidesIn = stmt.executeUpdate(sqlForRidesIn);
					if (rsForRidesIn > 0) {
						System.out.println("Done");
					}
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(478, 307, 363, 181);
		panel_3.add(panel_2);
		panel_2.setLayout(null);

		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnViewProfile.setBounds(4, 100, 115, 29);
		panel_2.add(btnViewProfile);

		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAccept.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAccept.setBounds(123, 100, 115, 29);
		panel_2.add(btnAccept);

		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnReject.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReject.setBounds(242, 100, 115, 29);
		panel_2.add(btnReject);

		JLabel lblNewLabel = new JLabel("Carol M Thars has requested a ride");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 16, 264, 44);
		panel_2.add(lblNewLabel);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(621, 54, 251, 63);
		panel_3.add(dateChooser);

		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);

		spinner = new JSpinner();
		spinner.setModel(model);
		editor = new JSpinner.DateEditor(spinner, "HH:mm");
		spinner.setEditor(editor);
		spinner.setBounds(621, 152, 251, 63);
		panel_3.add(spinner);

		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblDate.setBounds(509, 76, 48, 20);
		panel_3.add(lblDate);

		status_trip_id = new JTextField();
		status_trip_id.setBounds(478, 150, 118, 20);
		panel_3.add(status_trip_id);
		status_trip_id.setColumns(10);

		JLabel lblAcceptTripId = new JLabel("Trip Id");
		lblAcceptTripId.setBackground(Color.YELLOW);
		lblAcceptTripId.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcceptTripId.setForeground(Color.WHITE);
		lblAcceptTripId.setBounds(478, 129, 118, 14);
		panel_3.add(lblAcceptTripId);

		JButton btnAcceptRequest = new JButton("Accept Request");
		btnAcceptRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String status_name = "";
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForName = "Select Fname,Lname,Mname from user where User_id = "
							+ status_user_id.getText();
					ResultSet rsForName = stmt.executeQuery(sqlForName);
					while (rsForName.next()) {
						status_name = rsForName.getString("Fname") + " " + rsForName.getString("Mname") + " "
								+ rsForName.getString("Lname");
					}
					String sqlForAccept = "Update rides_in set Status=2 where R_trip_id=" + status_trip_id.getText()
							+ " and R_user_id=" + status_user_id.getText();
					int rsForAccept = stmt.executeUpdate(sqlForAccept);
					if (rsForAccept > 0) {
						JOptionPane.showMessageDialog(null, "Ride Accepted for user " + status_name);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		btnAcceptRequest.setBounds(606, 125, 141, 45);
		panel_3.add(btnAcceptRequest);

		JButton btnRejectRequest = new JButton("Reject Request");
		btnRejectRequest.setBounds(606, 181, 141, 45);
		panel_3.add(btnRejectRequest);

		btnRejectRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String status_name = "";
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForName = "Select Fname,Lname,Mname from user where User_id = "
							+ status_user_id.getText();
					ResultSet rsForName = stmt.executeQuery(sqlForName);
					while (rsForName.next()) {
						status_name = rsForName.getString("Fname") + " " + rsForName.getString("Mname") + " "
								+ rsForName.getString("Lname");
					}
					String sqlForReject = "Update rides_in set Status=3 where R_trip_id=" + status_trip_id.getText()
							+ " and R_user_id=" + status_user_id.getText();
					int rsForReject = stmt.executeUpdate(sqlForReject);
					if (rsForReject > 0) {
						JOptionPane.showMessageDialog(null, "Ride Rejected for user " + status_name);
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		JButton btnBeginTheRide = new JButton("Begin The Ride");
		btnBeginTheRide.setBounds(40, 379, 115, 38);
		panel_3.add(btnBeginTheRide);
		btnBeginTheRide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForStatus = "Update rides_in set Status=4 where R_trip_id=" + status_trip_id.getText();
					int rsForStatus = stmt.executeUpdate(sqlForStatus);
					if (rsForStatus > 0) {
						JOptionPane.showMessageDialog(null, "Ride is ongoing with trip_id=" + status_trip_id.getText());
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		JButton btnEndTheRide = new JButton("End The Ride");
		btnEndTheRide.setBounds(202, 379, 115, 38);
		panel_3.add(btnEndTheRide);

		btnEndTheRide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForStatus = "Update rides_in set Status=5 where R_trip_id=" + status_trip_id.getText();
					int rsForStatus = stmt.executeUpdate(sqlForStatus);
					if (rsForStatus > 0) {
						JOptionPane.showMessageDialog(null,
								"Ride with trip_id=" + status_trip_id.getText() + " has ended.");
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		status_user_id = new JTextField();
		status_user_id.setColumns(10);
		status_user_id.setBounds(478, 206, 118, 20);
		panel_3.add(status_user_id);

		JLabel lblUserId = new JLabel("User Id");
		lblUserId.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBackground(Color.YELLOW);
		lblUserId.setBounds(478, 185, 118, 14);
		panel_3.add(lblUserId);

	}

	public void showTableData() {
		String columnNames[] = { "User Id", "Trip Id", "Status", "Remaining seats" };
		frame = new JFrame("All Requests");
		frame.getContentPane().setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		int statusUserId = 0;
		int statusTripId = 0;
		int statusStatus = 0;
		int statusRSeats = 0;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		formatter = formatter.withLocale(Locale.ENGLISH);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String c_date = formatter.format(now);
		String c_time = dtf.format(now);
		String dateTime = c_date + "-" + c_time;
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("uuuu-MM-dd-HH:mm:ss");
		formatter2 = formatter2.withLocale(Locale.ENGLISH);
		LocalDateTime date1 = LocalDateTime.parse(dateTime, formatter2);
		LocalDateTime date2 = LocalDateTime.now();

		try {
			String t_time_date = " ";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			String sql = "select * from rides_in where R_user_id<>" + Login.userid.getText();
			String sql1 = "select * from trip where Trip_id = " + status_trip_id.getText();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ResultSet rs1 = ps1.executeQuery();
			int i = 0;
			while (rs1.next()) {
				String t_time = rs1.getString("T_time");
				String t_date = rs1.getString("T_date");
				t_time_date = t_date + "-" + t_time;
				date2 = LocalDateTime.parse(t_time_date, formatter2);
			}
			while (rs.next() && date2.isAfter(date1)) {
				statusUserId = rs.getInt("R_user_id");
				statusTripId = rs.getInt("R_trip_id");
				statusStatus = rs.getInt("Status");
				statusRSeats = rs.getInt("R_seats");
				if (statusTripId == Integer.parseInt(status_trip_id.getText()) && statusStatus == 1)
					model.addRow(new Object[] { statusUserId, statusTripId, "Requested", statusRSeats });
				i++;
			}
			if (i < 1) {
				JOptionPane.showMessageDialog(null, "No Requests Recieved", "Error", JOptionPane.ERROR_MESSAGE);
			}
			if (i == 1) {
				System.out.println(i + " Record Found");
			} else {
				System.out.println(i + " Records Found");
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		frame.getContentPane().add(scroll);
		frame.setVisible(true);
		frame.setSize(800, 400);
	}
}
