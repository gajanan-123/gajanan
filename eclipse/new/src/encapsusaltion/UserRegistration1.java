package encapsusaltion;

import java.util.Scanner;



public class UserRegistration1 {Scanner sc = new Scanner(System.in);

String userName,country;
int age;



void registerationProfile() throws InvalidOfCountryNameException,InvalidOfAgeException
{
	System.out.println("Enter userName: ");
	userName = sc.next();
	
	System.out.println("Enter Country: ");
	country = sc.next();//usa
	
	System.out.println("Enter age: ");
	age = sc.nextInt();
	
	

		
	
	if(country.equalsIgnoreCase("India") == false)
	{
    	throw new InvalidOfCountryNameException("Invalid Country");
	}
	else
	{
		System.out.println("User Belongs to India...Congrats");
	}
		




  if(age < 18)
  {
	  throw new InvalidOfAgeException("Invalid age");
  }
  else
  {
	  System.out.println("User's age is valid");
  }




}


}
