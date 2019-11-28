package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewProfile extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public ViewProfile() {
		setBackground(Color.RED);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(72, 64, 728, 372);
		add(panel);
		
		JLabel label = new JLabel();
		
		JLabel label_1 = new JLabel();
		label_1.setText("Age");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JLabel label_2 = new JLabel();
		label_2.setText("DOB");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JLabel label_3 = new JLabel();
		label_3.setText("Gender");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		textField = new JTextField();
		
		textField_1 = new JTextField();
		
		textField_2 = new JTextField();
		
		JLabel label_4 = new JLabel();
		label_4.setText("Email");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JLabel label_5 = new JLabel();
		label_5.setText("Phone No");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JLabel label_6 = new JLabel();
		label_6.setText("Name");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		textField_3 = new JTextField();
		
		textField_4 = new JTextField();
		
		textField_5 = new JTextField();
		
		JLabel label_7 = new JLabel();
		label_7.setText("Address");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label_8 = new JLabel();
		label_8.setText("Rating");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel label_9 = new JLabel();
		label_9.setText("Vehicles Owned");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JButton AddVehicle = new JButton();
		AddVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		AddVehicle.setText("Add Vehicle");
		AddVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JLabel label_10 = new JLabel();
		label_10.setText("User ID:");
		label_10.setForeground(SystemColor.menu);
		label_10.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		JLabel label_11 = new JLabel();
		label_11.setText("Role");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		
		textField_6 = new JTextField();
		
		textField_7 = new JTextField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 728, Short.MAX_VALUE)
				.addGap(0, 713, Short.MAX_VALUE)
				.addGap(0, 713, Short.MAX_VALUE)
				.addGap(0, 713, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_5)
												.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
											.addGap(5)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(textField_3)
													.addGap(1))
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
							.addGap(49)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_8)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(AddVehicle, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(2)
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(29)
									.addComponent(label_11)
									.addGap(18)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(249, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 372, Short.MAX_VALUE)
				.addGap(0, 372, Short.MAX_VALUE)
				.addGap(0, 372, Short.MAX_VALUE)
				.addGap(0, 372, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6)
						.addComponent(textField_3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3)
								.addComponent(textField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(label))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11))
							.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
							.addComponent(label_8)
							.addGap(18)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(AddVehicle)
							.addGap(47))))
		);
		panel.setLayout(gl_panel);

	}

}
