package com.practice.dsa.fundamentals.problems.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array 1");
		String arrayString1 = scanner.nextLine();

		System.out.println("Enter elements of array 2");
		String arrayString2 = scanner.nextLine();

		int[] array1 = getArray(arrayString1);
		int[] array2 = getArray(arrayString2);

		int[] intersection = intersection(array1, array2);
		System.out.println(Arrays.toString(intersection));

		scanner.close();
	}

	private static int[] getArray(String arrayString) {
		return Arrays.stream(arrayString.split("\\s+")).mapToInt(Integer::parseInt).toArray();
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		int[] countArray = new int[1001];
		for (int num : nums1) {
			countArray[num] = 1;
		}

		int unique = 0;

		for (int num : nums2) {
			if (countArray[num] == 1) {
				countArray[num] = 2;
				unique++;
			}
		}

		int[] result = new int[unique];
		int i = 0;

		for (int j = 0; j < countArray.length; j++) {
			if (countArray[j] == 2) {
				result[i] = j;
				i++;
			}
		}

		return result;
	}

	public static int[] intersection2(int[] array1, int[] array2) {
		Set<Integer> intersection = new HashSet<Integer>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					intersection.add(array1[i]);
					break;
				}
			}
		}

		return intersection.stream().mapToInt(n -> n).toArray();
	}
}
