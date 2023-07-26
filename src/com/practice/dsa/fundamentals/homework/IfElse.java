package com.practice.dsa.fundamentals.homework;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character to be checked");
		char ch = scanner.next().charAt(0);
		
		if(ch >= 97 && ch <= 122) System.out.println("This is lowercase");
		else if(ch >= 65 && ch <= 90) System.out.println("This is Uppercase");
		else if(ch >= 48 && ch <= 57) System.out.println("This is numeric");
		else System.out.println("Some other character");
		
		scanner.close();
	}

}
