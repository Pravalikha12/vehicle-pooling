package components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class ViewAreacode extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ViewAreacode frame = new ViewAreacode();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewAreacode() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1316, 791);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 1294, 735);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Areacode");
		label.setBackground(new Color(30, 144, 255));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label.setBounds(15, 16, 144, 35);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Pincode");
		label_1.setBackground(new Color(30, 144, 255));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_1.setBounds(246, 16, 101, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Area");
		label_2.setBackground(new Color(30, 144, 255));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_2.setBounds(470, 16, 101, 35);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("1");
		label_3.setBackground(new Color(30, 144, 255));
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_3.setBounds(15, 81, 101, 35);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("2");
		label_4.setBackground(new Color(30, 144, 255));
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_4.setBounds(15, 117, 101, 35);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("3");
		label_5.setBackground(new Color(30, 144, 255));
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_5.setBounds(15, 154, 101, 35);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("4");
		label_6.setBackground(new Color(30, 144, 255));
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_6.setBounds(15, 191, 101, 35);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("6");
		label_7.setBackground(new Color(30, 144, 255));
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_7.setBounds(15, 265, 101, 35);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("5");
		label_8.setBackground(new Color(30, 144, 255));
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_8.setBounds(15, 228, 101, 35);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("7");
		label_9.setBackground(new Color(30, 144, 255));
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_9.setBounds(15, 302, 101, 35);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("8");
		label_10.setBackground(new Color(30, 144, 255));
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_10.setBounds(15, 339, 101, 35);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("9");
		label_11.setBackground(new Color(30, 144, 255));
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_11.setBounds(15, 376, 101, 35);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("10");
		label_12.setBackground(new Color(30, 144, 255));
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_12.setBounds(15, 413, 101, 35);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("11");
		label_13.setBackground(new Color(30, 144, 255));
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_13.setBounds(15, 450, 101, 35);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("12");
		label_14.setBackground(new Color(30, 144, 255));
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_14.setBounds(15, 487, 101, 35);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("13");
		label_15.setBackground(new Color(30, 144, 255));
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_15.setBounds(15, 524, 101, 35);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("560060");
		label_16.setBackground(new Color(30, 144, 255));
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_16.setBounds(246, 81, 101, 35);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("560085");
		label_17.setBackground(new Color(30, 144, 255));
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_17.setBounds(246, 117, 101, 35);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("560085");
		label_18.setBackground(new Color(30, 144, 255));
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_18.setBounds(246, 154, 101, 35);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("560085");
		label_19.setBackground(new Color(30, 144, 255));
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_19.setBounds(246, 191, 101, 35);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("560028");
		label_20.setBackground(new Color(30, 144, 255));
		label_20.setForeground(Color.WHITE);
		label_20.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_20.setBounds(246, 228, 101, 35);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("560028");
		label_21.setBackground(new Color(30, 144, 255));
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_21.setBounds(246, 265, 101, 35);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("560041");
		label_22.setBackground(new Color(30, 144, 255));
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_22.setBounds(246, 302, 101, 35);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("560041");
		label_23.setBackground(new Color(30, 144, 255));
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_23.setBounds(246, 339, 101, 35);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("560078");
		label_24.setBackground(new Color(30, 144, 255));
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_24.setBounds(246, 376, 101, 35);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("560078");
		label_25.setBackground(new Color(30, 144, 255));
		label_25.setForeground(Color.WHITE);
		label_25.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_25.setBounds(246, 413, 101, 35);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("560078");
		label_26.setBackground(new Color(30, 144, 255));
		label_26.setForeground(Color.WHITE);
		label_26.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_26.setBounds(246, 450, 101, 35);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("560029");
		label_27.setBackground(new Color(30, 144, 255));
		label_27.setForeground(Color.WHITE);
		label_27.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_27.setBounds(246, 487, 101, 35);
		panel.add(label_27);
		
		JLabel label_28 = new JLabel("560029");
		label_28.setBackground(new Color(30, 144, 255));
		label_28.setForeground(Color.WHITE);
		label_28.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_28.setBounds(246, 524, 101, 35);
		panel.add(label_28);
		
		JLabel label_29 = new JLabel("Kengeri");
		label_29.setBackground(new Color(30, 144, 255));
		label_29.setForeground(Color.WHITE);
		label_29.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_29.setBounds(470, 81, 130, 35);
		panel.add(label_29);
		
		JLabel label_30 = new JLabel("Girinagar");
		label_30.setBackground(new Color(30, 144, 255));
		label_30.setForeground(Color.WHITE);
		label_30.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_30.setBounds(470, 116, 130, 35);
		panel.add(label_30);
		
		JLabel label_31 = new JLabel("Kathriguppe");
		label_31.setBackground(new Color(30, 144, 255));
		label_31.setForeground(Color.WHITE);
		label_31.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_31.setBounds(470, 154, 130, 35);
		panel.add(label_31);
		
		JLabel label_32 = new JLabel("Hosakerahalli");
		label_32.setBackground(new Color(30, 144, 255));
		label_32.setForeground(Color.WHITE);
		label_32.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_32.setBounds(470, 191, 130, 35);
		panel.add(label_32);
		
		JLabel label_33 = new JLabel("Thyagaraj Nagar");
		label_33.setBackground(new Color(30, 144, 255));
		label_33.setForeground(Color.WHITE);
		label_33.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_33.setBounds(470, 228, 167, 35);
		panel.add(label_33);
		
		JLabel label_34 = new JLabel("Yediyur");
		label_34.setBackground(new Color(30, 144, 255));
		label_34.setForeground(Color.WHITE);
		label_34.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_34.setBounds(470, 265, 130, 35);
		panel.add(label_34);
		
		JLabel label_35 = new JLabel("Jayanagar");
		label_35.setBackground(new Color(30, 144, 255));
		label_35.setForeground(Color.WHITE);
		label_35.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_35.setBounds(470, 302, 130, 35);
		panel.add(label_35);
		
		JLabel label_36 = new JLabel("Tilaknagar");
		label_36.setBackground(new Color(30, 144, 255));
		label_36.setForeground(Color.WHITE);
		label_36.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_36.setBounds(470, 339, 130, 35);
		panel.add(label_36);
		
		JLabel label_37 = new JLabel("J P Nagar 3rd Phase");
		label_37.setBackground(new Color(30, 144, 255));
		label_37.setForeground(Color.WHITE);
		label_37.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_37.setBounds(470, 376, 192, 35);
		panel.add(label_37);
		
		JLabel label_38 = new JLabel("Taverekere");
		label_38.setBackground(new Color(30, 144, 255));
		label_38.setForeground(Color.WHITE);
		label_38.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_38.setBounds(470, 487, 130, 35);
		panel.add(label_38);
		
		JLabel label_39 = new JLabel("Yelachenahalli");
		label_39.setBackground(new Color(30, 144, 255));
		label_39.setForeground(Color.WHITE);
		label_39.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_39.setBounds(470, 450, 130, 35);
		panel.add(label_39);
		
		JLabel label_40 = new JLabel("Hosur Road");
		label_40.setBackground(new Color(30, 144, 255));
		label_40.setForeground(Color.WHITE);
		label_40.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_40.setBounds(470, 524, 130, 35);
		panel.add(label_40);
		
		JLabel label_41 = new JLabel("Kumarswami Layout");
		label_41.setBackground(new Color(30, 144, 255));
		label_41.setForeground(Color.WHITE);
		label_41.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_41.setBounds(470, 413, 192, 35);
		panel.add(label_41);
		
		JLabel label_42 = new JLabel("14");
		label_42.setBackground(new Color(30, 144, 255));
		label_42.setForeground(Color.WHITE);
		label_42.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_42.setBounds(677, 81, 101, 35);
		panel.add(label_42);
		
		JLabel label_43 = new JLabel("15");
		label_43.setBackground(new Color(30, 144, 255));
		label_43.setForeground(Color.WHITE);
		label_43.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_43.setBounds(677, 116, 101, 35);
		panel.add(label_43);
		
		JLabel label_44 = new JLabel("16");
		label_44.setBackground(new Color(30, 144, 255));
		label_44.setForeground(Color.WHITE);
		label_44.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_44.setBounds(677, 154, 101, 35);
		panel.add(label_44);
		
		JLabel label_45 = new JLabel("17");
		label_45.setBackground(new Color(30, 144, 255));
		label_45.setForeground(Color.WHITE);
		label_45.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_45.setBounds(677, 191, 101, 35);
		panel.add(label_45);
		
		JLabel label_46 = new JLabel("18");
		label_46.setBackground(new Color(30, 144, 255));
		label_46.setForeground(Color.WHITE);
		label_46.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_46.setBounds(677, 228, 101, 35);
		panel.add(label_46);
		
		JLabel label_47 = new JLabel("19");
		label_47.setBackground(new Color(30, 144, 255));
		label_47.setForeground(Color.WHITE);
		label_47.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_47.setBounds(677, 265, 101, 35);
		panel.add(label_47);
		
		JLabel label_48 = new JLabel("20");
		label_48.setBackground(new Color(30, 144, 255));
		label_48.setForeground(Color.WHITE);
		label_48.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_48.setBounds(677, 302, 101, 35);
		panel.add(label_48);
		
		JLabel label_49 = new JLabel("21");
		label_49.setBackground(new Color(30, 144, 255));
		label_49.setForeground(Color.WHITE);
		label_49.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_49.setBounds(677, 339, 101, 35);
		panel.add(label_49);
		
		JLabel label_50 = new JLabel("22");
		label_50.setBackground(new Color(30, 144, 255));
		label_50.setForeground(Color.WHITE);
		label_50.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_50.setBounds(677, 376, 101, 35);
		panel.add(label_50);
		
		JLabel label_51 = new JLabel("23");
		label_51.setBackground(new Color(30, 144, 255));
		label_51.setForeground(Color.WHITE);
		label_51.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_51.setBounds(677, 413, 101, 35);
		panel.add(label_51);
		
		JLabel label_52 = new JLabel("24");
		label_52.setBackground(new Color(30, 144, 255));
		label_52.setForeground(Color.WHITE);
		label_52.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_52.setBounds(677, 450, 101, 35);
		panel.add(label_52);
		
		JLabel label_53 = new JLabel("25");
		label_53.setBackground(new Color(30, 144, 255));
		label_53.setForeground(Color.WHITE);
		label_53.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_53.setBounds(677, 487, 101, 35);
		panel.add(label_53);
		
		JLabel label_54 = new JLabel("26");
		label_54.setBackground(new Color(30, 144, 255));
		label_54.setForeground(Color.WHITE);
		label_54.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_54.setBounds(677, 524, 101, 35);
		panel.add(label_54);
		
		JLabel label_55 = new JLabel("560029");
		label_55.setBackground(new Color(30, 144, 255));
		label_55.setForeground(Color.WHITE);
		label_55.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_55.setBounds(882, 81, 101, 35);
		panel.add(label_55);
		
		JLabel label_56 = new JLabel("560100");
		label_56.setBackground(new Color(30, 144, 255));
		label_56.setForeground(Color.WHITE);
		label_56.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_56.setBounds(882, 116, 101, 35);
		panel.add(label_56);
		
		JLabel label_57 = new JLabel("560034");
		label_57.setBackground(new Color(30, 144, 255));
		label_57.setForeground(Color.WHITE);
		label_57.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_57.setBounds(882, 154, 101, 35);
		panel.add(label_57);
		
		JLabel label_58 = new JLabel("560034");
		label_58.setBackground(new Color(30, 144, 255));
		label_58.setForeground(Color.WHITE);
		label_58.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_58.setBounds(882, 191, 101, 35);
		panel.add(label_58);
		
		JLabel label_59 = new JLabel("560063");
		label_59.setBackground(new Color(30, 144, 255));
		label_59.setForeground(Color.WHITE);
		label_59.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_59.setBounds(882, 228, 101, 35);
		panel.add(label_59);
		
		JLabel label_60 = new JLabel("560066");
		label_60.setBackground(new Color(30, 144, 255));
		label_60.setForeground(Color.WHITE);
		label_60.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_60.setBounds(882, 265, 101, 35);
		panel.add(label_60);
		
		JLabel label_61 = new JLabel("560036");
		label_61.setBackground(new Color(30, 144, 255));
		label_61.setForeground(Color.WHITE);
		label_61.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_61.setBounds(882, 302, 101, 35);
		panel.add(label_61);
		
		JLabel label_62 = new JLabel("560009");
		label_62.setBackground(new Color(30, 144, 255));
		label_62.setForeground(Color.WHITE);
		label_62.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_62.setBounds(882, 339, 101, 35);
		panel.add(label_62);
		
		JLabel label_63 = new JLabel("560040");
		label_63.setBackground(new Color(30, 144, 255));
		label_63.setForeground(Color.WHITE);
		label_63.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_63.setBounds(882, 376, 101, 35);
		panel.add(label_63);
		
		JLabel label_64 = new JLabel("560040");
		label_64.setBackground(new Color(30, 144, 255));
		label_64.setForeground(Color.WHITE);
		label_64.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_64.setBounds(882, 413, 101, 35);
		panel.add(label_64);
		
		JLabel label_65 = new JLabel("560027");
		label_65.setBackground(new Color(30, 144, 255));
		label_65.setForeground(Color.WHITE);
		label_65.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_65.setBounds(882, 450, 101, 35);
		panel.add(label_65);
		
		JLabel label_66 = new JLabel("560001");
		label_66.setBackground(new Color(30, 144, 255));
		label_66.setForeground(Color.WHITE);
		label_66.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_66.setBounds(882, 487, 101, 35);
		panel.add(label_66);
		
		JLabel label_67 = new JLabel("560001");
		label_67.setBackground(new Color(30, 144, 255));
		label_67.setForeground(Color.WHITE);
		label_67.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_67.setBounds(882, 524, 101, 35);
		panel.add(label_67);
		
		JLabel label_68 = new JLabel("BTM Layout");
		label_68.setBackground(new Color(30, 144, 255));
		label_68.setForeground(Color.WHITE);
		label_68.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_68.setBounds(1072, 79, 123, 35);
		panel.add(label_68);
		
		JLabel label_69 = new JLabel("Electronic City");
		label_69.setBackground(new Color(30, 144, 255));
		label_69.setForeground(Color.WHITE);
		label_69.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_69.setBounds(1072, 116, 135, 35);
		panel.add(label_69);
		
		JLabel label_70 = new JLabel("Agara");
		label_70.setBackground(new Color(30, 144, 255));
		label_70.setForeground(Color.WHITE);
		label_70.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_70.setBounds(1072, 154, 135, 35);
		panel.add(label_70);
		
		JLabel label_71 = new JLabel("Koramangala");
		label_71.setBackground(new Color(30, 144, 255));
		label_71.setForeground(Color.WHITE);
		label_71.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_71.setBounds(1072, 191, 135, 35);
		panel.add(label_71);
		
		JLabel label_72 = new JLabel("Yelahanka");
		label_72.setBackground(new Color(30, 144, 255));
		label_72.setForeground(Color.WHITE);
		label_72.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_72.setBounds(1072, 228, 135, 35);
		panel.add(label_72);
		
		JLabel label_73 = new JLabel("Whitefield");
		label_73.setBackground(new Color(30, 144, 255));
		label_73.setForeground(Color.WHITE);
		label_73.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_73.setBounds(1072, 265, 135, 35);
		panel.add(label_73);
		
		JLabel label_74 = new JLabel("K R Puram");
		label_74.setBackground(new Color(30, 144, 255));
		label_74.setForeground(Color.WHITE);
		label_74.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_74.setBounds(1072, 302, 135, 35);
		panel.add(label_74);
		
		JLabel label_75 = new JLabel("Majestic (KBS)");
		label_75.setBackground(new Color(30, 144, 255));
		label_75.setForeground(Color.WHITE);
		label_75.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_75.setBounds(1072, 339, 145, 35);
		panel.add(label_75);
		
		JLabel label_76 = new JLabel("Vijayanagar");
		label_76.setBackground(new Color(30, 144, 255));
		label_76.setForeground(Color.WHITE);
		label_76.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_76.setBounds(1072, 376, 135, 35);
		panel.add(label_76);
		
		JLabel label_77 = new JLabel("Chandra Layout");
		label_77.setBackground(new Color(30, 144, 255));
		label_77.setForeground(Color.WHITE);
		label_77.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_77.setBounds(1072, 413, 145, 35);
		panel.add(label_77);
		
		JLabel label_78 = new JLabel("Wilson Garden");
		label_78.setBackground(new Color(30, 144, 255));
		label_78.setForeground(Color.WHITE);
		label_78.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_78.setBounds(1072, 450, 135, 35);
		panel.add(label_78);
		
		JLabel label_79 = new JLabel("M G Road");
		label_79.setBackground(new Color(30, 144, 255));
		label_79.setForeground(Color.WHITE);
		label_79.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_79.setBounds(1072, 487, 135, 35);
		panel.add(label_79);
		
		JLabel label_80 = new JLabel("K R Circle");
		label_80.setBackground(new Color(30, 144, 255));
		label_80.setForeground(Color.WHITE);
		label_80.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_80.setBounds(1072, 524, 135, 35);
		panel.add(label_80);
		
		JLabel label_81 = new JLabel("Areacode");
		label_81.setBackground(new Color(30, 144, 255));
		label_81.setForeground(Color.WHITE);
		label_81.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_81.setBounds(677, 16, 144, 35);
		panel.add(label_81);
		
		JLabel label_82 = new JLabel("Pincode");
		label_82.setBackground(new Color(30, 144, 255));
		label_82.setForeground(Color.WHITE);
		label_82.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_82.setBounds(882, 16, 101, 35);
		panel.add(label_82);
		
		JLabel label_83 = new JLabel("Area");
		label_83.setBackground(new Color(30, 144, 255));
		label_83.setForeground(Color.WHITE);
		label_83.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_83.setBounds(1077, 16, 118, 35);
		panel.add(label_83);
	}
}
