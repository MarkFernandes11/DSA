package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 
//	A B C D E 

public class Pattern7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {			
			for (int col = 1; col <= rows; col++) {
				char ch = (char) ('A' + col - 1);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
