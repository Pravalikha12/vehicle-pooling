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
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class OfferARide extends JPanel {
	private JTextField offerDest;
	private JTextField offerSource;
	private JTextField txtCar;
	public JFrame frame2;
	private JFrame frame;
	private JFrame frame9;
	private String date;
	private JTable table;
	public int tid;
	private JDateChooser dateChooser;
	private JSpinner spinner;
	private JComponent editor;
	public static JTextField status_user_id;
	public static JTextField status_trip_id;
	private JTextField txtTo;
	private JTextField txtFrom;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTripId;
	private JTextField txtUserId;
	private JTextField searchUserId;

	/**
	 * Create the panel.
	 */
	public OfferARide() {

		setForeground(Color.WHITE);
		setBackground(new Color(30, 144, 255));

		date = "";
		DateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);
		setLayout(null);

		offerDest = new JTextField();
		offerDest.setForeground(Color.BLACK);
		offerDest.setBounds(194, 84, 251, 45);
		add(offerDest);
		offerDest.setBackground(Color.WHITE);
		offerDest.setFont(new Font("Tahoma", Font.PLAIN, 18));
		offerDest.setColumns(10);

		offerSource = new JTextField();
		offerSource.setForeground(Color.BLACK);
		offerSource.setBounds(194, 158, 251, 45);
		add(offerSource);
		offerSource.setBackground(Color.WHITE);
		offerSource.setFont(new Font("Tahoma", Font.PLAIN, 18));
		offerSource.setColumns(10);

		JButton btnOffer = new JButton("Offer");
		btnOffer.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnOffer.setForeground(new Color(0, 0, 128));
		btnOffer.setBounds(43, 370, 402, 52);
		add(btnOffer);
		btnOffer.setBackground(Color.WHITE);
		btnOffer.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		//

		JButton btnViewRequests = new JButton("View Requests");
		btnViewRequests.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnViewRequests.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewRequests.setBounds(529, 214, 366, 45);
		add(btnViewRequests);
		btnViewRequests.setBackground(Color.WHITE);
		btnViewRequests.setForeground(new Color(0, 0, 128));

		dateChooser = new JDateChooser();
		dateChooser.setForeground(Color.BLACK);
		dateChooser.setBounds(194, 223, 251, 45);
		add(dateChooser);
		dateChooser.setBackground(Color.WHITE);

		spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner.setForeground(Color.BLACK);
		spinner.setBounds(194, 297, 251, 45);
		add(spinner);
		spinner.setBackground(Color.WHITE);
		spinner.setModel(model);
		editor = new JSpinner.DateEditor(spinner, "HH:mm");
		spinner.setEditor(editor);

		status_user_id = new JTextField();
		status_user_id.setForeground(Color.BLACK);
		status_user_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		status_user_id.setBounds(694, 158, 201, 41);
		add(status_user_id);
		status_user_id.setBackground(Color.WHITE);
		status_user_id.setColumns(10);

		JButton btnAcceptRequest = new JButton("Accept Request");
		btnAcceptRequest.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnAcceptRequest.setForeground(new Color(0, 0, 128));
		btnAcceptRequest.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnAcceptRequest.setBounds(724, 281, 171, 45);
		add(btnAcceptRequest);
		btnAcceptRequest.setBackground(Color.WHITE);

		JButton btnRejectRequest = new JButton("Reject Request");
		btnRejectRequest.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnRejectRequest.setForeground(new Color(0, 0, 128));
		btnRejectRequest.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnRejectRequest.setBounds(529, 281, 180, 45);
		add(btnRejectRequest);
		btnRejectRequest.setBackground(Color.WHITE);

		JButton btnBeginTheRide = new JButton("Begin The Ride");
		btnBeginTheRide.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnBeginTheRide.setForeground(new Color(0, 0, 128));
		btnBeginTheRide.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBeginTheRide.setBounds(528, 351, 181, 43);
		add(btnBeginTheRide);
		btnBeginTheRide.setBackground(Color.WHITE);

		JButton btnEndTheRide = new JButton("End The Ride");
		btnEndTheRide.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnEndTheRide.setForeground(new Color(0, 0, 128));
		btnEndTheRide.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnEndTheRide.setBounds(724, 352, 171, 40);
		add(btnEndTheRide);
		btnEndTheRide.setBackground(Color.WHITE);

		status_trip_id = new JTextField();
		status_trip_id.setForeground(Color.BLACK);
		status_trip_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		status_trip_id.setBounds(694, 84, 201, 40);
		add(status_trip_id);
		status_trip_id.setBackground(Color.WHITE);
		status_trip_id.setColumns(10);

		txtTo = new JTextField();
		txtTo.setForeground(new Color(0, 0, 128));
		txtTo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setEditable(false);
		txtTo.setText("To");
		txtTo.setBounds(48, 89, 86, 40);
		add(txtTo);
		txtTo.setColumns(10);

		txtFrom = new JTextField();
		txtFrom.setForeground(new Color(0, 0, 128));
		txtFrom.setText("From");
		txtFrom.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtFrom.setEditable(false);
		txtFrom.setColumns(10);
		txtFrom.setBounds(48, 172, 86, 40);
		add(txtFrom);

		txtDate = new JTextField();
		txtDate.setForeground(new Color(0, 0, 128));
		txtDate.setText("Date");
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtDate.setEditable(false);
		txtDate.setColumns(10);
		txtDate.setBounds(48, 239, 86, 40);
		add(txtDate);

		txtTime = new JTextField();
		txtTime.setForeground(new Color(0, 0, 128));
		txtTime.setText("Time");
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtTime.setEditable(false);
		txtTime.setColumns(10);
		txtTime.setBounds(48, 309, 86, 40);
		add(txtTime);

		txtTripId = new JTextField();
		txtTripId.setForeground(new Color(0, 0, 128));
		txtTripId.setText("Trip Id");
		txtTripId.setHorizontalAlignment(SwingConstants.CENTER);
		txtTripId.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtTripId.setEditable(false);
		txtTripId.setColumns(10);
		txtTripId.setBounds(529, 86, 131, 40);
		add(txtTripId);

		txtUserId = new JTextField();
		txtUserId.setForeground(new Color(0, 0, 128));
		txtUserId.setText("User Id");
		txtUserId.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserId.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtUserId.setEditable(false);
		txtUserId.setColumns(10);
		txtUserId.setBounds(529, 160, 131, 40);
		add(txtUserId);

		searchUserId = new JTextField();
		searchUserId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		searchUserId.setForeground(Color.BLACK);
		searchUserId.setBounds(529, 444, 180, 40);
		add(searchUserId);
		searchUserId.setColumns(10);

		JButton btnViewUserProfile = new JButton("View Profile");
		btnViewUserProfile.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewUserProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnViewUserProfile.setForeground(new Color(0, 0, 128));
		btnViewUserProfile.setBounds(725, 444, 170, 40);
		add(btnViewUserProfile);

		btnViewUserProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					showTableUsers();
				} catch (Exception e) {

				}
			}
		});

		JLabel lblToViewOther = new JLabel("Enter User Id to view their profile");
		lblToViewOther.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblToViewOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblToViewOther.setBackground(Color.WHITE);
		lblToViewOther.setForeground(new Color(0, 0, 128));
		lblToViewOther.setBounds(43, 434, 402, 55);
		add(lblToViewOther);

		btnEndTheRide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForStatus = "Update rides_in set Status='EndedByRider' where R_trip_id=" + status_trip_id.getText() 
						+" and R_user_id="+Login.userid.getText();
					int rsForStatus = stmt.executeUpdate(sqlForStatus);
					if (rsForStatus > 0) {
						JOptionPane.showMessageDialog(null,
								"Ride with trip_id=" + status_trip_id.getText() + " has ended.");
					}
					String sqlForStatus1 = "Update rides_in set Status='Ended' where R_trip_id=" + status_trip_id.getText() 
					+" and R_user_id<>"+Login.userid.getText();
				int rsForStatus1 = stmt.executeUpdate(sqlForStatus1);
				if(rsForStatus1>0){
					
				}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		btnBeginTheRide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sqlForStatus = "Update rides_in set Status='Started' where R_trip_id=" + status_trip_id.getText();
					int rsForStatus = stmt.executeUpdate(sqlForStatus);
					if (rsForStatus > 0) {
						JOptionPane.showMessageDialog(null, "Ride is ongoing with trip_id=" + status_trip_id.getText());
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

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
					String sqlForReject = "Update rides_in set Status='Rejected' where R_trip_id=" + status_trip_id.getText()
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
					String sqlForAccept = "Update rides_in set Status='Accepted' where R_trip_id=" + status_trip_id.getText()
							+ " and R_user_id=" + status_user_id.getText();
					int rsForAccept = stmt.executeUpdate(sqlForAccept);
					if (rsForAccept > 0) {
						JOptionPane.showMessageDialog(null, "Ride Accepted for user " + status_name);
						String sqlForAvailSeats = "Update rides_in set R_seats=R_seats-1 where R_trip_id=" + status_trip_id.getText();
						int rsForAvailSeats = stmt.executeUpdate(sqlForAvailSeats);
						if(rsForAvailSeats>0){
							
						}
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
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
					if(offerSource.getText().equals("BMSCE")||offerDest.getText().equals("BMSCE")){
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
								+ Login.userid.getText() + "," + tid + ",'Offered'," + (capacity) + ")";
						int rsForRidesIn = stmt.executeUpdate(sqlForRidesIn);
						if (rsForRidesIn > 0) {
							System.out.println("Done");
						}
						con.close();
					}
					else{
						JOptionPane.showMessageDialog(null, "Either one of locations must be 'BMSCE'");
					}
				} 
				catch (Exception e) {
					System.out.println(e);
				}
			}
		});
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
		String statusStatus = "";
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
				statusStatus = rs.getString("Status");
				statusRSeats = rs.getInt("R_seats");
				if (statusTripId == Integer.parseInt(status_trip_id.getText()) && statusStatus.equals("Requested"))
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
		frame.setBounds(400,550,800,100);
	}

	public void showTableUsers() {
		String columnNames[] = { "User Id", "Fname", "Mname", "Lname", "Gender", "Role","Rating" };
		frame9 = new JFrame("User");
		frame9.getContentPane().setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		int userid = 0;
		String fname = "";
		String lname = "";
		String gender = "";
		String role = "";
		String mname = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			String sql = "select * from user where User_id =" + searchUserId.getText();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i = 0;
			while (rs.next()) {
				userid = rs.getInt("User_id");
				fname = rs.getString("Fname");
				lname = rs.getString("Lname");
				gender = rs.getString("Gender");
				mname = rs.getString("Mname");
				role = rs.getString("Role");
				model.addRow(new Object[] { userid, fname, mname, lname, gender, role,ViewProfile.user_rating.getText()});
				i++;
			}
			if (i < 1) {
				JOptionPane.showMessageDialog(null, "No Registered Users Found", "Error", JOptionPane.ERROR_MESSAGE);
			}
			if (i == 1) {
				System.out.println(i + " Record Found");
			} else {
				System.out.println(i + " Records Found");
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		frame9.getContentPane().add(scroll);
		frame9.setVisible(true);
		frame9.setBounds(400,550,800,100);
	}
}
