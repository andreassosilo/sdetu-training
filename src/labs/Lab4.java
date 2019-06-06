package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {
		// This method will read data from CSV file --> CCstatement.csv
		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Java\\Files\\CCstatement.csv"; // path of the file
		String dataRow;		
		double balance = 0;
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the data as long as it's not empty
			while((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				transactions.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file\n-------------------------");
		}
		
		System.out.println("DATE | TRANSACTION | VENDOR | AMOUNT | BALANCE");
		for(String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]) ;
			System.out.print(date + " | " + type + " | " + vendor + " | $" + String.format("%.2f", amount));
			
			if(type.equalsIgnoreCase("credit")) {
				//System.out.println("Add to balance");
				balance = balance + amount;
			}
			else if (type.equalsIgnoreCase("debit")) {
				//System.out.println("Subtract from balance");
				balance = balance - amount;
			}
			else {
				//System.out.println("Some other transaction");
				balance = balance - amount;
			}
			System.out.print(" | $" + String.format("%.2f", balance) + "\n");
		}
		
		// Check the balance
		if (balance > 0) {
			System.out.println("You have a balance of $" + String.format("%.2f", balance));
			System.out.println("You are charged of 10% fee of $" + String.format("%.2f", balance*.10));
			System.out.println("Your new balance is: $" + String.format("%.2f", balance*1.1));
		}
		else if (balance < 0) {
			System.out.println("Thanks for your payments.");
			System.out.println("You have overpayment of $" + String.format("%.2f", balance));
		}
		else {
			System.out.println("Thanks for your payments.");
		}
	}
}