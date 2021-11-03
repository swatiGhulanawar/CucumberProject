package com.modifiers1;

import com.modifiers.AccessModifiers; 

public class AccessMpdifiDemo extends AccessModifiers { //defualt class can not be imported

	public static void main(String[] args) {
		
		AccessMpdifiDemo demo = new AccessMpdifiDemo();
		demo.demo1(); //demo1 is private
	}

}
