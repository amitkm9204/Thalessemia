package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Survey {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Survey window = new Survey("","");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public Survey(String displayString,String Title) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(250, 250, 210));
		frame.setForeground(new Color(219, 112, 147));
		frame.setBounds(100, 100, 450, 404);
		frame.setTitle(Title);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setEditable(false);
		txtpnTest.setForeground(new Color(135, 206, 250));
		txtpnTest.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnTest.setBackground(new Color(147, 112, 219));
		txtpnTest.setText(displayString);
		txtpnTest.setBounds(10, 11, 414, 319);
		frame.getContentPane().add(txtpnTest);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new AdminWorkPage();
						frame.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(10,341, 89, 23);
		frame.getContentPane().add(btnBack);
		
		frame.setVisible(true);
		
	}
}
