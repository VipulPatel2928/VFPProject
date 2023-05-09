package testFinalvariable.com;

public class FinalVariableClass {

final static float interestrate = (float) 6.6;
	
	public static float interestrate() {
		//Remove the comment to see the compiler error
		//User get suggestion to remove the final keyword if want to assigned the value
		//interestrate = (float) 9.9;
		return interestrate;
	}
			public static void main(String[] args) {
				
				System.out.println(interestrate());
	}

}
