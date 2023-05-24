package testmethodoverriding.com;

public class Test2 extends Test1{
	
	public void test1Method() {
		System.out.println("This is test2Method");
	}
	
	public static void staticMethod() {
		System.out.println("This is test2Method");
	}
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.test1Method();
		Test2.staticMethod();
		
		Test1 test1 = new Test1();
		test1.test1Method();
		Test1.staticMethod();
		
		Test1 test12 = new Test2();
		test12.test1Method();
		Test1.staticMethod();
	}
}
