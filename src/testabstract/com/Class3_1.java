package testabstract.com;

public class Class3_1 extends Class3{
	public Class3_1() {
		super();
	}
	public static void main(String[] args) {
		Class3_1 class3_1 = new Class3_1();
		
		class3_1.display1();
		class3_1.display2();
		class3_1.display3();
	}

	@Override
	public void display3() {
		System.out.println("This is Display 3, Class3_1 ");
	}
	
//	public final void displayFinal() {
//		System.out.println("This is Display 1, AbstractClass2 ");
//		
//	}
}
