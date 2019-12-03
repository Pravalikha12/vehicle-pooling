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
import com.toedter.calendar.JCalendar;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.math.BigInteger;

public class Login extends JFrame {

	private JPanel contentPane;
	public int uid;
	public static JPasswordField pwdPass;
	public static JPasswordField passwd;
	public static JTextField fname;
	public static JTextField mname;
	public static JTextField lname;
	public static JTextField email;
	public static JTextField phoneno;
	public static JTextField phone1;
	public static JTextField phone2;
	public static JTextField dob;
	public static JTextField address;
	public static JTextField city;
	public static JTextField state;

	public static JTextField areacode;
	public static JTextField userid;
	public static JPasswordField pass;

	LocalDate today = LocalDate.now();

	private String firstname;
	private String middlename;
	private String lastname;
	private String rdrole;
	private String rdgender;
	private String phoneno1;
	private String phoneno2;
	private String addr;
	private String citi;
	private String stat;
	private int pincode;
	private int acode;
	private BigInteger p1;
	private BigInteger p2;
	private String reemail = "^[A-Z a-z 0-9]+.[A-Z a-z 0-9]+@bmsce.ac.in";
	private String redob = "(19|20)\\d\\d[-/](0[1-9]|1[012])[-/]([1-9]|[12][0-9]|3[01])";

	private JLabel errordob;
	private JLabel errorphone;
	private JLabel erroremail;
	private JLabel errorname;
	private JLabel errorpasswd;
	private JLabel errorcode;
	private JLabel erroraddress;

	private JRadioButton rdstudent;
	private JRadioButton rdfaculty;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;

	int getAge() {
		LocalDate age = LocalDate.parse(dob.getText());
		if (age != null && today != null) {
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
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1380, 750);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 11));
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 2000, 952);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tabbedPane.setBounds(340, 79, 920, 551);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(new Rectangle(0, 78, 558, 900));
		panel_5.setBackground(new Color(30, 144, 255));
		panel_5.setBounds(0, 79, 340, 551);
		panel.setLayout(null);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JTextPane txtpnThisAVehicle = new JTextPane();
		txtpnThisAVehicle.setForeground(Color.WHITE);
		txtpnThisAVehicle.setBackground(new Color(0, 0, 139));
		txtpnThisAVehicle.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		txtpnThisAVehicle.setText(
				"ABOUT US\r\nThis a vehicle pooling service\r\nprovided by Namma Ride\r\nFamous in the BMSCE campus\r\nused by every faculty\r\nloved by all students\r\nRegister now for this amazing service");
		txtpnThisAVehicle.setBounds(15, 29, 297, 233);
		txtpnThisAVehicle.setEditable(false);
		panel_5.add(txtpnThisAVehicle);

		JLabel lblLogo = new JLabel("");
		lblLogo.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Prateeka\\Desktop\\vehicle-pooling\\image\\bms.png"));
		lblLogo.setBounds(58, 312, 208, 189);
		panel_5.add(lblLogo);
		panel.add(tabbedPane);

		JButton btnLogin = new JButton("LOGIN");

		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
		panel_1.setBounds(new Rectangle(10, 500, 700, 901));
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setForeground(Color.WHITE);
		tabbedPane.addTab("Sign Up", null, panel_1, null);

		fname = new JTextField();
		fname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (fname.getText().length() > 30) {
					errorname.setText("Name is too long");
				}
			}
		});
		fname.setColumns(10);
		fname.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		fname.setBounds(171, 25, 215, 35);
		fname.setColumns(10);

		mname = new JTextField();
		mname.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		mname.setBounds(171, 75, 215, 35);
		mname.setColumns(10);

		lname = new JTextField();
		lname.setColumns(10);
		lname.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lname.setBounds(171, 125, 215, 35);
		lname.setColumns(10);

		email = new JTextField();
		email.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (email.getText().length() > 50 || (!(email.getText().matches(reemail)))) {
					erroremail.setText("Invalid email address");
				}

			}
		});
		email.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		email.setBounds(171, 190, 215, 35);
		email.setColumns(10);

		phone1 = new JTextField();
		phone1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if (phone1.getText().length() != 10) {
					errorphone.setText("Phone number should be 10 digits long");
				}

			}
		});
		phone1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		phone1.setBounds(171, 270, 215, 35);
		phone1.setColumns(10);

		address = new JTextField();
		address.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if (addr.length() > 30 || citi.length() > 30 || stat.length() > 30) {
					erroraddress.setText("Address is too long");
				}

			}

		});
		address.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		address.setBounds(662, 25, 215, 35);
		address.setColumns(10);

		
		
		dob = new JTextField();
		dob.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent arg0) {
				if ((!(dob.getText().matches(redob)))) {
					errordob.setText("Invalid date of birth");
				}
			}
		});
		dob.setBackground(new Color(255, 255, 255));
		dob.setText("yyyy-mm-dd");
		dob.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		dob.setColumns(10);
		dob.setBounds(171, 400, 215, 35);
		panel_1.add(dob);
		
		
		
		
		
		
		
		city = new JTextField();
		city.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		city.setBounds(662, 70, 215, 35);
		city.setText("Bangalore");
		city.setColumns(10);

		state = new JTextField();
		state.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		state.setBounds(662, 114, 215, 35);
		state.setText("Karnataka");
		state.setColumns(10);

		areacode = new JTextField();
		areacode.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		areacode.setBounds(662, 183, 215, 35);
		areacode.setText("0");
		areacode.setColumns(10);

		JLabel FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		FirstName.setForeground(new Color(0, 0, 139));
		FirstName.setBounds(15, 25, 154, 35);

		JLabel MiddleName = new JLabel("Middle Name");
		MiddleName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		MiddleName.setForeground(new Color(0, 0, 139));
		MiddleName.setBounds(15, 75, 154, 35);

		JLabel LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		LastName.setForeground(new Color(0, 0, 139));
		LastName.setBounds(15, 125, 154, 35);

		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Email.setForeground(new Color(0, 0, 139));
		Email.setBounds(15, 190, 154, 35);

		JLabel Phone_no1 = new JLabel("Phone No 1");
		Phone_no1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Phone_no1.setForeground(new Color(0, 0, 139));
		Phone_no1.setBounds(15, 270, 154, 35);

		JLabel Address = new JLabel("Address");
		Address.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Address.setForeground(new Color(0, 0, 139));
		Address.setBounds(448, 25, 154, 35);

		JLabel City = new JLabel("City");
		City.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		City.setForeground(new Color(0, 0, 139));
		City.setBounds(448, 70, 154, 35);

		JLabel State = new JLabel("State");
		State.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		State.setForeground(new Color(0, 0, 139));
		State.setBounds(448, 114, 154, 35);

		JLabel AreaCode = new JLabel("AreaCode");
		AreaCode.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		AreaCode.setForeground(new Color(0, 0, 139));
		AreaCode.setBounds(448, 167, 93, 35);

		JLabel Role = new JLabel("Role");
		Role.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Role.setForeground(new Color(0, 0, 139));
		Role.setBounds(448, 265, 154, 35);

		JLabel Gender = new JLabel("Gender");
		Gender.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Gender.setForeground(new Color(0, 0, 139));
		Gender.setBounds(448, 320, 154, 31);

		JLabel DOB = new JLabel("DOB");
		DOB.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		DOB.setForeground(new Color(0, 0, 139));
		DOB.setBounds(15, 400, 154, 31);

		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Password.setForeground(new Color(0, 0, 139));
		Password.setBounds(448, 400, 154, 31);

		passwd = new JPasswordField();
		passwd.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (passwd.getText().length() > 15) {
					errorpasswd.setText("Password is too long");
				}
			}
		});
		passwd.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		passwd.setBounds(662, 400, 215, 36);
		
		dob = new JTextField();
		dob.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent arg0) {
				if ((!(dob.getText().matches(redob)))) {
					errordob.setText("Invalid date of birth");
				}
			}
		});
		dob.setBackground(new Color(255, 255, 255));
		dob.setText("yyyy-mm-dd");
		dob.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		dob.setColumns(10);
		dob.setBounds(171, 400, 215, 35);
		panel_1.add(dob);
		
		
		
		
		panel_1.setLayout(null);
		// panel_1.add(btnRegister);
		panel_1.add(FirstName);
		panel_1.add(MiddleName);
		panel_1.add(Email);
		panel_1.add(LastName);
		panel_1.add(Phone_no1);
		panel_1.add(Gender);
		panel_1.add(DOB);
		panel_1.add(fname);
		panel_1.add(mname);
		panel_1.add(lname);
		panel_1.add(email);
		panel_1.add(phone1);
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
		panel_1.add(passwd);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(new Color(0, 0, 128));
		btnSignUp.setBorder(new LineBorder(new Color(0, 0, 128), 3));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					boolean flag = true;
					firstname = fname.getText();
					if (firstname.length() > 30) {
						flag = false;
					}
					middlename = mname.getText();
					if (middlename.length() > 30) {
						flag = false;
					}
					lastname = lname.getText();
					if (lastname.length() > 30) {
						flag = false;
					}

					phoneno1 = phone1.getText();
					p1 = new BigInteger(phoneno1);
					if (phoneno1.length() > 10) {
						flag = false;
					}

					phoneno2 = phone2.getText();
					p2 = new BigInteger(phoneno2);
					if (phoneno2.length() > 10) {
						flag = false;
					}

					if (!(email.getText().matches(reemail))) {
						flag = false;
					}
					if (!(dob.getText().matches(redob))) {
						flag = false;
					}
					addr = address.getText();
					citi = city.getText();
					stat = state.getText();
					if (addr.length() > 30 || citi.length() > 30 || stat.length() > 30) {
						flag = false;
					}

					acode = Integer.parseInt(areacode.getText());
					if (acode < 1 || acode > 26) {
						flag = false;
						JOptionPane.showMessageDialog(null, "Please enter valid area code");
					}

					rdrole = null;
					if (rdstudent.isSelected()) {
						rdrole = "Student";
					}
					if (rdfaculty.isSelected()) {
						rdrole = "Faculty";
					}

					rdgender = null;
					if (rdbtnMale.isSelected()) {
						rdgender = "Male";
					}
					if (rdbtnFemale.isSelected()) {
						rdgender = "Female";
					}
					if (rdbtnOther.isSelected()) {
						rdgender = "Other";
					}

					if (Integer.parseInt(areacode.getText()) == 1) {
						pincode = 560060;
					}
					if (Integer.parseInt(areacode.getText()) == 2 || Integer.parseInt(areacode.getText()) == 3
							|| Integer.parseInt(areacode.getText()) == 4) {
						pincode = 560085;
					}

					if (Integer.parseInt(areacode.getText()) == 5 || Integer.parseInt(areacode.getText()) == 6) {
						pincode = 560028;
					}

					if (Integer.parseInt(areacode.getText()) == 7 || Integer.parseInt(areacode.getText()) == 8) {
						pincode = 560041;
					}
					if (Integer.parseInt(areacode.getText()) == 9 || Integer.parseInt(areacode.getText()) == 10
							|| Integer.parseInt(areacode.getText()) == 11) {
						pincode = 560078;
					}
					if (Integer.parseInt(areacode.getText()) == 12 || Integer.parseInt(areacode.getText()) == 13
							|| Integer.parseInt(areacode.getText()) == 14) {
						pincode = 560029;
					}
					if (Integer.parseInt(areacode.getText()) == 15) {
						pincode = 560100;
					}
					if (Integer.parseInt(areacode.getText()) == 16 || Integer.parseInt(areacode.getText()) == 17) {
						pincode = 560034;
					}

					if (Integer.parseInt(areacode.getText()) == 18) {
						pincode = 560063;
					}
					if (Integer.parseInt(areacode.getText()) == 19) {
						pincode = 560066;
					}
					if (Integer.parseInt(areacode.getText()) == 20) {
						pincode = 560036;
					}
					if (Integer.parseInt(areacode.getText()) == 21) {
						pincode = 560009;
					}
					if (Integer.parseInt(areacode.getText()) == 22 || Integer.parseInt(areacode.getText()) == 23) {
						pincode = 560040;
					}

					if (Integer.parseInt(areacode.getText()) == 24) {
						pincode = 560027;
					}

					if (Integer.parseInt(areacode.getText()) == 25 || Integer.parseInt(areacode.getText()) == 26) {
						pincode = 560001;
					}

					
					if (fname.getText().isEmpty()) {
						errorname.setText("Please enter name ");
					}
					if (lname.getText().isEmpty()) {
						errorname.setText("Please enter name ");
					}
					if (email.getText().isEmpty()) {
						erroremail.setText("Please enter email  Eg. smitha@bmsce.ac.in ");
					}
					if (phone1.getText().isEmpty()) {
						errorphone.setText("Please enter mobile number  Eg. 9547389741");
					}
					if (dob.getText().isEmpty()) {
						errordob.setText("Please enter date of birth  Eg. 1989-02-13");
					}
					if (areacode.getText().isEmpty()) {
						errorcode.setText("Areacode cannot be empty");
					}
					if (address.getText().isEmpty() || city.getText().isEmpty() || state.getText().isEmpty()) {
						erroraddress.setText("Please enter address  Eg. Jayanagar B'lore K'taka");
					}
					if (passwd.getText().isEmpty()) {
						errorpasswd.setText("Password cannot be empty");
					}

					
					uid = (int) (System.currentTimeMillis() & 0xfffffff);

					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sql = "Insert into user (User_id,Fname,Mname,Lname,Gender,Email_id,U_passwd,Role,Bdate,Areacode)"
							+ " values(" + uid + ",'" + firstname + "','" + middlename + "','" + lastname + "','"
							+ rdgender + "','" + email.getText() + "','" + passwd.getText().toString() + "','" + rdrole
							+ "','" + dob.getText() + "'," + acode + ")";

					String sql1 = "Insert into user_contact(User_id,U_phone_no)" + "values(" + uid + "," + p1 + "),"
							+ "(" + uid + "," + p2 + ")";

					String sql2 = "Insert into user_address(Areacode,Pincode,Address,City,State)" + "values(" + acode
							+ "," + pincode + ",'" + addr + "','" + citi + "','" + stat + "')";

					String sql3 = "Insert into user_age(Bdate,Age)" + "values('" + dob.getText() + "'," + getAge()
							+ ")";

					int rs4 = stmt.executeUpdate(sql3);
					int rs2 = stmt.executeUpdate(sql2);
					int rs = stmt.executeUpdate(sql);
					int rs3 = stmt.executeUpdate(sql1);

					if (rs > 0 && rs2 > 0 && rs3 > 0 && rs4 > 0 && flag == true) {
						JOptionPane.showMessageDialog(null, "Registration successful! Your user id is " + uid);

					}

					else
						JOptionPane.showMessageDialog(null, "Registration unsuccessful, try again!");
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
							}
		});

		btnSignUp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnSignUp.setBounds(317, 466, 150, 35);
		panel_1.add(btnSignUp);

		JLabel phone_no2 = new JLabel("Phone No 2");
		phone_no2.setForeground(new Color(0, 0, 139));
		phone_no2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		phone_no2.setBounds(15, 320, 154, 31);
		panel_1.add(phone_no2);

		phone2 = new JTextField();
		phone2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		phone2.setColumns(10);
		phone2.setBounds(171, 320, 215, 35);
		panel_1.add(phone2);

		JButton btnViewAreacode = new JButton("View Areacode");
		btnViewAreacode.setBorder(new LineBorder(new Color(0, 0, 128), 3));
		btnViewAreacode.setForeground(new Color(0, 0, 128));
		btnViewAreacode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ViewAreacode codeList = new ViewAreacode();
					codeList.setVisible(true);
				}

				catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		btnViewAreacode.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnViewAreacode.setBounds(448, 201, 154, 30);
		panel_1.add(btnViewAreacode);

		

		JButton btnClear = new JButton("Reset");
		btnClear.setForeground(new Color(0, 0, 128));
		btnClear.setBorder(new LineBorder(new Color(0, 0, 128), 3));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				fname.setText(null);
				mname.setText(null);
				lname.setText(null);
				email.setText(null);
				phone1.setText(null);
				phone2.setText(null);
				address.setText(null);
				passwd.setText(null);
				dob.setText("yyyy-mm-dd");
				areacode.setText("1");

			}
		});
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnClear.setBounds(482, 466, 150, 35);
		panel_1.add(btnClear);

		errordob = new JLabel("");
		errordob.setForeground(new Color(220, 20, 60));
		errordob.setBounds(15, 445, 371, 20);
		panel_1.add(errordob);

		errorphone = new JLabel("");
		errorphone.setForeground(new Color(220, 20, 60));
		errorphone.setBounds(15, 367, 371, 20);
		panel_1.add(errorphone);

		erroremail = new JLabel("");
		erroremail.setForeground(new Color(220, 20, 60));
		erroremail.setBounds(15, 234, 371, 20);
		panel_1.add(erroremail);

		errorname = new JLabel("");
		errorname.setForeground(new Color(220, 20, 60));
		errorname.setBounds(15, 167, 371, 20);
		panel_1.add(errorname);

		errorpasswd = new JLabel("");
		errorpasswd.setForeground(new Color(220, 20, 60));
		errorpasswd.setBounds(550, 445, 300, 20);
		panel_1.add(errorpasswd);

		errorcode = new JLabel("");
		errorcode.setForeground(new Color(220, 20, 60));
		errorcode.setBounds(505, 234, 371, 20);
		panel_1.add(errorcode);

		erroraddress = new JLabel("");
		erroraddress.setForeground(new Color(220, 20, 60));
		erroraddress.setBounds(505, 160, 371, 20);
		panel_1.add(erroraddress);

		rdstudent = new JRadioButton("Student");
		rdstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdstudent.isSelected()) {
					rdfaculty.setSelected(false);
				}
			}
		});
		rdstudent.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdstudent.setBounds(662, 265, 93, 29);
		panel_1.add(rdstudent);

		rdfaculty = new JRadioButton("Faculty");
		rdfaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdfaculty.isSelected()) {
					rdstudent.setSelected(false);
				}
			}
		});
		rdfaculty.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdfaculty.setBounds(784, 265, 93, 29);
		panel_1.add(rdfaculty);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtnMale.isSelected()) {
					rdbtnFemale.setSelected(false);
					rdbtnOther.setSelected(false);
				}

			}
		});
		rdbtnMale.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnMale.setBounds(662, 323, 93, 29);
		panel_1.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnFemale.isSelected()) {
					rdbtnMale.setSelected(false);
					rdbtnOther.setSelected(false);
				}
			}
		});
		rdbtnFemale.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnFemale.setBounds(784, 322, 93, 29);
		panel_1.add(rdbtnFemale);

		rdbtnOther = new JRadioButton("Other");
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtnOther.isSelected()) {
					rdbtnMale.setSelected(false);
					rdbtnFemale.setSelected(false);
				}
			}
		});
		rdbtnOther.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtnOther.setBounds(721, 359, 93, 29);
		panel_1.add(rdbtnOther);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 128));
		panel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		panel_2.setBackground(new Color(30, 144, 255));
		tabbedPane.addTab("Sign In", null, panel_2, null);

		JLabel lblUserId = new JLabel("User id");
		lblUserId.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblUserId.setForeground(new Color(0, 0, 128));
		lblUserId.setBackground(new Color(30, 144, 255));
		lblUserId.setBounds(440, 100, 137, 30);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblPassword.setBackground(new Color(30, 144, 255));
		lblPassword.setOpaque(true);
		lblPassword.setForeground(new Color(0, 0, 128));
		lblPassword.setBounds(440, 260, 137, 26);
		userid = new JTextField();
		userid.setForeground(Color.BLACK);
		userid.setFont(new Font("Tahoma", Font.PLAIN, 25));
		userid.setBounds(280, 150, 459, 85);

		userid.setColumns(10);

		pwdPass = new JPasswordField();
		pwdPass.setForeground(Color.BLACK);
		pwdPass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pwdPass.setBounds(280, 310, 459, 85);

		panel_2.setLayout(null);
		panel_2.add(pwdPass);
		panel_2.add(userid);
		panel_2.add(lblUserId);
		panel_2.add(lblPassword);
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 128), 3));
		btnLogin.setForeground(new Color(0, 0, 139));
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnLogin.setBounds(360, 430, 300, 50);
		panel_2.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Prateeka\\Desktop\\vehicle-pooling\\image\\usericon.png"));
		label.setBounds(136, 150, 89, 85);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Prateeka\\Desktop\\vehicle-pooling\\image\\pwdicon.png"));
		label_1.setBounds(136, 310, 96, 85);
		panel_2.add(label_1);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					String sql1 = "Select Admin_id,A_passwd from admin where Admin_id=" + userid.getText()
							+ " and A_passwd='" + pwdPass.getText().toString() + "'";
					ResultSet rs1 = stmt.executeQuery(sql1);
					if (rs1.next()) {
						JOptionPane.showMessageDialog(null, "Welcome, Admin");
						Admin admin = new Admin();
						setVisible(false);
						admin.setVisible(true);
					} else {
						String sql = "Select User_id,U_passwd from user where User_id=" + userid.getText()
								+ " and U_passwd='" + pwdPass.getText().toString() + "'";
						ResultSet rs = stmt.executeQuery(sql);
						if (rs.next()) {
							JOptionPane.showMessageDialog(null, "Login successful! Welcome to Namma Ride");
							Layout layout = new Layout();
							layout.setVisible(true);
							setVisible(false);
						} else
							JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
					}

					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}

		});
		contentPane.add(panel);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		panel_3.setBounds(new Rectangle(0, 13, 424, 63));
		panel_3.setBackground(new Color(0, 0, 128));
		panel_3.setForeground(new Color(30, 144, 255));
		panel_3.setBounds(0, 0, 2000, 77);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNammaRide = new JLabel("Namma Ride");
		lblNammaRide.setVerticalTextPosition(SwingConstants.TOP);
		lblNammaRide.setVerticalAlignment(SwingConstants.TOP);
		lblNammaRide.setBorder(new LineBorder(new Color(30, 144, 255), 0));
		lblNammaRide.setIconTextGap(8);
		lblNammaRide.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNammaRide.setHorizontalAlignment(SwingConstants.LEFT);
		lblNammaRide.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 60));
		lblNammaRide.setBackground(new Color(240, 240, 240));
		lblNammaRide.setForeground(new Color(30, 144, 255));
		lblNammaRide.setBounds(500, 0, 318, 78);
		panel_3.add(lblNammaRide);
	}
}