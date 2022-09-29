package homeworks;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("welcome to the loan compamny");
		System.out.println("how much loan needed");
         double loanamount=scan.nextDouble();
		
		
		if(loanamount<=200000) {
			System.out.println("you are approved for the loan");
		}
		else {
			System.out.println("sorry you are rejected");
		}
			
		
		
		
		
		
		
		

	}

}
