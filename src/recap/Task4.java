package recap;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in);
		System.out.println("what is your current time");
		int hour=scan.nextInt();
		
		if(hour>=1 && hour<=11) {
			System.out.println("morning");
		}
		else if (hour<=12 && hour>=15) {
			System.out.println("afternoon");
		}
		else if (hour>=16 && hour<=20) {
			System.out.println("evening");
		}
		else if (hour>=21 && hour<=24) {
			System.out.println("night");
		}
		
		
		
		
		
		
	}

}
