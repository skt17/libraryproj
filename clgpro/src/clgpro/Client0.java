package clgpro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Client0 {

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JPasswordField passwordField;
	static String nm="";
	static String rn="";
	static String q="";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client0 window = new Client0();
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
	public Client0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(136, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "civ", "cse", "ele", "mec"}));
		comboBox.setBounds(136, 56, 66, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DataInputStream dis=null;
				DataOutputStream dout=null;
				Socket s=null;
				try{
					 s=new Socket("localhost",7777);
					 dis=new DataInputStream(s.getInputStream());
					 dout=new DataOutputStream(s.getOutputStream());
					dout.writeUTF("0");
					rn=textField.getText();
					dout.writeUTF(rn);
					nm=String.valueOf(passwordField.getPassword());
					dout.writeUTF(nm);
					
					 q=(String)comboBox.getSelectedItem();
					dout.writeUTF(q);
					
					int i=Integer.valueOf(dis.readUTF());
					if(i==1)
					new Client1();
					
				}
				catch(Exception e){}
				finally{
					try{
						dis.close();
						dout.close();
						s.close();
					}catch(Exception e){}
					
				}
			}
		});
		btnNewButton.setBounds(40, 168, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(136, 110, 96, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("REGD_NO.");
		lblNewLabel.setBounds(23, 14, 66, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BRANCH");
		lblNewLabel_1.setBounds(23, 59, 52, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(23, 113, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Forgot Password?");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new C1();
				
			}
		});
		btnNewButton_1.setBounds(204, 154, 149, 14);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sign Up\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new C2().setVisible(true );;
			}
		});
		btnNewButton_2.setBounds(361, 36, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
