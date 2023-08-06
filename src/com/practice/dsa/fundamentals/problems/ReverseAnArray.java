package com.practice.dsa.fundamentals.problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		reverse(array);
		
		scanner.close();
	}

	private static void reverse(int[] array) {
		int start = 0;
		int end = array.length - 1;
		
		while(start < end) {
			swap(array, start, end);
			start++;
			end--;
		}

		printArray(array);
	}
	
	private static void swap(int[] array, int start, int end) {
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
	}
	
	private static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		
	}	
}
