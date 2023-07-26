package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	   *
//	  **
//	 ***
//	****

public class RightTrianglePattern1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			// Printing spaces
			for (int col = rows; col > row; col--) {
				System.out.print(" ");
			}
			// Printing stars
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}

}
