package oop;

class person{
// This is a template to the abstraction of the user!
	String name;
	String email;
	String number;
	
	
// Define methods	
	void walk() {
		System.out.println(name +" is walking down the street");
	}
	void talk() {
		System.out.println(name + " is using the " + number);
	}
	void notice() {
		System.out.println("You can notify "+ name +" by the endress " + email);
	}

}

public class demo {
	public static void main( String[] args){
		

	// Instantiating an object 
	person Paulo = new person();
	
	// Defining his properties
	Paulo.email= "jdnddk@ubi.pt";
	Paulo.name = "Paulo";
	Paulo.number = "ekeknd";
	
	// Abstraction
	Paulo.walk();
	Paulo.notice();
	Paulo.talk();
}
}