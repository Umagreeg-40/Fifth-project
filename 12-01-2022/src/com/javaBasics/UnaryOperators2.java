package com.javaBasics;

public class UnaryOperators2 {

	public static void main(String[] args) 
	{
		int num1 = 5, num2 = 6, num3 = 2, num4 = 3, ex1, ex2, ex3, ex4;
		
		ex1 = num1++; //post-increment
		
		System.out.println(ex1);
		System.out.println("===========");
		
		ex2 = ++num2; //pre-increment
		
		System.out.println(ex2);
		System.out.println("===========");
		
		ex3 = --num3; //pre-decrement
		
		System.out.println(ex3);
		System.out.println("===========");
		
		ex4 = num4--; //post-decrement
		
		System.out.println(ex4);
		System.out.println("===========");
	}

}
