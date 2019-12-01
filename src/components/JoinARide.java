package components;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.TransferHandler;
import javax.swing.TransferHandler.TransferSupport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import org.jgroups.*;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JoinARide extends JPanel {
	private JTextField JoinDest;
	private JTextField JoinSource;
	private JFrame frame;
	private JFrame frame20;
	private static JTable table;
	private String[] columnNames = {"Trip_id","Trip_time","Trip_date", "Source", "Destination", "Available_seats"};
	LocalDate today = LocalDate.now();
	private JTextField requestTripId;
	/**
	 * Create the panel.
	 */
	public JoinARide() {
		setBackground(Color.RED);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(59, 16, 704, 525);
		add(panel_1);
		
		JoinDest = new JTextField();
		JoinDest.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		JoinDest.setColumns(10);
		JoinDest.setBounds(222, 75, 417, 81);
		panel_1.add(JoinDest);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblTo.setBounds(396, 31, 39, 28);
		panel_1.add(lblTo);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblFrom.setBounds(396, 188, 61, 28);
		panel_1.add(lblFrom);
		
		JoinSource = new JTextField();
		JoinSource.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		JoinSource.setColumns(10);
		JoinSource.setBounds(222, 242, 417, 81);
		panel_1.add(JoinSource);
		
		JButton btnViewAvailableRides = new JButton("View Available Rides");
		btnViewAvailableRides.setBounds(222, 364, 417, 39);
		panel_1.add(btnViewAvailableRides);
		
		JLabel lblEnterTheTrip = new JLabel("Enter the trip Id ");
		lblEnterTheTrip.setForeground(Color.WHITE);
		lblEnterTheTrip.setBounds(79, 430, 110, 14);
		panel_1.add(lblEnterTheTrip);
		
		requestTripId = new JTextField();
		requestTripId.setBounds(201, 427, 86, 20);
		panel_1.add(requestTripId);
		requestTripId.setColumns(10);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.setBounds(325, 426, 89, 23);
		panel_1.add(btnRequest);
		System.out.println("before button request");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println("after button request");

					frame20 = new JFrame();
					frame20.setVisible(true);
					frame20.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame20.setVisible(true);
			        frame20.setSize(500, 300);
			        final DefaultListModel listModel = new DefaultListModel();
			        final JList panel7 = new JList(listModel);
			        panel7.setBackground(new Color(128, 0, 40));
			        panel7.setForeground(new Color(240, 240, 240));
			        frame20.add(panel7);
					System.out.println("before try");

					try{
						System.out.println("in try");

						System.setProperty("java.net.preferIPv4Stack", "true");
				        final JChannel channel = new JChannel("udp.xml");
				        channel.connect("networkclipboard");
				        channel.setReceiver(new ReceiverAdapter() {
				            @Override
				            public void viewAccepted(View newView) {
				                frame20.setTitle("Network Clipboard - " + channel.getAddress());
				            }

				            @Override
				            public void receive(Message msg) {
				                listModel.addElement(msg.getObject());
				            }
				        });
				        
				        panel7.setTransferHandler(new TransferHandler() {
				            @Override
				            public boolean importData(JComponent comp, Transferable t) {
				                DataFlavor[] transferDataFlavors = t.getTransferDataFlavors();
				                for (DataFlavor flavor : transferDataFlavors) {
				                    try {
//				                        Object data = t.getTransferData(flavor);
//				                        if (data instanceof Serializable) {
//				                            Serializable serializable = (Serializable) data;
				                            Message msg = new Message();
				                            msg.setObject(requestTripId.getText().toString());
				                            channel.send(msg);
				                        //}
				                    } catch (Exception e) {
				                        e.printStackTrace();
				                    }
				                }
				                return super.importData(comp, t);
				            }

				            @Override
				            public boolean canImport(TransferSupport support) {
				                return true;
				            }

				            @Override
				            public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
				                return true;
				            }

				        });
//				        channel.close();
					} catch(Exception e){
						System.out.println(e);
					}


				} catch (Exception e) {
					System.out.println(e);
				}

			}
		});
		
		
		
		
		
		btnViewAvailableRides.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					showTableData();

				} catch (Exception e) {
					System.out.println(e);
				}
			}

		});

	}
	
	
	public void showTableData(){
		frame = new JFrame("All Available Rides");
		frame.getContentPane().setLayout(new BorderLayout()); 
		//TableModel tm = new TableModel();
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
		//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
		//table = new JTable(model);
		table = new JTable();
		table.setModel(model); 
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setHorizontalScrollBarPolicy(
		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
		ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); 
		int trip_id = 0;
		String t_time = "";
		String t_date;
		String source = "";
		String destination = "";
		String se = JoinSource.getText();
		String dest = JoinDest.getText();
		int avail_seats = 0;
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclepoolingdb", "root","");
			String sql = "select * from `trip` where Source = '"+se+"' and Destination = '"+dest+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i =0;
			while(rs.next()){
				t_time = rs.getString("T_time");
				t_date = rs.getString("T_date");
				source = rs.getString("Source");
				destination = rs.getString("Destination"); 
				trip_id = rs.getInt("Trip_id");
				avail_seats = rs.getInt("Avail_seats");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
				formatter = formatter.withLocale(Locale.ENGLISH); 
				LocalDate date = LocalDate.parse(t_date, formatter);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				String c_date = formatter.format(now);
				String c_time = dtf.format(now);
				String trip_time = t_date+"-"+t_time;
				String curr_time = c_date+"-"+c_time;
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("uuuu-MM-dd-HH:mm:ss");
				formatter2 = formatter2.withLocale(Locale.ENGLISH);				

				LocalDateTime date1 = LocalDateTime.parse(trip_time, formatter2);
				LocalDateTime date2 = LocalDateTime.parse(curr_time, formatter2);
				
				if(date1.isAfter(date2))
					model.addRow(new Object[]{trip_id,t_time,t_date,source,destination,avail_seats});
				i++; 
			}
			if(i <1){
				JOptionPane.showMessageDialog(null, "No Available Rides, please try again after sometime","Error",
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
		frame.getContentPane().add(scroll);
		frame.setVisible(true);
		frame.setSize(800,400);
	}
}
