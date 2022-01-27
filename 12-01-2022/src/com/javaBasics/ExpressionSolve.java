package com.javaBasics;

public class ExpressionSolve {

	public static void main(String[] args) 
	
	{
		int expression=(100 + 56 - 13 % 5 + 16 / 4 + 5 % 2);
			
			/** take the expression and solve according to associativity
			 * 
			 *  100 + 56 - 13 % 5 + 16 / 4 + 5 % 2
			 * 
			 *  100 + 56 - 3 + 16 / 4 + 1
			 *  
			 *  100 + 56 - 3 + 4 + 1
			 *  
			 *  161 - 3
			 *  
			 *  158
			 */
		
		System.out.println("The given expression: 100 + 56 - 13 % 5 + 16 / 4 + 5 % 2");
		System.out.println("The solved expression: "+expression);
		

	}

}
