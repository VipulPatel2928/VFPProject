package testHierachicalInheritance.com;

public class ClassC extends ClassA{

	public void display() {
		System.out.println("This is display method from Class C");
	}

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
	}
}
