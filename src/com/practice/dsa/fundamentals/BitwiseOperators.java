package com.practice.dsa.fundamentals;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		
		System.out.println("----------Binary Operators----------------");
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
		System.out.println(a + " = " + (~a));
		
		System.out.println("----------Shift Operators----------------");
		System.out.println("17 >> 1 = " + (17 >> 1));
		System.out.println("17 >> 2 = " + (17 >> 2));
		System.out.println("19 << 1 = " + (19 << 1));
		System.out.println("21 << 2 = " + (21 << 2));
		
		System.out.println("----------Post and Pre increment Operators----------------");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		int i = 1;
		System.out.println(i-- > 0);
		
	}

}
