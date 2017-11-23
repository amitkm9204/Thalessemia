package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class FightWithThalessemia {

	private JFrame FightWithThalessemia;
	public static String ss;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FightWithThalessemia window = new FightWithThalessemia();
					window.FightWithThalessemia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FightWithThalessemia() {
		initialize();
	}

	private void initialize() {
		FightWithThalessemia = new JFrame();
		FightWithThalessemia.setTitle("Fight With Thalessemia");
		FightWithThalessemia.getContentPane().setBackground(new Color(255, 239, 213));
		FightWithThalessemia.setResizable(false);
		FightWithThalessemia.setBounds(100, 100, 576, 420);
		FightWithThalessemia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		FightWithThalessemia.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fight With Thalessemia");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 11, 550, 44);
		FightWithThalessemia.getContentPane().add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date : 7th dec 2017");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(23, 103, 213, 25);
		FightWithThalessemia.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time : 10 A.M.");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(23, 138, 213, 25);
		FightWithThalessemia.getContentPane().add(lblTime);
		
		JLabel lblVenueBmcburdwan = new JLabel("Venue : BMC,Burdwan");
		lblVenueBmcburdwan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVenueBmcburdwan.setBounds(23, 174, 257, 25);
		FightWithThalessemia.getContentPane().add(lblVenueBmcburdwan);
		FightWithThalessemia.setVisible(true);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					


					@Override
					public void run() {
						if(ss.equals("admin")) {
							new AdminWorkPage();
							FightWithThalessemia.dispose();
						}else
						{
							new UserWorkPage();
							FightWithThalessemia.dispose();
						}
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 357, 89, 23);
		FightWithThalessemia.getContentPane().add(btnBack);
		
		
	}

}
