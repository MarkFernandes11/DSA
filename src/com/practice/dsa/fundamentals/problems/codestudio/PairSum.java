package com.practice.dsa.fundamentals.problems.codestudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PairSum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();
		
		System.out.println("Enter value to find pair of");
		int num = scanner.nextInt();
		
		int[] array1 = Arrays.stream(arrayString1.split("\\s+"))
							 .mapToInt(Integer::parseInt)
							 .toArray();
		
		List<int[]> result = pairSum(array1, num);
		result.forEach(arr -> System.out.println(Arrays.toString(arr)));
		
		scanner.close();
	}
	
    public static List<int[]> pairSum(int[] arr, int s) {
    	List<int[]> result = new ArrayList<>();
    	
    	for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == s) {
					result.add(resultArray(arr[i], arr[j]));
				}
			}
		}
    	
    	Collections.sort(result, (arr1, arr2) -> arr1[0] - arr2[0]);
    	
    	return result;
    }

    public static int[] resultArray(int num1, int num2) {
    	int[] result = new int[2];
    	
    	int min = Math.min(num1, num2);
    	int max = Math.max(num1, num2);
    	
    	result[0] = min;
    	result[1] = max;
    	
    	return result;
    }
    
    
}
