import java.util.Scanner;
public class simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1,num2;
		
		Scanner cal = new Scanner(System.in);
		
		System.out.println("enter the first number:");
		
		num1= cal.nextDouble();
		
		System.out.println("enter the secound number:");
		
		num2= cal.nextDouble();
		
		
		System.out.println("enter t"
				+ "the operator (+,-,/,*):");
		
		char operator = cal.next().charAt(0);
		
		
		double output;
		
		switch(operator)
		{case  '+':
			output=num1 + num2;
			break;
		case '-':
			output= num1-num2;
			break;
		case '*':
			output=num1*num2;
			break;
		case '/':
			output=num1/num2;
			break;
			default:
				System.out.println("you have enter wrong operator");
				return;
		}
		
		System.out.println(num1+""+operator+""+num2+":"+output);
		
		
		
		
	}

}
