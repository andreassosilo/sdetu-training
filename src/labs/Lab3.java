package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	// This program will read a text file and will retrieve the password 
	public static void main(String[] args) {
		
		// 1. Define the file (path) that we want to read
		String filename = "C:\\Java\\Files\\Password.txt";
		
		// 2. Create the file in Java
		File file = new File(filename);
		String[] passwords = new String[13];
		String password = null;
		
		try {
			// 3. Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i=0; i<passwords.length; i++) {
				// 4. Read the file
				passwords[i] = br.readLine();
			}				
			// 5. Close the resources
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
		}
		
		// Test password again our criteria:
			// A number (0-9)
			// A letter (a-z, A-Z)
			// A special character (!@#)
		
		for(int i=0; i<passwords.length; i++) {
			password = passwords[i];
			try {
				if(password.length() != 10) {
					throw new NumberException(password);
				}
				if(password.substring(0, 1).equals("0") || password.substring(0, 1).equals("9")) {
					throw new AlphabetException(password);
				}
				for(int n = 0; n<password.length()-2; n++){
					if(password.substring(n, n+1).equals("9")) {
						if(password.substring(n+1, n+3).equals("11")) {
							throw new SpecialCharException(password);
						}
					}				
				}
				System.out.println("Password : " + password);
			} catch(NumberException e) {
				System.out.println("ERROR: Number (0-9) is missing");
				System.out.println(e.toString());
			} catch (AlphabetException e) {
				System.out.println("ERROR: Alphabet (a-z,A-Z) is missing");
				System.out.println(e.toString());
			} catch (SpecialCharException e) {
				System.out.println("ERROR: Special character (! @ #) is missing");
				System.out.println(e.toString());
			} 
	}
}

class NumberException extends Exception {
	String pass;
	// Constructor
	NumberException(String pass){
		this.pass = pass;
	}
	
	public String toString() {
		return ("NumberException: " + pass);
	}
}

class AlphabetException extends Exception {
	String pass;
	// Constructor
	AlphabetException (String pass){
		this.pass = pass;
	}
	
	public String toString() {
		return ("AlphabetException: " + pass);
	}
}

class SpecialCharException extends Exception {
	String pass;
	// Constructor
	SpecialCharException (String pass){
		this.pass = pass;
	}
	
	public String toString() {
		return ("SpecialCharException: " + pass);
	}
}
