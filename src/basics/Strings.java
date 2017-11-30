package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoise = "Pussy";
		
		bookTitle = "Lord of the Pussys'";
		
		if(bookTitle.contains(wordChoise)){
			System.out.println("Congratz! \nThe book contains the word " + wordChoise + "!");
			
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is Chrome");
		
		String dogName = "Lucas";
		String momName = "Fatima";
		String Number = "929475";
		System.out.println(dogName.substring(0, 1));
		System.out.println(momName.substring(0, 3));
		System.out.println(Number.substring(3));
		System.out.println("Your dog's name has " + dogName.length() +" characters");
		}
		}

	}

}
