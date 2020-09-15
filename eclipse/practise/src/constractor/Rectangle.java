


package constractor;

public class Rectangle {

	 int length;
	 int breath;
	 int area;
	 
	 
	 Rectangle() {  
		 
		 length=0;
		 breath=0;
		 	
	 }

	 Rectangle (int length, int breath)
	 {
		 
		 this.length=length;
		 this.breath=breath;
		 
	 }
	Rectangle (int number){
		
		length= number;
		breath= number;
		
		
	}
	
	void area()
	{
		area=length*breath; 
		
	}
	
	void Display() {
		area();
		
		System.out.println("the area of rectangle :"+area );
	}
	
	
	
	
	
}
