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

public class VehicleReg extends JFrame {

	private JPanel contentPane;
	private JTextField vnumber;
	private JTextField vmodel;
	private JTextField vcapacity;
	private JTextField licenseno;
	private JTextField vcolor;
	private JTextField vtype;
	//private int counter = 100;
	public int vid;
	
	//AtomicInteger count = new AtomicInteger(500);

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
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 979, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Vehicle No");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label.setBounds(93, 120, 93, 20);
		panel.add(label);
		
		vnumber = new JTextField();
		vnumber.setColumns(10);
		vnumber.setBounds(222, 118, 211, 38);
		panel.add(vnumber);
		
		JLabel label_1 = new JLabel("Model");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(93, 252, 93, 20);
		panel.add(label_1);
		
		vmodel = new JTextField();
		vmodel.setColumns(10);
		vmodel.setBounds(222, 234, 211, 38);
		panel.add(vmodel);
		
		JLabel label_2 = new JLabel("Capacity");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_2.setBounds(93, 375, 93, 20);
		panel.add(label_2);
		
		vcapacity = new JTextField();
		vcapacity.setColumns(10);
		vcapacity.setBounds(222, 356, 211, 38);
		panel.add(vcapacity);
		
		JLabel label_3 = new JLabel("License No");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_3.setBounds(524, 121, 107, 20);
		panel.add(label_3);
		
		licenseno = new JTextField();
		licenseno.setColumns(10);
		licenseno.setBounds(661, 118, 211, 38);
		panel.add(licenseno);
		
		JLabel label_4 = new JLabel("Color");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_4.setBounds(524, 243, 93, 20);
		panel.add(label_4);
		
		vcolor = new JTextField();
		vcolor.setColumns(10);
		vcolor.setBounds(661, 234, 211, 38);
		panel.add(vcolor);
		
		JLabel label_5 = new JLabel("Type");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_5.setBounds(524, 365, 93, 20);
		panel.add(label_5);
		
		vtype = new JTextField();
		vtype.setColumns(10);
		vtype.setBounds(661, 362, 211, 38);
		panel.add(vtype);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					vid = (int)(System.currentTimeMillis() & 0xfffffff);
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					
					
					
					String sql = "Insert into vehicle_desc (Vehicle_id,Vehicle_no,Model,Color,Type,Capacity)"
							+ " values(" + vid + ",'" + vnumber.getText() + "','" + vmodel.getText() + "','"
							+ vcolor.getText() + "','" + vtype.getText() + "'," + vcapacity.getText() + ")";
					
					String sql1 = "Insert into vehicle_lic(Vehicle_id,V_user_id, License_no)" + " values(" + vid + ","
							+ Login.userid.getText() + ",'"+ licenseno.getText() + "')" ; 
					
					int rs = stmt.executeUpdate(sql);
					int rs1 = stmt.executeUpdate(sql1);
					
					if (rs > 0 && rs1>0) {
						JOptionPane.showMessageDialog(null, "Vehicle Registration successful! Vehicle id is "+vid);
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

			}
		});

				
		btnRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnRegister.setBounds(433, 506, 151, 38);
		panel.add(btnRegister);
	}

}
