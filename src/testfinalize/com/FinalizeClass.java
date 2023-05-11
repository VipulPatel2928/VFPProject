package testfinalize.com;

public class FinalizeClass {

	
	  @Override 
	  protected void finalize() throws Throwable {
	  System.out.println("This is finalize Mewthod of Custom class");
	  super.finalize();
	  System.out.println("This is finalize Mewthod of Custom class"); 
	  }
	 
	
	public static void main(String[] args) {
		FinalizeClass finalizeClass = new FinalizeClass();
		
		try {
			finalizeClass.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
