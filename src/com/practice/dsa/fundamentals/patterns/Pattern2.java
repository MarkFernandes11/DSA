package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	11111
//	22222
//	33333
//	44444
//	55555

public class Pattern2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= rows; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
