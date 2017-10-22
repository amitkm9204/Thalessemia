package com.org.Design;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("USER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//open USER window after verification
				 SwingUtilities.invokeLater(new Runnable()
	             {
	                 public void run()
	                 {
	                     new UserPage();
	                 }
	             });
			}
		});
		btnNewButton.setBounds(227, 92, 137, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("ADMIN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//open ADMIN window after verification
				SwingUtilities.invokeLater(new Runnable()
	             {
	                 public void run()
	                 {
	                     new UserPage();
	                     frame.dispose();
	                 }
	             });
				
			}
		});
		button.setBounds(53, 92, 137, 51);
		frame.getContentPane().add(button);
	}
	
}
