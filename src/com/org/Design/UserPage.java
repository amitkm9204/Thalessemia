package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import com.org.Database.UserDatabase;

import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserPage {

	public static String name;
	private JFrame frmUserLogin;
	private JTextField textUserName;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage window = new UserPage();
					window.frmUserLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserPage() {
		initialize();
	}

	private void initialize() {
		frmUserLogin = 
				new JFrame();
		frmUserLogin.setResizable(false);
		frmUserLogin.getContentPane().setBackground(new Color(255, 239, 213));
		frmUserLogin.setFont(new Font("Adobe Garamond Pro", Font.BOLD, 12));
		frmUserLogin.getContentPane().setFont(new Font("Tekton Pro Ext", Font.BOLD, 11));
		frmUserLogin.getContentPane().setForeground(new Color(0, 128, 0));
		frmUserLogin.setTitle("User Login");
		frmUserLogin.setName("AdminPage");
		frmUserLogin.setBounds(100, 100, 700, 500);
		frmUserLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserLogin.getContentPane().setLayout(null);
		frmUserLogin.setVisible(true);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Source Sans Pro", Font.BOLD, 26));
		lblUserName.setBackground(new Color(255, 239, 213));
		lblUserName.setBounds(89, 134, 135, 43);
		frmUserLogin.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Source Sans Pro", Font.BOLD, 26));
		lblPassword.setBackground(new Color(255, 239, 213));
		lblPassword.setBounds(97, 219, 150, 43);
		frmUserLogin.getContentPane().add(lblPassword);
		
		textUserName = new JTextField();
		textUserName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textUserName.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 28));
		textUserName.setBounds(269, 134, 353, 43);
		frmUserLogin.getContentPane().add(textUserName);
		textUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 28));
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(269, 219, 353, 43);
		frmUserLogin.getContentPane().add(passwordField);
		
		JButton btnUserLogIn = new JButton("Log In");
		btnUserLogIn.addActionListener(new ActionListener() {
			private Connection con;
			private String UserName;

			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						

				/*Database ad=new Database();
				con = ad.DB();
				String query="select * from UserSignUp where Name=? and Password=?";
				try {
					PreparedStatement pd=con.prepareStatement(query);
					pd.setString(1, textUserName.getText().trim());
					pd.setString(2, passwordField.getText().trim());
					ResultSet rs=pd.executeQuery();
					int i=0;
					while(rs.next())
					{
						i++;
					}
					if(i==1)
					{
						name=textUserName.getText().trim();
						UserWorkPage uwp =new UserWorkPage();
						frmUserLogin.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid UserName Or Password", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
					}
					pd.close();
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}*/
						new UserDatabase(textUserName.getText().trim(),passwordField.getText().trim());
						if(UserDatabase.loginStatus == true)
						{
							name=textUserName.getText().trim();
							UserWorkPage uwp =new UserWorkPage();
							frmUserLogin.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid UserName Or Password", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				});
			}
		});
		btnUserLogIn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
		btnUserLogIn.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnUserLogIn.setBackground(new Color(128, 128, 0));
		btnUserLogIn.setBounds(506, 301, 116, 57);
		frmUserLogin.getContentPane().add(btnUserLogIn);
		
		JLabel lblNewLabel = new JLabel("THALESSEMIA MANAGEMENT SYSTEM");
		lblNewLabel.setLabelFor(frmUserLogin);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.BOLD, 36));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(10, 11, 664, 48);
		frmUserLogin.getContentPane().add(lblNewLabel);
		
		JButton btnSingUp = new JButton("Sign Up");
		btnSingUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new UserSignUp();
					}
				});
			}
		});
		btnSingUp.setBorder(null);
		btnSingUp.setBackground(new Color(255, 239, 213));
		btnSingUp.setForeground(new Color(0, 0, 205));
		btnSingUp.setFont(new Font("Tekton Pro", Font.ITALIC, 20));
		btnSingUp.setBounds(288, 427, 162, 23);
		frmUserLogin.getContentPane().add(btnSingUp);
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new ForgotPassword();
						
					}
				});
				
			}
		});
		btnForgotPassword.setForeground(new Color(0, 0, 205));
		btnForgotPassword.setFont(new Font("Tekton Pro", Font.ITALIC, 20));
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBackground(new Color(255, 239, 213));
		btnForgotPassword.setBounds(474, 427, 153, 23);
		frmUserLogin.getContentPane().add(btnForgotPassword);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.setBackground(new Color(250, 239, 213));
		chckbxShowPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxShowPassword.setBounds(269, 301, 135, 23);
		frmUserLogin.getContentPane().add(chckbxShowPassword);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new HomePage();
						frmUserLogin.dispose();
						
					}
				});

			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBorder(null);
		button.setBackground(new Color(255, 69, 0));
		button.setBounds(10, 428, 89, 23);
		frmUserLogin.getContentPane().add(button);
		chckbxShowPassword.addActionListener((e) ->
		{
			if(chckbxShowPassword.isSelected())
				passwordField.setEchoChar((char)0);
			else
				passwordField.setEchoChar('•');
		});
	}
}
