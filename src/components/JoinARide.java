package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JoinARide extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtViewAvailableRides;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public JoinARide() {
		setBackground(Color.RED);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(481, 5, 1, 1);
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		add(panel);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(170, 16, 417, 73);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(170, 186, 417, 67);
		panel.add(textField_1);
		
		JLabel label = new JLabel("Trip-id:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label.setBounds(15, 37, 131, 28);
		panel.add(label);
		
		JLabel label_1 = new JLabel("How did you feel about the ride?");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(15, 118, 308, 56);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Any Suggestions?");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_2.setBounds(15, 204, 215, 28);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Any feedback?");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_3.setBounds(15, 303, 215, 28);
		panel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(170, 303, 417, 67);
		panel.add(textField_2);
		
		JButton button = new JButton("Submit");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		button.setBounds(295, 416, 142, 39);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(68, 72, 828, 525);
		add(panel_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(69, 26, 308, 56);
		panel_1.add(textField_3);
		
		txtViewAvailableRides = new JTextField();
		txtViewAvailableRides.setHorizontalAlignment(SwingConstants.CENTER);
		txtViewAvailableRides.setText("View Available Rides");
		txtViewAvailableRides.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtViewAvailableRides.setColumns(10);
		txtViewAvailableRides.setBounds(217, 128, 417, 67);
		panel_1.add(txtViewAvailableRides);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTo.setBounds(15, 37, 39, 28);
		panel_1.add(lblTo);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblFrom.setBounds(392, 38, 61, 28);
		panel_1.add(lblFrom);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(468, 26, 308, 56);
		panel_1.add(textField_6);

	}
}
