package testsingletonclass.com;

public class Singleton_outside_Class {
	public static void main(String[] args) {
        //Object cannot be created directly due to private constructor 
        //Remove the comment to see the compiler error
		//SingleTonClass obj2 = new SingleTonClass();   
		//obj2.display();
	    //This way it is forced to create object via our method where
	    //we have logic for only one object creation
        System.out.println("1. =======================>");
		SingleTonClass obj= SingleTonClass.objectCreationMethod(500,"JAVAScript");
		obj.display();
		System.out.println("2. =======================>");
		SingleTonClass obj1= SingleTonClass.objectCreationMethod(1000,"JS");
		obj1.display();
}

}
