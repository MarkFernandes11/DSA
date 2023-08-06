package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decimal = scanner.nextInt();
		
		String binary = convertToBinary(decimal);
		System.out.println(binary);
		
		scanner.close();
	}
	
    public static String convertToBinary(int n) {
    	StringBuilder binary = new StringBuilder();
    	
    	while(n != 0) {
    		int bit = n % 2;
    		
    		if(binary.isEmpty()) binary.append(bit);
    		else binary.insert(0, bit);
    		
    		n = n/2;
    	}
    	
    	return binary.toString();
    }

    // Using Inbuilt method
    public static String convertToBinary2(int n) {
    	return Integer.toBinaryString(n);
    }
    
    // Using bit manipulation
    public static String convertToBinary3(int n) {
    	int binary = 0;
    	int power = 0;
    	
    	while(n != 0) {
    		int bit = n & 1;
    		
    		binary = (int)(bit * Math.pow(10, power)) + binary;
    		
    		power++;
    		n = n >> 1;
    	}
    	
    	
    	return String.valueOf(binary);
    }
}
