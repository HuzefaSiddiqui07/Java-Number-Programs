// Fibonacci Series in Java without using recursion ( Using For Loop Hard Coded )

package com.fibonacciseries;

public class FibonacciExample1 {

	public static void main(String[] args) {
		
		 int no1 = 0;
		 int no2 = 1;
		
	 System.out.print(no1+" "+no2); //printing 0 and 1  
		 
		  // Using For-Loop
		 int number = 10;  
		 for(int u=2; u <= number; u++) //loop starts from 2 because 0 and 1 are already printed  
		       {  
			 
		 int no3=no1+no2;
		  
		 System.out.print(" "+no3);  
		 
		 no1=no2;  
		  
		 no2=no3;
		 
		}  
	}
 }
