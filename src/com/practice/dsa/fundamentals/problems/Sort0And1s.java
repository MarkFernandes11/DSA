package com.practice.dsa.fundamentals.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0And1s {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();

		int[] array = Arrays.stream(arrayString1.split("\\s+")).mapToInt(Integer::parseInt).toArray();

		sort(array);
		System.out.println(Arrays.toString(array));

		scanner.close();
	}

//	0 0 1 0 1 0 1

	private static void sort(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {

			while (start < end && array[start] == 0)
				start++;

			while (start < end && array[end] == 1)
				end--;

			if (array[start] == 1 && array[end] == 0) {
				// Swap
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;

				start++;
				end--;
			}
		}

	}

}
