package com.practice.dsa.searching.binarysearch.problems;

import java.util.Arrays;
import java.util.Scanner;

public class AllocateBooks {
	
//  3 5
//  1 2 2 3 1
  
//  4 7
//  2 2 3 3 4 4 1 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of testcases");
		int testcases = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < testcases; i++) {
			System.out.println("Enter number of days and size of array");
			String[] arr1 = scanner.nextLine().split("\\s+");
			int days = Integer.parseInt(arr1[0]);
			int arraySize = Integer.parseInt(arr1[1]);
			
			System.out.println("Enter array elements");
			int[] time = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			
			long result = ayushGivesNinjatest(arraySize, days, time);
			System.out.println(result);
		}


		scanner.close();
	}
	
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
    	long ans = -1;
    	
    	if(m > n) return ans;
    	
    	long start = 0;
    	long end = Arrays.stream(time).sum();
    	
    	while(start <= end) {
    		long mid = start + (end - start) / 2;

        	if(isPossibleSolution(time, mid, m)) {
        		ans = mid;
        		end = mid - 1;
        	} else {
        		start = mid + 1;
        	}    		
    	}
    	
    	return ans;
    }
    
	private static boolean isPossibleSolution(int[] time, long mid, int m) {
		int days = 1;
		long timeSoFar = 0;
		
		for (int i = 0; i < time.length; i++) {
			if(timeSoFar + time[i] <= mid) {
				timeSoFar += time[i];
			} else {
				days++;
				
				if(days > m || time[i] > mid) return false;
				
				timeSoFar = time[i];
			}
		}
		
		return true;
	}

}
