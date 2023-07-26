package com.practice.dsa.fundamentals.patterns;

import java.util.Scanner;

//	A B C D E 
//	F G H I J 
//	K L M N O 
//	P Q R S T 
//	U V W X Y 

public class Pattern8 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		char ch = 'A';
		
		for (int row = 1; row <= rows; row++) {			
			for (int col = 1; col <= rows; col++) {
				System.out.print(ch + " ");
				ch = (char) (ch + 1);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
