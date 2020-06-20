package elmerstrats;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;

public class ElmerStrats extends JFrame implements ItemListener {
	public void playAgain() {
		ElmerStrats theSolver = new ElmerStrats();
		theSolver.setSize(new Dimension(530, 620));
		theSolver.setVisible(true);
	}
	
	public ElmerStrats() {	
		
		Image imgMin = new ImageIcon(this.getClass().getResource("/Minfilia.png")).getImage();
		Image imgBah = new ImageIcon(this.getClass().getResource("/Bahamut.png")).getImage();
		Image imgGil = new ImageIcon(this.getClass().getResource("/Gilgamesh.png")).getImage();
		Image imgGod = new ImageIcon(this.getClass().getResource("/Godbert.png")).getImage();
		Image imgHil = new ImageIcon(this.getClass().getResource("/Hildibrand.png")).getImage();
		Image imgMog = new ImageIcon(this.getClass().getResource("/Moogle.png")).getImage();
		Image imgMor = new ImageIcon(this.getClass().getResource("/Morbol.png")).getImage();
		Image imgSyl = new ImageIcon(this.getClass().getResource("/Sylph.png")).getImage();
		Image imgTit = new ImageIcon(this.getClass().getResource("/Titan.png")).getImage();
		Image imgUri = new ImageIcon(this.getClass().getResource("/Urianger.png")).getImage();
		Image imgYsh = new ImageIcon(this.getClass().getResource("/Yshtola.png")).getImage();
		Image imgBom = new ImageIcon(this.getClass().getResource("/Bomb.png")).getImage();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(530, 610);
		setLocationRelativeTo(null);
		setTitle("King Elmer Triple Triad Solver");
		getContentPane().setLayout(null);
		
		
		String[] nameStrings1 = {"", "Y'shtola", "Titan", "Gilgamesh", "Urianger"};
		String[] locStrings1 = {"", "Top Left", "Top Middle", "Bottom Right"};
		
		String[] nameStrings2 = {"", "Hildibrand", "Bahamut"};
		String[] locStrings2 = {"", "Mid Right", "Top Right"};
		
		String[] nameStrings3 = {"", "Bahamut", "Gilgamesh", "???"};
		
		String[] nameStrings4 = {"", "Urianger", "Bahamut"};
		String[] locStrings4 = {"", "Mid Right", "Top Middle"};
		
		String[] nameStrings5 = {"", "Y'shtola", "Urianger", "Titan"};
		String[] locStrings5 = {"", "Bottom Left", "Bottom Middle", "Bottom Right", "Mid Right", "Top Left", "Top Middle"};
		
		String[] nameStrings6 = {"", "Titan", "Gilgamesh"};
		String[] locStrings6 = {"", "Top Middle", "Top Right"};
		
		String[] nameStrings7 = {"", "Y'shtola", "Titan", "Gilgamesh"};
		String[] locStrings7 = {"", "Mid Right", "Top Left", "Top Middle"};
		
		JLabel lblTop = new JLabel("Who goes first?");
		lblTop.setHorizontalAlignment(SwingConstants.CENTER);
		lblTop.setBounds(10, 11, 510, 23);
		getContentPane().add(lblTop);
		
		JLabel lblPlay = new JLabel("");
        lblPlay.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlay.setBounds(54, 70, 414, 23);
        getContentPane().add(lblPlay);
		
		JLabel lblTL = new JLabel("");
		lblTL.setBounds(80, 100, 104, 128);
		getContentPane().add(lblTL);
		
		JLabel lblTM = new JLabel("");
		lblTM.setBounds(206, 100, 104, 128);
		getContentPane().add(lblTM);
		
		JLabel lblTR = new JLabel("");
		lblTR.setBounds(330, 100, 104, 128);
		getContentPane().add(lblTR);
		
		JLabel lblML = new JLabel("");
		lblML.setBounds(80, 238, 104, 128);
		getContentPane().add(lblML);
		
		JLabel lblMM = new JLabel("");
		lblMM.setBounds(206, 238, 104, 128);
		getContentPane().add(lblMM);
		
		JLabel lblMR = new JLabel("");
		lblMR.setBounds(330, 238, 104, 128);
		getContentPane().add(lblMR);
		
		JLabel lblBL = new JLabel("");
		lblBL.setBounds(80, 377, 104, 128);
		getContentPane().add(lblBL);
		
		JLabel lblBM = new JLabel("");
		lblBM.setBounds(206, 377, 104, 128);
		getContentPane().add(lblBM);
		
		JLabel lblBR = new JLabel("");
		lblBR.setBounds(330, 377, 104, 128);
		getContentPane().add(lblBR);
		
		JButton btnLeft = new JButton("Me");
		btnLeft.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLeft.setBounds(136, 36, 120, 23);
		getContentPane().add(btnLeft);
		
		JButton btnRight = new JButton("Elmer");
		btnRight.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRight.setBounds(278, 36, 120, 23);
		getContentPane().add(btnRight);
		
		JButton btnLeft2 = new JButton("");
		btnLeft2.setSize(120, 23);
		btnLeft2.setLocation(136, 36);
		btnLeft2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLeft2.setBounds(136, 36, 120, 23);
		getContentPane().add(btnLeft2);
		btnLeft2.setVisible(false);
		
		JButton btnRight2 = new JButton("");
		btnRight2.setSize(120, 23);
		btnRight2.setLocation(278, 36);
		btnRight2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRight2.setBounds(278, 36, 120, 23);
		getContentPane().add(btnRight2);
		btnRight2.setVisible(false);
		
		JButton btnLeft3 = new JButton("");
		btnLeft3.setSize(120, 23);
		btnLeft3.setLocation(136, 36);
		btnLeft3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLeft3.setBounds(136, 36, 120, 23);
		getContentPane().add(btnLeft3);
		btnLeft3.setVisible(false);
		
		JButton btnRight3 = new JButton("");
		btnRight3.setSize(120, 23);
		btnRight3.setLocation(278, 36);
		btnRight3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRight3.setBounds(278, 36, 120, 23);
		getContentPane().add(btnRight3);
		btnRight3.setVisible(false);
		
		JComboBox comboBoxNames1 = new JComboBox(nameStrings1);
		comboBoxNames1.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames1);
		comboBoxNames1.setVisible(false);
		
		JComboBox comboBoxLocs1 = new JComboBox(locStrings1);
		comboBoxLocs1.setBounds(278, 36, 120, 22);
		getContentPane().add(comboBoxLocs1);
		comboBoxLocs1.setVisible(false);
		
		JComboBox comboBoxNames2 = new JComboBox(nameStrings2);
		comboBoxNames2.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames2);
		comboBoxNames2.setVisible(false);
		
		JComboBox comboBoxLocs2 = new JComboBox(locStrings2);
		comboBoxLocs2.setBounds(278, 36, 120, 22);
		getContentPane().add(comboBoxLocs2);
		comboBoxLocs2.setVisible(false);
		
		JComboBox comboBoxNames3 = new JComboBox(nameStrings3);
		comboBoxNames3.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames3);
		comboBoxNames3.setVisible(false);
		
		JComboBox comboBoxNames4 = new JComboBox(nameStrings4);
		comboBoxNames4.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames4);
		comboBoxNames4.setVisible(false);
		
		JComboBox comboBoxLocs4 = new JComboBox(locStrings4);
		comboBoxLocs4.setBounds(278, 36, 120, 22);
		getContentPane().add(comboBoxLocs4);
		comboBoxLocs4.setVisible(false);
		
		JComboBox comboBoxNames5 = new JComboBox(nameStrings5);
		comboBoxNames5.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames5);
		comboBoxNames5.setVisible(false);
		
		JComboBox comboBoxLocs5 = new JComboBox(locStrings5);
		comboBoxLocs5.setBounds(278, 36, 120, 22);
		getContentPane().add(comboBoxLocs5);
		comboBoxLocs5.setVisible(false);
		
		JComboBox comboBoxNames6 = new JComboBox(nameStrings6);
		comboBoxNames6.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames6);
		comboBoxNames6.setVisible(false);
		
		JComboBox comboBoxLocs6 = new JComboBox(locStrings6);
		comboBoxLocs6.setBounds(278, 36, 120, 22);
		getContentPane().add(comboBoxLocs6);
		comboBoxLocs6.setVisible(false);
		
		JComboBox comboBoxNames7 = new JComboBox(nameStrings7);
		comboBoxNames7.setBounds(136, 36, 120, 22);
		getContentPane().add(comboBoxNames7);
		comboBoxNames7.setVisible(false);
		
		JComboBox comboBoxLocs7 = new JComboBox(locStrings7);
		comboBoxLocs7.setBounds(278, 36, 120, 22);
		getContentPane().add(comboBoxLocs7);
		comboBoxLocs7.setVisible(false);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(206, 36, 120, 23);
		getContentPane().add(btnNext);
		btnNext.setVisible(false);
		
		JButton btnNext2 = new JButton("Next");
		btnNext2.setBounds(206, 36, 120, 23);
		getContentPane().add(btnNext2);
		btnNext2.setVisible(false);
		
		JButton btnReset = new JButton("Play Again");
		btnReset.setBounds(206, 36, 120, 23);
		getContentPane().add(btnReset);
		btnReset.setVisible(false);
		
		// You start first.
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
				lblMM.setIcon(new ImageIcon(imgMin));
				
				lblTop.setText("Where did Elmer play Godbert?");
				btnLeft.setText("Bottom Middle");
				btnRight.setText("Mid Left");
				
				if (e.getActionCommand().equals("Bottom Middle")) { // Godbert in 2
					lblBM.setIcon(new ImageIcon(imgGod));
					lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
					lblML.setIcon(new ImageIcon(imgSyl));
					
					lblTop.setText("What did Elmer play next?");
					btnLeft.setVisible(false);
					btnRight.setVisible(false);
					comboBoxNames1.setVisible(true);
					comboBoxLocs1.setVisible(true);
					
					comboBoxNames1.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent ie) {
							if (ie.getItem().equals("Y'shtola")) { // Y'shtola in 7
								lblTL.setIcon(new ImageIcon(imgYsh));
								lblPlay.setText("Play Morbol in the bottom right."); // Play Morbol in 3
								lblBR.setIcon(new ImageIcon(imgMor));
								
								comboBoxNames1.setVisible(false);
								comboBoxLocs1.setVisible(false);
								
								lblTop.setText("");
								btnNext.setVisible(true);

								btnNext.addActionListener(new ActionListener() { 
									public void actionPerformed(ActionEvent e) {
										lblTop.setText("Elmer plays Bahamut in the mid right."); // Bahamut in 6
										lblMR.setIcon(new ImageIcon(imgBah));
										lblPlay.setText("Play Bomb in the top right."); // Play Bomb in 9
										lblTR.setIcon(new ImageIcon(imgBom));
										btnNext.setText("Again");
										
										if (e.getActionCommand().equals("Again")) {
											lblTop.setText("Elmer plays Urianger in the top middle."); // Urianger in 8
											lblTM.setIcon(new ImageIcon(imgUri));
											lblPlay.setText("Play Moogle in the bottom left."); // Finish Moogle in 1
											lblBL.setIcon(new ImageIcon(imgMog));
											btnNext.setVisible(false);
											btnReset.setVisible(true);
											btnReset.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													playAgain();
													dispose();
												}
											});
										}
									}
								});
							}
							
							else if (ie.getItem().equals("Titan")) {
								comboBoxLocs1.addItemListener(new ItemListener() {
									public void itemStateChanged(ItemEvent ie) {
										if (ie.getItem().equals("Top Left")) { // Titan in 7
											lblTL.setIcon(new ImageIcon(imgTit));
											lblPlay.setText("Play Bomb in the top middle."); // Play Bomb in 8
											lblTM.setIcon(new ImageIcon(imgBom));
											
											comboBoxNames1.setVisible(false);
											comboBoxLocs1.setVisible(false);
											comboBoxNames1.removeAllItems();
											comboBoxLocs1.removeAllItems();
											
											comboBoxNames2.setVisible(true);
											comboBoxLocs2.setVisible(true);
											
											comboBoxNames2.addItemListener(new ItemListener() {
												public void itemStateChanged(ItemEvent ie) {
													lblTop.setText("What did Elmer play next?");
													if (ie.getItem().equals("Hildibrand")) {
														comboBoxLocs2.addItemListener(new ItemListener() {
															public void itemStateChanged(ItemEvent ie) {
																if (ie.getItem().equals("Mid Right")) { // Hildibrand in 6
																	lblTop.setText("");
																	lblMR.setIcon(new ImageIcon(imgHil));
																	lblPlay.setText("Play Morbol in the bottom right."); // Play Morbol in 3
																	lblBR.setIcon(new ImageIcon(imgMor));
																	
																	comboBoxNames2.setVisible(false);
																	comboBoxLocs2.setVisible(false);
																	
																	btnNext.setVisible(true);
																	btnNext.addActionListener(new ActionListener() { 
																		public void actionPerformed(ActionEvent e) {
																			lblTop.setText("Elmer plays Urianger in the top right."); // Urianger in 9
																			lblTR.setIcon(new ImageIcon(imgUri));
																			lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																			lblBL.setIcon(new ImageIcon(imgMog));
																			btnNext.setVisible(false);
																			btnReset.setVisible(true);
																			btnReset.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					playAgain();
																				}
																			});
																		}
																	});
																}
																
																else if (ie.getItem().equals("Top Right")) { // Hildibrand in 9
																	lblTop.setText("");
																	lblTR.setIcon(new ImageIcon(imgHil));
																	lblPlay.setText("Play Morbol in the bottom right."); // Play Morbol in 3
																	lblBR.setIcon(new ImageIcon(imgMor));
																	
																	comboBoxNames2.setVisible(false);
																	comboBoxLocs2.setVisible(false);
																	
																	btnNext.setVisible(true);
																	btnNext.addActionListener(new ActionListener() { 
																		public void actionPerformed(ActionEvent e) {
																			lblTop.setText("Elmer plays Bahamut in the mid right."); // Bahamut in 6
																			lblMR.setIcon(new ImageIcon(imgBah));
																			lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																			lblBL.setIcon(new ImageIcon(imgMog));
																			btnNext.setVisible(false);
																			btnReset.setVisible(true);
																			btnReset.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					playAgain();
																					dispose();		
																				}
																			});
																		}
																	});
																}
															}
														});
													}
													
													else if (ie.getItem().equals("Bahamut")) {
														comboBoxLocs2.addItemListener(new ItemListener() {
															public void itemStateChanged(ItemEvent ie) {
																if (ie.getItem().equals("Mid Right")) { // Bahamut in 6
																	lblTop.setText("");
																	lblMR.setIcon(new ImageIcon(imgBah));
																	lblPlay.setText("Play Morbol in the bottom right."); // Play Morbol in 3
																	lblBR.setIcon(new ImageIcon(imgMor));
																	
																	comboBoxNames2.setVisible(false);
																	comboBoxLocs2.setVisible(false);
																	
																	btnNext.setVisible(true);
																	btnNext.addActionListener(new ActionListener() { 
																		public void actionPerformed(ActionEvent e) {
																			lblTop.setText("Elmer plays Urianger in the top right."); // Urianger in 9
																			lblTR.setIcon(new ImageIcon(imgUri));
																			lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																			lblBL.setIcon(new ImageIcon(imgMog));
																			btnNext.setVisible(false);
																			btnReset.setVisible(true);
																			btnReset.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					playAgain();
																					dispose();		
																				}
																			});
																		}
																	});
																}
																
																else if (ie.getItem().equals("Top Right")) { // Bahamut in 9
																	lblTop.setText("");
																	lblTR.setIcon(new ImageIcon(imgBah));
																	lblPlay.setText("Play Morbol in the mid right."); // Play Morbol in 6
																	lblMR.setIcon(new ImageIcon(imgMor));
																	
																	comboBoxNames2.setVisible(false);
																	comboBoxLocs2.setVisible(false);
																	
																	btnNext.setVisible(true);
																	btnNext.addActionListener(new ActionListener() { 
																		public void actionPerformed(ActionEvent e) {
																			lblTop.setText("Elmer plays Urianger in the bottom right."); // Urianger in 3
																			lblBR.setIcon(new ImageIcon(imgUri));
																			lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																			lblBL.setIcon(new ImageIcon(imgMog));
																			btnNext.setVisible(false);
																			btnReset.setVisible(true);
																			btnReset.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					playAgain();
																					dispose();		
																				}
																			});
																		}
																	});
																}
															}
														});
													}
												}
											});
										}
										
										else if (ie.getItem().equals("Top Middle")) { // Titan in 8
											lblTM.setIcon(new ImageIcon(imgTit));
											lblPlay.setText("Play Bomb in the bottom right."); // Play Bomb in 3
											lblBR.setIcon(new ImageIcon(imgBom));
											
											comboBoxNames1.setVisible(false);
											comboBoxLocs1.setVisible(false);
											
											btnLeft2.setVisible(true);
											btnLeft2.setText("Urianger");
											btnRight2.setVisible(true);
											btnRight2.setText("Bahamut");
											lblTop.setText("Did Elmer play Urianger or Bahamut in the mid right?");
											
											btnLeft2.addActionListener(new ActionListener() { 
												public void actionPerformed(ActionEvent e) { 
													if (e.getActionCommand().equals("Urianger")) { // Urianger in 6
 														btnLeft2.setVisible(false);
														btnRight2.setVisible(false);
														lblTop.setText("");
														lblMR.setIcon(new ImageIcon(imgUri));
														lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
														lblTR.setIcon(new ImageIcon(imgMor));
														btnNext.setVisible(true);
														btnNext.addActionListener(new ActionListener() { 
															public void actionPerformed(ActionEvent e) {
																lblTop.setText("Elmer plays Bahamut in the top left."); // Bahamut in 7
																lblTL.setIcon(new ImageIcon(imgBah));
																lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																lblBL.setIcon(new ImageIcon(imgMog));
																btnNext.setVisible(false);
																btnReset.setVisible(true);
																btnReset.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		playAgain();
																		dispose();		
																	}
																});
															}
														});
													}
												}
											});
											
											btnRight2.addActionListener(new ActionListener() { 
												public void actionPerformed(ActionEvent e) { 
													if (e.getActionCommand().equals("Bahamut")) { // Bahamut in 6
														btnLeft2.setVisible(false);
														btnRight2.setVisible(false);
														lblTop.setText("");
														lblMR.setIcon(new ImageIcon(imgBah));
														lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
														lblTR.setIcon(new ImageIcon(imgMor));
														btnNext.setVisible(true);
														btnNext.addActionListener(new ActionListener() { 
															public void actionPerformed(ActionEvent e) {
																lblTop.setText("Elmer plays Urianger in the top left."); // Urianger in 7
																lblTL.setIcon(new ImageIcon(imgUri));
																lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																lblBL.setIcon(new ImageIcon(imgMog));
																btnNext.setVisible(false);
																btnReset.setVisible(true);
																btnReset.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		playAgain();
																		dispose();		
																	}
																});
															}
														});
													}
												}
											});
										}
									}
								});
							}
							
							else if (ie.getItem().equals("Gilgamesh")) { // Gilgamesh in 3
								lblBR.setIcon(new ImageIcon(imgGil));
								lblPlay.setText("Play Bomb in the top left."); // Play Bomb in 7
								lblTL.setIcon(new ImageIcon(imgBom));
								lblTop.setText("What did Elmer play next?");
								
								comboBoxNames1.setVisible(false);
								comboBoxNames1.removeAllItems();
								comboBoxLocs1.setVisible(false);
								comboBoxLocs1.removeAllItems();
								
								comboBoxNames4.setVisible(true);
								comboBoxLocs4.setVisible(true);
								
								comboBoxNames4.addItemListener(new ItemListener() { 
									public void itemStateChanged(ItemEvent ie) {
										if (ie.getItem().equals("Urianger")) { // Urianger in 6
											comboBoxNames4.setVisible(false);
											comboBoxLocs4.setVisible(false);
											lblTop.setText("");
											lblMR.setIcon(new ImageIcon(imgUri));
											lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
											lblTR.setIcon(new ImageIcon(imgMor));
											btnNext.setVisible(true);
											btnNext.addActionListener(new ActionListener() { 
												public void actionPerformed(ActionEvent e) {
													lblTop.setText("Elmer plays Bahamut in the top middle."); // Bahamut in 8
													lblTM.setIcon(new ImageIcon(imgBah));
													lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
													lblBL.setIcon(new ImageIcon(imgMog));
													btnNext.setVisible(false);
													btnReset.setVisible(true);
													btnReset.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															playAgain();
															dispose();		
														}
													});
												}
											});
										}
										
										else if (ie.getItem().equals("Bahamut")) {
											comboBoxLocs4.addItemListener(new ItemListener() { 
												public void itemStateChanged(ItemEvent ie) {
													if (ie.getItem().equals("Mid Right")) { // Bahamut in 6
														comboBoxNames4.setVisible(false);
														comboBoxLocs4.setVisible(false);
														lblTop.setText("");
														lblMR.setIcon(new ImageIcon(imgBah));
														lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
														lblTR.setIcon(new ImageIcon(imgMor));
														btnNext.setVisible(true);
														btnNext.addActionListener(new ActionListener() { 
															public void actionPerformed(ActionEvent e) {
																lblTop.setText("Elmer plays Urianger in the top middle."); // Urianger in 8
																lblTM.setIcon(new ImageIcon(imgUri));
																lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																lblBL.setIcon(new ImageIcon(imgMog));
																btnNext.setVisible(false);
																btnReset.setVisible(true);
																btnReset.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		playAgain();
																		dispose();		
																	}
																});
															}
														});
													}
													
													else if (ie.getItem().equals("Top Middle")) { // Bahamut in 8
														comboBoxNames4.setVisible(false);
														comboBoxLocs4.setVisible(false);
														lblTop.setText("");
														lblTM.setIcon(new ImageIcon(imgBah));
														lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
														lblTR.setIcon(new ImageIcon(imgMor));
														btnNext.setVisible(true);
														btnNext.addActionListener(new ActionListener() { 
															public void actionPerformed(ActionEvent e) {
																lblTop.setText("Elmer plays Urianger in the mid right."); // Urianger in 6
																lblMR.setIcon(new ImageIcon(imgUri));
																lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																lblBL.setIcon(new ImageIcon(imgMog));
																btnNext.setVisible(false);
																btnReset.setVisible(true);
																btnReset.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		playAgain();
																		dispose();		
																	}
																});
															}
														});
													}
												}
											});
										}
									}
								});
							}
							
							else if (ie.getItem().equals("Urianger")) { // Urianger in 3
								comboBoxNames1.removeAllItems();
								lblBR.setIcon(new ImageIcon(imgUri));
								lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
								lblTR.setIcon(new ImageIcon(imgMor));
								
								comboBoxNames1.setVisible(false);
								comboBoxLocs1.setVisible(false);
								
								lblTop.setText("");
								btnNext.setVisible(true);

								btnNext.addActionListener(new ActionListener() { 
									public void actionPerformed(ActionEvent e) {
										lblTop.setText("Elmer plays Hildibrand in the top middle."); // Hildibrand in 8
										lblTM.setIcon(new ImageIcon(imgHil));
										lblPlay.setText("Play Bomb in the mid right."); // Play Bomb in 6
										lblMR.setIcon(new ImageIcon(imgBom));
										btnNext.setText("Again");
										
										if (e.getActionCommand().equals("Again")) {
											lblTop.setText("What did Elmer play next?");
											btnNext.setVisible(false);
											comboBoxNames3.setVisible(true);
											
											comboBoxNames3.addItemListener(new ItemListener() { 
												public void itemStateChanged(ItemEvent ie) {
													if (ie.getItem().equals("Bahamut")) { // Bahamut in 7
														lblTL.setIcon(new ImageIcon(imgBah));
														lblPlay.setText("Play Moogle in the bottom left."); // Finish Moogle in 1
														lblBL.setIcon(new ImageIcon(imgMog));
													}
													
													else if (ie.getItem().equals("Gilgamesh")) { // Gilgamesh in 7
														lblTL.setIcon(new ImageIcon(imgGil));
														lblPlay.setText("Play Moogle in the bottom left."); // Finish Moogle in 1
														lblBL.setIcon(new ImageIcon(imgMog));
													}
													
													else if (ie.getItem().equals("???")) { // "Urianger in 1" but this is incorrect
														lblBL.setIcon(new ImageIcon(imgUri)); // placeholder
														lblPlay.setText("Play Moogle in the top left."); // Finish Moogle in 1
														lblTL.setIcon(new ImageIcon(imgMog));
													}
													
													comboBoxNames3.removeAll();
													comboBoxNames3.setVisible(false);
													lblTop.setVisible(false);
													btnNext.setVisible(false);
													btnReset.setVisible(true);
													btnReset.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															playAgain();
															dispose();		
														}
													});
												}
											});
										}
									}
								});
							}
						}
					});
					
				}
				
				else {
					btnRight.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							lblML.setIcon(new ImageIcon(imgGod)); // Godbert in 4
							lblPlay.setText("Play Morbol in the bottom middle.");
							lblBM.setIcon(new ImageIcon(imgMor));
							lblTop.setText("Did Elmer play Y'shtola in the bottom right or top left?");
							
							btnLeft.setVisible(false);
							btnRight.setVisible(false);
							
							btnLeft2.setVisible(true);
							btnRight2.setVisible(true);
							
							btnLeft2.setText("Bottom Right");
							btnRight2.setText("Top Left");
							
							btnLeft2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if (e.getActionCommand().equals("Bottom Right")) {
										lblBR.setIcon(new ImageIcon(imgYsh));
										lblPlay.setText("Play Bomb in the mid right.");
										lblMR.setIcon(new ImageIcon(imgBom));
										lblTop.setText("Did Elmer play Hildibrand or Urianger?");
										
										btnLeft2.setVisible(false);
										
										btnLeft3.setText("Hildibrand");
										btnLeft3.setVisible(true);
										btnRight2.setText("Urianger");
										
										btnLeft3.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if (e.getActionCommand().equals("Hildibrand")) { // Hildibrand in 8
													lblTop.setText("");
													lblTM.setIcon(new ImageIcon(imgHil));
													lblPlay.setText("Play Sylph in the bottom left."); // Play Sylph in 1
													lblBL.setIcon(new ImageIcon(imgSyl));
													btnLeft3.setVisible(false);
													btnRight2.setVisible(false);
													
													btnNext.setVisible(true);
													btnNext.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
															lblTR.setIcon(new ImageIcon(imgUri));
															lblPlay.setText("Finish Moogle in the top left.");
															lblTL.setIcon(new ImageIcon(imgMog));
															btnNext.setVisible(false);
															btnReset.setVisible(true);
															btnReset.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	playAgain();
																	dispose();		
																}
															});
														}
													});
												}
											}
										});
										
										btnRight2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if (e.getActionCommand().equals("Urianger")) { // Urianger in 9
													lblTop.setText("");
													lblTR.setIcon(new ImageIcon(imgUri));
													lblPlay.setText("Play Moogle in the bottom left."); // Finish Moogle in 1
													lblBL.setIcon(new ImageIcon(imgMog));
													btnLeft3.setVisible(false);
													btnRight2.setVisible(false);
													
													btnNext.setVisible(true);
													btnNext.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															lblTop.setText("Elmer played Titan in the top left."); // Titan in 7
															lblTL.setIcon(new ImageIcon(imgTit));
															lblPlay.setText("Finish Sylph in the top middle."); // Finish Sylph in 8
															lblTM.setIcon(new ImageIcon(imgSyl));
															btnNext.setVisible(false);
															btnReset.setVisible(true);
															btnReset.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	playAgain();
																	dispose();		
																}
															});
														}
													});
												}						
											}
										});
									}
								}
							});
							
							btnRight2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if (e.getActionCommand().equals("Top Left")) { // Y'shtola in 7
										lblTop.setText("");
										lblTL.setIcon(new ImageIcon(imgYsh));
										lblPlay.setText("Play Sylph in the mid right."); // Play Sylph in 6
										lblMR.setIcon(new ImageIcon(imgSyl));
										
										btnLeft2.setVisible(false);
										btnRight2.setVisible(false);
										
										btnNext.setVisible(true);
										btnNext.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
												lblTR.setIcon(new ImageIcon(imgUri));
												lblPlay.setText("Play Bomb in the top middle."); // "Play Bomb in 2" 2 is incorrect. 8?
												lblTM.setIcon(new ImageIcon(imgBom));
												btnNext.setText("Again");
												
												if (e.getActionCommand().equals("Again")) {
													lblTop.setText("Elmer played Titan in the bottom right."); // Titan in 3
													lblBR.setIcon(new ImageIcon(imgTit));
													lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
													lblBL.setIcon(new ImageIcon(imgMog));
													btnNext.setVisible(false);
													btnReset.setVisible(true);
													btnReset.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															playAgain();
															dispose();		
														}
													});
												}
											}
										});
										
									}				
								}
							});
						}
					});
				}
			}
		});
		
		// Elmer starts first.
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLeft.setVisible(false);
				btnRight.setVisible(false);
				lblTop.setText("What did Elmer play?");
				comboBoxNames5.setVisible(true);
				comboBoxLocs5.setVisible(true);
				
				comboBoxNames5.addItemListener(new ItemListener() { 
					public void itemStateChanged(ItemEvent ie) {
						if (ie.getItem().equals("Y'shtola"))	{
							comboBoxLocs5.addItemListener(new ItemListener() { 
								public void itemStateChanged(ItemEvent ie) {
									if (ie.getItem().equals("Bottom Left")) {
										lblBL.setIcon(new ImageIcon(imgYsh)); // Y'shtola in 1
										lblTop.setText("");
										lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
										lblMM.setIcon(new ImageIcon(imgMin));
										
										comboBoxNames5.setVisible(false);
										comboBoxLocs5.setVisible(false);
										
										btnNext.setVisible(true);
										btnNext.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblTop.setText("Elmer played Godbert in the bottom middle."); // Godbert in 2
												lblBM.setIcon(new ImageIcon(imgGod));
												lblPlay.setText("Play Moogle in the mid right."); // Play Moogle in 6
												lblMR.setIcon(new ImageIcon(imgMog));
												btnNext.setText("Again");
												if (e.getActionCommand().equals("Again")) {
													btnNext.setVisible(false);
													lblTop.setText("What did Elmer play next?");
													lblPlay.setText("");
													comboBoxNames6.setVisible(true);
													comboBoxLocs6.setVisible(true);
													
													comboBoxNames6.addItemListener(new ItemListener() { 
														public void itemStateChanged(ItemEvent ie) {
															if (ie.getItem().equals("Titan"))	{
																comboBoxLocs6.addItemListener(new ItemListener() { 
																	public void itemStateChanged(ItemEvent ie) {
																		if (ie.getItem().equals("Top Middle"))	{ // Titan in 8
																			comboBoxNames6.setVisible(false);
																			comboBoxLocs6.setVisible(false);
																			lblTop.setText("");
																			lblTM.setIcon(new ImageIcon(imgTit));
																			lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
																			lblML.setIcon(new ImageIcon(imgSyl));
																			
																			btnNext2.setVisible(true);
																			btnNext2.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					lblTop.setText("Elmer played Bahamut in the top left."); // Bahamut in 7
																					lblTL.setIcon(new ImageIcon(imgBah));
																					lblPlay.setText("Finish Morbol in the bottom right."); // Finish Morbol in 3
																					lblBR.setIcon(new ImageIcon(imgMor));
																					
																					btnNext2.setText("Again");
																					if (e.getActionCommand().equals("Again")) {	
																						lblPlay.setText("");
																						lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
																						lblTR.setIcon(new ImageIcon(imgUri));
																						btnNext2.setVisible(false);
																						btnReset.setVisible(true);
																						btnReset.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								playAgain();
																								dispose();		
																							}
																						});
																					}
																				}
																			});
																		}
																		
																		else if (ie.getItem().equals("Top Right")) { // Titan in 9
																			comboBoxNames6.setVisible(false);
																			comboBoxLocs6.setVisible(false);
																			lblTop.setText("");
																			lblTR.setIcon(new ImageIcon(imgTit));
																			lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
																			lblML.setIcon(new ImageIcon(imgSyl));
																			
																			btnNext2.setVisible(true);
																			btnNext2.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					lblTop.setText("Elmer played Bahamut in the top left."); // Bahamut in 7
																					lblTL.setIcon(new ImageIcon(imgBah));
																					lblPlay.setText("Finish Morbol in the bottom right."); // Finish Morbol in 3
																					lblBR.setIcon(new ImageIcon(imgMor));
																					
																					btnNext2.setText("Again");
																					if (e.getActionCommand().equals("Again")) {	
																						lblPlay.setText("");
																						lblTop.setText("Elmer played Urianger in the top middle."); // Urianger in 8
																						lblTM.setIcon(new ImageIcon(imgUri));
																						btnNext2.setVisible(false);
																						btnReset.setVisible(true);
																						btnReset.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								playAgain();
																								dispose();		
																							}
																						});
																					}
																				}
																			});
																		}
																	}
																});
															}
															
															else if (ie.getItem().equals("Gilgamesh")) { // Gilgamesh in 4
																comboBoxNames6.setVisible(false);
																comboBoxNames4.setVisible(true);
																lblTop.setText("What did Elmer play next?");
																lblML.setIcon(new ImageIcon(imgGil));
																lblPlay.setText("Play Bomb in the top left."); // Play Bomb in 7
																lblTL.setIcon(new ImageIcon(imgBom));
																
																comboBoxNames4.addItemListener(new ItemListener() { 
																	public void itemStateChanged(ItemEvent ie) {
																		if (ie.getItem().equals("Urianger")) {
																			comboBoxNames4.setVisible(false);
																			comboBoxLocs6.setVisible(false);
																			lblTR.setIcon(new ImageIcon(imgUri)); // Urianger in 9
																			lblTop.setText("");
																			lblPlay.setText("Finish Morbol in the bottom right."); // Finish Morbol in 3
																			lblBR.setIcon(new ImageIcon(imgMor));
																			
																			btnNext2.setVisible(true);
																			btnNext2.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					lblPlay.setText("");
																					lblTop.setText("Elmer played Bahamut in the top middle."); // Bahamut in 8
																					lblTM.setIcon(new ImageIcon(imgBah));
																					btnNext2.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			});
																		}
																		
																		else if (ie.getItem().equals("Bahamut")) {
																			comboBoxLocs6.addItemListener(new ItemListener() { 
																				public void itemStateChanged(ItemEvent ie) {
																					if (ie.getItem().equals("Top Middle")) { // Bahamut in 8
																						comboBoxNames4.setVisible(false);
																						comboBoxLocs6.setVisible(false);
																						lblTop.setText("");
																						lblTM.setIcon(new ImageIcon(imgBah));
																						lblPlay.setText("Finish Morbol in the bottom right."); // Finish Morbol in 3
																						lblBR.setIcon(new ImageIcon(imgMor));
																						
																						btnNext2.setVisible(true);
																						btnNext2.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								lblPlay.setText("");
																								lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
																								lblTR.setIcon(new ImageIcon(imgUri));
																								btnNext2.setVisible(false);
																								btnReset.setVisible(true);
																								btnReset.addActionListener(new ActionListener() {
																									public void actionPerformed(ActionEvent e) {
																										playAgain();
																										dispose();		
																									}
																								});
																							}
																						});
																					}
																					
																					else if (ie.getItem().equals("Top Right")) { // Bahamut in 9
																						comboBoxNames4.setVisible(false);
																						comboBoxLocs6.setVisible(false);
																						lblTop.setText("");
																						lblTR.setIcon(new ImageIcon(imgBah));
																						lblPlay.setText("Finish Morbol in the bottom right."); // Finish Morbol in 3
																						lblBR.setIcon(new ImageIcon(imgMor));
																						
																						btnNext2.setVisible(true);
																						btnNext2.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								lblPlay.setText("");
																								lblTop.setText("Elmer played Urianger in the top middle."); // Urianger in 8
																								lblTM.setIcon(new ImageIcon(imgUri));
																								btnNext2.setVisible(false);
																								btnReset.setVisible(true);
																								btnReset.addActionListener(new ActionListener() {
																									public void actionPerformed(ActionEvent e) {
																										playAgain();
																										dispose();		
																									}
																								});
																							}
																						});
																					}
																				}
																			});
																		}
																	}
																});
															}
														}
													});
												}
											}
										});
										
										
									}
									
									else if (ie.getItem().equals("Bottom Middle")) {
										lblBM.setIcon(new ImageIcon(imgYsh)); // Y'shtola in 2
										lblTop.setText("");
										lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
										lblMM.setIcon(new ImageIcon(imgMin));
										
										comboBoxNames5.setVisible(false);
										comboBoxLocs5.setVisible(false);
										
										btnNext.setVisible(true);
										btnNext.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblTop.setText("Elmer played Godbert in the mid left."); // Godbert in 4
												lblML.setIcon(new ImageIcon(imgGod));
												lblPlay.setText("Play Sylph in the top left."); // Play Sylph in 7
												lblTL.setIcon(new ImageIcon(imgSyl));
												btnNext.setText("Again");
												if (e.getActionCommand().equals("Again")) {
													btnNext.setVisible(false);
													lblTop.setText("Did Elmer play Gilgamesh or Titan?");
													lblPlay.setText("");
													
													btnLeft2.setText("Gilgamesh");
													btnLeft2.setVisible(true);
													btnRight2.setText("Titan");
													btnRight2.setVisible(true);
													
													btnLeft2.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															if (e.getActionCommand().equals("Gilgamesh")) { // Gilgamesh in 3
																lblBR.setIcon(new ImageIcon(imgGil));
																lblPlay.setText("Play Morbol in the top middle."); // Play Morbol in 8
																lblTM.setIcon(new ImageIcon(imgMor));
																lblTop.setText("Did Elmer play Bahamut in the mid right or top right?");
																
																btnLeft2.setVisible(false);
																btnLeft3.setVisible(true);
																
																btnLeft3.setText("Mid Right");
																btnRight2.setText("Top Right");
																
																btnLeft3.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		if (e.getActionCommand().equals("Mid Right")) { // Bahamut in 6
																			btnLeft3.setVisible(false);
																			btnRight2.setVisible(false);
																			lblMR.setIcon(new ImageIcon(imgBah));
																			lblTop.setText("");
																			lblPlay.setText("Finish Bomb in the bottom left."); // Finish Bomb in 1
																			lblBL.setIcon(new ImageIcon(imgBom));
																			btnNext2.setVisible(true);
																			btnNext2.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					lblPlay.setText("");
																					lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
																					lblTR.setIcon(new ImageIcon(imgUri));
																					btnNext2.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			});
																		}					
																	}
																});
																
																btnRight2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		if (e.getActionCommand().equals("Top Right")) {	// Bahamut in 9
																			lblTR.setIcon(new ImageIcon(imgBah));
																			btnLeft3.setVisible(false);
																			btnRight2.setVisible(false);
																			lblTop.setText("");
																			lblPlay.setText("Finish Bomb in the bottom left."); // Finish Bomb in 1
																			lblBL.setIcon(new ImageIcon(imgBom));
																			btnNext2.setVisible(true);
																			btnNext2.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					lblPlay.setText("");
																					lblTop.setText("Elmer played Urianger in the mid right."); // Urianger in 6
																					lblMR.setIcon(new ImageIcon(imgUri));
																					btnNext2.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			});
																		}					
																	}
																});
															}					
														}
													});
													
													btnRight2.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															if (e.getActionCommand().equals("Titan")) {	// Titan in 8
																btnLeft2.setVisible(false);
																btnRight2.setVisible(false);
																lblTop.setText("");
																lblTM.setIcon(new ImageIcon(imgTit));
																lblPlay.setText("Play Morbol in the bottom right."); // Play Morbol in 3
																lblBR.setIcon(new ImageIcon(imgMor));
																btnNext2.setVisible(true);
																btnNext2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		lblTop.setText("Elmer played Bahamut in the mid right."); // Bahamut in 6
																		lblMR.setIcon(new ImageIcon(imgBah));
																		lblPlay.setText("Finish Bomb in the bottom left."); // Finish Bomb in 1
																		lblBL.setIcon(new ImageIcon(imgBom));
																		btnNext2.setText("Again");
																		if (e.getActionCommand().equals("Again")) {
																			lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
																			lblTR.setIcon(new ImageIcon(imgUri));
																			lblPlay.setText("");
																			btnNext2.setVisible(false);
																			btnReset.setVisible(true);
																			btnReset.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					playAgain();
																					dispose();		
																				}
																			});
																		}				
																	}
																});
															}					
														}
													});
												}
											}
										});
									}
								}
							});
						}
						
						else if (ie.getItem().equals("Urianger"))	{
							comboBoxLocs5.addItemListener(new ItemListener() { 
								public void itemStateChanged(ItemEvent ie) {
									if (ie.getItem().equals("Bottom Right")) {
										lblBR.setIcon(new ImageIcon(imgUri)); // Urianger in 3
										lblTop.setText("Did Elmer play Godbert in the bottom middle or mid left?");
										lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
										lblMM.setIcon(new ImageIcon(imgMin));
										
										comboBoxNames5.setVisible(false);
										comboBoxLocs5.setVisible(false);
										
										btnLeft2.setVisible(true);
										btnLeft2.setText("Bottom Middle");
										btnRight2.setVisible(true);
										btnRight2.setText("Mid Left");
										
										btnLeft2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblBM.setIcon(new ImageIcon(imgGod)); // Godbert in 2
												lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
												lblML.setIcon(new ImageIcon(imgSyl));
												
												lblTop.setText("What did Elmer play next?");
												btnLeft2.setVisible(false);
												btnRight2.setVisible(false);
												comboBoxNames7.setVisible(true);
												comboBoxLocs7.setVisible(true);
												
												comboBoxNames7.addItemListener(new ItemListener() { 
													public void itemStateChanged(ItemEvent ie) {
														if (ie.getItem().equals("Y'shtola")) {
															lblTop.setText("");
															lblTL.setIcon(new ImageIcon(imgYsh)); // Y'shtola in 7
															lblPlay.setText("Play Morbol in the mid right."); // Play Morbol in 6
															lblMR.setIcon(new ImageIcon(imgMor));
															comboBoxNames7.setVisible(false);
															comboBoxLocs7.setVisible(false);
															
															btnNext.setVisible(true);
															btnNext.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	lblTop.setText("Elmer played Hildibrand in the top right."); // Hildibrand in 9
																	lblTR.setIcon(new ImageIcon(imgHil));
																	lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																	lblBL.setIcon(new ImageIcon(imgMog));
																	btnNext.setText("Again");
																	if (e.getActionCommand().equals("Again")) {
																		lblTop.setText("Elmer played Bahamut in the top middle."); // Bahamut in 8
																		lblTM.setIcon(new ImageIcon(imgBah));
																		lblPlay.setText("");
																		btnNext.setVisible(false);
																		btnReset.setVisible(true);
																		btnReset.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				playAgain();
																				dispose();		
																			}
																		});
																	}
																}
															});
														}
														
														else if (ie.getItem().equals("Titan")) {
															comboBoxLocs7.addItemListener(new ItemListener() { 
																public void itemStateChanged(ItemEvent ie) {
																	if (ie.getItem().equals("Top Left")) { // Titan in 7
																		lblTop.setText("");
																		lblTL.setIcon(new ImageIcon(imgTit));
																		lblPlay.setText("Play Bomb in the top middle."); // Play Bomb in 8
																		lblTM.setIcon(new ImageIcon(imgBom));
																		comboBoxNames7.setVisible(false);
																		comboBoxLocs7.setVisible(false);
																		
																		btnNext.setVisible(true);
																		btnNext.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				lblTop.setText("Elmer played Hildibrand in the top right."); // Hildibrand in 9
																				lblTR.setIcon(new ImageIcon(imgHil));
																				lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																				lblBL.setIcon(new ImageIcon(imgMog));
																				btnNext.setText("Again");
																				if (e.getActionCommand().equals("Again")) {
																					lblTop.setText("Elmer played Bahamut in the mid right."); // Bahamut in 6
																					lblMR.setIcon(new ImageIcon(imgBah));
																					lblPlay.setText("");
																					btnNext.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			}
																		});
																	}
																	
																	else if (ie.getItem().equals("Top Middle"))	{ // Titan in 8
																		lblTop.setText("");
																		lblTM.setIcon(new ImageIcon(imgTit));
																		lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
																		lblTR.setIcon(new ImageIcon(imgMor));
																		comboBoxNames7.setVisible(false);
																		comboBoxLocs7.setVisible(false);
																		
																		btnNext.setVisible(true);
																		btnNext.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				lblTop.setText("Elmer played Bahamut in the top left."); // Bahamut in 7
																				lblTL.setIcon(new ImageIcon(imgBah));
																				lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																				lblBL.setIcon(new ImageIcon(imgMog));
																				btnNext.setText("Again");
																				if (e.getActionCommand().equals("Again")) {
																					lblTop.setText("Elmer played Hildibrand in the mid right."); // Hildibrand in 6
																					lblMR.setIcon(new ImageIcon(imgHil));
																					lblPlay.setText("");
																					btnNext.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			}
																		});
																	}	
																}
															});
														}
														
														else if (ie.getItem().equals("Gilgamesh")) {
															comboBoxLocs7.addItemListener(new ItemListener() { 
																public void itemStateChanged(ItemEvent ie) {
																	if (ie.getItem().equals("Mid Right")) {	// Gilgamesh in 6
																		lblTop.setText("");
																		lblMR.setIcon(new ImageIcon(imgGil));
																		lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
																		lblTR.setIcon(new ImageIcon(imgMor));
																		comboBoxNames7.setVisible(false);
																		comboBoxLocs7.setVisible(false);
																		
																		btnNext.setVisible(true);
																		btnNext.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				lblTop.setText("Elmer played Hildibrand in the top left."); // Hildibrand in 7
																				lblTL.setIcon(new ImageIcon(imgHil));
																				lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																				lblBL.setIcon(new ImageIcon(imgMog));
																				btnNext.setText("Again");
																				if (e.getActionCommand().equals("Again")) {
																					lblTop.setText("Elmer played Bahamut in the top middle."); // Bahamut in 8
																					lblTM.setIcon(new ImageIcon(imgBah));
																					lblPlay.setText("");
																					btnNext.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			}
																		});
																	}
																	
																	else if (ie.getItem().equals("Top Left")) {	// Gilgamesh in 7
																		lblTop.setText("");
																		lblTL.setIcon(new ImageIcon(imgGil));
																		lblPlay.setText("Play Morbol in the mid right."); // Play Morbol in 6
																		lblMR.setIcon(new ImageIcon(imgMor));
																		comboBoxNames7.setVisible(false);
																		comboBoxLocs7.setVisible(false);
																		
																		btnNext.setVisible(true);
																		btnNext.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				lblTop.setText("Elmer played Hildibrand in the top right."); // Hildibrand in 9
																				lblTR.setIcon(new ImageIcon(imgHil));
																				lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
																				lblBL.setIcon(new ImageIcon(imgMog));
																				btnNext.setText("Again");
																				if (e.getActionCommand().equals("Again")) {
																					lblTop.setText("Elmer played Bahamut in the top middle."); // Bahamut in 8
																					lblTM.setIcon(new ImageIcon(imgBah));
																					lblPlay.setText("");
																					btnNext.setVisible(false);
																					btnReset.setVisible(true);
																					btnReset.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							playAgain();
																							dispose();		
																						}
																					});
																				}
																			}
																		});
																	}
																}
															});
														}
													}
												});
											}
										});
										 
										btnRight2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												btnLeft2.setVisible(false);
												btnRight2.setVisible(false);
												lblTop.setText("");
												lblML.setIcon(new ImageIcon(imgGod)); // Godbert in 4
												lblPlay.setText("Play Morbol in the mid right."); // Play Morbol in 6
												lblMR.setIcon(new ImageIcon(imgMor));
												btnNext.setVisible(true);
												btnNext.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														btnNext.setVisible(false);
														lblTop.setText("Did Elmer play Hildibrand or Bahamut?");
														lblBL.setIcon(new ImageIcon(imgYsh)); // Y'shtola in 1
														lblPlay.setText("Play Moogle in the top middle."); // Play Moogle in 8
														lblTM.setIcon(new ImageIcon(imgMog));
														
														btnLeft3.setVisible(true);
														btnLeft3.setText("Hildibrand");
														btnRight3.setVisible(true);
														btnRight3.setText("Bahamut");
														
														btnLeft3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {															
																btnLeft3.setVisible(false);
																btnRight3.setVisible(false);
																lblTR.setIcon(new ImageIcon(imgHil)); // Hildibrand in 9
																lblTop.setText("");
																lblPlay.setText("Finish Bomb in the bottom middle."); // Finish Bomb in 2
																lblBM.setIcon(new ImageIcon(imgBom));
																
																btnNext2.setVisible(true);
																btnNext2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		lblTop.setText("Elmer played Bahamut in the top left."); // Bahamut in 7
																		lblPlay.setText("");
																		lblTL.setIcon(new ImageIcon(imgBah));
																		btnNext2.setVisible(false);
																		btnReset.setVisible(true);
																		btnReset.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				playAgain();
																				dispose();		
																			}
																		});
																	}
																});
															}
														});
														
														btnRight3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																btnLeft3.setVisible(false);
																btnRight3.setVisible(false);
																lblTR.setIcon(new ImageIcon(imgBah)); // Bahamut in 9
																lblTop.setText("");
																lblPlay.setText("Finish Bomb in the bottom middle."); // Finish Bomb in 2
																lblBM.setIcon(new ImageIcon(imgBom));
																
																btnNext2.setVisible(true);
																btnNext2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		lblTop.setText("Elmer played Hildibrand in the top left."); // Hildibrand in 7
																		lblPlay.setText("");
																		lblTL.setIcon(new ImageIcon(imgHil));
																		btnNext2.setVisible(false);
																		btnReset.setVisible(true);
																		btnReset.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				playAgain();
																				dispose();		
																			}
																		});
																	}
																});
															}
														});
													}
												});
											}
										});
									}
									
									else if (ie.getItem().equals("Mid Right")) {
										lblTop.setText("");
										lblMR.setIcon(new ImageIcon(imgUri)); // Urianger in 6
										lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
										lblMM.setIcon(new ImageIcon(imgMin));
										
										comboBoxNames5.setVisible(false);
										comboBoxLocs5.setVisible(false);
										
										btnNext.setVisible(true);
										btnNext.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblTop.setText("Elmer played Godbert in the bottom middle."); // Godbert in 2
												lblBM.setIcon(new ImageIcon(imgGod));
												lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
												lblML.setIcon(new ImageIcon(imgSyl));
												
												btnNext.setText("Again");
												if (e.getActionCommand().equals("Again")) {
													lblTop.setText("Elmer played Gilgamesh in the bottom right."); // Gilgamesh in 3
													lblBR.setIcon(new ImageIcon(imgGil));
													lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
													lblTR.setIcon(new ImageIcon(imgMor));
													btnNext.setVisible(false);
													btnNext2.setVisible(true);
													btnNext2.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															lblTop.setText("Elmer played Hildibrand in the top left."); // Hildibrand in 7
															lblTL.setIcon(new ImageIcon(imgHil));
															lblPlay.setText("Finish Moogle in the bottom left."); // Play Moogle in 1
															lblBL.setIcon(new ImageIcon(imgMog));
															btnNext2.setText("Again");
															if (e.getActionCommand().equals("Again")) {
																lblTop.setText("Elmer played Bahamut in the top middle."); // Bahamut in 8
																lblTM.setIcon(new ImageIcon(imgBah));
																lblPlay.setText("");
																btnNext2.setVisible(false);
																btnReset.setVisible(true);
																btnReset.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		playAgain();
																		dispose();		
																	}
																});
															}
														}
													});
												}
											}
										});
									}
								}
							});
						}
						
						else if (ie.getItem().equals("Titan"))	{
							comboBoxLocs5.addItemListener(new ItemListener() { 
								public void itemStateChanged(ItemEvent ie) {
									if (ie.getItem().equals("Top Left")) {
										lblTL.setIcon(new ImageIcon(imgTit)); // Titan in 7
										comboBoxNames5.setVisible(false);
										comboBoxLocs5.setVisible(false);
										lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
										lblMM.setIcon(new ImageIcon(imgMin));
										
										lblTop.setText("Did Elmer play Godbert in the bottom middle or mid left?");
										btnLeft2.setVisible(true);
										btnLeft2.setText("Bottom Middle");
										btnRight2.setVisible(true);
										btnRight2.setText("Mid Left");
										
										btnLeft2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												btnLeft2.setVisible(false);
												lblBM.setIcon(new ImageIcon(imgGod)); // Godbert in 2
												lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
												lblML.setIcon(new ImageIcon(imgSyl));
												
												lblTop.setText("Did Elmer play Gilgamesh in the bottom right or mid right?");
												btnLeft3.setVisible(true);
												btnLeft3.setText("Bottom Right");
												btnRight2.setText("Mid Right");
												
												btnLeft3.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														btnLeft3.setVisible(false);
														btnRight2.setVisible(false);														
														lblBR.setIcon(new ImageIcon(imgGil)); // Gilgamesh in 3
														lblPlay.setText("Play Bomb in the top middle."); // Play Bomb in 8
														lblTM.setIcon(new ImageIcon(imgBom));
														lblTop.setText("");
														
														btnNext.setVisible(true);
														btnNext.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																lblTop.setText("Elmer played Bahamut in the top right."); // Bahamut in 9
																lblTR.setIcon(new ImageIcon(imgBah));
																lblPlay.setText("Finish Moogle in the bottom left."); // Moogle in 1
																lblBL.setIcon(new ImageIcon(imgMog));
																btnNext.setText("Again");
																if (e.getActionCommand().equals("Again")) {
																	lblTop.setText("Elmer played Urianger in the mid right."); // Urianger in 6
																	lblMR.setIcon(new ImageIcon(imgUri));
																	lblPlay.setText("");
																	btnNext.setVisible(false);
																	btnReset.setVisible(true);
																	btnReset.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			playAgain();
																			dispose();		
																		}
																	});
																}
															}
														});
													}
												});
												
												btnRight2.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														btnLeft3.setVisible(false);
														btnRight2.setVisible(false);
														lblMR.setIcon(new ImageIcon(imgGil)); // Gilgamesh in 6
														lblPlay.setText("Play Bomb in the top middle."); // Play Bomb in 8
														lblTM.setIcon(new ImageIcon(imgBom));
														lblTop.setText("");
														
														btnNext.setVisible(true);
														btnNext.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
																lblTR.setIcon(new ImageIcon(imgUri));
																lblPlay.setText("Finish Moogle in the bottom left."); // Moogle in 1
																lblBL.setIcon(new ImageIcon(imgMog));
																btnNext.setText("Again");
																if (e.getActionCommand().equals("Again")) {
																	lblTop.setText("Elmer played Bahamut in the bottom right."); // Bahamut in 3
																	lblBR.setIcon(new ImageIcon(imgBah));
																	lblPlay.setText("");
																	btnNext.setVisible(false);
																	btnReset.setVisible(true);
																	btnReset.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			playAgain();
																			dispose();		
																		}
																	});
																}
															}
														});
													}
												});
											}
										});
										
										btnRight2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblTop.setText("");
												btnLeft2.setVisible(false);
												btnRight2.setVisible(false);
												lblML.setIcon(new ImageIcon(imgGod)); // Godbert in 4
												lblPlay.setText("Play Sylph in the top middle."); // Play Sylph in 8
												lblTM.setIcon(new ImageIcon(imgSyl));
												btnNext.setVisible(true);
												btnNext.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														lblTop.setText("Elmer played Gilgamesh in the mid right."); // Gilgamesh in 6
														lblMR.setIcon(new ImageIcon(imgGil));
														lblPlay.setText("Play Morbol in the bottom middle."); // Play Morbol in 2
														lblBM.setIcon(new ImageIcon(imgMor));
														btnNext.setText("Again");
														if (e.getActionCommand().equals("Again")) {	
															lblTop.setText("Elmer played Urianger in the top right."); // Urianger in 9
															lblTR.setIcon(new ImageIcon(imgUri));
															lblPlay.setText("Finish Moogle in the bottom right."); // Finish Moogle in 3
															lblBR.setIcon(new ImageIcon(imgMog));
															btnNext.setVisible(false);
															btnNext2.setVisible(true);
															btnNext2.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																	lblPlay.setText("");
																	lblTop.setText("Elmer played Bahamut in the bottom left."); // Bahamut in 1
																	lblBL.setIcon(new ImageIcon(imgBah));
																	btnNext2.setVisible(false);
																	btnReset.setVisible(true);
																	btnReset.addActionListener(new ActionListener() {
																		public void actionPerformed(ActionEvent e) {
																			playAgain();
																			dispose();		
																		}
																	});
																}
															});
														}					
													}
												});
											}
										});
										
									}
									
									else if (ie.getItem().equals("Top Middle")) {
										lblTM.setIcon(new ImageIcon(imgTit)); // Titan in 8
										comboBoxNames5.setVisible(false);
										comboBoxLocs5.setVisible(false);
										lblPlay.setText("Play Minfilia in the middle."); // Play Minfilia in 5
										lblMM.setIcon(new ImageIcon(imgMin));
										lblTop.setText("");
										btnNext.setVisible(true);
										btnNext.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												lblTop.setText("Elmer played Godbert in the bottom middle."); // Godbert in 2
												lblBM.setIcon(new ImageIcon(imgGod));
												lblPlay.setText("Play Sylph in the mid left."); // Play Sylph in 4
												lblML.setIcon(new ImageIcon(imgSyl));
												
												btnNext.setText("Again");
												if (e.getActionCommand().equals("Again")) {	
													lblTop.setText("Elmer played Gilgamesh in the top left."); // Gilgamesh in 7
													lblTL.setIcon(new ImageIcon(imgGil));
													lblPlay.setText("Play Morbol in the top right."); // Play Morbol in 9
													lblTR.setIcon(new ImageIcon(imgMor));
													
													btnNext.setVisible(false);
													btnNext2.setVisible(true);
													btnNext2.setText("Next");
													btnNext2.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															lblTop.setText("Elmer played Bahamut in the mid right."); // Bahamut in 6
															lblMR.setIcon(new ImageIcon(imgBah));
															lblPlay.setText("Finish Moogle in the bottom left."); // Finish Moogle in 1
															lblBL.setIcon(new ImageIcon(imgMog));
															if (e.getActionCommand().equals("Again")) {	
																lblTop.setText("Elmer played Urianger in the bottom right."); // Urianger in 3
																lblBR.setIcon(new ImageIcon(imgUri));
																lblPlay.setText("");
																btnNext2.setVisible(false);
																btnReset.setVisible(true);
																btnReset.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		playAgain();
																		dispose();		
																	}
																});
															}					
														}
													});
												}	
											}
										});
									}
								}
							});
						}
					}
				});
			}
		});
	}

	public static void main(String[] args) {
		ElmerStrats theSolver = new ElmerStrats();
		theSolver.setSize(new Dimension(530, 620));
		theSolver.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
