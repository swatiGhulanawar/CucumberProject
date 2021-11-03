package com.conditionBlocks;

public class SwitchDemo {
	public static void main(String[] args) {
		// code formating for System.out.println = sysout+ctrl+space
		// code formating shortcut ctrl+shift+f
		int day = 5;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursady");
			break;
		default:
			System.out.println("Saturday");
			break;
		}
	}

}
/*
 * switch(expression){ case value1: //code to be executed; break; //optional
 * case value2: //code to be executed; break; //optional ......
 * 
 * default: code to be executed if all cases are not matched; }
 */

/*
 * switch(expression) { case x: // code block break; case y: // code block
 * break; default: // code block }
 */
/*
 * The switch expression is evaluated once. The value of the expression is
 * compared with the values of each case. If there is a match, the associated
 * block of code is executed.
 */