// Right Triangle Star Pattern (Top to Bottom)

package com.starpattern;

import java.util.Scanner;

public class RightTrianglePattern01 {

	public static void main(String[] args) {
		
		// i for rows and j for columns      
		// row denotes the number of rows you want to print  
		
		// Create Scanner 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int row = scan.nextInt();
		scan.close();

		  // Using For Loop
		
		//outer loop for rows  
		for (int i = 1; i <= row; i++) {
			
			//inner loop for columns  
			for (int j = 1; j <= i; j++) {
				
		         //prints stars   
				System.out.print("*");
			}
			
	//throws the cursor in a new line after printing each line  
			System.out.println();
		}
	}
 }
