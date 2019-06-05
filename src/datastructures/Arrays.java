package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// Define variable
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
		
		// Using the old fashioned way
		System.out.println("The old fashioned way:");
		for(int i=0; i<5; i++) {
			System.out.print(alphabet[i] + " ");
		}

		// Using the length variable
		System.out.println("\n\nUsing the length variable:");
		for(int n=0; n<alphabet.length; n++) {
			System.out.print(alphabet[n] + " ");
		}
		
		// Using the For-Each method
		System.out.println("\n\nUsing the For-Each method");
		for(String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		// Double Arrays / Double Matrices
		System.out.println("\n\nDoubleArrays");
		
		String [][] users = {
				{"Michael", "Smith", "michael.smith@gmail.com", "62217368923"},
				{"Sarah", "Larson", "sarah.larson@gmail.com", "62217892402"},
				{"Henri", "Lars", "henri.lars@gmail.com", "62217340293"}
				}; 
		
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		// Old fashioned way - double iteration
		System.out.println("\nOld fashioned way");
		for(int i = 0; i<numOfUsers; i++) {
			System.out.print("[ ");
			for(int j = 0; j<numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("]");
		}
		
		// Traverse the double array
		System.out.println("\nWith determined [j] value");
		for(int i = 0; i<numOfUsers; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		// Using For-Each method
		System.out.println("\nUsing FOR EACH Method:");
		for(String[] user : users) {
			System.out.print("[ ");
			for(String field : user) {
				System.out.print(field + " ");
			}
			System.out.println("]");
		}
	}
}