package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class PowerOfThree {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean result = isPowerOfThree(n);
		
		System.out.println(result);
		
		scanner.close();
	}

    public static boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        
        while(n > 0) {
        	if(n == 1) break;
        	
        	if((n & 1) == 1) return false;
        	
        	n = n >> 1;
        }
        
        return true;
    }
    
    // Follow up: solving without loops/recursion
    
}
