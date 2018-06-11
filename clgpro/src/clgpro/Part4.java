package clgpro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Part4 extends JFrame {

	private JPanel contentPane;
	public static String s="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Part4 frame = new Part4();
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
	public Part4() {
		setBounds(100, 100, 664, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book no.");
		lblNewLabel.setBounds(10, 104, 46, 14);
		contentPane.add(lblNewLabel);
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		contentPane.add(textArea);
		textArea.setVisible(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 118, 617, 374);
		contentPane.add(scrollPane);
	
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setBounds(161, 104, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Issue dt");
		lblNewLabel_2.setBounds(428, 104, 54, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Return dt");
		lblNewLabel_3.setBounds(554, 104, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("view");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					textArea.setVisible(true);
				String st="C:\\Users\\SIKU\\Desktop\\"+s+".txt";
				java.io.BufferedReader br=new java.io.BufferedReader(new java.io.FileReader(st));
			String l=br.readLine();
			while(l!=null){
				textArea.append(l+"\n");
				l=br.readLine();
			}
			br.close();
			}catch(Exception e){}
		
			}
		});
		btnNewButton.setBounds(10, 22, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
