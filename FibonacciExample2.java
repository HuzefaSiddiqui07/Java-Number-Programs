// Fibonacci Series in Java without using recursion ( Using While Loop Hard Coded )

package com.fibonacciseries;

public class FibonacciExample2 {

	public static void main(String[] args) {
		
		int num01 = 0;
		int num02 = 1;
		
		System.out.print(num01 +" "+ num02); //printing 0 and 1  
		
		// Using While Loop
		int e = 2;  //loop starts from 2 because 0 and 1 are already printed
		int number = 12;
		
		while(e <= number) {
			
			int num03 = num01 + num02;
			
			System.out.print(" " + num03); 
			e++;
			
			num01 = num02;
			num02 = num03;
		}
		

	}

}
