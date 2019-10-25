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
		panel_1.setBounds(33, 41, 828, 525);
		add(panel_1);
		
		txtxx = new JTextField();
		txtxx.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtxx.setColumns(10);
		txtxx.setBounds(170, 16, 417, 73);
		panel_1.add(txtxx);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(170, 186, 417, 67);
		panel_1.add(textField_3);
		
		JLabel lblTripid = new JLabel("Trip-id:");
		lblTripid.setForeground(Color.WHITE);
		lblTripid.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTripid.setBounds(15, 37, 131, 28);
		panel_1.add(lblTripid);
		
		JLabel lblHowDidYou = new JLabel("How did you feel about the ride?");
		lblHowDidYou.setForeground(Color.WHITE);
		lblHowDidYou.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblHowDidYou.setBounds(15, 118, 308, 56);
		panel_1.add(lblHowDidYou);
		
		JLabel lblAnySuggestions = new JLabel("Any Suggestions?");
		lblAnySuggestions.setForeground(Color.WHITE);
		lblAnySuggestions.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAnySuggestions.setBounds(15, 204, 215, 28);
		panel_1.add(lblAnySuggestions);
		
		JLabel lblAnyFeedback = new JLabel("Any feedback?");
		lblAnyFeedback.setForeground(Color.WHITE);
		lblAnyFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAnyFeedback.setBounds(15, 303, 215, 28);
		panel_1.add(lblAnyFeedback);
		
		textField_1 = new JTextField(); 
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(170, 303, 417, 67);
		panel_1.add(textField_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnSubmit.setBounds(295, 416, 142, 39);
		panel_1.add(btnSubmit);
		
		JPanel rating = new JPanel();
		
		rating.setBounds(321, 118, 375, 41);
		panel_1.add(rating);
		rating.setLayout(null);
		
		
        

	}
}
