package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JButton;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToNamma;
	private JTable table;
	private JFrame frame1;
	private JFrame frame2;
	private JFrame frame3;
	private JTextField feedback_user_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150,1328, 831);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 128), new Color(128, 0, 128), new Color(128, 0, 128)));
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 1328, 831);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("View Users");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					showUserData();
			}
				
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton.setBounds(632, 161, 250, 50);
		panel.add(btnNewButton);
		
		JButton btnViewRides = new JButton("View Rides");
		btnViewRides.setForeground(new Color(0, 0, 128));
		btnViewRides.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewRides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showRidesData();
			}
		});
		btnViewRides.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnViewRides.setBounds(632, 236, 250, 50);
		panel.add(btnViewRides);
		
		JButton btnDeleteUsers = new JButton("Delete Users");
		btnDeleteUsers.setForeground(new Color(0, 0, 128));
		btnDeleteUsers.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnDeleteUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sql = "Delete from user where User_id=" + feedback_user_id.getText();
					int rs = stmt.executeUpdate(sql);
					if (rs > 0) {
						JOptionPane.showMessageDialog(null,"User with id "+feedback_user_id.getText()+" has been removed from the records");
					}
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		btnDeleteUsers.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnDeleteUsers.setBounds(980, 161, 250, 50);
		panel.add(btnDeleteUsers);
		
		JButton btnViewFeedback = new JButton("View Feedbacks");
		btnViewFeedback.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnViewFeedback.setForeground(new Color(0, 0, 128));
		btnViewFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				showFeedback();
			}
		});
		btnViewFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnViewFeedback.setBounds(632, 311, 250, 50);
		panel.add(btnViewFeedback);
		
		JLabel lblAdmin = new JLabel("");
		lblAdmin.setIcon(new ImageIcon("C:\\Users\\Prateeka\\Desktop\\vehicle-pooling\\image\\adminImg.png"));
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.setBounds(77, 124, 393, 308);
		panel.add(lblAdmin);
		
		txtWelcomeToNamma = new JTextField();
		txtWelcomeToNamma.setForeground(Color.WHITE);
		txtWelcomeToNamma.setBackground(new Color(0, 0, 128));
		txtWelcomeToNamma.setEditable(false);
		txtWelcomeToNamma.setFont(new Font("Baskerville Old Face", Font.BOLD, 36));
		txtWelcomeToNamma.setText("Welcome to Namma Ride");
		txtWelcomeToNamma.setBounds(493, 42, 428, 50);
		panel.add(txtWelcomeToNamma);
		txtWelcomeToNamma.setColumns(10);
		
		feedback_user_id = new JTextField();
		feedback_user_id.setBounds(1009, 311, 176, 40);
		panel.add(feedback_user_id);
		feedback_user_id.setColumns(10);
		
		JLabel lblEnterTheUser = new JLabel("Enter the User Id");
		lblEnterTheUser.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblEnterTheUser.setForeground(new Color(0, 0, 128));
		lblEnterTheUser.setBackground(new Color(0, 0, 128));
		lblEnterTheUser.setBounds(1015, 252, 170, 20);
		panel.add(lblEnterTheUser);
	}
	public void showUserData() {
		String columnNames[] = { "User Id", "Name", "Gender","Email Id","Role" };
		frame1 = new JFrame("Users Table");
		frame1.getContentPane().setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(scroll);
		scroll.setBounds(10,200,400,400);
		
		int UserId = 0;
		String uname = "";
		String ugender = "";
		String uemail = "";
		String urole = "";
		

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			String sql = "select * from user";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			int i = 0;
			while (rs.next()) {
				UserId = rs.getInt("User_id");
				uname = rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
				ugender = rs.getString("Gender");
				uemail = rs.getString("Email_id");
				urole = rs.getString("Role");
				
				model.addRow(new Object[] { UserId, uname, ugender, uemail,urole });
				i++;
			}
			if (i < 1) {
				JOptionPane.showMessageDialog(null, "No Registered users", "Error", JOptionPane.ERROR_MESSAGE);
			}
			if (i == 1) {
				System.out.println(i + " Record Found");
			} else {
				System.out.println(i + " Records Found");
			}
			
			

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		frame1.getContentPane().add(scroll);
		frame1.setBounds(30, 115, 600, 400);
		frame1.setVisible(true);
	}
	
	public void showRidesData() {
		String columnNames[] = { "Trip Id", "Time", "Date", "Source","Destination" };
		frame2 = new JFrame("Rides Table");
		frame2.getContentPane().setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(scroll);
		scroll.setBounds(10,200,400,400);
		
		int tripid=0;
		String ttime="";
		String tdate="";
		String from="";
		String to="";

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			String sql = "select * from trip";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			int i=0;
			while (rs.next()) {
				tripid = rs.getInt("Trip_id");
				ttime = rs.getString("T_time");
				tdate = rs.getString("T_date");
				from = rs.getString("Source");
				to = rs.getString("Destination");
				
				model.addRow(new Object[] { tripid, ttime, tdate, from,to });
				i++;
			}
			if (i < 1) {
				JOptionPane.showMessageDialog(null, "No previous rides", "Error", JOptionPane.ERROR_MESSAGE);
			}
			if (i == 1) {
				System.out.println(i + " Record Found");
			} else {
				System.out.println(i + " Records Found");
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		frame2.getContentPane().add(scroll);
		frame2.setBounds(30, 115, 600, 400);
		frame2.setVisible(true);
	}
	public void showFeedback() {
		String columnNames[] = { "Trip Id", "Rating", "Review", "Suggestion" };
		frame3 = new JFrame("Feedback Table");
		frame3.getContentPane().setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(scroll);
		scroll.setBounds(10,200,400,400);
		
		int TripId = 0;
		int rate=0;
		String review = "";
		String suggest = "";
		
		

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			String sql = "select * from feedback";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			int i = 0;
			while (rs.next()) {
				TripId = rs.getInt("F_trip_id");
				rate = rs.getInt("Rating");
				review = rs.getString("Review");
				suggest = rs.getString("Suggestion");
				
				model.addRow(new Object[] { TripId, rate, review, suggest });
				i++;
			}
			if (i < 1) {
				JOptionPane.showMessageDialog(null, "No feedback available", "Error", JOptionPane.ERROR_MESSAGE);
			}
			if (i == 1) {
				System.out.println(i + " Record Found");
			} else {
				System.out.println(i + " Records Found");
			}
			

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		frame3.getContentPane().add(scroll);
		frame3.setBounds(30, 115, 600, 400);
		frame3.setVisible(true);
	}
}
