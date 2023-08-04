package com.practice.dsa.fundamentals.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllDuplicatesInArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		List<Integer> duplicates = findDuplicates(array);
		System.out.println(duplicates);
		
		scanner.close();
	}
	
    public static List<Integer> findDuplicates(int[] nums) {
    	List<Integer> list = new ArrayList<Integer>();
    	int[] temp = new int[nums.length];
    	
    	for (int num : nums) {
			int value = temp[num - 1] == 0 ? num : -num;
			if(value < 0) list.add(num);
			temp[num - 1] += value;
		}
    	
    	return list;
    }

}
