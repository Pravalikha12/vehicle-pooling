package components;

import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private int counter=100;
	//private JTextField txtUsername;
	private JPasswordField pwdPass;
	private JTextField  fname;
	private JTextField mname;
	private JTextField lname;
	private JTextField email;
	private JTextField phoneno;
	private JTextField address;
	private JTextField city;
	private JTextField state;
	private JTextField pincode;
	private JTextField role;
	private JTextField gender;
	private JTextField dob;
	//private JPasswordField password;
	private JTextField userid;
	private JPasswordField pass;
	private JPasswordField pass_1;
	private Component lblPassword;
	private Component lblUserName;
	LocalDate today = LocalDate.now();
	int getAge() {
		LocalDate age = LocalDate.parse(dob.getText());
		if(age!=null&&today!=null) {
			return Period.between(age, today).getYears();
		}
		return 0;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
		);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE))
				.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 275, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
		);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 357, Short.MAX_VALUE)
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 254, Short.MAX_VALUE)
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 784, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sign Up", null, panel_1, null);
		
		fname = new JTextField();
		fname.setText("thor");
		fname.setColumns(10);  
		
		mname = new JTextField();
		mname.setText("god of thunder");
		mname.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		
		
		userid = new JTextField();
		userid.setText("userid");
		userid.setColumns(10);
		
		pass = new JPasswordField();
		pass.setText("pass");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				
				
				
				/*try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from tblogin where UserName='"+user.getText()+"' and Password='"+pass.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
						JOptionPane.showMessageDialog(null, "Login successful!");
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
					con.close();
					
				}*/
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb","root","");
					Statement stmt = con.createStatement();
					String sql = "Select User_id, U_passwd from user where User_id='"+userid.getText()+"' and U_passwd='"+pass.getText().toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
						JOptionPane.showMessageDialog(null, "Login Succesful");
					else
						JOptionPane.showMessageDialog(null, "Login Failed");
					con.close();
				} catch(Exception e) {
					System.out.println("Invalid!");
				}
			}

		});
		/*GroupLayout gl_panel_51 = new GroupLayout(panel_5);
		gl_panel_51.setHorizontalGroup(
			gl_panel_51.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_51.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_51.createSequentialGroup()
							.addComponent(lblPassword)
							.addContainerGap())
						.addGroup(gl_panel_51.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_51.createSequentialGroup()
								.addComponent(lblUserName, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
								.addGap(102))
							.addGroup(gl_panel_51.createSequentialGroup()
								.addGroup(gl_panel_51.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
									.addComponent(userid, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
									.addComponent(pass, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
								.addGap(50)))))
		);
		gl_panel_51.setVerticalGroup(
			gl_panel_51.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addGap(26)
					.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(userid, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(pass, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		
		panel_5.setLayout(gl_panel_51); 
		*/ 
		lname = new JTextField();
		lname.setText("odinson");
		lname.setColumns(10);
		
		email = new JTextField();
		email.setText("mail");
		email.setColumns(10);
		
		phoneno = new JTextField();
		phoneno.setText("898989");
		phoneno.setColumns(10);
		
		address = new JTextField();
		address.setText("hanu");
		address.setColumns(10);
		
		city = new JTextField();
		city.setText("blore");
		city.setColumns(10);
		
		state = new JTextField();
		state.setText("ktaka");
		state.setColumns(10);
		
		pincode = new JTextField();
		pincode.setText("45000");
		pincode.setColumns(10);
		
		role = new JTextField();
		role.setText("stud");
		role.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					counter++;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb","root","");
					Statement stmt=con.createStatement();
					String sql="Insert into user (User_id,Fname,Mname,Lname,Gender,Email_id,U_passwd,Role,Bdate,Pincode)"+" values("+counter+",'"+fname.getText()+"','"+mname.getText()+"','"+lname.getText()+"','"+gender.getText()+"','"+email.getText()+"','"+pwdPass.getText().toString()+"','"+role.getText()+"','"+dob.getText()+"',"+pincode.getText()+")";
					String sql1 = "Insert into user_contact(User_id,U_phone_no)"+ "values("+counter+","+phoneno.getText()+")";
					String sql2 = "Insert into user_address(Pincode,Address,City,State)"+"values("+pincode.getText()+",'"+address.getText()+"','"+city.getText()+"','"+state.getText()+"')";
					String sql3 = "Insert into user_age(Bdate,Age)"+ "values('"+dob.getText()+"',"+getAge()+")";
					int rs = stmt.executeUpdate(sql);
					int rs2 = stmt.executeUpdate(sql1);
					int rs3 = stmt.executeUpdate(sql2);
					int rs4 = stmt.executeUpdate(sql3);
					if(rs>0&&rs2>0&&rs3>0&&rs4>0)
						JOptionPane.showMessageDialog(null, "Registration successful!");
					else
						JOptionPane.showMessageDialog(null, "Incorrext Username or Password!");
					con.close();
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
				
				
			}
		});
		
		JLabel FirstName = new JLabel("First Name");
		
		JLabel MiddleName = new JLabel("Middle Name");
		
		JLabel LastName = new JLabel("Last Name");
		
		JLabel Email = new JLabel("Email");
		
		JLabel Phone_no = new JLabel("Phone_no");
		
		JLabel Address = new JLabel("Address");
		
		JLabel City = new JLabel("City");
		
		JLabel State = new JLabel("State");
		
		JLabel Pincode = new JLabel("PinCode");
		
		JLabel Role = new JLabel("Role");
		
		JLabel Gender = new JLabel("Gender");
		
		JLabel DOB = new JLabel("DOB");
		
		JLabel Password = new JLabel("Password");
		
		gender = new JTextField();
		gender.setText("f");
		gender.setColumns(10);
		
		dob = new JTextField();
		dob.setText("2019-09-02");
		dob.setColumns(10);
		
		pass_1 = new JPasswordField();
		pass_1.setText("password");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addComponent(btnRegister, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(FirstName)
						.addComponent(MiddleName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Email, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(LastName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Phone_no, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Gender, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(DOB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(31)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(dob, Alignment.TRAILING)
						.addComponent(fname, Alignment.TRAILING)
						.addComponent(mname, Alignment.TRAILING)
						.addComponent(lname, Alignment.TRAILING)
						.addComponent(email, Alignment.TRAILING)
						.addComponent(phoneno, Alignment.TRAILING)
						.addComponent(gender, Alignment.TRAILING))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(Address, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(City, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(State, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Pincode, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Role, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Password, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(66)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(state, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pincode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(role, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pass_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(FirstName)
						.addComponent(fname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Address))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(MiddleName)
						.addComponent(mname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(City))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(state, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LastName)
						.addComponent(lname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(State))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(pincode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Email)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Pincode))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(role, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Phone_no)
						.addComponent(phoneno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Role))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(Gender)
						.addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Password)
						.addComponent(pass_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(dob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(DOB))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sign In", null, panel_2, null);
		
		JLabel lblUserId = new JLabel("User id");
		
		JLabel lblPassword = new JLabel("Password");
		
		userid = new JTextField();
		userid.setText("username");
		userid.setColumns(10);
		
		pwdPass = new JPasswordField();
		pwdPass.setText("pass");
		
		JButton btnLogin1 = new JButton("Login");
		btnLogin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb","root","");
					Statement stmt=con.createStatement();
					String sql="Select User_id,U_passwd from user where User_id='"+userid.getText()+"' and U_passwd='"+pwdPass.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
						JOptionPane.showMessageDialog(null, "Login successful!");
					else
						JOptionPane.showMessageDialog(null, "Incorrext Username or Password!");
					con.close();
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			
		});
		
		
		
		
		
		
		
		
		
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(pwdPass, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
						.addComponent(userid, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
						.addComponent(lblUserId, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
						.addComponent(lblPassword, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
						.addComponent(btnLogin1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUserId, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(userid, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pwdPass, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogin1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
