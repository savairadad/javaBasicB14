package classtwoDArray;

public class Task10 {

	public static void main(String[] args) {
		
		
		int[]secondlargestnum= {200,300,400};
		int highest=0;
		int secondlargest=0;
		
		for (int i=0;i<secondlargestnum.length;i++)
			if(secondlargestnum[i]>highest) {
				secondlargest=highest;
				highest=secondlargestnum[i];
			}
			else if ( secondlargestnum[i] > secondlargest) {
				secondlargest=secondlargestnum[i];
				
			}
			System.out.println(secondlargest);
		
		
		
		
		
	}

}
