package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	A A A A A 
//	B B B B B 
//	C C C C C 
//	D D D D D 
//	E E E E E 

public class Pattern6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			char ch = (char) ('A' + row - 1);
//			char ch = (char) (64 + i);  // Another approach
			
			for (int col = 1; col <= rows; col++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
