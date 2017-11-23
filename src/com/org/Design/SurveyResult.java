package com.org.Design;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SurveyResult {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SurveyResult window = new SurveyResult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SurveyResult() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 478, 300);
		frame.setTitle("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Management");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						String str = "Mild thalassemia: people with thalassemia traits do not require medical "
								+ "or follow-up care after the initial diagnosis is made."
								+ " People with ß-thalassemia trait should be warned that their "
								+ "condition can be misdiagnosed as the more common iron deficiency anemia. "
								+ "They should avoid routine use of iron supplements; iron deficiency can develop,"
								+ " though, during pregnancy or from chronic bleeding."
								+ " Counseling is indicated in all persons with genetic disorders,"
								+ " especially when the family is at risk of a severe form of disease that may be prevented.";
						new Survey(str,"Management");

						
					}
				});
			}
		});
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(24, 41, 172, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMedication = new JButton("Medication");
		btnMedication.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMedication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						String str="Multiple blood transfusions can result in iron overload. The iron overload related to thalassemia may be treated by chelation therapy with the medications deferoxamine, deferiprone, or deferasirox. These treatments have resulted in improved life expectancy in those with thalassemia major.\r\n" + 
								"\r\n" + 
								"Deferoxamine is only effective via daily injections which makes its long-term use more difficult. It has the benefit of being inexpensive and decent long-term safety. Adverse effects are primary skin reactions around the injection site and hearing loss.\r\n" + 
								"\r\n" + 
								"Deferasirox has the benefit of being an oral medication. Common side effects include: nausea, vomiting and diarrhea. It however is not effective in everyone and is probably not suitable in those with significant cardiac issues related to iron overload. The cost is also significant.";
						new Survey(str,"Medication");
						
					}
				});
			}
		});
		btnMedication.setForeground(new Color(0, 0, 0));
		btnMedication.setBackground(new Color(244, 164, 96));
		btnMedication.setBounds(24, 136, 172, 56);
		frame.getContentPane().add(btnMedication);
		
		JButton btnCarrierDetection = new JButton("Carrier Detection");
		btnCarrierDetection.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCarrierDetection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						String str = "•	A screening policy exists in Cyprus to reduce the incidence of thalassemia, which, since the program's implementation in the 1970s (which also includes prenatal screening and abortion), has reduced the number of children born with the hereditary blood disease from one of every 158 births to almost zero.\r\n" + 
								"\r\n" + 
								"•	In Iran as a premarital screening, the man's red cell indices are checked first, if he has microcytosis (mean cell hemoglobin less than 27 pg or mean red cell volume less than 80 fl), the woman is tested. When both are microcytic, their hemoglobin A2 concentrations are measured. If both have a concentration above 3.5% (diagnostic of thalassemia trait) they are referred to the local designated health post for genetic counseling.";
						new Survey(str,"Carrier Detection");
						
					}
				});
			}
		});
		btnCarrierDetection.setForeground(new Color(0, 0, 0));
		btnCarrierDetection.setBackground(new Color(244, 164, 96));
		btnCarrierDetection.setBounds(222, 136, 217, 56);
		frame.getContentPane().add(btnCarrierDetection);
		
		JButton btnBoneMarrow = new JButton("Bone Marrow");
		btnBoneMarrow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBoneMarrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						String str = "Bone marrow transplantation may offer the possibility of a cure in young people who have an HLA-matched donor. Success rates have been in the 80–90% range. Mortality from the procedure is about 3%. There are no randomized controlled trials which have tested the safety and efficacy of non-identical donor bone marrow transplantation in persons with ß- thallassemia who are dependent on blood transfusion.\r\n" + 
								"\r\n" + 
								"If the person does not have an HLA-matched compatible donor, another method called bone marrow transplantation (BMT) from haploidentical mother to child (mismatched donor) may be used. In a study of 31 people, the thalassemia-free survival rate 70%, rejection 23%, and mortality 7%. The best results are with very young people.";
								
						new Survey(str,"Bone Marrow");
						
					}
				});
				
			}
		});
		btnBoneMarrow.setForeground(new Color(0, 0, 0));
		btnBoneMarrow.setBackground(new Color(244, 164, 96));
		btnBoneMarrow.setBounds(222, 41, 217, 56);
		frame.getContentPane().add(btnBoneMarrow);
		frame.setVisible(true);
		
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
		btnBack.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
