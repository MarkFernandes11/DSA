package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 

public class TrianglePattern5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
