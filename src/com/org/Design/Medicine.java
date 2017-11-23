package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.BevelBorder;

import com.org.Database.MedicinDatabase;

import java.awt.Color;

public class Medicine {

	private JFrame frmCheckMedicine;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicine window = new Medicine();
					window.frmCheckMedicine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Medicine() {
		initialize();
	}

	private void initialize() {
		frmCheckMedicine = new JFrame();
		frmCheckMedicine.setTitle("Check Medicine");
		frmCheckMedicine.getContentPane().setBackground(new Color(250, 250, 210));
		frmCheckMedicine.setBounds(100, 100, 450, 300);
		frmCheckMedicine.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCheckMedicine.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(175, 74, 238, 32);
		frmCheckMedicine.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheName = new JLabel("Enter The Name :");
		lblEnterTheName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterTheName.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblEnterTheName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterTheName.setBounds(10, 74, 155, 32);
		frmCheckMedicine.getContentPane().add(lblEnterTheName);
		
		JButton btnCheckMedicine = new JButton("Check Medicine");
		btnCheckMedicine.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCheckMedicine.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckMedicine.setBounds(208, 134, 205, 40);
		frmCheckMedicine.getContentPane().add(btnCheckMedicine);
		frmCheckMedicine.setVisible(true);
		
		btnCheckMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					private Connection con;

					@Override
					public void run() {
						/*Database ad=new Database();
						con = ad.DB();
						String query="select * from Medicine where MedicineName=?";
						PreparedStatement pd;
						try {
							pd = con.prepareStatement(query);
							pd.setString(1, textField.getText().trim());
							ResultSet rs=pd.executeQuery();
							int i=0;
							while(rs.next())
							{
								i++;
							}
							if(i==1)
							{
								JOptionPane.showMessageDialog(null, "Medicine Available");
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Medicine Not Available");
							}
							pd.close();
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}*/
						MedicinDatabase medicine=new MedicinDatabase(textField.getText().trim());
						if (medicine.medicineAvalaible==true) {
							JOptionPane.showMessageDialog(null, "Medicine Available");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Medicine Not Available");
						}
						
						
					}
				});
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new AdminWorkPage();
						frmCheckMedicine.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 10, 89, 23);
		frmCheckMedicine.getContentPane().add(btnBack);
	}

}
