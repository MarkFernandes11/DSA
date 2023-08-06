package com.practice.dsa.fundamentals.problems;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		findMinMax(array);
		
		scanner.close();
	}
	
	private static void findMinMax(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int num : array) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.println(min);
		System.out.println(max);
	}
	
}
