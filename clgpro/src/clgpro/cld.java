package clgpro;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Image;

public class cld {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cld window = new cld();
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
	public  cld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 896, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Regd No\r\n");
		lblNewLabel.setBounds(74, 129, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setVisible(false);
		textField = new JTextField();
		textField.setVisible(false);
		JTextPane txt = new JTextPane();
		txt.setText("GUIDED BY : \r\n KAMAKSHYA PRASAD NAYAK\r\nASSISTANT PROFESSOR,CSE\r\n\r\nMEMBERS :\r\nSRINATH KUMAR TRIPATHY\r\nSUBHAKANT SAHOO\r\nBIBEK RANA\r\nSOURAV KUMAR SAHA\r\nARPITAA MOHANTY\r\nNIBEDITA PATI\r\nTAINAZ BANO\r\nSUSHREE KRANTI KARUNIKA\r\nANURADHA MOHANTA\r\nKUNARAM TUDU\r\nSK SAMIM AKHTAR\r\n\r\n\r\nAll copyrights are reserved\r\n");
		frame.getContentPane().add(txt);
		txt.setVisible(false);
		txt.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(txt);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(37, 321, 420, 99);
		frame.getContentPane().add(scrollPane);
		scrollPane.setVisible(false);
		JButton btnNewButton_4 = new JButton("Update  Existing Book");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Ebook().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(568, 138, 230, 23);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4 .setVisible(false);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int l=arg0.getKeyCode();
				if(l==KeyEvent.VK_ENTER)
				{
				Connection con=null;
				Statement st=null;
				ResultSet rs=null;
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
			 st=con.createStatement();
			String s=textField.getText();
			textField.setText("");
			String k="",bn="";
			for(int i=0;i<3;i++){
				bn=bn+s.charAt(i);
			}
				
			for(int i=3;i<13;i++){
				k=k+s.charAt(i);
			}
			String n="",l1="",b="",y="";
			String cse="CSE",civ="CIV",mec="MEC",ele="ELE";
			if(bn.equals(civ)){
				b="civil";
			 rs=st.executeQuery("select NAME,y_join from civ where REGD_NO='"+k+"'");}
			else if(bn.equals(cse)){
				b="cse";
				 rs=st.executeQuery("select NAME,y_join from cse where REGD_NO='"+k+"'");}
			else if(bn.equals(ele)){
				b="elec";
				 rs=st.executeQuery("select NAME,y_join from ele where REGD_NO='"+k+"'");}
			else if(bn.equals(mec)){
				b="mec";
				 rs=st.executeQuery("select NAME,y_join from mec where REGD_NO='"+k+"'");}
				
			while(rs.next()){
				l1=rs.getString("NAME");
				y=rs.getString("y_join");
				
			}
			Part p=new Part();
			Part.textField.setText(l1);
			Part.textField_2.setText(k);
			Part.textField_15.setText(y);
						Part.textField_1.setText(b);
						Part.lblNewLabel.setVerticalAlignment(SwingConstants.TOP);try{
							String pn="E:\\"+k+".jpg";
							Part.lblNewLabel.setIcon(new ImageIcon(new ImageIcon(pn).getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT)));}catch(Exception e){
								System.out.println(e);
							}
						
						p.setVisible(true);
						
						}catch(Exception e){System.out.println(e);}	finally{try{
							rs.close();
							st.close();
							con.close();}catch(Exception e){}
						}
				
			}}
		});
		textField.setBounds(134, 126, 180, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
			
		JButton btnNewButton_1 = new JButton("ENTRY FOR NEW BOOK");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt.setVisible(false);
				scrollPane.setVisible(false);
				
				Part2 p2=new Part2();
				p2.setVisible(true);
				
						
				
				
			}
		});
		btnNewButton_1.setBounds(568, 184, 212, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Entry for Student Details");
		btnNewButton_2.setVisible(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt.setVisible(false);
				scrollPane.setVisible(false);
				
				
				Part1 p1=new Part1();
				p1.setVisible(true);
			
			}
		});
		btnNewButton_2.setBounds(544, 104, 254, 23);
		frame.getContentPane().add(btnNewButton_2);
		JButton btnAdminstrator = new JButton("Adminstrator");
		btnAdminstrator.setVisible(false);
		btnAdminstrator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt.setVisible(false);
				scrollPane.setVisible(false);
				
				btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true);
				btnNewButton_4 .setVisible(true);
			}
		});
		btnAdminstrator.setBounds(568, 246, 114, 23);
		frame.getContentPane().add(btnAdminstrator);
		
		JLabel lblNewLabel_1 = new JLabel("GOVERNMENT COLLEGE OF ENGINEERING, KALAHANDI");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(80, 21, 758, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("i");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt.setVisible(true);
				scrollPane.setVisible(true);
				scrollPane.getVerticalScrollBar().setValue(0);	
			}
		});
		btnNewButton_3.setBounds(702, 360, 40, 23); 
		frame.getContentPane().add(btnNewButton_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(120, 80, 134, 20);
		frame.getContentPane().add(passwordField_1);
		passwordField_1.setVisible(true);
		JButton btnNewButton = new JButton("Ok\r\n");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setVisible(true);	
		JLabel lblAdminPassword = new JLabel("Admin Password");
		lblAdminPassword.setBounds(22, 78, 117, 14);
		frame.getContentPane().add(lblAdminPassword);
		lblAdminPassword.setVisible(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String p=String.valueOf(passwordField_1 .getPassword());
			String p1="siku";
			if(p.equals(p1)){
				textField.setVisible(true);
				btnAdminstrator.setVisible(true);
				lblNewLabel.setVisible(true);
				passwordField_1.setVisible(false);
				lblAdminPassword.setVisible(false);

				btnNewButton.setVisible(false);
			}
			else{
				textField.setVisible(false);
				btnAdminstrator.setVisible(false);
				lblNewLabel.setVisible(false);
				passwordField_1.setVisible(true);
				btnNewButton.setVisible(true);
				lblAdminPassword.setVisible(true);
			
			}
				
			}
		});
		btnNewButton.setBounds(333, 77, 55, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
	}
}
