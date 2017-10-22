package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.org.Database.AdminDatabase;
import com.org.Database.UserDatabase;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage window = new UserPage();
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
	public UserPage() {
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
		frame.setVisible(true);
		textField = new JTextField();
		textField.setBounds(280, 64, 122, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 132, 122, 36);
		frame.getContentPane().add(textField_1);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(144, 75, 83, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(144, 143, 83, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable()
	             {
	                 public void run()
	                 {
	                	 //if(textField!=null&&textField_1!=null)
	                     new UserDatabase(textField.getText(),textField_1.getText());
	                    if(UserDatabase.loginStatus==true)
	                    {
	                    	//opening new window managed by admin
	                    	System.out.println("testuser");
	                    }
	                    else
	                    	JOptionPane.showMessageDialog(null, this, "Invalid Credential", 0);
	                 }
	             });
				
			}
		});
		btnLogin.setBounds(280, 204, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

}
