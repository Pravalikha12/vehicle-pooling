package components;

import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.atomic.AtomicInteger;
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
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.Dimension;

public class Login extends JFrame {

	private JPanel contentPane;
	private int counter = 100;
	private JPasswordField pwdPass;
	private JPasswordField passwd;
	private JTextField fname;
	private JTextField mname;
	private JTextField lname;
	private JTextField email;
	private JTextField phoneno;
	private JTextField phone1;
	private JTextField address;
	private JTextField city;
	private JTextField state;
	private JTextField pincode;
	private JTextField areacode;
	private JTextField role;
	private JTextField gender;
	private JTextField dob;
	private JTextField userid;
	private JPasswordField pass;
	LocalDate today = LocalDate.now();
	private JTextField phone2;

	int getAge() {
		LocalDate age = LocalDate.parse(dob.getText());
		if (age != null && today != null) {
			return Period.between(age, today).getYears();
		}
		return 0;
	}

	AtomicInteger count = new AtomicInteger(201);

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
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 1328, 831);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 11));
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 2000, 952);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tabbedPane.setBounds(340, 90, 920, 540);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(new Rectangle(0, 78, 558, 900));
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(10, 90, 312, 540);
		panel.setLayout(null);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JTextPane txtpnThisAVehicle = new JTextPane();
		txtpnThisAVehicle.setBackground(Color.RED);
		txtpnThisAVehicle.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		txtpnThisAVehicle.setText(
				"ABOUT US\r\nThis a vehicle pooling service\r\nprovided by Namma Ride\r\nFamous in the BMSCE campus\r\nused by every faculty\r\nloved by all students\r\nRegister now for this amazing service");
		txtpnThisAVehicle.setBounds(15, 29, 280, 233);
		txtpnThisAVehicle.setEditable(false);
		panel_5.add(txtpnThisAVehicle);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Prateeka\\Desktop\\JavaDBMS\\bms.png"));
		lblLogo.setBounds(58, 299, 200, 202);
		panel_5.add(lblLogo);
		panel.add(tabbedPane);

		mname = new JTextField();
		mname.setText("god of thunder");

		userid = new JTextField();
		userid.setText("userid");
		userid.setColumns(10);

		pass = new JPasswordField();
		pass.setText("pass");

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

		userid = new JTextField();
		userid.setText("username");
		userid.setColumns(10);
																																																																												
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_1.setBounds(new Rectangle(10, 500, 700, 901));
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(Color.WHITE);
		tabbedPane.addTab("Sign Up", null, panel_1, null);
		
		fname = new JTextField();
		fname.setText("thor");
		fname.setColumns(10);
		fname.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		fname.setBounds(171, 33, 215, 35);
		fname.setText("fname");
		fname.setColumns(10);
		
		mname = new JTextField();
		mname.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		mname.setBounds(171, 83, 215, 35);
		mname.setText("mname");
		mname.setColumns(10);
		
		lname = new JTextField();
		lname.setText("odinson");
		lname.setColumns(10);
						
		lname.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lname.setBounds(171, 133, 215, 35);
		lname.setText("lname");
		lname.setColumns(10);
								
		email = new JTextField();
		email.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		email.setBounds(171, 183, 215, 35);
		email.setText("email");
		email.setColumns(10);
		
		phone1 = new JTextField();
		phone1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		phone1.setBounds(171, 233, 215, 35);
		phone1.setText("phone1");
		phone1.setColumns(10);
		
		address = new JTextField();
		address.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		address.setBounds(662, 33, 215, 35);
		address.setText("address");
		address.setColumns(10);
												
		city = new JTextField();
		city.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		city.setBounds(662, 83, 215, 35);
		city.setText("Bangalore");
		city.setColumns(10);
																
		state = new JTextField();
		state.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		state.setBounds(662, 133, 215, 35);
		state.setText("Karnataka");
		state.setColumns(10);
																		
		areacode = new JTextField();
		areacode.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		areacode.setBounds(662, 183, 215, 35);
		areacode.setText("00000");
		areacode.setColumns(10);
																				
		role = new JTextField();
		role.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		role.setBounds(662, 233, 215, 35);
		role.setText("role");
		role.setColumns(10);
																						
		JLabel FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		FirstName.setForeground(Color.WHITE);
		FirstName.setBounds(15, 33, 154, 35);
		
		JLabel MiddleName = new JLabel("Middle Name");
		MiddleName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		MiddleName.setForeground(Color.WHITE);
		MiddleName.setBounds(15, 83, 154, 35);
																								
		JLabel LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		LastName.setForeground(Color.WHITE);
		LastName.setBounds(15, 133, 154, 35);

		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Email.setForeground(Color.WHITE);
		Email.setBounds(15, 183, 154, 35);
				
		JLabel Phone_no1 = new JLabel("Phone_no1");
		Phone_no1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Phone_no1.setForeground(Color.WHITE);
		Phone_no1.setBounds(15, 233, 154, 35);

		JLabel Address = new JLabel("Address");
		Address.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Address.setForeground(Color.WHITE);
		Address.setBounds(448, 33, 154, 35);

		JLabel City = new JLabel("City");
		City.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		City.setForeground(Color.WHITE);
		City.setBounds(448, 83, 154, 35);

		JLabel State = new JLabel("State");
		State.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		State.setForeground(Color.WHITE);
		State.setBounds(448, 133, 154, 35);

		JLabel AreaCode = new JLabel("AreaCode");
		AreaCode.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		AreaCode.setForeground(Color.WHITE);
		AreaCode.setBounds(448, 167, 93, 35);

		JLabel Role = new JLabel("Role");
		Role.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Role.setForeground(Color.WHITE);
		Role.setBounds(448, 233, 154, 35);

		JLabel Gender = new JLabel("Gender");
		Gender.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Gender.setForeground(Color.WHITE);
		Gender.setBounds(448, 283, 154, 31);

		JLabel DOB = new JLabel("DOB");
		DOB.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		DOB.setForeground(Color.WHITE);
		DOB.setBounds(15, 333, 154, 31);

		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Password.setForeground(Color.WHITE);
		Password.setBounds(448, 333, 154, 31);

		gender = new JTextField();
		gender.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		gender.setBounds(662, 283, 215, 35);
		gender.setText("M/F/Other");
		gender.setColumns(10);

		dob = new JTextField();
		dob.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		dob.setBounds(171, 333, 215, 35);
		dob.setText("yyyy-mm-dd");
		dob.setColumns(10);

		passwd = new JPasswordField();
		passwd.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		passwd.setBounds(662, 333, 215, 36);
		passwd.setText("passwd");
		panel_1.setLayout(null);
		// panel_1.add(btnRegister);
		panel_1.add(FirstName);
		panel_1.add(MiddleName);
		panel_1.add(Email);
		panel_1.add(LastName);
		panel_1.add(Phone_no1);
		panel_1.add(Gender);
		panel_1.add(DOB);
		panel_1.add(dob);
		panel_1.add(fname);
		panel_1.add(mname);
		panel_1.add(lname);
		panel_1.add(email);
		panel_1.add(phone1);
		panel_1.add(gender);
		panel_1.add(Address);
		panel_1.add(City);
		panel_1.add(State);
		panel_1.add(AreaCode);
		panel_1.add(Role);
		panel_1.add(Password);
		panel_1.add(address);
		panel_1.add(city);
		panel_1.add(state);
		panel_1.add(areacode);
		panel_1.add(role);
		panel_1.add(passwd);

		JButton btnRegister = new JButton("Sign Up");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					counter = count.incrementAndGet();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
					"");
					Statement stmt = con.createStatement();
					String sql = "Insert into user (User_id,Fname,Mname,Lname,Gender,Email_id,U_passwd,Role,Bdate,Areacode)"
						+ " values(" + counter + ",'" + fname.getText() + "','" + mname.getText() + "','"
						+ lname.getText() + "','" + gender.getText() + "','" + email.getText() + "','"
						+ passwd.getText().toString() + "','" + role.getText() + "','" + dob.getText() + "',"
						+ areacode.getText() + ")";
						String sql1 = "Insert into user_contact(User_id,U_phone_no)" + "values(" + counter + ","
						+ phone1.getText() + ")," + "(" + counter + "," + phone2.getText() + ")";
						String sql2 = "Insert into user_address(Areacode,Pincode,Address,City,State)" + "values("
						+ areacode.getText() + "," + pincode.getText() + ",'" + address.getText() + "','"
						+ city.getText() + "','" + state.getText() + "')";
						String sql3 = "Insert into user_age(Bdate,Age)" + "values('" + dob.getText() + "'," + getAge()
						+ ")";
					int rs4 = stmt.executeUpdate(sql3);
					int rs2 = stmt.executeUpdate(sql2);
					int rs = stmt.executeUpdate(sql);
					int rs3 = stmt.executeUpdate(sql1);

					if (rs > 0 && rs2 > 0 && rs3 > 0 && rs4 > 0) {
						JOptionPane.showMessageDialog(null, "Registration successful! Your user id is "+count);
					
						
						
					}
	
					else
						JOptionPane.showMessageDialog(null, "Registration unsuccessful, try again!");
								con.close();
					
							} catch (Exception e) {
								System.out.println(e);
							}
					
						}
					});

		btnRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnRegister.setBounds(299, 435, 303, 50);
		panel_1.add(btnRegister);

		JLabel phone_no2 = new JLabel("Phone_no2");
		phone_no2.setForeground(Color.WHITE);
		phone_no2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		phone_no2.setBounds(15, 283, 154, 31);
		panel_1.add(phone_no2);

		phone2 = new JTextField();
		phone2.setText("0000000000");
		phone2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		phone2.setColumns(10);
		phone2.setBounds(171, 283, 215, 35);
		panel_1.add(phone2);

		JButton btnViewAreacode = new JButton("View Areacode");
		btnViewAreacode.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnViewAreacode.setBounds(448, 201, 154, 30);
		panel_1.add(btnViewAreacode);

		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		panel_2.setBackground(Color.BLACK);
		tabbedPane.addTab("Sign In", null, panel_2, null);

		JLabel lblUserId = new JLabel("User id");
		lblUserId.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setBounds(406, 71, 137, 30);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setOpaque(true);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(406, 236, 137, 26);
		userid = new JTextField();
		userid.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		userid.setBounds(228, 117, 459, 85);
		userid.setText("user id");
		userid.setColumns(10);

		pwdPass = new JPasswordField();
		pwdPass.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		pwdPass.setBounds(228, 278, 459, 85);
		pwdPass.setText("pass");
		panel_2.setLayout(null);
		panel_2.add(pwdPass);
		panel_2.add(userid);
		panel_2.add(lblUserId);
		panel_2.add(lblPassword);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnLogin.setBounds(303, 407, 300, 50);
		panel_2.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sql = "Select User_id,U_passwd from user where User_id='" + userid.getText()
							+ "' and U_passwd='" + pwdPass.getText().toString() + "'";
					ResultSet rs = stmt.executeQuery(sql);
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						Layout layout = new Layout();
						layout.setVisible(true);
						setVisible(false);
					}
		
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
					con.close();
		
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		});
		contentPane.add(panel);

		JPanel panel_3 = new JPanel();
		panel_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		panel_3.setBounds(new Rectangle(0, 13, 424, 63));
		panel_3.setBackground(Color.BLACK);
		panel_3.setForeground(Color.RED);
		panel_3.setBounds(0, 0, 2000, 77);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNammaRide = new JLabel("Namma Ride");
		lblNammaRide.setVerticalTextPosition(SwingConstants.TOP);
		lblNammaRide.setVerticalAlignment(SwingConstants.TOP);
		lblNammaRide.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblNammaRide.setIconTextGap(8);
		lblNammaRide.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNammaRide.setHorizontalAlignment(SwingConstants.LEFT);
		lblNammaRide.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 60));
		lblNammaRide.setBackground(new Color(240, 240, 240));
		lblNammaRide.setForeground(Color.RED);
		lblNammaRide.setBounds(0, 0, 424, 77);
		panel_3.add(lblNammaRide);
	}
}
