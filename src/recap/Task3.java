package recap;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner scan=new Scanner(System.in);	
		
		
		System.out.println("enter a number");
		int number=scan.nextInt();
		
		
		if(number>=1 && number<=10) {
			System.out.println("the number is small");
		}
		else if (number>11 && number<=100) {
			System.out.println("the number is medium");
		}
		else if (number>101 && number<=1000) {
			System.out.println("this number is large");
		}
		
		
		
	}

}
