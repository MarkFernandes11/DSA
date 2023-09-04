package com.practice.dsa.searching.binarysearch.problems;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array and number of aggressive cows");
		String[] arr1 = scanner.nextLine().split("\\s+");
		int cows = Integer.parseInt(arr1[1]);
		
		System.out.println("Enter array elements");
		int[] stalls = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		int result = aggressiveCows(stalls, cows);
		System.out.println(result);

		scanner.close();
	}
	
    public static int aggressiveCows(int[] stalls, int k) {
    	int result = -1;
    	
    	if(k > stalls.length) return result;
    	
    	Arrays.sort(stalls);
    	int start = 0;
    	int end = stalls[stalls.length - 1];
    	
    	while(start <= end) {
    		int mid = start + (end - start) / 2;
    		
    		if(isPossibleSolution(stalls, mid, k)) {
    			result = mid;
    			start = mid + 1;
    		} else {
    			end = mid - 1;
    		}
    	}
    	
    	return result;
    }

	private static boolean isPossibleSolution(int[] stalls, int mid, int k) {
		int cow = 1;
		int lastPos = stalls[0];
		
		for (int i = 1; i < stalls.length; i++) {
			if((stalls[i] - lastPos) >= mid) {
				cow++;
				
				if(cow == k) return true;
				
				lastPos = stalls[i];
			}
		}
		
		return false;
	}	

}
