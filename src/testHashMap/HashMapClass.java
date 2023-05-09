package testHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		
		System.out.println("=======Hash MAP===============");
		HashMap<Integer, String> mapHash = new HashMap<Integer, String>();// Creating HashMap

		mapHash.put(1, "Mango"); // Put elements in Map
		mapHash.put(2, "Apple");
		mapHash.put(3, "Banana");
		mapHash.put(null, "Banananull");
		mapHash.put(null, "Banananullagain");
		mapHash.put(4, null);
		mapHash.put(5, null);
		mapHash.put(6, null);
		//mapHash.put(4, "Grapes");
	 
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : mapHash.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		mapHash.put(1, "Grapes"); // trying duplicate key
		//You cannot store duplicate keys in HashMap. 
		//However, if you try to store duplicate key with another value, it will replace the value.
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : mapHash.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		mapHash.remove(1);
		mapHash.remove(2, "Apple");
		mapHash.remove(2, "Appl");
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : mapHash.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		mapHash.replace(3, "New Banana");
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : mapHash.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
		System.out.println("=======Hash Table===============");
		Hashtable<Integer, String> maptable = new Hashtable<Integer, String>();
		
		maptable.put(1, "Mango"); // Put elements in Map
		maptable.put(2, "Apple");
		maptable.put(3, "Banana");
		//maptable.put(null, "Banananew");
		//Remove the comment to see the error
		//Run the program to see the error on this line.
		
		//maptable.put(4, null);
		//Remove the comment to see the error
		//Run the program to see the error on this line.
	
	
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : maptable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		maptable.put(1, "Grapes"); // trying duplicate key
		//You cannot store duplicate keys in HashMap. 
		//However, if you try to store duplicate key with another value, it will replace the value.
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : maptable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		maptable.remove(1);
		maptable.remove(2, "Apple");
		maptable.remove(2, "Appl");
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : maptable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		maptable.replace(3, "New Banana");
		
		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : maptable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}


	}


