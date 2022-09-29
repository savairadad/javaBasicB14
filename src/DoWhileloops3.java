import java.util.Scanner;

public class DoWhileloops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner(System.in);
	int secret=900;
	int guess;
	
	do {
		System.out.println("please guess the secret number");
		guess=scan.nextInt();
	}
		while(guess!=secret);		
		
	System.out.println("you won");
		
		
		

	}

}
