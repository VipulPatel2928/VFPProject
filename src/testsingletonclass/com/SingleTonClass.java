package testsingletonclass.com;

public class SingleTonClass {

	 //Static Class Reference
	   int intTest;
	   String strTest;
	   private static SingleTonClass obj=null;
	   
	   private SingleTonClass(){
	      /*Private Constructor will prevent 
	       * the instantiation of this class directly*/
	   }
	   public static SingleTonClass objectCreationMethod(int intTestarg,String strTestarg){
		/*This logic will ensure that no more than
		 * one object can be created at a time */
		if(obj==null){
		    obj= new SingleTonClass();
		    obj.intTest = intTestarg;
		    obj.strTest = strTestarg;
		}
		else
			System.out.println("Object is already created");
	        return obj;
	   }
	   public void display(){
		//System.out.println("Singleton class Example");
		System.out.println("Int Value :"+intTest);
		System.out.println("String Value :"+strTest);
	   }
	   public static void main(String args[]){
		System.out.println("1. =======================>");
		//Object can be created directly within the class
		SingleTonClass obj2 = new SingleTonClass();   
		obj2.display();
	    //This way it is forced to create object via our method where
	    //we have logic for only one object creation
		System.out.println("2. =======================>");
		SingleTonClass obj= SingleTonClass.objectCreationMethod(10,"JAVA");
		obj.display();
		System.out.println("3. =======================>");
		SingleTonClass obj1= SingleTonClass.objectCreationMethod(100,"JAVA Programming");
		obj1.display();
	   }


}
