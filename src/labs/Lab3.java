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
		
		// Test password again our criteria
		for(String password : passwords) {
			System.out.println("*********\n" + password);
			
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			
			for(int n=0; n<password.length(); n++) {
				// Condition 1: contains number (0-9)
				if("0123456789".contains(password.substring(n, n+1))) {
					hasNumber = true;
					//System.out.println("Position " + n + " contains a number");
				}				
				// Condition 2: contains letter (a-z, A-Z)
				else if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(password.substring(n, n+1))) {
					hasLetter = true;
					//System.out.println("Position " + n + " contains a letter");
				}
				// Condition 3: contains special character (!@#)
				else if("!@#$%^&*()_+-=".contains(password.substring(n, n+1))) {
					hasSpecialChar = true;
					//System.out.println("Position " + n + " contains a special character");
				}	
				else {
					//System.out.println("Position " + n + " contains invalid character");
					try {
						throw new InvalidCharException(password.substring(n, n+1));
					} catch (InvalidCharException e) {
						e.toString();
					}
				}
			}
			
			// Test & Exception Handling
			
			try {
				// Throw CriteriaError
				if(!hasNumber) { throw new NumberCriteriaException(password);}
				else if(!hasLetter) { throw new LetterCriteriaException(password);}
				else if(!hasSpecialChar) { throw new SpecialCharCriteriaException(password);}
				else { System.out.println("Valid Password!");}
			} catch(NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
				System.out.println("Invalid password");
				System.out.println(e.toString());
			}			
		}
	}
}

class InvalidCharException extends Exception {
	String ch;
	// Constructor
	public InvalidCharException(String ch){
		this.ch = ch;
	}
	
	public String toString() {
		return ("InvalidCharException: " + ch);
	}
}

class NumberCriteriaException extends Exception {
	String password;
	// Constructor
	NumberCriteriaException (String password){
		this.password = password;
	}
	
	public String toString() {
		return ("NumberCriteriaException: " + password);
	}
}

class LetterCriteriaException extends Exception {
	String password;
	// Constructor
	LetterCriteriaException (String password){
		this.password = password;
	}
	
	public String toString() {
		return ("LetterCriteriaException: " + password);
	}
}

class SpecialCharCriteriaException extends Exception {
	String password;
	// Constructor
	SpecialCharCriteriaException  (String password){
		this.password = password;
	}
	
	public String toString() {
		return ("SpecialCharCriteriaException : " + password);
	}
}