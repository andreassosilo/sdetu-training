package oop;

public class LoanAccount implements IRate {

	public void setRate() {
		System.out.println("Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase rate");
	}
	
	public void setTerm(int terms) {
		System.out.println("Setting the term for " + terms + " years");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammortization schedule");
	}
}
