package components;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//import com.bbn.openmap.MapBean;
//import com.bbn.openmap.layer.shape.ShapeLayer;


public class YourRide extends JPanel {
	private JTextField trip_id;
	private JTextField trip_status;
	private JTable table;

	
	String tripId="";
	private JTextField txtYourOngoingRide;

	/**
	 * Create the panel.
	 */
	public YourRide() {
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setLayout(null);
		
		JButton btnCheckStatus = new JButton("Check Status");
		btnCheckStatus.setBounds(299, 143, 155, 33);
		add(btnCheckStatus);
		btnCheckStatus.setBackground(Color.YELLOW);
		
		JLabel lblTripId = new JLabel("Trip Id");
		lblTripId.setBounds(425, 87, 58, 30);
		add(lblTripId);
		lblTripId.setForeground(Color.WHITE);
		lblTripId.setBackground(Color.YELLOW);
		
		JLabel lblTripStatus = new JLabel("Trip Status");
		lblTripStatus.setBounds(51, 91, 58, 22);
		add(lblTripStatus);
		lblTripStatus.setForeground(Color.WHITE);
		lblTripStatus.setBackground(new Color(255, 255, 0));
		
		trip_id = new JTextField();
		trip_id.setBounds(557, 80, 143, 33);
		add(trip_id);
		trip_id.setForeground(Color.WHITE);
		trip_id.setBackground(Color.YELLOW);
		trip_id.setColumns(10);
		
		trip_status = new JTextField();
		trip_status.setBounds(180, 84, 143, 33);
		add(trip_status);
		trip_status.setForeground(Color.WHITE);
		trip_status.setBackground(Color.YELLOW);
		trip_status.setColumns(10);
		
		txtYourOngoingRide = new JTextField();
		txtYourOngoingRide.setBounds(0, 0, 971, 42);
		add(txtYourOngoingRide);
		txtYourOngoingRide.setEditable(false);
		txtYourOngoingRide.setBackground(Color.YELLOW);
		txtYourOngoingRide.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 20));
		txtYourOngoingRide.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourOngoingRide.setText("Your Ongoing Ride");
		txtYourOngoingRide.setColumns(10);
		btnCheckStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					if(OfferARide.status_trip_id.getText().isEmpty()){
						tripId = JoinARide.requestTripId.getText();
					} 
					else {
						tripId = OfferARide.status_trip_id.getText();
					}
					String sql1 = "Select * from rides_in where R_trip_id = "+tripId+" and R_user_id = "+Login.userid.getText();
					ResultSet rs1 = stmt.executeQuery(sql1);
					while(rs1.next()){
						trip_id.setText(""+rs1.getInt("R_trip_id"));
						if(rs1.getInt("Status")==4)
						trip_status.setText("The ride is on going");
						else if (rs1.getInt("Status")==5){
							trip_status.setText("The ride has ended");
						}
					}
					showTableData();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		});
		
		
		
		

//		setLayout(new BorderLayout(0, 0));
		
//		MapBean mapBean = new MapBean();
//		add(mapBean);
		// setLayout(new BorderLayout(0, 0));
		
		//MapBean mapBean = new MapBean();
		//add(mapBean);
//		Properties shapeLayerProps = new Properties();
//	      shapeLayerProps.put("prettyName", "Political Solid");
//	      shapeLayerProps.put("lineColor", "000000");
//	      shapeLayerProps.put("fillColor", "BDDE83");
//	      shapeLayerProps.put("shapeFile", "resources/map/shape/dcwpo-browse.shp");
//	      shapeLayerProps.put("spatialIndex", "resources/map/shape/dcwpo-browse.ssx");
	 
//	      ShapeLayer shapeLayer = new ShapeLayer();
//	      shapeLayer.setProperties(shapeLayerProps);
//	 
//	      // Add the political layer to the map
//	      mapBean.add(shapeLayer);
//		
		
	}
	public void showTableData(){
		String columnNames[] = {"User Id","Trip Id","Status","Remaining seats"};
//		frame = new JFrame("All Requests");
//		frame.getContentPane().setLayout(new BorderLayout()); 
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model); 
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); 
		int statusUserId = 0;
		int statusTripId = 0;
		int statusStatus = 0;
		int statusRSeats = 0;
		scroll.setBounds(20, 200, 400, 100);
//		add(scroll);
//		this.add(table);
		
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
			String sql = "select * from rides_in where R_trip_id="+trip_id.getText();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()){
				statusUserId = rs.getInt("R_user_id");
				statusTripId = rs.getInt("R_trip_id");
				statusStatus = rs.getInt("Status");
				statusRSeats = rs.getInt("R_seats");
				String s = "requested";
				if(statusUserId != Integer.parseInt(Login.userid.getText())&&(statusStatus==4||statusStatus==5))
					model.addRow(new Object[]{statusUserId,statusTripId,s,statusRSeats});
				i++; 
			}
			if(i <1){
				JOptionPane.showMessageDialog(null, "No other user in the ride","Error",
				JOptionPane.ERROR_MESSAGE);
			}
			if(i ==1){
				System.out.println(i+" Record Found");
			}
			else
			{
				System.out.println(i+" Records Found");
			}
			
			

		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			JOptionPane.ERROR_MESSAGE);
		}
		System.out.println("here");
		this.add(scroll);
		setVisible(true);
//		setSize(200,100);
	}
}
