package com.org.Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputPage {

	private JFrame InputPage;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputPage window = new InputPage();
					window.InputPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InputPage() {
		initialize();
	}

	private void initialize() {
		InputPage = new JFrame();
		InputPage.getContentPane().setBackground(new Color(255, 222, 173));
		InputPage.setTitle("Input Details");
		InputPage.setBounds(100, 100, 548, 395);
		InputPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InputPage.getContentPane().setLayout(null);
		InputPage.setVisible(true);
		
		JLabel lblpleaseProvideThe = new JLabel("------------------Please Provide The Following-------------");
		lblpleaseProvideThe.setForeground(new Color(0, 100, 0));
		lblpleaseProvideThe.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 20));
		lblpleaseProvideThe.setBounds(20, 11, 512, 31);
		InputPage.getContentPane().add(lblpleaseProvideThe);
		
		JLabel lblRbc = new JLabel("RBC :");
		lblRbc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRbc.setForeground(new Color(210, 105, 30));
		lblRbc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRbc.setBounds(20, 59, 79, 20);
		InputPage.getContentPane().add(lblRbc);
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(109, 53, 404, 31);
		InputPage.getContentPane().add(textField);
		
		JLabel lblHb = new JLabel("HB :");
		lblHb.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHb.setForeground(new Color(210, 105, 30));
		lblHb.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHb.setBounds(20, 99, 79, 20);
		InputPage.getContentPane().add(lblHb);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(109, 93, 404, 31);
		InputPage.getContentPane().add(textField_1);
		
		JLabel lblMcv = new JLabel("MCV :");
		lblMcv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMcv.setForeground(new Color(210, 105, 30));
		lblMcv.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMcv.setBounds(20, 141, 79, 20);
		InputPage.getContentPane().add(lblMcv);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(109, 135, 404, 31);
		InputPage.getContentPane().add(textField_2);
		
		JLabel lblMch = new JLabel("MCH :");
		lblMch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMch.setForeground(new Color(210, 105, 30));
		lblMch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMch.setBounds(0, 183, 99, 20);
		InputPage.getContentPane().add(lblMch);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(109, 177, 404, 31);
		InputPage.getContentPane().add(textField_3);
		
		JLabel lblRdw = new JLabel("RDW :");
		lblRdw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRdw.setForeground(new Color(210, 105, 30));
		lblRdw.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRdw.setBounds(20, 225, 79, 20);
		InputPage.getContentPane().add(lblRdw);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setBounds(109, 219, 404, 31);
		InputPage.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						//new Display();
						int rcb=Integer.parseInt(textField.getText());
						int hb=Integer.parseInt(textField_1.getText());
						int mcv=Integer.parseInt(textField_2.getText());
						int mch=Integer.parseInt(textField_3.getText());
						int rdw=Integer.parseInt(textField_4.getText());
						if(rcb>5&&rdw<3&&mcv<13&&mch<1530&&hb<1000)JOptionPane.showMessageDialog(null, "You are Normal");
						else JOptionPane.showMessageDialog(null, "You need to visit Doctor");
						//InputPage.dispose();
						
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(386, 271, 127, 58);
		InputPage.getContentPane().add(btnNewButton);
		InputPage.setVisible(true);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new UserWorkPage();
						InputPage.dispose();
						
					}
				});
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(new Color(255, 69, 0));
		btnBack.setBounds(20, 322, 89, 23);
		InputPage.getContentPane().add(btnBack);
	}

}
