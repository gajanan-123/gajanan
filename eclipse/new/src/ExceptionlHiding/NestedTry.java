package ExceptionlHiding;

public class NestedTry {
	
void method() {
	
try {
		try   {
			   int g= 32/0;}
		
	   catch (ArithmeticException s ) {System.out.println("arith");
		
    }
		
	   try   {
		      int arr[]= {1,2,3,4};
		      System.out.println(arr[5]);
	                                         }
	  catch(ArrayIndexOutOfBoundsException r) {
		System.out.println("arry");
	                                 }
	catch(Exception g) {
		System.out.println("handed");
	}
	System.out.println("mormal flow");
}
finally {
	System.out.println("finally statement");
}
}
}
