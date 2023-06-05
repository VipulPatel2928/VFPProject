package testcovariant.returntype;

public class SuperClass {

	String str = "Super class variable";
	   SuperClass get() {
	      System.out.println("SuperClass\n");
	      return this;
	   }
	   
	   public int display() {
		   System.out.println("Void Display");
		   return 10;
	   }
	   public void displaySuperClass() {
			System.out.println(str);
		}
}
