package constractor;

public class Circle1 {
	
	float Area, Circumfarence,radius , pi=3.14f;
	
	
	  float Circle12( float radius) {
		 
		 
		 Area= pi*radius*radius;
		 return Area;
	 }
	
	 float Circle( float radius) {
		
		
		Circumfarence=2 * pi* radius;
		return Circumfarence;
	}
}
