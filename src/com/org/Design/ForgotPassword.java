package com.org.Design;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword {

	private JFrame ForgotPassword;
	private Connection con;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textPhone;
	private JTextField textBloodGroup;
	private JTextField textBloodType;
	public static String name;
	public static String email;
	public static String phone;
	public static String bloodgroup;
	public static String bloodtype;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
					window.ForgotPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ForgotPassword() {
		initialize();
	}

	private void initialize() {
		ForgotPassword = new JFrame();
		ForgotPassword.setTitle("Verification");
		ForgotPassword.getContentPane().setBackground(new Color(255, 248, 220));
		ForgotPassword.setResizable(false);
		ForgotPassword.setBounds(100, 100, 584, 378);
		ForgotPassword.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ForgotPassword.getContentPane().setLayout(null);
		
		JLabel lblfillUpThe = new JLabel("---------------Fill Up The Form To Change Password--------------");
		lblfillUpThe.setForeground(new Color(0, 100, 0));
		lblfillUpThe.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblfillUpThe.setBounds(21, 11, 547, 31);
		ForgotPassword.getContentPane().add(lblfillUpThe);
		
		JLabel label_1 = new JLabel("Name :");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(new Color(210, 105, 30));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(66, 70, 79, 20);
		ForgotPassword.getContentPane().add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textName.setColumns(10);
		textName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textName.setBounds(155, 64, 404, 31);
		ForgotPassword.getContentPane().add(textName);
		
		JLabel label_2 = new JLabel("Email :");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(new Color(210, 105, 30));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(66, 110, 79, 20);
		ForgotPassword.getContentPane().add(label_2);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textEmail.setColumns(10);
		textEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textEmail.setBounds(155, 104, 404, 31);
		ForgotPassword.getContentPane().add(textEmail);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPhone.setColumns(10);
		textPhone.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPhone.setBounds(155, 146, 404, 31);
		ForgotPassword.getContentPane().add(textPhone);
		
		JLabel label_3 = new JLabel("Phone :");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(new Color(210, 105, 30));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(66, 152, 79, 20);
		ForgotPassword.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Blood Group :");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(new Color(210, 105, 30));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(-21, 234, 164, 20);
		ForgotPassword.getContentPane().add(label_4);
		
		textBloodGroup = new JTextField();
		textBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodGroup.setColumns(10);
		textBloodGroup.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textBloodGroup.setBounds(153, 228, 404, 31);
		ForgotPassword.getContentPane().add(textBloodGroup);
		
		JLabel label_5 = new JLabel("Blood type :");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(new Color(210, 105, 30));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(-63, 194, 206, 20);
		ForgotPassword.getContentPane().add(label_5);
		
		textBloodType = new JTextField();
		textBloodType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodType.setColumns(10);
		textBloodType.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textBloodType.setBounds(153, 188, 404, 31);
		ForgotPassword.getContentPane().add(textBloodType);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {

				if(textBloodGroup.getText().isEmpty()||textBloodType.getText().isEmpty()||textEmail.getText().isEmpty()||
						textName.getText().isEmpty()||textPhone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all the field To Change The Password", "Failed", JOptionPane.INFORMATION_MESSAGE);
				}else {
					name=textName.getText().trim();
					phone=textPhone.getText().trim();
					email=textEmail.getText().trim();
					bloodgroup=textBloodGroup.getText().trim();
					bloodtype=textBloodType.getText().trim();
					/*Database ad=new Database();
					con = ad.DB();
					String query="select * from UserSignUp where Name=? and Email=? and Phone=? and BloodType=? and BloodGroup=?";
					try {
						PreparedStatement pd=con.prepareStatement(query);
						pd.setString(1, textName.getText().trim());
						pd.setString(2, textEmail.getText().trim());
						pd.setString(3, textPhone.getText().trim());
						pd.setString(4, textBloodType.getText().trim());
						pd.setString(5, textBloodGroup.getText().trim());
						ResultSet rs=pd.executeQuery();
						int i=0;
						while(rs.next())
						{
							i++;
						}*/
					try{
					String query="select * from UserSignUp where Name='"+name+"' and Email= '"+email+"'and Phone='"+phone+"' and BloodType='"+bloodtype+"' and BloodGroup='"+bloodgroup+"'";
					Class.forName("oracle.jdbc.OracleDriver");
					Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
					Statement st= Con.createStatement();
					ResultSet rs =  st.executeQuery(query);
						if(rs.next())
						{
							ChangePassword cp = new ChangePassword();
							ForgotPassword.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid UserName Or Password", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
						}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
				
			}
			});
			}
		});
		btnChangePassword.setForeground(new Color(210, 105, 30));
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnChangePassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnChangePassword.setBackground(new Color(211, 211, 211));
		btnChangePassword.setBounds(329, 285, 230, 45);
		ForgotPassword.getContentPane().add(btnChangePassword);
		ForgotPassword.setVisible(true);
		
	}

}
