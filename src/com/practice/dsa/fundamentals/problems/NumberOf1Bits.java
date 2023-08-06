package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class NumberOf1Bits {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int result = hammingWeight(n);
		System.out.println(result);
		
		scanner.close();
	}

    public static int hammingWeight(int n) {    	
        int numberOf1Bits = 0;
        char[] array = String.valueOf(n).toCharArray();
    	
        for (int i = array.length - 1; i >= 0; i--) {
			if(array[i] == '1') numberOf1Bits++;
		}
        
    	return numberOf1Bits;
    }
    
//    public static int hammingWeight2(int n) {    	
//        int numberOf1Bits = 0;
//        
//        while(n != 0) {
//        	int digit = n & 1;
//        	
//        	if(digit == 1) numberOf1Bits++;
//        	
//        	n /= 2;
//        }
//        
//    	return numberOf1Bits;
//    }
}
