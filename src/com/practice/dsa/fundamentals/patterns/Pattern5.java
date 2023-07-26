package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	1 2 3 4 
//	5 6 7 8 
//	9 10 11 12 
//	13 14 15 16 

public class Pattern5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		int count = 1;
		
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= rows; col++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
