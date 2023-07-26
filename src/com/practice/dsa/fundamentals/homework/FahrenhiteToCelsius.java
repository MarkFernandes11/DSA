package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class FahrenhiteToCelsius {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temp in farhenite");
		float fahrenhite = scanner.nextFloat();
		
		float degreeCelsius = ((fahrenhite - 32) * 5 )/ 9;
		
		System.out.println(fahrenhite + "F = " + degreeCelsius +  "⁰C");
		
		scanner.close();
	}

}
