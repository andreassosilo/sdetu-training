package exceptionfiles;

import java.util.Scanner;

public class PaymentsApp {

	// Take a payment from a user
	public static void main(String[] args) {
		// Define properties
		double payment = 0;
		boolean positivePay = true;
		
		do {
			// 1. Ask the user for the input
			System.out.print("Enter the payment amount :");
			
			// 2. Get the amount and test the value
			Scanner in = new Scanner(System.in);
			
			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if(payment<0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePay = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again..");
				positivePay = false;
			}
		} while(!positivePay);
		
		// 4. Print confirmation
		System.out.println("Thank you for your payment of $" + payment);
	}
}