package clgpro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class delmessage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delmessage frame = new delmessage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public delmessage() {
		
		try{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\SIKU\\Desktop\\message.txt"));
			String s=br.readLine();
			if(s.equals(""))
				JOptionPane.showMessageDialog(null, "NOT ANY MESSAGE AVALAIBLE");
			else{
				PrintWriter pw=new PrintWriter("C://Users//SIKU//Desktop//message.txt");
				pw.println("");
				pw.close();
				
				JOptionPane.showMessageDialog(null, "DELETE SUCESSFULLY");
				
			}
			br.close();
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			System.out.println(e);
			
		}
	
	}

}
