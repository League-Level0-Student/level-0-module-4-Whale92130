package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nik = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		
	int nikI = Integer.parseInt(nik);
		// Ask the user how many dimes they have, and convert their answer
	String dime = JOptionPane.showInputDialog(null, "How many dimes do you have?");
	
int dimeI = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quart = JOptionPane.showInputDialog(null, "How many quarters do you have?");

int quartI = Integer.parseInt(quart);
		// Calculate how much money the user has.  Hint: Use a double variable 
nikI = nikI*5;
dimeI = dimeI*10;
quartI = quartI*25;
double money = nikI + dimeI + quartI;
money = money/100;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "$"+money);
	}
}

