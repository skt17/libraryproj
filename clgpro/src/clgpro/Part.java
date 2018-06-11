package clgpro;

import java.awt.BorderLayout;


import java.util.*;
import java.util.Date;
import java.awt.EventQueue;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JCheckBox;


public class Part extends JFrame  {

	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
public static JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblNewLabel_6;
	private JLabel label;
	private JLabel label_1;
	private JList list_1;
	public String d="";
	private JList list_2;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public static JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	int x=0,y=0,z=0;
	public String cse="cse",civ="civil",mec="mec",ele="elec";
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	String f1="",f2="",f3="",f4="",f5="",f6="";
	private JButton btnNewButton_2;
	public static JLabel lblNewLabel;
	static String rno,bn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Part frame = new Part();
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
	public Part() {
		
		setBounds(100, 100, 1313, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(780, 11, 86, 85);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:\r\n");
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(55, 11, 471, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH:\r\n");
		lblNewLabel_2.setBounds(10, 46, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(55, 43, 86, 14);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("YEAR OF JOINING\r\n");
		lblNewLabel_3.setBounds(10, 83, 104, 14);
	contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(252, 46, 86, 14);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Acc No.\r\n");
		lblNewLabel_4.setBounds(107, 136, 46, 14);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		JLabel lblNewLabel_5 = new JLabel("BOOK NAME");
		lblNewLabel_5.setBounds(279, 136, 86, 14);
	contentPane.add(lblNewLabel_5);
	lblNewLabel_5.setVisible(false);
	
		textField_3 = new JTextField();
		textField_3.setBounds(88, 161, 75, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(88, 209, 75, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(88, 277, 75, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(173, 161, 565, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(173, 209, 565, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(173, 277, 565, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setBounds(780, 136, 86, 14);
		contentPane.add(lblAuthor);
		lblAuthor.setVisible(false);
		textField_9 = new JTextField();
		textField_9.setBounds(748, 161, 210, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(748, 209, 210, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(748, 277, 210, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		lblNewLabel_6 = new JLabel("1\r\n\r\n");
		lblNewLabel_6.setBounds(68, 161, 17, 20);
	contentPane.add(lblNewLabel_6);
	lblNewLabel_6.setVisible(false);
		label = new JLabel("2");
		label.setBounds(68, 209, 17, 20);
		contentPane.add(label);
		label.setVisible(false);
		label_1 = new JLabel("3");
		label_1.setBounds(70, 277, 8, 20);
	contentPane.add(label_1);
	label_1.setVisible(false);
		JList list = new JList();
		list.setBounds(173, 182, 565, 149);
		contentPane.add(list);
		list.setVisible(false);
		DefaultListModel dlm=new DefaultListModel();
		list.setModel(dlm);
		
		
		list_1 = new JList();
		list_1.setBounds(173, 229, 565, 149);
		
		contentPane.add(list_1);
		list_1.setModel(dlm);
		
		list_1.setVisible(false);
		list_2 = new JList();
		list_2.setBounds(173, 299, 565, 132);
		contentPane.add(list_2);
		list_2.setVisible(false);
		list_2.setModel(dlm);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textField_7.setVisible(false);
		textField_8.setVisible(false);
		textField_9.setVisible(false);
		textField_10.setVisible(false);
		textField_11.setVisible(false);
		JCheckBox chckbxNewCheckBox = new JCheckBox("\r\n");
		chckbxNewCheckBox.setBounds(39, 160, 25, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(39, 208, 22, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\r\n");
		chckbxNewCheckBox_2.setBounds(39, 276, 25, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_9 = new JLabel("Select");
		lblNewLabel_9.setBounds(18, 136, 46, 14);
		contentPane.add(lblNewLabel_9);
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(575, 11, 8, -1);
		contentPane.add(lblNewLabel_10);
		chckbxNewCheckBox.setVisible(false);
		chckbxNewCheckBox_1.setVisible(false);
		chckbxNewCheckBox_2.setVisible(false);
		lblNewLabel_9.setVisible(false);
		
		JLabel lblIssueDt = new JLabel("Issue Dt");
		lblIssueDt.setBounds(1118, 136, 46, 14);
		contentPane.add(lblIssueDt);
		
		textField_12 = new JTextField();
		textField_12.setBounds(1089, 161, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(1089, 209, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(1089, 277, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Regd_No");
		lblNewLabel_7.setBounds(180, 46, 75, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(107, 80, 86, 14);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Return Dt");
		lblNewLabel_8.setBounds(1215, 136, 72, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_16 = new JTextField();
		textField_16.setBounds(1185, 161, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(1185, 209, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(1185, 277, 86, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		JLabel lblNewLabel_11 = new JLabel("Aval. Book");
		lblNewLabel_11.setBounds(980, 136, 75, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setBounds(979, 161, 86, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setBounds(979, 209, 86, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setBounds(980, 277, 86, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		lblNewLabel_11.setVisible(false);
		textField_19.setVisible(false);
		textField_20.setVisible(false);
		textField_21.setVisible(false);
		
	
	textField_12.setVisible(false);	
	textField_13.setVisible(false);	
	textField_14.setVisible(false);	
	textField_16.setVisible(false);	
	textField_17.setVisible(false);	
	textField_18.setVisible(false);	
	lblIssueDt.setVisible(false);
	lblNewLabel_8.setVisible(false);
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				list.setVisible(true);
				String a="";
				String s=textField_6.getText();
				if(s.equals(a)){
					list.setVisible(false);
					textField_7.setVisible(true);
					
				}
				else{
				textField_7.setVisible(false);
				Connection con=null;
				Statement st=null;
				ResultSet rs=null;
				ResultSet rs1=null;
				Connection con1=null;
				Statement st1=null;
				
				try{
					dlm.removeAllElements();
				Class.forName("com.mysql.jdbc.Driver");	
				String z1="";
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
			
			st=con.createStatement();
			 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
				
				st1=con1.createStatement();
				
			String s3=textField_1.getText();
			if(s3.equals(cse)){
			 rs=st.executeQuery("select Book_name,Pub_name from cse where Book_name like'"+s+"%'");
			 //st.close();
			//st=con.createStatement();
				
			}
			else if(s3.equals(civ))
				 rs=st.executeQuery("select Book_name,Pub_name from civ where Book_name like'"+s+"%'");
			else if(s3.equals(ele))
				 rs=st.executeQuery("select Book_name,Pub_name from ele where Book_name like'"+s+"%'");
			else if(s3.equals(mec))
				 rs=st.executeQuery("select Book_name,Pub_name from mec where Book_name like'"+s+"%'");
			 rs1=st1.executeQuery("select Book_name,Pub_name from common where Book_name like'"+s+"%'");
					
			while(rs.next()){
				f1=rs.getString("Book_name");
				//System.out.print(f1);
						f2=rs.getString("Pub_name");
						z1=f1+","+f2;
						dlm.addElement(z1);
									
			}
			while(rs1.next()){
				f1=rs1.getString("Book_name");
						f2=rs1.getString("Pub_name");
						z1=f1+","+f2;
						dlm.addElement(z1);
									
			}
			
				}catch(Exception e){}
				finally{try{
					rs.close();
					st.close();
					con.close();
					con1.close();
						
				}catch(Exception e){}
				}
				}
				
			}
		});
		
		list.addMouseListener(new MouseAdapter() {
			   @Override
			public void mouseClicked(MouseEvent arg0) {
				list.setVisible(false);
				textField_7.setVisible(true);
				
				String st=(String)list.getSelectedValue();
				textField_6.setText(st);
				Connection con=null;
				Statement st1=null;
				ResultSet rs1=null;
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				String z1="";
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
			String g1=textField_6.getText();String m1="",h1="";int i=0;
			for(i=0;i<g1.length();i++)
			{
				if(g1.charAt(i)==',')
					break;
				else
					m1=m1+g1.charAt(i);
					}
			for(int j=i+1;j<g1.length();j++)
				h1=h1+g1.charAt(j);
			
			st1=con.createStatement();
			String s3=textField_1.getText();
			if(s3.equals(cse)){
			 rs1=st1.executeQuery("select Author,Avail_book from cse where Book_name='"+m1+"'&&Pub_name='"+h1+"'");}
			else if(s3.equals(civ))
				 rs1=st1.executeQuery("select Author,Avail_book from civ where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(ele))
				 rs1=st1.executeQuery("select Author,Avail_book from ele where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(mec))
				 rs1=st1.executeQuery("select Author,Avail_book from mec where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
				
			while(rs1.next()){
				textField_9.setText(rs1.getString("Author"));	
				textField_19.setText(String.valueOf(rs1.getInt("Avail_book")));	
				
			}
			int r=Integer.valueOf(textField_19.getText());
			if(r==0){
				JOptionPane.showMessageDialog(null,"BOOK IS UNAVAILABLE");
			textField_3.setText("0");	
			textField_6.setText("");	
			textField_9.setText("");	
			
			}
			
				}catch(Exception e){}
				finally{try{
					rs1.close();
					st1.close();
					con.close();}catch(Exception e){}
				}
				
				
			}
		});
	
		
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(true);
				String a="";
				String s=textField_7.getText();
				if(s.equals(a)){
					list_1.setVisible(false);
					textField_8.setVisible(true);
					
				}
				else{
				textField_8.setVisible(false);
				Connection con=null;
				Statement st=null;
				ResultSet rs=null;
				Connection con1=null;
				Statement st1=null;
				ResultSet rs1=null;
				
				try{
					dlm.removeAllElements();
				Class.forName("com.mysql.jdbc.Driver");	
				
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
			String z2="";
			 st=con.createStatement();
			 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
				
				st1=con1.createStatement();
				
			 String s4=textField_1.getText();
				if(s4.equals(cse))
				rs=st.executeQuery("select Book_name,Pub_name from cse where Book_name like'"+s+"%'");
				else if(s4.equals(civ))
					rs=st.executeQuery("select Book_name,Pub_name from civ where Book_name like'"+s+"%'");
				else if(s4.equals(ele))
					rs=st.executeQuery("select Book_name,Pub_name from ele where Book_name like'"+s+"%'");
				else if(s4.equals(mec))
					rs=st.executeQuery("select Book_name,Pub_name from mec where Book_name like'"+s+"%'");
				rs1=st1.executeQuery("select Book_name,Pub_name from common where Book_name like'"+s+"%'");
				
				while(rs.next()){
					f3=rs.getString("Book_name");
			
				f4=rs.getString("Pub_name");
				z2=f3+","+f4;
				dlm.addElement(z2);
				
				
			}
				while(rs1.next()){
					f3=rs1.getString("Book_name");
			
				f4=rs1.getString("Pub_name");
				z2=f3+","+f4;
				dlm.addElement(z2);
				
				
			}
			
				
				}catch(Exception e){}
				finally{try{
					rs.close();
					st.close();
					con.close();
					con1.close();	
				}catch(Exception e){}
				
				}}
			
			
				
			}
		});
		
		list_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(false);
				textField_8.setVisible(true);
				String st=(String)list_1.getSelectedValue();
				textField_7.setText(st);
				Connection con=null;
				Statement st1=null;
				ResultSet rs1=null;
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
				String g1=textField_7.getText();String m1="",h1="";int i=0;
				for(i=0;i<g1.length();i++)
				{
					if(g1.charAt(i)==',')
						break;
					else
						m1=m1+g1.charAt(i);
						}
				for(int j=i+1;j<g1.length();j++)
					h1=h1+g1.charAt(j);
				
			st1=con.createStatement();
			String s3=textField_1.getText();
			if(s3.equals(cse))
			 rs1=st1.executeQuery("select Author,Avail_book from cse where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(civ))
				 rs1=st1.executeQuery("select Author,Avail_book from civ where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(ele))
				 rs1=st1.executeQuery("select Author,Avail_book from ele where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(mec))
				 rs1=st1.executeQuery("select Author,Avail_book from mec where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
				
			while(rs1.next()){
				textField_10.setText(rs1.getString("Author"));	
				textField_20.setText(String.valueOf(rs1.getInt("Avail_book")));	
				
			}
			int r=Integer.valueOf(textField_20.getText());
			if(r==0){
				JOptionPane.showMessageDialog(null,"BOOK IS UNAVAILABLE");
				textField_4.setText("0");	
				textField_7.setText("");	
				textField_10.setText("");	
					
			}
			
				}catch(Exception e){}
				finally{try{
					rs1.close();
					st1.close();
					con.close();}catch(Exception e){}
				}
				
			}
		});

		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(false);
				list_2.setVisible(true);
				String a="";
				String s=textField_8.getText();
				if(s.equals(a)){
					list_2.setVisible(false);
					
				}
				else{
				Connection con=null;
				Statement st=null;
				ResultSet rs=null;
				Connection con1=null;
				Statement st1=null;
				ResultSet rs1 =null;
				
				try{
					dlm.removeAllElements();
				Class.forName("com.mysql.jdbc.Driver");	
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
			String z3="";
					st=con.createStatement();
					 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
						
						st1=con1.createStatement();
					
			 String s5=textField_1.getText();
				if(s5.equals(cse))
					rs=st.executeQuery("select Book_name,Pub_name from cse where Book_name like'"+s+"%'");
				else if(s5.equals(civ))
					rs=st.executeQuery("select Book_name,Pub_name from civ where Book_name like'"+s+"%'");
				else if(s5.equals(ele))
					rs=st.executeQuery("select Book_name,Pub_name from ele where Book_name like'"+s+"%'");
				else if(s5.equals(mec))
					rs=st.executeQuery("select Book_name,Pub_name from mec where Book_name like'"+s+"%'");
				rs1=st1.executeQuery("select Book_name,Pub_name from common where Book_name like'"+s+"%'");
					
					 
			while(rs.next()){
				f5=rs.getString("Book_name");
				f6=rs.getString("Pub_name");
			
				z3=f5+","+f6;
				dlm.addElement(z3);
				
				
			}
			while(rs1.next()){
				f5=rs1.getString("Book_name");
				f6=rs1.getString("Pub_name");
			
				z3=f5+","+f6;
				dlm.addElement(z3);
				
				
			}
		
				}catch(Exception e){}	finally{try{
					rs.close();
					st.close();
					con.close();
				con1.close();	
				}catch(Exception e){}
				}}
			
			
				
			}
		});
		
		list_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				list.setVisible(false);
				list_1.setVisible(false);
				list_2.setVisible(false);
				
							String st=(String)list_2.getSelectedValue();
				textField_8.setText(st);
				String g1=textField_8.getText();String m1="",h1="";int i=0;
				for(i=0;i<g1.length();i++)
				{
					if(g1.charAt(i)==',')
						break;
					else
						m1=m1+g1.charAt(i);
						}
				for(int j=i+1;j<g1.length();j++)
					h1=h1+g1.charAt(j);
				
				Connection con=null;
				Statement st1=null;
				ResultSet rs1=null;
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				String z1="";
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
			
			st1=con.createStatement();
			String s3=textField_1.getText();
			if(s3.equals(cse))
			 rs1=st1.executeQuery("select Author,Avail_book from cse where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(civ))
				 rs1=st1.executeQuery("select Author,Avail_book from civ where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(ele))
				 rs1=st1.executeQuery("select Author,Avail_book from ele where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
			else if(s3.equals(mec))
				 rs1=st1.executeQuery("select Author,Avail_book from mec where Book_name='"+m1+"'&&Pub_name='"+h1+"'");
				
			while(rs1.next()){
				textField_11.setText(rs1.getString("Author"));		
				textField_21.setText(String.valueOf(rs1.getInt("Avail_book")));	
				
			}
			int r=Integer.valueOf(textField_21.getText());
			if(r==0){
				JOptionPane.showMessageDialog(null,"BOOK IS UNAVAILABLE");
				textField_5.setText("0");	
				textField_8.setText("");	
				textField_11.setText("");	
					
			}
			
				}catch(Exception e){}
				finally{try{
					rs1.close();
					st1.close();
					con.close();}catch(Exception e){}
				}
				
			}
		});
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	
		try{
			Class.forName("com.mysql.jdbc.Driver");	
	
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
			String s="",q="";
		
		
		 st=con.createStatement();	
		String g="";
		 rs=st.executeQuery("select Name from cse where REGD_NO='"+s+"'");
		while(rs.next()){
		g=rs.getString("NAME");
				
			
		}
		textField.setText(g);
		
		JButton btnBook = new JButton("Book  Issue");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_10.setText("1");
				chckbxNewCheckBox.setVisible(false);
				chckbxNewCheckBox_1.setVisible(false);
				chckbxNewCheckBox_2.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
				lblAuthor.setVisible(true);
				lblNewLabel_6.setVisible(true);
				label.setVisible(true);
				label_1.setVisible(true);
				textField_3.setVisible(true);
				textField_4 .setVisible(true);
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
				textField_16.setVisible(false);	
				textField_17.setVisible(false);	
				textField_18.setVisible(false);	
				lblIssueDt.setVisible(true);
				lblNewLabel_11.setVisible(true);
				textField_19.setVisible(true);
				textField_20.setVisible(true);
				textField_21.setVisible(true);
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				
				lblNewLabel_8.setVisible(false);
				int a,b,c;
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			String p=textField_1.getText();
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
			
			 st=con.createStatement();
			 if(p.equals(cse)){
			 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from cse where REGD_NO='"+textField_2.getText()+"'");
			 } else if(p.equals(civ))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from civ where REGD_NO='"+textField_2.getText()+"'");
			 else if(p.equals(ele))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from ele where REGD_NO='"+textField_2.getText()+"'");
			 else if(p.equals(mec))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from mec where REGD_NO='"+textField_2.getText()+"'");
				
			 while(rs.next()){
				textField_3.setText(rs.getString("BOOK_1NO"));
				textField_6.setText(rs.getString("BOOK_1NAME"));
				textField_9.setText(rs.getString("AUTHOR_1"));
				textField_12.setText(rs.getString("Book_1Idate"));
				textField_4.setText(rs.getString("BOOK_2NO"));
				textField_7.setText(rs.getString("BOOK_2NAME"));
				textField_10.setText(rs.getString("AUTHOR_2"));
				textField_13.setText(rs.getString("Book_2Idate"));
				
				textField_5.setText(rs.getString("BOOK_3NO"));
				textField_8.setText(rs.getString("BOOK_3NAME"));
				textField_11.setText(rs.getString("AUTHOR_3"));
				textField_14.setText(rs.getString("Book_3Idate"));
				
			}
			a=Integer.valueOf(textField_3.getText());
			b=Integer.valueOf(textField_4.getText());
			c=Integer.valueOf(textField_5.getText());
			LocalDate dt = LocalDate.now();
			 String f=String.valueOf(dt);int j=0;String s="";
			 String f1[]=new String[5];
			for(int i=0;i<f.length();i++){
			if(f.charAt(i)=='-'){
				j=j+1;
				s="";}else{
			s=s+String.valueOf(f.charAt(i));
			f1[j]=s;}
			}
			String st2=f1[2]+"-"+f1[1]+"-"+f1[0];

		if(a!=0){
			textField_3.setEditable(false);
			textField_6.setEditable(false);
			textField_9.setEditable(false);
			textField_12.setEditable(false);
			x=1;
			
						}else{
							x=0;
							textField_3.setEditable(true);
						textField_6.setEditable(true);
						textField_9.setEditable(true);
						textField_12.setEditable(true);
						textField_12.setText(st2);

						}
		if(b!=0){
			textField_4.setEditable(false);
			textField_7.setEditable(false);
			textField_10.setEditable(false);
			textField_13.setEditable(false);
			y=1;
			
						}
		else{
			y=0;
			textField_4.setEditable(true);
			textField_7.setEditable(true);
			textField_10.setEditable(true);
			textField_13.setEditable(true);
			textField_13.setText(st2);

		}
		if(c!=0){
			textField_5.setEditable(false);
			textField_8.setEditable(false);
			textField_11.setEditable(false);
			textField_14.setEditable(false);
			z=1;
			
						}else{
							z=0;
							textField_5.setEditable(true);
							textField_8.setEditable(true);
							textField_11.setEditable(true);
							textField_14.setEditable(true);
							textField_14.setText(st2);
	
						}
		
				}catch(Exception e){e.printStackTrace();;}
				finally{try{
					rs.close();
					st.close();
					con.close();}
				
				catch(Exception e){}
				
							
				
				}
				
				
				
			}
		});
		btnBook.setForeground(Color.BLACK);
		btnBook.setBounds(145, 105, 126, 23);
		contentPane.add(btnBook);
		

		JButton btnNewButton = new JButton("Book Renew");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_10.setText("2");
				chckbxNewCheckBox.setVisible(true);
				chckbxNewCheckBox_1.setVisible(true);
				chckbxNewCheckBox_2.setVisible(true);
				lblNewLabel_9.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
				lblAuthor.setVisible(true);
				lblNewLabel_6.setVisible(true);
				label.setVisible(true);
				label_1.setVisible(true);
				lblIssueDt.setVisible(true);
				textField_3.setVisible(true);
				textField_4 .setVisible(true);
				textField_5.setVisible(true);
				textField_6.setVisible(true);
				textField_7.setVisible(true);
				textField_8.setVisible(true);
				textField_9.setVisible(true);
				textField_10.setVisible(true);
				textField_3.setEditable(false);
				textField_6.setEditable(false);
				textField_9.setEditable(false);
				textField_12.setEditable(false);
				textField_4.setEditable(false);
				textField_7.setEditable(false);
				textField_10.setEditable(false);
				textField_13.setEditable(false);
				textField_5.setEditable(false);
				textField_8.setEditable(false);
				textField_11.setEditable(false);
				textField_14.setEditable(false);
				textField_16.setVisible(false);
				textField_17.setVisible(false);
				textField_18.setVisible(false);
				lblNewLabel_11.setVisible(false);
				textField_19.setVisible(false);
				textField_20.setVisible(false);
				textField_21.setVisible(false);
				
				lblNewLabel_8.setVisible(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				
			textField_11.setVisible(true);
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			String p1=textField_1.getText();
						
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
			
			 st=con.createStatement();
			 if(p1.equals(cse))
			 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from cse where REGD_NO='"+textField_2.getText()+"'");
			 else if(p1.equals(civ))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from civ where REGD_NO='"+textField_2.getText()+"'");
			 else if(p1.equals(ele))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from ele where REGD_NO='"+textField_2.getText()+"'");
			 else if(p1.equals(mec))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from mec where REGD_NO='"+textField_2.getText()+"'");
				
			 while(rs.next()){
				textField_3.setText(String.valueOf(rs.getInt("BOOK_1NO")));
				textField_6.setText(rs.getString("BOOK_1NAME"));
				textField_9.setText(rs.getString("AUTHOR_1"));
				textField_12.setText(rs.getString("Book_1Idate"));
				
				textField_4.setText(String.valueOf(rs.getString("BOOK_2NO")));
				textField_7.setText(rs.getString("BOOK_2NAME"));
				textField_10.setText(rs.getString("AUTHOR_2"));
				textField_13.setText(rs.getString("Book_2Idate"));
				
				textField_5.setText(String.valueOf(rs.getString("BOOK_3NO")));
				textField_8.setText(rs.getString("BOOK_3NAME"));
				textField_11.setText(rs.getString("AUTHOR_3"));
				textField_14.setText(rs.getString("Book_3Idate"));
				
		
			}
				}catch(Exception e){System.out.println(e);}
				finally{try{
					rs.close();
					st.close();
					con.close();}catch(Exception e){}
				}
				textField_12.setVisible(true);
				textField_13.setVisible(true);
				textField_14.setVisible(true);

				 
LocalDate date = LocalDate.now();
 d=String.valueOf(date);String[] a=new String[10];int j=0;String s="";
for(int i=0;i<d.length();i++){
if(d.charAt(i)=='-'){
	j=j+1;
	s="";}else{
s=s+String.valueOf(d.charAt(i));
a[j]=s;}
}
String str=a[2]+"-"+a[1]+"-"+a[0];

				textField_12.setText(str);
				textField_13.setText(str);
				textField_14.setText(str);

				
			
				
			}
		});
		btnNewButton.setBounds(348, 102, 126, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Book Deposit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_10.setText("3");
				chckbxNewCheckBox.setVisible(true);
				chckbxNewCheckBox_1.setVisible(true);
				chckbxNewCheckBox_2.setVisible(true);
				lblNewLabel_9.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
				lblAuthor.setVisible(true);
				lblNewLabel_6.setVisible(true);
				label.setVisible(true);
				label_1.setVisible(true);
				textField_3.setVisible(true);
				textField_4 .setVisible(true);
				textField_5.setVisible(true);
				textField_6.setVisible(true);
				textField_7.setVisible(true);
				textField_8.setVisible(true);
				textField_9.setVisible(true);
				textField_10.setVisible(true);
				lblNewLabel_11.setVisible(false);
				textField_19.setVisible(false);
				textField_20.setVisible(false);
				textField_21.setVisible(false);
				
				
			textField_11.setVisible(true);
			textField_12.setVisible(true);
			textField_13.setVisible(true);
			textField_14.setVisible(true);
			textField_16.setVisible(true);
			textField_17.setVisible(true);
			textField_18.setVisible(true);
			lblIssueDt.setVisible(true);
			lblNewLabel_8.setVisible(true);
			textField_3.setEditable(false);
			textField_4.setEditable(false);
			textField_5.setEditable(false);
			textField_6.setEditable(false);
			textField_7.setEditable(false);
			textField_8.setEditable(false);
			textField_9.setEditable(false);
			textField_10.setEditable(false);
			textField_11.setEditable(false);
			textField_12.setEditable(false);
			textField_13.setEditable(false);
			textField_14.setEditable(false);
			textField_15.setEditable(false);
			textField_16.setEditable(true);
			textField_17.setEditable(true);
			textField_18.setEditable(true);
			chckbxNewCheckBox.setSelected(false);
			chckbxNewCheckBox_1.setSelected(false);
			chckbxNewCheckBox_2.setSelected(false);
			
			LocalDate date = LocalDate.now();
			 d=String.valueOf(date);String[] a=new String[10];int j=0;String s="";
			for(int i=0;i<d.length();i++){
			if(d.charAt(i)=='-'){
				j=j+1;
				s="";}else{
			s=s+String.valueOf(d.charAt(i));
			a[j]=s;}
			}
			String str=a[2]+"-"+a[1]+"-"+a[0];

							textField_16.setText(str);
							textField_17.setText(str);
							textField_18.setText(str);

			
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			String p2=textField_1.getText();
						
				try{
				Class.forName("com.mysql.jdbc.Driver");	
				
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
			
			 st=con.createStatement();
			 if(p2.equals(cse))
			 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from cse where REGD_NO='"+textField_2.getText()+"'");
			 else if(p2.equals(civ))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from civ where REGD_NO='"+textField_2.getText()+"'");
			 else if(p2.equals(ele))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from ele where REGD_NO='"+textField_2.getText()+"'");
			 else if(p2.equals(mec))
				 rs=st.executeQuery("select BOOK_1NO,BOOK_1NAME,AUTHOR_1,Book_1Idate,BOOK_2NO,BOOK_2NAME,AUTHOR_2,Book_2Idate,BOOK_3NO,BOOK_3NAME,AUTHOR_3,Book_3Idate from mec where REGD_NO='"+textField_2.getText()+"'");
			
			 while(rs.next()){
				textField_3.setText(String.valueOf(rs.getInt("BOOK_1NO")));
				textField_6.setText(rs.getString("BOOK_1NAME"));
				textField_9.setText(rs.getString("AUTHOR_1"));
				textField_12.setText(rs.getString("Book_1Idate"));
				
				textField_4.setText(String.valueOf(rs.getString("BOOK_2NO")));
				textField_7.setText(rs.getString("BOOK_2NAME"));
				textField_10.setText(rs.getString("AUTHOR_2"));
				textField_13.setText(rs.getString("Book_2Idate"));
				
				textField_5.setText(String.valueOf(rs.getString("BOOK_3NO")));
				textField_8.setText(rs.getString("BOOK_3NAME"));
				textField_11.setText(rs.getString("AUTHOR_3"));
				textField_14.setText(rs.getString("Book_3Idate"));
				
			}
				}catch(Exception e){System.out.println(e);}
				finally{try{
					rs.close();
					st.close();
					con.close();}catch(Exception e){}
				}
				
			
				
			}
		});
		btnNewButton_1.setBounds(540, 102, 151, 23);
		contentPane.add(btnNewButton_1);
		
		
	
			
		}catch(Exception e){System.out.print(e);}
		finally{try{
			rs.close();
			st.close();
			con.close();}catch(Exception e){}
		}
		JButton btnOk_1  = new JButton("ok");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				int n=Integer.valueOf(lblNewLabel_10.getText());
				String p4=textField_1.getText();
				Connection con=null;
				Statement st=null;
				if(n==1){
				String q="";
				if(textField_3.getText().equals(q)){
					textField_3.setText("0");
					
				}
				else if(textField_4.getText().equals(q)){
					textField_4.setText("0");
					
				}
				else if(textField_5.getText().equals(q)){
					textField_5.setText("0");
					
				}
				
				try{
					String b[]=new String[30];
					String c[]=new String[30];
					String d[]=new String[30];
					String e[]=new String[30];int p=0;
					int i=0;
					Class.forName("com.mysql.jdbc.Driver");	
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
						
					if(x==0){
						b[0]=textField_3.getText();
						c[0]=textField_6.getText();
                        d[0]=textField_9.getText();
						e[0]=textField_12.getText();
						
						}
					if(y==0){
						b[1]=textField_4.getText();
						c[1]=textField_7.getText();
                        d[1]=textField_10.getText();
						
                        e[1]=textField_13.getText();
                    	
					}
					if(z==0){
						b[2]=textField_5.getText();
						c[2]=textField_8.getText();
                        d[2]=textField_11.getText();
						e[2]=textField_14.getText();
												
					}
				
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
				
			
			 st=con.createStatement();
			if(x==0){
				if(p4.equals(cse))
			st.executeUpdate("UPDATE  cse SET BOOK_1NO='"+b[0]+"',BOOK_1NAME='"+c[0]+"',AUTHOR_1='"+d[0]+"',Book_1Idate='"+e[0]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(civ))
					st.executeUpdate("UPDATE  civ SET BOOK_1NO='"+b[0]+"',BOOK_1NAME='"+c[0]+"',AUTHOR_1='"+d[0]+"',Book_1Idate='"+e[0]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(ele))
					st.executeUpdate("UPDATE ele SET BOOK_1NO='"+b[0]+"',BOOK_1NAME='"+c[0]+"',AUTHOR_1='"+d[0]+"',Book_1Idate='"+e[0]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(mec))
					st.executeUpdate("UPDATE  mec SET BOOK_1NO='"+b[0]+"',BOOK_1NAME='"+c[0]+"',AUTHOR_1='"+d[0]+"',Book_1Idate='"+e[0]+"' where REGD_NO='"+textField_2.getText()+"'");
			

				String g1=textField_6.getText();String m1="",h1="";int ii=0;
				for(ii=0;ii<g1.length();ii++)
				{
					if(g1.charAt(ii)==',')
						break;
					else
						m1=m1+g1.charAt(ii);
						}
				for(int j=ii+1;j<g1.length();j++)
					h1=h1+g1.charAt(j);
				
				
				Statement st1=con1.createStatement();int n1=0;
				if(p4.equals(cse))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from cse where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update cse set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"' ");
				}
				else if(p4.equals(civ))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from civ where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update civ set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"' ");
				}
				else if(p4.equals(ele))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from ele where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update ele set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"' ");
				}
				else if(p4.equals(mec))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from mec where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update mec set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[0]+"' ");
				}
				
			}
			if(y==0){
				if(p4.equals(cse))
				st.executeUpdate("UPDATE  cse SET BOOK_2NO='"+b[1]+"',BOOK_2NAME='"+c[1]+"',AUTHOR_2='"+d[1]+"',Book_2Idate='"+e[1]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(civ))
					st.executeUpdate("UPDATE  civ SET BOOK_2NO='"+b[1]+"',BOOK_2NAME='"+c[1]+"',AUTHOR_2='"+d[1]+"',Book_2Idate='"+e[1]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(ele))
					st.executeUpdate("UPDATE  ele SET BOOK_2NO='"+b[1]+"',BOOK_2NAME='"+c[1]+"',AUTHOR_2='"+d[1]+"',Book_2Idate='"+e[1]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(mec))
					st.executeUpdate("UPDATE  mec SET BOOK_2NO='"+b[1]+"',BOOK_2NAME='"+c[1]+"',AUTHOR_2='"+d[1]+"',Book_2Idate='"+e[1]+"' where REGD_NO='"+textField_2.getText()+"'");

				String g1=textField_7.getText();String m1="",h1="";int ii=0;
				for(ii=0;ii<g1.length();ii++)
				{
					if(g1.charAt(ii)==',')
						break;
					else
						m1=m1+g1.charAt(ii);
						}
				for(int j=ii+1;j<g1.length();j++)
					h1=h1+g1.charAt(j);
				
				
				Statement st1=con1.createStatement();int n1=0;
            	if(p4.equals(cse))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from cse where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update cse set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"' ");
				}
				else if(p4.equals(civ))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from civ where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update civ set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"' ");
				}
				else if(p4.equals(ele))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from ele where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update ele set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"' ");
				}
				else if(p4.equals(mec))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from mec where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update mec set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[1]+"' ");
				}
				
					
			
			}
			if(z==0){
				if(p4.equals(cse))
				st.executeUpdate("UPDATE  cse SET BOOK_3NO='"+b[2]+"',BOOK_3NAME='"+c[2]+"',AUTHOR_3='"+d[2]+"',Book_3Idate='"+e[2]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(civ))
					st.executeUpdate("UPDATE  civ SET BOOK_3NO='"+b[2]+"',BOOK_3NAME='"+c[2]+"',AUTHOR_3='"+d[2]+"',Book_3Idate='"+e[2]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(ele))
					st.executeUpdate("UPDATE  ele SET BOOK_3NO='"+b[2]+"',BOOK_3NAME='"+c[2]+"',AUTHOR_3='"+ d[2]+"',Book_3Idate='"+e[2]+"' where REGD_NO='"+textField_2.getText()+"'");
				else if(p4.equals(mec))
					st.executeUpdate("UPDATE  mec SET BOOK_3NO='"+b[2]+"',BOOK_3NAME='"+c[2]+"',AUTHOR_3='"+d[2]+"',Book_3Idate='"+e[2]+"' where REGD_NO='"+textField_2.getText()+"'");

				String g1=textField_8.getText();String m1="",h1="";int ii=0;
			for(ii=0;ii<g1.length();ii++)
			{
				if(g1.charAt(ii)==',')
					break;
				else
					m1=m1+g1.charAt(ii);
					}
			for(int j=ii+1;j<g1.length();j++)
				h1=h1+g1.charAt(j);
			
			
				Statement st1=con1.createStatement();int n1=0;
				if(p4.equals(cse))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from cse where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update cse set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"' ");
				}
				else if(p4.equals(civ))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from civ where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update civ set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"' ");
				}
				else if(p4.equals(ele))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from ele where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update ele set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"' ");
				}
				else if(p4.equals(mec))
				{
				ResultSet rs=st1.executeQuery("select Avail_book from mec where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"'");
				while(rs.next())
					n1=rs.getInt("Avail_book");
				n1=n1-1;
				st1.executeUpdate("Update mec set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+d[2]+"' ");
				}
				

			}
			JOptionPane.showMessageDialog(null,"UPDATED SUCESSFULLY");
			
				}catch(Exception e){
					JOptionPane.showMessageDialog(null," NOT UPDATED");
					System.out.println(e);}
				finally{try{
					st.close();
					con.close();}catch(Exception e){System.out.println(e);}
				}}
				else if(n==2){
					Connection con1=null;
					Statement st1=null;
					ResultSet rs1=null;
			try{
				Class.forName("com.mysql.jdbc.Driver");	
				
				 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					
				 st1=con1.createStatement();
				 if(p4.equals(cse))
					 
				 rs1=st1.executeQuery("select No from cse where REGD_NO='"+textField_2.getText()+"'");
				 else if(p4.equals(civ))
					 
					 rs1=st1.executeQuery("select No from civ where REGD_NO='"+textField_2.getText()+"'");
 else if(p4.equals(mec))
					 
					 rs1=st1.executeQuery("select No from mec where REGD_NO='"+textField_2.getText()+"'");
 else if(p4.equals(ele))
	 
	 rs1=st1.executeQuery("select No from ele where REGD_NO='"+textField_2.getText()+"'");
				 rs1.next();
				 int in=rs1.getInt("No");
				 in=in+1;
		if(in>2){
			 if(p4.equals(cse))
			st1.executeUpdate("update cse set No=3 where REGD_NO='"+textField_2.getText()+"'");
			 else if(p4.equals(civ))		
			st1.executeUpdate("update civ set No=3 where REGD_NO='"+textField_2.getText()+"'");
			 else if(p4.equals(mec))		
					st1.executeUpdate("update mec set No=3 where REGD_NO='"+textField_2.getText()+"'");
			 else if(p4.equals(ele))		
					st1.executeUpdate("update ele set No=3 where REGD_NO='"+textField_2.getText()+"'");
			
			 JOptionPane.showMessageDialog(null,"Alreary Renew for 2 times");}
		else if(in<=2){
			 if(p4.equals(cse))
					st1.executeUpdate("update cse set No="+in+" where REGD_NO='"+textField_2.getText()+"'");
					 else if(p4.equals(civ))		
					st1.executeUpdate("update civ set No="+in+" where REGD_NO='"+textField_2.getText()+"'");
					 else if(p4.equals(mec))		
							st1.executeUpdate("update mec set No="+in+" where REGD_NO='"+textField_2.getText()+"'");
					 else if(p4.equals(ele))		
				
				if(chckbxNewCheckBox.isSelected()==true){
					try{


				    
						Class.forName("com.mysql.jdbc.Driver");	
						
						 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					
					 st1=con1.createStatement();
					 if(p4.equals(cse))
				 st1.executeUpdate("UPDATE  cse SET Book_1Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(civ))
						 st1.executeUpdate("UPDATE  civ SET Book_1Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(ele))
						 st1.executeUpdate("UPDATE  ele SET Book_1Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(mec))
						 st1.executeUpdate("UPDATE  mec SET Book_1Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
						
						
					}catch(Exception e){System.out.println(e);}
				finally{
					try{st1.close();
					con1.close();}catch(Exception e){}
				}
					}

				if(chckbxNewCheckBox_1.isSelected()==true){
					try{


				    con1=null;st1=null;
						Class.forName("com.mysql.jdbc.Driver");	
						
						 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					
					 st1=con1.createStatement();
					 if(p4.equals(cse))
					 st1.executeUpdate("UPDATE  cse SET Book_2Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(civ))
						 st1.executeUpdate("UPDATE  civ SET Book_2Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(ele))
						 st1.executeUpdate("UPDATE  ele SET Book_2Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(mec))
						 st1.executeUpdate("UPDATE  mec SET Book_2Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					
						
					}catch(Exception e){System.out.println(e);}
				finally{
					try{st1.close();
					con1.close();}catch(Exception e){}
				}
					}

				if(chckbxNewCheckBox_2.isSelected()==true){
					try{

con1=null;st1=null;
				    
						Class.forName("com.mysql.jdbc.Driver");	
						
						 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					
					 st1=con1.createStatement();
					 if(p4.equals(cse))
					 st1.executeUpdate("UPDATE  cse SET Book_3Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(civ))
						 st1.executeUpdate("UPDATE  civ SET Book_3Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(ele))
						 st1.executeUpdate("UPDATE  ele SET Book_3Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					 else if(p4.equals(mec))
						 st1.executeUpdate("UPDATE  mec SET Book_3Idate='"+d+"' where REGD_NO='"+textField_2.getText()+"' ");
					
					 JOptionPane.showMessageDialog(null,"UPDATED SUCESSFULLY");
							
					}catch(Exception e){
						JOptionPane.showMessageDialog(null,"NOT UPDATED");
						
						System.out.println(e);}
				finally{
					try{st1.close();
					con1.close();}catch(Exception e){}
				}
					}
		}}catch(Exception e)
			{}
			}
				else if(n==3){
					String a="0";
					String b="C:\\Users\\SIKU\\Desktop\\"+textField_2.getText()+".txt";
					String p5=textField_1.getText();
					int w=0;
					if(chckbxNewCheckBox.isSelected()==true){
						int fine=0;
						Connection con2=null;
						Connection con1=null;
						try{
							Class.forName("com.mysql.jdbc.Driver");	
							con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
							 con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
							
							String g1=textField_6.getText();String m1="",h1="";int i=0;
							for(i=0;i<g1.length();i++)
							{
								if(g1.charAt(i)==',')
									break;
								else
									m1=m1+g1.charAt(i);
									}
							for(int j=i+1;j<g1.length();j++)
								h1=h1+g1.charAt(j);
							Statement st1=con1.createStatement();
							Statement st2=con2.createStatement();
							String s3=textField_12.getText();
							s3=s3+"-";
							String s="";
							int z=0;
							String s2[]=new String[3];
							for(int ii=0;ii<3;ii++)
							{
							s="";
							while(s3.charAt(z)!='-')
							{
							s=s+s3.charAt(z);
							z=z+1;
							}
							z=z+1;
							s2[ii]=s;
							}
							LocalDate l1=LocalDate.now();
							LocalDate l2=LocalDate.of(Integer.valueOf(s2[2]),Integer.valueOf(s2[1]),Integer.valueOf(s2[0]));
                            Period p=Period.between(l2, l1);
                            int d=p.getYears()*365+p.getMonths()*30+p.getDays();
                            int nd=d-21;
                            if(nd>0)
                         fine=nd*1;
                            else 
                            	fine=0;
							int n1=0;
							int f=0;
							if(p5.equals(cse)){
							ResultSet rs=st1.executeQuery("select Avail_book from cse where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"'");
							while(rs.next())
								n1=rs.getInt("Avail_book");
							n1=n1+1;
							System.out.println(n1);
							st1.executeUpdate("Update cse set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"' ");
							ResultSet rs2=st2.executeQuery("select fine from cse REGD_No='"+textField_2.getText()+"'");
							while(rs2.next())
								f=rs2.getInt("fine");
						f=f+fine;
						st2.executeUpdate("Update cse set fine='f' where REGD_NO='"+textField_2.getText()+"'");
							}
							else if(p5.equals(civ)){
								ResultSet rs=st1.executeQuery("select Avail_book from civ where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								st1.executeUpdate("Update civ set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"' ");
								ResultSet rs2=st2.executeQuery("select fine from civ REGD_No='"+textField_2.getText()+"'");
								while(rs2.next())
									f=rs2.getInt("fine");
							f=f+fine;
							st2.executeUpdate("Update civ set fine='f' where REGD_NO='"+textField_2.getText()+"'");
								
							}
							else if(p5.equals(ele)){
								ResultSet rs=st1.executeQuery("select Avail_book from ele where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								st1.executeUpdate("Update ele set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"' ");
								ResultSet rs2=st2.executeQuery("select fine from ele REGD_No='"+textField_2.getText()+"'");
								while(rs2.next())
									f=rs2.getInt("fine");
							f=f+fine;
							st2.executeUpdate("Update ele set fine='f' where REGD_NO='"+textField_2.getText()+"'");
								
							}
							else if(p5.equals(mec)){
								ResultSet rs=st1.executeQuery("select Avail_book from mec where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								st1.executeUpdate("Update mec set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_9.getText()+"' ");
								ResultSet rs2=st2.executeQuery("select fine from mec where REGD_No='"+textField_2.getText()+"'");
								while(rs2.next())
									f=rs2.getInt("fine");
							f=f+fine;
							System.out.print(f);
							st2.executeUpdate("Update mec set fine='"+f+"' where REGD_NO='"+textField_2.getText()+"'");
							
							}
							
						}catch(Exception e){System.out.print("xxx");
						e.printStackTrace();
						}
						finally{
							try{
								con1.close();
								con2.close();
							}catch(Exception e){}
							
						}
					
					try{
						PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,true)));
						pw.println(textField_3.getText()+"\t"+textField_6.getText()+"\t"+textField_12.getText()+"\t"+textField_16.getText()+"\t"+"RS:"+fine+".00"+"/-");
						pw.close();
					}catch(Exception e){
						try{
						File f=new File(b);
						f.createNewFile();
						PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,true)));
						pw.println(textField_3.getText()+"\t"+textField_6.getText()+"\t"+textField_12.getText()+"\t"+textField_16.getText()+"\t"+"RS:"+fine+".00"+"/-");
						pw.close();}catch(Exception e1){}
					
					}
					try{		Class.forName("com.mysql.jdbc.Driver");	
					
					 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
				
				 st=con.createStatement();
			
						if(p5.equals(cse))
						st.executeUpdate("UPDATE  cse SET BOOK_1NO=0,BOOK_1NAME='',AUTHOR_1='',Book_1Idate='' where REGD_NO='"+textField_2.getText()+"'");
						if(p5.equals(civ))
							st.executeUpdate("UPDATE  civ SET BOOK_1NO=0,BOOK_1NAME='',AUTHOR_1='',Book_1Idate='' where REGD_NO='"+textField_2.getText()+"'");
						if(p5.equals(ele))
							st.executeUpdate("UPDATE  ele SET BOOK_1NO=0,BOOK_1NAME='',AUTHOR_1='',Book_1Idate='' where REGD_NO='"+textField_2.getText()+"'");
						if(p5.equals(mec))
							st.executeUpdate("UPDATE  mec SET BOOK_1NO=0,BOOK_1NAME='',AUTHOR_1='',Book_1Idate='' where REGD_NO='"+textField_2.getText()+"'");
							
					}catch(Exception e){w=1;}
					
					}
					if(chckbxNewCheckBox_1.isSelected()==true){
						int fine=0;
						try{
							Class.forName("com.mysql.jdbc.Driver");	
							Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
							String g1=textField_7.getText();String m1="",h1="";int i=0;
							for(i=0;i<g1.length();i++)
							{
								if(g1.charAt(i)==',')
									break;
								else
									m1=m1+g1.charAt(i);
									}
							for(int j=i+1;j<g1.length();j++)
								h1=h1+g1.charAt(j);
							Statement st1=con1.createStatement();
							String s3=textField_13.getText();
							s3=s3+"-";
							String s="";
							int z=0;
							String s2[]=new String[3];
							for(int ii=0;ii<3;ii++)
							{
							s="";
							while(s3.charAt(z)!='-')
							{
							s=s+s3.charAt(z);
							z=z+1;
							}
							z=z+1;
							s2[ii]=s;
							}
							LocalDate l1=LocalDate.now();
							LocalDate l2=LocalDate.of(Integer.valueOf(s2[2]),Integer.valueOf(s2[1]),Integer.valueOf(s2[0]));
                            Period p=Period.between(l2, l1);
                            int d=p.getYears()*365+p.getMonths()*30+p.getDays();
                            int nd=d-21;
                            if(nd>0)
                                fine=nd*1;
                                   else 
                                   	fine=0;
       						
							int n1=0;
							ResultSet rs=null;
							if(p5.equals(cse)){
							 rs=st1.executeQuery("select Avail_book from cse where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"'");
							while(rs.next())
								n1=rs.getInt("Avail_book");
							n1=n1+1;
							System.out.println(n1);
							st1.executeUpdate("Update cse set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"' ");
							}
							else if(p5.equals(civ)){
								 rs=st1.executeQuery("select Avail_book from civ where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								System.out.println(n1);
								st1.executeUpdate("Update civ set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"' ");
								}
							else if(p5.equals(ele)){
								 rs=st1.executeQuery("select Avail_book from ele where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								System.out.println(n1);
								st1.executeUpdate("Update ele set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"' ");
								}
							else if(p5.equals(mec)){
								 rs=st1.executeQuery("select Avail_book from mec where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								System.out.println(n1);
								st1.executeUpdate("Update mec set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_10.getText()+"' ");
								}
								
								
							
						}catch(Exception e){
							e.printStackTrace();
							System.out.println("yyy");
						}
					
						
						try{
							PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,true)));
							pw.println(textField_4.getText()+"\t"+textField_7.getText()+"\t"+textField_13.getText()+"\t"+textField_17.getText()+"\t"+"RS:"+fine+".00"+"/-");
							pw.close();
						}catch(Exception e){
							try{
								File f=new File(b);
								f.createNewFile();
								PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,true)));
								pw.println(textField_4.getText()+"\t"+textField_7.getText()+"\t"+textField_13.getText()+"\t"+textField_17.getText()+"\t"+"RS:"+fine+".00"+"/-");
								pw.close();}catch(Exception e1){}
						
						}
						try{		Class.forName("com.mysql.jdbc.Driver");	
						
						 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					
					 st=con.createStatement();
				
					 if(p5.equals(cse))
					st.executeUpdate("UPDATE  cse SET BOOK_2NO=0,BOOK_2NAME='',AUTHOR_2='',Book_2Idate='' where REGD_NO='"+textField_2.getText()+"'");
					 else if(p5.equals(civ))
							st.executeUpdate("UPDATE  civ SET BOOK_2NO=0,BOOK_2NAME='',AUTHOR_2='',Book_2Idate='' where REGD_NO='"+textField_2.getText()+"'");
					 else if(p5.equals(ele))
							st.executeUpdate("UPDATE  ele SET BOOK_2NO=0,BOOK_2NAME='',AUTHOR_2='',Book_2Idate='' where REGD_NO='"+textField_2.getText()+"'");
					 else if(p5.equals(mec))
							st.executeUpdate("UPDATE  mec SET BOOK_2NO=0,BOOK_2NAME='',AUTHOR_2='',Book_2Idate='' where REGD_NO='"+textField_2.getText()+"'");
									
						}catch(Exception e){
							w=1;
							
						}
							
					
					}
					if(chckbxNewCheckBox_2.isSelected()==true){
						int fine=0;
						try{
							Class.forName("com.mysql.jdbc.Driver");	
							Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
							String g1=textField_8.getText();String m1="",h1="";int i=0;
							for(i=0;i<g1.length();i++)
							{
								if(g1.charAt(i)==',')
									break;
								else
									m1=m1+g1.charAt(i);
									}
							for(int j=i+1;j<g1.length();j++)
								h1=h1+g1.charAt(j);
							Statement st1=con1.createStatement();
							String s3=textField_14.getText();
							s3=s3+"-";
							String s="";
							int z=0;
							String s2[]=new String[3];
							for(int ii=0;ii<3;ii++)
							{
							s="";
							while(s3.charAt(z)!='-')
							{
							s=s+s3.charAt(z);
							z=z+1;
							}
							z=z+1;
							s2[ii]=s;
							}
							LocalDate l1=LocalDate.now();
							LocalDate l2=LocalDate.of(Integer.valueOf(s2[2]),Integer.valueOf(s2[1]),Integer.valueOf(s2[0]));
                            Period p=Period.between(l2, l1);
                            int d=p.getYears()*365+p.getMonths()*30+p.getDays();
                            int nd=d-21;
                            if(nd>0)
                                fine=nd*1;
                                   else 
                                   	fine=0;
       						
							int n1=0;
							ResultSet rs=null;
							if(p5.equals(cse)){
							rs=st1.executeQuery("select Avail_book from cse where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"'");
							while(rs.next())
								n1=rs.getInt("Avail_book");
							n1=n1+1;
							st1.executeUpdate("Update cse set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"' ");
							}
							else if(p5.equals(civ)){
								rs=st1.executeQuery("select Avail_book from civ where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								st1.executeUpdate("Update civ set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"' ");
								}
							else if(p5.equals(ele)){
								rs=st1.executeQuery("select Avail_book from ele where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								st1.executeUpdate("Update ele set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"' ");
								}
							else if(p5.equals(mec)){
								rs=st1.executeQuery("select Avail_book from mec where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"'");
								while(rs.next())
									n1=rs.getInt("Avail_book");
								n1=n1+1;
								st1.executeUpdate("Update mec set Avail_book='"+n1+"' where Book_name='"+m1+"' && Pub_name='"+h1+"' && Author='"+textField_11.getText()+"' ");
								}
							
						}catch(Exception e){
							e.printStackTrace();
							System.out.print("zzz");}
					
						
						
						try{
							PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,true)));
							pw.println(textField_5.getText()+"\t"+textField_8.getText()+"\t"+textField_14.getText()+"\t"+textField_18.getText()+"\t"+"RS:"+fine+".00"+"/-");
							pw.close();
						}catch(Exception e){
							try{
								File f=new File(b);
								f.createNewFile();
								PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,true)));
								pw.println(textField_5.getText()+"\t"+textField_8.getText()+"\t"+textField_14.getText()+"\t"+textField_18.getText()+"\t"+"RS:"+fine+".00"+"/-");
								pw.close();}catch(Exception e1){}
						
						}
						try{		Class.forName("com.mysql.jdbc.Driver");	
						
						 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					
					 st=con.createStatement();
				
					 if(p5.equals(cse))
					st.executeUpdate("UPDATE  cse SET BOOK_3NO=0,BOOK_3NAME='',AUTHOR_3='',Book_3Idate='' where REGD_NO='"+textField_2.getText()+"'");
					 else if(p5.equals(civ))
							st.executeUpdate("UPDATE  civ SET BOOK_3NO=0,BOOK_3NAME='',AUTHOR_3='',Book_3Idate='' where REGD_NO='"+textField_2.getText()+"'");
					 else if(p5.equals(ele))
							st.executeUpdate("UPDATE  ele SET BOOK_3NO=0,BOOK_3NAME='',AUTHOR_3='',Book_3Idate='' where REGD_NO='"+textField_2.getText()+"'");
					 else if(p5.equals(mec))
							st.executeUpdate("UPDATE  mec SET BOOK_3NO=0,BOOK_3NAME='',AUTHOR_3='',Book_3Idate='' where REGD_NO='"+textField_2.getText()+"'");
									
						}catch(Exception e){w=1;
						}
							
					}
					if(w==0)
					 JOptionPane.showMessageDialog(null,"UPDATED SUCESSFULLY");
					else if(w==1)
					JOptionPane.showMessageDialog(null,"NOT UPDATED");	
				
				}
			
				}
		});

		btnOk_1.setBounds(831, 393, 89, 23);
		contentPane.add(btnOk_1);
		
		btnNewButton_2 = new JButton("History");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Part4 o=new Part4();
			Part4.s=textField_2.getText();
			o.setVisible(true);
			}
			
		});
		btnNewButton_2.setBounds(1004, 11, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("FINE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rno=textField_2.getText();
				bn=textField_1.getText();
				new Fine();
				
			}
		});
		btnNewButton_3.setBounds(1148, 11, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("PRINT\r\n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection con1=null;
				int f=0;
				try{
					String n=textField.getText();
					String rn=textField_2.getText();
					String bna=textField_1.getText();
					String b="C:\\Users\\SIKU\\Desktop\\x.txt";
					Class.forName("com.mysql.jdbc.Driver");	
					 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					 Statement st1=con1.createStatement();
					 
					 if(bna.equals("cse")){
					 ResultSet rs1=st1.executeQuery("select fine from cse where REGD_NO='"+rn+"'");
					 while(rs1.next())
						 f=rs1.getInt("fine");
						// textField.setText(String.valueOf(f));
					 }
					 else if(bna.equals("mec")){
						 ResultSet rs1=st1.executeQuery("select fine from mec where REGD_NO='"+rn+"'");
						 while(rs1.next())
							 f=rs1.getInt("fine");
							// textField.setText(String.valueOf(f));
						 }
					 else if(bna.equals("civ")){
						 ResultSet rs1=st1.executeQuery("select fine from civ where REGD_NO='"+rn+"'");
						 while(rs1.next())
							 f=rs1.getInt("fine");
							// textField.setText(String.valueOf(f));
						 }
					 else if(bna.equals("ele")){
						 ResultSet rs1=st1.executeQuery("select fine from ele where REGD_NO='"+rn+"'");
						 while(rs1.next())
							 f=rs1.getInt("fine");
							// textField.setText(String.valueOf(f));
						 }
					
					
					
					PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(b,false)));
					pw.println("GOVERNMENT COLLEGE OF ENGINEERING KALAHANDI");
					pw.println("         Library Clearence Form");
					
					pw.println("NAME:-"+n);
					pw.println("REGD_NO:-"+rn);
					pw.println("BRANCH:-"+bna);
					
					pw.println("FINE:-RS:"+f+"/");
					pw.println("");
					pw.println("");
					pw.println("");
					pw.println("Signature of Librarian");
					
					pw.close();
					  if (Desktop.isDesktopSupported()) {
					       Desktop.getDesktop().open(new File(b));
					     }
					   
					
				}
				catch(Exception e){}
				finally{
					try{
						con1.close();
					}
					catch(Exception e){}
					
				}
			}
		});
		btnNewButton_4.setBounds(1185, 58, 89, 23);
		contentPane.add(btnNewButton_4);
		
	
		
	

	}
}
