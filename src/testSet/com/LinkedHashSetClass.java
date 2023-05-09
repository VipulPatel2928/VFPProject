package testSet.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		System.out.println("Size of Hashset :"+set1.size());
		
		set1.add("Java");
		set1.add("Java1");
		set1.add("Java");
		set1.add("Java");
		set1.add(null);	
		System.out.println("Size of Hashset :"+set1.size());
		
		for (String str : set1) {
			System.out.println("HashSet element :"+str);
		}
		
		Iterator<String> eleIterator =set1.iterator();
		
		while (eleIterator.hasNext()) {
			System.out.println("HashSet element :"+eleIterator.next());
			
		}
		

		Set<String> set2 = new LinkedHashSet<String>();
		
		System.out.println("Size of Hashset :"+set2.size());
		
		set2.add("Java");
		set2.add("Java1");
		set2.add("Java");
		set2.add("Java");
		set2.add(null);	
		System.out.println("Size of Hashset :"+set2.size());
		
		for (String str : set2) {
			System.out.println("HashSet element :"+str);
		}
		
		Iterator<String> eleIterator1 =set2.iterator();
		
		while (eleIterator1.hasNext()) {
			System.out.println("HashSet element :"+eleIterator1.next());
			
		}

	

	}
}
