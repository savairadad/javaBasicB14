package loopjava;

import java.util.Scanner;

public class DoWhileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in);
	String answer;
	do {
		System.out.println("Did you get a job");
		answer=scan.nextLine();
	}
		while (!answer.equals("yes"));{
			System.out.println("congrates");
		}
		
		
		
		
		
	}

}
