package ExceptionlHiding;

import java.util.Scanner;

public class Throw {
  void voting() {
	  
	  
	  
	Scanner sc = new Scanner (System.in);  
	int age;
	System.out.println(" enter age");
	age= sc.nextInt();
	
	if (age<18) {
		
		throw new ArithmeticException ( "not valid ");}
		else 
		{
			System.out.println(" welcome to vote ");
		}
	
	
	
	System.out.println(" hfd");
	
	}
  
	
	
	
	
	
	
	
	
}
