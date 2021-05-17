package OOP_Inharitance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
public class OOP_Inharitance_s {

	private JFrame frmInheritance;
	private JTextField textField_1;
	private JTextField textApply;
	private JTextField textBanana;
	private JTextField textCherry;
	private JTextField textGrape;
	private JTextField textMango;
	private JTextField textOrange;
	private JTextField textSyrah;
	private JTextField textMerlot;
	private JTextField textRiesling;
	private JTextField textPinotNoir;
	private JTextField textCharddonnary;
	private JTextField textSauvignon;
	private JTextField textMilkShake;
	private JTextField textVanillaCone;
	private JTextField textClassicVanilla;
	private JTextField textVanMilkShake;
	private JTextField textChoMilkShake;
	private JTextField textStrawMilkShake;
	private JTextField textCostFruits;
	private JTextField textCostWine;
	private JTextField textCostIceCream;
	private JTextField textItermTax;
	private JTextField textSubtotal;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OOP_Inharitance_s window = new OOP_Inharitance_s();
					window.frmInheritance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OOP_Inharitance_s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInheritance = new JFrame();
		frmInheritance.setFont(new Font("Dialog", Font.BOLD, 14));
		frmInheritance.setTitle("Inheritance");
		frmInheritance.setBounds(0, 0, 1038, 656);
		frmInheritance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInheritance.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 12));
		panel.setBounds(10, 11, 993, 95);
		frmInheritance.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Object oriented Programing");
		lblNewLabel.setBounds(230, 17, 532, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(10, 125, 672, 476);
		frmInheritance.getContentPane().add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 12, true));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Apply");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(31, 49, 81, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Banana");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(31, 85, 81, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cherry");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(31, 121, 81, 25);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Grape");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(31, 157, 81, 25);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mango");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_4.setBounds(31, 193, 81, 25);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Orange");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_5.setBounds(31, 229, 81, 25);
		panel_1.add(lblNewLabel_1_5);
		
		textApply = new JTextField();
		textApply.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textApply.setHorizontalAlignment(SwingConstants.CENTER);
		textApply.setText("0");
		textApply.setBounds(178, 49, 91, 25);
		panel_1.add(textApply);
		textApply.setColumns(10);
		
		textBanana = new JTextField();
		textBanana.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
			
		});
		textBanana.setHorizontalAlignment(SwingConstants.CENTER);
		textBanana.setText("0");
		textBanana.setColumns(10);
		textBanana.setBounds(178, 88, 91, 25);
		panel_1.add(textBanana);
		
		textCherry = new JTextField();
		textCherry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textCherry.setHorizontalAlignment(SwingConstants.CENTER);
		textCherry.setText("0");
		textCherry.setColumns(10);
		textCherry.setBounds(178, 126, 91, 25);
		panel_1.add(textCherry);
		
		textGrape = new JTextField();
		textGrape.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textGrape.setHorizontalAlignment(SwingConstants.CENTER);
		textGrape.setText("0");
		textGrape.setColumns(10);
		textGrape.setBounds(178, 162, 91, 25);
		panel_1.add(textGrape);
		
		textMango = new JTextField();
		textMango.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textMango.setHorizontalAlignment(SwingConstants.CENTER);
		textMango.setText("0");
		textMango.setColumns(10);
		textMango.setBounds(178, 198, 91, 25);
		panel_1.add(textMango);
		
		textOrange = new JTextField();
		textOrange.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textOrange.setHorizontalAlignment(SwingConstants.CENTER);
		textOrange.setText("0");
		textOrange.setColumns(10);
		textOrange.setBounds(178, 234, 91, 25);
		panel_1.add(textOrange);
		
		JLabel lblNewLabel_1_6 = new JLabel("Fruit");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_6.setBounds(82, 13, 81, 25);
		panel_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Wine");
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_6_1.setBounds(449, 13, 81, 25);
		panel_1.add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_1_7 = new JLabel("Syrah");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_7.setBounds(328, 49, 158, 25);
		panel_1.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Merlot");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(328, 85, 158, 25);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Riesling");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(328, 121, 158, 25);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Pinot Noir");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3_1.setBounds(328, 157, 158, 25);
		panel_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Chardonnay");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_4_1.setBounds(328, 193, 158, 25);
		panel_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Sauvignon Blanc");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_5_1.setBounds(328, 229, 158, 25);
		panel_1.add(lblNewLabel_1_5_1);
		
		textSyrah = new JTextField();
		textSyrah.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textSyrah.setHorizontalAlignment(SwingConstants.CENTER);
		textSyrah.setText("0");
		textSyrah.setColumns(10);
		textSyrah.setBounds(545, 49, 91, 25);
		panel_1.add(textSyrah);
		
		textMerlot = new JTextField();
		textMerlot.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textMerlot.setHorizontalAlignment(SwingConstants.CENTER);
		textMerlot.setText("0");
		textMerlot.setColumns(10);
		textMerlot.setBounds(545, 90, 91, 25);
		panel_1.add(textMerlot);
		
		textRiesling = new JTextField();
		textRiesling.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textRiesling.setHorizontalAlignment(SwingConstants.CENTER);
		textRiesling.setText("0");
		textRiesling.setColumns(10);
		textRiesling.setBounds(545, 126, 91, 25);
		panel_1.add(textRiesling);
		
		textPinotNoir = new JTextField();
		textPinotNoir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textPinotNoir.setHorizontalAlignment(SwingConstants.CENTER);
		textPinotNoir.setText("0");
		textPinotNoir.setColumns(10);
		textPinotNoir.setBounds(545, 162, 91, 25);
		panel_1.add(textPinotNoir);
		
		textCharddonnary = new JTextField();
		textCharddonnary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textCharddonnary.setHorizontalAlignment(SwingConstants.CENTER);
		textCharddonnary.setText("0");
		textCharddonnary.setColumns(10);
		textCharddonnary.setBounds(545, 198, 91, 25);
		panel_1.add(textCharddonnary);
		
		textSauvignon = new JTextField();
		textSauvignon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textSauvignon.setHorizontalAlignment(SwingConstants.CENTER);
		textSauvignon.setText("0");
		textSauvignon.setColumns(10);
		textSauvignon.setBounds(545, 234, 91, 25);
		panel_1.add(textSauvignon);
		
		JLabel lblNewLabel_1_8 = new JLabel("Milk Shake");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_8.setBounds(31, 346, 113, 25);
		panel_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Vanilla Cone");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_2.setBounds(31, 382, 132, 25);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Classic Vanilla");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_2.setBounds(31, 418, 132, 25);
		panel_1.add(lblNewLabel_1_2_2);
		
		textMilkShake = new JTextField();
		textMilkShake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textMilkShake.setText("0");
		textMilkShake.setColumns(10);
		textMilkShake.setBounds(178, 346, 91, 25);
		panel_1.add(textMilkShake);
		
		textVanillaCone = new JTextField();
		textVanillaCone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textVanillaCone.setHorizontalAlignment(SwingConstants.CENTER);
		textVanillaCone.setText("0");
		textVanillaCone.setColumns(10);
		textVanillaCone.setBounds(178, 387, 91, 25);
		panel_1.add(textVanillaCone);
		
		textClassicVanilla = new JTextField();
		textClassicVanilla.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textClassicVanilla.setHorizontalAlignment(SwingConstants.CENTER);
		textClassicVanilla.setText("0");
		textClassicVanilla.setColumns(10);
		textClassicVanilla.setBounds(178, 423, 91, 25);
		panel_1.add(textClassicVanilla);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("Vanilla Milk Shake");
		lblNewLabel_1_7_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_7_1.setBounds(328, 346, 158, 25);
		panel_1.add(lblNewLabel_1_7_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Chocolate Milk Shake");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_1_1.setBounds(328, 382, 186, 25);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Strawberry Milk Shake");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_1_1.setBounds(328, 418, 202, 25);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		textVanMilkShake = new JTextField();
		textVanMilkShake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textVanMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textVanMilkShake.setText("0");
		textVanMilkShake.setColumns(10);
		textVanMilkShake.setBounds(545, 346, 91, 25);
		panel_1.add(textVanMilkShake);
		
		textChoMilkShake = new JTextField();
		textChoMilkShake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textChoMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textChoMilkShake.setText("0");
		textChoMilkShake.setColumns(10);
		textChoMilkShake.setBounds(545, 387, 91, 25);
		panel_1.add(textChoMilkShake);
		
		textStrawMilkShake = new JTextField();
		textStrawMilkShake.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Inheritance justNumber = new Child_Inheritance();
				justNumber.NumberOnly(e);
			}
		});
		textStrawMilkShake.setHorizontalAlignment(SwingConstants.CENTER);
		textStrawMilkShake.setText("0");
		textStrawMilkShake.setColumns(10);
		textStrawMilkShake.setBounds(545, 423, 91, 25);
		panel_1.add(textStrawMilkShake);
		
		JLabel lblNewLabel_1_5_1_2 = new JLabel("Vanilla Milk Shake");
		lblNewLabel_1_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_5_1_2.setBounds(232, 291, 158, 25);
		panel_1.add(lblNewLabel_1_5_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 12, true));
		panel_2.setBounds(692, 125, 311, 167);
		frmInheritance.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_9 = new JLabel("Cost of Fruits");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_9.setBounds(16, 48, 131, 25);
		panel_2.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Cost of Wine");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_3.setBounds(16, 84, 131, 25);
		panel_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Cost of Ice Cream");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_3.setBounds(16, 120, 152, 25);
		panel_2.add(lblNewLabel_1_2_3);
		
		textCostFruits = new JTextField();
		textCostFruits.setEditable(false);
		textCostFruits.setColumns(10);
		textCostFruits.setBounds(193, 48, 91, 25);
		panel_2.add(textCostFruits);
		
		textCostWine = new JTextField();
		textCostWine.setEditable(false);
		textCostWine.setColumns(10);
		textCostWine.setBounds(193, 87, 91, 25);
		panel_2.add(textCostWine);
		
		textCostIceCream = new JTextField();
		textCostIceCream.setEditable(false);
		textCostIceCream.setColumns(10);
		textCostIceCream.setBounds(193, 123, 91, 25);
		panel_2.add(textCostIceCream);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 12, true));
		panel_3.setBounds(692, 468, 311, 133);
		frmInheritance.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Child_Inheritance cost_of_iterms = new Child_Inheritance();
				double iTax, iSubtotal, iTotal;
				
				//fruits costing 
				cost_of_iterms.Apple = cost_of_iterms.pApple * Double.parseDouble(textApply.getText());
				cost_of_iterms.Banana = cost_of_iterms.pBanana * Double.parseDouble(textBanana.getText());
				cost_of_iterms.Cherry = cost_of_iterms.pCherry * Double.parseDouble(textCherry.getText());
				cost_of_iterms.Grape = cost_of_iterms.pGrape * Double.parseDouble(textGrape.getText());
				cost_of_iterms.Mango = cost_of_iterms.pMango * Double.parseDouble(textMango.getText());
				cost_of_iterms.Orange = cost_of_iterms.pOrange * Double.parseDouble(textOrange.getText());

				//wine costing
				cost_of_iterms.Syrah = cost_of_iterms.pSyrah * Double.parseDouble(textSyrah.getText());
				cost_of_iterms.Merlot = cost_of_iterms.pMerlot * Double.parseDouble(textMerlot.getText());
				cost_of_iterms.Riesling = cost_of_iterms.pRiesling * Double.parseDouble(textRiesling.getText());
				cost_of_iterms.Pinot = cost_of_iterms.pPinot * Double.parseDouble(textPinotNoir.getText());
				cost_of_iterms.Chardonnary = cost_of_iterms.pChardonnary * Double.parseDouble(textCharddonnary.getText());
				cost_of_iterms.Sauvignon = cost_of_iterms.pSauvignon * Double.parseDouble(textSauvignon.getText());
				
				//Ice Cream costing
				cost_of_iterms.MilkShake = cost_of_iterms.pMilkShake * Double.parseDouble(textMilkShake.getText());
				cost_of_iterms.VanillaCone = cost_of_iterms.pVanillaCone * Double.parseDouble(textVanillaCone.getText());
				cost_of_iterms.ClassVanilla = cost_of_iterms.pClassVanilla * Double.parseDouble(textClassicVanilla.getText());
				cost_of_iterms.VanMilkShake = cost_of_iterms.pVanMilkShake * Double.parseDouble(textVanMilkShake.getText());
				cost_of_iterms.ChocMilkShake = cost_of_iterms.pChocMilkShake * Double.parseDouble(textChoMilkShake.getText());
				cost_of_iterms.StrawMilkShake = cost_of_iterms.pStrawMilkShake * Double.parseDouble(textStrawMilkShake.getText());	
				
				
				//getting the amount---------------------------------------------
				
				iTax = cost_of_iterms.GetTax();
				
				iSubtotal = cost_of_iterms.GetAmout(); 
				iTotal = iTax+ iSubtotal;
				
				String subtotal = String.format("R%.2f", iSubtotal);
				textSubtotal.setText(subtotal);
				
				String Tax = String.format("R%.2f", iTax);
				textItermTax.setText(Tax);
				
				String Total = String.format("R%.2f", iTotal);
				textTotal.setText(Total);
				
				//Displaying cost of the products----------------------
				String Fruits = String.format("R%.2f", cost_of_iterms.itermscost1);
				textCostFruits.setText(Fruits);
				
				String Wine = String.format("R%.2f", cost_of_iterms.itermscost2);
				textCostWine.setText(Wine);
				
				String iceCream = String.format("R%.2f", cost_of_iterms.itermscost3);
				textCostIceCream.setText(iceCream);
				
				
			}
		});
		btnTotal.setBounds(49, 21, 214, 23);
		panel_3.add(btnTotal);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Child_Inheritance qExist = new Child_Inheritance();
				qExist.iExitSystem();
			}
			
		});
		btnExit.setBounds(49, 88, 214, 23);
		panel_3.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSubtotal.setText("");
				textItermTax.setText("");
				textTotal.setText("");
				textCostIceCream.setText("");
				textCostWine.setText("");
				textCostFruits.setText("");
				
				textApply.setText("0");
				textBanana.setText("0");
				textCherry.setText("0");
				textGrape.setText("0");
				textMango.setText("0");
				textOrange.setText("0");
				
				textSyrah.setText("0");
				textMerlot.setText("0");
				textRiesling.setText("0");
				textPinotNoir.setText("0");
				textCharddonnary.setText("0");
				textSauvignon.setText("0");
				
				textMilkShake.setText("0");
				textVanillaCone.setText("0");
				textClassicVanilla.setText("0");
				textVanMilkShake.setText("0");
				textChoMilkShake.setText("0");
				textStrawMilkShake.setText("0");	
				
			}
		});
		btnReset.setBounds(49, 54, 214, 23);
		panel_3.add(btnReset);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 12, true));
		panel_4.setBounds(692, 303, 311, 150);
		frmInheritance.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_9_1 = new JLabel("Item Tax");
		lblNewLabel_1_9_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_9_1.setBounds(22, 26, 81, 25);
		panel_4.add(lblNewLabel_1_9_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Subtotal");
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1_3_1.setBounds(22, 62, 81, 25);
		panel_4.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Total");
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2_3_1.setBounds(22, 98, 116, 25);
		panel_4.add(lblNewLabel_1_2_3_1);
		
		textItermTax = new JTextField();
		textItermTax.setEditable(false);
		textItermTax.setColumns(10);
		textItermTax.setBounds(194, 23, 91, 25);
		panel_4.add(textItermTax);
		
		textSubtotal = new JTextField();
		textSubtotal.setEditable(false);
		textSubtotal.setColumns(10);
		textSubtotal.setBounds(194, 62, 91, 25);
		panel_4.add(textSubtotal);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setColumns(10);
		textTotal.setBounds(194, 98, 91, 25);
		panel_4.add(textTotal);
		


		
		
	}
}
