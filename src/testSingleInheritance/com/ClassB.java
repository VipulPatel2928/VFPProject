package testSingleInheritance.com;

public class ClassB extends ClassA{
	
	public void display() {
		System.out.println("This is display method from Class B");
	}

	public static void main(String[] args) {
		
		//Case 1
		ClassB b = new ClassB();
		
		b.display();
		
		//Case 2
		ClassA a = new ClassA();
		
		b.display();
		
		//Case 3
		ClassA ab = new ClassB();
		
		ab.display();
		
		//Case 4, it is not possible
		
		//ClassB ba = (ClassB) new ClassA();
		
		//ba.display();
	}
}
