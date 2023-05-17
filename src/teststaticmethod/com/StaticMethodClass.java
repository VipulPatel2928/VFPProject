package teststaticmethod.com;

public class StaticMethodClass {

    public static int age = 50;
    public static String studentName = "Vipul";
    public static String schoolName = "Jivan bharti" ;
    
    public static void display() {
    	System.out.println("Age :"+age);
    	System.out.println("Student Name :"+studentName);
    	System.out.println("School Name :"+schoolName);
    }
	public static void main(String[] args) {
		//StaticMethodClass staticMethodClass = new StaticMethodClass();
		display();//1. This way static method can be called
		System.out.println("<----------------------------------------->");
		StaticMethodClass.display();//2. This way static method can be called
	}
}
