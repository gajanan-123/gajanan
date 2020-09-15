package encapsusaltion;

import java.util.Scanner;

public class Author {
	Scanner iput = new Scanner (System.in);
	
	private String Authorname;
	private int age;
	private String place;
	
	public String getAuthorname() {
		return Authorname;
		
		
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
		authorname=iput.next();
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
		age=iput.nextInt();
	}
	public String getplace() {
		return place;
	}
	public void setplace(String place) {
		this.place = place;
		place=iput.next();
	}
	
	
	
	
	
	
	

}
