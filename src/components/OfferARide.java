package components;


import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.TransferHandler.TransferSupport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.TransferHandler;

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class OfferARide extends JPanel {
	private JTextField offerDest;
	private JTextField offerSource;
	private JTextField txtCar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public JFrame frame2;
	private String date;
	public int tid;
	private JDateChooser dateChooser;
	private JSpinner spinner;
	private JComponent editor;
	public static int offerRideToAnotherUser = 0;

	/**
	 * Create the panel.
	 */
	public OfferARide() {
		setLayout(null);
		
		date = "";
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 1023, 611);
		add(panel);
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(21, 36, 957, 538);
		panel.add(panel_3);
		
		offerDest = new JTextField();
		offerDest.setText("Destination");
		offerDest.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		offerDest.setColumns(10);
		offerDest.setBounds(66, 43, 251, 28);
		panel_3.add(offerDest);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblTo.setBounds(15, 42, 36, 28);
		panel_3.add(lblTo);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblFrom.setBounds(15, 82, 48, 20);
		panel_3.add(lblFrom);
		
		offerSource = new JTextField();
		offerSource.setText("Source");
		offerSource.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		offerSource.setColumns(10);
		offerSource.setBounds(66, 82, 251, 28);
		panel_3.add(offerSource);
		
		txtCar = new JTextField();
		txtCar.setText("Car");
		txtCar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtCar.setColumns(10);
		txtCar.setBounds(66, 121, 251, 28);
		panel_3.add(txtCar);
		
		JLabel lblVehicle = new JLabel("Vehicle:");
		lblVehicle.setForeground(Color.WHITE);
		lblVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblVehicle.setBounds(15, 121, 48, 20);
		panel_3.add(lblVehicle);
		
		JButton btnOffer = new JButton("Offer");
		btnOffer.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnOffer.setBounds(365, 226, 115, 29);
		panel_3.add(btnOffer);
		DateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
//		
		
        JButton btnReadRequests = new JButton("Read Requests");
		btnReadRequests.setBounds(365, 60, 115, 45);
		panel_3.add(btnReadRequests);
        System.out.println("IN offer A RIDE");
        btnReadRequests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		try{
					} catch(Exception e){
			System.out.println(e);
		}
	}});


		btnOffer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					tid=(int)(System.currentTimeMillis() & 0xfffffff);
					int capacity = 0;
					int temp = 0;
					date = fmt.format(dateChooser.getDate());
					String time = ((DateEditor) editor).getFormat().format(spinner.getValue()).toString();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
					Statement stmt = con.createStatement();
					String sqlForVid = "Select Vehicle_id from vehicle_lic where V_user_id = '" + Login.userid.getText() + "'";
					ResultSet rsForVid = stmt.executeQuery(sqlForVid);
					while(rsForVid.next()){
						temp = rsForVid.getInt("Vehicle_id");
					}
					
					String sqlForSeats = "Select Capacity from vehicle_desc where Vehicle_id = '"+temp+"'";
					ResultSet rsForSeats = stmt.executeQuery(sqlForSeats);
					while(rsForSeats.next()){
						capacity = rsForSeats.getInt("Capacity");
					}
					capacity -= 1;
					String sql = "Insert into trip(Trip_id,T_date,T_time,Source,Destination,Avail_seats)" + "values(" + (tid) 
							+ ",'"+date+"','"+time+"','"+ offerSource.getText() +"','"+ offerDest.getText()+"',"+ capacity+ ")" ;
					int rs = stmt.executeUpdate(sql);
					if (rs>0)
						JOptionPane.showMessageDialog(null, "Ride offered! Your trip id is "+tid);
					else
						JOptionPane.showMessageDialog(null, "Failed to offer a ride");
					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 271, 341, 181);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTripId = new JLabel("Trip id");
		lblTripId.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblTripId.setBounds(15, 23, 69, 20);
		panel_1.add(lblTripId);
		
		textField = new JTextField();
		textField.setBounds(114, 21, 146, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblVehicleId = new JLabel("Vehicle id");
		lblVehicleId.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblVehicleId.setBounds(15, 72, 84, 20);
		panel_1.add(lblVehicleId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 70, 146, 26);
		panel_1.add(textField_1);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblCapacity.setBounds(15, 120, 69, 20);
		panel_1.add(lblCapacity);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(114, 118, 146, 26);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(478, 271, 363, 181);
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnViewProfile.setBounds(15, 122, 115, 29);
		panel_2.add(btnViewProfile);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAccept.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAccept.setBounds(131, 122, 105, 29);
		panel_2.add(btnAccept);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnReject.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReject.setBounds(239, 122, 97, 29);
		panel_2.add(btnReject);
		
		JLabel lblNewLabel = new JLabel("Carol M Thars has requested a ride");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 16, 264, 44);
		panel_2.add(lblNewLabel);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(66, 159, 251, 28);
		panel_3.add(dateChooser);
		
		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);

		spinner= new JSpinner();
		spinner.setModel(model);
		editor = new JSpinner.DateEditor(spinner,"HH:mm");
		spinner.setEditor(editor);
		spinner.setBounds(66,199,188,45);
		panel_3.add(spinner);
		 
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblDate.setBounds(15, 159, 48, 20);
		panel_3.add(lblDate);
		
		
		
		

	}
}
