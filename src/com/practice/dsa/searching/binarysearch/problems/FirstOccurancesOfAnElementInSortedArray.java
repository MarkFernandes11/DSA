package com.practice.dsa.searching.binarysearch.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FirstOccurancesOfAnElementInSortedArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		List<Integer> data = Arrays.stream(arrayString.split("\\s+")).mapToInt(Integer::parseInt).boxed().toList();

		ArrayList<Integer> list = new ArrayList<Integer>(data);
		System.out.println("Element to be searched for");
		int value = scanner.nextInt();
		
		int result = firstAndLastPosition(list, list.size(), value);
		System.out.println(result);
		
		scanner.close();
	}

    public static int firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
    	int result = 0;
    	
    	int firstPosition = findFirstPosition(arr, k);
    	
    	if(firstPosition != -1) {
    		result = (findLastPosition(arr, k) - firstPosition) + 1;
    	} 
    	
    	return result;
    }

	private static int findFirstPosition(ArrayList<Integer> arr, int k) {
		int pos = -1;
		int start = 0;
		int end = arr.size() - 1;
		int mid = start + (end - start)/2;
		
		while(start <= end) {
			if(arr.get(mid) == k) {
				pos = mid;
				end = mid - 1;
			} else if(arr.get(mid) < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
			mid = start + (end - start)/2;
		}
		
		return pos;
	}
	
	private static int findLastPosition(ArrayList<Integer> arr, int k) {
		int pos = -1;
		int start = 0;
		int end = arr.size() - 1;
		int mid = start + (end - start)/2;
		
		while(start <= end) {
			if(arr.get(mid) == k) {
				pos = mid;
				start = mid + 1;
			} else if(arr.get(mid) < k) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
			mid = start + (end - start)/2;
		}
		
		return pos;
	}
}
