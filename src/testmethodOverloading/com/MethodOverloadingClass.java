package testmethodOverloading.com;

public class MethodOverloadingClass {

	// By changing number of arguments

	public void fun1(int a) {
		System.out.println("This is integer Type : " + a);
	}
	
	
	//Remove the function comments to see the compiler error
//	public int fun1(int a) {
//		System.out.println("This is integer Type : " + a);
//		return a;
//	}

	public void fun1(int a, int b) {
		System.out.println("This is integer Type with Two parameters: " + a);
		System.out.println("This is integer Type with Two parameters: " + b);
	}

	// By changing the data type

	public void fun2(int a) {
		System.out.println("This is integer Type : " + a);
	}

	public void fun2(String str) {
		System.out.println("This is String Type with Two parameters: " + str);
	}

	public void fun4(int a) {
		System.out.println("func 4 This is integer Type : " + a);
	}

	public void fun4(Byte b) {
		b = 10;
		System.out.println("func 4 This is Byte Type : " + b);
	}
	
	public void fun4(short s) {
		System.out.println("func 4 This is short Type : " + s);
	}
	
	public void fun4(long ll) {
		System.out.println("func 4 This is long Type : " + ll);
	}
	
	// By changing the order of the argument

	public void fun3(int a, String str) {
		System.out.println("This is integer Type : " + a);
		System.out.println("This is String Type with Two parameters: " + str);
	}

	public void fun3(String str, int a) {
		System.out.println("This is String Type with Two parameters: " + str);
		System.out.println("This is integer Type : " + a);
	}

	public static void main(String[] args) {
		MethodOverloadingClass objClass = new MethodOverloadingClass();

		System.out.println("By changing number of arguments");
		objClass.fun1(10);
		objClass.fun1(10,20);
		System.out.println("<------------------------------------------------->");

		System.out.println("By changing the data type");
		objClass.fun2(10);
		objClass.fun2("Vipul");
		System.out.println("<------------------------------------------------->");
		
		System.out.println("By changing the order of the argument");
		objClass.fun3(10,"Java");
		objClass.fun3("Vipul",100);
		System.out.println("<------------------------------------------------->");
		System.out.println("Method Overloading and Type Promotion");
		objClass.fun4(10);	
		System.out.println("<------------------------------------------------->");
		System.out.println("Main Method Overloading");
		objClass.main("Main method");
	}
	
	public static void main(String args) {
		System.out.println("This is main method with String args not String[] args :"+args);
	}
	
}
