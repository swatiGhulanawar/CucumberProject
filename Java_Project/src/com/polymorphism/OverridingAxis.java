package com.polymorphism;

public class OverridingAxis extends OverridingSBI {
	public void getRateOfIntrest() {
		System.out.println("Rate of intrest is: 8");
	}
	public static void main(String[] agrs) {
		OverridingAxis rateOfIntrest = new OverridingAxis();
		rateOfIntrest.getRateOfIntrest();
		OverridingSBI  rateOfIntrestForSBI = new OverridingSBI();
		rateOfIntrestForSBI.getRateOfIntrest();
	}

}

/*Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).*/