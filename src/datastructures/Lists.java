package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. Create a collection
		ArrayList<String> cities = new ArrayList<String>();

		// 2. Add some elements
		cities.add("Jakarta");
		cities.add("Bandung");
		cities.add("Surabaya");
		
		// 3. Iterate the collections using For-Each method
		for(String city : cities) {
			System.out.println(city);
		}
		
		// 4. Get the array size
		int size = cities.size();
		System.out.println("There are " + size + " elements in the collections");
		
		// 5. Retrieve specific elements
		System.out.println(cities.get(0));
		
		// 6. Remove element
		cities.remove(0);
		size = cities.size();
		System.out.println("Now, there are " + size + " elements in the collections");
		for(String city : cities) {
			System.out.println(city);
		}
	}
}
