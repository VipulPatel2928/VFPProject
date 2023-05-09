package testSet.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		
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

	}
}
