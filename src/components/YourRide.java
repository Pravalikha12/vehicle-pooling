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
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
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
		setBackground(new Color(30, 144, 255));
		setLayout(null);
		
		JButton btnCheckStatus = new JButton("Check Status");
		btnCheckStatus.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnCheckStatus.setForeground(new Color(0, 0, 128));
		btnCheckStatus.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnCheckStatus.setBounds(405, 179, 194, 55);
		add(btnCheckStatus);
		btnCheckStatus.setBackground(Color.WHITE);
		
		JLabel lblTripId = new JLabel("Trip Id");
		lblTripId.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTripId.setBounds(530, 105, 89, 30);
		add(lblTripId);
		lblTripId.setForeground(new Color(0, 0, 128));
		lblTripId.setBackground(Color.YELLOW);
		
		JLabel lblTripStatus = new JLabel("Trip Status");
		lblTripStatus.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTripStatus.setBounds(35, 105, 114, 30);
		add(lblTripStatus);
		lblTripStatus.setForeground(new Color(0, 0, 128));
		lblTripStatus.setBackground(new Color(30, 144, 255));
		
		trip_id = new JTextField();
		trip_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		trip_id.setBounds(634, 91, 286, 60);
		add(trip_id);
		trip_id.setForeground(Color.BLACK);
		trip_id.setBackground(Color.WHITE);
		trip_id.setColumns(10);
		
		trip_status = new JTextField();
		trip_status.setFont(new Font("Tahoma", Font.PLAIN, 18));
		trip_status.setBounds(185, 88, 286, 60);
		add(trip_status);
		trip_status.setForeground(Color.BLACK);
		trip_status.setBackground(Color.WHITE);
		trip_status.setColumns(10);
		
		txtYourOngoingRide = new JTextField();
		txtYourOngoingRide.setForeground(Color.WHITE);
		txtYourOngoingRide.setBounds(0, 0, 971, 42);
		add(txtYourOngoingRide);
		txtYourOngoingRide.setEditable(false);
		txtYourOngoingRide.setBackground(new Color(0, 0, 128));
		txtYourOngoingRide.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		txtYourOngoingRide.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourOngoingRide.setText("Your Ongoing Ride");
		txtYourOngoingRide.setColumns(10);
		
		JButton btnOtherUsersIn = new JButton("Other Users In the Ride");
		btnOtherUsersIn.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		btnOtherUsersIn.setForeground(new Color(0, 0, 128));
		btnOtherUsersIn.setBackground(Color.WHITE);
		btnOtherUsersIn.setBounds(36, 330, 500, 42);
		add(btnOtherUsersIn);
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
						if(rs1.getString("Status").equals("Started"))
						trip_status.setText("The ride is on going");
						else if (rs1.getString("Status").equals("Ended")||rs1.getString("Status").equals("EndedByRider")){
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
		String columnNames[] = {"User Id","First Name","Middle Name","Last Name"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		table = new JTable();
		table.setModel(model); 
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); 
		int statusUserId = 0;
		String Fname = "";
		String Mname = "";
		String Lname = "";
		String statusStatus = "";
		scroll.setBounds(20, 400, 500, 100);		
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
			String sql = "select R_user_id,Status,Fname,Mname,Lname from rides_in,user where rides_in.R_user_id = user.User_id and R_trip_id="+trip_id.getText()
					+" and R_user_id <>"+Login.userid.getText();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()){
				statusUserId = rs.getInt("R_user_id");
				Fname = rs.getString("Fname");
				Mname = rs.getString("Mname");
				Lname = rs.getString("Lname");
				statusStatus = rs.getString("Status");
				if(statusStatus.equals("Started")||statusStatus.equals("EndedByRider")||statusStatus.equals("Ended"))
					model.addRow(new Object[]{statusUserId,Fname,Mname,Lname});
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
