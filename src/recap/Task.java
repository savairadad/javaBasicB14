package recap;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("tell me from where are you");
		String country=scan.nextLine();
		String favfood;
		
		
		switch(country) {
		
		
		case "usa":
			favfood="burgers and fries";
			break;
			
		case "kazakhastan":
			favfood="beshparmak";
			break;
		
		case "turkey":
			favfood="adnan kabab";
			break;
		case "india":
			favfood="chicken curry";
			break;
		case "yemen":
			favfood="mandi";
			break;
			default:
			favfood="unlnown";
			break;}
		
		System.out.println("You are from country " +country+ " and your fav food is "  +favfood);
		
		
		
	}

}
