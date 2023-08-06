package com.practice.dsa.fundamentals.homework;

public class FindNCR {
	
//	nCr = n!/(r! * (n-r)!)
	
	public static void main(String[] args) {
		int n = 13;
		int r = 1;
		
		int ncr = findnCr(n, r);
		
		System.out.println("nCr = " + ncr);
	}
	
	private static int findnCr(int n, int r) {
		int numerator = factorial(n);
		int denominator = factorial(r) * factorial(n - r);
				
		return numerator / denominator;
	}

	private static int factorial(int num) {
		
		return (num <= 1) ? 1 : num * factorial(num - 1); 
	}
	
	private static int factorial2(int num) {
		int product = 1;
		
		while(num >= 1) {
			product *= num;
			num--;
		}
		
		return product; 
	}
}
