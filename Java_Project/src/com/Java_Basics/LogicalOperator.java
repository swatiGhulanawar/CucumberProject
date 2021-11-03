package com.Java_Basics;

public class LogicalOperator {

	public static void main(String[] args) {
		int var1= 22;
		int var2 = 33;
		System.out.println(var1<var2);
		System.out.println(var1<10);
		System.out.println(var1>20 && var2<20); //&& AND operator
		System.out.println(var1>20 || var2<20); //|| OR operator

	}

}
/*Java Logical Operators

Operator Name Description Example
&& Logical and Returns true if both statements are true x < 5 && x < 10
|| Logical or Returns true if one of the statements is true x < 5 || x < 4
! Logical not Reverse the result, returns false if the result is true !(x < 5 && x < 10)*/