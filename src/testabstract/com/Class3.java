package testabstract.com;

public abstract class Class3 extends AbstractClass2{
	public Class3() {
		System.out.println("This is deafult Constructor of Class3");
	}
	
	public static void main(String[] args) {
		// Remove the comment to see the compiler error
		//Class3 class2 = new Class3();
		//class2.display1();
		//class2.display2();
		//class2.display3();
	}

	@Override
	public void display2() {
		System.out.println("This is Display 2, AbstractClass2 ");	
	}
	@Override
	public void display1() {
		System.out.println("This is Display 1, AbstractClass2 ");
		
	}
	public final void displayFinal() {
		System.out.println("This is Display 1, AbstractClass2 ");
		
	}
}
