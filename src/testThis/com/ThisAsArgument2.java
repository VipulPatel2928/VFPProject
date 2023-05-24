package testThis.com;

public class ThisAsArgument2 {

	public String str;
	public int courseDuration;

	public void display(ThisAsArgument2 object1) {
     System.out.println("This As Argument 2 " +object1.str);
     System.out.println("This As Argument 2 " +object1.courseDuration);
	}
	
	public ThisAsArgument2(ThisAsArgument object2) {
		this.str = object2.str;
		this.courseDuration = object2.courseDuration;
		 System.out.println(str);
	     System.out.println(courseDuration);
	     this.display(this);
	     
	}

	public static void main(String[] args) {

	
	}

}
