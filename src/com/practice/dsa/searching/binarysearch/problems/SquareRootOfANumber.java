package com.practice.dsa.searching.binarysearch.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class SquareRootOfANumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number whose square root needs to be found");
		long num = scanner.nextLong();
		
		int squareRoot = sqrtN(num); 
		
		System.out.println(squareRoot);

		scanner.close();
	}

	public static int sqrtN(long N) {
		int result = -1;
		
		if(N < 0) return result;
		
	    if(N == 0 || N == 1) return (int) N;
		
		long start = 1;
		long end = N;
		long mid;
		
		while(start <= end) {
			mid = start + (end - start) / 2;
			BigInteger product = BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid)); 
			
			if(product.longValue() == N) return (int) mid;
			
			if(product.longValue() > N) end = mid - 1;
			else {
				result = (int) mid;
				start = mid + 1;
			}
		}
		
		return result;
	}
}
