package clgpro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class C2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C2 frame = new C2();
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
	public C2() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// contentPane.setVisible(true);
		JLabel lblNewLabel = new JLabel("Regd_no");
		lblNewLabel.setBounds(10, 21, 60, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(184, 18, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "civ", "cse", "ele", "mec" }));
		comboBox.setBounds(184, 62, 52, 20);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(10, 124, 70, 14);
		contentPane.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(165, 121, 105, 20);
		contentPane.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel("Hint");
		lblNewLabel_2.setBounds(10, 181, 46, 14);
		contentPane.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(163, 178, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_2 = new JTextField();
		textField_2.setBounds(165, 121, 105, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String rn = textField.getText();
				String p = String.valueOf(passwordField.getPassword());
				String h = textField_1.getText();
				String b = (String) comboBox.getSelectedItem();
				DataInputStream dis = null;
				DataOutputStream dout = null;
				if ((rn.length() == 10) && (p.length() < 11 && p.length() > 0)
						&& ((h.length() < 11) && (h.length() > 0)) && (b != "")) {
					Socket s = null;
					try {
						s = new Socket("localhost", 7777);
						dis = new DataInputStream(s.getInputStream());
						dout = new DataOutputStream(s.getOutputStream());
						dout.writeUTF("4");
						dout.writeUTF(rn);

						dout.writeUTF(p);
						dout.writeUTF(h);
						dout.writeUTF(b);
						int n = Integer.parseInt(dis.readUTF());
						if (n == 1)
							JOptionPane.showMessageDialog(null, "Sucessfully register");
						else if (n == 0)
							JOptionPane.showMessageDialog(null, "Not register");
					} catch (Exception e) {
					}
				} else {
					JOptionPane.showMessageDialog(null, "Not register");
				}

				/*
				 * if((rn.length()==10)&&(p.length()<11 &&
				 * p.length()>0)&&((h.length()<11) &&(h.length()>0))&&(b!=""))
				 * {Connection con=null; Statement st=null; try{
				 * 
				 * Class.forName("com.mysql.jdbc.Driver");
				 * con=DriverManager.getConnection(
				 * "jdbc:mysql://localhost:3306/client","root","");
				 * st=con.createStatement(); st.
				 * executeUpdate("insert into cse(Regd_no,Password,Hint) values('"
				 * +rn+"','"+p+"','"+h+"')");
				 * JOptionPane.showMessageDialog(null,"Sucessfully register");
				 * }catch(Exception e){System.out.print(e);
				 * JOptionPane.showMessageDialog(null,"Already  register"); } }
				 * else{ System.out.print("Enter valid"); }
				 */}
		});
		btnNewButton.setBounds(72, 226, 142, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setBounds(10, 65, 70, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				String v = String.valueOf(passwordField.getPassword());
				textField_2.setText(v);
				textField_2.setVisible(true);

				passwordField.setVisible(false);

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				textField_2.setText("");
				textField_2.setVisible(false);
				passwordField.setVisible(true);

			}
		});
		btnNewButton_1.setBounds(309, 120, 35, 23);
		contentPane.add(btnNewButton_1);

	}
}
