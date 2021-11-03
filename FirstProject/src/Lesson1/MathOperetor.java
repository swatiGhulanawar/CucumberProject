package Lesson1;

import java.util.Scanner;

public class MathOperetor {

	public static void main(String[] args) {
		double a=10;
		double b=3;
		double ans;
		//addition operation
		ans =a+b;
		System.out.println(ans);
		
		//multiplication
		ans=a*b;
		System.out.println(ans);
		
		//substraction
		ans =a-b;
		System.out.println(ans);
		
		//division
		/*
		 * 10 is the dividend, 3 is divisor and 5 is the quotient in this
		 */
		ans = a/b;
		System.out.println(ans); 
		
		//modulas
		/*
		 * this gives the reminder
		 */
		ans=a%b;
		System.out.println("answer is: " +ans); //+ sign in this is concatenate operator
		
	}

}
