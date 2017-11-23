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
import javax.swing.JCheckBox;
import javax.swing.border.MatteBorder;

import com.org.Database.AdminDatabase;

import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class AdminPage {

	private JFrame frmAdminLogin;
	private JTextField textUserName;
	private JPasswordField passwordField;
	private Connection con;
	public static String UserName;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminPage() {
		initialize();
	}

	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setBackground(new Color(210, 105, 30));
		frmAdminLogin.setResizable(false);
		frmAdminLogin.getContentPane().setBackground(new Color(255, 239, 213));
		frmAdminLogin.setFont(new Font("Adobe Garamond Pro", Font.BOLD, 12));
		frmAdminLogin.getContentPane().setFont(new Font("Tekton Pro Ext", Font.BOLD, 11));
		frmAdminLogin.getContentPane().setForeground(new Color(0, 128, 0));
		frmAdminLogin.setTitle("Admin Login");
		frmAdminLogin.setName("AdminPage");
		frmAdminLogin.setBounds(100, 100, 700, 500);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminLogin.getContentPane().setLayout(null);
		frmAdminLogin.setVisible(true);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setLabelFor(frmAdminLogin);
		lblUserName.setFont(new Font("Source Sans Pro", Font.BOLD, 26));
		lblUserName.setBackground(new Color(255, 0, 0));
		lblUserName.setBounds(89, 134, 135, 43);
		frmAdminLogin.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Source Sans Pro", Font.BOLD, 26));
		lblPassword.setBackground(new Color(255, 239, 213));
		lblPassword.setBounds(97, 219, 150, 43);
		frmAdminLogin.getContentPane().add(lblPassword);
		
		textUserName = new JTextField();
		textUserName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textUserName.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 28));
		textUserName.setBounds(269, 134, 353, 43);
		frmAdminLogin.getContentPane().add(textUserName);
		textUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 28));
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(269, 219, 353, 43);
		frmAdminLogin.getContentPane().add(passwordField);
		
		JButton btnAdminLogIn = new JButton("Log In");
		btnAdminLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						
				
				
				/*Database ad=new Database();
				con = ad.DB();
				String query="select * from AdminDatabase where UserName=? and Password=?";
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
						UserName=textUserName.getText().trim();
						new AdminWorkPage();
						frmAdminLogin.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid UserName Or Password", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
					}
					pd.close();
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}*/
						new AdminDatabase(textUserName.getText().trim(),passwordField.getText().trim() );
						if(AdminDatabase.loginStatus == true)
						{
							UserName=textUserName.getText().trim();
							new AdminWorkPage();
							frmAdminLogin.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Login Failed");
						}
					}
				});
			}
		});
		btnAdminLogIn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
		btnAdminLogIn.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnAdminLogIn.setBackground(new Color(128, 128, 0));
		btnAdminLogIn.setBounds(506, 301, 116, 57);
		frmAdminLogin.getContentPane().add(btnAdminLogIn);
		
		JLabel lblNewLabel = new JLabel("THALESSEMIA MANAGEMENT SYSTEM");
		lblNewLabel.setLabelFor(frmAdminLogin);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.BOLD, 36));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(10, 11, 664, 48);
		frmAdminLogin.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.setBackground(new Color(250, 239, 213));
		chckbxShowPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxShowPassword.setBounds(269, 301, 135, 23);
		frmAdminLogin.getContentPane().add(chckbxShowPassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new HomePage();
						frmAdminLogin.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 428, 89, 23);
		frmAdminLogin.getContentPane().add(btnBack);
		chckbxShowPassword.addActionListener((e) ->
		{
			if(chckbxShowPassword.isSelected())
				passwordField.setEchoChar((char)0);
			else
				passwordField.setEchoChar('•');
		});
	}
}
