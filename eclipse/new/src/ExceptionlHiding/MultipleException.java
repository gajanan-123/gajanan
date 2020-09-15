package ExceptionlHiding;

public class MultipleException {
	
	void method() {

	int arr[]= {1,2,3,4,};
	arr[1]=21;
	arr[2]=23;
	arr[3]=21;
	//arr[4]=21;
	//arr[1]=21;
	
	try
	
	{System.out.println(arr[6]);
	
	}
	catch (ArithmeticException e ) {
		System.out.println("ArithmeticException occurs");
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("ArrayIndexOutOfBoundsExceptio occurs");
		
	}
	
	catch(Exception e) {
		System.out.println("parentException occurs ");
		
		
	}
	System.out.println("run the next code");
	}
	
	
	
}
