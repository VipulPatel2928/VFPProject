package testcovariant.returntype;

public class Tester extends SuperClass {
	String str = "Tester class variable";
	   Tester get() {
		      System.out.println("SubClass\n");
		      return this;
		   }

public void displayTester() {
	System.out.println(str);
}

public int display() {
	   System.out.println("int Display");
	   return 10;
}
	public static void main(String[] args) {
		
		SuperClass testerst = new Tester();
	    testerst.get();
	    
	    //Remove the comment to see the compiler error
	    //testerst.displayTester();
		
		Tester tester = new Tester();
	    tester.get();
	    tester.displayTester();
	    
	    SuperClass supertester = new SuperClass();
	    supertester.get();
	    supertester.displaySuperClass();
	}

}
