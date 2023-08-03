package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class BinaryToDecimal2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int binary = scanner.nextInt();
		
		int decimal = convertToDecimal(binary);
		System.out.println(decimal);
		
		scanner.close();
	}

	private static int convertToDecimal(int binary) {
		int decimal = 0;
		int power = 0;
		
		while(binary != 0) {
			int bit = binary % 10;
			
			decimal += Math.pow(2, power) * bit; 
			
			power++;
			binary /= 10;
		}
		
		return decimal;
	}

}
