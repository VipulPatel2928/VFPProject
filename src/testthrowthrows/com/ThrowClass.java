package testthrowthrows.com;

import java.io.IOException;

public class ThrowClass {

	public void checkAge(int age) throws Vipul{
	      if(age<18) {
	         throw new Vipul("Not Eligible for voting");
	         //Remove the comment to see the compiler error
	         //throw new IOException("This is IO Exception");
	         }
	      else
	         System.out.println("Eligible for voting");
	   }
	   public static void main(String args[]){
		   ThrowClass obj = new ThrowClass();
	       try {
			obj.checkAge(17);
		} catch (Vipul e) {
			e.printStackTrace();
		}
	      System.out.println("End Of Program");
	      
	      System.out.println("Hello");
	      
	      NullPointerException nullPointer = new NullPointerException();
	      throw nullPointer;
	      //Remove the comment to see the compiler error
	      //System.out.println("How are you");
}
	   
}
