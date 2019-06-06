package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement maps interfaces
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtility(hMap);

	}

	public static void mapUtility(Map<Integer, String> map) {
		// 1. Add Key-Value pairs
		map.put(101, "John");
		map.put(561, "Steve");
		map.put(201, "Mika");
		map.put(22, "Sarah");
		map.put(182, "Roger");
		
		// 2. Expose/access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		System.out.println(map.get(561));
		
		// 3. Iterate through map of key-value pairs
		for(int key : map.keySet()) {
			System.out.println("[KEY: " + key + ". VALUE: " + map.get(key) + "]");
		}
	}
}
