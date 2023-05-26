package testinterface.com;

public interface InterfaceB extends InterfaceA{
	
	public static void nonStaticMethod() {
		System.out.println("InterfaceB non static method");
	}
	
	public abstract void display3();
	void display4();
}
