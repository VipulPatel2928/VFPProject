package test.com;

import testVariables.com.Static_Variables;

public class Test {
	
	// salary  variable is a private static variable
	   private static double salary =100;

	   // DEPARTMENT is a constant
	   public static final String DEPARTMENT = "Development ";
	   
	   public static final int BONUS = 1000;
	   
	   public int nostatic = 10;
	   
	   public Test(int sal) {
		   salary = sal;
		 //  BONUS = 1500; //Remove the comment to see the compiler error
	   }
	   
	   public Test() {
		   System.out.println("Zero Argument/Default Constructor Called");
	   }
	   
	   public void display() {
		   System.out.println(DEPARTMENT + "average salary:" + salary);
		   System.out.println(DEPARTMENT + "average BONUS:" + BONUS);
		   
	   }
	
	public static void main(String[] args) {
		  Test.salary = 1000;
		  //Static_Variables.nostatic;  //Remove the comment to see that non static variable can't be access by CLASS NAME
	      System.out.println(DEPARTMENT + "average salary:" + salary);
	      Test obj1 = new Test(120000);
	      obj1.display();
	      Test obj2 = new Test();
	      Test.salary = 1;
	      obj2.display();
	      obj1.display();
	}
}
