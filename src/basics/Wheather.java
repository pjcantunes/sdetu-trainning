package basics;

public class Wheather {
public static void main(String[] args){
	// This program will give sugestions of what to wear based on the climate (temperature & sun condition)
	
	int temperature;
	String sunCondition = "Sunny";
	
	temperature = 70;
	
	if (temperature>80){
		System.out.println("Wear Shorts and T-Shirt");
	}
	else if ((temperature > 65) && (sunCondition == "Sunny")) {
		System.out.println(" Little cooler, wear longsleeve shirt and pants. \n Take also a hat for the sun");
	}
	else if ((temperature >55) || (sunCondition == "Overcast")) {
		System.out.println("Dark day ahead, bring warm clothes!");
	}
	
	else {
		System.out.println("Cold outside! Wear a Jacket");
	}
			System.out.println("The program has forcasted your cloths!");
}

}
