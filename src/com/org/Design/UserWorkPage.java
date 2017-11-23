package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class UserWorkPage {

	private JFrame UserWorkingPage;
	private JButton button_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserWorkPage window = new UserWorkPage();
					window.UserWorkingPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserWorkPage() {
		initialize();
	}

	private void initialize() {
		UserWorkingPage = new JFrame();
		UserWorkingPage.setTitle("User Working Page");
		UserWorkingPage.getContentPane().setBackground(new Color(216, 191, 216));
		UserWorkingPage.setBounds(100, 100, 800, 700);
		UserWorkingPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserWorkingPage.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Screening Test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new ScreeningTest();
						UserWorkingPage.dispose();
						
					}
				});
			}
		});
		btnNewButton.setBackground(new Color(233, 150, 122));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(10, 142, 341, 96);
		UserWorkingPage.getContentPane().add(btnNewButton);
		
		JButton btnSeminarDetails = new JButton("Seminar Details");
		btnSeminarDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					

					@Override
					public void run() {
						ConductSeminar.ss="user";
						FightWithThalessemia.ss="user";
						WhatIsThalessemia.ss="user";
						PreventionOnThalessemia.ss="user";
						new ConductSeminar();
						UserWorkingPage.dispose();
						
					}
				});
			}
		});
		btnSeminarDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSeminarDetails.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSeminarDetails.setBackground(new Color(233, 150, 122));
		btnSeminarDetails.setBounds(450, 142, 324, 96);
		UserWorkingPage.getContentPane().add(btnSeminarDetails);
		
		JButton btnBloodDonation = new JButton("Blood Donation");
		btnBloodDonation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new BloodDonation();
						UserWorkingPage.dispose();
						
					}
				});
			}
		});
		btnBloodDonation.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBloodDonation.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnBloodDonation.setBackground(new Color(233, 150, 122));
		btnBloodDonation.setBounds(10, 268, 341, 96);
		UserWorkingPage.getContentPane().add(btnBloodDonation);
		
		JLabel lblNewLabel = new JLabel("Users Access Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 764, 44);
		UserWorkingPage.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel(UserPage.name);
		label.setHorizontalTextPosition(SwingConstants.RIGHT);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(473, 67, 211, 21);
		UserWorkingPage.getContentPane().add(label);
		
		button_2 = new JButton("Logout");
		button_2.setForeground(new Color(0, 0, 205));
		button_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button_2.setBorder(null);
		button_2.setBackground(new Color(216, 191, 216));
		button_2.setBounds(694, 66, 80, 23);
		UserWorkingPage.getContentPane().add(button_2);
		
		JButton btnCheckBlood = new JButton("Check Blood");
		btnCheckBlood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						CheckBlood.ss="user";
						new CheckBlood();
						UserWorkingPage.dispose();
						
					}
				});
			}
		});
		btnCheckBlood.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCheckBlood.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCheckBlood.setBackground(new Color(233, 150, 122));
		btnCheckBlood.setBounds(450, 268, 324, 96);
		UserWorkingPage.getContentPane().add(btnCheckBlood);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new UserPage();
						UserWorkingPage.dispose();
						
					}
				});
			}
		});
		UserWorkingPage.setVisible(true);
	}
}
