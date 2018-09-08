import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("Whats the question?");
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(3);
		
		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
			
			if(randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "No");

			}
			
			if(randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Maybe");

			}
			
			if(randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "I dont know");

			}

			
			}
}
