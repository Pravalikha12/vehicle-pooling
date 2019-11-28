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
		panel.setBounds(63, 63, 816, 434);
		add(panel);
		
		JLabel label = new JLabel("History");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
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
					.addGap(74)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textField_2)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
						.addComponent(textField_1, Alignment.LEADING))
					.addContainerGap(76, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(367, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(318))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(58))
		);
		panel.setLayout(gl_panel);

	}
}
