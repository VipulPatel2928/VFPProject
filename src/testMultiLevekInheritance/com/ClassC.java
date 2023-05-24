package testMultiLevekInheritance.com;

public class ClassC extends ClassB{

//	public void display() {
//		System.out.println("This is display method from Class C");
//	}

	public static void main(String[] args) {

		// Case 1
		ClassC b = new ClassC();

		b.display();

		// Case 2
		ClassA a = new ClassA();

		b.display();

		// Case 3
		ClassA ab = new ClassC();

		ab.display();

		// Case 1
		ClassB b1 = new ClassC();

		b1.display();

		// Case 2
		ClassB a1 = new ClassB();

		a1.display();

		// Case 3
		ClassA ab1 = new ClassC();

		ab1.display();

	}
}
