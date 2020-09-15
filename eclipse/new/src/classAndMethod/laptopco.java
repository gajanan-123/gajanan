package classAndMethod;

import java.util.Scanner;

public class laptopco
     { double number1,number2;
     
     Scanner cal=new Scanner(System.in);
	
	public void screen()
	{ 
		System.out.println("   WELCOME  ");
		System.out.println("enter the value of number1");
		number1=cal.nextDouble();
		
		System.out.println("enter the value of number2");
		number2=cal.nextDouble();
		
		
	}
      public void optiondisplay() {
    	  
    	  System.out.println("Enter option");
    	  System.out.println("1.Add");
    	  System.out.println("2.substraction");
    	  System.out.println("3. multiply");
    	  System.out.println("4.Quit");
      }
	
	public void options() { 
		double result;  
	   int options = 1;
	   while (options<=4) { 
		   optiondisplay();
		   System.out.println("enter option");
		   options= cal.nextInt();
		   
		   switch(options) {
		     
		   case 1: result = number1+ number2;
		   System.out.println("addition of number1 and muner2 is="+result);
		   break;
		   case 2: result = number1-number2;
		   System.out.println("substraction of number1 and muner2 is="+result);
		   break;
		   case 3: result = number1*number2;
		   System.out.println("multyfy of number1 and muner2 is="+result);
		   break;
		   case 4:
		   System.out.println("now quit.....");
		   break;
		   }
		  
	}

	
	
	}
		
		
		
		
	}
	
	

