package com.practice.dsa.fundamentals.homework;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		sumOfArray(array);
		
		scanner.close();
	}

	private static void sumOfArray(int[] array) {
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("Sum = " + sum);
	}

}
