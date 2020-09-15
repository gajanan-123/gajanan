package basic01;
import java.util.Scanner;
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int basic,gross, hr,da;
System.out.println("the basic salary of employed");

Scanner input=new Scanner(System.in);

basic=input.nextInt();
if(basic<=10000) {
	hr=(10000*20)/100;
	da=(10000*80)/100;}
	
	
	else if(basic<=200000)
	{   hr=(20000*20)/100;
	    da= (20000*80)/100;
	}

	else {
		hr=(250000*20)/100;
		da=(250000*80)/100;
		
	}

    gross=hr+da+basic;
    
    
    System.out.println("the grosssalary of employed="+gross);
}
	}


