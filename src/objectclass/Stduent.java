package objectclass;

public class Stduent {

	
	
	
	String name;
	int age;
	double weight;
	boolean isfunny;
	double height;
	boolean losinghairs;
	
	
	void study() {
		if (name.equals("Anna")) {
		System.out.println("I study hard");}
		else if(name.equals("Roman")) {
			System.out.println("I will keep on deleting mesgs");
		}
	}
	public static void main(String[] args) {
		
		
		Stduent person1=new Stduent();
		person1.name="Roman";
		person1.study();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
