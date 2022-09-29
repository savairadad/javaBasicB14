package class12;

import java.util.Scanner;

public class TAsk4 {

	public static void main(String[] args) {
		
		
	String nameMoM;
	String nameDad;
	String gender;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter name of Mom");
		nameMoM=scan.next();
		
		System.out.println("Enter name of Dad");
		nameDad=scan.next();
		System.out.println("who are you expecting, boy or girl");
		gender=scan.next();
		
		if(gender.equals("boy")){
			System.out.println(nameDad.substring(0, nameDad.length()/2)+ nameMoM.substring(nameMoM.length()/2));
		}
		else if (gender.equals("girl")) {
			System.out.println(nameMoM.substring(0,nameMoM.length()/2) + nameDad.substring(nameDad.length()/2));
		}
		
		
		
	}

}
