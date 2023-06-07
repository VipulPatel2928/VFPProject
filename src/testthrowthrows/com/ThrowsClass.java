package testthrowthrows.com;

import java.io.IOException;

public class ThrowsClass {
	
	  public int division(int a, int b) throws ArithmeticException, IOException{
	      int t = a/b;
	      return t;
	   }
	   public static void main(String args[]) throws ArithmeticException,IOException{
		   ThrowsClass obj = new ThrowsClass();
	      try{
	         System.out.println(obj.division(10,0));
	      }
	      catch(ArithmeticException e){
	         System.out.println("You shouldn't divide number by zero");
	      }
	   }
}
