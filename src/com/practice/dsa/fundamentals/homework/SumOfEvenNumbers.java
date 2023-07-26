package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a num");
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i+=2) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
		
		scanner.close();
	}

}
