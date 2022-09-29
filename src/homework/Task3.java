package homework;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("please enter two numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	
	System.out.println("Enter operators");
	char operator=scan.next().charAt(0);
	int num3=0;
		
		switch (operator) {
		
		case '+':
		num3=num1+num2;
		break;
		
		case '-':
			num3=num1-num2;
			break;
			
		case '*':
			num3=num1*num3;
			break;
		case '/':
			num3=num1/num2;
			break;
			default:
		}
			
	System.out.println("Result of two numbers  is  " +num3);
		
		
		
		
		
		
		
		
		

	}

}
