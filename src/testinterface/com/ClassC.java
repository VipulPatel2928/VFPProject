package testinterface.com;

public class ClassC implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		ClassC classC = new ClassC();
		
		classC.display1();
		classC.display2();
		InterfaceA.staticMethod();
		classC.display3();
		classC.display4();

	}

	@Override
	public void display1() {
		System.out.println("ClassC Display1");
		
	}

	@Override
	public void display2() {
		System.out.println("ClassC Display2");
		
	}

	@Override
	public void display3() {
		System.out.println("ClassC Display3");
		
	}

	@Override
	public void display4() {
		System.out.println("ClassC Display4");
		System.out.println(InterfaceA.PI);
		
	}
}
