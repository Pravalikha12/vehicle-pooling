package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToNamma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 940, 504);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("View Users");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root",
							"");
					Statement stmt = con.createStatement();
					/*String sql = "Select User_id,U_passwd from user where User_id='" + userid.getText()
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
					*/
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}
				
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton.setBounds(200, 125, 250, 50);
		panel.add(btnNewButton);
		
		JButton btnViewRides = new JButton("View Rides");
		btnViewRides.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnViewRides.setBounds(200, 212, 250, 50);
		panel.add(btnViewRides);
		
		JButton btnDeleteUsers = new JButton("Delete Users");
		btnDeleteUsers.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnDeleteUsers.setBounds(200, 377, 250, 50);
		panel.add(btnDeleteUsers);
		
		JButton btnViewFeedback = new JButton("View Feedbacks");
		btnViewFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnViewFeedback.setBounds(200, 295, 250, 50);
		panel.add(btnViewFeedback);
		
		JLabel lblAdmin = new JLabel("");
		lblAdmin.setIcon(new ImageIcon("C:\\Users\\Prateeka\\Desktop\\JavaDBMS\\adminImg.png"));
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.setBounds(500, 125, 395, 310);
		panel.add(lblAdmin);
		
		txtWelcomeToNamma = new JTextField();
		txtWelcomeToNamma.setBackground(Color.YELLOW);
		txtWelcomeToNamma.setEditable(false);
		txtWelcomeToNamma.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		txtWelcomeToNamma.setText("Welcome to Namma Ride");
		txtWelcomeToNamma.setBounds(279, 38, 500, 50);
		panel.add(txtWelcomeToNamma);
		txtWelcomeToNamma.setColumns(10);
	}
}
