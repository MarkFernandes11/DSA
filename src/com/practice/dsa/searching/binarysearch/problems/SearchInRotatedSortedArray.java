package com.practice.dsa.searching.binarysearch.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchInRotatedSortedArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();

		List<Integer> list = Arrays.stream(arrayString1.split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		System.out.println("Search element");
		int k = scanner.nextInt();
		int pivotIndex = search(list, list.size(), k);
		
		System.out.println(pivotIndex);

		scanner.close();
	}
	
    public static int search(List<Integer> list, int n, int k) {
    	int result = -1;
    	int pivot = findPivot(list, n);
    	
    	System.out.println(pivot);
    	
    	if(k >= list.get(pivot) && k <= list.get(n - 1)) {
    		result = binarySearch(list, pivot, n - 1, k);
    	} else {
    		result = binarySearch(list, 0, pivot - 1, k);
    	}
    	
    	return result;
    }
    
    public static int findPivot(List<Integer> list, int n) {
    	int start = 0;
    	int end = n - 1;
    	int mid = start + (end - start) / 2;
    	
    	while(start < end) {
    		if(list.get(mid) >= list.get(0)) {
    			start = mid + 1;
    		} else {
    			end = mid;
    		}
    		
    		mid = start + (end - start) / 2;
    	}
    	
    	return start;
    }

    public static int binarySearch(List<Integer> list, int start, int end, int k) {
    	int result = -1;
    	int mid = start + (end - start) / 2;
    	
    	while(start <= end) {
    		if(list.get(mid) == k) return mid;
    		else if(list.get(mid) < k) start = mid + 1;
    		else end = mid - 1;
    		
    		mid = start + (end - start) / 2;
    	}
    	
    	
    	return result;
    }
}
