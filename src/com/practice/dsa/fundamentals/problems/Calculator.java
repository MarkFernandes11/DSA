package com.practice.dsa.fundamentals.problems;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputArray = input.split("\\s+");
		
		if(inputArray.length != 3) {
			System.out.println("Invalid input");
			return;
		}
		
		int num1 = Integer.parseInt(inputArray[0]);
		int num2 = Integer.parseInt(inputArray[1]);
		String operation = inputArray[2];
		
		switch (operation) {
		case "+": 
			System.out.println("Addition = " + (num1 + num2));
			break;
			
		case "-":
			System.out.println("Subtraction = " + (num1 - num2));
			break;
			
		case "/":
			if(num2 == 0) {
				System.out.println("Divide by 0 error");
				break;
			}
			
			System.out.println("Division = " + (num1 / num2));
			break;
			
		case "*":
			System.out.println("Multiplication = " + (num1 * num2));
			break;
			
		case "%":
			if(num2 == 0) {
				System.out.println("Divide by 0 error");
				break;
			}
			
			System.out.println("Addition = " + (num1 % num2));
			break;
			
		default:
			System.out.println("Invalid operation");
		}
		
		scanner.close();
	}

}
