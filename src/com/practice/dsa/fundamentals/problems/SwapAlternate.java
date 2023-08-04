package com.practice.dsa.fundamentals.problems;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {

//	Find duplicate element in array
//	Array intersection
//	Pair sum
// 	Triplet sum
//	Sort 0's and 1's
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		swapAlternate(array);
		
		scanner.close();
	}

	private static void swapAlternate(int[] array) {		
		for (int i = 0; i < array.length; i+=2) {
			if((i + 1) < array.length) {
				swap(array, i, i + 1);
			}
		}
		
		printArray(array);
	}

	private static void swap(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;		
	}
	
	private static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}		
	}
	
}
