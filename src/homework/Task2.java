package homework;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your grade");
	String grade=scan.nextLine();
	String explanation = null;
	
	
	
	switch (grade) {
	
	case "A":
		explanation="Excellent";
		break;
		
	case "B":
		explanation="Good";
		break;
		
	case "C":
		explanation="Average";
		break;
	case "D":
		explanation=" Fair";
		break;
		default:
	}
	
	
	System.out.println("Your grade is " +grade+ "-"  +explanation);
	
	
	
	
	
	
		
		
		
		
		
	}

}
