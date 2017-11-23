package com.org.Design;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class WhatIsThalessemia {

	protected static String ss;
	private JFrame frame;
	private JFrame WhatIsThalessemia;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhatIsThalessemia window = new WhatIsThalessemia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WhatIsThalessemia() {
		initialize();
	}

	private void initialize() {
		WhatIsThalessemia = new JFrame();
		WhatIsThalessemia.setTitle("What is Thalessemia");
		WhatIsThalessemia.getContentPane().setBackground(new Color(255, 239, 213));
		WhatIsThalessemia.setResizable(false);
		WhatIsThalessemia.setBounds(100, 100, 576, 420);
		WhatIsThalessemia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		WhatIsThalessemia.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What is Thalessemia");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 11, 550, 44);
		WhatIsThalessemia.getContentPane().add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date : 6th dec 2017");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(23, 103, 213, 25);
		WhatIsThalessemia.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time : 10 A.M.");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(23, 138, 213, 25);
		WhatIsThalessemia.getContentPane().add(lblTime);
		
		JLabel lblVenueBmcburdwan = new JLabel("Venue : BMC,Burdwan");
		lblVenueBmcburdwan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVenueBmcburdwan.setBounds(23, 174, 257, 25);
		WhatIsThalessemia.getContentPane().add(lblVenueBmcburdwan);
		WhatIsThalessemia.setVisible(true);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					


					@Override
					public void run() {
						if(ss.equals("admin")) {
							new AdminWorkPage();
							WhatIsThalessemia.dispose();
						}else
						{
							new UserWorkPage();
							WhatIsThalessemia.dispose();
						}
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 357, 89, 23);
		WhatIsThalessemia.getContentPane().add(btnBack);
	}

}
