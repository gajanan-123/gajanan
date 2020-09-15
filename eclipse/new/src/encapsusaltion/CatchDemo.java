package encapsusaltion;

import java.util.Scanner;

public class CatchDemo {

	
	
	void method1() {
		
		
		int array1[]=new int[5];
		
		array1[0]=32;
		array1[1]=5;
		array1[2]=52;
		array1[3]=72;
		array1[4]=82;
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]); }
		
		public void method2() {
			
			
			
			
			int array2[]=new int[5];
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the element in array");
			
			for (int i=0;i<5;i++) {
				
				array2[i]= input.nextInt();
			}
		System.out.println("entered  element are ");
		for(int i=0;i<5;i++) {
			System.out.println("element is  ="+array2);
			
		}
		
		int result;
		
		try
		{
			result=(array2[1]/array2[2]);
			
			System.out.println("result ="+result);
			System.out.println(array2[12]);
		}
		catch(ArithmeticException r) {
			System.out.println("infinite");
		}
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	


