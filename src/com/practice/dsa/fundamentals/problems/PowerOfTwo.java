package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean result = isPowerOfTwo3(n);
		
		System.out.println(result);
		
		scanner.close();
	}

    public static boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        
        while(n > 0) {
        	if(n == 1) break;
        	
        	if((n % 3) != 0) return false;
        	
        	n = n / 3;
        }
        
        return true;
    }
    
    // Follow up: solving without loops/recursion
    public static boolean isPowerOfTwo2(int n) {
    	// 16 - 10000
    	// 15 - 01111
    	
    	return n > 0 && ((n & (n - 1)) == 0);
    }
    
    public static boolean isPowerOfTwo3(int n) {
    	int product = 1;
    	
    	for (int i = 0; i < 31; i++) {
    		if(n == product) return true;

			product *= 2;
		}
    	
    	return false;
    }
    
    
    // Also if number of set bits = 1 then it is power of 2
    
}
