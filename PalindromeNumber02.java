/* Palindrome number in java: A palindrome number is a number that is same after reverse. 
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
It can also be a string like LOL, MADAM etc. */

package com.palindromenumber;

import java.util.Scanner;

public class PalindromeNumber02 {

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Number");
		
		int number = scan.nextInt();
		
		scan.close(); // Close Scanner Object
		
		int userInput = number;
		
		int sum = 0;
		
		while (number > 0) {
			
			int rem = number % 10;
			
			sum = (sum * 10) + rem;
			
			number = number / 10;
		}
		
		if (userInput == sum) {
			
			System.out.println("Palindrome Number");
		}
		else {
			
			System.out.println("Not Palindrome");
		}
     }
  }
