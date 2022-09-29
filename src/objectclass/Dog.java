package objectclass;

public class Dog {

	String color;
	String breed;
	String name;
	
	void bark() {
		System.out.println("always barking");
	}
	void play() {
		System.out.println(" playing with other dogs");
	}
	public static void main(String[] args) {
		
		Dog husky=new Dog();
		husky.name="puppy";
		husky.color="White";
		husky.breed="long";
		System.out.print("his name is  " +husky.name+ " and his color is  " +husky.color+ " and he is ");
		husky.bark();
		
		
		Dog labrador=new Dog();
		labrador.name="lio";
		labrador.color="brown";
		labrador.breed="short";
		
		System.out.print("his name is " +labrador.name+ " and his color is "+labrador.color+ " and he is ");
		labrador.play();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
