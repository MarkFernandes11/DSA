package com.practice.dsa.searching.binarysearch.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PaintersPartitionProblem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of testcases");
		int testcases = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < testcases; i++) {
			System.out.println("Enter size of array and number of painters");
			String[] arr1 = scanner.nextLine().split("\\s+");
			int painters = Integer.parseInt(arr1[1]);
			
			System.out.println("Enter array elements");
			List<Integer> boards = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().toList();
			
			int result = findLargestMinDistance(new ArrayList<Integer>(boards), painters);
			System.out.println(result);
		}


		scanner.close();
	}
	
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
    	int result = -1;
    	
    	if(k > boards.size()) return result;
    	
    	int start = 0;
    	int end = boards.stream().mapToInt(n -> n).sum();
    	
    	while(start <= end) {
    		int mid = start + (end - start) / 2;
    		
    		if(isPossibleSolution(boards, k, mid)) {
    			result = mid;
    			end = mid - 1;
    		} else {
    			start = mid + 1;
    		}
    	}
    	
    	return result;
    }

	private static boolean isPossibleSolution(ArrayList<Integer> boards, int k, int mid) {
		int painter = 1;
		int tempSum = 0;
		
		for (Integer board : boards) {
			if(tempSum + board <= mid) {
				tempSum += board;
			} else {
				painter++;
				
				if(painter > k || board > mid) return false;
				
				tempSum = board;
			}
		}
		
		return true;
	}

}
