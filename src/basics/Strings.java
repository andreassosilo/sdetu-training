package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of The Rings";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase(browser)) {
			System.out.println("The browser is chrome");
		}

		String firstName = "Andreas";
		String lastName = "Sosilo";
		String SSN = "289723774";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
	
		// Print the initials and the last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(SSN.substring(5));
	}

}
