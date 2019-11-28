package components;

import com.bbn.openmap.*;
import java.awt.BorderLayout;
import java.util.Properties;

import javax.swing.JPanel;
import com.bbn.openmap.MapBean;
import com.bbn.openmap.layer.shape.ShapeLayer;


public class YourRide extends JPanel {

	/**
	 * Create the panel.
	 */
	public YourRide() {
		setLayout(new BorderLayout(0, 0));
		
		MapBean mapBean = new MapBean();
		add(mapBean);
		Properties shapeLayerProps = new Properties();
	      shapeLayerProps.put("prettyName", "Political Solid");
	      shapeLayerProps.put("lineColor", "000000");
	      shapeLayerProps.put("fillColor", "BDDE83");
	      shapeLayerProps.put("shapeFile", "resources/map/shape/dcwpo-browse.shp");
	      shapeLayerProps.put("spatialIndex", "resources/map/shape/dcwpo-browse.ssx");
	 
	      ShapeLayer shapeLayer = new ShapeLayer();
	      shapeLayer.setProperties(shapeLayerProps);
	 
	      // Add the political layer to the map
	      mapBean.add(shapeLayer);
		
		
	}
}
