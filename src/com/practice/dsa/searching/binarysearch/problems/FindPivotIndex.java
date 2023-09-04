package com.practice.dsa.searching.binarysearch.problems;

import java.util.Arrays;
import java.util.Scanner;

public class FindPivotIndex {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();

		int[] array = Arrays.stream(arrayString1.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int pivotIndex = pivotIndex(array);
		
		System.out.println(pivotIndex);

		scanner.close();
	}
	
    
    public static int pivotIndex(int[] arr) {
    	if(arr == null) return -1;
    	
    	int leftSum = 0;
    	int rightSum = elementsSum(arr, 0, arr.length - 1);
    	
    	for (int i = 0; i < arr.length; i++) {
    		rightSum -= arr[i];
    		
    		if(leftSum == rightSum) return i;
    		
    		leftSum += arr[i];
		}
    	
    	return -1;
    }

    public static int elementsSum(int[] arr, int start, int end) {
    	int sum = 0;
    	
    	for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
    	
    	return sum;
    }
    
}
