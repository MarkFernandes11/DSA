package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class ComplementOfBase10Integer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int result = bitwiseComplement3(n);
		System.out.println(result);
		
		scanner.close();
	}
	
	// Leetcode approach
    public static int bitwiseComplement(int n) {
    	String binary = Integer.toBinaryString(n);
    	
    	int result = 0;
    	int power = 0;
    	
    	for (int i = binary.length() - 1; i >= 0; i--, power++) {
    		Character oldChar = binary.charAt(i);
    		
    		if(oldChar.equals('0')) {
    			result += Math.pow(2, power); 
    		}    		
		}

    	return result;
    }

    // My approach
    public static int bitwiseComplement2(int n) {
    	// 1. Convert the IP to Binary
    	StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
    	
    	// 2. Invert all the bits of converted no
    	for (int i = 0; i < binary.length(); i++) {
    		Character oldChar = binary.charAt(i);
    		Character newChar = oldChar.equals('1') ? '0' : '1';
    		
    		binary.replace(i, i+1, newChar.toString());
		}
    	
    	// 3. Return decimal value of inverted no
    	return Integer.parseInt(binary.toString(), 2);
    }

	// Using bit operators
    public static int bitwiseComplement3(int n) {
    	if(n == 0) return 1;
    	
    	int mask = 0;
    	int inverse = ~n;
    	
    	// Left shift is nothing but multiplying by 2
    	// Right shift is nothing but dividing by 2
    	
    	while(n != 0) {
    		mask = (mask << 1) | 1; // mask = (mask << 1) | 1;
    		n = n >> 1;
    	}
    	
    	return inverse & mask; 
    }
}
