package clgpro;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Part1 extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Part1 frame = new Part1();
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
	public Part1() {
		setBounds(100, 100, 940, 897);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("REGD_NO.\r\n");
		lblNewLabel.setBounds(10, 69, 68, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NAME\r\n");
		lblNewLabel_1.setBounds(217, 69, 110, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("YEAR OF JOIN");
		lblNewLabel_2.setBounds(741, 69, 130, 14);
		contentPane.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(10, 96, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 127, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("1\r\n");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(0, 99, 8, 14);
		contentPane.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 158, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 189, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 220, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(10, 251, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(10, 282, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(10, 313, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(10, 344, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(10, 375, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(10, 406, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(10, 437, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(10, 468, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setBounds(10, 499, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setBounds(10, 530, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setBounds(10, 561, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setBounds(10, 592, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);

		textField_17 = new JTextField();
		textField_17.setBounds(10, 623, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);

		textField_18 = new JTextField();
		textField_18.setBounds(10, 654, 86, 20);
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
		textField_19.setBounds(10, 685, 86, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);

		JLabel label_18 = new JLabel("20\r\n");
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setBounds(0, 688, 12, 14);
		contentPane.add(label_18);

		textField_20 = new JTextField();
		textField_20.setBounds(106, 96, 605, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(106, 127, 605, 20);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(106, 158, 605, 20);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(106, 189, 605, 20);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(106, 220, 605, 20);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(106, 251, 605, 20);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(106, 282, 605, 20);
		contentPane.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(106, 313, 605, 20);
		contentPane.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(106, 344, 605, 20);
		contentPane.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(106, 375, 605, 20);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(106, 406, 605, 20);
		contentPane.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(106, 437, 605, 20);
		contentPane.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(106, 468, 605, 20);
		contentPane.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(106, 499, 605, 20);
		contentPane.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(106, 530, 605, 20);
		contentPane.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(106, 561, 605, 20);
		contentPane.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(106, 592, 605, 20);
		contentPane.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(106, 623, 605, 20);
		contentPane.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(106, 654, 605, 20);
		contentPane.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(106, 685, 605, 20);
		contentPane.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setBounds(721, 96, 86, 20);
		contentPane.add(textField_40);
		textField_40.setColumns(10);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(721, 127, 86, 20);
		contentPane.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(721, 158, 86, 20);
		contentPane.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(721, 189, 86, 20);
		contentPane.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(721, 220, 86, 20);
		contentPane.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(721, 251, 86, 20);
		contentPane.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(721, 282, 86, 20);
		contentPane.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(721, 313, 86, 20);
		contentPane.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(721, 344, 86, 20);
		contentPane.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(721, 375, 86, 20);
		contentPane.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(721, 406, 86, 20);
		contentPane.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(721, 437, 86, 20);
		contentPane.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(721, 468, 86, 20);
		contentPane.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(721, 499, 86, 20);
		contentPane.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(721, 530, 86, 20);
		contentPane.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(721, 561, 86, 20);
		contentPane.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(721, 592, 86, 20);
		contentPane.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(721, 623, 86, 20);
		contentPane.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(721, 654, 86, 20);
		contentPane.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(721, 685, 86, 20);
		contentPane.add(textField_59);
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "mec", "cse", "ele", "civ" }));
		comboBox.setBounds(60, 24, 86, 20);
		contentPane.add(comboBox);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s[] = new String[20];
				String n[] = new String[20];
				String y[] = new String[20];
				int i = -1, j = -1;
				s[0] = textField.getText();
				s[1] = textField_1.getText();
				s[2] = textField_2.getText();
				s[3] = textField_3.getText();
				s[4] = textField_4.getText();
				s[5] = textField_5.getText();
				s[6] = textField_6.getText();
				s[7] = textField_7.getText();
				s[8] = textField_8.getText();
				s[9] = textField_9.getText();
				s[10] = textField_10.getText();
				s[11] = textField_11.getText();
				s[12] = textField_12.getText();
				s[13] = textField_13.getText();
				s[14] = textField_14.getText();
				s[15] = textField_15.getText();
				s[16] = textField_16.getText();
				s[17] = textField_17.getText();
				s[18] = textField_18.getText();
				s[19] = textField_19.getText();
				// for name
				n[0] = textField_20.getText();
				n[1] = textField_21.getText();
				n[2] = textField_22.getText();
				n[3] = textField_23.getText();
				n[4] = textField_24.getText();
				n[5] = textField_25.getText();
				n[6] = textField_26.getText();
				n[7] = textField_27.getText();
				n[8] = textField_28.getText();
				n[9] = textField_29.getText();
				n[10] = textField_30.getText();
				n[11] = textField_31.getText();
				n[12] = textField_32.getText();
				n[13] = textField_33.getText();
				n[14] = textField_34.getText();
				n[15] = textField_35.getText();
				n[16] = textField_36.getText();
				n[17] = textField_37.getText();
				n[18] = textField_38.getText();
				n[19] = textField_39.getText();
				// for year
				y[0] = textField_40.getText();
				y[1] = textField_41.getText();
				y[2] = textField_42.getText();
				y[3] = textField_43.getText();
				y[4] = textField_44.getText();
				y[5] = textField_45.getText();
				y[6] = textField_46.getText();
				y[7] = textField_47.getText();
				y[8] = textField_48.getText();
				y[9] = textField_49.getText();
				y[10] = textField_50.getText();
				y[11] = textField_51.getText();
				y[12] = textField_52.getText();
				y[13] = textField_53.getText();
				y[14] = textField_54.getText();
				y[15] = textField_55.getText();
				y[16] = textField_56.getText();
				y[17] = textField_57.getText();
				y[18] = textField_58.getText();
				y[19] = textField_59.getText();
				String s1 = "";
				while (true) {
					j = j + 1;
					i = i + 1;
					System.out.println("Siku" + s[i]);
					if (s[i].equals(s1)) {
						j = i - 1;
						break;
					}

				}
				System.out.print(j + "\n" + i);
				Connection con1 = null;
				Statement st1 = null;
				String bn = (String) comboBox.getSelectedItem();
				String cse = "cse", civ = "civ", mec = "mec", ele = "ele";
				try {

					Class.forName("com.mysql.jdbc.Driver");

					con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/clg", "root", "");

					st1 = con1.createStatement();
					for (i = 0; i <= j; i++) {
						if (bn.equals(cse))
							st1.executeUpdate("insert into cse (REGD_NO,NAME,y_join) values ('" + s[i] + "','" + n[i]
									+ "','" + y[i] + "')");
						else if (bn.equals(civ))
							st1.executeUpdate("insert into civ(REGD_NO,NAME,y_join) values ('" + s[i] + "','" + n[i]
									+ "','" + y[i] + "')");
						else if (bn.equals(ele))
							st1.executeUpdate("insert into ele(REGD_NO,NAME,y_join) values ('" + s[i] + "','" + n[i]
									+ "','" + y[i] + "')");
						else if (bn.equals(mec))
							st1.executeUpdate("insert into mec(REGD_NO,NAME,y_join) values ('" + s[i] + "','" + n[i]
									+ "','" + y[i] + "')");

					}
					JOptionPane.showMessageDialog(null, "UPDATED SUCESSFULLY");
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

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "NOT UPDATED");
					System.out.println(e);
				} finally {
					if ((st1 != null) && (con1 != null)) {
						try {
							st1.close();
							con1.close();
						} catch (Exception e) {
							System.out.print(e);
						}
					}
				}

			}
		});
		btnOk.setBounds(825, 684, 89, 23);
		contentPane.add(btnOk);

	}
}
