package testinterface.com;

public class ClassD implements InterfaceB{

	public static void main(String[] args) {
      ClassD classD = new ClassD();
		
		classD.display1();
		classD.display2();
		InterfaceA.staticMethod();
		classD.display3();
		classD.display4();


	}

	@Override
	public void display1() {
		System.out.println("ClassD Display1");
		
	}

	@Override
	public void display2() {
		System.out.println("ClassD Display2");
		
	}

	@Override
	public void display3() {
		System.out.println("ClassD Display3");
		
	}

	@Override
	public void display4() {
		System.out.println("ClassD Display4");
		System.out.println(InterfaceA.PI);
		
	}
}
