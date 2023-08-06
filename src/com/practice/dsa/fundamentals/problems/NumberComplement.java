package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class NumberComplement {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int result = findComplement(n);
		System.out.println(result);
		
		scanner.close();
	}

    public static int findComplement(int num) {
        String binary = Integer.toBinaryString(num);

        int result = 0;
        int power = 0;

        for(int i = binary.length() - 1; i >= 0; i--, power++) {
            if(binary.charAt(i) == '0') {
                result += Math.pow(2, power);
            }
        }

        return result;
    }
}
