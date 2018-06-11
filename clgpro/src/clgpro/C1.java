package clgpro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class C1 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	Socket s=null;
	 DataInputStream dis=null;
	 DataOutputStream dout=null;
	 private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C1 window = new C1();
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
	public C1() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblNewLabel = new JLabel("REGD_NO\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setBounds(38, 14, 66, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(127, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("HINT");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(71, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 140, 86, 20);
		frame.getContentPane().add(passwordField);
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(127, 140, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);
		JLabel lblNewLabel_2 = new JLabel("NEW PASSWORD");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 143, 107, 14);
		frame.getContentPane().add(lblNewLabel_2);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "cse ", "mec ", "ele", "civ"}));
		comboBox.setBounds(137, 42, 53, 20);
		frame.getContentPane().add(comboBox);
	
	
		JButton btnNewButton = new JButton("Ok\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String pa="";
					 s=new Socket("localhost",7777);
					  dis=new DataInputStream(s.getInputStream());
					 dout=new DataOutputStream(s.getOutputStream());
						dout.writeUTF("3");
						dout.writeUTF(textField.getText());
						dout.writeUTF(textField_1.getText());
						String bn=(String)comboBox.getSelectedItem();
						dout.writeUTF(bn);
						
						int n=Integer.valueOf(dis.readUTF());
						if(n==1)
						{
						//	passwordField.setVisible(true); 
							//m();
							pa=String.valueOf(passwordField.getPassword());
							dout.writeUTF(pa);
								
						}
						else if(n==0)
							JOptionPane.showMessageDialog(null,"YOUR REGD_NO & HINT NOT MATCH");
				}
				catch(Exception e){}
				
			}
		});
		btnNewButton.setBounds(38, 206, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 90, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				passwordField.setVisible(true);
				textField_2.setVisible(false);
			}
		});
		btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				passwordField.setVisible(false);
				textField_2.setVisible(true);
				String b=String.valueOf(passwordField.getPassword());
				textField_2.setText(b);
			}
		});
		//static void m(){}
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			}
		});
		btnNewButton_1.setBounds(223, 139, 12, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(48, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
