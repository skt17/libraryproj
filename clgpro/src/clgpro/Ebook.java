package clgpro;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ebook extends JFrame {

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
	String bn = "";
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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ebook frame = new Ebook();
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
	public Ebook() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1117, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(34, 32, 46, 14);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "cse", "mec", "ele", "civ", "common" }));
		comboBox.setBounds(141, 29, 144, 20);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(10, 107, 425, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JList list = new JList();
		list.setBounds(10, 127, 425, 122);
		contentPane.add(list);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 150, 437, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JList list_1 = new JList();
		list_1.setBounds(10, 172, 425, 122);
		contentPane.add(list_1);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 181, 437, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JList list_2 = new JList();
		list_2.setBounds(10, 202, 425, 122);
		contentPane.add(list_2);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 212, 437, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JList list_3 = new JList();
		list_3.setBounds(10, 233, 425, 122);
		contentPane.add(list_3);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 243, 437, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JList list_4 = new JList();
		list_4.setBounds(10, 269, 425, 122);
		contentPane.add(list_4);
		list.setVisible(false);
		list_1.setVisible(false);
		list_2.setVisible(false);
		list_3.setVisible(false);
		list_4.setVisible(false);
		DefaultListModel dlm = new DefaultListModel();
		list.setModel(dlm);
		list_1.setModel(dlm);
		list_2.setModel(dlm);
		list_3.setModel(dlm);
		list_4.setModel(dlm);

		textField_7 = new JTextField();
		textField_7.setBounds(474, 107, 294, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(474, 150, 294, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(474, 181, 299, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(474, 212, 294, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(474, 243, 294, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		// System.out.println(bn);
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bn = String.valueOf(comboBox.getSelectedItem());

			}
		});
		btnNewButton.setBounds(330, 28, 127, 23);
		contentPane.add(btnNewButton);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(801, 107, 65, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(796, 150, 65, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(801, 181, 65, 20);
		contentPane.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(801, 212, 65, 20);
		contentPane.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(801, 243, 65, 20);
		contentPane.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(894, 107, 65, 20);
		contentPane.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(894, 150, 65, 20);
		contentPane.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(894, 181, 65, 20);
		contentPane.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(894, 212, 65, 20);
		contentPane.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(894, 243, 65, 20);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(1011, 107, 65, 20);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(1011, 138, 65, 20);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(1011, 170, 65, 20);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(1011, 212, 65, 20);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(1011, 243, 65, 20);
		contentPane.add(textField_26);

		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tb1, tb2, tb3, tb4, tb5;
				int nb1, nb2, nb3, nb4, nb5;
				int ub1, ub2, ub3, ub4, ub5;
				Connection con = null;
				Statement st = null;
				String bn = (String) comboBox.getSelectedItem();
				if (textField_12.getText().equals("")) {
				} else {
					tb1 = Integer.parseInt(textField_12.getText());
					nb1 = Integer.parseInt(textField_17.getText());
					ub1 = nb1 + tb1;
					int ab;
					try {
						Class.forName("com.mysql.jdbc.Driver");

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
						ResultSet rs = null;
						st = con.createStatement();
						if (bn.equals("cse"))
							rs = st.executeQuery("select Avail_book from cse where(Book_name='" + textField.getText()
									+ "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("civ"))
							rs = st.executeQuery("select Avail_book from civ where(Book_name='" + textField.getText()
									+ "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("ele"))
							rs = st.executeQuery("select Avail_book from ele where(Book_name='" + textField.getText()
									+ "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("mec"))
							rs = st.executeQuery("select Avail_book from mec where(Book_name='" + textField.getText()
									+ "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("common"))
							rs = st.executeQuery("select Avail_book from common where(Book_name='" + textField.getText()
									+ "' && Pub_name='" + textField_7.getText() + "')");

						rs.next();
						ab = rs.getInt("Avail_book");
						System.out.println(ab);
						ab = ab + nb1;
						if (bn.equals("cse"))
							st.executeUpdate(
									"Update cse set Total_book='" + ub1 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField.getText() + "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("civ"))
							st.executeUpdate(
									"Update civ set Total_book='" + ub1 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField.getText() + "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("ele"))
							st.executeUpdate(
									"Update ele set Total_book='" + ub1 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField.getText() + "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("mec"))
							st.executeUpdate(
									"Update mec set Total_book='" + ub1 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField.getText() + "' && Pub_name='" + textField_7.getText() + "')");
						else if (bn.equals("common"))
							st.executeUpdate("Update common set Total_book='" + ub1 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField.getText() + "' && Pub_name='"
									+ textField_7.getText() + "')");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {

						try {
							con.close();
						} catch (Exception e) {
						}
					}

					textField_22.setText(String.valueOf(ub1));
				}
				if (textField_13.getText().equals("")) {
				} else {
					tb2 = Integer.parseInt(textField_13.getText());
					nb2 = Integer.parseInt(textField_18.getText());
					ub2 = nb2 + tb2;
					int ab;
					try {
						Class.forName("com.mysql.jdbc.Driver");

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
						ResultSet rs = null;
						st = con.createStatement();
						if (bn.equals("cse"))
							rs = st.executeQuery("select Avail_book from cse where(Book_name='" + textField_1.getText()
									+ "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("civ"))
							rs = st.executeQuery("select Avail_book from civ where(Book_name='" + textField_1.getText()
									+ "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("ele"))
							rs = st.executeQuery("select Avail_book from ele where(Book_name='" + textField_1.getText()
									+ "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("mec"))
							rs = st.executeQuery("select Avail_book from mec where(Book_name='" + textField_1.getText()
									+ "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("common"))
							rs = st.executeQuery("select Avail_book from common where(Book_name='"
									+ textField_1.getText() + "' && Pub_name='" + textField_8.getText() + "')");

						rs.next();
						ab = rs.getInt("Avail_book");
						System.out.println(ab);
						ab = ab + nb2;
						if (bn.equals("cse"))
							st.executeUpdate(
									"Update cse set Total_book='" + ub2 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_1.getText() + "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("civ"))
							st.executeUpdate(
									"Update civ set Total_book='" + ub2 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_1.getText() + "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("ele"))
							st.executeUpdate(
									"Update ele set Total_book='" + ub2 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_1.getText() + "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("mec"))
							st.executeUpdate(
									"Update mec set Total_book='" + ub2 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_1.getText() + "' && Pub_name='" + textField_8.getText() + "')");
						else if (bn.equals("common"))
							st.executeUpdate("Update common set Total_book='" + ub2 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_1.getText() + "' && Pub_name='"
									+ textField_8.getText() + "')");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {

						try {
							con.close();
						} catch (Exception e) {
						}
					}

					textField_23.setText(String.valueOf(ub2));
				}

				if (textField_14.getText().equals("")) {
				} else {
					tb3 = Integer.parseInt(textField_14.getText());
					nb3 = Integer.parseInt(textField_19.getText());
					ub3 = tb3 + nb3;
					int ab;
					try {
						Class.forName("com.mysql.jdbc.Driver");

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
						ResultSet rs = null;
						st = con.createStatement();
						if (bn.equals("cse"))
							rs = st.executeQuery("select Avail_book from cse where(Book_name='" + textField_2.getText()
									+ "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("civ"))
							rs = st.executeQuery("select Avail_book from civ where(Book_name='" + textField_2.getText()
									+ "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("ele"))
							rs = st.executeQuery("select Avail_book from ele where(Book_name='" + textField_2.getText()
									+ "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("mec"))
							rs = st.executeQuery("select Avail_book from mec where(Book_name='" + textField_2.getText()
									+ "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("common"))
							rs = st.executeQuery("select Avail_book from common where(Book_name='"
									+ textField_2.getText() + "' && Pub_name='" + textField_9.getText() + "')");

						rs.next();
						ab = rs.getInt("Avail_book");
						System.out.println(ab);
						ab = ab + nb3;
						if (bn.equals("cse"))
							st.executeUpdate(
									"Update cse set Total_book='" + ub3 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_2.getText() + "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("civ"))
							st.executeUpdate(
									"Update civ set Total_book='" + ub3 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_2.getText() + "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("ele"))
							st.executeUpdate(
									"Update ele set Total_book='" + ub3 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_2.getText() + "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("mec"))
							st.executeUpdate(
									"Update mec set Total_book='" + ub3 + "',Avail_book='" + ab + "'where(Book_name='"
											+ textField_2.getText() + "' && Pub_name='" + textField_9.getText() + "')");
						else if (bn.equals("common"))
							st.executeUpdate("Update common set Total_book='" + ub3 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_2.getText() + "' && Pub_name='"
									+ textField_9.getText() + "')");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {

						try {
							con.close();
						} catch (Exception e) {
						}
					}

					// ub3=nb3+tb3;
					textField_24.setText(String.valueOf(ub3));
				}
				if (textField_15.getText().equals("")) {
				} else {
					tb4 = Integer.parseInt(textField_15.getText());
					nb4 = Integer.parseInt(textField_20.getText());
					ub4 = nb4 + tb4;
					int ab;
					try {
						Class.forName("com.mysql.jdbc.Driver");

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
						ResultSet rs = null;
						st = con.createStatement();
						if (bn.equals("cse"))
							rs = st.executeQuery("select Avail_book from cse where(Book_name='" + textField_3.getText()
									+ "' && Pub_name='" + textField_10.getText() + "')");
						else if (bn.equals("civ"))
							rs = st.executeQuery("select Avail_book from civ where(Book_name='" + textField_3.getText()
									+ "' && Pub_name='" + textField_10.getText() + "')");
						else if (bn.equals("ele"))
							rs = st.executeQuery("select Avail_book from ele where(Book_name='" + textField_3.getText()
									+ "' && Pub_name='" + textField_10.getText() + "')");
						else if (bn.equals("mec"))
							rs = st.executeQuery("select Avail_book from mec where(Book_name='" + textField_3.getText()
									+ "' && Pub_name='" + textField_10.getText() + "')");
						else if (bn.equals("common"))
							rs = st.executeQuery("select Avail_book from common where(Book_name='"
									+ textField_3.getText() + "' && Pub_name='" + textField_10.getText() + "')");

						rs.next();
						ab = rs.getInt("Avail_book");
						System.out.println(ab);
						ab = ab + nb4;
						if (bn.equals("cse"))
							st.executeUpdate("Update cse set Total_book='" + ub4 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_3.getText() + "' && Pub_name='"
									+ textField_10.getText() + "')");
						else if (bn.equals("civ"))
							st.executeUpdate("Update civ set Total_book='" + ub4 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_3.getText() + "' && Pub_name='"
									+ textField_10.getText() + "')");
						else if (bn.equals("ele"))
							st.executeUpdate("Update ele set Total_book='" + ub4 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_3.getText() + "' && Pub_name='"
									+ textField_10.getText() + "')");
						else if (bn.equals("mec"))
							st.executeUpdate("Update mec set Total_book='" + ub4 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_3.getText() + "' && Pub_name='"
									+ textField_10.getText() + "')");
						else if (bn.equals("common"))
							st.executeUpdate("Update common set Total_book='" + ub4 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_3.getText() + "' && Pub_name='"
									+ textField_10.getText() + "')");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {

						try {
							con.close();
						} catch (Exception e) {
						}
					}

					textField_25.setText(String.valueOf(ub4));
				}
				if (textField_16.getText().equals("")) {
				} else {
					tb5 = Integer.parseInt(textField_16.getText());
					nb5 = Integer.parseInt(textField_21.getText());
					ub5 = nb5 + tb5;
					int ab;
					try {
						Class.forName("com.mysql.jdbc.Driver");

						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
						ResultSet rs = null;
						st = con.createStatement();
						if (bn.equals("cse"))
							rs = st.executeQuery("select Avail_book from cse where(Book_name='" + textField_4.getText()
									+ "' && Pub_name='" + textField_11.getText() + "')");
						else if (bn.equals("civ"))
							rs = st.executeQuery("select Avail_book from civ where(Book_name='" + textField_4.getText()
									+ "' && Pub_name='" + textField_11.getText() + "')");
						else if (bn.equals("ele"))
							rs = st.executeQuery("select Avail_book from ele where(Book_name='" + textField_4.getText()
									+ "' && Pub_name='" + textField_11.getText() + "')");
						else if (bn.equals("mec"))
							rs = st.executeQuery("select Avail_book from mec where(Book_name='" + textField_4.getText()
									+ "' && Pub_name='" + textField_11.getText() + "')");
						else if (bn.equals("common"))
							rs = st.executeQuery("select Avail_book from common where(Book_name='"
									+ textField_4.getText() + "' && Pub_name='" + textField_11.getText() + "')");

						rs.next();
						ab = rs.getInt("Avail_book");
						System.out.println(ab);
						ab = ab + nb5;
						if (bn.equals("cse"))
							st.executeUpdate("Update cse set Total_book='" + ub5 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_4.getText() + "' && Pub_name='"
									+ textField_11.getText() + "')");
						else if (bn.equals("civ"))
							st.executeUpdate("Update civ set Total_book='" + ub5 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_4.getText() + "' && Pub_name='"
									+ textField_11.getText() + "')");
						else if (bn.equals("ele"))
							st.executeUpdate("Update ele set Total_book='" + ub5 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_4.getText() + "' && Pub_name='"
									+ textField_11.getText() + "')");
						else if (bn.equals("mec"))
							st.executeUpdate("Update mec set Total_book='" + ub5 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_4.getText() + "' && Pub_name='"
									+ textField_11.getText() + "')");
						else if (bn.equals("common"))
							st.executeUpdate("Update common set Total_book='" + ub5 + "',Avail_book='" + ab
									+ "'where(Book_name='" + textField_4.getText() + "' && Pub_name='"
									+ textField_11.getText() + "')");

					} catch (Exception e) {
						e.printStackTrace();
					} finally {

						try {
							con.close();
						} catch (Exception e) {
						}
					}

					textField_26.setText(String.valueOf(ub5));
				}

				// textField_22.setText(String.valueOf(ub));
			}
		});
		btnNewButton_1.setBounds(801, 389, 89, 23);
		contentPane.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(46, 82, 144, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Pub Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(492, 83, 236, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Total Book");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(801, 82, 65, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("No of \r\nNew Book");
		lblNewLabel_4.setBounds(876, 82, 101, 14);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Result");
		lblNewLabel_5.setBounds(1011, 70, 46, 14);
		contentPane.add(lblNewLabel_5);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {

				String s = textField.getText();
				if (s.equals("")) {
					list.setVisible(false);
					textField_1.setVisible(true);
				} else {
					textField_1.setVisible(false);
					list.setVisible(true);
					Connection con = null;
					Statement st = null;
					ResultSet rs = null;
					ResultSet rs1 = null;
					Connection con1 = null;
					Statement st1 = null;

					try {
						dlm.removeAllElements();
						Class.forName("com.mysql.jdbc.Driver");
						String z1 = "";
						String f1, f2;
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

						st = con.createStatement();

						String s3 = bn;
						System.out.println(s3);
						if (s3.equals("cse")) {
							rs = st.executeQuery("select Book_name,Pub_name from cse where Book_name like'" + s + "%'");
							// st.close();
							// st=con.createStatement();

						} else if (s3.equals("civ"))
							rs = st.executeQuery("select Book_name,Pub_name from civ where Book_name like'" + s + "%'");
						else if (s3.equals("ele"))
							rs = st.executeQuery("select Book_name,Pub_name from ele where Book_name like'" + s + "%'");
						else if (s3.equals("mec"))
							rs = st.executeQuery("select Book_name,Pub_name from mec where Book_name like'" + s + "%'");
						else if (s3.equals("common"))
							rs = st.executeQuery(
									"select Book_name,Pub_name from common where Book_name like'" + s + "%'");

						while (rs.next()) {
							f1 = rs.getString("Book_name");
							// System.out.print(f1);
							f2 = rs.getString("Pub_name");
							z1 = f1 + "," + f2;
							dlm.addElement(z1);

						}

					} catch (Exception e) {
						System.out.println(e);
						e.printStackTrace();
					} finally {
						try {
							rs.close();
							st.close();
							con.close();

						} catch (Exception e) {
						}
					}

				}

			}
		});
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list.setVisible(false);
				textField_1.setVisible(true);

				String st = (String) list.getSelectedValue();
				String s1 = "", s2 = "";

				for (int i = 0; i < st.length(); i++) {
					if (st.charAt(i) == ',') {
						s1 = s2;
						s2 = "";

					} else {
						s2 = s2 + st.charAt(i);
					}

				}
				textField.setText(s1);
				textField_7.setText(s2);
				Connection con = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

					Statement st1 = con.createStatement();
					ResultSet rs1 = null;
					if (bn.equals("cse"))
						rs1 = st1.executeQuery(
								"select Total_book from cse where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("civ"))
						rs1 = st1.executeQuery(
								"select Total_book from civ where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("mec"))
						rs1 = st1.executeQuery(
								"select Total_book from mec where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("ele"))
						rs1 = st1.executeQuery(
								"select Total_book from ele where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("common"))
						rs1 = st1.executeQuery(
								"select Total_book from common where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					int tb = 0;
					while (rs1.next())
						tb = rs1.getInt("Total_book");
					textField_12.setText(String.valueOf(tb));

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (Exception e) {
					}
				}

			}
		});

		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {

				String s = textField_1.getText();
				if (s.equals("")) {
					list_1.setVisible(false);
					textField_1.setVisible(true);
				} else {
					textField_2.setVisible(false);
					list_1.setVisible(true);
					Connection con = null;
					Statement st = null;
					ResultSet rs = null;
					ResultSet rs1 = null;
					Connection con1 = null;
					Statement st1 = null;

					try {
						dlm.removeAllElements();
						Class.forName("com.mysql.jdbc.Driver");
						String z1 = "";
						String f1, f2;
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

						st = con.createStatement();

						String s3 = bn;
						System.out.println(s3);
						if (s3.equals("cse")) {
							rs = st.executeQuery("select Book_name,Pub_name from cse where Book_name like'" + s + "%'");
							// st.close();
							// st=con.createStatement();

						} else if (s3.equals("civ"))
							rs = st.executeQuery("select Book_name,Pub_name from civ where Book_name like'" + s + "%'");
						else if (s3.equals("ele"))
							rs = st.executeQuery("select Book_name,Pub_name from ele where Book_name like'" + s + "%'");
						else if (s3.equals("mec"))
							rs = st.executeQuery("select Book_name,Pub_name from mec where Book_name like'" + s + "%'");
						else if (s3.equals("common"))
							rs = st.executeQuery(
									"select Book_name,Pub_name from common where Book_name like'" + s + "%'");

						while (rs.next()) {
							f1 = rs.getString("Book_name");
							// System.out.print(f1);
							f2 = rs.getString("Pub_name");
							z1 = f1 + "," + f2;
							dlm.addElement(z1);

						}

					} catch (Exception e) {
						System.out.println(e);
						e.printStackTrace();
					} finally {
						try {
							rs.close();
							st.close();
							con.close();

						} catch (Exception e) {
						}
					}

				}

			}
		});
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list_1.setVisible(false);
				textField_2.setVisible(true);

				String st = (String) list_1.getSelectedValue();
				String s1 = "", s2 = "";

				for (int i = 0; i < st.length(); i++) {
					if (st.charAt(i) == ',') {
						s1 = s2;
						s2 = "";

					} else {
						s2 = s2 + st.charAt(i);
					}

				}
				textField_1.setText(s1);
				textField_8.setText(s2);
				Connection con = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

					Statement st1 = con.createStatement();
					ResultSet rs1 = null;
					if (bn.equals("cse"))
						rs1 = st1.executeQuery(
								"select Total_book from cse where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("civ"))
						rs1 = st1.executeQuery(
								"select Total_book from civ where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("mec"))
						rs1 = st1.executeQuery(
								"select Total_book from mec where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("ele"))
						rs1 = st1.executeQuery(
								"select Total_book from ele where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("common"))
						rs1 = st1.executeQuery(
								"select Total_book from common where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					int tb = 0;
					while (rs1.next())
						tb = rs1.getInt("Total_book");
					textField_13.setText(String.valueOf(tb));

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (Exception e) {
					}
				}

			}
		});
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(false);

				String s = textField_2.getText();
				if (s.equals("")) {
					list_2.setVisible(false);
					textField_3.setVisible(true);
				} else {
					textField_3.setVisible(false);
					list_2.setVisible(true);
					Connection con = null;
					Statement st = null;
					ResultSet rs = null;
					ResultSet rs1 = null;
					Connection con1 = null;
					Statement st1 = null;

					try {
						dlm.removeAllElements();
						Class.forName("com.mysql.jdbc.Driver");
						String z1 = "";
						String f1, f2;
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

						st = con.createStatement();

						String s3 = bn;
						System.out.println(s3);
						if (s3.equals("cse")) {
							rs = st.executeQuery("select Book_name,Pub_name from cse where Book_name like'" + s + "%'");
							// st.close();
							// st=con.createStatement();

						} else if (s3.equals("civ"))
							rs = st.executeQuery("select Book_name,Pub_name from civ where Book_name like'" + s + "%'");
						else if (s3.equals("ele"))
							rs = st.executeQuery("select Book_name,Pub_name from ele where Book_name like'" + s + "%'");
						else if (s3.equals("mec"))
							rs = st.executeQuery("select Book_name,Pub_name from mec where Book_name like'" + s + "%'");
						else if (s3.equals("common"))
							rs = st.executeQuery(
									"select Book_name,Pub_name from common where Book_name like'" + s + "%'");

						while (rs.next()) {
							f1 = rs.getString("Book_name");
							// System.out.print(f1);
							f2 = rs.getString("Pub_name");
							z1 = f1 + "," + f2;
							dlm.addElement(z1);

						}

					} catch (Exception e) {
						System.out.println(e);
						e.printStackTrace();
					} finally {
						try {
							rs.close();
							st.close();
							con.close();

						} catch (Exception e) {
						}
					}

				}

			}

		});
		list_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list_2.setVisible(false);
				textField_3.setVisible(true);

				String st = (String) list_2.getSelectedValue();
				String s1 = "", s2 = "";

				for (int i = 0; i < st.length(); i++) {
					if (st.charAt(i) == ',') {
						s1 = s2;
						s2 = "";

					} else {
						s2 = s2 + st.charAt(i);
					}

				}
				textField_2.setText(s1);
				textField_9.setText(s2);
				Connection con = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

					Statement st1 = con.createStatement();
					ResultSet rs1 = null;
					if (bn.equals("cse"))
						rs1 = st1.executeQuery(
								"select Total_book from cse where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("civ"))
						rs1 = st1.executeQuery(
								"select Total_book from civ where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("mec"))
						rs1 = st1.executeQuery(
								"select Total_book from mec where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("ele"))
						rs1 = st1.executeQuery(
								"select Total_book from ele where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("common"))
						rs1 = st1.executeQuery(
								"select Total_book from common where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					int tb = 0;
					while (rs1.next())
						tb = rs1.getInt("Total_book");
					textField_14.setText(String.valueOf(tb));

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (Exception e) {
					}
				}

			}
		});

		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(false);
				list_2.setVisible(false);

				String s = textField_3.getText();
				if (s.equals("")) {
					list_2.setVisible(false);
					textField_4.setVisible(true);
				} else {
					textField_4.setVisible(false);
					list_3.setVisible(true);
					Connection con = null;
					Statement st = null;
					ResultSet rs = null;
					ResultSet rs1 = null;
					Connection con1 = null;
					Statement st1 = null;

					try {
						dlm.removeAllElements();
						Class.forName("com.mysql.jdbc.Driver");
						String z1 = "";
						String f1, f2;
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

						st = con.createStatement();

						String s3 = bn;
						System.out.println(s3);
						if (s3.equals("cse")) {
							rs = st.executeQuery("select Book_name,Pub_name from cse where Book_name like'" + s + "%'");
							// st.close();
							// st=con.createStatement();

						} else if (s3.equals("civ"))
							rs = st.executeQuery("select Book_name,Pub_name from civ where Book_name like'" + s + "%'");
						else if (s3.equals("ele"))
							rs = st.executeQuery("select Book_name,Pub_name from ele where Book_name like'" + s + "%'");
						else if (s3.equals("mec"))
							rs = st.executeQuery("select Book_name,Pub_name from mec where Book_name like'" + s + "%'");
						else if (s3.equals("common"))
							rs = st.executeQuery(
									"select Book_name,Pub_name from common where Book_name like'" + s + "%'");

						while (rs.next()) {
							f1 = rs.getString("Book_name");
							// System.out.print(f1);
							f2 = rs.getString("Pub_name");
							z1 = f1 + "," + f2;
							dlm.addElement(z1);

						}

					} catch (Exception e) {
						System.out.println(e);
						e.printStackTrace();
					} finally {
						try {
							rs.close();
							st.close();
							con.close();

						} catch (Exception e) {
						}
					}

				}

			}
		});
		list_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list_3.setVisible(false);
				textField_4.setVisible(true);

				String st = (String) list_3.getSelectedValue();
				String s1 = "", s2 = "";

				for (int i = 0; i < st.length(); i++) {
					if (st.charAt(i) == ',') {
						s1 = s2;
						s2 = "";

					} else {
						s2 = s2 + st.charAt(i);
					}

				}
				textField_3.setText(s1);
				textField_10.setText(s2);
				Connection con = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

					Statement st1 = con.createStatement();
					ResultSet rs1 = null;
					if (bn.equals("cse"))
						rs1 = st1.executeQuery(
								"select Total_book from cse where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("civ"))
						rs1 = st1.executeQuery(
								"select Total_book from civ where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("mec"))
						rs1 = st1.executeQuery(
								"select Total_book from mec where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("ele"))
						rs1 = st1.executeQuery(
								"select Total_book from ele where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("common"))
						rs1 = st1.executeQuery(
								"select Total_book from common where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					int tb = 0;
					while (rs1.next())
						tb = rs1.getInt("Total_book");
					textField_15.setText(String.valueOf(tb));

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (Exception e) {
					}
				}

			}
		});
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(false);
				list_2.setVisible(false);
				list_3.setVisible(false);

				String s = textField_4.getText();
				if (s.equals("")) {
					list_3.setVisible(false);
					textField_4.setVisible(true);
				} else {
					// textField_4.setVisible(false);
					list_4.setVisible(true);
					Connection con = null;
					Statement st = null;
					ResultSet rs = null;
					ResultSet rs1 = null;
					Connection con1 = null;
					Statement st1 = null;

					try {
						dlm.removeAllElements();
						Class.forName("com.mysql.jdbc.Driver");
						String z1 = "";
						String f1, f2;
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

						st = con.createStatement();

						String s3 = bn;
						System.out.println(s3);
						if (s3.equals("cse")) {
							rs = st.executeQuery("select Book_name,Pub_name from cse where Book_name like'" + s + "%'");
							// st.close();
							// st=con.createStatement();

						} else if (s3.equals("civ"))
							rs = st.executeQuery("select Book_name,Pub_name from civ where Book_name like'" + s + "%'");
						else if (s3.equals("ele"))
							rs = st.executeQuery("select Book_name,Pub_name from ele where Book_name like'" + s + "%'");
						else if (s3.equals("mec"))
							rs = st.executeQuery("select Book_name,Pub_name from mec where Book_name like'" + s + "%'");
						else if (s3.equals("common"))
							rs = st.executeQuery(
									"select Book_name,Pub_name from common where Book_name like'" + s + "%'");

						while (rs.next()) {
							f1 = rs.getString("Book_name");
							// System.out.print(f1);
							f2 = rs.getString("Pub_name");
							z1 = f1 + "," + f2;
							dlm.addElement(z1);

						}

					} catch (Exception e) {
						System.out.println(e);
						e.printStackTrace();
					} finally {
						try {
							rs.close();
							st.close();
							con.close();

						} catch (Exception e) {
						}
					}

				}

			}
		});

		list_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list_4.setVisible(false);
				textField_4.setVisible(true);

				String st = (String) list_4.getSelectedValue();
				String s1 = "", s2 = "";

				for (int i = 0; i < st.length(); i++) {
					if (st.charAt(i) == ',') {
						s1 = s2;
						s2 = "";

					} else {
						s2 = s2 + st.charAt(i);
					}

				}
				textField_4.setText(s1);
				textField_11.setText(s2);
				Connection con = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");

					Statement st1 = con.createStatement();
					ResultSet rs1 = null;
					if (bn.equals("cse"))
						rs1 = st1.executeQuery(
								"select Total_book from cse where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("civ"))
						rs1 = st1.executeQuery(
								"select Total_book from civ where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("mec"))
						rs1 = st1.executeQuery(
								"select Total_book from mec where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("ele"))
						rs1 = st1.executeQuery(
								"select Total_book from ele where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					else if (bn.equals("common"))
						rs1 = st1.executeQuery(
								"select Total_book from common where Book_name='" + s1 + "'&&Pub_name='" + s2 + "'");
					int tb = 0;
					while (rs1.next())
						tb = rs1.getInt("Total_book");
					textField_16.setText(String.valueOf(tb));

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (Exception e) {
					}
				}

			}
		});

	}
}
