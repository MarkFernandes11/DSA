package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		boolean isPrime = true;
		
		if(n < 2) isPrime = false;
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime ? "Prime number" : "Not a prime number");
		
		scanner.close();
	}

}
