package ExceptionlHiding;

import java.util.Scanner;

public class Arthamtic1 {
	
	int result;
	
	int num1,num2;
	
	Scanner input = new Scanner (System.in);
	
	public void method1 (){
		
		System.out.println("enter the first integer");
		num1=input.nextInt();
		
		System.out.println("enter the secound integer");
		num2=input.nextInt();
	
        try {  result  =num1/num2;}
        
        catch(ArithmeticException ee) {
        	System.out.println("infinet");
        }
        
	int  result=0;

	System.out.println("result  =  "+result);
	
	
	
	}

      
         	 
		 
	
	public void method2() {
		method1();
	}
	
	public void method3() {
		method2();
	}
	
	
	
	

}

	
	
	
	
	


