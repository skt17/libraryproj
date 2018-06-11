package clgpro;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fine {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fine window = new Fine();
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
	public Fine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
	
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(160, 42, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total Fine");
		lblNewLabel.setBounds(34, 45, 56, 14);
		frame.getContentPane().add(lblNewLabel);
		
		String rn=Part.rno;
		String bna=Part.bn;
		Connection con1=null;
		int f=0;
		
		try{
		Class.forName("com.mysql.jdbc.Driver");	
		 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
		 Statement st1=con1.createStatement();
		 
		 if(bna.equals("cse")){
		 ResultSet rs1=st1.executeQuery("select fine from cse where REGD_NO='"+rn+"'");
		 while(rs1.next())
			 f=rs1.getInt("fine");
			 textField.setText(String.valueOf(f));
		 }
		 else if(bna.equals("mec")){
			 ResultSet rs1=st1.executeQuery("select fine from mec where REGD_NO='"+rn+"'");
			 while(rs1.next())
				 f=rs1.getInt("fine");
				 textField.setText(String.valueOf(f));
			 }
		 else if(bna.equals("civ")){
			 ResultSet rs1=st1.executeQuery("select fine from civ where REGD_NO='"+rn+"'");
			 while(rs1.next())
				 f=rs1.getInt("fine");
				 textField.setText(String.valueOf(f));
			 }
		 else if(bna.equals("ele")){
			 ResultSet rs1=st1.executeQuery("select fine from ele where REGD_NO='"+rn+"'");
			 while(rs1.next())
				 f=rs1.getInt("fine");
				 textField.setText(String.valueOf(f));
			 }
		
		
		
		}catch(Exception e){}
		finally{
			try{con1.close();}catch(Exception e)
			{}
		}
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection con1=null;
				try{
					Class.forName("com.mysql.jdbc.Driver");	
					 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","");
					 Statement st1=con1.createStatement();
					 if(bna.equals("cse"))
					 st1.executeUpdate("Update cse set fine=0,No=0 where REGD_NO='"+rn+"'");
					 else if(bna.equals("civ"))
						 st1.executeUpdate("Update civ set fine=0,No=0 where REGD_NO='"+rn+"'");
					 else if(bna.equals("mec"))
						 st1.executeUpdate("Update mec set fine=0,No=0 where REGD_NO='"+rn+"'");
					 else if(bna.equals("ele"))
						 st1.executeUpdate("Update ele set fine=0,No=0 where REGD_NO='"+rn+"'");
				
				}catch(Exception e){}
				finally{try{
					con1.close();
				}catch(Exception e){}}
			}
		});
		btnNewButton.setBounds(235, 117, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
