package testforloop.com;

import java.util.Iterator;

import teststaticmethod.com.StaticMethodClass;

public class ForClass {

	public static void main(String[] args) {
		
		StaticMethodClass.display();
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Value of i :"+i);
		}
		
		System.out.println("------------------------------------------");
		String[] name = {"Vipul","Rutul","JAVA"};
		
		for (String str : name) {
			System.out.println(str);
		}
		System.out.println("------------------------------------------");
		
		for(int i =0 ;i<name.length;i++) {
			System.out.println("Name is :"+name[i]);
		}
		
		System.out.println("------------------------------------------");
		for (int i = 1; i < 11; i++) {
			System.out.println("Value of i :"+i);
			if(i==4) {
				break;
			}
		}
		System.out.println("------------------------------------------");
		
		for (int i = 1; i < 11; i++) {
			
			if(i==4) {
				continue;
			}
			
			if(i==6) {
				continue;
			}
			System.out.println("Value of i :"+i);
		}
		
	}

}
