package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	54321
//	54321
//	54321
//	54321
//	54321


public class Pattern4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= rows; col++) {
				System.out.print(rows - col + 1);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
