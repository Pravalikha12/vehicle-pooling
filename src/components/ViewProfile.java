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
	private JTextField user_phoneno;
	private JTextField user_gender;
	private JTextField user_dob;
	private JTextField user_id;
	private JTextField user_rating;
	private JTextField user_age;
	private JTextField user_role;

	public ViewProfile() {
		setForeground(new Color(30, 144, 255));
		setBackground(new Color(30, 144, 255));
		setLayout(null);
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
		lblAge.setBounds(470, 256, 100, 30);
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
		user_id.setBounds(650, 27, 220, 44);
		add(user_id);
		user_id.setColumns(10);

		JLabel lblUserId = new JLabel("User Id");
		lblUserId.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setForeground(new Color(0, 0, 128));
		lblUserId.setBounds(470, 37, 100, 20);
		add(lblUserId);

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
		lblRating.setBounds(470, 110, 70, 34);
		add(lblRating);

		user_rating = new JTextField();
		user_rating.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_rating.setEditable(false);
		user_rating.setColumns(10);
		user_rating.setBounds(650, 100, 220, 44);
		add(user_rating);

		JLabel lblRole = new JLabel("Role");
		lblRole.setForeground(new Color(0, 0, 128));
		lblRole.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblRole.setBackground(Color.BLACK);
		lblRole.setBounds(470, 183, 100, 20);
		add(lblRole);

		JLabel lblVehiclesOwned = new JLabel("Vehicles \nOwned");
		lblVehiclesOwned.setForeground(new Color(0, 0, 128));
		lblVehiclesOwned.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblVehiclesOwned.setBackground(Color.BLACK);
		lblVehiclesOwned.setBounds(470, 335, 158, 44);
		add(lblVehiclesOwned);

		JTextArea vehicles_owned = new JTextArea();
		vehicles_owned.setFont(new Font("Tahoma", Font.PLAIN, 18));
		vehicles_owned.setForeground(Color.BLACK);
		vehicles_owned.setBounds(650, 319, 220, 105);
		add(vehicles_owned);

		JButton btnAddVehicle = new JButton("Add Vehicle");
		btnAddVehicle.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnAddVehicle.setForeground(new Color(0, 0, 128));
		btnAddVehicle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					VehicleReg vr = new VehicleReg();
					vr.setVisible(true);
				}

				catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		btnAddVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnAddVehicle.setBounds(650, 447, 220, 50);
		add(btnAddVehicle);

		user_age = new JTextField();
		user_age.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_age.setEditable(false);
		user_age.setColumns(10);
		user_age.setBounds(650, 246, 220, 44);
		add(user_age);

		user_role = new JTextField();
		user_role.setForeground(Color.BLACK);
		user_role.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_role.setEditable(false);
		user_role.setColumns(10);
		user_role.setBounds(650, 173, 220, 44);
		add(user_role);

		vehicles_owned.setEditable(false);

		JTextArea user_address = new JTextArea();
		user_address.setForeground(Color.BLACK);
		user_address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user_address.setBounds(160, 392, 220, 105);
		add(user_address);
		user_address.setEditable(false);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root", "");
			Statement stmt = con.createStatement();
			Statement stmt1 = con.createStatement();
			Statement stmt3 = con.createStatement();
			String sql = "Select * from user where User_id=" + Login.userid.getText();
			String sql1 = "Select U_phone_no from user_contact where User_id=" + Login.userid.getText();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSet rs1 = stmt1.executeQuery(sql1);
			int areacode = 0;
			int userid = 0;
			while (rs.next()) {
				user_name.setText(rs.getString("Fname") + " " + rs.getString("Mname") + " " + rs.getString("Lname"));
				user_email.setText(rs.getString("Email_id"));
				user_role.setText(rs.getString("Role"));
				user_gender.setText(rs.getString("Gender"));
				user_dob.setText(rs.getString("Bdate"));
				user_id.setText("" + rs.getInt("User_id"));
				areacode = rs.getInt("Areacode");
				userid = rs.getInt("User_id");
			}

			String sql3 = "Select * from user_address where Areacode=" + areacode;
			ResultSet rs3 = stmt3.executeQuery(sql3);
			while (rs3.next()) {
				user_address.setText(rs3.getInt("Areacode") + " , " + rs3.getInt("Pincode") + " , "
						+ rs3.getString("Address") + " , " + rs3.getString("City") + " , " + rs3.getString("State"));
			}
			String phone = "";
			int i = 0;
			while (rs1.next()) {
				if (i == 0) {
					phone = phone + "  " + rs1.getInt("U_phone_no");
					i++;
				} else {
					phone = phone + " , " + rs1.getInt("U_phone_no");
				}
			}

			user_phoneno.setText(phone);

			String sql2 = "Select Age from user_age where Bdate='" + user_dob.getText() + "'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			while (rs2.next()) {
				user_age.setText("" + rs2.getInt("Age"));
			}

			String sql4 = "Select * from vehicle_lic where V_user_id=" + userid;
			ResultSet rs4 = stmt3.executeQuery(sql4);
			String v = "";
			while (rs4.next()) {
				Statement stmt4 = con.createStatement();
				String sql5 = "Select Type from vehicle_desc where Vehicle_id=" + rs4.getInt("Vehicle_id");
				ResultSet rs5 = stmt4.executeQuery(sql5);
				while (rs5.next()) {
					v = v + " , " + rs5.getString("Type");
				}
			}
			vehicles_owned.setText(v);

			String sql5 = "SELECT AVG(`Rating`) FROM `feedback`,`rides_in` where `feedback`.`F_trip_id`=`rides_in`.`R_trip_id` AND `Status`=0 AND `F_user_id`<>"
					+ Login.userid.getText() + " AND `F_trip_id` IN (SELECT `R_trip_id` WHERE `R_user_id`="
					+ Login.userid.getText() + ")";
			ResultSet rs5 = stmt3.executeQuery(sql5);
			while (rs5.next()) {
				user_rating.setText(rs5.getInt("AVG(`Rating`)") + "");
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
