package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class FindAP {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int result = findAP(n);
		System.out.println(result);
		
		scanner.close();
	}

	private static int findAP(int n) {
		
		return ((3 * n) + 7);
	}

}
