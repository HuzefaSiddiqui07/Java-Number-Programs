package com.starpattern;

import java.util.Scanner;

public class PyramidPattern  
{    
public static void main(String args[])   {    
	
//r for rows and t for columns      
//row denotes the number of rows you want to print  
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter Number");
	int row = scan.nextInt();
	scan.close();
	
      int r, t;       
      
    //Outer loop work for rows  
    for (r=0; r<row; r++)   {  
	
   //inner loop work for space      
    for (t=row-r; t>1; t--)   {  
    	
    //prints space between two stars  
        System.out.print(" ");   
 }   
   //inner loop for columns  
   for (t=0; t<=r; t++)   {  
	   
       //prints star      
    System.out.print("* ");   
  }  
   
   //throws the cursor in a new line after printing each line  
       System.out.println();   
     }   
   }   
 }  
