package Arrays;

import java.util.Scanner;

public class ArraysAvrage {
	
	void method() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter size of arrays");
		int size =input.nextInt();
	
		int arr[]=  new int [size];
		
		System.out.println("enter the element of array");
		
		for (int i=0;i<arr.length; i++)
		{
			
			arr[i]=input.nextInt();
		}
		
		
		avrage(arr);
	}
	void avrage(int arr[]) {
	
	
	int sum=0;
	{
		
		
		
		
		for (int i=0;i<arr.length; i++)
		
		sum = sum+ arr[i];
	}
	int avarage = sum/arr.length;
	
	display(arr, sum ,avarage);
	}	
  
	
	void display(int arr[],int sum,int avarage) {
		
		for(int i :arr)
		
		{
		System.out.println("elements are in arr:  "  +i);
		
		
		}
		
		System.out.println("sum of an arr:"+sum);
		System.out.println("avrage of an arr :"+ avarage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
