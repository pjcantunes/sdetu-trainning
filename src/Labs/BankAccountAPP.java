package Labs;

public class BankAccountAPP {

	public static void main(String[] args) {
		bankAccount Paulo = new bankAccount("22821", 1000);
		Paulo.setName("Paulo");
		System.out.println(Paulo.getName());
		Paulo.payBill(300);
		Paulo.makeDeposit(5000);
		Paulo.accrue();
		System.out.println(Paulo.toString());
	}

}

class bankAccount implements IInterest{
	// Properties bankAccount
	private static int iD = 7643;					// Internal ID:  
	private String accountNumber;   // iD + 2 digit number + first 2 of SSN
	private static final String routingNumber = "937463";	
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	
	public bankAccount(String SSN, double initDeposit){
		
		System.out.println("A new account has been created!");
		iD++;
		// System.out.println(iD);
		balance = initDeposit;
		this.SSN = SSN;
		setAccountNumber();
		System.out.println(accountNumber);
	}
	
	private void setAccountNumber(){
		int random = (int) (Math.random()*100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number is: " + accountNumber);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void payBill(double amount){
		balance = balance - amount;
		System.out.println("Pay bill for $" + amount);
		showBalance();
	}
	public void makeDeposit(double amount){
		balance = balance + amount;
		System.out.println("Deposit for $" + amount);
		showBalance();
	}
	public void showBalance(){
		System.out.println(balance);
	}
	
	@Override
	public void accrue(){
		balance = balance * (1 + (rate/100));
		showBalance();
	}
	@Override
	public String toString(){
		return "[Mr. " + name + "] \n[Routing Number: " + routingNumber + "] \n[Account Number: " + accountNumber + "] \n[Balance: $" + balance + "]" ;
	}
}