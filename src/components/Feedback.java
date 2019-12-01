package components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Feedback extends JPanel {
	private JTextField trip_id;
	private JTextField suggestion;
	private JTextField feedback;

	/**
	 * Create the panel.
	 */
	public Feedback() {
		setBackground(new Color(255, 0, 0));
		setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(-11, 16, 860, -4);
		add(label);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 910, 510);
		add(panel_1);

		trip_id = new JTextField();
		trip_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		trip_id.setColumns(10);
		trip_id.setBounds(312, 37, 417, 60);
		panel_1.add(trip_id);

		suggestion = new JTextField();
		suggestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		suggestion.setColumns(10);
		suggestion.setBounds(312, 227, 417, 73);
		panel_1.add(suggestion);

		JLabel lblTripid = new JLabel("Trip-id");
		lblTripid.setForeground(Color.WHITE);
		lblTripid.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTripid.setBounds(64, 37, 131, 28);
		panel_1.add(lblTripid);

		JLabel lblHowDidYou = new JLabel("Rate your ride experience");
		lblHowDidYou.setForeground(Color.WHITE);
		lblHowDidYou.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblHowDidYou.setBounds(64, 132, 248, 56);
		panel_1.add(lblHowDidYou);

		JLabel lblAnySuggestions = new JLabel("Any Suggestions?");
		lblAnySuggestions.setForeground(Color.WHITE);
		lblAnySuggestions.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAnySuggestions.setBounds(64, 227, 157, 28);
		panel_1.add(lblAnySuggestions);

		JLabel lblAnyFeedback = new JLabel("Any feedback?");
		lblAnyFeedback.setForeground(Color.WHITE);
		lblAnyFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblAnyFeedback.setBounds(64, 322, 215, 28);
		panel_1.add(lblAnyFeedback);

		feedback = new JTextField();
		feedback.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		feedback.setColumns(10);
		feedback.setBounds(312, 322, 417, 73);
		panel_1.add(feedback);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnSubmit.setBounds(312, 425, 160, 39);
		panel_1.add(btnSubmit);

		JComboBox rating = new JComboBox();
		rating.setModel(new DefaultComboBoxModel(
				new String[] { "5 (Excellent)", "4 (Very Good)", "3 (Good)", "2 (Satisfactory)", "1 (Poor)" }));
		rating.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rating.setMaximumRowCount(5);
		rating.setBounds(312, 132, 417, 60);
		panel_1.add(rating);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				trip_id.setText(null);
				suggestion.setText(null);
				feedback.setText(null);

			}
		});
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnClear.setBounds(569, 425, 160, 39);
		panel_1.add(btnClear);

	}
}
