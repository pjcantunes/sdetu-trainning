package oop;

public class CDAcc extends BankAccount implements IRate {
	
	String interest;
	
	void compound(){
		System.out.println("Compounding interest");
	}
	
}
