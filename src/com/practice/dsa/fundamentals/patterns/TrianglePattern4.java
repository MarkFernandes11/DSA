package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	1 
//	2 3 
//	3 4 5 
//	4 5 6 7 
//	5 6 7 8 9 

public class TrianglePattern4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			int count = row;
			for (int col = 1; col <= row; col++) {
				System.out.print(count + " ");
				count++;
				
//				System.out.print((i + j - 1) + " ");  // Approach 2 without using count variable
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
