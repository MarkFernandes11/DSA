package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//		1
//	   22
//	  333
//	 4444
//	55555

public class TrianglePattern12 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			// Printing spaces
			for (int col = rows; col > row; col--) {
				System.out.print(" ");
			}
			
			// Printing numbers
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			
			System.out.println();
		}
		
		scanner.close();
	}

}
