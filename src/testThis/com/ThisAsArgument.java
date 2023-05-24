package testThis.com;

public class ThisAsArgument {

	public String str;
	public int courseDuration;

	public ThisAsArgument(String str, int courseDuration) {
		this.str = str;
		this.courseDuration = courseDuration;
		display(this);
		ThisAsArgument2 objArgument2 = new ThisAsArgument2(this);
	}

	public void display(ThisAsArgument object1) {
     System.out.println(object1.str);
     System.out.println(object1.courseDuration);
	}
	
	public ThisAsArgument(ThisAsArgument object2) {
		 System.out.println(object2.str);
	     System.out.println(object2.courseDuration);
	     
	}

	public static void main(String[] args) {

		ThisAsArgument obj = new ThisAsArgument("Java Script", 5);
	}

}
