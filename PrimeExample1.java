// Prime Number Program in Java Using Scanner Object With Create a Method Using For-Loop

package com.primenumbers;

import java.util.Scanner;

public class PrimeExample1 {
	

	public static void main(String[] args) {
		
		// Create Scanner Object
		  Scanner s = new Scanner(System.in);  
		  
	       System.out.print("Enter a number : ");  
	       int no = s.nextInt();  
	       
	       if (isPrime(no)) {  
	           System.out.println(no + " is a prime number");  
	       } 
	       else {  
	           System.out.println(no + " is not a prime number");  
	       }  
	   }  
	  
	   public static boolean isPrime(int num) {  
	       if (num < 1) {  
	           return false;  
	       }  
	       for (int f = 2; f < Math.sqrt(num); f++) {  
	           if (num % f == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	 }


