package oop;

public class AccountApp {
	
	public static void main(String[] args){
		LoanAcc la = new LoanAcc();
		la.setRate();
		la.setRate();
		la.setAmortization();
		la.setTerm(10);
		
		// Polymorphism aswell (Create a variable based in IRate, but pointing to methods defined in LoanAcc)
		IRate account1 = new LoanAcc();
		account1.setRate();
	
	}
	
}
