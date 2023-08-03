package com.practice.dsa.fundamentals.problems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		System.out.println("Enter key to be searched");
		int key = scanner.nextInt();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		boolean result = search(array, key);
		
		System.out.println(result ? "Key found" : "Key not found");
		
		scanner.close();
	}

	private static boolean search(int[] array, int key) {
		
		for (int num : array) {
			if(num == key) return true;
		}
		
		return false;
	}

}
