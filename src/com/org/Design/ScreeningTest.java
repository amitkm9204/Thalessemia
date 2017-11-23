package com.org.Design;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

public class ScreeningTest {

	private JFrame ScreeningTest;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreeningTest window = new ScreeningTest();
					window.ScreeningTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ScreeningTest() {
		initialize();
	}

	private void initialize() {
		ScreeningTest = new JFrame();
		ScreeningTest.setTitle("Screening Test");
		ScreeningTest.setResizable(false);
		ScreeningTest.setBounds(100, 100, 331, 483);
		ScreeningTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreeningTest.getContentPane().setLayout(null);
		ScreeningTest.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/Screening.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -15, 538, 484);
		ScreeningTest.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(0, 183, 325, 275);
		ScreeningTest.getContentPane().add(btnNewButton);
		btnNewButton.setOpaque(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new TipsPage();
						ScreeningTest.dispose();
						
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
						new UserWorkPage();
						ScreeningTest.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 10, 89, 23);
		ScreeningTest.getContentPane().add(btnBack);
	}

}
