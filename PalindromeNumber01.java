/* Palindrome number in java: A palindrome number is a number that is same after reverse. 
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
It can also be a string like LOL, MADAM etc. */

package com.palindromenumber;

public class PalindromeNumber01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int no = 393; // It is the number variable to be checked for palindrome 
		
		int temp = no;
		
		while (no > 0) {
			
			int rem = no % 10;
			sum = (sum * 10) + rem;
			no = no / 10;
		}
		
		if (temp == sum) {
		System.out.println("Palindrome Number");    
		}
		else {
			System.out.println("Not Palindrome");   
		}
	}

}
