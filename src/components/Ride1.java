package components;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class Ride1 extends JPanel {
	private JTextField txtHelloFromRide;

	/**
	 * Create the panel.
	 */
	public Ride1() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setLayout(null);
		
		txtHelloFromRide = new JTextField();
		txtHelloFromRide.setText("Hello from ride1");
		txtHelloFromRide.setBounds(10, 10, 200, 200);
		add(txtHelloFromRide);
		txtHelloFromRide.setColumns(10);

	}
}
