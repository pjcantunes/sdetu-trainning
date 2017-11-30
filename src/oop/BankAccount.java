package oop;

/**
 * @author paulo
 *
 */
public class BankAccount implements IRate {
		// This are Instant variable (for each created account)
		private String name;
		private String SSN;
		String money;
		String deposite;
		double balance = 0;
		
		// This is a static variable
		public static final String bankName = "Paulo's Bank";
		private String routNumber = "10348";
		// Constructur definitions: unique methods
//	 	1. They are used to define/setup/initialize proprieties of an object
//		2. Constructurs are called IMPLICITLY upon INSTATIATION
//      3. Has the same name as the class!!!
//		4. Constructors have no return type
		
		BankAccount(){
			System.out.println("A bank account has just been created!");
		}
		
		// Overloading: is when we can call the same method with different arguments
		BankAccount(String accType){
			System.out.println("A bank account type: " + accType + " has just been created!");
		}
		
		BankAccount(String accType, double initDeposite){
			// This are local variables that exist inside of this block: accType, initDeposite ...
			System.out.println("A bank account type is " + accType);
			System.out.println("The initial deposit was $" + initDeposite);
			String msg = null;
			
			if ( initDeposite < 10000 ){
			msg = "ERROR! The initial deposite must be over 10000!";
			}
			else{
			msg = "Your account has been successfully created with $" + initDeposite;
			}
			balance = balance + initDeposite;
			System.out.println(msg); 
			System.out.println("Your account balance is of $" + balance);
		}
		
		// Getters and Setters
		// Allow the user to define their name throgh a function
		
		public void setName(String name){
			this.name = "Mr. " + name;
			
		}
		public void setSSN(String SSN){
			this.SSN = SSN;
		}
			// Interface methods
		public void setRate(){
			System.out.println("Your rate is");
		}
		public void increaseRate(){
			System.out.println("Your rate has been increase by");
		}
		
		public void deposit(double amount){
			balance = balance + amount;
			//System.out.println(" Deposit succeded! Your current balance is $" + balance);
			showActivity("Deposit");
		}
		
		public void withdraw(double amount){
			balance = balance - amount;
			//System.out.println("Withdraw suceeded! Your bank account is $" + balance);
			showActivity("Withdraw");
	}
			// Private can only be called within the class!
		private void showActivity( String activity){
			System.out.println("Your recent activity" + activity);
			System.out.println("Your new balance is $" + balance);
		}
		@Override
	 	public String toString(){
			return "[Name: " + name + " | RootNumber: " + routNumber +" | SSN: " + SSN + " | Balance: $" + balance + "]";		
		
		}
	}


