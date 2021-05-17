package OOP_Inharitance;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Parent_inheritance {
	
	JFrame frame;
	
	public double Apple;
	public double Banana;
	public double Cherry;
	public double Grape;
	public double Mango;
	public double Orange;
	
	public double Syrah;
	public double Merlot;
	public double Riesling;
	public double Pinot;
	public double Chardonnary;
	public double Sauvignon;
	
	public double MilkShake;
	public double VanillaCone;
	public double ClassVanilla;
	public double VanMilkShake;
	public double ChocMilkShake;
	public double StrawMilkShake;
	

	public double pApple = 1.23;
	public double pBanana = 2.12;
	public double pCherry = 2.50;
	public double pGrape = 2.30;
	public double pMango = 1.89;
	public double pOrange = 1.78;

	public double pSyrah = 9.50;
	public double pMerlot = 7.90;
	public double pRiesling = 7.00;
	public double pPinot = 7.50;
	public double pChardonnary = 8.70;
	public double pSauvignon = 9.30;
	
	
	public double pMilkShake = 1.59;
	public double pVanillaCone = 1.94;
	public double pClassVanilla = 2.09;
	public double pVanMilkShake = 2.90;
	public double pChocMilkShake = 2.00;
	public double pStrawMilkShake = 3.10;
	
	public double itermscost1;
	public double itermscost2;
	public double itermscost3;
	public double itermscost;
	public double TaxCost;
	
	public double GetAmout() {
		itermscost1 = Apple + Banana + Cherry + Grape + Mango + Orange;
		itermscost2 = Syrah + Merlot + Riesling + Pinot + Chardonnary + Sauvignon;
		itermscost3 = MilkShake + VanillaCone + ClassVanilla + VanMilkShake + ChocMilkShake + StrawMilkShake;
		itermscost = itermscost1 + itermscost2 + itermscost3;
		return (itermscost);
	}
	
	
	public void iExitSystem() {
		frame = new JFrame();
		if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "OOP Inheritance", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}
	}
	//Tax calculation
	public double mcTax =0.90;
	
	public double cFindTax(double cAmount) {
		double findTax = cAmount - (cAmount * mcTax);
		return (findTax);
	}
	
	public double GetTax() {
		TaxCost = cFindTax(itermscost3);
		return (TaxCost);
	}
	
	public void NumberOnly(java.awt.event.KeyEvent evt) {
		char iNumber =  evt.getKeyChar();
		if ((!Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
			evt.consume();
		}
		
	}
	
	public Parent_inheritance() {
		// TODO Auto-generated constructor stub
	}

}
