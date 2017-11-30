package oop;

public class LoanAcc implements IRate {
	
	@Override
	public void setRate(){
		System.out.println("Rate");
	}
	
	@Override
	public void increaseRate(){
		System.out.println("Increase");
	}
	
	public void setTerm(int terms){
		System.out.println("Setting the term to:" + terms + " years.");
	}
	
	public void setAmortization(){
		System.out.println("Amortization schedule!");
	}
	
}
