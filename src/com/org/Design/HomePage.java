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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame Homepage;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() {
		initialize();
	}

	private void initialize() {

		Homepage = new JFrame();
		Homepage.setResizable(false);
		Homepage.getContentPane().setForeground(new Color(0, 0, 0));
		Homepage.getContentPane().setBackground(new Color(189, 183, 107));
		Homepage.setTitle("Thalessemia Management System");
		Homepage.setBounds(100, 100, 700, 500);
		Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Homepage.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("THALESSEMIA MANAGEMENT SYSTEM");
		label.setHorizontalTextPosition(SwingConstants.RIGHT);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("Adobe Garamond Pro Bold", Font.BOLD, 36));
		label.setBounds(10, 11, 664, 48);
		Homepage.getContentPane().add(label);
		
		JButton btnAdminLogin = new JButton("ADMIN PAGE");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new AdminPage();
						Homepage.dispose();
						
					}
				});
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnAdminLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnAdminLogin.setBackground(new Color(107, 142, 35));
		btnAdminLogin.setBounds(23, 185, 300, 140);
		Homepage.getContentPane().add(btnAdminLogin);
		
		JButton btnUserLogin = new JButton("USER PAGE");
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new UserPage();
						Homepage.dispose();
						
					}
				});
			}
		});
		btnUserLogin.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnUserLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnUserLogin.setBackground(new Color(107, 142, 35));
		btnUserLogin.setBounds(361, 185, 300, 140);
		Homepage.getContentPane().add(btnUserLogin);
		Homepage.setVisible(true);
	}
}
