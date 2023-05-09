package testSet.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> set1 = new TreeSet<String>();
		
		System.out.println("Size of Hashset :"+set1.size());
		
		set1.add("Java");
		set1.add("Java1");
		set1.add("Java");
		set1.add("Java");
		// No null value allow in tree
		//set1.add(null);	
		System.out.println("Size of Hashset :"+set1.size());
		
		for (String str : set1) {
			System.out.println("HashSet element :"+str);
		}
		
		Iterator<String> eleIterator =set1.iterator();
		
		while (eleIterator.hasNext()) {
			System.out.println("HashSet element :"+eleIterator.next());
			
		}

	}
}
