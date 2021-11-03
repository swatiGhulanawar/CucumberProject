package com.Java_Basics;

public class DataTypes {

	public static void main(String[] args) {
		/*Primitive data types - includes byte, short, int, long, float, double, boolean and char
		Non-primitive data types - such as String, Arrays and Classes*/
		
		//data_typ var_name = value
		byte a = 20;
		System.out.println("Byte value is: "+(a));
		short b = 30000;
		System.out.println("Short value is: "+b);
		int c = 75;
		System.out.println("Integer value is: "+c);
		long d = 6757685768l;
		System.out.println("Long value is: " +d);
		float e = 2790.8675474657f; //fractional value stored in float 
		System.out.println("Float value is:" +e);
		double f = 8767.598d;
		System.out.println("Double value is: "+f );
		boolean g = true;
		System.out.println("Boolean value is: "+g);
		char h ='a';
		System.out.println("Char value is:" +h);
		
	}

}

/*DataType Size Description
byte 1 byte Stores whole numbers from -128 to 127
short 2 bytes Stores whole numbers from -32,768 to 32,767
int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean 1 bit Stores true or false values
char 2 bytes Stores a single character/letter or ASCII values*/