package recap;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in)	;
		System.out.println("please enter the day");
		int day=scan.nextInt();
		
		if(day>=3 && day<=5) {
			System.out.println("it is a weekday");
		}
		else if( (day>=4)||(day<=7)){
			System.out.println("it is a weekend");
		}
		
		else {
			System.out.println("its invalid");
		}
		
		
		
		
	}

}
