package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class NthFibonacciNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = scanner.nextInt();
		
		int result = nthFibonacciValue(n);
		System.out.println(result);
		
		scanner.close();
	}

	private static int nthFibonacciValue(int n) {
		int first = 0;
		int second = 1;
		
		if(n == 1) return first;
		
		if(n == 2) return second;
		
		for (int i = 3; i <= n; i++) {
			int temp = first + second;
			first = second;
			second = temp;
		}
		
		return second;
	}
 
}
