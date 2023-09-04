package com.practice.dsa.searching.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();

		int[] array = Arrays.stream(arrayString.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Element to be searched for");
		int value = scanner.nextInt();

		int result = search(array, value);
		System.out.println(result);

		scanner.close();
	}

	private static int search(int[] array, int value) {
		int index = -1;
		int start = 0;
		int end = array.length - 1;
		
		int middle = start + ((end - start)/2);
		
		while(start <= end) {
			
			if(array[middle] == value) return middle;
			else if(array[middle] < value) start = middle + 1;
			else end = middle - 1;
			
			middle = start + ((end - start)/2);
		}
		
		return index;
	}
	
}
