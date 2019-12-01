package components;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Dashboard extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Dashboard() {
		setBackground(Color.RED);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 910, 510);
		add(panel);
		
		JLabel History = new JLabel("History");
		History.setForeground(Color.WHITE);
		History.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		
		textField = new JTextField();
		textField.setText("Trip1");
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("Trip2");
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("Trip3");
		textField_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(116)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, 640, 640, 640)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_1, Alignment.LEADING)
									.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(383)
							.addComponent(History, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(154, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addComponent(History, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(107))
		);
		panel.setLayout(gl_panel);

	}
}
