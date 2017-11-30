package Labs;

public class Lab1 {

	public static void main(String[] args) {
		int p = 5;
		System.out.println(" The cumulative sum of " + p + " is " +sum(p));
		System.out.println(" The factorial of " + p + " is " +fact(p));
		
		int [] vec = {10, -2, 3, -4, 5};
		System.out.println(Min(vec));
		System.out.println(Max(vec));
		System.out.println("The average is " + Avg(vec));
		Avg(vec);
	}
	
	public static int Min(int[] a){
		int Min = a[0];
		for(int i = 0; i<a.length; i++){
			if( Min > a[i])
				Min = a[i];
		}
		return Min;
	}
	
	public static int Max(int[] a){
		int Max = a[0];
		for( int i=0; i<a.length; i++){
			if ( Max < a[i]){
				Max = a[i];
			}
		}
			return Max;
		}
	
	public static int Avg(int [] a){
		int sum = 0; 
		for(int i=0; i<a.length; i++){
			sum = sum + a[i];
		}
		int Avg = sum/a.length;
		return Avg;
	}

	public static int sum(int a){
		if (a == 0){
			return 0;
		}
		return sum(a-1) + a;
	}

	public static int fact(int a){
		if(a == 0){
			return 1;
		}
		return fact(a-1)*a;
	}


}
