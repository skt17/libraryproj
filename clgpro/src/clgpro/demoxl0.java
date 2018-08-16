package clgpro;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demoxl0 extends JFrame {

	private JPanel contentPane;
	private static int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demoxl0 frame = new demoxl0();
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
	public demoxl0() {
	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
			if(i==0)
			{
				demoxl.main();			}
			}
		});
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setVisible(true);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Insert DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(new File("E:\\project\\Book2.xlsx"));
				}
				}catch(Exception e)
				{}
			}
		});
		btnNewButton.setBounds(10, 41, 163, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE to DATABASE\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i=1;
				demoxl.main();
			}
		});
		btnNewButton_1.setBounds(228, 41, 185, 23);
		contentPane.add(btnNewButton_1);
		
	}
}
