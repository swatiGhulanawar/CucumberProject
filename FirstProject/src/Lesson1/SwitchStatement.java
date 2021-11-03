package Lesson1;

public class SwitchStatement {

	public static void main(String[] args) {
			int score =70;
			
			switch(score)
			{
			case 90:
				System.out.println("Very good");	
				break; //if the break is not given then all the print statements will be printed
				
			case 80:
				System.out.println("Good");
				break;
				
			case 70:
				
				System.out.println("passed");
				break;
				
			default:
				System.out.println("Not mentioned the grade");
				
			}
			
				
	}

}
