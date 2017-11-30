package basics;

public class NumberCalc {
	public static void main(String[] args){
		System.out.println("Program is starting ...");
		printName();
		int A = 20;
		int B = 30;
		int product = multiplyNumbers(A, B);
		System.out.println("The number " + A + " time the number " + B + " equals " + product);
		addNumbers(A, B);
	}
		static void printName(){
			
			System.out.println("My name is Paulo");
		}
		
		static void addNumbers(int numA, int numB){
			// This function will add up two number
			int sum = numA + numB;
			System.out.println("The sum of the number " + numA + " and the number " + numB + " is " + sum);
		}
		
		static int multiplyNumbers(int numA, int numB){
			// This function will multiply the numbers
			int mult = numA*numB;
			addNumbers(mult, mult);
			return mult;
			
		}
		
		

}
