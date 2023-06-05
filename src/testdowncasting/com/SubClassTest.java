package testdowncasting.com;

public class SubClassTest extends BaseTest{

	static void method(BaseTest obj) {
		if(obj instanceof SubClassTest) {
			SubClassTest subobj = (SubClassTest)obj;
			subobj.display();
		}
	}
	public void display() {
		System.out.println("This is sub class");
		}
	
	public static void main(String[] args) {
		//Remove the comment to see the compiler error
		//SubClassTest obj = new BaseTest();
		
		//Compiles successfully but ClassCastException is thrown at runtime  
		//Remove the comment to see the run error
		//SubClassTest obj = (SubClassTest) new BaseTest();
		
		BaseTest b = new SubClassTest();
	    
		method(b);
	}	


}
