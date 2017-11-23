package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;


import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ChangePassword {

	private JFrame ChangePassword;
	private JTextField textNewPassword;
	private JTextField textConfirmPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword window = new ChangePassword();
					window.ChangePassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChangePassword() {
		initialize();
	}

	private void initialize() {
		ChangePassword = new JFrame();
		ChangePassword.setTitle("Change Password");
		ChangePassword.getContentPane().setBackground(new Color(240, 230, 140));
		ChangePassword.setResizable(false);
		ChangePassword.setBounds(100, 100, 550, 290);
		ChangePassword.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ChangePassword.getContentPane().setLayout(null);
		ChangePassword.setVisible(true);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			private Connection con;

			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {

				if(textNewPassword.getText().trim().equals(textConfirmPassword.getText().trim()))
				{
					/*Database ad=new Database();
					con = ad.DB();
					String query="update UserSignUp set Password='"+textNewPassword.getText().trim()+"' where Name='"+ForgotPassword.name+"' and Email='"+ForgotPassword.email+"' and Phone='"+ForgotPassword.phone+"' and BloodGroup='"+ForgotPassword.bloodgroup+"' and BloodType='"+ForgotPassword.bloodtype+"' ";
					try {
						PreparedStatement pd=con.prepareStatement(query);
						pd.execute();
						
						JOptionPane.showMessageDialog(null, "Password has successfully changed", "Password Change", JOptionPane.INFORMATION_MESSAGE);
						
						pd.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}*/
					try{
					String query="update UserSignUp set Password='"+textNewPassword.getText().trim()+"' where Name='"+ForgotPassword.name+"' and Email='"+ForgotPassword.email+"' and Phone='"+ForgotPassword.phone+"' and BloodGroup='"+ForgotPassword.bloodgroup+"' and BloodType='"+ForgotPassword.bloodtype+"' ";
					
					Class.forName("oracle.jdbc.OracleDriver");
					Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
					Statement st= Con.createStatement();
					ResultSet rs =  st.executeQuery(query);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
				}else
				{
					JOptionPane.showMessageDialog(null, "New Password and Confirm Password are not match", "Password Mismatch", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
			}
		});
		btnChangePassword.setForeground(new Color(210, 105, 30));
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnChangePassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnChangePassword.setBackground(new Color(211, 211, 211));
		btnChangePassword.setBounds(286, 191, 248, 45);
		ChangePassword.getContentPane().add(btnChangePassword);
		
		JLabel lblNewPassword = new JLabel("New Password :");
		lblNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword.setForeground(new Color(210, 105, 30));
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewPassword.setBounds(37, 82, 167, 20);
		ChangePassword.getContentPane().add(lblNewPassword);
		
		textNewPassword = new JTextField();
		textNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNewPassword.setColumns(10);
		textNewPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textNewPassword.setBounds(231, 76, 303, 31);
		ChangePassword.getContentPane().add(textNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setForeground(new Color(210, 105, 30));
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConfirmPassword.setBounds(27, 133, 177, 20);
		ChangePassword.getContentPane().add(lblConfirmPassword);
		
		textConfirmPassword = new JTextField();
		textConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textConfirmPassword.setColumns(10);
		textConfirmPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textConfirmPassword.setBounds(231, 127, 303, 31);
		ChangePassword.getContentPane().add(textConfirmPassword);
		
		JLabel lblchangePassword = new JLabel("---------------Change Password--------------");
		lblchangePassword.setForeground(new Color(0, 100, 0));
		lblchangePassword.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblchangePassword.setBounds(108, 11, 363, 31);
		ChangePassword.getContentPane().add(lblchangePassword);
	}

}
