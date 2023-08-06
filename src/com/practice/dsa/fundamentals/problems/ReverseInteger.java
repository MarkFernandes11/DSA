package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int result = reverse(n);
		System.out.println(result);

		scanner.close();
	}

	public static int reverse(int x) {
		int result = 0;
		
		while(x != 0) {
			
			if((result > (Integer.MAX_VALUE/10)) || (result < (Integer.MIN_VALUE/10))) return 0;
			
			result = (result * 10) + x % 10;
			
			x /= 10;
		}
		
		return result;
	}

}
