package com.javaBasics;

import java.util.Scanner;

public class AreaofaCircle {

	public static void main(String[] args)
	{
		final double pi=3.14;
		double rad,area;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		rad=s.nextDouble();
		
		area=pi*rad*rad;
		
		System.out.println("----------");
		System.out.println("The Area of a Circle is "+area);
		
		s.close();
	}

}
