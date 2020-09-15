package ExceptionlHiding;

import java.util.Scanner;

public class Arthamatic {
	
	
	int num1,num2;
	
	Scanner input = new Scanner (System.in);
	
	public void method1 (){
		
		System.out.println("enter the first integer");
		num1=input.nextInt();
		
		System.out.println("enter the secound integer");
		num2=input.nextInt();
		
   int result=num1/num2;
   
		System.out.println("result =  " +result);
		
		 
	}
	public void method2() {
		method1();
	}
	
	public void method3() {
		method2();
	}
	
	
	
	

}
