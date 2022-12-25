package com.factorialnumber;

import java.util.Scanner;

public class FactorialNumber02 {

	public static void main(String[] args) {
	
		// Create Scanner Object
		
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Enter Number");
		int number = scan.nextInt();
		scan.close();
		
		int fact = 1;
		
		// Using For-Loop
		
		for (int d = 1; d <= number; d++) {
			
			fact = fact * d;
		}
		 System.out.println("Factorial of "+number+" is: "+fact);  

        }

     }
