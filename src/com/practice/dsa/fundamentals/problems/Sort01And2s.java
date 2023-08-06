package com.practice.dsa.fundamentals.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Sort01And2s {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter elements of array");
		String arrayString1 = scanner.nextLine();

		int[] array = Arrays.stream(arrayString1.split("\\s+")).mapToInt(Integer::parseInt).toArray();

		sort(array);
		System.out.println(Arrays.toString(array));

		scanner.close();
	}
//	1 0 2 1 2 0 1 0 2
//	0 0 0 1 1 1 2 2 2

	private static void sort(int[] array) {
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0) zeros++;
			else if(array[i] == 1) ones++;
			else twos++;
		}
		
		int j = 0;
		while(j < array.length) {
			while(zeros-- > 0) array[j++] = 0;
			
			while(ones-- > 0) array[j++] = 1;
			
			while(twos-- > 0) array[j++] = 2;
		}
	}

}
