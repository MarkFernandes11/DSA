package com.practice.dsa.searching.binarysearch.problems;

import java.util.Scanner;

public class SquareRootOfANumberWithPrecision {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number whose square root needs to be found");
		int num = scanner.nextInt();
		
		System.out.println("Enter precision of number");
		int precision = scanner.nextInt();

		double squareRoot = mySqrt(num, precision);

		System.out.println(squareRoot);
		System.out.println(Math.sqrt(num));	
		
		scanner.close();
	}
	
	private static double mySqrtWithPrecision(int num, int precision, int tempSoln) {
		double ans = tempSoln;
		double factor = 1;
		
		for (int i = 0; i < precision; i++) {
			factor = factor / 10;
			
			for (double j = ans; j * j < num; j += factor) {
				ans = j;
			}
		}
		
		return ans;
	}

	private static double mySqrt(int num, int precision) {
		if(num == 0 || num == 1) return num;
		
		int sqrt = sqrtWithoutPrecision(num); 

		return mySqrtWithPrecision(num, precision, sqrt);
	}

	private static int sqrtWithoutPrecision(int num) {
		int ans = -1;
		int start = 1;
		int end = num;
		int mid;
		
		while(start <= end) {
			mid = start + (end - start) / 2;
			
			if((long) mid * mid > (long) num) end = mid - 1;
			else if(mid * mid == num) return mid;
			else {
				ans = mid;
				start = mid + 1;
			}
		} 
		
		return ans;
	}

}
