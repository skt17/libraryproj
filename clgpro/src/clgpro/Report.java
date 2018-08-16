package clgpro;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Report extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report(){
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		String s[]=null;
	try{	
		File f=new File("E:\\project\\Dreport");
		s=new String[(int) f.length()];
		s=f.list();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
//		System.out.println(s[0]);
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(72, 27, 111, 20);
	contentPane.add(comboBox);
	for(String x1:s)
	comboBox.addItem(x1);

		JButton btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String k=(String)comboBox.getSelectedItem();
k="E:\\project\\Dreport\\"+k;
try{
	if (Desktop.isDesktopSupported()) {
		Desktop.getDesktop().open(new File(k));
	}
	}catch(Exception e)
	{}


			}
		});
		btnOpen.setBounds(272, 155, 89, 23);
		contentPane.add(btnOpen);
		
	}
}
