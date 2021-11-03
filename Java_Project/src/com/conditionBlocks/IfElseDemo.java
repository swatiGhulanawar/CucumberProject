package com.conditionBlocks;

public class IfElseDemo {
	
	public static void main(String[] args) {
		int time = 5;
		if(time<10) {
			System.out.println("It's a morning");
		}
		else if (time>40) {
			System.out.println("It's NOT morning");
		}
		else {
			System.out.println("Good Night");
		}
	
	//maks>65&& <80 then 1st class 	//makrks>35 then fail 	//marks >=35 then pass
	
	int marks = 80;
	
	if(marks>65 && marks<90) {
		System.out.println("First class");
	}
	else if(marks ==35) {
		System.out.println("Juts Pass");
		}
	else if(marks<35) {
		System.out.println("Better luck next time");
		
	}
  }

}


/*Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

Syntax

if (condition) {
// block of code to be executed if the condition is true
} else {
// block of code to be executed if the condition is false
}
*/