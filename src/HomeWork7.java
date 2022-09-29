import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("how many year you worked");
		int years=scan.nextInt();
		
		if (years>5) {
			System.out.println("your are eligible for the bounus.");
		}
		 {
			System.out.println("please enter your salary");
			double salary=scan.nextDouble();
		
		if (salary>50000) {
			System.out.println("you will get the bounus 5000");
		}else {
			System.out.println("you will get the bouns 3000");
		}
		
		}
		
		
	}

}
