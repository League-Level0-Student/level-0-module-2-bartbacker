//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		for(int i = 0; i < 10; i++) {
			int randomNumber = randomMaker.nextInt(4);
		if(randomNumber == 0) {
			System.out.println("nice");
		}
			
			if(randomNumber == 1) {
			System.out.println("cool");
			}
			
			if(randomNumber == 2) {
			System.out.println("neat");
			}
			
			if(randomNumber == 3) {
			System.out.println("wow");
			}

			
			}
			
			}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}

			
	
		
	

