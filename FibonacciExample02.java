// Fibonacci Series using recursion in java (Design Method With Using Scanner Object)

package com.fibonacciseries;

import java.util.Scanner;

public class FibonacciExample02 {
	
	 static int no1 = 0;
	 static int no2 = 1;
	 static int no3 = 0;  
	 
	 public static void printFibonacci(int number){ 
		 
	       if(number>0){  
	    	   
	         no3 = no1 + no2;  
	         no1 = no2;  
	         no2 = no3;  
	         
	         System.out.print(" " + no3); 
	         
	         printFibonacci(number-1);  
	     }  
	 }
	
    public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Number : ");
		
		int number = scanner.nextInt();
		
		 System.out.print(no1 + " " + no2);//printing 0 and 1  
		  
		  printFibonacci(number-2);//n-2 because 2 numbers are already printed 
     }
  }
