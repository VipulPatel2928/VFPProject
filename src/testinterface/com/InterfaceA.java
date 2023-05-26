package testinterface.com;

public interface InterfaceA {
	float PI = 3.14f;
	public abstract void display1();
	void display2();
	public static void staticMethod() {
		System.out.println("InterfaceA static method");
	}
	public static void main(String[] args) {
		// Remove the comment to see the compiler error
		//InterfaceA obA = new InterfaceA();
	}
}
