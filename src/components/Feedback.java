package components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Feedback extends JPanel {
	private JTextField txtxx;
	private JTextField textField_3;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Feedback() {
		setBackground(Color.RED);
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(-11, 16, 860, -4);
		add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(33, 16, 881, 513);
		add(panel_1);
		
		txtxx = new JTextField();
		txtxx.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtxx.setColumns(10);
		txtxx.setBounds(312, 32, 417, 73);
		panel_1.add(txtxx);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(312, 238, 417, 73);
		panel_1.add(textField_3);
		
		JLabel lblTripid = new JLabel("Trip-id");
		lblTripid.setForeground(Color.WHITE);
		lblTripid.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTripid.setBounds(26, 37, 131, 28);
		panel_1.add(lblTripid);
		
		JLabel lblHowDidYou = new JLabel("Rate your ride experience");
		lblHowDidYou.setForeground(Color.WHITE);
		lblHowDidYou.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblHowDidYou.setBounds(26, 135, 248, 56);
		panel_1.add(lblHowDidYou);
		
		JLabel lblAnySuggestions = new JLabel("Any Suggestions?");
		lblAnySuggestions.setForeground(Color.WHITE);
		lblAnySuggestions.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAnySuggestions.setBounds(26, 251, 157, 28);
		panel_1.add(lblAnySuggestions);
		
		JLabel lblAnyFeedback = new JLabel("Any feedback?");
		lblAnyFeedback.setForeground(Color.WHITE);
		lblAnyFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAnyFeedback.setBounds(26, 343, 215, 28);
		panel_1.add(lblAnyFeedback);
		
		textField_1 = new JTextField(); 
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(312, 341, 417, 73);
		panel_1.add(textField_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSubmit.setBounds(443, 457, 142, 39);
		panel_1.add(btnSubmit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5 (Excellent)", "4 (Very Good)", "3 (Good)", "2 (Satisfactory)", "1  (Poor)"}));
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(312, 137, 417, 73);
		panel_1.add(comboBox);
		
		
        

	}
}
