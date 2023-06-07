package testthrowthrows.com;

public class PropagationClass {
	
	
	void method1() // generates an exception
	{
    int arr[] = {10,20,30};
    System.out.println("This is method 1");
    System.out.println(arr[7]);
    
 }
	
	void method11() // generates an exception
	{
    int arr[] = {10,20,30};
    System.out.println("This is method 11");
    System.out.println(arr[7]);
 }
 void method2() // doesn't catch the exception
 {
	try {
		 method1();
	} catch (Exception e) {
		System.out.println("This is Method 2 Exception");
	}
   
    method11();
 }
 // method1 drops down the call stack
 void method3() // method3 catches the exception 
 {
    try {
       method2();
    } catch(ArrayIndexOutOfBoundsException ae) {
       System.out.println("Method 3 Exception is caught");
    }
 }
 public static void main(String args[]) {
	PropagationClass obj = new PropagationClass();
    obj.method3();
 }


}
