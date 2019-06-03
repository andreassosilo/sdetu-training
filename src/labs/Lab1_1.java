package labs;

public class Lab1_1 {

	public static void main(String[] args) {
		// Write a function that takes a value and returns the sum of numbers 1 to n 
		System.out.println(sum(7));

	}

	static int sum(int value) {
		int product = 0;
		if(value <= 1) {
			for(int n = value; n <= 1; n++) {
				product = product + n;
			}
		}
		else if(value >= 1) {
			for(int n = value; n >= 1; n--) {
				product = product + n;
			}
		}
		return product;
	}
}
