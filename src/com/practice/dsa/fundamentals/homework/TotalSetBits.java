package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class TotalSetBits {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = scanner.nextInt();
		System.out.println("Enter value of b");
		int b = scanner.nextInt();
		
		int result = findSetBits(a) + findSetBits(b);
		System.out.println(result);
		
		scanner.close();
	}
	
	private static int findSetBits(int n) {
		int count = 0;
		
		while(n != 0) {
			count = count + (n & 1);
			n = n >> 1;
		}
		
		return count;
	}

}
