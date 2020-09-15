package oppSystem;

import java.util.Scanner;

public class Worker {
	
	String name, address;
	int   salary,  phonenumber,age, da, hra;
	
	
	Scanner input = new Scanner (System.in);
	void displaySalary() {
		
		System.out.println("Enter name of employee");
		 name=input.next();
		 
		 System.out.println("Enter the address of employee");
		 address= input.next();
		 
		 System.out.println("Enter the age of employee");
		 age= input.nextInt();
		 
		 System.out.println("Enter the phonenumber of employee");
		 phonenumber=input.nextInt();
		 
		 System.out.println("Enter the da of employee");
		 da = input.nextInt();
		 
		 System.out.println("Enter the  hra of employee");
		 hra= input.nextInt();
		 
		 
		 
		 
		 salary=da+hra;
		 System.out.println("the salary of employee=");
		 salary=input.nextInt();
		 
		
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
	
	

}
