package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	1234554321
//	1234**4321
//	123****321
//	12******21
//	1********1

public class All4TrianglesPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			// Printing numbers in ASC
			for (int col = 1; col <= (rows + 1 - row); col++) {
				System.out.print(col);
			}
			
			// Printing stars
			for (int col = row; col > 1; col--) {
				System.out.print("**");
			}
			
			// Printing numbers in DESC
			for (int col = (rows + 1 - row); col >= 1; col--) {
				System.out.print(col);
			}
			
			System.out.println();
		}
		
		scanner.close();
	}

}
