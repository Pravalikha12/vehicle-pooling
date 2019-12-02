package components;

import java.sql.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class ViewProfile extends JPanel {

	/**
	 * Create the panel.
	 */

	private JTextField user_name;
	private JTextField user_email;
	// private JTextField user_phoneno1;
	// private JTextField user_phoneno2;
	private JTextField user_phoneno;
	private JTextField user_gender;
	private JTextField user_dob;
	private JTextField user_id;
	private JTextField user_rating;
	private JTextField user_age;
	private JTextField user_role;

	// private long numbers[] = new long[2];
	public ViewProfile() {
		setForeground(new Color(30, 144, 255));
		setBackground(new Color(30, 144, 255));
		setLayout(null);
		//String views[] = { "1", "2", "3", "4" };
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblName.setBackground(new Color(30, 144, 255));
		lblName.setForeground(new Color(0, 0, 128));
		lblName.setBounds(50, 37, 100, 20);
		add(lblName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEmail.setForeground(new Color(0, 0, 128));
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(50, 110, 100, 20);
		add(lblEmail);

		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPhoneNo.setForeground(new Color(0, 0, 128));
		lblPhoneNo.setBackground(Color.WHITE);
		lblPhoneNo.setBounds(50, 183, 100, 20);
		add(lblPhoneNo);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblGender.setForeground(new Color(0, 0, 128));
		lblGender.setBackground(Color.WHITE);
		lblGender.setBounds(50, 256, 100, 20);
		add(lblGender);

		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblDob.setForeground(new Color(0, 0, 128));
		lblDob.setBackground(Color.WHITE);
		lblDob.setBounds(50, 329, 100, 20);
		add(lblDob);

		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblAge.setForeground(new Color(0, 0, 128));
		lblAge.setBackground(Color.WHITE);
		lblAge.setBounds(460, 256, 100, 30);
		add(lblAge);

		user_name = new JTextField();
		user_name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_name.setForeground(Color.BLACK);
		user_name.setBounds(160, 27, 220, 44);
		add(user_name);
		user_name.setColumns(10);

		user_email = new JTextField();
		user_email.setForeground(Color.BLACK);
		user_email.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_email.setColumns(10);
		user_email.setBounds(160, 100, 220, 44);
		add(user_email);

		// user_phoneno = new JTextField();
		// user_phoneno.setColumns(10);
		// user_phoneno.setBounds(121, 132, 180, 20);
		// add(user_phoneno);

		user_phoneno = new JTextField();
		user_phoneno.setForeground(Color.BLACK);
		user_phoneno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_phoneno.setColumns(10);
		user_phoneno.setBounds(160, 173, 220, 44);
		add(user_phoneno);

		user_gender = new JTextField();
		user_gender.setForeground(Color.BLACK);
		user_gender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_gender.setColumns(10);
		user_gender.setBounds(160, 246, 220, 44);
		add(user_gender);

		user_dob = new JTextField();
		user_dob.setForeground(Color.BLACK);
		user_dob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_dob.setColumns(10);
		user_dob.setBounds(160, 319, 220, 44);
		add(user_dob);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblAddress.setBackground(new Color(240, 240, 240));
		lblAddress.setForeground(new Color(0, 0, 128));
		lblAddress.setAutoscrolls(true);
		lblAddress.setBounds(50, 402, 100, 20);
		add(lblAddress);

		user_id = new JTextField();
		user_id.setForeground(Color.BLACK);
		user_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_id.setBounds(625, 27, 220, 44);
		add(user_id);
		user_id.setColumns(10);

		JLabel lblUserId = new JLabel("User Id");
		lblUserId.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setForeground(new Color(0, 0, 128));
		lblUserId.setBounds(460, 37, 100, 20);
		add(lblUserId);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			Statement stmt = con.createStatement();
			String sql = "Select User_id,Fname,Lname,Mname,Gender,Role,Bdate,Email_id from user where User_id='"
					+ Login.userid.getText() + "'";
			// String sql1 = "Select U_phone_no from user_contact where User_id='"+
			// Login.userid.getText()+"'";
			user_name.setEditable(false);
			user_email.setEditable(false);
			user_phoneno.setEditable(false);
			user_gender.setEditable(false);
			// user_phoneno.setEditable(false);
			user_dob.setEditable(false);
			user_id.setEditable(false);
			
			JLabel lblRating = new JLabel("Rating");
			lblRating.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblRating.setForeground(new Color(0, 0, 128));
			lblRating.setBackground(Color.BLACK);
			lblRating.setBounds(462, 110, 70, 34);
			add(lblRating);
			
			user_rating = new JTextField();
			user_rating.setForeground(Color.BLACK);
			user_rating.setFont(new Font("Tahoma", Font.PLAIN, 18));
			user_rating.setEditable(false);
			user_rating.setColumns(10);
			user_rating.setBounds(625, 100, 220, 44);
			add(user_rating);
			
			JLabel lblRole = new JLabel("Role");
			lblRole.setForeground(new Color(0, 0, 128));
			lblRole.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblRole.setBackground(Color.BLACK);
			lblRole.setBounds(460, 183, 100, 20);
			add(lblRole);
			
			JLabel lblVehiclesOwned = new JLabel("Vehicles Owned");
			lblVehiclesOwned.setForeground(new Color(0, 0, 128));
			lblVehiclesOwned.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			lblVehiclesOwned.setBackground(Color.BLACK);
			lblVehiclesOwned.setBounds(460, 329, 163, 20);
			add(lblVehiclesOwned);
			
			JTextArea vehicles_owned = new JTextArea();
			vehicles_owned.setForeground(Color.BLACK);
			vehicles_owned.setFont(new Font("Tahoma", Font.PLAIN, 18));
			vehicles_owned.setBounds(625, 319, 220, 44);
			add(vehicles_owned);
			
			JButton btnAddVehicle = new JButton("Add Vehicle");
			btnAddVehicle.setBorder(new LineBorder(new Color(0, 0, 128), 4));
			btnAddVehicle.setForeground(new Color(0, 0, 128));
			btnAddVehicle.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					try {
						 VehicleReg vr=new VehicleReg();
						 vr.setVisible(true);
					}
						
					catch(Exception e) {
						System.out.println(e);
					}
				}
			});
			
			
			
			btnAddVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			btnAddVehicle.setBounds(625, 428, 220, 50);
			add(btnAddVehicle);
			
			user_age = new JTextField();
			user_age.setForeground(Color.BLACK);
			user_age.setFont(new Font("Tahoma", Font.PLAIN, 18));
			user_age.setEditable(false);
			user_age.setColumns(10);
			user_age.setBounds(625, 246, 220, 44);
			add(user_age);
			
			user_role = new JTextField();
			user_role.setForeground(Color.BLACK);
			user_role.setFont(new Font("Tahoma", Font.PLAIN, 18));
			user_role.setEditable(false);
			user_role.setColumns(10);
			user_role.setBounds(625, 173, 220, 44);
			add(user_role);
			
			JTextArea user_address = new JTextArea();
			user_address.setForeground(Color.BLACK);
			user_address.setFont(new Font("Tahoma", Font.PLAIN, 18));
			user_address.setBounds(160, 392, 220, 86);
			add(user_address);
			ResultSet rs = stmt.executeQuery(sql);
			// ResultSet rs1 = stmt.executeQuery(sql1);
			while (rs.next()) {
				user_name.setText(rs.getString("Fname") + " " + rs.getString("Mname") + " " + rs.getString("Lname"));
				user_email.setText(rs.getString("Email_id"));
				user_role.setText(rs.getString("Role"));
				//user_phoneno.setText(rs.getString("U_phone_no"));
				user_gender.setText(rs.getString("Gender"));
				user_dob.setText(rs.getString("Bdate"));
				user_id.setText("" + rs.getInt("User_id"));

			}
			String sql2 = "Select Age from user_age where Bdate='" + user_dob.getText() + "'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			// while(rs1.next()){
			// numbers[0] = rs1.getLong("U_phone_no");
			// user_phoneno.setText(""+rs1.getLong("U_phone_no"));
			// }

			while (rs2.next()) {
				user_age.setText("" + rs2.getInt("Age"));
			}

			con.close();
			// user_name.setText();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
