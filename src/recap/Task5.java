package recap;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in);
		System.out.println("what is your birth month");
		String month=scan.next();
		String seasonOfBirth;
		
		if (month.equals("March")) {
			seasonOfBirth="Spring";
			
		} else if(month.equals("july")) {
			seasonOfBirth="Summer";
		}
		else if(month.equals("september") || month.equals("october")|| month.equals("november")) {
			seasonOfBirth="Fall";
		}
		
		else if(month.equals("december")|| month.equals("january") || month.equals("feburary")) {
			seasonOfBirth="Winter";
		}
		
		else {
			seasonOfBirth="Invalid Month";
			}
		
		System.out.println("you are born in " +seasonOfBirth );
		
		
	}

}
