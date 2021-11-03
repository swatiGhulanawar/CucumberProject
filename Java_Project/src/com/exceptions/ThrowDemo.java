package com.exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		int age =10;
		if(age<20) {
			//System.out.println("Access denied");
			throw new ArithmeticException("Access denied"); //Customized exception

		}else {
			System.out.println("Access granted");
		}
	}

}
/*The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
*/