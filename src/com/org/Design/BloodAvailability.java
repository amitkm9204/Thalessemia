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

import com.org.Database.BloodDatabase;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class BloodAvailability {

	private JFrame BloodAvailabilty;
	private JTextField textBloodGroup;
	private JTextField textBloodType;
	private JComboBox Amount;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BloodAvailability window = new BloodAvailability();
					window.BloodAvailabilty.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BloodAvailability() {
		initialize();
	}

	private void initialize() {
		BloodAvailabilty = new JFrame();
		BloodAvailabilty.setResizable(false);
		BloodAvailabilty.setTitle("Blood Availabilty");
		BloodAvailabilty.getContentPane().setBackground(new Color(216, 191, 216));
		BloodAvailabilty.setBounds(100, 100, 700, 342);
		BloodAvailabilty.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		BloodAvailabilty.getContentPane().setLayout(null);
		BloodAvailabilty.setVisible(true);
		
		JLabel lblPleaseFillUp = new JLabel("-------------------Please Fill Up The Following Details------------------");
		lblPleaseFillUp.setForeground(new Color(0, 100, 0));
		lblPleaseFillUp.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblPleaseFillUp.setBounds(76, 11, 598, 31);
		BloodAvailabilty.getContentPane().add(lblPleaseFillUp);
		
		JLabel lblBloodGroup = new JLabel("Blood Group :");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodGroup.setForeground(new Color(210, 105, 30));
		lblBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBloodGroup.setBounds(76, 79, 164, 20);
		BloodAvailabilty.getContentPane().add(lblBloodGroup);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			private Connection con;

			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {

				/*Database ad=new Database();
				con = ad.DB();
				String query="select * from BloodDetails where BloodGroup=? and BloodType=? and Amount>=?";
				try {
					PreparedStatement pd=con.prepareStatement(query);
					pd.setString(1, textBloodGroup.getText().trim());
					pd.setString(2, textBloodType.getText().trim());
					pd.setString(3, Amount.getSelectedItem().toString());
					ResultSet rs=pd.executeQuery();
					int i=0;
					while(rs.next())
					{
						i++;
					}
					if(i==1)
					{
						JOptionPane.showMessageDialog(null, "Blood is Available in the Blood Bank", "Blood Available", JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Blood is not available in the Blood Bank", "Blood Available", JOptionPane.INFORMATION_MESSAGE);
					}
					pd.close();
					rs.close();
			}catch(SQLException e1){
					e1.printStackTrace();
				}*/
						new BloodDatabase(textBloodGroup.getText().trim(), textBloodType.getText().trim(), Integer.parseInt(Amount.getSelectedItem().toString()));
						if (BloodDatabase.bloodAvailable==true) {
							
							JOptionPane.showMessageDialog(null, "Blood is Available in the Blood Bank");
							BloodDatabase.bloodAvailable=false;
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Blood is not available in the Blood Bank");
						}
					}
				});
			}
		});
		btnCheck.setBackground(new Color(211, 211, 211));
		btnCheck.setForeground(new Color(210, 105, 30));
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCheck.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCheck.setBounds(526, 239, 128, 45);
		BloodAvailabilty.getContentPane().add(btnCheck);
		
		textBloodGroup = new JTextField();
		textBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodGroup.setColumns(10);
		textBloodGroup.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textBloodGroup.setBounds(250, 73, 404, 31);
		BloodAvailabilty.getContentPane().add(textBloodGroup);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAmount.setForeground(new Color(210, 105, 30));
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAmount.setBounds(76, 174, 164, 20);
		BloodAvailabilty.getContentPane().add(lblAmount);
		
		Amount = new JComboBox();
		Amount.setFont(new Font("Tahoma", Font.BOLD, 18));
		Amount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Amount.setBackground(new Color(255, 255, 255));
		Amount.setBounds(250, 174, 239, 31);
		BloodAvailabilty.getContentPane().add(Amount);
		
		Amount.addItem("---------Choose--------");
		Amount.addItem("50");
		Amount.addItem("100");
		Amount.addItem("150");
		Amount.addItem("200");
		Amount.addItem("250");
		Amount.addItem("300");
		Amount.addItem("350");
		Amount.addItem("400");
		Amount.addItem("450");
		Amount.addItem("500");
		
		textBloodType = new JTextField();
		textBloodType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodType.setColumns(10);
		textBloodType.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textBloodType.setBounds(250, 121, 404, 31);
		BloodAvailabilty.getContentPane().add(textBloodType);
		
		JLabel lblBloodType = new JLabel("Blood Type :");
		lblBloodType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodType.setForeground(new Color(210, 105, 30));
		lblBloodType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBloodType.setBounds(76, 127, 164, 20);
		BloodAvailabilty.getContentPane().add(lblBloodType);
	}
}
