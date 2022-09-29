package homeworks;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);	
		System.out.println("do you have a credit card or not");
		boolean card=scan.nextBoolean();
	
		
		if(card) {
			System.out.println("what is the balance on the card?");
			double amount=scan.nextDouble();
		
		if(amount>1000) {
			System.out.println("pay off immediately.");
		}else {
			System.out.println("you can spend more money.");
		}
		
		
		
		}	
		
		
		
		
	}

}
