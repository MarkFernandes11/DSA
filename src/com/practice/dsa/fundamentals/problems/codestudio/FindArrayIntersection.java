package com.practice.dsa.fundamentals.problems.codestudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindArrayIntersection {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array 1");
		String arrayString1 = scanner.nextLine();
		
		System.out.println("Enter elements of array 2");
		String arrayString2 = scanner.nextLine();
		
		int[] array1 = getArray(arrayString1);
		int[] array2 = getArray(arrayString2);
		
		List<Integer> intersection = findArrayIntersection(array1, array2);
		System.out.println(intersection);
		
		scanner.close();
	}

	private static int[] getArray(String arrayString) {
		return Arrays.stream(arrayString.split("\\s+"))
				.mapToInt(Integer::parseInt)
				.toArray();
	}
	
	// 1 2 2 3 4
	// 2 2 2 4 7
	
	private static List<Integer> findArrayIntersection(int[] array1, int[] array2) {
		int array1Pointer = 0;
		int array2Pointer = 0;
		List<Integer> intersection = new ArrayList<Integer>();
		
		while(array1Pointer < array1.length && array2Pointer < array2.length) {
			int value1 = array1[array1Pointer];
			int value2 = array2[array2Pointer];
			
			if(value1 == value2) {
				intersection.add(value1);
				array1Pointer++;
				array2Pointer++;
			} else if(value1 < value2) {
				array1Pointer++;
			} else {
				array2Pointer++;
			}
		}
		
		return intersection;
	}

}
