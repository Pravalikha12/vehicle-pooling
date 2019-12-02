package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class VehicleReg extends JFrame {

	private JPanel contentPane;
	private JTextField vnumber;
	private JTextField vmodel;
	private JTextField vcapacity;
	private JTextField licenseno;
	private JTextField vcolor;
	private JLabel errorvno;
	private JLabel errorlicense;
	private JLabel errorcapacity;

	private String vno;
	private int vcap;
	private String licno;
	private String vehicletype;

	public int vid;
	private JButton btnClear;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					VehicleReg frame = new VehicleReg();
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
	public VehicleReg() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1193, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel label = new JLabel("Vehicle No");
		label.setBackground(new Color(240, 240, 240));
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label.setBounds(138, 128, 130, 40);
		panel.add(label);

		vnumber = new JTextField();
		vnumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if (vnumber.getText().length() != 10) {
					errorvno.setText("Invalid Vehicle Registration Number");
				}

			}
		});

		vnumber.setColumns(10);
		vnumber.setBounds(318, 120, 230, 50);
		panel.add(vnumber);

		JLabel label_1 = new JLabel("Model");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label_1.setBounds(138, 258, 130, 40);
		panel.add(label_1);

		vmodel = new JTextField();
		vmodel.setColumns(10);
		vmodel.setBounds(318, 250, 230, 50);
		panel.add(vmodel);

		JLabel label_2 = new JLabel("Capacity");
		label_2.setForeground(new Color(0, 0, 128));
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label_2.setBounds(138, 388, 130, 40);
		panel.add(label_2);

		vcapacity = new JTextField();
		vcapacity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if (Integer.parseInt(vcapacity.getText()) < 2 || Integer.parseInt(vcapacity.getText()) > 8) {
					errorcapacity.setText("Capacity should be between 2 and 8");
				}
			}
		});
		vcapacity.setColumns(10);
		vcapacity.setBounds(318, 380, 230, 50);
		panel.add(vcapacity);

		JLabel label_3 = new JLabel("License No");
		label_3.setForeground(new Color(0, 0, 128));
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label_3.setBounds(684, 128, 130, 40);
		panel.add(label_3);

		licenseno = new JTextField();
		licenseno.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if (licenseno.getText().length() != 15) {
					errorlicense.setText("Invalid License Number");
				}

			}
		});
		licenseno.setColumns(10);
		licenseno.setBounds(902, 120, 230, 50);
		panel.add(licenseno);

		JLabel label_4 = new JLabel("Color");
		label_4.setForeground(new Color(0, 0, 128));
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label_4.setBounds(684, 258, 130, 40);
		panel.add(label_4);

		vcolor = new JTextField();
		vcolor.setColumns(10);
		vcolor.setBounds(902, 250, 230, 50);
		panel.add(vcolor);

		JLabel label_5 = new JLabel("Type");
		label_5.setForeground(new Color(0, 0, 128));
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		label_5.setBounds(684, 388, 130, 40);
		panel.add(label_5);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnRegister.setForeground(new Color(0, 0, 128));
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					boolean flag = true;
					vno = vnumber.getText();
					if (vno.length() != 10) {
						flag = false;
					}

					vcap = Integer.parseInt(vcapacity.getText());
					if (vcap < 2 || vcap > 8) {
						flag = false;
					}

					licno = licenseno.getText();
					if (licno.length() != 15) {
						flag = false;
					}

					vehicletype = null;
					if (rdbtn2.isSelected()) {
						vehicletype = "2 Wheeler";
					}
					if (rdbtn4.isSelected()) {
						vehicletype = "4 Wheeler";
					}

					vid = (int) (System.currentTimeMillis() & 0xfffffff);
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();

					String sql = "Insert into vehicle_desc (Vehicle_id,Vehicle_no,Model,Color,Type,Capacity)"
							+ " values(" + vid + ",'" + vno + "','" + vmodel.getText() + "','" + vcolor.getText()
							+ "','" + vehicletype + "'," + vcap + ")";

					String sql1 = "Insert into vehicle_lic(Vehicle_id,V_user_id, License_no)" + " values(" + vid + ","
							+ Login.userid.getText() + ",'" + licno + "')";

					int rs = stmt.executeUpdate(sql);
					int rs1 = stmt.executeUpdate(sql1);

					if (rs > 0 && rs1 > 0 && flag == true) {
						JOptionPane.showMessageDialog(null, "Vehicle Registration successful! Vehicle id is " + vid);
						Layout layout = new Layout();
						layout.setVisible(true);
						setVisible(false);
					}

					else
						JOptionPane.showMessageDialog(null, "Registration unsuccessful, try again!");
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
				if (vnumber.getText().isEmpty()) {
					errorvno.setText("Please enter vehicle number  Eg. KA51MD4173");
				}
				if (licenseno.getText().isEmpty()) {
					errorlicense.setText("Please enter license number  Eg. KL152017002C251");
				}

			}
		});

		btnRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnRegister.setBounds(459, 529, 200, 50);
		panel.add(btnRegister);

		errorvno = new JLabel("");
		errorvno.setForeground(new Color(220, 20, 60));
		errorvno.setBackground(Color.WHITE);
		errorvno.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		errorvno.setBounds(138, 186, 410, 48);
		panel.add(errorvno);

		errorlicense = new JLabel("");
		errorlicense.setForeground(new Color(220, 20, 60));
		errorlicense.setBackground(Color.WHITE);
		errorlicense.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		errorlicense.setBounds(684, 186, 448, 48);
		panel.add(errorlicense);

		errorcapacity = new JLabel("");
		errorcapacity.setForeground(new Color(220, 20, 60));
		errorcapacity.setBackground(Color.WHITE);
		errorcapacity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		errorcapacity.setBounds(138, 452, 410, 48);
		panel.add(errorcapacity);

		btnClear = new JButton("Clear");
		btnClear.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnClear.setForeground(new Color(0, 0, 128));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				vnumber.setText(null);
				vmodel.setText(null);
				vcapacity.setText(null);
				licenseno.setText(null);
				vcolor.setText(null);

			}
		});
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnClear.setBounds(774, 529, 200, 50);
		panel.add(btnClear);

		rdbtn2 = new JRadioButton("2 Wheeler");
		rdbtn2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtn2.isSelected()) {
					rdbtn4.setSelected(false);
				}

			}
		});
		rdbtn2.setBounds(885, 392, 110, 40);
		panel.add(rdbtn2);

		rdbtn4 = new JRadioButton("4 Wheeler");
		rdbtn4.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtn4.isSelected()) {
					rdbtn2.setSelected(false);
				}
			}
		});
		rdbtn4.setBounds(1022, 392, 110, 40);
		panel.add(rdbtn4);
	}
}
