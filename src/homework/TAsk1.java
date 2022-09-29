package homework;

import java.util.Scanner;

public class TAsk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner(System.in);
System.out.println(" Enter your country name");
String countryname=scan.nextLine();
	String language = null;
	
	switch (countryname) {
	
	case "Paksitan":
		language= "Urdu";
		break;
		
	case "India":
		language="Hindi";
		break;
	
	
	case "Afghanistan":
		language="Pashto";
		break;
		
	case "UAE":
		language="Arabic";
		break;
		
	case "USA":
		language="English";
		break;
	default:}
	
	System.out.println("You are from " +countryname+ " you speak " +language);
	
	
	
		
		
		
		
		
		
		
	}

}
