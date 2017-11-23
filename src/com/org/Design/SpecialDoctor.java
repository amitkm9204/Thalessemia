package com.org.Design;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

import com.org.Database.DoctorDatabase;
import com.org.Database.MedicinDatabase;

import java.awt.Color;

public class SpecialDoctor {

	private JFrame frame;
	private JFrame frmCheckMedicine;
	private JTextField textField;
	private JFrame frmCheckDoctor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpecialDoctor window = new SpecialDoctor();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SpecialDoctor() {
		initialize();
	}

	private void initialize() {
		//System.out.println("test");
		frmCheckDoctor= new JFrame();
		frmCheckDoctor.setVisible(true);
		frmCheckDoctor.getContentPane().setBackground(new Color(255, 222, 173));
		frmCheckDoctor.setTitle("Check Doctor");
		frmCheckDoctor.setBounds(100, 100, 450, 300);
		frmCheckDoctor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCheckDoctor.getContentPane().setLayout(null);

		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(175, 74, 238, 32);
		frmCheckDoctor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheName = new JLabel("Enter The Name :");
		lblEnterTheName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterTheName.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblEnterTheName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterTheName.setBounds(10, 74, 155, 32);
		frmCheckDoctor.getContentPane().add(lblEnterTheName);
		
		JButton btnCheckMedicine = new JButton("Check Doctor");
		btnCheckMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					private Connection con;

					@Override
					public void run() {
						/*Database ad=new Database();
						con = ad.DB();
						String query="select * from Doctor where Name=?";
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
								JOptionPane.showMessageDialog(null, "Doctor Available");
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Doctor Not Available");
							}
							pd.close();
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}*/
						DoctorDatabase doctor=new DoctorDatabase(textField.getText().trim());
						if (doctor.doctorAvalaible==true) {
							JOptionPane.showMessageDialog(null, "Doctor Available");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Doctor Not Available");
						}
						
						
					}
				});
			}
		});
		btnCheckMedicine.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCheckMedicine.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCheckMedicine.setBounds(208, 134, 205, 40);
		frmCheckDoctor.getContentPane().add(btnCheckMedicine);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new AdminWorkPage();
						frmCheckDoctor.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 10, 89, 23);
		frmCheckDoctor.getContentPane().add(btnBack);
		
	}

}
