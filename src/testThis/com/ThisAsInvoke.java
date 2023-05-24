package testThis.com;

public class ThisAsInvoke {


	public String str;
	public int courseDuration;

	public ThisAsInvoke(String str, int courseDuration) {
		this(); //Construtor Invoked
		this.str = str;
		this.courseDuration = courseDuration;
		this.display(); //Invoked Method
	}

	public void display() {
     System.out.println(str);
     System.out.println(courseDuration);
	}
	
	public ThisAsInvoke() {
		 System.out.println("This is default constructor");
	}

	public static void main(String[] args) {

		ThisAsInvoke obj = new ThisAsInvoke("Java Script", 5);
		//obj.display();
		
		//ThisAsInvoke obj1 = new ThisAsInvoke("Java", 3);
		//obj1.display();
	}
}
