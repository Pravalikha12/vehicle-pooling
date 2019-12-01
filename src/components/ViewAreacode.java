package components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class ViewAreacode extends JFrame {

	private JPanel contentPane;

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
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.WHITE);
		panel.setBounds(15, 16, 1246, 623);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Areacode");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(30, 16, 144, 35);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Pincode");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(261, 16, 101, 35);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Area");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(485, 16, 101, 35);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(30, 81, 101, 35);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("2");
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(30, 117, 101, 35);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("3");
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(30, 154, 101, 35);
		panel.add(lblNewLabel_8);

		JLabel label = new JLabel("4");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label.setForeground(Color.WHITE);
		label.setBounds(30, 191, 101, 35);
		panel.add(label);

		JLabel label_1 = new JLabel("6");
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(30, 265, 101, 35);
		panel.add(label_1);

		JLabel label_2 = new JLabel("5");
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(30, 228, 101, 35);
		panel.add(label_2);

		JLabel label_3 = new JLabel("7");
		label_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(30, 302, 101, 35);
		panel.add(label_3);

		JLabel label_4 = new JLabel("8");
		label_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(30, 339, 101, 35);
		panel.add(label_4);

		JLabel label_5 = new JLabel("9");
		label_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(30, 376, 101, 35);
		panel.add(label_5);

		JLabel label_6 = new JLabel("10");
		label_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(30, 413, 101, 35);
		panel.add(label_6);

		JLabel label_7 = new JLabel("11");
		label_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(30, 450, 101, 35);
		panel.add(label_7);

		JLabel label_8 = new JLabel("12");
		label_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(30, 487, 101, 35);
		panel.add(label_8);

		JLabel label_9 = new JLabel("13");
		label_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(30, 524, 101, 35);
		panel.add(label_9);

		JLabel label_10 = new JLabel("560060");
		label_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(261, 81, 101, 35);
		panel.add(label_10);

		JLabel label_11 = new JLabel("560085");
		label_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(261, 117, 101, 35);
		panel.add(label_11);

		JLabel label_12 = new JLabel("560085");
		label_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(261, 154, 101, 35);
		panel.add(label_12);

		JLabel label_13 = new JLabel("560085");
		label_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(261, 191, 101, 35);
		panel.add(label_13);

		JLabel label_14 = new JLabel("560028");
		label_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(261, 228, 101, 35);
		panel.add(label_14);

		JLabel label_15 = new JLabel("560028");
		label_15.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_15.setForeground(Color.WHITE);
		label_15.setBounds(261, 265, 101, 35);
		panel.add(label_15);

		JLabel label_16 = new JLabel("560041");
		label_16.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_16.setForeground(Color.WHITE);
		label_16.setBounds(261, 302, 101, 35);
		panel.add(label_16);

		JLabel label_17 = new JLabel("560041");
		label_17.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_17.setForeground(Color.WHITE);
		label_17.setBounds(261, 339, 101, 35);
		panel.add(label_17);

		JLabel label_18 = new JLabel("560078");
		label_18.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_18.setForeground(Color.WHITE);
		label_18.setBounds(261, 376, 101, 35);
		panel.add(label_18);

		JLabel label_19 = new JLabel("560078");
		label_19.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_19.setForeground(Color.WHITE);
		label_19.setBounds(261, 413, 101, 35);
		panel.add(label_19);

		JLabel label_20 = new JLabel("560078");
		label_20.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_20.setForeground(Color.WHITE);
		label_20.setBounds(261, 450, 101, 35);
		panel.add(label_20);

		JLabel label_21 = new JLabel("560029");
		label_21.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_21.setForeground(Color.WHITE);
		label_21.setBounds(261, 487, 101, 35);
		panel.add(label_21);

		JLabel label_22 = new JLabel("560029");
		label_22.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_22.setForeground(Color.WHITE);
		label_22.setBounds(261, 524, 101, 35);
		panel.add(label_22);

		JLabel lblKengeri = new JLabel("Kengeri");
		lblKengeri.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblKengeri.setForeground(Color.WHITE);
		lblKengeri.setBounds(485, 81, 130, 35);
		panel.add(lblKengeri);

		JLabel lblGirinagar = new JLabel("Girinagar");
		lblGirinagar.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblGirinagar.setForeground(Color.WHITE);
		lblGirinagar.setBounds(485, 116, 130, 35);
		panel.add(lblGirinagar);

		JLabel lblKathriguppe = new JLabel("Kathriguppe");
		lblKathriguppe.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblKathriguppe.setForeground(Color.WHITE);
		lblKathriguppe.setBounds(485, 154, 130, 35);
		panel.add(lblKathriguppe);

		JLabel lblHosakerahalli = new JLabel("Hosakerahalli");
		lblHosakerahalli.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblHosakerahalli.setForeground(Color.WHITE);
		lblHosakerahalli.setBounds(485, 191, 130, 35);
		panel.add(lblHosakerahalli);

		JLabel lblThyagarajNagar = new JLabel("Thyagaraj Nagar");
		lblThyagarajNagar.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblThyagarajNagar.setForeground(Color.WHITE);
		lblThyagarajNagar.setBounds(485, 228, 167, 35);
		panel.add(lblThyagarajNagar);

		JLabel lblYediyur = new JLabel("Yediyur");
		lblYediyur.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblYediyur.setForeground(Color.WHITE);
		lblYediyur.setBounds(485, 265, 130, 35);
		panel.add(lblYediyur);

		JLabel lblJayanagar = new JLabel("Jayanagar");
		lblJayanagar.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblJayanagar.setForeground(Color.WHITE);
		lblJayanagar.setBounds(485, 302, 130, 35);
		panel.add(lblJayanagar);

		JLabel lblTilaknagar = new JLabel("Tilaknagar");
		lblTilaknagar.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTilaknagar.setForeground(Color.WHITE);
		lblTilaknagar.setBounds(485, 339, 130, 35);
		panel.add(lblTilaknagar);

		JLabel lblJPNagar = new JLabel("J P Nagar 3rd Phase");
		lblJPNagar.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblJPNagar.setForeground(Color.WHITE);
		lblJPNagar.setBounds(485, 376, 192, 35);
		panel.add(lblJPNagar);

		JLabel lblTaverekere = new JLabel("Taverekere");
		lblTaverekere.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTaverekere.setForeground(Color.WHITE);
		lblTaverekere.setBounds(485, 487, 130, 35);
		panel.add(lblTaverekere);

		JLabel lblYelachenahalli = new JLabel("Yelachenahalli");
		lblYelachenahalli.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblYelachenahalli.setForeground(Color.WHITE);
		lblYelachenahalli.setBounds(485, 450, 130, 35);
		panel.add(lblYelachenahalli);

		JLabel lblHosurRoad = new JLabel("Hosur Road");
		lblHosurRoad.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblHosurRoad.setForeground(Color.WHITE);
		lblHosurRoad.setBounds(485, 524, 130, 35);
		panel.add(lblHosurRoad);

		JLabel lblKumarswamiLayout = new JLabel("Kumarswami Layout");
		lblKumarswamiLayout.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblKumarswamiLayout.setForeground(Color.WHITE);
		lblKumarswamiLayout.setBounds(485, 413, 192, 35);
		panel.add(lblKumarswamiLayout);

		JLabel label_36 = new JLabel("14");
		label_36.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_36.setForeground(Color.WHITE);
		label_36.setBounds(692, 81, 101, 35);
		panel.add(label_36);

		JLabel label_37 = new JLabel("15");
		label_37.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_37.setForeground(Color.WHITE);
		label_37.setBounds(692, 116, 101, 35);
		panel.add(label_37);

		JLabel label_38 = new JLabel("16");
		label_38.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_38.setForeground(Color.WHITE);
		label_38.setBounds(692, 154, 101, 35);
		panel.add(label_38);

		JLabel label_39 = new JLabel("17");
		label_39.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_39.setForeground(Color.WHITE);
		label_39.setBounds(692, 191, 101, 35);
		panel.add(label_39);

		JLabel label_40 = new JLabel("18");
		label_40.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_40.setForeground(Color.WHITE);
		label_40.setBounds(692, 228, 101, 35);
		panel.add(label_40);

		JLabel label_41 = new JLabel("19");
		label_41.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_41.setForeground(Color.WHITE);
		label_41.setBounds(692, 265, 101, 35);
		panel.add(label_41);

		JLabel label_42 = new JLabel("20");
		label_42.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_42.setForeground(Color.WHITE);
		label_42.setBounds(692, 302, 101, 35);
		panel.add(label_42);

		JLabel label_43 = new JLabel("21");
		label_43.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_43.setForeground(Color.WHITE);
		label_43.setBounds(692, 339, 101, 35);
		panel.add(label_43);

		JLabel label_44 = new JLabel("22");
		label_44.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_44.setForeground(Color.WHITE);
		label_44.setBounds(692, 376, 101, 35);
		panel.add(label_44);

		JLabel label_45 = new JLabel("23");
		label_45.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_45.setForeground(Color.WHITE);
		label_45.setBounds(692, 413, 101, 35);
		panel.add(label_45);

		JLabel label_46 = new JLabel("24");
		label_46.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_46.setForeground(Color.WHITE);
		label_46.setBounds(692, 450, 101, 35);
		panel.add(label_46);

		JLabel label_47 = new JLabel("25");
		label_47.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_47.setForeground(Color.WHITE);
		label_47.setBounds(692, 487, 101, 35);
		panel.add(label_47);

		JLabel label_48 = new JLabel("26");
		label_48.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_48.setForeground(Color.WHITE);
		label_48.setBounds(692, 524, 101, 35);
		panel.add(label_48);

		JLabel label_49 = new JLabel("560029");
		label_49.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_49.setForeground(Color.WHITE);
		label_49.setBounds(897, 81, 101, 35);
		panel.add(label_49);

		JLabel label_50 = new JLabel("560100");
		label_50.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_50.setForeground(Color.WHITE);
		label_50.setBounds(897, 116, 101, 35);
		panel.add(label_50);

		JLabel label_51 = new JLabel("560034");
		label_51.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_51.setForeground(Color.WHITE);
		label_51.setBounds(897, 154, 101, 35);
		panel.add(label_51);

		JLabel label_52 = new JLabel("560034");
		label_52.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_52.setForeground(Color.WHITE);
		label_52.setBounds(897, 191, 101, 35);
		panel.add(label_52);

		JLabel label_53 = new JLabel("560063");
		label_53.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_53.setForeground(Color.WHITE);
		label_53.setBounds(897, 228, 101, 35);
		panel.add(label_53);

		JLabel label_54 = new JLabel("560066");
		label_54.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_54.setForeground(Color.WHITE);
		label_54.setBounds(897, 265, 101, 35);
		panel.add(label_54);

		JLabel label_55 = new JLabel("560036");
		label_55.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_55.setForeground(Color.WHITE);
		label_55.setBounds(897, 302, 101, 35);
		panel.add(label_55);

		JLabel label_56 = new JLabel("560009");
		label_56.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_56.setForeground(Color.WHITE);
		label_56.setBounds(897, 339, 101, 35);
		panel.add(label_56);

		JLabel label_57 = new JLabel("560040");
		label_57.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_57.setForeground(Color.WHITE);
		label_57.setBounds(897, 376, 101, 35);
		panel.add(label_57);

		JLabel label_58 = new JLabel("560040");
		label_58.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_58.setForeground(Color.WHITE);
		label_58.setBounds(897, 413, 101, 35);
		panel.add(label_58);

		JLabel label_59 = new JLabel("560027");
		label_59.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_59.setForeground(Color.WHITE);
		label_59.setBounds(897, 450, 101, 35);
		panel.add(label_59);

		JLabel label_60 = new JLabel("560001");
		label_60.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_60.setForeground(Color.WHITE);
		label_60.setBounds(897, 487, 101, 35);
		panel.add(label_60);

		JLabel label_61 = new JLabel("560001");
		label_61.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_61.setForeground(Color.WHITE);
		label_61.setBounds(897, 524, 101, 35);
		panel.add(label_61);

		JLabel lblBtmLayout = new JLabel("BTM Layout");
		lblBtmLayout.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblBtmLayout.setForeground(Color.WHITE);
		lblBtmLayout.setBounds(1087, 79, 1135, 35);
		panel.add(lblBtmLayout);

		JLabel lblElectronicCity = new JLabel("Electronic City");
		lblElectronicCity.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblElectronicCity.setForeground(Color.WHITE);
		lblElectronicCity.setBounds(1087, 116, 135, 35);
		panel.add(lblElectronicCity);

		JLabel lblAgara = new JLabel("Agara");
		lblAgara.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAgara.setForeground(Color.WHITE);
		lblAgara.setBounds(1087, 154, 135, 35);
		panel.add(lblAgara);

		JLabel lblKoramangala = new JLabel("Koramangala");
		lblKoramangala.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblKoramangala.setForeground(Color.WHITE);
		lblKoramangala.setBounds(1087, 191, 135, 35);
		panel.add(lblKoramangala);

		JLabel lblYelahanka = new JLabel("Yelahanka");
		lblYelahanka.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblYelahanka.setForeground(Color.WHITE);
		lblYelahanka.setBounds(1087, 228, 135, 35);
		panel.add(lblYelahanka);

		JLabel lblWhitefield = new JLabel("Whitefield");
		lblWhitefield.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblWhitefield.setForeground(Color.WHITE);
		lblWhitefield.setBounds(1087, 265, 135, 35);
		panel.add(lblWhitefield);

		JLabel lblKRPuram = new JLabel("K R Puram");
		lblKRPuram.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblKRPuram.setForeground(Color.WHITE);
		lblKRPuram.setBounds(1087, 302, 135, 35);
		panel.add(lblKRPuram);

		JLabel lblMajestickbs = new JLabel("Majestic (KBS)");
		lblMajestickbs.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblMajestickbs.setForeground(Color.WHITE);
		lblMajestickbs.setBounds(1087, 339, 145, 35);
		panel.add(lblMajestickbs);

		JLabel lblVijayanagar = new JLabel("Vijayanagar");
		lblVijayanagar.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblVijayanagar.setForeground(Color.WHITE);
		lblVijayanagar.setBounds(1087, 376, 135, 35);
		panel.add(lblVijayanagar);

		JLabel lblChandraLayout = new JLabel("Chandra Layout");
		lblChandraLayout.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblChandraLayout.setForeground(Color.WHITE);
		lblChandraLayout.setBounds(1087, 413, 145, 35);
		panel.add(lblChandraLayout);

		JLabel lblWilsonGarden = new JLabel("Wilson Garden");
		lblWilsonGarden.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblWilsonGarden.setForeground(Color.WHITE);
		lblWilsonGarden.setBounds(1087, 450, 135, 35);
		panel.add(lblWilsonGarden);

		JLabel lblMGRoad = new JLabel("M G Road");
		lblMGRoad.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblMGRoad.setForeground(Color.WHITE);
		lblMGRoad.setBounds(1087, 487, 135, 35);
		panel.add(lblMGRoad);

		JLabel lblKRCircle = new JLabel("K R Circle");
		lblKRCircle.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblKRCircle.setForeground(Color.WHITE);
		lblKRCircle.setBounds(1087, 524, 135, 35);
		panel.add(lblKRCircle);

		JLabel lblAreacode = new JLabel("Areacode");
		lblAreacode.setForeground(Color.WHITE);
		lblAreacode.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblAreacode.setBounds(692, 16, 144, 35);
		panel.add(lblAreacode);

		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setForeground(Color.WHITE);
		lblPincode.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblPincode.setBounds(897, 16, 101, 35);
		panel.add(lblPincode);

		JLabel label_25 = new JLabel("Area");
		label_25.setForeground(Color.WHITE);
		label_25.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		label_25.setBounds(1092, 16, 118, 35);
		panel.add(label_25);
	}
}
