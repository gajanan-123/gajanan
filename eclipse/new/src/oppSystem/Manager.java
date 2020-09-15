package oppSystem;

import java.util.Scanner;

public class Manager  extends Employee {

	Scanner input= new Scanner(System.in);
	
	String department;
	void department() {
		
		
		System.out.println(" enter department of employee");
		
		department=input.next();
	}
	
	
	
}
