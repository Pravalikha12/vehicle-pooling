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
		setForeground(Color.RED);
		setBackground(Color.BLACK);
		setLayout(null);
		String views[] = { "1", "2", "3", "4" };
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblName.setBackground(Color.WHITE);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(70, 67, 100, 20);
		add(lblName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(70, 150, 100, 20);
		add(lblEmail);

		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPhoneNo.setForeground(Color.WHITE);
		lblPhoneNo.setBackground(Color.WHITE);
		lblPhoneNo.setBounds(70, 233, 100, 20);
		add(lblPhoneNo);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblGender.setForeground(Color.WHITE);
		lblGender.setBackground(Color.WHITE);
		lblGender.setBounds(70, 316, 100, 20);
		add(lblGender);

		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDob.setForeground(Color.WHITE);
		lblDob.setBackground(Color.WHITE);
		lblDob.setBounds(70, 399, 100, 20);
		add(lblDob);

		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAge.setForeground(Color.WHITE);
		lblAge.setBackground(Color.WHITE);
		lblAge.setBounds(530, 316, 100, 30);
		add(lblAge);

		user_name = new JTextField();
		user_name.setBounds(200, 57, 220, 44);
		add(user_name);
		user_name.setColumns(10);

		user_email = new JTextField();
		user_email.setColumns(10);
		user_email.setBounds(200, 140, 220, 44);
		add(user_email);

		// user_phoneno = new JTextField();
		// user_phoneno.setColumns(10);
		// user_phoneno.setBounds(121, 132, 180, 20);
		// add(user_phoneno);

		user_phoneno = new JTextField();
		user_phoneno.setColumns(10);
		user_phoneno.setBounds(200, 223, 220, 44);
		add(user_phoneno);

		user_gender = new JTextField();
		user_gender.setColumns(10);
		user_gender.setBounds(200, 306, 220, 44);
		add(user_gender);

		user_dob = new JTextField();
		user_dob.setColumns(10);
		user_dob.setBounds(200, 389, 220, 44);
		add(user_dob);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAddress.setBackground(new Color(240, 240, 240));
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setAutoscrolls(true);
		lblAddress.setBounds(70, 482, 100, 20);
		add(lblAddress);

		user_id = new JTextField();
		user_id.setBounds(700, 57, 220, 44);
		add(user_id);
		user_id.setColumns(10);

		JLabel lblUserId = new JLabel("User Id");
		lblUserId.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBounds(530, 67, 100, 20);
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
			lblRating.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			lblRating.setForeground(Color.WHITE);
			lblRating.setBackground(Color.BLACK);
			lblRating.setBounds(530, 150, 70, 34);
			add(lblRating);
			
			user_rating = new JTextField();
			user_rating.setEditable(false);
			user_rating.setColumns(10);
			user_rating.setBounds(700, 140, 220, 44);
			add(user_rating);
			
			JLabel lblRole = new JLabel("Role");
			lblRole.setForeground(Color.WHITE);
			lblRole.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			lblRole.setBackground(Color.BLACK);
			lblRole.setBounds(530, 233, 100, 20);
			add(lblRole);
			
			JLabel lblVehiclesOwned = new JLabel("Vehicles Owned");
			lblVehiclesOwned.setForeground(Color.WHITE);
			lblVehiclesOwned.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			lblVehiclesOwned.setBackground(Color.BLACK);
			lblVehiclesOwned.setBounds(530, 399, 208, 20);
			add(lblVehiclesOwned);
			
			JTextArea vehicles_owned = new JTextArea();
			vehicles_owned.setBounds(700, 389, 220, 70);
			add(vehicles_owned);
			
			JButton btnAddVehicle = new JButton("Add Vehicle");
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
			btnAddVehicle.setBounds(730, 482, 160, 29);
			add(btnAddVehicle);
			
			user_age = new JTextField();
			user_age.setEditable(false);
			user_age.setColumns(10);
			user_age.setBounds(700, 306, 220, 44);
			add(user_age);
			
			user_role = new JTextField();
			user_role.setEditable(false);
			user_role.setColumns(10);
			user_role.setBounds(700, 223, 220, 44);
			add(user_role);
			
			JTextArea user_address = new JTextArea();
			user_address.setBounds(200, 472, 220, 50);
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
