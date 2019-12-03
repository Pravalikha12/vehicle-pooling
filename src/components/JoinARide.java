package components;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class JoinARide extends JPanel {
	private JTextField JoinDest;
	private JTextField JoinSource;
	private JFrame frame;
	private JFrame frame20;
	private static JTable table;
	private String[] columnNames = {"Trip_id","Trip_time","Trip_date", "Source", "Destination", "Available_seats"};
	LocalDate today = LocalDate.now();
	public static JTextField requestTripId;
	private JTextField searchUserId;
	/**
	 * Create the panel.
	 */
	public JoinARide() {
		setForeground(Color.WHITE);
		setBackground(new Color(30, 144, 255));
		setLayout(null);
		
		JoinDest = new JTextField();
		JoinDest.setForeground(Color.BLACK);
		JoinDest.setBounds(124, 80, 291, 39);
		add(JoinDest);
		JoinDest.setBackground(Color.WHITE);
		JoinDest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JoinDest.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(25, 84, 39, 28);
		add(lblTo);
		lblTo.setForeground(new Color(0, 0, 128));
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(25, 161, 61, 28);
		add(lblFrom);
		lblFrom.setForeground(new Color(0, 0, 128));
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JoinSource = new JTextField();
		JoinSource.setForeground(Color.BLACK);
		JoinSource.setBounds(124, 157, 291, 39);
		add(JoinSource);
		JoinSource.setBackground(Color.WHITE);
		JoinSource.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JoinSource.setColumns(10);
		
		JButton btnViewAvailableRides = new JButton("View Available Rides");
		btnViewAvailableRides.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewAvailableRides.setForeground(new Color(0, 0, 128));
		btnViewAvailableRides.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnViewAvailableRides.setBounds(36, 234, 417, 39);
		add(btnViewAvailableRides);
		btnViewAvailableRides.setBackground(Color.WHITE);
		
		JLabel lblEnterTheTrip = new JLabel("Enter the trip Id ");
		lblEnterTheTrip.setBounds(497, 80, 193, 39);
		add(lblEnterTheTrip);
		lblEnterTheTrip.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEnterTheTrip.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheTrip.setForeground(new Color(0, 0, 128));
		
		requestTripId = new JTextField();
		requestTripId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		requestTripId.setForeground(Color.BLACK);
		requestTripId.setBounds(705, 79, 190, 44);
		add(requestTripId);
		requestTripId.setBackground(Color.WHITE);
		requestTripId.setColumns(10);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnRequest.setForeground(new Color(0, 0, 128));
		btnRequest.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnRequest.setBounds(505, 154, 143, 44);
		add(btnRequest);
		btnRequest.setBackground(Color.WHITE);
		
		JButton btnCheckStatus = new JButton("Check Status");
		btnCheckStatus.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnCheckStatus.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnCheckStatus.setForeground(new Color(0, 0, 128));
		btnCheckStatus.setBounds(602, 234, 164, 39);
		add(btnCheckStatus);
		btnCheckStatus.setBackground(Color.WHITE);
		
		JButton btnCancelRide = new JButton("Cancel Ride");
		btnCancelRide.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnCancelRide.setForeground(new Color(0, 0, 128));
		btnCancelRide.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnCancelRide.setBounds(746, 155, 149, 43);
		add(btnCancelRide);
		btnCancelRide.setBackground(Color.WHITE);
		
		searchUserId = new JTextField();
		searchUserId.setForeground(Color.BLACK);
		searchUserId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		searchUserId.setColumns(10);
		searchUserId.setBounds(36, 364, 193, 40);
		add(searchUserId);
		
		JButton btnViewUserProfile = new JButton("View User Profile");
		btnViewUserProfile.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewUserProfile.setForeground(new Color(0, 0, 128));
		btnViewUserProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnViewUserProfile.setBounds(283, 364, 170, 40);
		add(btnViewUserProfile);
		
		btnViewUserProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					showTableUsers();
				} catch(Exception e){
					
				}
			}});
		
		JLabel lblToViewProfile = new JLabel("To view profile of the \r\nrequested users enter their userid"
				+ "");
		lblToViewProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblToViewProfile.setForeground(new Color(0, 0, 128));
		lblToViewProfile.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblToViewProfile.setBackground(Color.WHITE);
		lblToViewProfile.setBounds(15, 304, 522, 55);
		add(lblToViewProfile);
		
		
		
		btnCancelRide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int capacity=0;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					String sqlForSeats = "Select * from rides_in where R_trip_id="+requestTripId.getText()+" and R_user_id="+Login.userid.getText();
					ResultSet rsForSeats = stmt.executeQuery(sqlForSeats);
					while(rsForSeats.next()){
						capacity = rsForSeats.getInt("R_seats");
						capacity++;
					}
					String sqlForCancel = "Update rides_in set Status = 3 where R_trip_id="+requestTripId.getText()+" and R_user_id="+Login.userid.getText();
					int rsForCancel = stmt.executeUpdate(sqlForCancel);
					if(rsForCancel>0){
						JOptionPane.showMessageDialog(null, "Ride Cancelled.");
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		});
		
		
		btnCheckStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String status_name="";
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					
					String sqlForStatus = "Select Status from rides_in where R_trip_id="+requestTripId.getText()+" and R_user_id = "+Login.userid.getText();
					ResultSet rsForStatus = stmt.executeQuery(sqlForStatus);
					while(rsForStatus.next()){
						int status = rsForStatus.getInt("Status");
						if(status==2){
							JOptionPane.showMessageDialog(null, "Ride Accepted with Trip Id "+requestTripId.getText());
						} 
						else if(status==1){
							JOptionPane.showMessageDialog(null, "Ride is not accepted yet. Please wait or reject this ride and select another one");
						}
						else if(status==3){
							JOptionPane.showMessageDialog(null, "Your ride has been rejected. Please find another ride.");

						}
					}
				} catch(Exception e){
					System.out.println(e);
				}
			}});
		
		
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int capacity=0;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					String sqlForSeats = "Select R_seats from rides_in where R_trip_id="+requestTripId.getText();
					ResultSet rsForSeats = stmt.executeQuery(sqlForSeats);
					while(rsForSeats.next()){
						capacity = rsForSeats.getInt("R_seats");
						System.out.println(capacity);
					}
					String sqlForRequest = "Insert into rides_in(R_user_id,R_trip_id,Status,R_seats) values("+Login.userid.getText()+","+requestTripId.getText()
					+","+1+","+capacity+")";
					int rsForRequest = stmt.executeUpdate(sqlForRequest);
					if(rsForRequest>0){
						JOptionPane.showMessageDialog(null, "Ride requested. Click the check status button to know if accepted.");
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		});
		btnViewAvailableRides.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					showTableData();

				} catch (Exception e) {
					System.out.println(e);
				}
			}

		});

}
	
	public void showTableData(){
		frame = new JFrame("All Available Rides");
		frame.getContentPane().setLayout(new BorderLayout()); 
		//TableModel tm = new TableModel();
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
		//table = new JTable(model);
		table = new JTable();
		table.setModel(model); 
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); 
		int trip_id = 0;
		String t_time = "";
		String t_date;
		String source = "";
		String destination = "";
		String se = JoinSource.getText();
		String dest = JoinDest.getText();
		int avail_seats = 0;
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
			String sql = "select * from trip where Source = '"+se+"' and Destination = '"+dest+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()){
				t_time = rs.getString("T_time");
				t_date = rs.getString("T_date");
				source = rs.getString("Source");
				destination = rs.getString("Destination"); 
				trip_id = rs.getInt("Trip_id");
				avail_seats = rs.getInt("Avail_seats");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
				formatter = formatter.withLocale(Locale.ENGLISH); 
				LocalDate date = LocalDate.parse(t_date, formatter);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				String c_date = formatter.format(now);
				String c_time = dtf.format(now);
				String trip_time = t_date+"-"+t_time;
				String curr_time = c_date+"-"+c_time;
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("uuuu-MM-dd-HH:mm:ss");
				formatter2 = formatter2.withLocale(Locale.ENGLISH);				

				LocalDateTime date1 = LocalDateTime.parse(trip_time, formatter2);
				LocalDateTime date2 = LocalDateTime.parse(curr_time, formatter2);
				
				if(date1.isAfter(date2)&&avail_seats>0)
					model.addRow(new Object[]{trip_id,t_time,t_date,source,destination,avail_seats});
				i++; 
			}
			if(i <1){
				JOptionPane.showMessageDialog(null, "No Available Rides, please try again after sometime","Error",
				JOptionPane.ERROR_MESSAGE);
			}
			if(i ==1){
				System.out.println(i+" Record Found");
			}
			else
			{
				System.out.println(i+" Records Found");
			}
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			JOptionPane.ERROR_MESSAGE);
		}
		frame.getContentPane().add(scroll);
		frame.setVisible(true);
		frame.setSize(800,400);
	}
	
	
	public void showTableUsers() {
		String columnNames[] = { "User Id", "Fname", "Mname","Lname", "Gender","Role" };
		frame = new JFrame("User ");
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
				role =  rs.getString("Role");
				model.addRow(new Object[] { userid, fname, mname, lname, gender, role });
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
		frame.getContentPane().add(scroll);
		frame.setVisible(true);
		frame.setSize(800, 400);
	}
}