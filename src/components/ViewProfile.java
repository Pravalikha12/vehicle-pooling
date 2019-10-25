package components;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;

public class ViewProfile extends JPanel {
	private JTextField txtUserId;

	/**
	 * Create the panel.
	 */
	public ViewProfile() {
		setLayout(null);
		
		txtUserId = new JTextField();
		txtUserId.setText("User ID :");
		txtUserId.setBounds(20, 21, 86, 20);
		add(txtUserId);
		txtUserId.setColumns(10);

	}
}
