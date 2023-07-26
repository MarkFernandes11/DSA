package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//		1
//	   121
//	  12321
//	 1234321

public class TrianglePattern11 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		approach1(rows);
		approach2(rows);
		
		scanner.close();
	}
	
	private static void approach1(int rows) {
		System.out.println("Approach 1 : printing 3 triangles");
		for (int row = 1; row <= rows; row++) {
			// Printing triangle with spaces
			for (int col = rows; col > row; col--) {
				System.out.print(" ");
			}
			
			// Printing triangle with numbers
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			
			// Printing triangle with reverse numbers
			for (int col = row - 1; col >= 1; col--) {
				System.out.print(col);
			}
			
			System.out.println();
		}
	}

	private static void approach2(int rows) {
		System.out.println("Approach 2 : printing row data");
		for (int row = 1; row <= rows; row++) {
			// Printing spaces for row
			for (int col = rows; col > row; col--) {
				System.out.print(" ");
			}
			
			// Printing no
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}

			// Print reverse nos
			for (int col = row - 1; col >= 1; col--) {
				System.out.print(col);
			}
			
			System.out.println();
		}
	}
}
