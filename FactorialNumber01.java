package com.factorialnumber;

public class FactorialNumber01 {

	public static void main(String[] args) {
	
		int fact = 1;
		
		// Using For-Loop
		
		 int number = 6;
		 
		for (int s = 1; s <= number; s++) {
			
			fact = fact * s;
		}
		
		System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
