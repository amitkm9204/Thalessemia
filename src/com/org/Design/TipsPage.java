package com.org.Design;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

public class TipsPage {

	private JFrame Tips;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TipsPage window = new TipsPage();
					window.Tips.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TipsPage() {
		initialize();
	}

	private void initialize() {
		Tips = new JFrame();
		Tips.getContentPane().setBackground(new Color(255, 222, 173));
		Tips.setResizable(false);
		Tips.setTitle("Tips Page");
		Tips.setBounds(100, 100, 363, 390);
		Tips.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tips.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/Tips.jpeg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 360, 264);
		Tips.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new InputPage();
						Tips.dispose();
						
					}
				});
			}
		});
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(181, 294, 166, 56);
		Tips.getContentPane().add(btnNewButton);
		Tips.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new UserWorkPage();
						Tips.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10, 327, 89, 23);
		Tips.getContentPane().add(btnBack);
	}

}
