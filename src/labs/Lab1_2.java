package labs;

public class Lab1_2 {

	public static void main(String[] args) {
		// Write a function of factorial value
		// 1! = 1
		// 2! = 2 * 1! = 2 * 1 = 2
		// 3! = 3 * 2! = 3 * 2 * 1 = 6
		// 4! = 4 * 3! = 4 * 3 * 2 * 1 = 24
		int value = 4;
		System.out.println("The factorial value of " + value + "! is " + factorial(value));
	}
	
	public static int factorial (int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
