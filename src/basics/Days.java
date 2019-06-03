package basics;

public class Days {
	public static void main(String[] args) {
		// Execute different block of code based on the value of a condition
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
			case "Monday" : 
				System.out.println("Today is Monday");
				break;
			case "Tuesday" : 
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday" : 
				System.out.println("Today is Wednesday");
				break;
			case "Thursday" : 
				System.out.println("Today is Thursday");
				break;
			case "Friday" : 
				System.out.println("Today is Friday");
				break;
			case "Saturday" : 
				System.out.println("Today is Saturday");
				break;
			case "Sunday" : 
				System.out.println("Today is Sunday");
				break;
		}
	}
}
