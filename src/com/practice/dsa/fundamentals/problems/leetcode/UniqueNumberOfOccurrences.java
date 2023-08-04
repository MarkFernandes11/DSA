package com.practice.dsa.fundamentals.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumberOfOccurrences {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		boolean isUnique = uniqueOccurrences(array);
		System.out.println(isUnique);
		
		scanner.close();
	}
	
    public static boolean uniqueOccurrences(int[] arr) {
    	HashMap<Integer, Integer> occuranceMap = new HashMap<>();
    	
    	for (int num : arr) {
			occuranceMap.put(num, occuranceMap.getOrDefault(num, 0) + 1);
		}
    	
    	HashSet<Integer> countSet = new HashSet<>(occuranceMap.values());
        
    	return countSet.size() == occuranceMap.size();
    }	

}
