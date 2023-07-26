package com.practice.dsa.fundamentals;

import java.util.Scanner;

public class ConditionalsAndLoops {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------Conditionals-------------");
		System.out.println("Enter value of a");
		int a = scanner.nextInt();
		System.out.println("Enter value of b");
		int b = scanner.nextInt();
		
		System.out.println("Using If's");
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		} 
		
		if(a < b) {
			System.out.println(a + " is smaller than " + b);
		}
		
		System.out.println("Using If else");
		if (a > b) {
			System.out.println(a + " is greater than " + b);
		} else {
			System.out.println(a + " is smaller than " + b);
		}
		
		System.out.println("Using If-else if-else");
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		if(num > 0) System.out.println(num + " is positive");
		else if(num < 0) System.out.println(num + " is negative");
		else System.out.println(num + " is zero");
		
		int c = 2;
		int d = c+1;
		
		if((c=3) == d) {
			System.out.println(c);
		} else {
			System.out.println(c+1);
		}
		
		System.out.println("-----------Printing using for loop-------------");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n-----------Printing using  while loop-------------");
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		
		scanner.close();
	}

}
