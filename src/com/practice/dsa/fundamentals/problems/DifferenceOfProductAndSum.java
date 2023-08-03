package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class DifferenceOfProductAndSum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		
		int sum = 0;
		int product = 1;
		
		while(n > 0) {
			int digit = n % 10;
			sum += digit;
			product *= digit;
			n /= 10;
		}
		
		System.out.println("Difference = " + (product - sum));
		
		scanner.close();
	}

}
