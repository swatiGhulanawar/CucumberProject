package com.Java_Basics;

public class Opraters_Demo {

	public static void main(String[] args) {
		int a=12;
		int b=30;
		//int c = a+b;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);		
		
		int val1 =11;
		int val2 = 5;
		int val3 = val1 % val2;
		System.out.println(val3); //reminder will be the output for modules		
		
		int x = 5;
		int y = 5;
		System.out.println(x++); //post increment
		System.out.println("value of X is:" +x);
		System.out.println(++y); //pre-increment
		System.out.println("value of Y is:" +y);
		System.out.println(--y); //pre-decrement
		System.out.println("value of Y is:" +y);
		System.out.println(x--); //post decrement
		System.out.println("value of X is:" +x);
		
		
		
		int p=2;
		int q=3;
		System.out.println(p==q);
		System.out.println(p<q);
		System.out.println(p>q);
		System.out.println(p!=q);
		System.out.println(p%=q);
		System.out.println(p>=q);
		System.out.println(p<=q);		
		
	}

}
/*Arithmetic operators--> addition  of two no's
Assignment operators
Comparison operators
Logical operators*/


/*Arithmetic operators

+ Addition Adds together two values x + y
- Subtraction Subtracts one value from another x - y
* Multiplication Multiplies two values x * y
/ Division Divides one value by another x / y
% Modulus Returns the division remainder x % y
++ Increment Increases the value of a variable by 1 ++x
-- Decrement Decreases the value of a variable by 1 --x


*Assignment Operators

Operator Example Same As
= x = 5 x = 5
+= x += 3 x = x + 3
-= x -= 3 x = x - 3
*= x *= 3 x = x * 3
/= x /= 3 x = x / 3
%= x %= 3 x = x % 3 

Java Comparison Operators

Operator Name Example
== Equal to x == y
!= Not equal x != y
> Greater than x > y
< Less than x < y
>= Greater than or equal to x >= y
<= Less than or equal to x <= y
 
 */

