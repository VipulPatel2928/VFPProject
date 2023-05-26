package testabstract.com;

public class Class2 extends AbstractClass2{
	
	public static void main(String[] args) {
		
		Class2 class2 = new Class2();
		class2.display1();
		class2.display2();
		class2.display3();
	}

	@Override
	public void display2() {
		System.out.println("This is Display 2, AbstractClass2 ");	
	}

	@Override
	public void display3() {
		System.out.println("This is Display 3, AbstractClass2 ");
		
	}

	@Override
	public void display1() {
		System.out.println("This is Display 1, AbstractClass2 ");
		
	}
}
