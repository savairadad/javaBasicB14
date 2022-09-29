package objectclass;

class Phone {

	String color;
	String model;
	int size;
	double price;
	
	void call() {
		System.out.println("Phone is ringing");
	}
	void message() {
		System.out.println("it can send messages also");
	}
	
	public static void main(String[] args) {
		
		Phone iphone=new Phone();
		
		iphone. color="white";
		iphone. model="12promax";
		iphone.size=6;
		iphone.price=14.00;
		
		System.out.print("i have a " +iphone.model+" in " +iphone.color+ " color  and ");
		iphone.call();
		
		
		Phone samsung=new Phone();
		samsung.color="Black";
		samsung.model="latest";
		
		
		System.out.print("i dont have " +samsung.color+ " samsung " +samsung.model+ " with me ");
		samsung.message();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
