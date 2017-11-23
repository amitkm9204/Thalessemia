package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminWorkPage {

	private JFrame AdminWorkingPage;
	private JButton btnSurvey;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminWorkPage window = new AdminWorkPage();
					window.AdminWorkingPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminWorkPage() {
		
		initialize();
	}

	private void initialize() {
		AdminWorkingPage = new JFrame();
		AdminWorkingPage.setResizable(false);
		AdminWorkingPage.setAlwaysOnTop(true);
		AdminWorkingPage.setAutoRequestFocus(false);
		AdminWorkingPage.setTitle("Admin Working Page");
		AdminWorkingPage.getContentPane().setBackground(new Color(255, 228, 181));
		AdminWorkingPage.setBackground(new Color(233, 150, 122));
		AdminWorkingPage.setForeground(new Color(245, 222, 179));
		AdminWorkingPage.getContentPane().setForeground(new Color(255, 69, 0));
		AdminWorkingPage.setBounds(100, 0, 800, 800);
		AdminWorkingPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminWorkingPage.getContentPane().setLayout(null);
		AdminWorkingPage.setVisible(true);
		
		JLabel label = new JLabel("THALESSEMIA MANAGEMENT SYSTEM");
		label.setHorizontalTextPosition(SwingConstants.RIGHT);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("Adobe Garamond Pro Bold", Font.BOLD, 36));
		label.setBounds(56, 11, 664, 48);
		AdminWorkingPage.getContentPane().add(label);
		
		JButton btnCheckBlood = new JButton("Check Blood");
		btnCheckBlood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						CheckBlood.ss="admin";
						new CheckBlood();
						AdminWorkingPage.dispose();
						
					}
				});
			}
		});
		btnCheckBlood.setForeground(new Color(139, 0, 0));
		btnCheckBlood.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnCheckBlood.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnCheckBlood.setBackground(new Color(154, 200, 10));
		btnCheckBlood.setBounds(37, 171, 326, 150);
		AdminWorkingPage.getContentPane().add(btnCheckBlood);
		
		JButton btnMedicine = new JButton("Medicine");
		btnMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new Medicine();
						AdminWorkingPage.dispose();
					}
				});
			}
		});
		btnMedicine.setForeground(new Color(139, 0, 0));
		btnMedicine.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnMedicine.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnMedicine.setBackground(new Color(154, 200, 10));
		btnMedicine.setBounds(423, 171, 332, 150);
		AdminWorkingPage.getContentPane().add(btnMedicine);
		
		JButton btnSpecialDoctor = new JButton("Special Doctor");
		btnSpecialDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						//System.out.println("test");
						new SpecialDoctor();
						AdminWorkingPage.dispose();
						
					}
				});
			}
		});
		btnSpecialDoctor.setForeground(new Color(139, 0, 0));
		btnSpecialDoctor.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnSpecialDoctor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSpecialDoctor.setBackground(new Color(154, 200, 10));
		btnSpecialDoctor.setBounds(37, 368, 326, 150);
		AdminWorkingPage.getContentPane().add(btnSpecialDoctor);
		
		JButton btnConductSeminar = new JButton("Conduct Seminar");
		btnConductSeminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					


					@Override
					public void run() {
						ConductSeminar.ss="admin";
						FightWithThalessemia.ss="admin";
						WhatIsThalessemia.ss="admin";
						PreventionOnThalessemia.ss="admin";
						new ConductSeminar();
						AdminWorkingPage.dispose();
						
					}
				});
			}
		});
		btnConductSeminar.setForeground(new Color(139, 0, 0));
		btnConductSeminar.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnConductSeminar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnConductSeminar.setBackground(new Color(154, 200, 10));
		btnConductSeminar.setBounds(423, 368, 332, 150);
		AdminWorkingPage.getContentPane().add(btnConductSeminar);
		
		JButton btnSurveyResult = new JButton("Management");
		btnSurveyResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new SurveyResult();
						AdminWorkingPage.dispose();
						
					}
				});
			}
		});
		btnSurveyResult.setForeground(new Color(139, 0, 0));
		btnSurveyResult.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnSurveyResult.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSurveyResult.setBackground(new Color(154, 200, 10));
		btnSurveyResult.setBounds(37, 575, 326, 150);
		AdminWorkingPage.getContentPane().add(btnSurveyResult);
		
		btnSurvey = new JButton("Survey");
		btnSurvey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						String str = "In 2008, in Spain, a baby was selectively\n"
								+ " implanted to be a cure for his brother's thalassemia.\n"+
								"The child was born from an embryo screened to be free \n"
								+ "of the disease before implantation with in vitro fertilization.\n"+
								" The baby's supply of immunologically compatible cord blood was saved for transplantation to his brother.\n"+
								" The transplantation was considered successful.\n"+
								" In 2009, a group of doctors and specialists in Chennai \n"
								+ "and Coimbatore registered the successful treatment of thalassemia\n"
								+ " in a child using an unaffected sibling's umbilical cord blood.";
						new Survey(str,"Survey");
						AdminWorkingPage.dispose();
						
					}
				});
			}
		});
		btnSurvey.setForeground(new Color(139, 0, 0));
		btnSurvey.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnSurvey.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSurvey.setBackground(new Color(154, 200, 10));
		btnSurvey.setBounds(423, 575, 326, 150);
		AdminWorkingPage.getContentPane().add(btnSurvey);
		
		JButton btnLogOut = new JButton("Logout");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new AdminPage();
						AdminWorkingPage.dispose();
						
					}
				});
			}
		});
		btnLogOut.setForeground(new Color(0, 0, 205));
		btnLogOut.setBackground(new Color(255, 228, 181));
		btnLogOut.setBorder(null);
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnLogOut.setBounds(694, 70, 80, 23);
		AdminWorkingPage.getContentPane().add(btnLogOut);
		
		JLabel lblUserName = new JLabel(AdminPage.UserName);
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserName.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserName.setForeground(new Color(0, 0, 0));
		lblUserName.setBounds(473, 71, 211, 21);
		AdminWorkingPage.getContentPane().add(lblUserName);
	}
}
