package constractor;

import java.util.Scanner;

public class AddAmount {

	public static void main(String[] args) {
		/*
		 *  6t89turyry
		 */
		int amount=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("do you want add amount in your account");
		char ans= sc.next().charAt(0);
		
		
		if (ans=='y') {
			
			System.out.println("enter the amount you want to add");
			
			amount=sc.nextInt();
			Bank bank= new Bank(amount);
				
			bank.display();
			
			
		}
		else {
			Bank bank1=new Bank();
			bank1.display();
			
			
			
		}
		
		
		
		
		
		
	}

}
