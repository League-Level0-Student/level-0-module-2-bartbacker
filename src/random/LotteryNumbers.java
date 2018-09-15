package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		
int r = 0;
		

		Random ran = new Random();
		r = ran.nextInt(99999 - 10000);
		
		JOptionPane.showMessageDialog(null, r);

		System.out.println(r);
		
}
}