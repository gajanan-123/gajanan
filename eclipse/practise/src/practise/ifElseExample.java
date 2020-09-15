package practise;

public class ifElseExample {
	
	
/*The Java if-else statement also tests the condition. 
 * It executes the if block if condition is true otherwise else block is executed.
 
 *Syntax:

    if(condition){  
                        //code if condition is true  }
              else{  
                  //code if condition is false  
                                             }  

 *
 */
	// check number odd or even
	
	public static void main(String[] args) {
		
		
		int number=17;
		
		if(number % 2 ==0)
		{
			
			System.out.println("the integer number is even");
		}
		else {
			
			System.out.println("the integer number is odd");
			
		}
	

	}

}
