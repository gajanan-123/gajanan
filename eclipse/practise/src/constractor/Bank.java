package constractor;

public class Bank {
	
	int amount=5000;
	
	
	Bank(){
		
		
		System.out.println("do you want to add amount in your account");
		
		
	}
	
	Bank(int amount) {
		
		this.amount=this.amount+amount;
		
		System.out.println("the amount in "+amount+"has been creadited in your account");
	}
	
	void display()
	{
		System.out.println("the totoal amount in your account is ="+amount);
	}
	
	
	
	
	
	
	
	

}
