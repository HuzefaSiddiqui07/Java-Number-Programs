// Left Triangle Star Pattern (Top to Bottom)

package com.starpattern;

import java.util.Scanner;

public class LeftTrianglePattern01 {

	public static void main(String[] args) {
		
		//e for rows and d for columns      
		//row denotes the number of rows you want to print  
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number");
		int row  = sc.nextInt();
		sc.close();
		
		// Using For Loop
		
		//outer loop for rows   
		for (int e = 1; e <= row; e++) {
			
			//inner loop work for space
			for (int f = e; f < row; f++) {
				System.out.print(" ");
			}
			//inner loop for columns  
			for (int d = 1; d <= e; d++) {
				//prints stars
				System.out.print("*");
			}
		//throws the cursor in a new line after printing each line  
			System.out.println();
		}
	}
 }
