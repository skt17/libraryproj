package clgpro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.net.*;
import java.io.*;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextPane;

public class Client1 {

	private JFrame frame;
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
	private JButton btnNewButton_1;
	private JTextArea jtext;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JComboBox comboBox;
	private JLabel lblNewLabel_11;
	String qq = "";
	String mm = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client1 window = new Client1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1066, 736);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(30, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(113, 85, 470, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Branch");
		lblNewLabel_5.setBounds(616, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(680, 85, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Book no");
		lblNewLabel_2.setBounds(25, 116, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(25, 147, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(25, 183, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(25, 235, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(113, 147, 527, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(113, 183, 527, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(113, 235, 527, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(650, 147, 260, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(650, 183, 260, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(646, 235, 264, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(914, 147, 86, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(914, 183, 86, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBounds(914, 235, 86, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Book Name");
		lblNewLabel_3.setBounds(154, 116, 260, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Author Name");
		lblNewLabel_4.setBounds(673, 116, 125, 14);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_6 = new JLabel("Issue dt");
		lblNewLabel_6.setBounds(918, 116, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_6.setVisible(false);

		textField_1.setVisible(false);
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textField_7.setVisible(false);
		textField_8.setVisible(false);
		textField_9.setVisible(false);
		textField_10.setVisible(false);
		textField_11.setVisible(false);
		textField_12.setVisible(false);
		textField_13.setVisible(false);
		textField_14.setVisible(false);

		lblNewLabel_7 = new JLabel("BOOK NO");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(24, 290, 52, 14);
		frame.getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("BOOK NAME");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(182, 290, 99, 14);
		frame.getContentPane().add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("ISSUE DT");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(449, 290, 52, 14);
		frame.getContentPane().add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("RETURN DT");
		lblNewLabel_10.setBounds(649, 290, 127, 14);
		frame.getContentPane().add(lblNewLabel_10);

		lblNewLabel_7.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_9.setVisible(false);
		lblNewLabel_10.setVisible(false);
		jtext = new JTextArea();
		jtext.setEditable(false);
		frame.getContentPane().add(jtext);
		jtext.setVisible(false);

		JScrollPane scrollPane = new JScrollPane(jtext);
		scrollPane.setBounds(25, 315, 790, 183);
		frame.getContentPane().add(scrollPane);

		JTextPane txtpnGuidedBy = new JTextPane();
		txtpnGuidedBy.setEditable(false);
		txtpnGuidedBy.setText(
				"GUIDED BY : \r\n KAMAKSHYA PRASAD NAYAK\r\nASSISTANT PROFESSOR,CSE\r\n\r\nMEMBERS :\r\nSRINATH KUMAR TRIPATHY\r\nSUBHAKANT SAHOO\r\nBIBEK RANA\r\nSOURAV KUMAR SAHA\r\nARPITAA MOHANTY\r\nNIBEDITA PATI\r\nTAINAZ BANO\r\nSUSHREE KRANTI KARUNIKA\r\nANURADHA MOHANTA\r\nKUNARAM TUDU\r\nSK SAMIM AKHTAR\r\n\r\n\r\nAll copyrights are reserved\r\n");
		frame.getContentPane().add(txtpnGuidedBy);
		txtpnGuidedBy.setVisible(false);
		JScrollPane scrollPane_1 = new JScrollPane(txtpnGuidedBy);
		scrollPane_1.setBounds(44, 586, 321, 73);
		frame.getContentPane().add(scrollPane_1);
		scrollPane_1.setVisible(false);

		// scrollPane_1.setVisible(false);
		// txtpnGuidedBy.setVisible(false);

		// String g="",g1="";
		// g1=(String)comboBox.getSelectedItem();
		// if(g1.equals(g))
		// JOptionPane.showMessageDialog(null,"Select a branch");
		// else{
		jtext.setVisible(false);
		lblNewLabel_1.setVisible(true);
		lblNewLabel_2.setVisible(true);
		lblNewLabel_3.setVisible(true);
		lblNewLabel_4.setVisible(true);
		lblNewLabel_5.setVisible(true);
		lblNewLabel_6.setVisible(true);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_9.setVisible(false);
		lblNewLabel_10.setVisible(false);

		textField_1.setVisible(true);
		textField_2.setVisible(true);
		textField_2.setText(Client0.q);
		textField_3.setVisible(true);
		textField_4.setVisible(true);
		textField_5.setVisible(true);
		textField_6.setVisible(true);
		textField_7.setVisible(true);
		textField_8.setVisible(true);
		textField_9.setVisible(true);
		textField_10.setVisible(true);
		textField_11.setVisible(true);
		textField_12.setVisible(true);
		textField_13.setVisible(true);
		textField_14.setVisible(true);

		Socket s = null;
		try {
			s = new Socket("localhost", 7777);
			String s1[] = new String[5];
			String s2[] = new String[5];
			String s3[] = new String[5];

			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("1");

			dout.writeUTF(Client0.rn);
			// String q=(String)comboBox.getSelectedItem();
			dout.writeUTF(Client0.q);

			String st = dis.readUTF();
			int n = Integer.valueOf(st);
			textField_1.setText(dis.readUTF());

			System.out.println(n);
			if (n == 1) {
				s1[0] = dis.readUTF();
				System.out.println(s1[0]);
				s1[1] = dis.readUTF();
				s1[2] = dis.readUTF();
				s1[3] = dis.readUTF();
				textField_3.setVisible(true);
				textField_6.setVisible(true);
				textField_9.setVisible(true);
				textField_12.setVisible(true);
				textField_4.setVisible(false);
				textField_7.setVisible(false);
				textField_10.setVisible(false);
				textField_13.setVisible(false);
				textField_5.setVisible(false);
				textField_8.setVisible(false);
				textField_11.setVisible(false);
				textField_14.setVisible(false);

				textField_3.setText(s1[0]);
				textField_6.setText(s1[1]);
				textField_9.setText(s1[2]);
				textField_12.setText(s1[3]);

			} else if (n == 2) {
				s1[0] = dis.readUTF();
				s1[1] = dis.readUTF();
				s1[2] = dis.readUTF();
				s1[3] = dis.readUTF();
				s2[0] = dis.readUTF();
				s2[1] = dis.readUTF();
				s2[2] = dis.readUTF();
				s2[3] = dis.readUTF();
				textField_3.setVisible(true);
				textField_6.setVisible(true);
				textField_9.setVisible(true);
				textField_12.setVisible(true);
				textField_4.setVisible(true);
				textField_7.setVisible(true);
				textField_10.setVisible(true);
				textField_13.setVisible(true);
				textField_5.setVisible(false);
				textField_8.setVisible(false);
				textField_11.setVisible(false);
				textField_14.setVisible(false);

				textField_3.setText(s1[0]);
				textField_6.setText(s1[1]);
				textField_9.setText(s1[2]);
				textField_12.setText(s1[3]);
				textField_4.setText(s2[0]);
				textField_7.setText(s2[1]);
				textField_10.setText(s2[2]);
				textField_13.setText(s2[3]);

			} else if (n == 3) {
				s1[0] = dis.readUTF();
				s1[1] = dis.readUTF();
				s1[2] = dis.readUTF();
				s1[3] = dis.readUTF();
				s2[0] = dis.readUTF();
				s2[1] = dis.readUTF();
				s2[2] = dis.readUTF();
				s2[3] = dis.readUTF();
				s3[0] = dis.readUTF();
				s3[1] = dis.readUTF();
				s3[2] = dis.readUTF();
				s3[3] = dis.readUTF();
				textField_3.setVisible(true);
				textField_6.setVisible(true);
				textField_9.setVisible(true);
				textField_12.setVisible(true);
				textField_4.setVisible(true);
				textField_7.setVisible(true);
				textField_10.setVisible(true);
				textField_13.setVisible(true);
				textField_5.setVisible(true);
				textField_8.setVisible(true);
				textField_11.setVisible(true);
				textField_14.setVisible(true);

				textField_3.setText(s1[0]);
				textField_6.setText(s1[1]);
				textField_9.setText(s1[2]);
				textField_12.setText(s1[3]);
				textField_4.setText(s2[0]);
				textField_7.setText(s2[1]);
				textField_10.setText(s2[2]);
				textField_13.setText(s2[3]);
				textField_5.setText(s3[0]);
				textField_8.setText(s3[1]);
				textField_11.setText(s3[2]);
				textField_14.setText(s3[3]);

			} else if (n == 0) {
				textField_3.setVisible(false);
				textField_6.setVisible(false);
				textField_9.setVisible(false);
				textField_12.setVisible(false);
				textField_4.setVisible(false);
				textField_7.setVisible(false);
				textField_10.setVisible(false);
				textField_13.setVisible(false);
				textField_5.setVisible(false);
				textField_8.setVisible(false);
				textField_11.setVisible(false);
				textField_14.setVisible(false);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (Exception e) {
			}
		}

		btnNewButton_1 = new JButton("History");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_7.setVisible(true);
				lblNewLabel_8.setVisible(true);
				lblNewLabel_9.setVisible(true);
				lblNewLabel_10.setVisible(true);
				jtext.setVisible(true);

				Socket s = null;
				jtext.setText("");
				try {
					int bytesRead = 0;
					int currentTot = 0;

					s = new Socket("localhost", 7777);
					DataInputStream dis = new DataInputStream(s.getInputStream());
					DataOutputStream dout = new DataOutputStream(s.getOutputStream());
					dout.writeUTF("2");
					dout.writeUTF(Client0.rn);
					dout.flush();
					String f = dis.readUTF();
					int filesize = Integer.valueOf(f);
					int fss = filesize;
					filesize = filesize + 100000;
					String st = "G:\\New folder\\" + Client0.rn + ".txt";
					int n = 0;
					try {
						File transferFile = new File(st);

						n = (int) transferFile.length();
					} catch (Exception e) {
						n = -1;
					}
					System.out.println(n + "\n" + fss);
					if ((n == -1) || (n < fss)) {
						dout.writeUTF("1");

						byte[] bytearray = new byte[filesize];
						InputStream is = s.getInputStream();
						FileOutputStream fos = new FileOutputStream(st);
						BufferedOutputStream bos = new BufferedOutputStream(fos);

						while (bytesRead > -1) {

							bytesRead = is.read(bytearray, currentTot, (bytearray.length - currentTot));

							if (bytesRead >= 0) {
								currentTot = currentTot + bytesRead;
								long z = currentTot;
								float p = (z * 100) / fss;
								System.out.println(p + "%");

							}
						}
						bos.write(bytearray, 0, currentTot);
						bos.flush();
						bos.close();

					} else {
						try {
							dout.writeUTF("0");
						} catch (Exception e) {
						}

					}
				} catch (Exception e) {
					System.out.println("ss" + e);
					e.printStackTrace();
				}
				scrollPane.getVerticalScrollBar().setValue(0);

				try {
					String st = "G:\\New folder\\" + Client0.rn + ".txt";
					java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(st));
					String l = br.readLine();
					while (l != null) {
						jtext.append(l + "\n");
						l = br.readLine();
					}
					br.close();
					scrollPane.getVerticalScrollBar().setValue(0);

				} catch (Exception e) {
				}

			}
		});
		btnNewButton_1.setBounds(747, 7, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("i\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPane_1.setVisible(true);
				txtpnGuidedBy.setVisible(true);
				scrollPane_1.getVerticalScrollBar().setValue(0);

			}

		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setBounds(689, 617, 52, 23);
		frame.getContentPane().add(btnNewButton_2);

	}
}
