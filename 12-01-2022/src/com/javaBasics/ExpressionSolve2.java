package com.javaBasics;

public class ExpressionSolve2 {

	public static void main(String[] args) {
	
		int a=5;
		int expression= (17 - 8 / 4 * 2 + 3 - ++a);
		
		/**17 - 8 / 4 * 2 + 3 - 6
		 * 
		 * 17 - 2 * 2 + 3 - 6
		 * 
		 * 17 - 4 + 3 - 6
		 * 
		 * 20 - 4 - 6
		 * 
		 * 10
		 */
		
		System.out.println("Given Expression: 17 - 8 /4 * 2 +3 - ++a");
		System.out.println("Solved Expression: "+expression);
				

	}

}
