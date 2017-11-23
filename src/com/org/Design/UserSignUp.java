package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;


import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserSignUp {

	private JFrame UserSignUp;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textPhone;
	private JTextField textCountry;
	private JTextField textState;
	private JTextField textCity;
	private JTextField textLocation;
	private JTextField textBloodType;
	private JTextField textBloodGroup;
	private JTextField textPassword;
	private Connection con;
	private JTextPane textAddress;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSignUp window = new UserSignUp();
					window.UserSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserSignUp() {
		initialize();
	}

	private void initialize() {
		UserSignUp = new JFrame();
		UserSignUp.setResizable(false);
		UserSignUp.setTitle("Sign Up");
		UserSignUp.getContentPane().setBackground(new Color(255, 235, 205));
		UserSignUp.setBounds(100, 100, 700, 700);
		UserSignUp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		UserSignUp.getContentPane().setLayout(null);
		UserSignUp.setVisible(true);
		
		JLabel lblPleaseFillUp = new JLabel("-------------------User Sign Up Form------------------");
		lblPleaseFillUp.setForeground(new Color(0, 100, 0));
		lblPleaseFillUp.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblPleaseFillUp.setBounds(157, 11, 443, 31);
		UserSignUp.getContentPane().add(lblPleaseFillUp);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(new Color(210, 105, 30));
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(147, 70, 79, 20);
		UserSignUp.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(new Color(210, 105, 30));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(147, 110, 79, 20);
		UserSignUp.getContentPane().add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setForeground(new Color(210, 105, 30));
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhone.setBounds(147, 152, 79, 20);
		UserSignUp.getContentPane().add(lblPhone);
		
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCountry.setForeground(new Color(210, 105, 30));
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCountry.setBounds(127, 194, 99, 20);
		UserSignUp.getContentPane().add(lblCountry);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.RIGHT);
		lblState.setForeground(new Color(210, 105, 30));
		lblState.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblState.setBounds(147, 236, 79, 20);
		UserSignUp.getContentPane().add(lblState);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setForeground(new Color(210, 105, 30));
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCity.setBounds(147, 279, 79, 20);
		UserSignUp.getContentPane().add(lblCity);
		
		JLabel lblLocation = new JLabel("Location :");
		lblLocation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLocation.setForeground(new Color(210, 105, 30));
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLocation.setBounds(76, 318, 150, 20);
		UserSignUp.getContentPane().add(lblLocation);
		
		JLabel lblBloodRequiredAddress = new JLabel("Address:");
		lblBloodRequiredAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodRequiredAddress.setForeground(new Color(210, 105, 30));
		lblBloodRequiredAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBloodRequiredAddress.setBounds(10, 355, 216, 20);
		UserSignUp.getContentPane().add(lblBloodRequiredAddress);
		
		JLabel lblBloodType = new JLabel("Blood type :");
		lblBloodType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodType.setForeground(new Color(210, 105, 30));
		lblBloodType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBloodType.setBounds(20, 435, 206, 20);
		UserSignUp.getContentPane().add(lblBloodType);
		
		JLabel lblBloodGroup = new JLabel("Blood Group :");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodGroup.setForeground(new Color(210, 105, 30));
		lblBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBloodGroup.setBounds(62, 475, 164, 20);
		UserSignUp.getContentPane().add(lblBloodGroup);
		
		JButton btnCheck = new JButton("Sign Up");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
				
				if(textBloodGroup.getText().isEmpty()||textBloodType.getText().isEmpty()||textCity.getText().isEmpty()||textCountry.getText().isEmpty()||
						textEmail.getText().isEmpty()||textLocation.getText().isEmpty()||textName.getText().isEmpty()||textPassword.getText().isEmpty()||
						textPhone.getText().isEmpty()||textState.getText().isEmpty()||textAddress.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all the field");
				}else {

					
					String query="insert into UserSignUp (Name,Email,Phone,Country,State,City,Location,Address,BloodGroup,BloodType,Password) values(?,?,?,?,?,?,?,?,?,?,?)";
						/*PreparedStatement pd=con.prepareStatement(query);
						pd.setString(1, textName.getText().trim());
						pd.setString(2, textEmail.getText().trim());
						pd.setString(3, textPhone.getText().trim());
						pd.setString(4, textCountry.getText().trim());
						pd.setString(5, textCity.getText().trim());
						pd.setString(6, textState.getText().trim());
						pd.setString(7, textLocation.getText().trim());
						pd.setString(8, textAddress.getText().trim());
						pd.setString(9, textBloodGroup.getText().trim());
						pd.setString(10, textBloodType.getText().trim());
						pd.setString(11, textPassword.getText().trim());
						//System.out.println("test");
						pd.execute();*/
						JOptionPane.showMessageDialog(null, "You are successfully sign up to this page");
						try{
							final String SQLQuery="insert into UserSignUp values('"+textName.getText().trim()+"','"+textEmail.getText().trim()+"'"
									+ ",'"+textPhone.getText().trim()+"'"
											+ ",'"+textCountry.getText().trim()+"'"
													+ ",'"+textCity.getText().trim()+"'"
															+ ",'"+textState.getText().trim()+"'"
																	+ ",'"+textLocation.getText().trim()+"'"
																			+ ",'"+textAddress.getText().trim()+"'"
																					+ ",'"+textBloodGroup.getText().trim()+"'"
																							+ ",'"+textBloodType.getText().trim()+"'"
																									+ ",'"+textPassword.getText().trim()+"')";
							Class.forName("oracle.jdbc.OracleDriver");
							Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
							Statement st= Con.createStatement();
							ResultSet rs =  st.executeQuery(SQLQuery);
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
//					String query1="insert into UserDatabase (UserName,Password) values(?,?)";
//					try {
//						PreparedStatement pd=con.prepareStatement(query1);
//						pd.setString(1, textName.getText().trim());
//						pd.setString(11, textPassword.getText().trim());
//						
//						ResultSet rs=pd.executeQuery();
//			
//						pd.close();
//						rs.close();
//					} catch (SQLException e1) {
//						e1.printStackTrace();
//					}
 catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					}
				});
			}
		});
		btnCheck.setBackground(new Color(211, 211, 211));
		btnCheck.setForeground(new Color(210, 105, 30));
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCheck.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCheck.setBounds(502, 572, 138, 45);
		UserSignUp.getContentPane().add(btnCheck);
		
		textName = new JTextField();
		textName.setText("");
		textName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textName.setBounds(236, 64, 404, 31);
		UserSignUp.getContentPane().add(textName);
		textName.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setText("");
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textEmail.setColumns(10);
		textEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textEmail.setBounds(236, 104, 404, 31);
		UserSignUp.getContentPane().add(textEmail);
		
		textPhone = new JTextField();
		textPhone.setText("");
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPhone.setColumns(10);
		textPhone.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPhone.setBounds(236, 146, 404, 31);
		UserSignUp.getContentPane().add(textPhone);
		
		textCountry = new JTextField();
		textCountry.setText("");
		textCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCountry.setColumns(10);
		textCountry.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textCountry.setBounds(236, 188, 404, 31);
		UserSignUp.getContentPane().add(textCountry);
		
		textState = new JTextField();
		textState.setText("");
		textState.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textState.setColumns(10);
		textState.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textState.setBounds(236, 230, 404, 31);
		UserSignUp.getContentPane().add(textState);
		
		textCity = new JTextField();
		textCity.setText("");
		textCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCity.setColumns(10);
		textCity.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textCity.setBounds(236, 272, 404, 31);
		UserSignUp.getContentPane().add(textCity);
		
		textLocation = new JTextField();
		textLocation.setText("");
		textLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textLocation.setColumns(10);
		textLocation.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textLocation.setBounds(236, 313, 404, 31);
		UserSignUp.getContentPane().add(textLocation);
		
		textBloodType = new JTextField();
		textBloodType.setText("");
		textBloodType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodType.setColumns(10);
		textBloodType.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textBloodType.setBounds(236, 429, 404, 31);
		UserSignUp.getContentPane().add(textBloodType);
		
		textBloodGroup = new JTextField();
		textBloodGroup.setText("");
		textBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodGroup.setColumns(10);
		textBloodGroup.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textBloodGroup.setBounds(236, 469, 404, 31);
		UserSignUp.getContentPane().add(textBloodGroup);
		
		textAddress = new JTextPane();
		textAddress.setText("");
		textAddress.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textAddress.setBounds(236, 355, 404, 63);
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserSignUp.getContentPane().add(textAddress);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(new Color(210, 105, 30));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(76, 517, 150, 20);
		UserSignUp.getContentPane().add(lblPassword);
		
		textPassword = new JTextField();
		textPassword.setText("");
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPassword.setColumns(10);
		textPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPassword.setBounds(236, 511, 404, 31);
		UserSignUp.getContentPane().add(textPassword);
	}
}
