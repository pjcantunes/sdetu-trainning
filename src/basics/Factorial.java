package basics;

public class Factorial {

	public static void main(String[] args) {
		// Factorial numbers
	int a;
	a = 6;
//	fac(a);
	System.out.println(fact(a));
	}
	
	public static int fact(int n){
		if(n == 0){
			return 1;
		}
		System.out.println(n);
		return fact(n-1)*n;
	}
}
 //  public static void fac(int n){
//  	if (n == 0 || n == 1){
//		n = 1;
//		System.out.println("The Factorial is " + n);
//		}
//	else{
//	for(int i=n-1 ; i>0; i--){	
//		n = n*i; 
//	}			
//			 System.out.println("The Factorial is " + n);
//}
//}
//}


 