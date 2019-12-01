package components;


import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.Timer;

import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;

public class OfferARide extends JPanel {
	private JTextField offerDest;
	private JTextField offerSource;
	private JTextField vehicle;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String date;
	public int tid;
	private JDateChooser dateChooser;
	private JSpinner spinner;
	private JComponent editor;

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
		panel.setBounds(0, 0, 910, 510);
		add(panel);
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 0, 910, 510);
		panel.add(panel_3);
		
		offerDest = new JTextField();
		offerDest.setText("Destination");
		offerDest.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		offerDest.setColumns(10);
		offerDest.setBounds(145, 42, 251, 40);
		panel_3.add(offerDest);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblTo.setBounds(38, 44, 70, 28);
		panel_3.add(lblTo);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblFrom.setBounds(38, 118, 70, 20);
		panel_3.add(lblFrom);
		
		offerSource = new JTextField();
		offerSource.setText("Source");
		offerSource.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		offerSource.setColumns(10);
		offerSource.setBounds(145, 111, 251, 40);
		panel_3.add(offerSource);
		
		vehicle = new JTextField();
		vehicle.setText("Car");
		vehicle.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		vehicle.setColumns(10);
		vehicle.setBounds(145, 186, 251, 40);
		panel_3.add(vehicle);
		
		JLabel lblVehicle = new JLabel("Vehicle");
		lblVehicle.setForeground(Color.WHITE);
		lblVehicle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblVehicle.setBounds(38, 193, 70, 20);
		panel_3.add(lblVehicle);
		
		JButton btnOffer = new JButton("Offer");
		btnOffer.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnOffer.setBounds(397, 242, 120, 35);
		panel_3.add(btnOffer);
		DateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

		btnOffer.addActionListener(new ActionListener() {
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
		panel_1.setBounds(38, 287, 363, 166);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTripId = new JLabel("Trip id");
		lblTripId.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblTripId.setBounds(30, 23, 69, 20);
		panel_1.add(lblTripId);
		
		textField = new JTextField();
		textField.setBounds(144, 21, 146, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblVehicleId = new JLabel("Vehicle id");
		lblVehicleId.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblVehicleId.setBounds(28, 72, 84, 20);
		panel_1.add(lblVehicleId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 70, 146, 26);
		panel_1.add(textField_1);
		
		JLabel lblCapacity = new JLabel("Capacity");
		lblCapacity.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblCapacity.setBounds(30, 120, 69, 20);
		panel_1.add(lblCapacity);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 118, 146, 26);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(509, 287, 363, 166);
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnViewProfile = new JButton("View Profile");
		btnViewProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnViewProfile.setBounds(4, 100, 115, 29);
		panel_2.add(btnViewProfile);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAccept.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAccept.setBounds(123, 100, 115, 29);
		panel_2.add(btnAccept);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReject.setBounds(242, 100, 115, 29);
		panel_2.add(btnReject);
		
		JLabel lblNewLabel = new JLabel("Carol M Thars has requested a ride");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 16, 264, 44);
		panel_2.add(lblNewLabel);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(621, 54, 251, 63);
		panel_3.add(dateChooser);
		
		SpinnerDateModel model = new SpinnerDateModel();
		model.setCalendarField(Calendar.MINUTE);

		spinner= new JSpinner();
		spinner.setModel(model);
		 editor = new JSpinner.DateEditor(spinner,"HH:mm");
		 spinner.setEditor(editor);
		 spinner.setBounds(621,152,251,63);
		 panel_3.add(spinner);
		 
		 

		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblDate.setBounds(509, 76, 48, 20);
		panel_3.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTime.setBounds(509, 171, 48, 20);
		panel_3.add(lblTime);

	}
}
