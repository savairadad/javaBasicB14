package homeworks;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		
		
	Scanner scan=new Scanner(System.in);	
		
		System.out.println("what is your city name");
		String city=scan.next();
		
		System.out.println("what is the temp of your city in fahrenheit");
		double tempfarhrenheit=scan.nextDouble();
		
		double temperaturecelsius=(tempfarhrenheit-32);
		
		System.out.println("the tempearture in "  +city+ " is "+temperaturecelsius + " celsius" );
		

	}

}
