package basics;

public class Cities {

	public static void main(String[] args) {
			// Declare and define an array
		String [] cities = {"NY", "San Francisco", "Miami", "Dalas" };
		System.out.println(cities[0]);
	
		String [] countries;
		countries = new String [3];
		countries[0] = "UK";
		countries[1] = "Canada";
		countries[2] = "USA";
		System.out.println(countries[1]);
		
		
		
		// Declare & define the size of the array
	String [] states = new String [5];
	states[0] = "Cali";
	states[1] = "Ohio";
	states[2] = "Texas";
	states[3] = "Utah";
	states[4] = "New Jersey";
	
	int i=0;
	// Do loop then tests condition
	do  {
	System.out.println("State : " +states[i]);
	i = i+1;
	} while (i<5);
	 // While : tests condition first then enters the loop
	
		int n = 0;
		boolean stateFound = false;
		while(!stateFound){
			String state = states[n];
			System.out.println(state);
			if (state == "Texas"){
				System.out.println("State Found!");
				stateFound = true;
			
			}
			n++;
		}
	// For loop
		System.out.println("Printing with For loop");
		for(int x = 0; x<5; x++){
			System.out.println(states[x]);
		}
	
	}
	

}
