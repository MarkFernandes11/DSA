package com.practice.dsa.fundamentals.problems.codestudio;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		int unique = findUnique(array);
		System.out.println(unique);
		
		scanner.close();
	}

	private static int findUnique(int[] array) {
		int result = array[0];
		
		for (int i = 1; i < array.length; i++) {
			result = result ^ array[i];
		}
		
		return result;
	}

}
