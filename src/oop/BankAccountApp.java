package oop;


public class BankAccountApp {

	public static void main(String[] args){
	// Will create a new bank account >> Instantiating it
		
		// Polymorphism through overloading 
		BankAccount Who = new BankAccount(" Bitches", 10000);
		BankAccount Josh = new BankAccount ("LoL");
		
		// With encapsulation: Public API methods
		Who.setName("Paulo Bilzerian");
		Who.setSSN("9345545");
		System.out.println(Who.toString());
		
		Who.deposit(15000);
		Who.deposit(30000);
		
		// Polymorphism through overriding 
		System.out.println(Who.toString());
		Who.setRate();
		Who.increaseRate();
		
		/*		
		// Demo for inheritance
		CDAcc One = new CDAcc();
		One.name = "ShitHead";
		One.balance = 100000;
		One.number = "29393848";
		System.out.println(One.toString());
*/		
	}
}