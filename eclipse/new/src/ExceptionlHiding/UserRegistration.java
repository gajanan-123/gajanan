package ExceptionlHiding;

import java.util.Scanner;

public class UserRegistration {
	
	String username,country,india;
	int age;
	
	Scanner input=new  Scanner(System.in);
	
	
	void userregistration() throws InvalidCountryNameException,InvalidAgeException{
		
		System.out.println("enter user name");
		username=input.next();
		
		System.out.println("user's country");
		country=input.next();
		
		System.out.println("user's age");
		age=input.nextInt();
		
		
		
		if( country.equalsIgnoreCase(india));
		
		{
			throw  new  InvalidCountryNameException("invalid country");
			
		}
		else {
			System.out.println("congrats .... user belongs to india");
		}
		
		if (age<18) {
			
			throw new InvalidAgeException("invalid age");
			
		}
		
		else {
			System.out.println(" user is valid ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
