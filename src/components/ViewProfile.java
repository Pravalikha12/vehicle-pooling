package components;

import java.sql.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class ViewProfile extends JPanel {

	/**
	 * Create the panel.
	 */

	private JTextField user_name;
	private JTextField user_email;
	// private JTextField user_phoneno1;
	// private JTextField user_phoneno2;
	private JTextField user_gender;
	private JTextField user_dob;
	private JTextField user_age;
	private JTextField user_id;
	private JTextField user_role;

	// private long numbers[] = new long[2];
	public ViewProfile() {
		setForeground(Color.RED);
		setBackground(Color.BLACK);
		setLayout(null);
		String views[] = { "1", "2", "3", "4" };
		JLabel lblName = new JLabel("Name");
		lblName.setBackground(Color.WHITE);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(58, 57, 46, 14);
		add(lblName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setBounds(58, 97, 46, 14);
		add(lblEmail);

		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setForeground(Color.WHITE);
		lblPhoneNo.setBackground(Color.WHITE);
		lblPhoneNo.setBounds(58, 135, 46, 14);
		add(lblPhoneNo);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setBackground(Color.WHITE);
		lblGender.setBounds(58, 170, 46, 14);
		add(lblGender);

		JLabel lblDob = new JLabel("DOB");
		lblDob.setForeground(Color.WHITE);
		lblDob.setBackground(Color.WHITE);
		lblDob.setBounds(58, 202, 46, 14);
		add(lblDob);

		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.WHITE);
		lblAge.setBackground(Color.WHITE);
		lblAge.setBounds(58, 227, 46, 14);
		add(lblAge);

		user_name = new JTextField();
		user_name.setBounds(121, 54, 180, 20);
		add(user_name);
		user_name.setColumns(10);

		user_email = new JTextField();
		user_email.setColumns(10);
		user_email.setBounds(121, 94, 180, 20);
		add(user_email);

		// user_phoneno = new JTextField();
		// user_phoneno.setColumns(10);
		// user_phoneno.setBounds(121, 132, 180, 20);
		// add(user_phoneno);

		user_gender = new JTextField();
		user_gender.setColumns(10);
		user_gender.setBounds(121, 167, 180, 20);
		add(user_gender);

		user_dob = new JTextField();
		user_dob.setColumns(10);
		user_dob.setBounds(121, 199, 180, 20);
		add(user_dob);

		user_age = new JTextField();
		user_age.setColumns(10);
		user_age.setBounds(121, 224, 180, 20);
		add(user_age);

		JTextArea user_address = new JTextArea();
		user_address.setBounds(121, 263, 180, 68);
		add(user_address);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setAutoscrolls(true);
		lblAddress.setBounds(58, 287, 46, 14);
		add(lblAddress);

		user_id = new JTextField();
		user_id.setBounds(121, 342, 180, 20);
		add(user_id);
		user_id.setColumns(10);

		user_role = new JTextField();
		user_role.setBounds(121, 388, 180, 20);
		add(user_role);
		user_role.setColumns(10);

		JLabel lblUserId = new JLabel("User Id");
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBounds(58, 345, 46, 14);
		add(lblUserId);

		JLabel lblRole = new JLabel("Role");
		lblRole.setForeground(Color.WHITE);
		lblRole.setBackground(Color.BLACK);
		lblRole.setBounds(58, 391, 46, 14);
		add(lblRole);
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
			user_role.setEditable(false);
			user_gender.setEditable(false);
			user_dob.setEditable(false);
			// user_phoneno.setEditable(false);
			user_age.setEditable(false);
			user_id.setEditable(false);
			ResultSet rs = stmt.executeQuery(sql);
			// ResultSet rs1 = stmt.executeQuery(sql1);
			while (rs.next()) {
				user_name.setText(rs.getString("Fname") + " " + rs.getString("Mname") + " " + rs.getString("Lname"));
				user_email.setText(rs.getString("Email_id"));
				user_role.setText(rs.getString("Role"));
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
