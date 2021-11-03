package com.Java_Basics;

public class Type_Casting_Demo {

	public static void main(String[] args) {
		byte a=12;
		System.out.println(a+ " is byte value");
		float b =a;
		System.out.println(b);//widening
		
		double c= 12.33;
		System.out.println(c);
		int d =(int)c;
		System.out.println(d);
		
		long l =92333l;
		System.out.println(l);
		float m=l;
		System.out.println(m);
		
		short s=3245;
		System.out.println(s);
		byte b1= (byte)s;
		System.out.println(b1);
		
		int i = 40983;
		System.out.println(i);
		short s1=(short)i;
		System.out.println(s1);
	}

}
/*Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
double -> float -> long -> int -> char -> short -> byte*/