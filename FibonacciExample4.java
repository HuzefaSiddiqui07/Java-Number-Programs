// Fibonacci Series in Java without using recursion ( Using While Loop Using Input )
package com.fibonacciseries;
import java.util.Scanner;

public class FibonacciExample4 {

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 1;
		
		System.out.println(number1 + " " + number2);
		
		// Create Scanner Object
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Number : ");
		int input = scanner.nextInt();
		
		// Using While-Loop
		
		int t = 2;
		while (t <= input) {
			
			int number3 = number1 + number2;
			
			System.out.print(" " + number3);
			t++;
			
			number1 = number2;
			number2 = number3;
		}
	}
 }
