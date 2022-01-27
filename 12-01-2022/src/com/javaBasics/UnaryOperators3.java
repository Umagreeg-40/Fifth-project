package com.javaBasics;

public class UnaryOperators3 {

	public static void main(String[] args) 
	{
		int num1 = 50, num2 = 16, num3 = 10, num4 = 3, ex1;
		
		ex1 = num2-- + --num4 + ++num3 + num1++ + num2++ - num4-- + ++num1;
		
		//16 + 2 + 11 + 50 + 15 - 2 + 52 = 144
		 
		 System.out.println(ex1);

	}

}
