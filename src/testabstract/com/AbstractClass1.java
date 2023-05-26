package testabstract.com;

public abstract class AbstractClass1 {
	
    // Class can be abstract without having any abstract method
	
	public void display() {
		System.out.println("AbstractClass1 method");
	}
	
	public static void staticMethod() {
		System.out.println("AbstractClass1 static method");
	}
	
	public static void main(String[] args) {
		// Remove the comment to see the compiler error
		//AbstractClass1 objAbstractClass1 = new AbstractClass1();
		///objAbstractClass1.display();
		AbstractClass1.staticMethod();
	}
}
