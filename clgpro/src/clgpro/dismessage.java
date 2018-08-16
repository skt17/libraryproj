package clgpro;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.JLabel;
import java.awt.Font;
public class dismessage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dismessage frame = new dismessage();
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
	public dismessage() {
		setBounds(100, 100, 708, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 50, 380, 84);
		contentPane.add(textPane);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					PrintWriter pw=new PrintWriter("C://Users//SIKU//Desktop//message.txt");
					pw.println(textPane.getText());
					pw.close();
					JOptionPane.showMessageDialog(null, "SUCESSFULL");
					textPane.setText(null);
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "NOT SUCESSFULL");
					
				}
				
			}
		});
		btnOk.setBounds(352, 217, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Write Message\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 25, 269, 14);
		contentPane.add(lblNewLabel);
		
	}
}
