package com.javaBasics;

public class UnaryOperators {

	public static void main(String[] args) 
	{
		int num1 = 10, num2 = 70, ex1, ex2;
		boolean ex3 , ex4;
		
		ex1 = +num1;
		
		System.out.println(ex1);
		System.out.println("-----------");
		
		ex2 = -num2;
		
		System.out.println(ex2);
		System.out.println("-----------");
		
		ex3 = num2 < num1;
		
		System.out.println(ex3);
		
		ex4 = !ex3;
		System.out.println(ex4);
		
	}

}
