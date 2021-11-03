package com.encapsulation;

public class EncapsulationDemo {

	//public String name; //data is not secure

	private String Myname;

	public String getName() { // to get value from variable
		return Myname;
	}

	public void setName(String name) { // to set the variable value
		this.Myname = name;
	}

}

/*
 * Encapsulation The meaning of Encapsulation, is to make sure that "sensitive"
 * data is hidden from users. To achieve this, you must:
 * 
 * declare class variables/attributes as private provide public get and set
 * methods to access and update the value of a private variable
 * 
 */