package basics;

public class CumSum {
	public static void main(String[] args){
		// This program does the cumulative sum the numbers before
		
		int p = 5;
		cum(p);
		System.out.println(soma(p));
	}
		public static int soma(int a){
			if(a == 0){
				return 0;
			}
			return	soma(a-1)+a;
	}
		public static void cum(int a){
				for(int i=a-1; i>0; i--){
					a = a+i;
				}
				System.out.println("The cumulative sum is " + a);
			}
		}
		
	
	
		
	
	
	

