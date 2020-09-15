package basic01;
import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method 
       char Alpha;
       System.out.println("enter the alphabet of your c");
       
       Scanner as=new Scanner(System.in);
       Alpha=as.next().charAt(0);
       
       if (Alpha== 'a'|| Alpha=='e'||Alpha=='o'|| Alpha=='i'|| Alpha=='u')
       
       {System.out.println("enter alphabet is vowel");}
       
       else
       {System.out.println(" enter alphabet is consonet");}
       }
       
    	   
    	   
    	   
       
		
		
		
	}


