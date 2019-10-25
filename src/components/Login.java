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

public class Login extends JFrame {

	private JPanel contentPane;
	private int counter = 100;
	// private JTextField txtUsername;
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
	// private JPasswordField password;
	private JTextField userid;
	private JPasswordField pass;
	//private JPasswordField pass_1;
	//private Component lblPassword;
	//private Component lblUserName;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 441);
		setBounds(100, 100, 884, 441);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 11));
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 868, 402);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(248, 50, 610, 328);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(10, 50, 220, 328);
		panel.setLayout(null);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JTextPane txtpnThisAVehicle = new JTextPane();
		txtpnThisAVehicle.setFont(new Font("Comic Sans MS", Font.ITALIC, 14));
		txtpnThisAVehicle.setText(
				"ABOUT US\r\nThis a vehicle pooling service\r\nprovided by Namma Ride\r\nFamous in the BMSCE campus\r\nused by every faculty\r\nloved by all students\r\nRegister now for this amazing service");
		txtpnThisAVehicle.setBounds(10, 11, 198, 131);
		panel_5.add(txtpnThisAVehicle);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pranathi\\Desktop\\bms.png"));
		lblNewLabel.setBounds(10, 153, 208, 170);
		panel_5.add(lblNewLabel);
		panel.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(Color.WHITE);
		tabbedPane.addTab("Sign Up", null, panel_1, null);

		fname = new JTextField();
		fname.setText("thor");
		fname.setColumns(10);

		mname = new JTextField();
		mname.setText("god of thunder");
		fname.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		fname.setBounds(132, 21, 86, 20);
		fname.setText("fname");
		fname.setColumns(10);

		mname = new JTextField();
		mname.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		mname.setBounds(132, 47, 86, 20);
		mname.setText("mname");
		mname.setColumns(10);

		userid = new JTextField();
		userid.setText("userid");
		userid.setColumns(10);

		pass = new JPasswordField();
		pass.setText("pass");
		
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

		
		lname.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lname.setBounds(132, 73, 86, 20);
		lname.setText("lname");
		lname.setColumns(10);

		email = new JTextField();
		email.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		email.setBounds(132, 99, 86, 20);
		email.setText("email");
		email.setColumns(10);

		phone1 = new JTextField();
		phone1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		phone1.setBounds(132, 125, 86, 20);
		phone1.setText("phone1");
		phone1.setColumns(10);

		address = new JTextField();
		address.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		address.setBounds(419, 21, 86, 20);
		address.setText("address");
		address.setColumns(10);

		city = new JTextField();
		city.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		city.setBounds(419, 47, 86, 20);
		city.setText("Bangalore");
		city.setColumns(10);

		state = new JTextField();
		state.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		state.setBounds(419, 73, 86, 20);
		state.setText("Karnataka");
		state.setColumns(10);

		areacode = new JTextField();
		areacode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		areacode.setBounds(419, 99, 86, 20);
		areacode.setText("00000");
		areacode.setColumns(10);

		role = new JTextField();
		role.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		role.setBounds(419, 125, 86, 20);
		role.setText("role");
		role.setColumns(10);

		JLabel FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		FirstName.setForeground(Color.WHITE);
		FirstName.setBounds(10, 24, 86, 20);

		JLabel MiddleName = new JLabel("Middle Name");
		MiddleName.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		MiddleName.setForeground(Color.WHITE);
		MiddleName.setBounds(10, 50, 70, 14);

		JLabel LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		LastName.setForeground(Color.WHITE);
		LastName.setBounds(10, 76, 60, 14);

		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Email.setForeground(Color.WHITE);
		Email.setBounds(10, 102, 60, 14);

		JLabel Phone_no1 = new JLabel("Phone_no1");
		Phone_no1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Phone_no1.setForeground(Color.WHITE);
		Phone_no1.setBounds(10, 128, 60, 14);

		JLabel Address = new JLabel("Address");
		Address.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Address.setForeground(Color.WHITE);
		Address.setBounds(291, 24, 62, 14);

		JLabel City = new JLabel("City");
		City.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		City.setForeground(Color.WHITE);
		City.setBounds(291, 50, 62, 14);

		JLabel State = new JLabel("State");
		State.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		State.setForeground(Color.WHITE);
		State.setBounds(291, 76, 62, 14);

		JLabel AreaCode = new JLabel("AreaCode");
		AreaCode.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		AreaCode.setForeground(Color.WHITE);
		AreaCode.setBounds(291, 102, 62, 14);

		JLabel Role = new JLabel("Role");
		Role.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Role.setForeground(Color.WHITE);
		Role.setBounds(291, 128, 62, 14);

		JLabel Gender = new JLabel("Gender");
		Gender.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Gender.setForeground(Color.WHITE);
		Gender.setBounds(291, 151, 60, 14);

		JLabel DOB = new JLabel("DOB");
		DOB.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		DOB.setForeground(Color.WHITE);
		DOB.setBounds(10, 180, 60, 14);

		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Password.setForeground(Color.WHITE);
		Password.setBounds(291, 180, 62, 14);

		gender = new JTextField();
		gender.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		gender.setBounds(419, 148, 86, 20);
		gender.setText("M/F/Other");
		gender.setColumns(10);

		dob = new JTextField();
		dob.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		dob.setBounds(132, 177, 86, 20);
		dob.setText("yyyy-mm-dd");
		dob.setColumns(10);

		passwd = new JPasswordField();
		passwd.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		passwd.setBounds(419, 177, 86, 20);
		passwd.setText("passwd");
		panel_1.setLayout(null);
		//panel_1.add(btnRegister);
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
							+ phone1.getText() + "),"+"(" + counter + ","
									+ phone2.getText() + ")";
					String sql2 = "Insert into user_address(Areacode,Pincode,Address,City,State)" + "values("+areacode.getText()+"," + pincode.getText()
							+ ",'" + address.getText() + "','" + city.getText() + "','" + state.getText() + "')";
					String sql3 = "Insert into user_age(Bdate,Age)" + "values('" + dob.getText() + "'," + getAge()
							+ ")";
					int rs4 = stmt.executeUpdate(sql3);
					int rs2 = stmt.executeUpdate(sql2);
					int rs = stmt.executeUpdate(sql);
					int rs3 = stmt.executeUpdate(sql1);

					if (rs > 0 && rs2 > 0 && rs3 > 0 && rs4 > 0)
						JOptionPane.showMessageDialog(null, "Registration successful!");
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
					con.close();

				} 
				catch (Exception e) {
					System.out.println(e);
				}

			}
		});
		
		btnRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnRegister.setBounds(37, 233, 468, 39);
		panel_1.add(btnRegister);
		
		JLabel phone_no2 = new JLabel("Phone_no2");
		phone_no2.setForeground(Color.WHITE);
		phone_no2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		phone_no2.setBounds(10, 151, 70, 14);
		panel_1.add(phone_no2);
		
		phone2 = new JTextField();
		phone2.setText("0000000000");
		phone2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		phone2.setColumns(10);
		phone2.setBounds(132, 148, 86, 20); 
		panel_1.add(phone2);

		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		panel_2.setBackground(Color.BLACK);
		tabbedPane.addTab("Sign In", null, panel_2, null);

		JLabel lblUserId = new JLabel("User id");
		lblUserId.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBackground(Color.BLACK);
		lblUserId.setBounds(37, 16, 479, 30);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setOpaque(true);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(37, 115, 479, 26);

		userid = new JTextField();
		userid.setText("username");
		userid.setColumns(10);
		userid = new JTextField();
		userid.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		userid.setBounds(37, 57, 479, 38);
		userid.setText("user id");
		userid.setColumns(10);

		pwdPass = new JPasswordField();
		pwdPass.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		pwdPass.setBounds(37, 163, 479, 38);
		pwdPass.setText("pass");
		panel_2.setLayout(null);
		panel_2.add(pwdPass);
		panel_2.add(userid);
		panel_2.add(lblUserId);
		panel_2.add(lblPassword);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnLogin.setBounds(37, 242, 479, 30);
		panel_2.add(btnLogin);
		contentPane.add(panel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(0, 372, 858, 30);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblAllRightsReserved = new JLabel("All Rights Reserved 2019 \u00A9 ");
		lblAllRightsReserved.setForeground(Color.RED);
		lblAllRightsReserved.setBounds(0, 0, 858, 30);
		panel_4.add(lblAllRightsReserved);
		lblAllRightsReserved.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllRightsReserved.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAllRightsReserved.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblAllRightsReserved.setBackground(Color.BLACK);
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
						HistoryFrame history=new HistoryFrame();
						setVisible(false);
						history.setVisible(true);		
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

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setForeground(Color.RED);
		panel_3.setBounds(0, 0, 868, 45);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNammaRide = new JLabel("Namma Ride");
		lblNammaRide.setVerticalTextPosition(SwingConstants.TOP);
		lblNammaRide.setVerticalAlignment(SwingConstants.TOP);
		lblNammaRide.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblNammaRide.setIconTextGap(8);
		lblNammaRide.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNammaRide.setHorizontalAlignment(SwingConstants.LEFT);
		lblNammaRide.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 39));
		lblNammaRide.setBackground(new Color(240, 240, 240));
		lblNammaRide.setForeground(Color.RED);
		lblNammaRide.setBounds(0, 0, 424, 45);
		panel_3.add(lblNammaRide);
	}
}


