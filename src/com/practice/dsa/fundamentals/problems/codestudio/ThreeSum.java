package com.practice.dsa.fundamentals.problems.codestudio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();

		System.out.println("Enter value to find triplet of");
		int num = scanner.nextInt();

		int[] array1 = Arrays.stream(arrayString1.split("\\s+")).mapToInt(Integer::parseInt).toArray();

		ArrayList<ArrayList<Integer>> result = findTriplets2(array1, array1.length, num);
		System.out.println(result);

		scanner.close();
	}

	// Time Complexity O(n^3)
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					if (arr[i] + arr[j] + arr[j2] == K) {
						result.add(getThreeSums(arr, i, j, j2));
					}
				}
			}
		}

		return result;
	}

	private static ArrayList<Integer> getThreeSums(int[] arr, int i, int j, int j2) {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(arr[i]);
		temp.add(arr[j]);
		temp.add(arr[j2]);

		Collections.sort(temp);

		return temp;
	}

	public static ArrayList<ArrayList<Integer>> findTriplets2(int[] nums, int n, int K) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (nums.length < 3) return result;
		Arrays.sort(nums);
		
		for (int i = 0; i < n - 2; i++) {
			
			if(i > 0 && nums[i] == nums[i - 1]) continue;
			
			int j = i + 1;
			int k = n - 1;
			
			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				
				if(sum == K) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					result.add(temp);
					
					// Skip duplicate elements for j and k
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
					
					j++;
					k--;
				} else if(sum < K) {
					j++;
				} else {
					k--;
				}
			}
		}

		return result;
	}

}
