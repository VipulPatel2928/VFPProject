package testabstract.com;

public abstract class AbstractClass3 {
	
	public abstract void display2();
	public abstract void display3();
	public abstract void display1();
	
	public static void staticMethod() {
		System.out.println("AbstractClass1 static method");
	}
	
	public static void main(String[] args) {
		// Remove the comment to see the compiler error
		//AbstractClass1 objAbstractClass1 = new AbstractClass1();
		///objAbstractClass1.display();
		AbstractClass3.staticMethod();
	}
}
