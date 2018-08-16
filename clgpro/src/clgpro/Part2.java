package clgpro;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class Part2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JLabel lblNewLabel_2;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JLabel lblNewLabel_4;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Part2 frame = new Part2();
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
	public Part2() {
		setBounds(100, 100, 1378, 1057);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("BOOK NAME\r\n\r\n");
		lblNewLabel.setBounds(10, 69, 68, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("AUTHOR NAME\r\n");
		lblNewLabel_1.setBounds(543, 69, 143, 14);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(10, 96, 404, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 127, 404, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("1\r\n");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(0, 99, 8, 14);
		contentPane.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 158, 404, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 189, 404, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 220, 404, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(10, 251, 404, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(10, 282, 404, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(10, 313, 404, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(10, 344, 404, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(10, 375, 404, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(10, 406, 404, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(10, 437, 404, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(10, 468, 404, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setBounds(10, 499, 404, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setBounds(10, 530, 404, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setBounds(10, 561, 404, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setBounds(10, 592, 404, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);

		textField_17 = new JTextField();
		textField_17.setBounds(10, 623, 404, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);

		textField_18 = new JTextField();
		textField_18.setBounds(10, 654, 404, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);

		JLabel label = new JLabel("2\r\n");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(0, 130, 8, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("3");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setBounds(0, 161, 8, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("4");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setBounds(0, 192, 8, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("5");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setBounds(0, 223, 8, 14);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("6");
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setBounds(0, 254, 8, 14);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("7");
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setBounds(0, 285, 8, 14);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("8");
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setBounds(0, 316, 8, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("9");
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setBounds(0, 347, 8, 14);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("10\r\n");
		label_8.setVerticalAlignment(SwingConstants.TOP);
		label_8.setBounds(0, 378, 12, 14);
		contentPane.add(label_8);

		JLabel label_9 = new JLabel("11\r\n");
		label_9.setVerticalAlignment(SwingConstants.TOP);
		label_9.setBounds(0, 409, 12, 14);
		contentPane.add(label_9);

		JLabel label_10 = new JLabel("12\r\n");
		label_10.setVerticalAlignment(SwingConstants.TOP);
		label_10.setBounds(0, 440, 8, 14);
		contentPane.add(label_10);

		JLabel label_11 = new JLabel("13\r\n");
		label_11.setVerticalAlignment(SwingConstants.TOP);
		label_11.setBounds(0, 471, 12, 14);
		contentPane.add(label_11);

		JLabel label_12 = new JLabel("14\r\n");
		label_12.setVerticalAlignment(SwingConstants.TOP);
		label_12.setBounds(0, 502, 12, 14);
		contentPane.add(label_12);

		JLabel label_13 = new JLabel("15\r\n");
		label_13.setVerticalAlignment(SwingConstants.TOP);
		label_13.setBounds(0, 533, 12, 14);
		contentPane.add(label_13);

		JLabel label_14 = new JLabel("16\r\n");
		label_14.setVerticalAlignment(SwingConstants.TOP);
		label_14.setBounds(0, 564, 12, 14);
		contentPane.add(label_14);

		JLabel label_15 = new JLabel("17\r\n");
		label_15.setVerticalAlignment(SwingConstants.TOP);
		label_15.setBounds(0, 595, 12, 14);
		contentPane.add(label_15);

		JLabel label_16 = new JLabel("18\r\n");
		label_16.setVerticalAlignment(SwingConstants.TOP);
		label_16.setBounds(0, 626, 12, 14);
		contentPane.add(label_16);

		JLabel label_17 = new JLabel("19\r\n");
		label_17.setVerticalAlignment(SwingConstants.TOP);
		label_17.setBounds(0, 657, 12, 14);
		contentPane.add(label_17);

		textField_19 = new JTextField();
		textField_19.setBounds(10, 685, 404, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);

		JLabel label_18 = new JLabel("20\r\n");
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setBounds(0, 688, 12, 14);
		contentPane.add(label_18);

		textField_20 = new JTextField();
		textField_20.setBounds(424, 96, 577, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(424, 127, 577, 20);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(424, 158, 577, 20);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(424, 189, 577, 20);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(424, 220, 577, 20);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(424, 251, 577, 20);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(424, 282, 577, 20);
		contentPane.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(424, 313, 577, 20);
		contentPane.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(424, 344, 577, 20);
		contentPane.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(424, 375, 577, 20);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(424, 406, 577, 20);
		contentPane.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(424, 437, 577, 20);
		contentPane.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(424, 468, 577, 20);
		contentPane.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(424, 499, 577, 20);
		contentPane.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(424, 530, 577, 20);
		contentPane.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(424, 561, 577, 20);
		contentPane.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(424, 592, 577, 20);
		contentPane.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(424, 623, 577, 20);
		contentPane.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(424, 654, 584, 20);
		contentPane.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(424, 685, 584, 20);
		contentPane.add(textField_39);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "mec", "ele", "civ", "cse", "common" }));
		comboBox.setBounds(60, 27, 97, 20);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Ok\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = (String) comboBox.getSelectedItem();
				System.out.print(s);
				String b[] = new String[20];
				String a[] = new String[20];
				b[0] = textField.getText();
				b[1] = textField_1.getText();
				b[2] = textField_2.getText();
				b[3] = textField_3.getText();
				b[4] = textField_4.getText();
				b[5] = textField_5.getText();
				b[6] = textField_6.getText();
				b[7] = textField_7.getText();
				b[8] = textField_8.getText();
				b[9] = textField_9.getText();
				b[10] = textField_10.getText();
				b[11] = textField_11.getText();
				b[12] = textField_12.getText();
				b[13] = textField_13.getText();
				b[14] = textField_14.getText();
				b[15] = textField_15.getText();
				b[16] = textField_16.getText();
				b[17] = textField_17.getText();
				b[18] = textField_18.getText();
				b[19] = textField_19.getText();
				a[0] = textField_20.getText();
				a[1] = textField_21.getText();
				a[2] = textField_22.getText();
				a[3] = textField_23.getText();
				a[4] = textField_24.getText();
				a[5] = textField_25.getText();
				a[6] = textField_26.getText();
				a[7] = textField_27.getText();
				a[8] = textField_28.getText();

				a[9] = textField_29.getText();
				a[10] = textField_30.getText();
				a[11] = textField_31.getText();
				a[12] = textField_32.getText();
				a[13] = textField_33.getText();
				a[14] = textField_34.getText();
				a[15] = textField_35.getText();
				a[16] = textField_36.getText();
				a[17] = textField_37.getText();
				a[18] = textField_38.getText();
				a[19] = textField_39.getText();
				String p[] = new String[20];
				p[0] = textField_40.getText();
				p[1] = textField_41.getText();
				p[2] = textField_42.getText();
				p[3] = textField_43.getText();
				p[4] = textField_44.getText();
				p[5] = textField_45.getText();
				p[6] = textField_46.getText();
				p[7] = textField_47.getText();
				p[8] = textField_48.getText();

				p[9] = textField_49.getText();
				p[10] = textField_50.getText();
				p[11] = textField_51.getText();
				p[12] = textField_52.getText();
				p[13] = textField_53.getText();
				p[14] = textField_54.getText();
				p[15] = textField_55.getText();
				p[16] = textField_56.getText();
				p[17] = textField_57.getText();
				p[18] = textField_58.getText();
				p[19] = textField_59.getText();

				String n[] = new String[20];
				n[0] = textField_60.getText();
				n[1] = textField_61.getText();
				n[2] = textField_62.getText();
				n[3] = textField_63.getText();
				n[4] = textField_64.getText();
				n[5] = textField_65.getText();
				n[6] = textField_66.getText();
				n[7] = textField_67.getText();
				n[8] = textField_68.getText();

				n[9] = textField_69.getText();
				n[10] = textField_70.getText();
				n[11] = textField_71.getText();
				n[12] = textField_72.getText();
				n[13] = textField_73.getText();
				n[14] = textField_74.getText();
				n[15] = textField_75.getText();
				n[16] = textField_76.getText();
				n[17] = textField_77.getText();
				n[18] = textField_78.getText();
				n[19] = textField_79.getText();

				String c = "";
				int i = 0;
				int z = 0;
				while (true) {
					try {
						if (b[i].equals(c)) {
							break;
						}
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
						Statement st = con.createStatement();
						if (s.equals("ele")) {
							st.executeUpdate(
									"insert into ele (Book_name,Author,Pub_name,Total_book,Avail_book) values('" + b[i]
											+ "','" + a[i] + "','" + p[i] + "','" + Integer.valueOf(n[i]) + "','"
											+ Integer.valueOf(n[i]) + "')");
						} else if (s.equals("mec")) {
							st.executeUpdate(
									"insert into mec (Book_name,Author,Pub_name,Total_book,Avail_book) values('" + b[i]
											+ "','" + a[i] + "','" + p[i] + "','" + Integer.valueOf(n[i]) + "','"
											+ Integer.valueOf(n[i]) + "')");
						} else if (s.equals("civ")) {
							st.executeUpdate(
									"insert into civ (Book_name,Author,Pub_name,Total_book,Avail_book) values('" + b[i]
											+ "','" + a[i] + "','" + p[i] + "','" + Integer.valueOf(n[i]) + "','"
											+ Integer.valueOf(n[i]) + "')");
						} else if (s.equals("cse")) {
							st.executeUpdate(
									"insert into cse (Book_name,Author,Pub_name,Total_book,Avail_book) values('" + b[i]
											+ "','" + a[i] + "','" + p[i] + "','" + Integer.valueOf(n[i]) + "','"
											+ Integer.valueOf(n[i]) + "')");
						} else if (s.equals("common")) {
							st.executeUpdate(
									"insert into common (Book_name,Author,Pub_name,Total_book,Avail_book) values('"
											+ b[i] + "','" + a[i] + "','" + p[i] + "','" + Integer.valueOf(n[i]) + "','"
											+ Integer.valueOf(n[i]) + "')");
						}

						i = i + 1;
					} catch (Exception e) {
						z = 1;
						System.out.print(e);
						break;
					}

				}
				if (z == 0)
					JOptionPane.showMessageDialog(null, "UPDATED SUCESSFULLY");
				else
					JOptionPane.showMessageDialog(null, "NOT UPDATED");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");
				textField_34.setText("");
				textField_35.setText("");
				textField_36.setText("");
				textField_37.setText("");
				textField_38.setText("");
				textField_39.setText("");
				textField_40.setText("");

				textField_41.setText("");
				textField_42.setText("");
				textField_43.setText("");
				textField_44.setText("");
				textField_45.setText("");
				textField_46.setText("");
				textField_47.setText("");
				textField_48.setText("");
				textField_49.setText("");
				textField_50.setText("");
				textField_51.setText("");
				textField_52.setText("");
				textField_53.setText("");
				textField_54.setText("");
				textField_55.setText("");
				textField_56.setText("");
				textField_57.setText("");
				textField_58.setText("");
				textField_59.setText("");
				textField_60.setText("");
				textField_61.setText("");
				textField_62.setText("");
				textField_63.setText("");
				textField_64.setText("");
				textField_65.setText("");
				textField_66.setText("");
				textField_67.setText("");
				textField_68.setText("");
				textField_69.setText("");
				textField_70.setText("");
				textField_71.setText("");
				textField_72.setText("");
				textField_73.setText("");
				textField_74.setText("");
				textField_75.setText("");
				textField_76.setText("");
				textField_77.setText("");
				textField_78.setText("");
				textField_79.setText("");

			}
		});
		btnNewButton.setBounds(1246, 26, 89, 23);
		contentPane.add(btnNewButton);

		lblNewLabel_2 = new JLabel("PUB NAME");
		lblNewLabel_2.setBounds(1059, 69, 86, 14);
		contentPane.add(lblNewLabel_2);

		textField_40 = new JTextField();
		textField_40.setBounds(1012, 96, 250, 20);
		contentPane.add(textField_40);
		textField_40.setColumns(10);

		textField_41 = new JTextField();
		textField_41.setBounds(1011, 127, 251, 20);
		contentPane.add(textField_41);
		textField_41.setColumns(10);

		textField_42 = new JTextField();
		textField_42.setBounds(1011, 158, 250, 20);
		contentPane.add(textField_42);
		textField_42.setColumns(10);

		textField_43 = new JTextField();
		textField_43.setBounds(1011, 186, 251, 20);
		contentPane.add(textField_43);
		textField_43.setColumns(10);

		textField_44 = new JTextField();
		textField_44.setBounds(1011, 220, 251, 20);
		contentPane.add(textField_44);
		textField_44.setColumns(10);

		textField_45 = new JTextField();
		textField_45.setBounds(1011, 251, 251, 20);
		contentPane.add(textField_45);
		textField_45.setColumns(10);

		textField_46 = new JTextField();
		textField_46.setBounds(1007, 282, 255, 20);
		contentPane.add(textField_46);
		textField_46.setColumns(10);

		textField_47 = new JTextField();
		textField_47.setBounds(1007, 313, 254, 20);
		contentPane.add(textField_47);
		textField_47.setColumns(10);

		textField_48 = new JTextField();
		textField_48.setBounds(1011, 344, 251, 20);
		contentPane.add(textField_48);
		textField_48.setColumns(10);

		textField_49 = new JTextField();
		textField_49.setBounds(1011, 375, 251, 20);
		contentPane.add(textField_49);
		textField_49.setColumns(10);

		textField_50 = new JTextField();
		textField_50.setBounds(1011, 406, 251, 20);
		contentPane.add(textField_50);
		textField_50.setColumns(10);

		textField_51 = new JTextField();
		textField_51.setBounds(1011, 437, 251, 20);
		contentPane.add(textField_51);
		textField_51.setColumns(10);

		textField_52 = new JTextField();
		textField_52.setBounds(1011, 468, 250, 20);
		contentPane.add(textField_52);
		textField_52.setColumns(10);

		textField_53 = new JTextField();
		textField_53.setBounds(1011, 499, 251, 20);
		contentPane.add(textField_53);
		textField_53.setColumns(10);

		textField_54 = new JTextField();
		textField_54.setBounds(1011, 530, 251, 20);
		contentPane.add(textField_54);
		textField_54.setColumns(10);

		textField_55 = new JTextField();
		textField_55.setBounds(1011, 561, 250, 20);
		contentPane.add(textField_55);
		textField_55.setColumns(10);

		textField_56 = new JTextField();
		textField_56.setBounds(1011, 592, 251, 20);
		contentPane.add(textField_56);
		textField_56.setColumns(10);

		textField_57 = new JTextField();
		textField_57.setBounds(1011, 623, 251, 20);
		contentPane.add(textField_57);
		textField_57.setColumns(10);

		textField_58 = new JTextField();
		textField_58.setBounds(1019, 654, 243, 20);
		contentPane.add(textField_58);
		textField_58.setColumns(10);

		textField_59 = new JTextField();
		textField_59.setBounds(1018, 685, 244, 20);
		contentPane.add(textField_59);
		textField_59.setColumns(10);

		lblNewLabel_4 = new JLabel("Total Book");
		lblNewLabel_4.setBounds(1266, 69, 69, 14);
		contentPane.add(lblNewLabel_4);

		textField_60 = new JTextField();
		textField_60.setBounds(1266, 96, 86, 20);
		contentPane.add(textField_60);
		textField_60.setColumns(10);

		textField_61 = new JTextField();
		textField_61.setBounds(1266, 127, 86, 20);
		contentPane.add(textField_61);
		textField_61.setColumns(10);

		textField_62 = new JTextField();
		textField_62.setBounds(1271, 158, 86, 20);
		contentPane.add(textField_62);
		textField_62.setColumns(10);

		textField_63 = new JTextField();
		textField_63.setBounds(1266, 186, 86, 20);
		contentPane.add(textField_63);
		textField_63.setColumns(10);

		textField_64 = new JTextField();
		textField_64.setBounds(1266, 220, 86, 20);
		contentPane.add(textField_64);
		textField_64.setColumns(10);

		textField_65 = new JTextField();
		textField_65.setBounds(1272, 254, 86, 20);
		contentPane.add(textField_65);
		textField_65.setColumns(10);

		textField_66 = new JTextField();
		textField_66.setBounds(1272, 282, 86, 20);
		contentPane.add(textField_66);
		textField_66.setColumns(10);

		textField_67 = new JTextField();
		textField_67.setBounds(1266, 313, 86, 20);
		contentPane.add(textField_67);
		textField_67.setColumns(10);

		textField_68 = new JTextField();
		textField_68.setBounds(1266, 344, 86, 20);
		contentPane.add(textField_68);
		textField_68.setColumns(10);

		textField_69 = new JTextField();
		textField_69.setBounds(1272, 375, 86, 20);
		contentPane.add(textField_69);
		textField_69.setColumns(10);

		textField_70 = new JTextField();
		textField_70.setBounds(1272, 406, 86, 20);
		contentPane.add(textField_70);
		textField_70.setColumns(10);

		textField_71 = new JTextField();
		textField_71.setBounds(1266, 437, 86, 20);
		contentPane.add(textField_71);
		textField_71.setColumns(10);

		textField_72 = new JTextField();
		textField_72.setBounds(1266, 468, 86, 20);
		contentPane.add(textField_72);
		textField_72.setColumns(10);

		textField_73 = new JTextField();
		textField_73.setBounds(1266, 499, 86, 20);
		contentPane.add(textField_73);
		textField_73.setColumns(10);

		textField_74 = new JTextField();
		textField_74.setBounds(1266, 530, 86, 20);
		contentPane.add(textField_74);
		textField_74.setColumns(10);

		textField_75 = new JTextField();
		textField_75.setBounds(1266, 561, 86, 20);
		contentPane.add(textField_75);
		textField_75.setColumns(10);

		textField_76 = new JTextField();
		textField_76.setBounds(1272, 592, 86, 20);
		contentPane.add(textField_76);
		textField_76.setColumns(10);

		textField_77 = new JTextField();
		textField_77.setBounds(1266, 623, 86, 20);
		contentPane.add(textField_77);
		textField_77.setColumns(10);

		textField_78 = new JTextField();
		textField_78.setBounds(1266, 654, 86, 20);
		contentPane.add(textField_78);
		textField_78.setColumns(10);

		textField_79 = new JTextField();
		textField_79.setBounds(1266, 685, 86, 20);
		contentPane.add(textField_79);
		textField_79.setColumns(10);

	}
}
