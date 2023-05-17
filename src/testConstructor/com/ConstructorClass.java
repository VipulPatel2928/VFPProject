package testConstructor.com;

public class ConstructorClass {

	public ConstructorClass(int i) {
		System.out.println("This is 1 para :"+i);
	}
	
	public ConstructorClass(int i, String str) {
		System.out.println("This is 2 para :"+i);
		System.out.println("This is 2 para :"+str);
	}
	
	public ConstructorClass() {
		System.out.println("This is default constructor");
		dispaly();
	}
	
	public void dispaly() {
		System.out.println("This is the display method");
	}
	
	public static void main(String[] args) {
		ConstructorClass constructorClass = new ConstructorClass();
		ConstructorClass constructorClass1 = new ConstructorClass(10);
		ConstructorClass constructorClass2 = new ConstructorClass(0, "Null");
	}
}
