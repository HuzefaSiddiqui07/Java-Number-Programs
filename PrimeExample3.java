/* Java program to check whether number is prime or not. ( Prime means  a number which is divisible by only two numbers: 1 and itself. 
   So, if any number is divisible by any other number, it is not a prime number.) */
package com.primenumbers;
import java.util.Scanner;

public class PrimeExample3 {

public static void main(String[] args) {
		
		int number; // User Input Store Variable
		int count = 0;
		
		// Create Scanner Object
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Number");
		 number = scan.nextInt();
		 scan.close();
		
		for (int e = 1; e <= number; e++) {
			
			if (number % e == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
 }
