package test.com;

import java.sql.Wrapper;
import java.util.PrimitiveIterator;
import java.util.concurrent.CountDownLatch;

public class Test {	
	public static void main(String[] args) {
		
	String s1 = "I am Vipul , Well it means my name is Vipul . Vipul means a lot";
	     String[] s2=s1.split(" ");
	     String[] s3=s1.split(" ");
	     
	     for(int i=0;i<s2.length;i++) {
	    	 int count = 0;
	    	 for(int j=0;j<s3.length;j++) {
		    	 if(s2[i].equals(s3[j])) {
		    		 count++;
		    	 }
		     }
	    	
	    	 System.out.println("No of occurance for :"+s2[i]+" is "+count);
	     }
	}
}
