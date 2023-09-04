package com.practice.dsa.searching.binarysearch.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class SqrtX {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number whose square root needs to be found");
		int num = scanner.nextInt();

		int squareRoot = mySqrt(num);

		System.out.println(squareRoot);

		scanner.close();
	}

	public static int mySqrt(int N) {
		int result = -1;

		if (N < 0)
			return result;

		if (N == 0 || N == 1)
			return N;

		int start = 1;
		int end = N;
		int mid;

		while (start <= end) {
			mid = start + (end - start) / 2;
			BigInteger product = BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid));

			if (product.compareTo(BigInteger.valueOf(N)) > 0)
				end = mid - 1;
			else if (product.compareTo(BigInteger.valueOf(N)) == 0)
				return mid;
			else {
				result = mid;
				start = mid + 1;
			}

			mid = start + (end - start) / 2;
		}

		return result;
	}
	
	public static int mySqrt2(int N) {
		return (int) Math.sqrt(N);
	}

}
