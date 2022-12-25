// Find prime numbers between two numbers Using Scanner Object

package com.primenumbers;

import java.util.Scanner;

public class PrimeExample2 {

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Fisrt Number :");
		int start = scan.nextInt();
		
		System.out.println("Enter Second Number :");
		int end = scan.nextInt();
		
		System.out.println("List Of Prime Numbers Between " + start + " To " + end);
		
		// Using For-Loop
		for (int s = start; s <= end; s++) {
			
			if (isPrime (s)) {
				
				System.out.println(s);
				
			}
		}
	}
		public static boolean isPrime (int n) {
			
			if (n <= 1) {
				return false;
			}
			for (int s = 2; s <= Math.sqrt(n); s++) {
				
				if (n % s == 0) {
					return false;
				}
			}
		return true;
	}
}
