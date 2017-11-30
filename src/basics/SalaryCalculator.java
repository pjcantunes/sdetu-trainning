package basics;

public class SalaryCalculator {
	public static void main(String[] arg){
		// Lets create a variable to define our career, computing our annual salary
		
		// Declare the variable
		String carrer;
		System.out.println("Program is starting ...");
		
		// Define the variable
		carrer = "Software Developer";
		System.out.println("My carrer: " + carrer);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		
		double rate = 42.50; 
		
		// Compute the variable
		
		double salary = rate*weeksPerYear*hoursPerWeek;
		System.out.println("My salary has a " + carrer + " at the rate of " + rate + " per hour is $" + salary);
		
		// rate*HoursPerWeek*WeeksPerYear
		
		
	}
}
