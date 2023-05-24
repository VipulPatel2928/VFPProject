package testsuperkeyword.com;

public class SuperKeywordClass extends ParentClass{

	public SuperKeywordClass() {
		super();
		super.display();
		System.out.println("This is super class variable :"+super.nameString);
	
	}
	
	public void method1() {
		//super();  //Remove the comment to see the compiler error
		super.display();
		System.out.println("This is super class variable :"+super.nameString);
	}
	public static void main(String[] args) {
		SuperKeywordClass objClass = new SuperKeywordClass();
		objClass.method1();
     
	}

}
