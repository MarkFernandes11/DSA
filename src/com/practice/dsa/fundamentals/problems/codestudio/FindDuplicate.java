package com.practice.dsa.fundamentals.problems.codestudio;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements of array");
		String arrayString = scanner.nextLine();
		
		int[] array = Arrays.stream(arrayString.split("\\s+"))
							.mapToInt(Integer::parseInt)
							.toArray();
		
		int duplicate = findDuplicate2(array);
		System.out.println(duplicate);
		
		scanner.close();
	}

	public static int findDuplicate(int[] array) {
		// 1. create a array of size array.length - 1
		int[] temp = new int[array.length - 1];
		int duplicate = 0;

		// 2. loop over main array and add value in created array. If value present the subtract it
		for(int num : array) {
			temp[num - 1] ^= num;
		}

		// 3. loop over created array and check for value = 0 then return its index + 1	
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] == 0) {
				duplicate = i + 1;
			}
		}
		
		return duplicate;
	}
	
//	4 2 1 3 5 7 8 4 6 9
	
	private static int findDuplicate2(int[] array) {
		int ans = 0;
		
		for (int i = 0; i < array.length; i++) {
			ans ^= array[i];
		}
		System.out.println(ans);
		
		for (int i = 1; i < array.length; i++) {
			ans ^= i; 
		}
		
		System.out.println(ans);
		
		return ans;
	}

}
