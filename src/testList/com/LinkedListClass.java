package testList.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<String>();

		System.out.println("Length of the Array List :" + list1.size());

		list1.add("Vipul");
		list1.add("Vipul");

		System.out.println("Length of the Array List :" + list1.size());

		Collections.addAll(list1, "Java", "Rutul", "C++");

		System.out.println("Length of the Array List :" + list1.size());

		List<String> list2 = new LinkedList<String>();

		System.out.println("Length of the Array List :" + list2.size());

		list2.add("Vipul");

		System.out.println("Length of the Array List :" + list2.size());

		Collections.addAll(list2, "Java", "Rutul", "C++");

		System.out.println("Length of the Array List :" + list2.size());
		
		for(int i = 0; i<list1.size();i++) {
			System.out.println("Array List element :"+list1.get(i));
		}
		
        Collections.sort(list1);
        
        for(int i = 0; i<list1.size();i++) {
			System.out.println("Array List element :"+list1.get(i));
		}
        
        
        for (String str : list1) {
		System.out.println(str);	
		}
        
        Iterator<String> ele=list1.iterator();
        
        while (ele.hasNext()) {
		
		System.out.println(ele.next());
			
		}

        System.out.println("Array List element with get method :"+list2.get(3));
        
	}
}
