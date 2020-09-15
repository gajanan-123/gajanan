package classAndMethod;

import java.util.Scanner;

public class bonus {
	float salary, bonus;
    
    
	Scanner sc= new Scanner( System.in);
	
	public void salaryinput() {
		
		System.out.println("enter the salary of employe");
		
		salary= sc.nextFloat();
		
	}

	public void calculation() {
		float year, totalsalary;
		System.out.println("enter the year of service ");
		year=sc.nextFloat();
		
		
		if  (year>=5) {
			
			 bonus=(salary*35)/100;
			totalsalary= salary + bonus;
		}
		
		else {
			
			bonus= (salary*15/100);
			totalsalary= salary + bonus;
			
		}
		 System.out.println("total salary of employe="+totalsalary);
	}
	

}
