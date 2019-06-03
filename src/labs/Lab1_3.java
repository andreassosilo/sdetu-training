package labs;

public class Lab1_3 {

	public static void main(String[] args) {
		// Write 3 functions that take an array as a parameter
		// and return the minimum, average, maximum values of that array

		int[] array = {5,6,7,3,8,2,4,7,23,45};
		System.out.println("The minimum value from the array is " + minimum(array));
		System.out.println("The average value from the array is " + average(array));
		System.out.println("The maximum value from the array is " + maximum(array));
	}
	
	public static int minimum(int[] numbers) {
		int minValue = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
	
	public static double average(int[] numbers) {
		int totalValue = 0;
		for(int i = 0; i < numbers.length; i++) {
			totalValue = totalValue + numbers[i];
			}
		int avgValue = totalValue / numbers.length;
		return avgValue;
		}
	
	public static int maximum(int[] numbers) {
		int maxValue = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
}
