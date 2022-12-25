// Fibonacci Series in Java without using recursion ( Using For Loop Using Input )

package com.fibonacciseries;

import java.util.Scanner;

public class FibonacciExample3 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		
		System.out.println(n1 + " " + n2); //printing 0 and 1  
		
		// Create Scanner Object
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Number : ");
		int number = scan.nextInt();
		
		// Using For-Loop
		for (int r = 2; r <= number; r++) { //loop starts from 2 because 0 and 1 are already printed
			
			int n3 = n1 + n2;
			
			System.out.print(" " + n3);
			
			n1 = n2;
			n2 = n3;
		}
    }
}
