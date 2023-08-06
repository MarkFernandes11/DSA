package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number in binary form");
		String binary = scanner.next();
		
		int decimal = convertToDecimal(binary);
		System.out.println(decimal);
		
		scanner.close();
	}

	private static int convertToDecimal(String binary) {
		int decimal = 0;
		int power = 0;
		
		for (int i = binary.length() - 1; i >= 0; i--, power++) {
			if(binary.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
		}
		
		return decimal;
	}

}
