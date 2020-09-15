package basic01;
import java.util.Scanner;
public class sallary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float basic,gross, da, hr;
		
		
System.out.println("basic sallary of employe");
 
 Scanner input=new Scanner(System.in);
 
 basic=input.nextInt();
 
 if (basic<=10000)
 {hr=(10000*20)/100;
 da=(10000*80)/100;
 gross=(basic+hr+da);
 }
 
 else if(basic<=20000) {
	  hr=(20000*20)/100;
	  da=(20000*80)/100;
	  gross=(basic+hr+da);}
 
 else
  {
	  hr=(25000*20)/100;
	  da=(25000*80)/100;
	  gross=(basic+hr+da);}

	 
System.out.println("gross sallary of employed="+gross);	 
	 
	 
 }
	}


