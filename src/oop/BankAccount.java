package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS not to the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "59284";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definition --> unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructor are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructor have NO return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1000";			
		}
		else {
			Msg = "Thank you for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}	
	public String getName() {
		return name;
	}	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Interface methods	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double withdraw) {
		balance = balance-withdraw;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	// Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT #" + accountNumber + ", ROUTING #"+ routingNumber + ", BALANCE: $" + balance + "]";	
	}
}
