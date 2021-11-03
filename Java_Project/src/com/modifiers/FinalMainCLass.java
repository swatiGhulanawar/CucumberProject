package com.modifiers;

public class FinalMainCLass {
//final class FinalMainCLass { The class cannot be inherited by other classes

	public void canFinalClassExtends() {
		System.out.println("The class cannot be inherited by other classes");
	}
}
/*
* For classes, you can use either final or abstract:
* final The class cannot be inherited by other classes
abstract The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.

For attributes and methods, you can use the one of the following:
final Attributes and methods cannot be overridden/modified
static Attributes and methods belongs to the class, rather than an object
abstract Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
*/