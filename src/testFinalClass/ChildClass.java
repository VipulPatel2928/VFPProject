package testFinalClass;

public class ChildClass extends ParentClass{
	
	
	/*
	 * public void display() { System.out.println("Child Class display method"); }
	 */
	 
	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		
		childClass.display();
		
        ParentClass childClass1 = new ChildClass();
		
		childClass1.display();
	
	}
}
