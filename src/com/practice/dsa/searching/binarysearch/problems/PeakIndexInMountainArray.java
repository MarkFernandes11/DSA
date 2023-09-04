package com.practice.dsa.searching.binarysearch.problems;

import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInMountainArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();

		int[] array = Arrays.stream(arrayString1.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int peakIndex = peakIndexInMountainArray(array);
		
		System.out.println(peakIndex);

		scanner.close();
	}
	
    public static int peakIndexInMountainArray(int[] arr) {
    	if(arr == null || arr.length < 3) return -1;
    	
    	int start = 0;
    	int end = arr.length - 1;
    	int mid = start + (end - start) / 2;
    	
    	while(start < end) {
    		if(arr[mid] < arr[mid + 1]) {
    			start = mid + 1;
    		} else {
    			end = mid;
    		}
    		
    		mid = start + (end - start) / 2;
    	}
    	
    	return start;
    }

}
