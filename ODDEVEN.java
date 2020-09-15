package basic01;
import java.util.Scanner;

public class ODDEVEN {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int num;
       
      
       System.out.println("enter the integer number");
       Scanner input =new Scanner(System.in);
       num=input.nextInt();
       if(num%2==0)
       {System.out.println("entered number is even");
       }
       else { System.out.println(" entered number is odd");
       }
       
	}

}
