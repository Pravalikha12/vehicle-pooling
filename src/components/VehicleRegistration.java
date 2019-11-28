package components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JTextField;
import javax.swing.JButton;


public class VehicleRegistration extends JPanel {
	private JTextField VColor;
	private JTextField VType;
	private JTextField License;
	private JTextField VNumber;
	private JTextField VModel;
	private JTextField VCapacity;
	private int counter = 500;

	AtomicInteger count = new AtomicInteger();
	/**
	 * Create the panel.
	 */
	public VehicleRegistration() {
		setBackground(Color.RED);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(50, 53, 856, 472);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblVehicelNo = new JLabel("Vehicle No");
		lblVehicelNo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblVehicelNo.setForeground(Color.WHITE);
		lblVehicelNo.setBounds(35, 83, 93, 20);
		panel.add(lblVehicelNo);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(Color.WHITE);
		lblModel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblModel.setBounds(35, 188, 93, 20);
		panel.add(lblModel);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblColor.setBounds(453, 188, 93, 20);
		panel.add(lblColor);
		
		VColor = new JTextField();
		VColor.setColumns(10);
		VColor.setBounds(582, 186, 211, 38);
		panel.add(VColor);
		
		VType = new JTextField();
		VType.setColumns(10);
		VType.setBounds(582, 285, 211, 38);
		panel.add(VType);
		
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblType.setBounds(453, 291, 93, 20);
		panel.add(lblType);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setForeground(Color.WHITE);
		lblCapacity.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblCapacity.setBounds(35, 291, 93, 20);
		panel.add(lblCapacity);
		
		JLabel lblLicenseNo = new JLabel("License No");
		lblLicenseNo.setForeground(Color.WHITE);
		lblLicenseNo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblLicenseNo.setBounds(453, 84, 107, 20);
		panel.add(lblLicenseNo);
		
		License = new JTextField();
		License.setColumns(10);
		License.setBounds(582, 75, 211, 38);
		panel.add(License);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					counter = count.incrementAndGet();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					
					String sql = "Insert into vehicle_lic(Vehicle_id,V_user_id, License_no)" + "values(" + counter + ","
							+ License.getText() + ")" ; 
					String sql1 = "Insert into vehicle_desc (Vehicle_id,Vehicle_no,Model,Color,Type,Capacity)"
							+ " values(" + counter + ",'" + VNumber.getText() + "','" + VModel.getText() + "','"
							+ VColor.getText() + "','" + VType.getText() + "','" + VCapacity.getText() + ")";
					
					//int rs = stmt.executeUpdate(sql);
					int rs1 = stmt.executeUpdate(sql1);

					if (rs1 > 0) {
						JOptionPane.showMessageDialog(null, "Vehicle Registration successful!");
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

		
		
		
		
		
		btnRegister.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnRegister.setBounds(352, 400, 115, 29);
		panel.add(btnRegister);
		
		VNumber = new JTextField();
		VNumber.setColumns(10);
		VNumber.setBounds(146, 76, 211, 38);
		panel.add(VNumber);
		
		VModel = new JTextField();
		VModel.setColumns(10);
		VModel.setBounds(146, 186, 211, 38);
		panel.add(VModel);
		
		VCapacity = new JTextField();
		VCapacity.setColumns(10);
		VCapacity.setBounds(143, 285, 211, 38);
		panel.add(VCapacity);

	}
}
