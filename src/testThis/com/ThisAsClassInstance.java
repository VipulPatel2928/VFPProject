package testThis.com;

public class ThisAsClassInstance {

	public String str;
	public int courseDuration;

	public ThisAsClassInstance(String str, int courseDuration) {
		this.str = str;
		this.courseDuration = courseDuration;
	}

	public void display() {
     System.out.println(str);
     System.out.println(courseDuration);
	}

	public static void main(String[] args) {

		ThisAsClassInstance obj = new ThisAsClassInstance("Java Script", 5);
		obj.display();
		
		ThisAsClassInstance obj1 = new ThisAsClassInstance("Java", 3);
		obj1.display();
	}

}
