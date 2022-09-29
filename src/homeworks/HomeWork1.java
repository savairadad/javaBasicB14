package homeworks;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
		
	System.out.println("do you have a diploma");	
		boolean haveDiploma=scan.nextBoolean();
		
	if(haveDiploma) 
	{
		
		System.out.println("congraulations");
	System.out.println("please eneter your gpa score");
	double gpaScore =scan.nextDouble();
	
	
	if(gpaScore>=3.5) {
		
		System.out.println("you are eligible for a scholarship");
		
		
	}else {
		
		System.out.println("you should have studied harder");
	}
	
 
		
		
	
		
	}
	
}
	}
