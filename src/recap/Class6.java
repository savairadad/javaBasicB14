package recap;

import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("what is your height in inches");
	int height=scan.nextInt();
	
	if(height<60) 
		System.out.println("You are short");
		
		else if(height>60 && height<70)
		
		System.out.println("you are medium");
		else if(height>72)
			System.out.println("you are tall");
	
	else {
		System.out.println("invalid");
	}
	
		
	}

}
