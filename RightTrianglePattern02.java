// Right Triangle Star Pattern (Bottom to Top)
package com.starpattern;

import java.util.Scanner;

public class RightTrianglePattern02 {

	public static void main(String[] args) {
		
		// p for rows and g for columns      
	   // row denotes the number of rows you want to print 
		
		// Create Scanner 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int row = scan.nextInt();
		scan.close();
 
		  // Using For Loop
		
		//outer loop for rows
		// Print Stars From Top to Bottom 
		for (int p = 1; p <= row; p++) {
			// Print Stars From Top to Bottom
		   for (int g = row; g >= p; g--) {
			   
			 //prints stars   
			System.out.print("*");
			   
		   }
	//throws the cursor in a new line after printing each line  
		   System.out.println();
			
		}

	}

}
