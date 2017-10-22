package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.org.Database.AdminDatabase;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage {

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
					AdminPage window = new AdminPage();
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
	public AdminPage() {
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
		textField.setBounds(259, 136, 122, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(159, 72, 46, 14);
		frame.getContentPane().add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 69, 122, 36);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(159, 147, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable()
	             {
	                 public void run()
	                 {
	                	 //if(textField!=null&&textField_1!=null)
	                     new AdminDatabase(textField.getText(),textField_1.getText());
	                    if(AdminDatabase.loginStatus==true)
	                    {
	                    	//opening new window managed by admin
	                    	System.out.println("admin login");
	                    }
	                    else
	                    	JOptionPane.showMessageDialog(null, this, "Invalid Credential", 0);
	                 }
	             });
				
			}
		});
		btnLogin.setBounds(270, 205, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
