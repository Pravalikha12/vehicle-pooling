package components;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapKit.DefaultProviders;

public class YourRide extends JPanel {

	/**
	 * Create the panel.
	 */
	public YourRide() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(70, 48, 900, 500);
		add(panel);
		panel.setLayout(new BorderLayout());
		panel.setVisible(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(298, 48, 179, 300);
		add(panel_1);
		panel_1.setVisible(true);
		
		
		JXMapKit kit = new JXMapKit();
		kit.setDefaultProvider(org.jdesktop.swingx.JXMapKit.DefaultProviders.OpenStreetMaps);
		kit.setDataProviderCreditShown(true);
		panel.add(kit, BorderLayout.CENTER);
		kit.setVisible(true);
	}
}
