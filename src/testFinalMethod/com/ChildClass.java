package testFinalMethod.com;

public class ChildClass extends ParentClass{
	
	
	
	/*
	 * public void display() { System.out.println("Child Class display method"); }
	 */
	 
	
	public void display1() {
		System.out.println("Child Class display method");
	}
	 
	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		
		childClass.display();
		childClass.display1();
		
        ParentClass childClass1 = new ChildClass();
		
		childClass1.display();
		childClass1.display1();

	}

}
