package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String score = JOptionPane.showInputDialog(null, "What did you get on your test?");
		 double scoreI = Double.parseDouble(score);
		 if (scoreI > 100) {
			 System.out.println("hax");
		 }
		 else if (scoreI == 100) {
			 System.out.println("Great job 100%");
		 }
		 else if (scoreI >= 90) {
			System.out.println("You got an A for average");
		 }
		 else if (scoreI < 90 && scoreI > 0) {
				System.out.println("B = Bad");
				System.out.println("C = Can't eat dinner");
				System.out.println("D = Don't come home");
				System.out.println("F = Find a new family");
			 }
		 else {
			 System.out.println("Imagine not being there, bad");
		 }

	}

}
