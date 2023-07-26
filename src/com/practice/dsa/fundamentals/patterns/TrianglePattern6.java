package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	A 
//	B B 
//	C C C 
//	D D D D 
//	E E E E E 

public class TrianglePattern6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		
		for (int row = 1; row <= rows; row++) {
			char ch = (char) ('A' + row - 1);
			for (int col = 1; col <= row; col++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
