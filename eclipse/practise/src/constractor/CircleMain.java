package constractor;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		float radius;
		Scanner sc= new Scanner(System.in);
				
		System.out.println("enter the value of radius");
		radius=sc.nextInt();
		
		
      Circle1 input = new Circle1 ();
		
      float area= input.Circle(radius);
		
		System.out.println("the value of total area"+area);
		
		float circumferance= input.Circle12(radius);
		System.out.println("the value of total area"+circumferance);
		
	}

}
