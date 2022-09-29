package homeworks;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("please enter the mortage rate");
		double mortageRate=scan.nextDouble();
		
		if (mortageRate>4.5) {
			System.out.println("user is not interested in buying a house");
		}else {
			System.out.println("user is consdiers to buy a house");
			System.out.println("plase enetr the coast");
			double mortagePrice=scan.nextDouble();
			if (mortagePrice>200000) {
				System.out.println("user will take a loan");
			}
			else 
			{
				System.out.println("user will pay a cash");}
			
			
			
		
	}	
	}	
		
		
}	
		
	


