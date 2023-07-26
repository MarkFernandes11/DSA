package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	*
//	**
//	***
//	****
//	*****

public class TrianglePattern1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
