package components;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

public class Feedback extends JPanel {
	private JTextField trip_id;
	private JTextField suggestion;
	private JTextField review;
	private JComboBox rating;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public Feedback() {
		setBackground(new Color(30, 144, 255));
		setLayout(null);

		trip_id = new JTextField();
		trip_id.setSelectionColor(Color.WHITE);
		trip_id.setForeground(Color.BLACK);
		trip_id.setToolTipText("");
		trip_id.setBackground(Color.WHITE);
		trip_id.setBounds(478, 39, 417, 60);
		add(trip_id);
		trip_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		trip_id.setColumns(10);

		suggestion = new JTextField();
		suggestion.setForeground(Color.BLACK);
		suggestion.setBackground(Color.WHITE);
		suggestion.setBounds(478, 349, 417, 73);
		add(suggestion);
		suggestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		suggestion.setColumns(10);

		JLabel lblTripid = new JLabel("Trip-id");
		lblTripid.setBounds(180, 53, 131, 28);
		add(lblTripid);
		lblTripid.setForeground(new Color(0, 0, 128));
		lblTripid.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JLabel lblHowDidYou = new JLabel("Rate your ride experience");
		lblHowDidYou.setBounds(180, 122, 272, 56);
		add(lblHowDidYou);
		lblHowDidYou.setForeground(new Color(0, 0, 128));
		lblHowDidYou.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JLabel lblAnySuggestions = new JLabel("Any Suggestions?");
		lblAnySuggestions.setBounds(180, 370, 251, 28);
		add(lblAnySuggestions);
		lblAnySuggestions.setForeground(new Color(0, 0, 128));
		lblAnySuggestions.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JLabel lblAnyFeedback = new JLabel("Review");
		lblAnyFeedback.setBounds(184, 235, 215, 28);
		add(lblAnyFeedback);
		lblAnyFeedback.setForeground(new Color(0, 0, 128));
		lblAnyFeedback.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		review = new JTextField();
		review.setForeground(Color.BLACK);
		review.setBackground(Color.WHITE);
		review.setBounds(478, 236, 417, 73);
		add(review);
		review.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		review.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnSubmit.setForeground(new Color(0, 0, 128));
		btnSubmit.setBounds(386, 455, 160, 39);
		add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					int rate=(int)rating.getSelectedItem();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					String sql = "Insert into feedback (F_user_id,F_trip_id,F_admin_id,Rating,Review,Suggestion)"
							+ " values(" + Login.userid.getText() + "," + trip_id.getText() + "," + 101+ ","
							+ rate+ ",'" + review.getText() + "','" + suggestion.getText() + "')";
					
					int rs = stmt.executeUpdate(sql);

					if (rs >0) {
						JOptionPane.showMessageDialog(null, "Feedback submitted. Thank you for your response!");
					}

					else
						JOptionPane.showMessageDialog(null, "Feedback is not submitted. Please try again!");
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
						
		});
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		rating = new JComboBox();
		rating.setForeground(Color.BLACK);
		rating.setBackground(Color.WHITE);
		rating.setBounds(478, 138, 417, 60);
		rating.addItem(5);
		rating.addItem(4);
		rating.addItem(3);
		rating.addItem(2);
		rating.addItem(1);
		rating.setSelectedItem(5);
		add(rating);
		//rating.setModel(new DefaultComboBoxModel(
		//		new String[] { "5 (Excellent)", "4 (Very Good)", "3 (Good)", "2 (Satisfactory)", "1 (Poor)" }));
		rating.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rating.setMaximumRowCount(5);

		JButton btnClear = new JButton("Clear");
		btnClear.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnClear.setForeground(new Color(0, 0, 128));
		btnClear.setBounds(599, 455, 160, 39);
		add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				trip_id.setText(null);
				suggestion.setText(null);
				review.setText(null);

			}
		});
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

	}
}
