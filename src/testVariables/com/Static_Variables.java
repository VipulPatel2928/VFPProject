package testVariables.com;

public class Static_Variables {
	// salary  variable is a private static variable
	   private static double salary =100;

	   // DEPARTMENT is a constant
	   public static final String DEPARTMENT = "Development ";
	   
	   public static final int BONUS = 1000;
	   
	   public int nostatic = 10;
	   
	   public Static_Variables(int sal) {
		   salary = sal;
		 //  BONUS = 1500; //Remove the comment to see the compiler error
	   }
	   
	   public Static_Variables() {
		   System.out.println("Zero Argument/Default Constructor Called");
	   }
	   
	   public void display() {
		   System.out.println(DEPARTMENT + "average salary:" + salary);
		   System.out.println(DEPARTMENT + "average BONUS:" + BONUS);
		   
	   }
	
	public static void main(String[] args) {
		  Static_Variables.salary = 1000;
		  //Static_Variables.nostatic;  //Remove the comment to see that non static variable can't be access by CLASS NAME
	      System.out.println(DEPARTMENT + "average salary:" + salary);
	      Static_Variables obj1 = new Static_Variables(120000);
	      obj1.display();
	      Static_Variables obj2 = new Static_Variables();
	      obj2.display();
	}
}
