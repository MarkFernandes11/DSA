package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	A B C D E 
//	B C D E F 
//	C D E F G 
//	D E F G H 
//	E F G H I 

public class Pattern10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			char ch = (char) ('A' + row - 1);
			for (int col = 1; col <= rows; col++) {
				System.out.print(ch + " ");
				ch = (char) (ch + 1);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
