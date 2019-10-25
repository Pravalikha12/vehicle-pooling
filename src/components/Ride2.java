package components;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ride2 extends JPanel {
	private JTextField txtHelloFromRide;

	/**
	 * Create the panel.
	 */
	public Ride2() {
		setLayout(null);
		
		txtHelloFromRide = new JTextField();
		txtHelloFromRide.setText("Hello from ride2");
		txtHelloFromRide.setBounds(26, 108, 86, 20);
		add(txtHelloFromRide);
		txtHelloFromRide.setColumns(10);

	}

}
