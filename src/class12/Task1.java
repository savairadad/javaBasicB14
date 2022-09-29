package class12;

public class Task1 {

	public static void main(String[] args) {
		
		
		String username="user1";
		String password="pass123";
		String confirmpassword="pass123";
		if(username.isEmpty() && password.isEmpty()) {
			System.out.println("username and password cannot be empty");
		}else if (password.length()<8) {
			System.out.println("password is too short");
		}else if (password.contains(username)) {
			System.out.println("Password cannot contain username");
		}else if (password.equals(confirmpassword)) {
			System.out.println("password do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
