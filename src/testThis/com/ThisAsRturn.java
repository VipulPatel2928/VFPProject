package testThis.com;

public class ThisAsRturn {

	public String str;
	public int courseDuration;
	
	public ThisAsRturn setMethod(String str, int courseDuration) {
		this.str = str;
		this.courseDuration = courseDuration;
	    return this;
	}

	public void display() {
     System.out.println(str);
     System.out.println(courseDuration);
	}
	
	public static void main(String[] args) {
		
		ThisAsRturn objAsRturn = new ThisAsRturn();
		
		objAsRturn.display();
		
		objAsRturn.setMethod("PQR", 1000);
		
		objAsRturn.display();
		
		ThisAsRturn objAsRturn1 = objAsRturn.setMethod("PQR", 1000);
		
		objAsRturn1.display();
		
	}

}
