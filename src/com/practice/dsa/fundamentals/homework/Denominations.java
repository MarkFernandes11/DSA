package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class Denominations {
	
	static int hundreds = 0;
	static int fifties = 0;
	static int twenties = 0;
	static int ones = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();

		usingIfElse(amount);
//		usingSwitch(amount);
		
		System.out.println("****************");
		System.out.println(hundreds + " Note/s of 100");
		System.out.println(fifties + " Note/s of 50");
		System.out.println(twenties + " Note/s of 20");
		System.out.println(ones + " Note/s of 1");
		System.out.println("****************");
		
		scanner.close();		
	}
	
	private static void usingIfElse(int amount) {
		while(amount > 0) {
			if(amount >= 100) {
				hundreds += amount/100;
				amount = amount % 100;
			} else if(amount >= 50) {
				fifties += amount/50;
				amount = amount % 50;
			} else if(amount >= 20) {
				twenties += amount/20;
				amount = amount % 20;
			} else {
				ones += amount/1;
				amount = amount % 1;
			}			
		}
	}

	private static void usingSwitch(int amount) {
		switch (amount) {
		case 100:
			hundreds += amount / 100;
			amount = amount % 100;
			if(amount == 0) break;

		case 50:
			fifties += amount/50;
			amount = amount % 50;
			if(amount == 0) break;
			
		case 20:
			twenties += amount/20;
			amount = amount % 20;
			if(amount == 0) break;
			
		case 1:
			ones += amount/1;
			amount = amount % 1;

		default:
			break;
		}
	}
	
}
