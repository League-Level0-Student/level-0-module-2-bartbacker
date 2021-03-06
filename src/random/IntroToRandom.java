//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		Random ran = new Random();
		r = ran.nextInt(2);

		//4. Limit the random number between 0 and 100
		Random ran2 = new Random();
		r = ran2.nextInt(100 - 0);
		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		Random ran21 = new Random();
		r = ran21.nextInt((75 - 25)+1) + 25;	
		//6. Challenge: Limit the random number between -222 and 88
		Random ran22 = new Random();
		r = ran22.nextInt((88 + 222)+1) - 222;
		//1. Print out the value of r
		System.out.println(r);
		//2. Run the program.  What number appears in the console?
		
		//   Run it again. Is the number the same?
		
	}
}