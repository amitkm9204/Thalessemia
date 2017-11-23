package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ConductSeminar {

	private JFrame frmSeminar;
	public static String ss;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConductSeminar window = new ConductSeminar();
					window.frmSeminar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConductSeminar() {
		initialize();
	}

	private void initialize() {
		frmSeminar = new JFrame();
		frmSeminar.setTitle("Seminar");
		frmSeminar.getContentPane().setBackground(new Color(250, 240, 230));
		frmSeminar.setBounds(100, 100, 635, 426);
		frmSeminar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSeminar.getContentPane().setLayout(null);
		
		JButton btnThalessemia = new JButton("Thalessemia");
		btnThalessemia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new WhatIsThalessemia();
						//frmSeminar.dispose();
						
					}
				});
			}
		});
		btnThalessemia.setBackground(new Color(34, 139, 34));
		btnThalessemia.setForeground(new Color(255, 69, 0));
		btnThalessemia.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnThalessemia.setBounds(10, 100, 272, 100);
		frmSeminar.getContentPane().add(btnThalessemia);
		
		JButton btnPrevention = new JButton("Prevention");
		btnPrevention.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new PreventionOnThalessemia();
						//frmSeminar.dispose();
						
					}
				});
			}
		});
		btnPrevention.setForeground(new Color(255, 69, 0));
		btnPrevention.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnPrevention.setBackground(new Color(34, 139, 34));
		btnPrevention.setBounds(337, 100, 272, 100);
		frmSeminar.getContentPane().add(btnPrevention);
		
		JButton btnFight = new JButton("Fight");
		btnFight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new FightWithThalessemia();
						//frmSeminar.dispose();
						
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
						if(ss.equals("admin")) {
							new AdminWorkPage();
							frmSeminar.dispose();
						}else
						{
							new UserWorkPage();
							frmSeminar.dispose();
						}
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 353, 89, 23);
		frmSeminar.getContentPane().add(btnBack);
		
		btnFight.setForeground(new Color(255, 69, 0));
		btnFight.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnFight.setBackground(new Color(34, 139, 34));
		btnFight.setBounds(190, 246, 272, 100);
		frmSeminar.getContentPane().add(btnFight);
		
		JLabel lblNewLabel = new JLabel("Seminar Details");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(10, 11, 566, 37);
		frmSeminar.getContentPane().add(lblNewLabel);
		frmSeminar.setVisible(true);
	}

}
