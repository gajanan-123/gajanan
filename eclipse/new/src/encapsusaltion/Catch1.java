package encapsusaltion;

import java.util.Scanner;

public class Catch1 {
	
	
	
	
	void method1()

{
	//arrays
	int arr1[] = {0,1,2,3,4};
	arr1[0] =8;
	arr1[1]=76;
	arr1[2] = 87;
	arr1[3] =34;
	arr1[4]  =98;
	
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	System.out.println(arr1[3]);
	System.out.println(arr1[4]);
    try{System.out.println(arr1[5]); //index out of bound
    
    }
    catch(java.lang.ArrayIndexOutOfBoundsException e ) {
    	System.out.println("please put valid digit");
    }
	
}


void method2()
{
	method1();
	int array2[] = new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter elements in array: ");
	
	for(int i=0;i<5;i++)
	{
		array2[i] = sc.nextInt();
	}
	
	System.out.println("Elements entered are: ");
	for(int i=0;i<5;i++)
	{
		System.out.println("element is : "+array2[i]);
	}
	
	//int result=0;
	
	try
	{
		//result = (array2[1]/array2[2]); //exception 1
		//System.out.println("Result is :"+result);
		System.out.println(array2[8]);  //exception 2
	}
	

	catch (ArrayIndexOutOfBoundsException e) {
		
		System.out.println("Infinite");
	}
	
	//cleanup activitie

}
}
