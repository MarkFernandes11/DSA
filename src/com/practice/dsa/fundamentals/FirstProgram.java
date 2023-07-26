package com.practice.dsa.fundamentals;

public class FirstProgram {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println("--------Data types----------");
		int a = 5;
		long ln = 10;
		byte b = -1;
		short sh = -1;
		float f = 0.1f; 
		double d = 1.56;
		char ch = 'a';
		boolean bool = true;
		
		System.out.println(a);
		System.out.println(ln);
		System.out.println(b);
		System.out.println(sh);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
		
		System.out.println("--------Type casting----------");
		int ab = 'a';
		char ch2 = 70;
		System.out.println(ab);
		System.out.println(ch2);
		
		System.out.println("--------Operators----------");
		int num1 = 400;
		int num2 = 600;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		System.out.println("--------Relational Operators----------");
		System.out.println("num1 > num2 = " + (num1 > num2));
		System.out.println("num1 < num2 = " + (num1 < num2));
		System.out.println("num1 >= num2 = " + (num1 >= num2));
		System.out.println("num1 <= num2 = " + (num1 <= num2));
		System.out.println("num1 == num2 = " + (num1 == num2));
		System.out.println("num1 != num2 = " + (num1 != num2));
		
		System.out.println("--------Bitwise Operators----------");
		System.out.println("num1 & num2 = " + (num1 & num2));
		System.out.println("num1 | num2 = " + (num1 | num2));
		
		// How negative no is stored in memory for num = -5
		// 1. Ignore the sign and convert the number to binary (101)
		// 2. Take 1's complement i.e. reverse the bits 11111111..010
		// 3. Add 1 to it 11111111..011
		// If the 1st digit is 0 then the number is +ve else it is -ve
		// If the number is negative it's 2's complement is stored in memory
		// and while printing 2's complement is again taken of the number stored in memory
		
	}

}
