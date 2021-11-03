package Lesson1;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * evaluate more than one statement in single if statement is done by logical operator
		 */
		
		int sub1 = 40;
		int sub2 = 20;
		
		if (sub1 >=35 && sub2 >=40) // && AND operator   || OR operator 
			System.out.println("Student had passes sub1 with " +sub1+ " and also sub2 with" +sub2);
		else {
			System.out.println("Failed");
		}
	}

}
