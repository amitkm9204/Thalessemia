package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class CheckBlood {

	public static String ss;
	private JFrame CheckBlood;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBlood window = new CheckBlood();
					window.CheckBlood.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CheckBlood() {
		initialize();
	}

	private void initialize() {
		CheckBlood = new JFrame();
		CheckBlood.setResizable(false);
		CheckBlood.setLocation(new Point(0, 0));
		CheckBlood.getContentPane().setForeground(new Color(0, 0, 0));
		CheckBlood.setTitle("Check Blood");
		CheckBlood.getContentPane().setBackground(new Color(238, 232, 170));
		CheckBlood.setBounds(30, 30, 700, 700);
		CheckBlood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBlood.getContentPane().setLayout(null);
		CheckBlood.setVisible(true);
		
		JLabel lblDonateBloodSave = new JLabel("Donate  Blood  Save  Life");
		lblDonateBloodSave.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblDonateBloodSave.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonateBloodSave.setForeground(new Color(255, 0, 0));
		lblDonateBloodSave.setFont(new Font("Agency FB", Font.PLAIN, 60));
		lblDonateBloodSave.setBounds(75, 11, 549, 48);
		CheckBlood.getContentPane().add(lblDonateBloodSave);
		
		JButton btnNewButton = new JButton("Check Availabilty");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new BloodAvailability();
						
					}
				});
			}
		});
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 36));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.setBounds(340, 129, 334, 86);
		CheckBlood.getContentPane().add(btnNewButton);
		
		JTextPane txtpnTheNeedOf = new JTextPane();
		txtpnTheNeedOf.setEditable(false);
		txtpnTheNeedOf.setBackground(new Color(238, 232, 170));
		txtpnTheNeedOf.setForeground(new Color(139, 0, 0));
		txtpnTheNeedOf.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtpnTheNeedOf.setText("The need of blood is great.On any given day,an average of 34,000 units of bllod are needed to save precious human lives from accident and  burns,heart surgery , organ transplants and patients receiving treatement for leukemia,cancer and other blood diseases .");
		txtpnTheNeedOf.setBounds(7, 173, 323, 286);
		CheckBlood.getContentPane().add(txtpnTheNeedOf);
		
		JTextPane txtpnBlooditRunsIn = new JTextPane();
		txtpnBlooditRunsIn.setEditable(false);
		txtpnBlooditRunsIn.setText("Blood.....it runs in our veins and plays a vital role in the body mechanism.But have you ever spared a thought for those who are fighting with some disease and need blood urgently.Act now and donate your blood without any worry.It won't cost you a thing but bring back the smile on someone's face.");
		txtpnBlooditRunsIn.setForeground(new Color(255, 69, 0));
		txtpnBlooditRunsIn.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtpnBlooditRunsIn.setBackground(new Color(238, 232, 170));
		txtpnBlooditRunsIn.setBounds(7, 470, 667, 151);
		CheckBlood.getContentPane().add(txtpnBlooditRunsIn);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/flashimg.gif")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(340, 240, 334, 219);
		CheckBlood.getContentPane().add(lblNewLabel);
		
		
		JLabel label = new JLabel();
		label.setHorizontalTextPosition(SwingConstants.RIGHT);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(373, 82, 211, 21);
		CheckBlood.getContentPane().add(label);
		
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						if(ss.equals("admin")) {
						new AdminWorkPage();
						CheckBlood.dispose();
						}else
						{
							new UserWorkPage();
							CheckBlood.dispose();
						}
						
					}
				});
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBorder(null);
		button_1.setBackground(new Color(255, 69, 0));
		button_1.setBounds(7, 627, 89, 23);
		CheckBlood.getContentPane().add(button_1);
	}
}
